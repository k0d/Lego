<?php
$file = 'image.png';

list($width, $height) = getimagesize($file);
$source = imagecreatefrompng($file);
function yiq($r,$g,$b)
{
	return (($r*0.299)+($g*0.587)+($b*0.114));
}

$pos = 0;
for ($y=0;$y<$height;$y++)
{
	for ($x=0;$x<$width;$x++)
	{
		$rgb = imagecolorat($source,$x,$y);
		$r = ($rgb >> 16) & 0xFF;
		$g = ($rgb >> 8) & 0xFF;
		$b = $rgb & 0xFF;
		$gs = yiq($r,$g,$b);
		echo ($gs > 128 ? 0 : 1);
		$pos ++;
		if ($pos == 8) {
			echo ' ';
			$pos = 0;
		}
	}
	echo "\n";
}

echo "\n";

$line=0;
$pos=0;
$cur='';
for ($y=0;$y<$height;$y = $y + 8)
{
	for ($x=0;$x<$width;$x++)
	{
		for ($z=0;$z<8;$z++)
		{
			$rgb = imagecolorat($source,$x,$y+(7-$z));
			$r = ($rgb >> 16) & 0xFF;
			$g = ($rgb >> 8) & 0xFF;
			$b = $rgb & 0xFF;
			$gs = yiq($r,$g,$b);
			$cur = $cur . ($gs > 127 ? '0' : '1');
			$pos ++;
			if ($pos == 8) {
				echo '(byte) 0x'.(bindec($cur) < 16 ? '0' : '').dechex(bindec($cur)).', ';
				$pos = 0;
				$cur = '';
				$line ++;
				if ($line == 5) {
					$line = 0;
					echo "\n";
				}
			}
		}
	}
}
echo "\n";
