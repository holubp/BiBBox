<div class="rdcard" id="main-content" role="main">
	#if ($browserSniffer.isIe($request) && $browserSniffer.getMajorVersion($request) < 8)
		<table class="portlet-layout">
		<tr>
			<td class="aui-w20 portlet-column portlet-column-first rd-connect-column-1" id="column-1" rowspan="2">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
			</td>
		</tr>
		<tr>
			<td class="aui-w80 portlet-column portlet-column-last rd-connect-column-2" id="column-2">
				$processor.processColumn("column-2", "portlet-column-content portlet-column-content-last")
			</td>
			<td class="aui-w80 portlet-column portlet-column-last rd-connect-column-3" id="column-3">
				$processor.processColumn("column-3", "portlet-column-content portlet-column-content-last")
			</td>
		</tr>
		</table>

		<table class="portlet-layout">
		<tr>
			<td class="aui-w40 portlet-column portlet-column-first rd-connect-column-4" id="column-4">
				$processor.processColumn("column-4", "portlet-column-content portlet-column-content-first")
			</td>
			<td class="aui-w60 portlet-column portlet-column-last rd-connect-column-5" id="column-5">
				$processor.processColumn("column-5", "portlet-column-content portlet-column-content-last")
			</td>
		</tr>
		</table>
	#else
		<div class="portlet-layout" id="rd-layout-heading">
			<div class="aui-w20 portlet-column portlet-column-first rd-connect-column-1" id="column-1">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
			</div>

			<div id="column-2-3">
				<div class="aui-w80 portlet-column portlet-column-last rd-connect-column-2" id="column-2">
					$processor.processColumn("column-2", "portlet-column-content portlet-column-content-last")
				</div>
				
				<div class="aui-w80 portlet-column portlet-column-last rd-connect-column-3" id="column-3">
					$processor.processColumn("column-3", "portlet-column-content portlet-column-content-last")
				</div>
			</div>
		</div>

		<div class="portlet-layout">
			<div class="aui-w40 portlet-column portlet-column-first rd-connect-column-4" id="column-4">
				$processor.processColumn("column-4", "portlet-column-content portlet-column-content-first")
			</div>

			<div class="aui-w60 portlet-column portlet-column-last rd-connect-column-5" id="column-5">
				$processor.processColumn("column-5", "portlet-column-content portlet-column-content-last")
			</div>
		</div>
	#end
</div>