<?php
	function mouth_size($animal) {
		if (strcmp(strtolower($animal), "alligator") === 0)
			return "small";
		else
			return "wide";
	}
?>