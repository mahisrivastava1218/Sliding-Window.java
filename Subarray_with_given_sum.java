
<!-- saved from url=(0086)https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style id="ace-dracula">.ace-dracula .ace_gutter {background: #282a36;color: rgb(144,145,148)}.ace-dracula .ace_print-margin {width: 1px;background: #44475a}.ace-dracula {background-color: #282a36;color: #f8f8f2}.ace-dracula .ace_cursor {color: #f8f8f0}.ace-dracula .ace_marker-layer .ace_selection {background: #44475a}.ace-dracula.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px #282a36;border-radius: 2px}.ace-dracula .ace_marker-layer .ace_step {background: rgb(198, 219, 174)}.ace-dracula .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid #a29709}.ace-dracula .ace_marker-layer .ace_active-line {background: #44475a}.ace-dracula .ace_gutter-active-line {background-color: #44475a}.ace-dracula .ace_marker-layer .ace_selected-word {box-shadow: 0px 0px 0px 1px #a29709;border-radius: 3px;}.ace-dracula .ace_fold {background-color: #50fa7b;border-color: #f8f8f2}.ace-dracula .ace_keyword {color: #ff79c6}.ace-dracula .ace_constant.ace_language {color: #bd93f9}.ace-dracula .ace_constant.ace_numeric {color: #bd93f9}.ace-dracula .ace_constant.ace_character {color: #bd93f9}.ace-dracula .ace_constant.ace_character.ace_escape {color: #ff79c6}.ace-dracula .ace_constant.ace_other {color: #bd93f9}.ace-dracula .ace_support.ace_function {color: #8be9fd}.ace-dracula .ace_support.ace_constant {color: #6be5fd}.ace-dracula .ace_support.ace_class {font-style: italic;color: #66d9ef}.ace-dracula .ace_support.ace_type {font-style: italic;color: #66d9ef}.ace-dracula .ace_storage {color: #ff79c6}.ace-dracula .ace_storage.ace_type {font-style: italic;color: #8be9fd}.ace-dracula .ace_invalid {color: #F8F8F0;background-color: #ff79c6}.ace-dracula .ace_invalid.ace_deprecated {color: #F8F8F0;background-color: #bd93f9}.ace-dracula .ace_string {color: #f1fa8c}.ace-dracula .ace_comment {color: #6272a4}.ace-dracula .ace_variable {color: #50fa7b}.ace-dracula .ace_variable.ace_parameter {font-style: italic;color: #ffb86c}.ace-dracula .ace_entity.ace_other.ace_attribute-name {color: #50fa7b}.ace-dracula .ace_entity.ace_name.ace_function {color: #50fa7b}.ace-dracula .ace_entity.ace_name.ace_tag {color: #ff79c6}.ace-dracula .ace_invisible {color: #626680;}.ace-dracula .ace_indent-guide {background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAEklEQVQImWNgYGBgYHB3d/8PAAOIAdULw8qMAAAAAElFTkSuQmCC) right repeat-y}
/*# sourceURL=ace/css/ace-dracula */</style><style id="autocompletion.css">.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #CAD6FA;    z-index: 1;}.ace_dark.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #3a674e;}.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid #abbffe;    margin-top: -1px;    background: rgba(233,233,253,0.4);    position: absolute;    z-index: 2;}.ace_dark.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid rgba(109, 150, 13, 0.8);    background: rgba(58, 103, 78, 0.62);}.ace_completion-meta {    opacity: 0.5;    margin: 0.9em;}.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #2d69c7;}.ace_dark.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #93ca12;}.ace_editor.ace_autocomplete {    width: 300px;    z-index: 200000;    border: 1px lightgray solid;    position: fixed;    box-shadow: 2px 3px 5px rgba(0,0,0,.2);    line-height: 1.4;    background: #fefefe;    color: #111;}.ace_dark.ace_editor.ace_autocomplete {    border: 1px #484747 solid;    box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.51);    line-height: 1.4;    background: #25282c;    color: #c1c1c1;}
/*# sourceURL=ace/css/autocompletion.css */</style><style>.ace_snippet-marker {    -moz-box-sizing: border-box;    box-sizing: border-box;    background: rgba(194, 193, 208, 0.09);    border: 1px dotted rgba(211, 208, 235, 0.62);    position: absolute;}</style><style>    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style id="ace-tm">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style id="ace_editor.css">.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;box-sizing: border-box;min-width: 100%;contain: style size layout;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;contain: style size layout;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {position: absolute;top: 0;left: 0;right: 0;padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {contain: strict;position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;contain: strict;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: transparent;color: inherit;z-index: 1000;opacity: 1;}.ace_composition_placeholder { color: transparent }.ace_composition_marker { border-bottom: 1px solid;position: absolute;border-radius: 0;margin-top: 1px;}[ace_nocontext=true] {transform: none!important;filter: none!important;perspective: none!important;clip-path: none!important;mask : none!important;contain: none!important;perspective: none!important;mix-blend-mode: initial!important;z-index: auto;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;height: 1000000px;contain: style size layout;}.ace_text-layer {font: inherit !important;position: absolute;height: 1000000px;width: 1000000px;contain: style size layout;}.ace_text-layer > .ace_line, .ace_text-layer > .ace_line_group {contain: style size layout;position: absolute;top: 0;left: 0;right: 0;}.ace_hidpi .ace_text-layer,.ace_hidpi .ace_gutter-layer,.ace_hidpi .ace_content,.ace_hidpi .ace_gutter {contain: strict;will-change: transform;}.ace_hidpi .ace_text-layer > .ace_line, .ace_hidpi .ace_text-layer > .ace_line_group {contain: strict;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {transition: opacity 0.18s;}.ace_animate-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: step-end;animation-name: blink-ace-animate;animation-iteration-count: infinite;}.ace_animate-blinking.ace_smooth-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: ease-in-out;animation-name: blink-ace-animate-smooth;}@keyframes blink-ace-animate {from, to { opacity: 1; }60% { opacity: 0; }}@keyframes blink-ace-animate-smooth {from, to { opacity: 1; }45% { opacity: 1; }60% { opacity: 0; }85% { opacity: 0; }}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;box-sizing: border-box;}.ace_line .ace_fold {box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_inline_button {border: 1px solid lightgray;display: inline-block;margin: -1px 8px;padding: 0 5px;pointer-events: auto;cursor: pointer;}.ace_inline_button:hover {border-color: gray;background: rgba(200,200,200,0.2);display: inline-block;pointer-events: auto;}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}
/*# sourceURL=ace/css/ace_editor.css */</style><style class="vjs-styles-defaults">
      .video-js {
        width: 300px;
        height: 150px;
      }

      .vjs-fluid {
        padding-top: 56.25%
      }
    </style><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/analytics.js.download"></script><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/js"></script><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/f.txt"></script><script src="./Subarray_with_given_sum_files/sdk.js.download" async="" crossorigin="anonymous"></script><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/f(1).txt"></script><script src="./Subarray_with_given_sum_files/2320390688070878" async=""></script><script id="facebook-jssdk" src="./Subarray_with_given_sum_files/sdk.js(1).download"></script><script async="" src="./Subarray_with_given_sum_files/qevents.js.download"></script><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/f(1).txt"></script><script async="" src="./Subarray_with_given_sum_files/fbevents.js.download"></script><script async="" src="./Subarray_with_given_sum_files/analytics.js.download"></script><script>
var contestId = null;
var contestUrlPrefix = "https://practiceapi.geeksforgeeks.org/api/v1/contest/day-5-sliding-window-dsa-bootcamp";
var contestCDNUrlPrefix = "https://practiceapi.geeksforgeeks.org/api/vr/contest/day-5-sliding-window-dsa-bootcamp";
var pageTitle = " | Practice | GeeksforGeeks";
var contestTiming = 0;
</script>






    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Day 5 | Sliding Window | DSA Bootcamp | Practice | GeeksforGeeks</title>
    <link rel="icon" href="https://media.geeksforgeeks.org/img-practice/favicon-1600291663.png" type="image/x-icon">
    
    
    <meta name="keywords" content="programming,coding,online, code online, online judge, practice, run code, test, expected outcome, programming competition, programming contest, online programming, online computer programming">
    <meta name="description" content="day-5-sliding-window-dsa-bootcamp ">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta property="og:image" content="https://media.geeksforgeeks.org/img-practice/gfg_200X200.png">
    <meta property="og:image:alt" content="GeeksforGeeks">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="200">
    <meta property="og:image:height" content="200">
    
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/bootstrap.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/style-2.8.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/animate.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link href="./Subarray_with_given_sum_files/css" rel="stylesheet" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link href="./Subarray_with_given_sum_files/font-awesome.min.css" rel="stylesheet" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/bootstrap-select.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/jquery.datetimepicker.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/cookieconsent.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link href="./Subarray_with_given_sum_files/common.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/atk5goj.css">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/header-footer.css">
    <script src="./Subarray_with_given_sum_files/runPrettify.js.download"></script><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/prettify.css">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/pretify.css" type="text/css">
    <link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/blockTester.css">
    <script>
    MathJax = {
            tex: {
                inlineMath: [['$', '$'], ['`', '`']]        // to use '`' sign as the delimiter for latex blocks
            },
            options: {
                skipHtmlTags: ["script","noscript","style","textarea","code"]      // only skip following tags, without this mathjax will skip latex inside the 'pre' tags.
            }
        };
    </script>
    <script type="text/javascript" id="MathJax-script" async="" src="./Subarray_with_given_sum_files/tex-mml-chtml.js.download"></script>


        <!--
    <script async='async' src='https://www.googletagservices.com/tag/js/gpt.js'></script>
    <script>
      var googletag = googletag || {};
      googletag.cmd = googletag.cmd || [];
    </script>
    <script type='text/javascript'>
    var gptAdSlots = [];
        googletag.cmd.push(function() {
    var verticalLT270Sizes = googletag.sizeMapping().addSize([1500, 768], [[250, 250], [240, 400], [160, 600], [180, 150], [120, 600], [200, 200],[234, 60]])
                            .addSize([1025, 300], [[88,31], [120,20], [120,30], [120,240], [120,600], [160,600]])
                            .addSize([0, 0],[[88,31], [120,20], [120,30], [120,240],[120, 600]]).build();

    var verticalLT337Sizes = googletag.sizeMapping()
                            .addSize([1200, 768], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]])
                            .addSize([728, 300], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250]])
                            .addSize([0, 0], [160,600]).build();

    gptAdSlots[0] = googletag.defineSlot('/27823234/Practice/Vertical_W<270', [[250, 250], [240, 400], [160, 600], [180, 150], [120, 600], [200, 200],[234, 60]], 'div-gpt-ad-1523612657686-0').defineSizeMapping(verticalLT270Sizes).addService(googletag.pubads());
    gptAdSlots[1] = googletag.defineSlot('/27823234/Practice/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1523612657686-1').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
    gptAdSlots[2] = googletag.defineSlot('/27823234/Practice/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1523612657686-2').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
    googletag.pubads().enableSingleRequest();
    googletag.pubads().collapseEmptyDivs();
    googletag.enableServices();
    });
    </script>
    -->
    
        <script src="./Subarray_with_given_sum_files/jquery.min.js.download"></script>
    <script src="./Subarray_with_given_sum_files/bootstrap.min.js.download"></script>
    <script async="" src="./Subarray_with_given_sum_files/jquery.datetimepicker.full.min.js.download">
    </script>
    <script async="" src="./Subarray_with_given_sum_files/bootstrap-select.min.js.download"></script>
    <script async="" src="./Subarray_with_given_sum_files/cookieconsent.min.js.download"></script>
    <script>
        var practice_api_url = 'https://practiceapi.geeksforgeeks.org/api/v1/';
        var practice_api_cdn_url = 'https://practiceapi.geeksforgeeks.org/api/vr/';
        var fetchUserDetails = false;
    </script>
    <script async="" src="./Subarray_with_given_sum_files/header-footer.js.download"></script>
    <link href="./Subarray_with_given_sum_files/jquery.toast.min.css" rel="stylesheet" type="text/css">
    <script src="./Subarray_with_given_sum_files/jquery.toast.js.download"></script>

    <link rel="stylesheet" href="./Subarray_with_given_sum_files/bootstrap-tagsinput.min.css"> 
    <script src="./Subarray_with_given_sum_files/bootstrap-tagsinput.js.download"></script>
    <script src="./Subarray_with_given_sum_files/bootstrap3-typeahead.js.download"></script>
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/jquery-ui.min.css">
    <script src="./Subarray_with_given_sum_files/jquery-ui.min.js.download"></script>

    <script>
    window.urlCdn = "https://practice.geeksforgeeks.org";
    const videoFeedbackCodes = {"NO_VOTE":0,"LIKE":1,"DISLIKE":2,"ADD_FEEDBACK":3};
    </script>
    <script src="./Subarray_with_given_sum_files/video.js.download"></script>
    <link href="./Subarray_with_given_sum_files/video-js.css" rel="stylesheet">
    <script src="./Subarray_with_given_sum_files/videojs-playbackrate-adjuster.min.js.download"></script>
    <script src="./Subarray_with_given_sum_files/videojs-flash.min.js.download"></script>
    <script src="./Subarray_with_given_sum_files/videojs-contrib-quality-levels.js.download"></script>
    <script src="./Subarray_with_given_sum_files/videojs-hls-quality-selector.min.js.download"></script>
    <script src="./Subarray_with_given_sum_files/videojs.hotkeys.min.js.download"></script>
    <script src="./Subarray_with_given_sum_files/videoPlayer.js.download"></script>

    <meta property="og:title" content="day-5-sliding-window-dsa-bootcamp | Practice | GeeksforGeeks">
        <script>
        (function(i, s, o, g, r, a, m) {
            i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function() {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
            a = s.createElement(o),
                m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

        ga('create', 'UA-71763465-1', 'auto');
        ga('require', 'displayfeatures');
        ga('send', 'pageview');
    </script>

    
    <script>
        function openGuestLoginModal() {
            if (jQuery('.header--sidebar').find('.header--nav__item').find('.login-modal-btn').length) {
                function openModalforGuests() {
                    setTimeout(function() {
                        jQuery('.header--sidebar').find('.header--nav__item').find('.login-modal-btn').trigger(
                            'click');
                    }, 5000)
                }

                function setCookie() {
                    var guest = document.cookie.indexOf('guest=');
                    if (guest == -1) {
                        date = new Date();
                        date.setTime(date.getTime() + (2 * 24 * 60 * 60 * 1000));
                        expires = "; expires=" + date.toGMTString();
                        document.cookie = "guest=yes" + expires + "; path=/";
                        openModalforGuests()
                    }
                }
                var callGuestModal = !1;
                if (localStorage.getItem('guestPageCount')) {
                    localStorage.setItem('guestPageCount', parseInt(localStorage.getItem('guestPageCount')) + 1);
                    if (parseInt(localStorage.getItem('guestPageCount')) > 2) {
                        callGuestModal = !0;
                        localStorage.removeItem('guestPageCount')
                    }
                } else if (!localStorage.getItem('guestPageCount') && document.cookie.indexOf('guest=') == -1) {
                    localStorage.setItem('guestPageCount', 1)
                }
                if (callGuestModal) {
                    setCookie()
                }
                if (!callGuestModal) {
                    setTimeout(function() {
                        setCookie()
                    }, 20000)
                }
            }
        }

        $(document).ready(function() {
            openGuestLoginModal();
            try{
                $('[data-toggle="popover"]').popover();
            } catch(error) {
                console.log(error)
            }

            $('body').on('click', 'a > #popover--button', function(e) {
                e.preventDefault();
                return true;
            });

            var queries = document.querySelectorAll('.mediaquerydependent'),
                all = queries.length,
                cur = null,
                attr = null;
            while (all--) {
                cur = queries[all];
                if (cur.dataset.media &&
                    window.matchMedia(cur.dataset.media).matches) {
                    for (attr in cur.dataset) {
                        if (attr !== 'media') {
                            cur.setAttribute(attr, cur.dataset[attr]);
                        }
                    }
                }
            }

            window.addEventListener("load", function() {
                window.cookieconsent.initialise({
                    "palette": {
                        "popup": {
                            "background": "#3c404d",
                            "text": "#d6d6d6",
                            "font-size": "12px"
                        },
                        "button": {
                            "background": "#8bed4f"
                        }
                    },
                    "theme": "classic",
                    onStatusChange: function(status) {

                    },
                    "content": {
                        "message": "We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href=\"https://www.geeksforgeeks.org/cookie-policy/\" class=\"cc-link\" target=\"_blank\">Cookie Policy</a> & ",
                        "link": "Privacy Policy",
                        "href": "https://www.geeksforgeeks.org/privacy-policy/"
                    },
                    cookie: {
                        name: "geeksforgeeks_consent_status",
                    }
                })
            });
        });
    </script>

    <!-- Facebook Pixel Code -->
    <script>
        ! function(f, b, e, v, n, t, s) {
            if (f.fbq) return;
            n = f.fbq = function() {
                n.callMethod ?
                    n.callMethod.apply(n, arguments) : n.queue.push(arguments)
            };
            if (!f._fbq) f._fbq = n;
            n.push = n;
            n.loaded = !0;
            n.version = '2.0';
            n.queue = [];
            t = b.createElement(e);
            t.async = !0;
            t.src = v;
            s = b.getElementsByTagName(e)[0];
            s.parentNode.insertBefore(t, s)
        }(window, document, 'script',
            'https://connect.facebook.net/en_US/fbevents.js');
        fbq('init', '2320390688070878');
        fbq('track', 'PageView');
    </script>
    <noscript><img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=2320390688070878&ev=PageView&noscript=1" /></noscript>
    <!-- End Facebook Pixel Code -->

    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async="" src="./Subarray_with_given_sum_files/js(1)"></script>
    <script>
        window.dataLayer = window.dataLayer || [];

        function gtag() {
            dataLayer.push(arguments);
        }
        gtag('js', new Date());
        gtag('config', 'UA-71763465-1', {
            'optimize_id': 'GTM-WDSZVB6'
        });
        function gtagHelperFunction (action,eventCategory) {
            gtag("event", action, {
                event_category: eventCategory,
                event_label: window.location.href,
            })
        }
    </script>

    <script>
        (function() {
            var cx = '005855190823060106138:ggjtcjog1xu';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
                '//cse.google.com/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
        })();
    </script>
<style>.cke{visibility:hidden;}</style><meta http-equiv="origin-trial" content="A7bG5hJ4XpMV5a3V1wwAR0PalkFSxLOZeL9D/YBYdupYUIgUgGhfVJ1zBFOqGybb7gRhswfJ+AmO7S2rNK2IOwkAAAB7eyJvcmlnaW4iOiJodHRwczovL3d3dy5nb29nbGV0YWdtYW5hZ2VyLmNvbTo0NDMiLCJmZWF0dXJlIjoiUHJpdmFjeVNhbmRib3hBZHNBUElzIiwiZXhwaXJ5IjoxNjY5NzY2Mzk5LCJpc1RoaXJkUGFydHkiOnRydWV9"><script type="text/javascript" src="./Subarray_with_given_sum_files/config.js.download"></script><script type="text/javascript" async="" src="./Subarray_with_given_sum_files/f(2).txt"></script><style type="text/css">.CtxtMenu_InfoClose {  top:.2em; right:.2em;}
.CtxtMenu_InfoContent {  overflow:auto; text-align:left; font-size:80%;  padding:.4em .6em; border:1px inset; margin:1em 0px;  max-height:20em; max-width:30em; background-color:#EEEEEE;  white-space:normal;}
.CtxtMenu_Info.CtxtMenu_MousePost {outline:none;}
.CtxtMenu_Info {  position:fixed; left:50%; width:auto; text-align:center;  border:3px outset; padding:1em 2em; background-color:#DDDDDD;  color:black;  cursor:default; font-family:message-box; font-size:120%;  font-style:normal; text-indent:0; text-transform:none;  line-height:normal; letter-spacing:normal; word-spacing:normal;  word-wrap:normal; white-space:nowrap; float:none; z-index:201;  border-radius: 15px;                     /* Opera 10.5 and IE9 */  -webkit-border-radius:15px;               /* Safari and Chrome */  -moz-border-radius:15px;                  /* Firefox */  -khtml-border-radius:15px;                /* Konqueror */  box-shadow:0px 10px 20px #808080;         /* Opera 10.5 and IE9 */  -webkit-box-shadow:0px 10px 20px #808080; /* Safari 3 & Chrome */  -moz-box-shadow:0px 10px 20px #808080;    /* Forefox 3.5 */  -khtml-box-shadow:0px 10px 20px #808080;  /* Konqueror */  filter:progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color="gray", Positive="true"); /* IE */}
</style><style type="text/css">.CtxtMenu_MenuClose {  position:absolute;  cursor:pointer;  display:inline-block;  border:2px solid #AAA;  border-radius:18px;  -webkit-border-radius: 18px;             /* Safari and Chrome */  -moz-border-radius: 18px;                /* Firefox */  -khtml-border-radius: 18px;              /* Konqueror */  font-family: "Courier New", Courier;  font-size:24px;  color:#F0F0F0}
.CtxtMenu_MenuClose span {  display:block; background-color:#AAA; border:1.5px solid;  border-radius:18px;  -webkit-border-radius: 18px;             /* Safari and Chrome */  -moz-border-radius: 18px;                /* Firefox */  -khtml-border-radius: 18px;              /* Konqueror */  line-height:0;  padding:8px 0 6px     /* may need to be browser-specific */}
.CtxtMenu_MenuClose:hover {  color:white!important;  border:2px solid #CCC!important}
.CtxtMenu_MenuClose:hover span {  background-color:#CCC!important}
.CtxtMenu_MenuClose:hover:focus {  outline:none}
</style><style type="text/css">.CtxtMenu_Menu {  position:absolute;  background-color:white;  color:black;  width:auto; padding:5px 0px;  border:1px solid #CCCCCC; margin:0; cursor:default;  font: menu; text-align:left; text-indent:0; text-transform:none;  line-height:normal; letter-spacing:normal; word-spacing:normal;  word-wrap:normal; white-space:nowrap; float:none; z-index:201;  border-radius: 5px;                     /* Opera 10.5 and IE9 */  -webkit-border-radius: 5px;             /* Safari and Chrome */  -moz-border-radius: 5px;                /* Firefox */  -khtml-border-radius: 5px;              /* Konqueror */  box-shadow:0px 10px 20px #808080;         /* Opera 10.5 and IE9 */  -webkit-box-shadow:0px 10px 20px #808080; /* Safari 3 & Chrome */  -moz-box-shadow:0px 10px 20px #808080;    /* Forefox 3.5 */  -khtml-box-shadow:0px 10px 20px #808080;  /* Konqueror */}
.CtxtMenu_MenuItem {  padding: 1px 2em;  background:transparent;}
.CtxtMenu_MenuArrow {  position:absolute; right:.5em; padding-top:.25em; color:#666666;  font-family: null; font-size: .75em}
.CtxtMenu_MenuActive .CtxtMenu_MenuArrow {color:white}
.CtxtMenu_MenuArrow.CtxtMenu_RTL {left:.5em; right:auto}
.CtxtMenu_MenuCheck {  position:absolute; left:.7em;  font-family: null}
.CtxtMenu_MenuCheck.CtxtMenu_RTL { right:.7em; left:auto }
.CtxtMenu_MenuRadioCheck {  position:absolute; left: .7em;}
.CtxtMenu_MenuRadioCheck.CtxtMenu_RTL {  right: .7em; left:auto}
.CtxtMenu_MenuInputBox {  padding-left: 1em; right:.5em; color:#666666;  font-family: null;}
.CtxtMenu_MenuInputBox.CtxtMenu_RTL {  left: .1em;}
.CtxtMenu_MenuComboBox {  left:.1em; padding-bottom:.5em;}
.CtxtMenu_MenuSlider {  left: .1em;}
.CtxtMenu_SliderValue {  position:absolute; right:.1em; padding-top:.25em; color:#333333;  font-size: .75em}
.CtxtMenu_SliderBar {  outline: none; background: #d3d3d3}
.CtxtMenu_MenuLabel {  padding: 1px 2em 3px 1.33em;  font-style:italic}
.CtxtMenu_MenuRule {  border-top: 1px solid #DDDDDD;  margin: 4px 3px;}
.CtxtMenu_MenuDisabled {  color:GrayText}
.CtxtMenu_MenuActive {  background-color: #606872;  color: white;}
.CtxtMenu_MenuDisabled:focus {  background-color: #E8E8E8}
.CtxtMenu_MenuLabel:focus {  background-color: #E8E8E8}
.CtxtMenu_ContextMenu:focus {  outline:none}
.CtxtMenu_ContextMenu .CtxtMenu_MenuItem:focus {  outline:none}
.CtxtMenu_SelectionMenu {  position:relative; float:left;  border-bottom: none; -webkit-box-shadow:none; -webkit-border-radius:0px; }
.CtxtMenu_SelectionItem {  padding-right: 1em;}
.CtxtMenu_Selection {  right: 40%; width:50%; }
.CtxtMenu_SelectionBox {  padding: 0em; max-height:20em; max-width: none;  background-color:#FFFFFF;}
.CtxtMenu_SelectionDivider {  clear: both; border-top: 2px solid #000000;}
.CtxtMenu_Menu .CtxtMenu_MenuClose {  top:-10px; left:-10px}
</style><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/editor.css"><script type="text/javascript" src="./Subarray_with_given_sum_files/en.js.download"></script><script src="./Subarray_with_given_sum_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./Subarray_with_given_sum_files/default+en.css"><link type="text/css" rel="stylesheet" href="./Subarray_with_given_sum_files/default.css"><script src="./Subarray_with_given_sum_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./Subarray_with_given_sum_files/default+en.css"><link type="text/css" rel="stylesheet" href="./Subarray_with_given_sum_files/default.css"><style type="text/css">.gsc-control-cse{font-family:arial, sans-serif}.gsc-control-cse .gsc-table-result{font-family:arial, sans-serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(233,233,233,1),rgba(233,233,233,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#4CB96B}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#4CB96B;background-color:#4CB96B;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#4CB96B;border-color:#4CB96B;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#4CB96B;border-color:#4CB96B;background-color:#E9E9E9}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#0000CC}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#0000CC}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#0000CC}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#0000CC}.gsc-cursor-page{color:#0000CC}a.gsc-trailing-more-results:link{color:#0000CC}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#000000}.gs-webResult div.gs-visibleUrl{color:#008000}.gs-webResult div.gs-visibleUrl-short{color:#008000}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#4CB96B;background-color:#E9E9E9;color:#4CB96B}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#4CB96B;background-color:#FFFFFF;color:#4CB96B}.gsc-webResult.gsc-result.gsc-promotion{border-color:#336699;background-color:#FFFFFF}.gsc-completion-title{color:#0000CC}.gsc-completion-snippet{color:#000000}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#000000}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#008000}.gcsc-find-more-on-google{color:#0000CC}.gcsc-find-more-on-google-magnifier{fill:#0000CC}</style><style type="text/css">.gsc-control-cse{font-family:arial, sans-serif}.gsc-control-cse .gsc-table-result{font-family:arial, sans-serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(233,233,233,1),rgba(233,233,233,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#4CB96B}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#4CB96B;background-color:#4CB96B;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#4CB96B;border-color:#4CB96B;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#4CB96B;border-color:#4CB96B;background-color:#E9E9E9}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#0000CC}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#0000CC}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#0000CC}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#0000CC}.gsc-cursor-page{color:#0000CC}a.gsc-trailing-more-results:link{color:#0000CC}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#000000}.gs-webResult div.gs-visibleUrl{color:#008000}.gs-webResult div.gs-visibleUrl-short{color:#008000}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#4CB96B;background-color:#E9E9E9;color:#4CB96B}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#4CB96B;background-color:#FFFFFF;color:#4CB96B}.gsc-webResult.gsc-result.gsc-promotion{border-color:#336699;background-color:#FFFFFF}.gsc-completion-title{color:#0000CC}.gsc-completion-snippet{color:#000000}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#000000}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#008000}.gcsc-find-more-on-google{color:#0000CC}.gcsc-find-more-on-google-magnifier{fill:#0000CC}</style><script type="text/javascript" src="./Subarray_with_given_sum_files/styles.js.download"></script><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/scayt.css"><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/dialog.css"><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/tableselection.css"><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/wsc.css"><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/copyformatting.css"><link rel="stylesheet" type="text/css" href="./Subarray_with_given_sum_files/prettify.css"><style id="MJX-CHTML-styles">
mjx-container[jax="CHTML"] {
  line-height: 0;
}

mjx-container [space="1"] {
  margin-left: .111em;
}

mjx-container [space="2"] {
  margin-left: .167em;
}

mjx-container [space="3"] {
  margin-left: .222em;
}

mjx-container [space="4"] {
  margin-left: .278em;
}

mjx-container [space="5"] {
  margin-left: .333em;
}

mjx-container [rspace="1"] {
  margin-right: .111em;
}

mjx-container [rspace="2"] {
  margin-right: .167em;
}

mjx-container [rspace="3"] {
  margin-right: .222em;
}

mjx-container [rspace="4"] {
  margin-right: .278em;
}

mjx-container [rspace="5"] {
  margin-right: .333em;
}

mjx-container [size="s"] {
  font-size: 70.7%;
}

mjx-container [size="ss"] {
  font-size: 50%;
}

mjx-container [size="Tn"] {
  font-size: 60%;
}

mjx-container [size="sm"] {
  font-size: 85%;
}

mjx-container [size="lg"] {
  font-size: 120%;
}

mjx-container [size="Lg"] {
  font-size: 144%;
}

mjx-container [size="LG"] {
  font-size: 173%;
}

mjx-container [size="hg"] {
  font-size: 207%;
}

mjx-container [size="HG"] {
  font-size: 249%;
}

mjx-container [width="full"] {
  width: 100%;
}

mjx-box {
  display: inline-block;
}

mjx-block {
  display: block;
}

mjx-itable {
  display: inline-table;
}

mjx-row {
  display: table-row;
}

mjx-row > * {
  display: table-cell;
}

mjx-mtext {
  display: inline-block;
}

mjx-mstyle {
  display: inline-block;
}

mjx-merror {
  display: inline-block;
  color: red;
  background-color: yellow;
}

mjx-mphantom {
  visibility: hidden;
}

_::-webkit-full-page-media, _:future, :root mjx-container {
  will-change: opacity;
}

mjx-assistive-mml {
  position: absolute !important;
  top: 0px;
  left: 0px;
  clip: rect(1px, 1px, 1px, 1px);
  padding: 1px 0px 0px 0px !important;
  border: 0px !important;
  display: block !important;
  width: auto !important;
  overflow: hidden !important;
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  -khtml-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

mjx-assistive-mml[display="block"] {
  width: 100% !important;
}

mjx-c::before {
  display: block;
  width: 0;
}

.MJX-TEX {
  font-family: MJXZERO, MJXTEX;
}

.TEX-B {
  font-family: MJXZERO, MJXTEX-B;
}

.TEX-I {
  font-family: MJXZERO, MJXTEX-I;
}

.TEX-MI {
  font-family: MJXZERO, MJXTEX-MI;
}

.TEX-BI {
  font-family: MJXZERO, MJXTEX-BI;
}

.TEX-S1 {
  font-family: MJXZERO, MJXTEX-S1;
}

.TEX-S2 {
  font-family: MJXZERO, MJXTEX-S2;
}

.TEX-S3 {
  font-family: MJXZERO, MJXTEX-S3;
}

.TEX-S4 {
  font-family: MJXZERO, MJXTEX-S4;
}

.TEX-A {
  font-family: MJXZERO, MJXTEX-A;
}

.TEX-C {
  font-family: MJXZERO, MJXTEX-C;
}

.TEX-CB {
  font-family: MJXZERO, MJXTEX-CB;
}

.TEX-FR {
  font-family: MJXZERO, MJXTEX-FR;
}

.TEX-FRB {
  font-family: MJXZERO, MJXTEX-FRB;
}

.TEX-SS {
  font-family: MJXZERO, MJXTEX-SS;
}

.TEX-SSB {
  font-family: MJXZERO, MJXTEX-SSB;
}

.TEX-SSI {
  font-family: MJXZERO, MJXTEX-SSI;
}

.TEX-SC {
  font-family: MJXZERO, MJXTEX-SC;
}

.TEX-T {
  font-family: MJXZERO, MJXTEX-T;
}

.TEX-V {
  font-family: MJXZERO, MJXTEX-V;
}

.TEX-VB {
  font-family: MJXZERO, MJXTEX-VB;
}

mjx-stretchy-v mjx-c, mjx-stretchy-h mjx-c {
  font-family: MJXZERO, MJXTEX-S1, MJXTEX-S4, MJXTEX, MJXTEX-A ! important;
}

@font-face /* 0 */ {
  font-family: MJXZERO;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Zero.woff") format("woff");
}

@font-face /* 1 */ {
  font-family: MJXTEX;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Main-Regular.woff") format("woff");
}

@font-face /* 2 */ {
  font-family: MJXTEX-B;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Main-Bold.woff") format("woff");
}

@font-face /* 3 */ {
  font-family: MJXTEX-I;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Math-Italic.woff") format("woff");
}

@font-face /* 4 */ {
  font-family: MJXTEX-MI;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Main-Italic.woff") format("woff");
}

@font-face /* 5 */ {
  font-family: MJXTEX-BI;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Math-BoldItalic.woff") format("woff");
}

@font-face /* 6 */ {
  font-family: MJXTEX-S1;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Size1-Regular.woff") format("woff");
}

@font-face /* 7 */ {
  font-family: MJXTEX-S2;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Size2-Regular.woff") format("woff");
}

@font-face /* 8 */ {
  font-family: MJXTEX-S3;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Size3-Regular.woff") format("woff");
}

@font-face /* 9 */ {
  font-family: MJXTEX-S4;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Size4-Regular.woff") format("woff");
}

@font-face /* 10 */ {
  font-family: MJXTEX-A;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_AMS-Regular.woff") format("woff");
}

@font-face /* 11 */ {
  font-family: MJXTEX-C;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Calligraphic-Regular.woff") format("woff");
}

@font-face /* 12 */ {
  font-family: MJXTEX-CB;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Calligraphic-Bold.woff") format("woff");
}

@font-face /* 13 */ {
  font-family: MJXTEX-FR;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Fraktur-Regular.woff") format("woff");
}

@font-face /* 14 */ {
  font-family: MJXTEX-FRB;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Fraktur-Bold.woff") format("woff");
}

@font-face /* 15 */ {
  font-family: MJXTEX-SS;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_SansSerif-Regular.woff") format("woff");
}

@font-face /* 16 */ {
  font-family: MJXTEX-SSB;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_SansSerif-Bold.woff") format("woff");
}

@font-face /* 17 */ {
  font-family: MJXTEX-SSI;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_SansSerif-Italic.woff") format("woff");
}

@font-face /* 18 */ {
  font-family: MJXTEX-SC;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Script-Regular.woff") format("woff");
}

@font-face /* 19 */ {
  font-family: MJXTEX-T;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Typewriter-Regular.woff") format("woff");
}

@font-face /* 20 */ {
  font-family: MJXTEX-V;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Vector-Regular.woff") format("woff");
}

@font-face /* 21 */ {
  font-family: MJXTEX-VB;
  src: url("https://cdn.jsdelivr.net/npm/mathjax@3.2.0/es5/output/chtml/fonts/woff-v2/MathJax_Vector-Bold.woff") format("woff");
}
</style><style type="text/css" data-fbcssmodules="css:fb.css.base css:fb.css.dialog css:fb.css.iframewidget css:fb.css.customer_chat_plugin_iframe">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:'lucida grande', tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:'lucida grande', tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_dialog_advanced{border-radius:8px;padding:10px}.fb_dialog_content{background:#fff;color:#373737}.fb_dialog_close_icon{background:url(https://connect.facebook.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{left:5px;right:auto;top:5px}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://connect.facebook.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://connect.facebook.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://connect.facebook.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{height:100%;left:0;margin:0;overflow:visible;position:absolute;top:-10000px;transform:none;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://connect.facebook.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{background:none;height:auto;min-height:initial;min-width:initial;width:auto}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{clear:both;color:#fff;display:block;font-size:18px;padding-top:20px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .4);bottom:0;left:0;min-height:100%;position:absolute;right:0;top:0;width:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_mobile .fb_dialog_iframe{position:sticky;top:0}.fb_dialog_content .dialog_header{background:linear-gradient(from(#738aba), to(#2c4987));border-bottom:1px solid;border-color:#043b87;box-shadow:white 0 1px 1px -1px inset;color:#fff;font:bold 14px Helvetica, sans-serif;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:linear-gradient(from(#4267B2), to(#2a4887));background-clip:padding-box;border:1px solid #29487d;border-radius:3px;display:inline-block;line-height:18px;margin-top:3px;max-width:85px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{background:none;border:none;color:#fff;font:bold 12px Helvetica, sans-serif;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://connect.facebook.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #4a4a4a;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f5f6f7;border:1px solid #4a4a4a;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://connect.facebook.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-position:50% 50%;background-repeat:no-repeat;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
.fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}
.fb_mpn_mobile_landing_page_slide_out{animation-duration:200ms;animation-name:fb_mpn_landing_page_slide_out;transition-timing-function:ease-in}.fb_mpn_mobile_landing_page_slide_out_from_left{animation-duration:200ms;animation-name:fb_mpn_landing_page_slide_out_from_left;transition-timing-function:ease-in}.fb_mpn_mobile_landing_page_slide_up{animation-duration:500ms;animation-name:fb_mpn_landing_page_slide_up;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_in{animation-duration:300ms;animation-name:fb_mpn_bounce_in;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_out{animation-duration:300ms;animation-name:fb_mpn_bounce_out;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_out_v2{animation-duration:300ms;animation-name:fb_mpn_fade_out;transition-timing-function:ease-in}.fb_customer_chat_bounce_in_v2{animation-duration:300ms;animation-name:fb_bounce_in_v2;transition-timing-function:ease-in}.fb_customer_chat_bounce_in_from_left{animation-duration:300ms;animation-name:fb_bounce_in_from_left;transition-timing-function:ease-in}.fb_customer_chat_bounce_out_v2{animation-duration:300ms;animation-name:fb_bounce_out_v2;transition-timing-function:ease-in}.fb_customer_chat_bounce_out_from_left{animation-duration:300ms;animation-name:fb_bounce_out_from_left;transition-timing-function:ease-in}.fb_invisible_flow{display:inherit;height:0;overflow-x:hidden;width:0}@keyframes fb_mpn_landing_page_slide_out{0%{margin:0 12px;width:100% - 24px}60%{border-radius:18px}100%{border-radius:50%;margin:0 24px;width:60px}}@keyframes fb_mpn_landing_page_slide_out_from_left{0%{left:12px;width:100% - 24px}60%{border-radius:18px}100%{border-radius:50%;left:12px;width:60px}}@keyframes fb_mpn_landing_page_slide_up{0%{bottom:0;opacity:0}100%{bottom:24px;opacity:1}}@keyframes fb_mpn_bounce_in{0%{opacity:.5;top:100%}100%{opacity:1;top:0}}@keyframes fb_mpn_fade_out{0%{bottom:30px;opacity:1}100%{bottom:0;opacity:0}}@keyframes fb_mpn_bounce_out{0%{opacity:1;top:0}100%{opacity:.5;top:100%}}@keyframes fb_bounce_in_v2{0%{opacity:0;transform:scale(0, 0);transform-origin:bottom right}50%{transform:scale(1.03, 1.03);transform-origin:bottom right}100%{opacity:1;transform:scale(1, 1);transform-origin:bottom right}}@keyframes fb_bounce_in_from_left{0%{opacity:0;transform:scale(0, 0);transform-origin:bottom left}50%{transform:scale(1.03, 1.03);transform-origin:bottom left}100%{opacity:1;transform:scale(1, 1);transform-origin:bottom left}}@keyframes fb_bounce_out_v2{0%{opacity:1;transform:scale(1, 1);transform-origin:bottom right}100%{opacity:0;transform:scale(0, 0);transform-origin:bottom right}}@keyframes fb_bounce_out_from_left{0%{opacity:1;transform:scale(1, 1);transform-origin:bottom left}100%{opacity:0;transform:scale(0, 0);transform-origin:bottom left}}@keyframes slideInFromBottom{0%{opacity:.1;transform:translateY(100%)}100%{opacity:1;transform:translateY(0)}}@keyframes slideInFromBottomDelay{0%{opacity:0;transform:translateY(100%)}97%{opacity:0;transform:translateY(100%)}100%{opacity:1;transform:translateY(0)}}</style><style></style><script src="./Subarray_with_given_sum_files/theme-dracula.js.download"></script><script src="./Subarray_with_given_sum_files/mode-javascript.js.download"></script><script src="./Subarray_with_given_sum_files/mode-java.js.download"></script></head>

<body style="margin: 0px; cursor: default;" class="header-body"><div role="dialog" aria-live="polite" aria-label="cookieconsent" aria-describedby="cookieconsent:desc" class="cc-window cc-banner cc-type-info cc-theme-classic cc-bottom cc-color-override-74746687 cc-invisible" style="display: none;"><!--googleoff: all--><span id="cookieconsent:desc" class="cc-message">We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href="https://www.geeksforgeeks.org/cookie-policy/" class="cc-link" target="_blank">Cookie Policy</a> &amp;  <a aria-label="learn more about cookies" role="button" tabindex="0" class="cc-link" href="https://www.geeksforgeeks.org/privacy-policy/" target="_blank">Privacy Policy</a></span><div class="cc-compliance"><a aria-label="dismiss cookie message" role="button" tabindex="0" class="cc-btn cc-dismiss">Got it!</a></div><!--googleon: all--></div>
    <script src="./Subarray_with_given_sum_files/blockerTester.js.download"></script>
    <script src="./Subarray_with_given_sum_files/lottie-player.js.download"></script>
    <script src="./Subarray_with_given_sum_files/pagination.js.download"></script>
    <style>
        body {
            cursor: progress;
        }

        .preloader {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: 9999;
            background-repeat: no-repeat;
            justify-content: center;
            display: flex;
            background-color: #FFF;
            background-position: center;
        }

        /* @media only screen and (max-width: 800px) {
            #showOnMob {
                background: white;
                z-index: 1000;
                position: fixed;
                left: 0;
                right: 0;
                height: 100%;
                width: 100%;
            }
            body{
                overflow: hidden;
            }
        }
        @media only screen and (min-width: 800px) {
            #showOnMob {
                display: none;
            }
        } */
    </style>
    <!-- <img id="showOnMob" src="https://media.geeksforgeeks.org/img-practice/Group11653-1619073558.png"> -->
    <div class="preloader" style="display: none;">
        <lottie-player src="https://practice.geeksforgeeks.org/css-min/json/contest/loader.json" speed="1" style="width: 60%;text-align: center;" loop="" autoplay="" background="transparent"></lottie-player>
    </div>
    
    <div class="header-top__notification display-none">
        <div class="header-top__text">
            Geeksforgeeks
        </div>
        <div class="header-top__times">
            <i class="material-icons">close</i>
        </div>
    </div>
    <!-- DO NOT MODIFY -->
    <!-- Quora Pixel Code (JS Helper) -->
    <script>
        ! function(q, e, v, n, t, s) {
            if (q.qp) return;
            n = q.qp = function() {
                n.qp ? n.qp.apply(n, arguments) : n.queue.push(arguments);
            };
            n.queue = [];
            t = document.createElement(e);
            t.async = !0;
            t.src = v;
            s = document.getElementsByTagName(e)[0];
            s.parentNode.insertBefore(t, s);
        }(window, 'script', 'https://a.quora.com/qevents.js');
        qp('init', '54ba43eaeb644b908aa476d8e9f908c2');
        qp('track', 'ViewContent');
    </script>
    <noscript><img height="1" width="1" style="display:none" src="https://q.quora.com/_/ad/54ba43eaeb644b908aa476d8e9f908c2/pixel?tag=ViewContent&noscript=1" /></noscript>
    <!-- End of Quora Pixel Code -->

    <script>
        window.fbAsyncInit = function() {
            FB.init({
                appId: '534961220012939',
                xfbml: true,
                version: 'v2.5'
            });
        };

        (function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {
                return;
            }
            js = d.createElement(s);
            js.id = id;
            js.src = "//connect.facebook.net/en_US/sdk.js";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));
    </script>
    <script>
        (function() {
            var cx = '005855190823060106138:ggjtcjog1xu';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
        })();
    </script>

    <!-- Global site tag (gtag.js) - Google Ads: 796001856 -->
    <script async="" src="./Subarray_with_given_sum_files/js(2)"></script>
    <script>
        window.dataLayer = window.dataLayer || [];

        function gtag() {
            dataLayer.push(arguments);
        }
        gtag('js', new Date());

        gtag('config', 'AW-796001856');
    </script>

    <style>
.report-issue-tabs {
    background-color: #f3f7fd;
}
.report-issue-tabs>li {
    border-bottom: 2px solid transparent;
    pointer-events: none;
}
.report-issue-tabs>li>a {
    padding: 10px 5px !important;
    font-weight: unset !important;
}
.report-issue-tabs>li.active {
    border-bottom: 2px solid #2f8d46;
}
.report-issue-tabs>li.active>a {
    font-weight: bolder !important;
}
</style>
<div class="modal fade" id="reportIssue" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title text-center" id="myModalLabel">Please Report if you are facing any issue on this page</h4>
            </div>
            <ul class="nav nav-tabs report-issue-tabs" role="tablist">
                <li class="nav-item problem-issue">
                    <a class="nav-link" id="problem-issue-tab" aria-expanded="false" data-expandable="false" role="tab" data-toggle="tab" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#problem-issue" target="_self" aria-controls="problem-issue" aria-selected="false">Problem</a>
                </li>
                <li class="nav-item contest-issue">
                    <a class="nav-link" id="contest-issue-tab" aria-expanded="false" data-expandable="false" role="tab" data-toggle="tab" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#contest-issue" target="_self" aria-controls="contest-issue" aria-selected="false">Contest</a>
                </li>
            </ul>
            <div class="tab-content">
                <div class="tab-pane fade" id="problem-issue" role="tabpanel" aria-labelledby="problem-issue-tab">
                    <div id="troubleshootingAdvice" style="padding: 15px;position: relative">
                        <span>Here is some troubleshooting advice:
                            <ul>
                                <li>Reset the IDE using the second button on the top right corner.</li>
                                <li>Avoid using static/global variables in your code as your code is tested 
                                    against multiple test cases and these tend to retain their previous values.</li>
                                <li>Passing the Sample/Custom Test cases does not guarantee the correctness of code.
                                    On submission, your code is tested against multiple test cases consisting of all
                                        possible corner cases and stress constraints.</li>
                                <li>You can access the hints to get an idea about what is expected of you as well as
                                        the final solution code.</li>
                                <li>You can view the solutions submitted by other users from the submission tab.</li>
                            </ul>
                            Still facing issue? <a href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" id="showMoreAfterTroubleshooting">Click here</a>.
                        </span>
                    </div>
                </div>
                <div class="tab-pane fade " id="contest-issue" role="tabpanel" aria-labelledby="contest-issue-tab">
                    <div id="contestTroubleshootingAdvice" style="padding: 15px;position: relative"> 
                        <span> Here is some troubleshooting advice for contest problems
                        <ul>
                            <li>Make sure you are not using ad-blockers.</li>
                            <li>Disable browser extensions.</li>
                            <li>We recommend using latest version of your browser for best experience.</li>
                            <li>Avoid using static/global variables in coding problems as your code is tested 
                                against multiple test cases and these tend to retain their previous values.</li>
                            <li>Passing the Sample/Custom Test cases in coding problems does not guarantee the 
                                correctness of code. On submission, your code is tested against multiple test cases
                                    consisting of all possible corner cases and stress constraints.</li>
                        </ul>  
                        Still facing issue? <a href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" id="showMoreAfterContestTroubleshooting">Click here</a>.
                        </span>
                    </div>
                </div>
                <div class="reportIssueForm" style="padding: 15px;position: relative">
                    <form class="form-horizontal" role="form">
                        <div class="issueExampleDiv" style="display: none">
                            <span><strong>Examples of Software related issues</strong> <span>: related to Marks, Videos, 
                                UI related etc</span>.
                            <br><strong>Examples of Content related issues</strong> <span>: related to Problem Statement,
                                 Difficulty, Test Cases, Run Time or Compilation Errors, Wrong Answer etc</span>.<br>
                                 <br></span>
                        </div>
                            
                        <div class="form-group issueDiv" style="display: none">
                            <label class="col-sm-2 control-label" style="text-align:left;" for="inputTestCase">
                                Issue Type:
                            </label>
                            <div class="col-sm-5">
                                <select class="form-control" id="issueMenu" name="issueMenu" autocomplete="off">
                                    <option value="" selected="" disabled="">Select Issue Type</option>
                                    <option value="0">Software Related Issue</option>
                                    <option value="1">Content Related Issue</option>
                                    <option value="2">Others Issue</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group subIssueDiv" style="display: none; margin-bottom: 18%;">
                            <label class="col-sm-2 control-label" style="text-align:left;" for="inputTestCase">
                                Issue Sub-Type:
                            </label>
                            <div class="col-sm-5">
                                <select class="form-control" id="subIssueMenu" name="subIssueMenu" autocomplete="off">
                                    <option value="" selected="" disabled="">Select Issue Sub-Type</option>
                                    <option value="0">Suggest Changes in Problem Statement</option>
                                    <option value="1">Suggest An Update in Problem Difficulty</option>
                                    <option value="2">Test Case Related Issue</option>
                                    <option value="3">Compiler Related Issue</option>
                                    <option value="4">Suggest Missing Test Case</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group report-issue-problem-difficulty" style="display: none">
                            <label class="col-sm-2 control-label" style="text-align:left;" for="inputTestCase">
                                Current Difficulty:
                            </label>
                            <div class="col-sm-4" style="margin-top:5px">
                                <select name="level" id="current-problem-difficulty" disabled="">
                                                                            <option value="School">
                                            School                                        </option>
                                                                            <option value="Basic">
                                            Basic                                        </option>
                                                                            <option value="Easy">
                                            Easy                                        </option>
                                                                            <option value="Medium">
                                            Medium                                        </option>
                                                                            <option value="Hard">
                                            Hard                                        </option>
                                                                    </select>
                            </div>
                            <label class="col-sm-2 control-label" style="text-align:left;" for="inputTestCase">
                                Suggest An Update in Problem Difficulty:
                            </label>
                            <div class="col-sm-4" style="margin-top:5px">
                                <select name="level" id="problemLevel">
                                                                            <option value="School">School</option>
                                                                            <option value="Basic">Basic</option>
                                                                            <option value="Easy">Easy</option>
                                                                            <option value="Medium">Medium</option>
                                                                            <option value="Hard">Hard</option>
                                                                    </select>
                            </div>
                        </div>
                        <div class="form-group report-issue-problem-statement" style="display: none">
                            <label class="col-sm-2" for="content">Suggest Changes in Problem Statement:</label>
                            <div style="display: none">
                                <textarea id="initialProblemContent" class="form-control" rows="25" cols="100" name="initialProblemContent" style="visibility: hidden; display: none;">                                                                    </textarea><div id="cke_initialProblemContent" class="cke_1 cke cke_reset cke_chrome cke_editor_initialProblemContent cke_ltr cke_browser_webkit cke_browser_quirks" dir="ltr" lang="en" role="application" aria-labelledby="cke_initialProblemContent_arialbl"><span id="cke_initialProblemContent_arialbl" class="cke_voice_label">Rich Text Editor, initialProblemContent</span><div class="cke_inner cke_reset" role="presentation"><span id="cke_1_top" class="cke_top cke_reset_all" role="presentation" style="height: auto; user-select: none;"><span id="cke_16" class="cke_voice_label">Editor toolbars</span><span id="cke_1_toolbox" class="cke_toolbox" role="group" aria-labelledby="cke_16" onmousedown="return false;"><span id="cke_21" class="cke_toolbar cke_toolbar_last" role="toolbar"><span class="cke_toolbar_start"></span><span id="cke_17" class="cke_combo cke_combo__styles cke_combo_off" role="presentation"><span id="cke_17_label" class="cke_combo_label">Styles</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Formatting Styles&#39;)" hidefocus="true" role="button" aria-labelledby="cke_17_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(3,event,this);" onfocus="return CKEDITOR.tools.callFunction(4,event);" onclick="CKEDITOR.tools.callFunction(2,this);return false;"><span id="cke_17_text" class="cke_combo_text cke_combo_inlinelabel">Styles</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_18" class="cke_combo cke_combo__format cke_combo_off" role="presentation"><span id="cke_18_label" class="cke_combo_label">Format</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Paragraph Format&#39;)" hidefocus="true" role="button" aria-labelledby="cke_18_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(6,event,this);" onfocus="return CKEDITOR.tools.callFunction(7,event);" onclick="CKEDITOR.tools.callFunction(5,this);return false;"><span id="cke_18_text" class="cke_combo_text cke_combo_inlinelabel">Format</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_19" class="cke_combo cke_combo__font cke_combo_off" role="presentation"><span id="cke_19_label" class="cke_combo_label">Font</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Font Name&#39;)" hidefocus="true" role="button" aria-labelledby="cke_19_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(9,event,this);" onfocus="return CKEDITOR.tools.callFunction(10,event);" onclick="CKEDITOR.tools.callFunction(8,this);return false;"><span id="cke_19_text" class="cke_combo_text cke_combo_inlinelabel">Font</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_20" class="cke_combo cke_combo__fontsize cke_combo_off" role="presentation"><span id="cke_20_label" class="cke_combo_label">Size</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Font Size&#39;)" hidefocus="true" role="button" aria-labelledby="cke_20_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(12,event,this);" onfocus="return CKEDITOR.tools.callFunction(13,event);" onclick="CKEDITOR.tools.callFunction(11,this);return false;"><span id="cke_20_text" class="cke_combo_text cke_combo_inlinelabel">Size</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span class="cke_toolgroup" role="presentation"><a id="cke_22" class="cke_button cke_button__bold cke_button_off" href="javascript:void(&#39;Bold&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_22_label" aria-describedby="cke_22_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(14,event);" onfocus="return CKEDITOR.tools.callFunction(15,event);" onclick="CKEDITOR.tools.callFunction(16,this);return false;"><span class="cke_button_icon cke_button__bold_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -24px;background-size:auto;">&nbsp;</span><span id="cke_22_label" class="cke_button_label cke_button__bold_label" aria-hidden="false">Bold</span><span id="cke_22_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+B</span></a><a id="cke_23" class="cke_button cke_button__italic cke_button_off" href="javascript:void(&#39;Italic&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_23_label" aria-describedby="cke_23_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(17,event);" onfocus="return CKEDITOR.tools.callFunction(18,event);" onclick="CKEDITOR.tools.callFunction(19,this);return false;"><span class="cke_button_icon cke_button__italic_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -48px;background-size:auto;">&nbsp;</span><span id="cke_23_label" class="cke_button_label cke_button__italic_label" aria-hidden="false">Italic</span><span id="cke_23_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+I</span></a><a id="cke_24" class="cke_button cke_button__underline cke_button_off" href="javascript:void(&#39;Underline&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_24_label" aria-describedby="cke_24_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(20,event);" onfocus="return CKEDITOR.tools.callFunction(21,event);" onclick="CKEDITOR.tools.callFunction(22,this);return false;"><span class="cke_button_icon cke_button__underline_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -144px;background-size:auto;">&nbsp;</span><span id="cke_24_label" class="cke_button_label cke_button__underline_label" aria-hidden="false">Underline</span><span id="cke_24_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+U</span></a></span><span class="cke_toolbar_end"></span></span></span></span><div id="cke_1_contents" class="cke_contents cke_reset" role="presentation" style="height: 200px;"><span id="cke_29" class="cke_voice_label">Press ALT 0 for help</span><iframe src="./Subarray_with_given_sum_files/saved_resource.html" frameborder="0" class="cke_wysiwyg_frame cke_reset" aria-describedby="cke_29" tabindex="0" allowtransparency="true" style="width: 100%; height: 100%;"></iframe></div><span id="cke_1_bottom" class="cke_bottom cke_reset_all" role="presentation" style="user-select: none;"><span id="cke_1_resizer" class="cke_resizer cke_resizer_vertical cke_resizer_ltr" onmousedown="CKEDITOR.tools.callFunction(0, event)">◢</span><span id="cke_1_path_label" class="cke_voice_label">Elements path</span><span id="cke_1_path" class="cke_path" role="group" aria-labelledby="cke_1_path_label"><span class="cke_path_empty">&nbsp;</span></span></span></div></div>
                                <script src="./Subarray_with_given_sum_files/ckeditor.js.download" onload="CKEDITOR.replace(&#39;initialProblemContent&#39;); 
                                    CKEDITOR.config.toolbar = [[&#39;Styles&#39;,&#39;Format&#39;,&#39;Font&#39;,&#39;FontSize&#39;, &#39;Bold&#39;,&#39;Italic&#39;,
                                                                &#39;Underline&#39;,&#39;StrikeThrough&#39;]];">
                                </script>
                            </div>
                            <div class="col-sm-10">
                                <textarea id="problemContent" class="form-control" rows="25" cols="100" name="problemContent" style="visibility: hidden; display: none;">                                                                    </textarea><div id="cke_problemContent" class="cke_2 cke cke_reset cke_chrome cke_editor_problemContent cke_ltr cke_browser_webkit cke_browser_quirks" dir="ltr" lang="en" role="application" aria-labelledby="cke_problemContent_arialbl"><span id="cke_problemContent_arialbl" class="cke_voice_label">Rich Text Editor, problemContent</span><div class="cke_inner cke_reset" role="presentation"><span id="cke_2_top" class="cke_top cke_reset_all" role="presentation" style="height: auto; user-select: none;"><span id="cke_41" class="cke_voice_label">Editor toolbars</span><span id="cke_2_toolbox" class="cke_toolbox" role="group" aria-labelledby="cke_41" onmousedown="return false;"><span id="cke_46" class="cke_toolbar cke_toolbar_last" role="toolbar"><span class="cke_toolbar_start"></span><span id="cke_42" class="cke_combo cke_combo__styles cke_combo_off" role="presentation"><span id="cke_42_label" class="cke_combo_label">Styles</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Formatting Styles&#39;)" hidefocus="true" role="button" aria-labelledby="cke_42_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(29,event,this);" onfocus="return CKEDITOR.tools.callFunction(30,event);" onclick="CKEDITOR.tools.callFunction(28,this);return false;"><span id="cke_42_text" class="cke_combo_text cke_combo_inlinelabel">Styles</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_43" class="cke_combo cke_combo__format cke_combo_off" role="presentation"><span id="cke_43_label" class="cke_combo_label">Format</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Paragraph Format&#39;)" hidefocus="true" role="button" aria-labelledby="cke_43_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(32,event,this);" onfocus="return CKEDITOR.tools.callFunction(33,event);" onclick="CKEDITOR.tools.callFunction(31,this);return false;"><span id="cke_43_text" class="cke_combo_text cke_combo_inlinelabel">Format</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_44" class="cke_combo cke_combo__font cke_combo_off" role="presentation"><span id="cke_44_label" class="cke_combo_label">Font</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Font Name&#39;)" hidefocus="true" role="button" aria-labelledby="cke_44_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(35,event,this);" onfocus="return CKEDITOR.tools.callFunction(36,event);" onclick="CKEDITOR.tools.callFunction(34,this);return false;"><span id="cke_44_text" class="cke_combo_text cke_combo_inlinelabel">Font</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span id="cke_45" class="cke_combo cke_combo__fontsize cke_combo_off" role="presentation"><span id="cke_45_label" class="cke_combo_label">Size</span><a class="cke_combo_button" tabindex="-1" href="javascript:void(&#39;Font Size&#39;)" hidefocus="true" role="button" aria-labelledby="cke_45_label" aria-haspopup="true" onkeydown="return CKEDITOR.tools.callFunction(38,event,this);" onfocus="return CKEDITOR.tools.callFunction(39,event);" onclick="CKEDITOR.tools.callFunction(37,this);return false;"><span id="cke_45_text" class="cke_combo_text cke_combo_inlinelabel">Size</span><span class="cke_combo_open"><span class="cke_combo_arrow"></span></span></a></span><span class="cke_toolgroup" role="presentation"><a id="cke_47" class="cke_button cke_button__bold cke_button_off" href="javascript:void(&#39;Bold&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_47_label" aria-describedby="cke_47_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(40,event);" onfocus="return CKEDITOR.tools.callFunction(41,event);" onclick="CKEDITOR.tools.callFunction(42,this);return false;"><span class="cke_button_icon cke_button__bold_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -24px;background-size:auto;">&nbsp;</span><span id="cke_47_label" class="cke_button_label cke_button__bold_label" aria-hidden="false">Bold</span><span id="cke_47_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+B</span></a><a id="cke_48" class="cke_button cke_button__italic cke_button_off" href="javascript:void(&#39;Italic&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_48_label" aria-describedby="cke_48_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(43,event);" onfocus="return CKEDITOR.tools.callFunction(44,event);" onclick="CKEDITOR.tools.callFunction(45,this);return false;"><span class="cke_button_icon cke_button__italic_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -48px;background-size:auto;">&nbsp;</span><span id="cke_48_label" class="cke_button_label cke_button__italic_label" aria-hidden="false">Italic</span><span id="cke_48_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+I</span></a><a id="cke_49" class="cke_button cke_button__underline cke_button_off" href="javascript:void(&#39;Underline&#39;)" tabindex="-1" hidefocus="true" role="button" aria-labelledby="cke_49_label" aria-describedby="cke_49_description" aria-haspopup="false" onkeydown="return CKEDITOR.tools.callFunction(46,event);" onfocus="return CKEDITOR.tools.callFunction(47,event);" onclick="CKEDITOR.tools.callFunction(48,this);return false;"><span class="cke_button_icon cke_button__underline_icon" style="background-image:url(&#39;https://cdn.ckeditor.com/4.10.0/full/plugins/icons.png?t=I63C&#39;);background-position:0 -144px;background-size:auto;">&nbsp;</span><span id="cke_49_label" class="cke_button_label cke_button__underline_label" aria-hidden="false">Underline</span><span id="cke_49_description" class="cke_button_label" aria-hidden="false">Keyboard shortcut Ctrl+U</span></a></span><span class="cke_toolbar_end"></span></span></span></span><div id="cke_2_contents" class="cke_contents cke_reset" role="presentation" style="height: 200px;"><span id="cke_53" class="cke_voice_label">Press ALT 0 for help</span><iframe src="./Subarray_with_given_sum_files/saved_resource(1).html" frameborder="0" class="cke_wysiwyg_frame cke_reset" aria-describedby="cke_53" tabindex="0" allowtransparency="true" style="width: 100%; height: 100%;"></iframe></div><span id="cke_2_bottom" class="cke_bottom cke_reset_all" role="presentation" style="user-select: none;"><span id="cke_2_resizer" class="cke_resizer cke_resizer_vertical cke_resizer_ltr" onmousedown="CKEDITOR.tools.callFunction(26, event)">◢</span><span id="cke_2_path_label" class="cke_voice_label">Elements path</span><span id="cke_2_path" class="cke_path" role="group" aria-labelledby="cke_2_path_label"><span class="cke_path_empty">&nbsp;</span></span></span></div></div>
                                <script src="./Subarray_with_given_sum_files/ckeditor.js.download" onload="CKEDITOR.replace(&#39;problemContent&#39;); 
                                    CKEDITOR.config.toolbar = [[&#39;Styles&#39;,&#39;Format&#39;,&#39;Font&#39;,&#39;FontSize&#39;, 
                                                                &#39;Bold&#39;,&#39;Italic&#39;,&#39;Underline&#39;,&#39;StrikeThrough&#39;]];">
                                </script>
                            </div>
                        </div>
                        <div class="form-group describe-issue" style="display: none">
                            <label class="col-sm-1 control-label" style="text-align:left;" for="inputTestCase">
                                Describe Your Issue:
                            </label>
                            <div class="col-sm-10">
                                <textarea id="reportIssueDescription" class="form-control" rows="7" cols="100" name="issueDescription" style="max-width: 100%;min-width: 100%;"></textarea>
                            </div>
                        </div>
                        <div class="form-group attachment" style="display: none">
                            <label class="col-sm-1 control-label" style="text-align:left;" for="inputTestCase">
                                Attach Screenshot:
                            </label>
                            <div class="col-sm-10">
                                <input type="file" accept="image/x-png,image/jpeg" name="reportIssueImage" class="reportIssueAttach">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal" id="reportIssueEmail" style="display:none;float:right;margin-left:5px;border-radius:0.3rem;">
                    Send
                </button>
                <button type="button" class="btn btn-default" data-dismiss="modal" id="reportIssueClose" style="float:right; border-radius:0.3rem;">
                    Close
                </button>
            </div>
        </div>
    </div>
</div>
<script>
    var activeTab = "";
    var entity_id = "";
    var contentType = "";
$("#issueMenu").change(function() {
    var id = $(this).val();
    if (id == 1) {
        if(activeTab == "problem-issue"){
            $('.subIssueDiv').show();
            $(".describe-issue").hide();
            $('.attachment').hide();
            $('.subIssueDiv').css('margin-bottom', '18%');
        }
        else{
            $(".describe-issue").show();
            $('.attachment').show();
        }
    } 
    else if(id == 0 || id == 2) {
        $(".describe-issue").show();
        $('.attachment').show();
        $('.subIssueDiv').hide();
    }
    else if(id == "") {
        $(".describe-issue").hide();
        $('.attachment').hide();
    }
    if($(".subIssueDiv").css("display") === "none") {
        $('.report-issue-problem-statement').hide();
        $('.report-issue-problem-difficulty').hide();
        $('#subIssueMenu').prop('selectedIndex',0);
    }
});
$("#showMoreAfterTroubleshooting").on('click', function(){
    $("#troubleshootingAdvice").remove();
    $('.issueExampleDiv').show();
    $('.issueDiv').show();
    $('#reportIssueEmail').show();
})
$("#showMoreAfterContestTroubleshooting").on('click', function(){
    $("#contestTroubleshootingAdvice").remove();
    $('.issueExampleDiv').show();
    $('.issueDiv').show();
    $('.describe-issue').show();
    $('.attachment').show();
    $('#reportIssueEmail').show();
})
$("#subIssueMenu").change(function() {
    var id = $(this).val();
    if(id == 0) {
        $('.report-issue-problem-statement').show();
        $(".describe-issue").show();
        $('.attachment').show();
        $('.report-issue-problem-difficulty').hide();
    }
    else if(id == 1) {
        $('.report-issue-problem-difficulty').show();
        $(".describe-issue").show();
        $('.attachment').show();
        $('.report-issue-problem-statement').hide();
    }
    else if(id == 2 || id == 3) {
        $(".describe-issue").show();
        $('.attachment').show();
        $('.report-issue-problem-difficulty').hide();
        $('.report-issue-problem-statement').hide();
    }
    if(id != "") {
        $('.subIssueDiv').css('margin-bottom', '2%');
    }
});
$("#reportIssueEmail").click(function(event){
    var thisBtn = $(this);
    var suggested_content = "", initial_content = "", issueDescription = "";
    if($("#issueMenu").val()==0 || $("#issueMenu").val()==2) {
        var description = $.trim($("#reportIssueDescription").val());
        if(description == "") {
            alert("Please describe your issue.");
            return false;
        }
        issueDescription = escapeIllegalChars(description);
        
    } else if($("#issueMenu").val()==1) {
        if(activeTab == "contest-issue"){
            var description = $.trim($("#reportIssueDescription").val());
            if(description == "") {
                alert("Please describe your issue.");
                return false;
            }
            issueDescription = escapeIllegalChars(description);
        }
        else {
            if($("#subIssueMenu").val() == null) {
                alert("Please select sub-issue type.");
                return false;
            } else {
                if($("#subIssueMenu").val() == 0) {
                    initial_content = CKEDITOR.instances['initialProblemContent'].getData();
                    suggested_content = CKEDITOR.instances['problemContent'].getData();
                    if(suggested_content == "") {
                        alert("Problem statement cannot be empty.");
                        return false;
                    }
                }
                else if($("#subIssueMenu").val() == 1) {
                    initial_content = $("#current-problem-difficulty").val();
                    suggested_content = $("#problemLevel").val();
                }
                else if($("#subIssueMenu").val() == "") {
                    alert("Please select type of your sub issue type");
                    return false;
                }
                var description = $.trim($("#reportIssueDescription").val());
                if(description == "" && ($("#subIssueMenu").val()==2 
                                            || $("#subIssueMenu").val()==3 
                                            || $("#subIssueMenu").val()==4)) {
                    alert("Please describe your issue.");
                    return false;
                }
                if(description!="") {
                    issueDescription = escapeIllegalChars(description);
                }
            }
        }
    } else if($("#issueMenu").val()==null) {
        alert("Please select type of your issue.");
        return false;
    } 
    var formData = new FormData()
    formData.append('issueType', $("#issueMenu").val());
    formData.append('subIssueType', $("#subIssueMenu").val());
    formData.append('contentType', contentType);
    formData.append('entityId', entity_id);
    formData.append('inputFiles', $('.reportIssueAttach[type=file]')[0].files[0]);
    formData.append('initialContent', initial_content);
    formData.append('suggestedContent', suggested_content);
    formData.append('issueDescription', issueDescription);
    formData.append('requestUrl', window.location.href);
    formData.append('pageTitle', $('title:first').text());
    formData.append( 'browserName',getUserBrowserDetails()['browserName']);
    formData.append( 'majorVersion',getUserBrowserDetails()['majorVersion']);
    formData.append( 'osName',getUserBrowserDetails()['osName']);
    formData.append( 'adBlocker',getUserBrowserDetails()['adBlocker']);
    formData.append( 'referrer', getUserBrowserDetails()['referrer']);
    $.ajax({
        type:"POST",
        url:practice_api_url + "issues/create/",
        crossdomain: true,
        xhrFields: {
            withCredentials: true
        },
        processData: false,
        contentType: false,
        data: formData,
        success:function(response){
             $('#commentModalHeader .modal-body p').html(response.message);
             if(response.message.length >3){
                $('#commentModalHeader').modal('show');
             }
        },
        error: function(jqXHR, exception, errorThrown){
            if(jqXHR.status === 0){
                showSnackBarMessage("Seems your internet connection is unstable.Please check your internet connection.");
            }
        }
    });
  });
  
$(".reportIssueAttach").change(function(){
    var val = $(this).val();
    switch(val.substring(val.lastIndexOf('.') + 1).toLowerCase()){
        case 'jpeg': case 'png':
            break;
        default:
            $(this).val('');
            // error message here
            alert("Please select only jpeg and png files");
            break;
    }
});
function showSnackBarMessage(msg, duration = 3000, onlyFadeIn = false) {
        $('#snackbar').text(msg);
        $('#snackbar').addClass('show');
        if (onlyFadeIn) {
            $('#snackbar.show').css('animation', 'fadein 0.5s'); // original class also has fadeout animation
        }
        setTimeout(function () { $('#snackbar').removeClass('show'); }, duration);
    }
</script>    <div class="header-hellobar-container stick-me">
    
       <div class="blocker-tester"> 
    <div class="blocker-btn-cnt">
     <button class="blocker-btn">Close</button>
    </div>
    <div class="blocker-tester-header"> 
      AdBlocker Detected!
    </div>
    <div class="blocker-tester-content">
     <p>Some of the functionality of this site might not work properly if you have enabled AdBlocker or a similar extension.</p>
     <p></p>Please disable Adblocker.<p></p>
    </div>
  </div>

  <div class="ad-banner">
  </div>
        <div class="header-main__wrapper">
            <a href="https://practice.geeksforgeeks.org/home/" class="header-main__logo">
                <div class="_logo">
                    <svg xmlns="http://www.w3.org/2000/svg" width="76.533" height="39.026" viewBox="0 0 76.533 39.026" class="normal">
                        <path d="M2380.7,6597.866a12.252,12.252,0,0,0-.261-1.513l-30.726-.027a12.545,12.545,0,0,1,.908-3.443,12.337,12.337,0,0,1,2.739-4.044,12.151,12.151,0,0,1,4.018-2.581,12.634,12.634,0,0,1,14.3,3.051l4.852-4.748a18.176,18.176,0,0,0-6.131-4.331,20.037,20.037,0,0,0-8.112-1.564,20.25,20.25,0,0,0-7.671,1.459,19.158,19.158,0,0,0-6.261,4.07,19.584,19.584,0,0,0-4.226,6.184,18.7,18.7,0,0,0-1.487,5.947h-.2a18.674,18.674,0,0,0-1.489-5.947,19.544,19.544,0,0,0-4.226-6.184,19.133,19.133,0,0,0-6.261-4.07,21.354,21.354,0,0,0-15.783.1,18.2,18.2,0,0,0-6.131,4.331l4.853,4.748a13.264,13.264,0,0,1,14.3-3.051,12.131,12.131,0,0,1,4.017,2.581,12.323,12.323,0,0,1,2.74,4.044,12.527,12.527,0,0,1,.908,3.443l-30.726.027a12.256,12.256,0,0,0-.261,1.513,15,15,0,0,0-.1,1.773,20.713,20.713,0,0,0,1.1,6.783,15.709,15.709,0,0,0,3.443,5.686,17.309,17.309,0,0,0,6,4.123,20.587,20.587,0,0,0,7.983,1.46,20.226,20.226,0,0,0,7.669-1.46,19.086,19.086,0,0,0,6.261-4.07,19.506,19.506,0,0,0,4.226-6.184,18.163,18.163,0,0,0,1.153-3.629h.871a18.27,18.27,0,0,0,1.151,3.629,19.545,19.545,0,0,0,4.226,6.184,19.111,19.111,0,0,0,6.261,4.07,20.241,20.241,0,0,0,7.671,1.46,20.572,20.572,0,0,0,7.981-1.46,17.282,17.282,0,0,0,6-4.123,15.717,15.717,0,0,0,3.445-5.686,20.726,20.726,0,0,0,1.1-6.783A15.259,15.259,0,0,0,2380.7,6597.866Zm-46.245,5.608a12.1,12.1,0,0,1-2.766,4.043,12.467,12.467,0,0,1-4.043,2.583,14.378,14.378,0,0,1-9.939.052,11.776,11.776,0,0,1-3.522-2.218,8.459,8.459,0,0,1-1.8-2.374,13.476,13.476,0,0,1-1.173-3.208l23.658,0A11.487,11.487,0,0,1,2334.457,6603.475Zm38.236,2.086a8.466,8.466,0,0,1-1.8,2.374,11.771,11.771,0,0,1-3.522,2.218,14.378,14.378,0,0,1-9.939-.052,12.491,12.491,0,0,1-4.044-2.583,12.088,12.088,0,0,1-2.765-4.043,11.427,11.427,0,0,1-.415-1.126h11.92v0h11.739A13.509,13.509,0,0,1,2372.692,6605.561Z" transform="translate(-2304.273 -6578.666)" fill="#2f8d46"></path>
                    </svg>
                    <svg xmlns="http://www.w3.org/2000/svg" width="107.168" height="22.01" viewBox="0 0 107.168 22.01" aria-hidden="false">
                        <path xmlns="http://www.w3.org/2000/svg" id="Path_407" data-name="Path 407" d="M-2099.961-1967.559a6.921,6.921,0,0,1,7.112-7.2c3.924,0,6.905,2.833,6.905,7.17,0,.384-.029.8-.06,1.239h-10.977a3.95,3.95,0,0,0,4.25,3.394,4.493,4.493,0,0,0,3.9-2.007l2.3,1.151a6.974,6.974,0,0,1-6.314,3.542A6.961,6.961,0,0,1-2099.961-1967.559Zm3.01-1.121h8.115a3.76,3.76,0,0,0-3.983-3.394A3.863,3.863,0,0,0-2096.951-1968.681Zm-17.763,1.151a7.175,7.175,0,0,1,7.436-7.23,6.91,6.91,0,0,1,5.371,2.361l-1.919,1.8a4.523,4.523,0,0,0-3.393-1.445,4.461,4.461,0,0,0-4.6,4.514,4.486,4.486,0,0,0,4.6,4.544,4.527,4.527,0,0,0,3.393-1.445l1.919,1.8a6.913,6.913,0,0,1-5.371,2.361A7.2,7.2,0,0,1-2114.715-1967.53Zm-31.985,0a7.175,7.175,0,0,1,7.436-7.23,6.906,6.906,0,0,1,5.37,2.361l-1.918,1.8a4.523,4.523,0,0,0-3.393-1.445,4.461,4.461,0,0,0-4.6,4.514,4.724,4.724,0,0,0,1.085,2.988,4.441,4.441,0,0,0,3.518,1.556,4.527,4.527,0,0,0,3.393-1.445l1.918,1.8a6.909,6.909,0,0,1-5.37,2.361A7.2,7.2,0,0,1-2146.7-1967.53Zm-17.911,0c0-4.1,2.921-7.23,6.817-7.23a5.382,5.382,0,0,1,4.78,2.419v-2.066h2.892v13.781h-2.892v-2.331a5.584,5.584,0,0,1-4.9,2.686C-2161.513-1960.27-2164.611-1963.281-2164.611-1967.53Zm2.921,0a4.4,4.4,0,0,0,4.279,4.544,4.473,4.473,0,0,0,4.367-4.544,4.513,4.513,0,0,0-4.426-4.514A4.383,4.383,0,0,0-2161.689-1967.53Zm40.66,6.9v-13.781h2.892v13.781Zm-8.586,0v-11.361h-2.479v-2.42h2.479v-5.164h2.891v5.164h2.951v2.42h-2.951v11.361Zm-45.264,0v-13.781h2.921v3.1c.708-2.419,2.1-3.452,3.866-3.452a5.305,5.305,0,0,1,2.36.5l-.5,2.745a4.88,4.88,0,0,0-2.036-.473c-2.508,0-3.689,2.686-3.689,6.4v4.957Zm-17.232,0v-20.332h8.144c4.368,0,6.2,3.217,6.2,6.433,0,3.246-1.83,6.374-6.2,6.374h-5.1v7.525Zm3.039-10.3h4.928c2.361,0,3.334-1.8,3.334-3.6s-.944-3.658-3.217-3.658h-5.046Zm67.513-8.5a1.915,1.915,0,0,1,1.976-1.859,1.9,1.9,0,0,1,1.977,1.859,1.9,1.9,0,0,1-1.977,1.859A1.915,1.915,0,0,1-2121.56-1979.422Z" transform="translate(2192.612 1981.781)" fill="#0f2b3c" stroke="rgba(0,0,0,0)" stroke-width="1"></path>
                    </svg>
                </div>
            </a>
            <div class="header-main__container">
                <span class="hamburger-menu">
                    <!-- sidebar on tab and mobile view -->
                    <span class="gfg-burger-1"></span>
                    <span class="gfg-burger-2"></span>
                    <span class="gfg-burger-3"></span>
                </span>
                <ul class="header-main__list">
                    <li class="header-main__list-item" data-id="contest_home_tab" tab-id="instructions" aria-expanded="false" data-expandable="false">
                        Contest Home
                    </li>
                    
                    <li class="header-main__list-item tab_active" tab-id="problems" data-id="coding_problems_tab" aria-expanded="false" data-expandable="false">
                        Coding Problems
                    </li>
                </ul>
                <ul class="header-main__left-list" data-type="0" data-nl="false">
                    <style>
                        .contest_timer_text {
                            font-size: 1rem;
                        }

                        .contest_timer {
                            margin-right: 2rem;
                            display: block;
                        }

                        .timer {
                            font-size: 1.5rem;
                        }

                        .endTest {
                            background: #0F2B3C;
                            color: white;
                            margin-right: 2rem;
                            padding: 1rem 2rem;
                        }

                        .endTest:hover {
                            background: #0F2B3C;
                            color: white;
                        }

                        .header-main__list-item.header-sidebar__list-item{
                            display: block;
                            padding: 15px 25px 15px 45px;
                            cursor: pointer;
                            font-family: var(--font-sofia-pro);
                            font-weight: 400;
                            font-size: 16px;
                            margin: 0px !important;
                        }
                    </style>
                    
                        
                        <li class="header-main__left-list-item p-relative" aria-expanded="false" data-expandable="false">
                            
                        </li>
                </ul>
            </div>
            <div class="gfg-overlay display-none" id="gfg-overlay"></div>
            <div class="header-sidebar__wrapper">
                <ul class="header-sidebar__list">
                   
                    <li class="header-main__list-item header-sidebar__list-item" data-id="contest_home_tab" tab-id="instructions" aria-expanded="false" data-expandable="false">
                        Contest Home
                    </li>
                        
                        <li class="header-main__list-item header-sidebar__list-item tab_active" tab-id="problems" data-id="coding_problems_tab" aria-expanded="false" data-expandable="false">
                            Coding Problems
                        </li>
                        <li class="header-sidebar__list-item" aria-expanded="false" data-expandable="false">
                            
                        </li>
                </ul>
                <div class="" style="height: 80px;"></div>
            </div>

            

        </div> <!-- header-main__wrapper stick-me -->
    </div>
    <!-- Modal for Custom GCSE result display -->
    <div id="displayModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="error-message"></div>
                <div class="modal-header">
                    <button onclick="closeDisplayModal(event)" type="button" class="close" data-dismiss="modal">×</button>
                    <h2 class="modal-title" id="dmTitle"></h2>
                </div>
                <div class="modal-body" id="dmBody">
                    <div id="modal-dm-content"></div>
                    <div class="modal-overlay" aria-hidden="true">
                        <span class="loader__animation"></span>
                    </div>
                    <!-- body -->
                </div>
                <div class="modal-footer">
                    <!-- button -->
                </div>
            </div>
        </div>
    </div>
    <!-- End of custom modal -->
    <div class="modal fade" id="commentModalHeader" role="success">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h4 class="modal-title">Message </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <div class="modal-body">
                            <p>Error</p>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
                </div>
            </div>
        </div>
    </div>

    <!--Comment Modal -->
    <div class="modal fade" id="commentModal" role="success" data-backdrop="static" data-keyboard="false">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Message </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <div class="modal-body">
                            <p>Error</p>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
                </div>
            </div>
        </div>
    </div>

            <script>
        var curPageUrl = 'https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/instructions/';
        var notificationUrl = contestCDNUrlPrefix+"/notification/"
        $(document).ready(function() {
            $(document).on('click', ".header-main__list-item", function(e) {
                e.preventDefault();
                $(".contest_home_main").hide();
                $(".quiz_main").hide();
                $(".coding_problems_main").hide();

                var current_tab = $(this).attr("data-id");
                current_tab = current_tab.substring(0, current_tab.length - 4);
                current_view = "." + current_tab + "_main";
                $(current_view).show();
            });

            function isLocalStorageAvailable() {
                var testString = "test";
                try {
                    localStorage.setItem(testString, testString);
                    localStorage.removeItem(testString);
                    return true;
                } catch (e) {
                    if (e.name == 'QuotaExceededError') {
                        localStorage.clear();
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            function showBroadcast(message) {
                if (isLocalStorageAvailable()) {
                    var localBroadcastMessage = localStorage.getItem("broadcast" + contestId);
                    if (message == localBroadcastMessage) {
                        return false;
                    } else {
                        localStorage.setItem("broadcast" + contestId, message);
                        return true;
                    }
                } else {
                    localStorage.setItem("broadcast" + contestId, message);
                    return true;
                }
            }

            function loadMessage() {

                $.ajax({
                    url: notificationUrl,
                    type: "GET",
                    crossDomain: true,
                    success: function(result) {
                        if (result && result['message'] && result['status'] == 'SUCCESS' &&
                            showBroadcast(result['message'])) {
                            $.toast({
                                text: result['message'],
                                heading: "Message",
                                hideAfter: 300000,
                                loader: false
                            })
                        }
                    }
                });
            }
            //loadMessage();
            setInterval(function() {
                loadMessage()
            }, 300000);

        });
    </script>

    <div class="modal fade" id="reportIssueHeader" tabindex="-1" role="dialog">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">Note: For issues in your code/test-cases,
                        please use Comment-System of that particular problem.</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-sm-1 control-label" for="inputTestCase">Details</label>
                            <div class="col-sm-11">
                                <textarea id="issueDescription" class="form-control" rows="7" cols="100" name="issueDescription"></textarea>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" style="float:left;">Cancel</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal" id="reportIssueHeaderMail" style="float:right;">Send</button>
                </div>
            </div>
        </div>
    </div>


    <div class="container-fluid">
        <div id="loaderMask" style="display:none;width: 100%;height: 100%;top: 0;left: 0;background: #0006;padding: 20em 0% 0% 48em;z-index: 1000000;position: fixed;">
            <h3><i class="fa fa-spin fa-spinner" style="font-size: 2em;"></i></h3>
        </div>

                <div class="iframe-top-div" style="display:none;background-repeat: no-repeat;background-image: url(&#39;https://media.geeksforgeeks.org/img-practice/gfg_rev.gif&#39;)" id="class-div-js">
            <span id="taking-time-to-join" style="padding:3px;position: absolute;margin-top: 60vh;margin-left: auto;margin-right:auto;">
                <center>If you are facing any issue or this is taking too long, please <a href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/" class="join-link">click</a> to join directly.</center>
            </span>
            <iframe id="class-iframe-src" src="./Subarray_with_given_sum_files/saved_resource(2).html" allow="camera;microphone *" width="100%" height="100%"></iframe>
        </div>
        <div style="z-index: 1000;position: fixed;display:none;" class="cancel-class-section col-sm-1 col-sm-offset-10">
            <button style="color: red;background: white;border: unset;padding: 10px;margin: 10px;width: 120%;" class="cancel-cls-btn">Exit</button>
        </div>

    <div id="contestHintPlayer" style="z-index: 1100 !important;" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content" style="position: relative">
            <div class="modal-header">
                <button type="button" class="closeHintVideoModal close" data-dismiss="modal">×</button>
                <h4 class="modal-title"></h4>
            </div>
                <div class="row" style="padding: 0px; margin: 0px; position: relative;">
                    <div class="col-xs-12" id="video-src" style="position: relative; padding: 10px; min-height: 250px">
                        <video style="width: 100%!important; padding-left: 0px; padding-right: 0px" id="contestVideoModal" oncontextmenu="return false;" class="video-js video-inner-src" autoplay="" controls=""></video>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Reminder Modal For Phone Starts-->

    <style>
        .reminder-modal .modal-footer,
        .reminder-modal .modal-header{
            border: none;
        } 
        .reminder-modal{
            width: 90% !important;
            margin: 0 auto !important;
            max-width: 400px !important;
        }
        .reminder-modal .modal-header{
            position: relative;
            padding: 0px;
        }
        .reminder-modal .modal-header-bell{
            background-color: white;
            border-radius: 50%;
            position: absolute;
            top: 0%;
            left: 50%;
            transform: translate(-50%, -50%);
            display: grid;
            align-items: center;
            justify-content: center;
            padding: 15px;
        }
        .reminder-modal .modal-body{
            text-align: center;
            width: 70%;
            margin: 0 auto;
            padding-bottom: 0px;
            height: unset !important;
            background: none;
        }
        .reminder-modal .modal-body .heading{
            color: #2C334B;
            font-size: 22px;
            font-weight: bold;
            margin-bottom: 6px;
        }
        .reminder-modal .modal-body .desc{
            color: #3F5563;
            display: inline;
        }
        .reminder-modal .modal-footer{
            padding: 0px;
            text-align: center;
        }
        .reminder-modal .modal-footer .btn{
            background-color: transparent;
            color: rgb(47, 141, 70);
            font-weight: bold;
            margin: 10px 0px;
        }
    </style>

    <div class="modal fade" id="reminderModal" tabindex="-1" role="dialog" aria-labelledby="reminderModal" aria-hidden="true" data-keyboard="false" data-backdrop="static">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center" role="document">
            <div class="modal-content reminder-modal contest-modal-content">
                <div class="modal-header contest-modal-header">
                    <div class="modal-header-bell"><img src="./Subarray_with_given_sum_files/noun-reminder-3408043-1645690548.svg"></div>
                </div>
                <div class="modal-body contest-modal-body">
                    <p class="heading">Reminder</p>
                    <p class="desc">Click on the menu '<img src="./Subarray_with_given_sum_files/Group6313-1645690441.svg">' button to finish the test.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn" id="reminderModalClose">OK</button>
                </div>
            </div>
        </div>
    </div>

    <script> 
         $(window).on('load', function() {
            let width = Math.max(document.documentElement.clientWidth || 0, window.innerWidth || 0);
            if(width <= 991 ){ 
                setTimeout(() => { $("#reminderModal").modal('show'); }, 500);
            }
        }); 
        $(document).on('click', "#reminderModalClose", function(e) {
            $("#reminderModal").modal('hide');
        })
        function escapeIllegalChars(val) {
            const regex = /[^A-Za-z0-9 -]/g;
            return val.replace(regex, "")
        }
    </script>

    <!-- Reminder Modal For Phone Ends-->

</div>
<!-- modal to acquire user details after contest got started -->
<div class="modal fade" id="acquireUserDataModal" role="dialog">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center" role="document">
            <div class="modal-content contest-modal-content">
                <div class="modal-header contest-modal-header">
                    <button type="button" class="close userModalCloseAction" data-dismiss="modal" style="color:black">×</button>
                    <h4 style="margin: 0;line-height: 1.42857143;"><strong> Submit your details for this contest </strong></h4>
                </div>
                <div class="modal-body">
                    <div class="invitation-div">
                        <form class="form-horizontal">
                            <div class="form-group" style="margin-bottom: 0px;">
                                <label class="control-label col-sm-3" for="email">Registered Email:</label>
                                <div class="col-sm-9">
                                    <h5 id="user-email" class="text--primary-dark"> </h5>
                                </div>
                            </div>
                            <div class="form-group required">
                                <label class="control-label col-sm-3" for="full-name">Name:</label>
                                <div class="col-sm-9">
                                    <input required="true" type="text" class="form-control" id="user-full-name" placeholder="Enter full name" name="full-name">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="control-label col-sm-3" for="contact-number">Contact Number:</label>
                                <div class="col-sm-3">
                                    <select id="user-country_calling_code" class="form-control show-tick" data-live-search="true"><option value="Afghanistan">Afghanistan : +93</option><option value="Aland Islands">Aland Islands : +358</option><option value="Albania">Albania : +355</option><option value="Algeria">Algeria : +213</option><option value="American Samoa">American Samoa : +1</option><option value="Andorra">Andorra : +376</option><option value="Angola">Angola : +244</option><option value="Anguilla">Anguilla : +1</option><option value="Antigua and Barbuda">Antigua and Barbuda : +1</option><option value="Argentina">Argentina : +54</option><option value="Armenia">Armenia : +374</option><option value="Aruba">Aruba : +297</option><option value="Australia">Australia : +61</option><option value="Austria">Austria : +43</option><option value="Azerbaijan">Azerbaijan : +994</option><option value="Bahamas">Bahamas : +1</option><option value="Bahrain">Bahrain : +973</option><option value="Bangladesh">Bangladesh : +880</option><option value="Barbados">Barbados : +1</option><option value="Belarus">Belarus : +375</option><option value="Belgium">Belgium : +32</option><option value="Belize">Belize : +501</option><option value="Benin">Benin : +229</option><option value="Bermuda">Bermuda : +1</option><option value="Bhutan">Bhutan : +975</option><option value="Bolivia">Bolivia : +591</option><option value="Bonaire, Saint Eustatius and Saba ">Bonaire, Saint Eustatius and Saba  : +599</option><option value="Bosnia and Herzegovina">Bosnia and Herzegovina : +387</option><option value="Botswana">Botswana : +267</option><option value="Brazil">Brazil : +55</option><option value="British Indian Ocean Territory">British Indian Ocean Territory : +246</option><option value="British Virgin Islands">British Virgin Islands : +1</option><option value="Brunei">Brunei : +673</option><option value="Bulgaria">Bulgaria : +359</option><option value="Burkina Faso">Burkina Faso : +226</option><option value="Burundi">Burundi : +257</option><option value="Cambodia">Cambodia : +855</option><option value="Cameroon">Cameroon : +237</option><option value="Canada">Canada : +1</option><option value="Cape Verde">Cape Verde : +238</option><option value="Cayman Islands">Cayman Islands : +1</option><option value="Central African Republic">Central African Republic : +236</option><option value="Chad">Chad : +235</option><option value="Chile">Chile : +56</option><option value="China">China : +86</option><option value="Christmas Island">Christmas Island : +61</option><option value="Cocos Islands">Cocos Islands : +61</option><option value="Colombia">Colombia : +57</option><option value="Comoros">Comoros : +269</option><option value="Cook Islands">Cook Islands : +682</option><option value="Costa Rica">Costa Rica : +506</option><option value="Croatia">Croatia : +385</option><option value="Cuba">Cuba : +53</option><option value="Curacao">Curacao : +599</option><option value="Cyprus">Cyprus : +357</option><option value="Czech Republic">Czech Republic : +420</option><option value="Democratic Republic of the Congo">Democratic Republic of the Congo : +243</option><option value="Denmark">Denmark : +45</option><option value="Djibouti">Djibouti : +253</option><option value="Dominica">Dominica : +1</option><option value="Dominican Republic">Dominican Republic : +1</option><option value="East Timor">East Timor : +670</option><option value="Ecuador">Ecuador : +593</option><option value="Egypt">Egypt : +20</option><option value="El Salvador">El Salvador : +503</option><option value="Equatorial Guinea">Equatorial Guinea : +240</option><option value="Eritrea">Eritrea : +291</option><option value="Estonia">Estonia : +372</option><option value="Ethiopia">Ethiopia : +251</option><option value="Falkland Islands">Falkland Islands : +500</option><option value="Faroe Islands">Faroe Islands : +298</option><option value="Fiji">Fiji : +679</option><option value="Finland">Finland : +358</option><option value="France">France : +33</option><option value="French Guiana">French Guiana : +594</option><option value="French Polynesia">French Polynesia : +689</option><option value="Gabon">Gabon : +241</option><option value="Gambia">Gambia : +220</option><option value="Georgia">Georgia : +995</option><option value="Germany">Germany : +49</option><option value="Ghana">Ghana : +233</option><option value="Gibraltar">Gibraltar : +350</option><option value="Greece">Greece : +30</option><option value="Greenland">Greenland : +299</option><option value="Grenada">Grenada : +1</option><option value="Guadeloupe">Guadeloupe : +590</option><option value="Guam">Guam : +1</option><option value="Guatemala">Guatemala : +502</option><option value="Guernsey">Guernsey : +44</option><option value="Guinea">Guinea : +224</option><option value="Guinea-Bissau">Guinea-Bissau : +245</option><option value="Guyana">Guyana : +592</option><option value="Haiti">Haiti : +509</option><option value="Honduras">Honduras : +504</option><option value="Hong Kong">Hong Kong : +852</option><option value="Hungary">Hungary : +36</option><option value="Iceland">Iceland : +354</option><option value="India">India : +91</option><option value="Indonesia">Indonesia : +62</option><option value="Iran">Iran : +98</option><option value="Iraq">Iraq : +964</option><option value="Ireland">Ireland : +353</option><option value="Isle of Man">Isle of Man : +44</option><option value="Israel">Israel : +972</option><option value="Italy">Italy : +39</option><option value="Ivory Coast">Ivory Coast : +225</option><option value="Jamaica">Jamaica : +1</option><option value="Japan">Japan : +81</option><option value="Jersey">Jersey : +44</option><option value="Jordan">Jordan : +962</option><option value="Kazakhstan">Kazakhstan : +7</option><option value="Kenya">Kenya : +254</option><option value="Kiribati">Kiribati : +686</option><option value="Kuwait">Kuwait : +965</option><option value="Kyrgyzstan">Kyrgyzstan : +996</option><option value="Laos">Laos : +856</option><option value="Latvia">Latvia : +371</option><option value="Lebanon">Lebanon : +961</option><option value="Lesotho">Lesotho : +266</option><option value="Liberia">Liberia : +231</option><option value="Libya">Libya : +218</option><option value="Liechtenstein">Liechtenstein : +423</option><option value="Lithuania">Lithuania : +370</option><option value="Luxembourg">Luxembourg : +352</option><option value="Macao">Macao : +853</option><option value="Macedonia">Macedonia : +389</option><option value="Madagascar">Madagascar : +261</option><option value="Malawi">Malawi : +265</option><option value="Malaysia">Malaysia : +60</option><option value="Maldives">Maldives : +960</option><option value="Mali">Mali : +223</option><option value="Malta">Malta : +356</option><option value="Marshall Islands">Marshall Islands : +692</option><option value="Martinique">Martinique : +596</option><option value="Mauritania">Mauritania : +222</option><option value="Mauritius">Mauritius : +230</option><option value="Mayotte">Mayotte : +262</option><option value="Mexico">Mexico : +52</option><option value="Micronesia">Micronesia : +691</option><option value="Moldova">Moldova : +373</option><option value="Monaco">Monaco : +377</option><option value="Mongolia">Mongolia : +976</option><option value="Montenegro">Montenegro : +382</option><option value="Montserrat">Montserrat : +1</option><option value="Morocco">Morocco : +212</option><option value="Mozambique">Mozambique : +258</option><option value="Myanmar">Myanmar : +95</option><option value="Namibia">Namibia : +264</option><option value="Nauru">Nauru : +674</option><option value="Nepal">Nepal : +977</option><option value="Netherlands">Netherlands : +31</option><option value="New Caledonia">New Caledonia : +687</option><option value="New Zealand">New Zealand : +64</option><option value="Nicaragua">Nicaragua : +505</option><option value="Niger">Niger : +227</option><option value="Nigeria">Nigeria : +234</option><option value="Niue">Niue : +683</option><option value="Norfolk Island">Norfolk Island : +672</option><option value="North Korea">North Korea : +850</option><option value="Northern Mariana Islands">Northern Mariana Islands : +1</option><option value="Norway">Norway : +47</option><option value="Oman">Oman : +968</option><option value="Pakistan">Pakistan : +92</option><option value="Palau">Palau : +680</option><option value="Palestinian Territory">Palestinian Territory : +970</option><option value="Panama">Panama : +507</option><option value="Papua New Guinea">Papua New Guinea : +675</option><option value="Paraguay">Paraguay : +595</option><option value="Peru">Peru : +51</option><option value="Philippines">Philippines : +63</option><option value="Pitcairn">Pitcairn : +870</option><option value="Poland">Poland : +48</option><option value="Portugal">Portugal : +351</option><option value="Puerto Rico">Puerto Rico : +1</option><option value="Qatar">Qatar : +974</option><option value="Republic of the Congo">Republic of the Congo : +242</option><option value="Reunion">Reunion : +262</option><option value="Romania">Romania : +40</option><option value="Russia">Russia : +7</option><option value="Rwanda">Rwanda : +250</option><option value="Saint Barthelemy">Saint Barthelemy : +590</option><option value="Saint Helena">Saint Helena : +290</option><option value="Saint Kitts and Nevis">Saint Kitts and Nevis : +1</option><option value="Saint Lucia">Saint Lucia : +1</option><option value="Saint Martin">Saint Martin : +590</option><option value="Saint Pierre and Miquelon">Saint Pierre and Miquelon : +508</option><option value="Saint Vincent and the Grenadines">Saint Vincent and the Grenadines : +1</option><option value="Samoa">Samoa : +685</option><option value="San Marino">San Marino : +378</option><option value="Sao Tome and Principe">Sao Tome and Principe : +239</option><option value="Saudi Arabia">Saudi Arabia : +966</option><option value="Senegal">Senegal : +221</option><option value="Serbia">Serbia : +381</option><option value="Seychelles">Seychelles : +248</option><option value="Sierra Leone">Sierra Leone : +232</option><option value="Singapore">Singapore : +65</option><option value="Sint Maarten">Sint Maarten : +599</option><option value="Slovakia">Slovakia : +421</option><option value="Slovenia">Slovenia : +386</option><option value="Solomon Islands">Solomon Islands : +677</option><option value="Somalia">Somalia : +252</option><option value="South Africa">South Africa : +27</option><option value="South Korea">South Korea : +82</option><option value="South Sudan">South Sudan : +211</option><option value="Spain">Spain : +34</option><option value="Sri Lanka">Sri Lanka : +94</option><option value="Sudan">Sudan : +249</option><option value="Suriname">Suriname : +597</option><option value="Svalbard and Jan Mayen">Svalbard and Jan Mayen : +47</option><option value="Swaziland">Swaziland : +268</option><option value="Sweden">Sweden : +46</option><option value="Switzerland">Switzerland : +41</option><option value="Syria">Syria : +963</option><option value="Taiwan">Taiwan : +886</option><option value="Tajikistan">Tajikistan : +992</option><option value="Tanzania">Tanzania : +255</option><option value="Thailand">Thailand : +66</option><option value="Togo">Togo : +228</option><option value="Tokelau">Tokelau : +690</option><option value="Tonga">Tonga : +676</option><option value="Trinidad and Tobago">Trinidad and Tobago : +1</option><option value="Tunisia">Tunisia : +216</option><option value="Turkey">Turkey : +90</option><option value="Turkmenistan">Turkmenistan : +993</option><option value="Turks and Caicos Islands">Turks and Caicos Islands : +1</option><option value="Tuvalu">Tuvalu : +688</option><option value="U.S. Virgin Islands">U.S. Virgin Islands : +1</option><option value="Uganda">Uganda : +256</option><option value="Ukraine">Ukraine : +380</option><option value="United Arab Emirates">United Arab Emirates : +971</option><option value="United Kingdom">United Kingdom : +44</option><option value="United States">United States : +1</option><option value="United States Minor Outlying Islands">United States Minor Outlying Islands : +1</option><option value="Uruguay">Uruguay : +598</option><option value="Uzbekistan">Uzbekistan : +998</option><option value="Vanuatu">Vanuatu : +678</option><option value="Vatican">Vatican : +379</option><option value="Venezuela">Venezuela : +58</option><option value="Vietnam">Vietnam : +84</option><option value="Wallis and Futuna">Wallis and Futuna : +681</option><option value="Western Sahara">Western Sahara : +212</option><option value="Yemen">Yemen : +967</option><option value="Zambia">Zambia : +260</option><option value="Zimbabwe">Zimbabwe : +263</option></select>
                                    <script src="./Subarray_with_given_sum_files/utils.js.download"></script>
                                    <script>getCountryCodeList(

{"Afghanistan":"+93","Aland Islands":"+358","Albania":"+355","Algeria":"+213","American Samoa":"+1","Andorra":"+376","Angola":"+244","Anguilla":"+1","Antigua and Barbuda":"+1","Argentina":"+54","Armenia":"+374","Aruba":"+297","Australia":"+61","Austria":"+43","Azerbaijan":"+994","Bahamas":"+1","Bahrain":"+973","Bangladesh":"+880","Barbados":"+1","Belarus":"+375","Belgium":"+32","Belize":"+501","Benin":"+229","Bermuda":"+1","Bhutan":"+975","Bolivia":"+591","Bonaire, Saint Eustatius and Saba ":"+599","Bosnia and Herzegovina":"+387","Botswana":"+267","Brazil":"+55","British Indian Ocean Territory":"+246","British Virgin Islands":"+1","Brunei":"+673","Bulgaria":"+359","Burkina Faso":"+226","Burundi":"+257","Cambodia":"+855","Cameroon":"+237","Canada":"+1","Cape Verde":"+238","Cayman Islands":"+1","Central African Republic":"+236","Chad":"+235","Chile":"+56","China":"+86","Christmas Island":"+61","Cocos Islands":"+61","Colombia":"+57","Comoros":"+269","Cook Islands":"+682","Costa Rica":"+506","Croatia":"+385","Cuba":"+53","Curacao":"+599","Cyprus":"+357","Czech Republic":"+420","Democratic Republic of the Congo":"+243","Denmark":"+45","Djibouti":"+253","Dominica":"+1","Dominican Republic":"+1","East Timor":"+670","Ecuador":"+593","Egypt":"+20","El Salvador":"+503","Equatorial Guinea":"+240","Eritrea":"+291","Estonia":"+372","Ethiopia":"+251","Falkland Islands":"+500","Faroe Islands":"+298","Fiji":"+679","Finland":"+358","France":"+33","French Guiana":"+594","French Polynesia":"+689","Gabon":"+241","Gambia":"+220","Georgia":"+995","Germany":"+49","Ghana":"+233","Gibraltar":"+350","Greece":"+30","Greenland":"+299","Grenada":"+1","Guadeloupe":"+590","Guam":"+1","Guatemala":"+502","Guernsey":"+44","Guinea":"+224","Guinea-Bissau":"+245","Guyana":"+592","Haiti":"+509","Honduras":"+504","Hong Kong":"+852","Hungary":"+36","Iceland":"+354","India":"+91","Indonesia":"+62","Iran":"+98","Iraq":"+964","Ireland":"+353","Isle of Man":"+44","Israel":"+972","Italy":"+39","Ivory Coast":"+225","Jamaica":"+1","Japan":"+81","Jersey":"+44","Jordan":"+962","Kazakhstan":"+7","Kenya":"+254","Kiribati":"+686","Kuwait":"+965","Kyrgyzstan":"+996","Laos":"+856","Latvia":"+371","Lebanon":"+961","Lesotho":"+266","Liberia":"+231","Libya":"+218","Liechtenstein":"+423","Lithuania":"+370","Luxembourg":"+352","Macao":"+853","Macedonia":"+389","Madagascar":"+261","Malawi":"+265","Malaysia":"+60","Maldives":"+960","Mali":"+223","Malta":"+356","Marshall Islands":"+692","Martinique":"+596","Mauritania":"+222","Mauritius":"+230","Mayotte":"+262","Mexico":"+52","Micronesia":"+691","Moldova":"+373","Monaco":"+377","Mongolia":"+976","Montenegro":"+382","Montserrat":"+1","Morocco":"+212","Mozambique":"+258","Myanmar":"+95","Namibia":"+264","Nauru":"+674","Nepal":"+977","Netherlands":"+31","New Caledonia":"+687","New Zealand":"+64","Nicaragua":"+505","Niger":"+227","Nigeria":"+234","Niue":"+683","Norfolk Island":"+672","North Korea":"+850","Northern Mariana Islands":"+1","Norway":"+47","Oman":"+968","Pakistan":"+92","Palau":"+680","Palestinian Territory":"+970","Panama":"+507","Papua New Guinea":"+675","Paraguay":"+595","Peru":"+51","Philippines":"+63","Pitcairn":"+870","Poland":"+48","Portugal":"+351","Puerto Rico":"+1","Qatar":"+974","Republic of the Congo":"+242","Reunion":"+262","Romania":"+40","Russia":"+7","Rwanda":"+250","Saint Barthelemy":"+590","Saint Helena":"+290","Saint Kitts and Nevis":"+1","Saint Lucia":"+1","Saint Martin":"+590","Saint Pierre and Miquelon":"+508","Saint Vincent and the Grenadines":"+1","Samoa":"+685","San Marino":"+378","Sao Tome and Principe":"+239","Saudi Arabia":"+966","Senegal":"+221","Serbia":"+381","Seychelles":"+248","Sierra Leone":"+232","Singapore":"+65","Sint Maarten":"+599","Slovakia":"+421","Slovenia":"+386","Solomon Islands":"+677","Somalia":"+252","South Africa":"+27","South Korea":"+82","South Sudan":"+211","Spain":"+34","Sri Lanka":"+94","Sudan":"+249","Suriname":"+597","Svalbard and Jan Mayen":"+47","Swaziland":"+268","Sweden":"+46","Switzerland":"+41","Syria":"+963","Taiwan":"+886","Tajikistan":"+992","Tanzania":"+255","Thailand":"+66","Togo":"+228","Tokelau":"+690","Tonga":"+676","Trinidad and Tobago":"+1","Tunisia":"+216","Turkey":"+90","Turkmenistan":"+993","Turks and Caicos Islands":"+1","Tuvalu":"+688","U.S. Virgin Islands":"+1","Uganda":"+256","Ukraine":"+380","United Arab Emirates":"+971","United Kingdom":"+44","United States":"+1","United States Minor Outlying Islands":"+1","Uruguay":"+598","Uzbekistan":"+998","Vanuatu":"+678","Vatican":"+379","Venezuela":"+58","Vietnam":"+84","Wallis and Futuna":"+681","Western Sahara":"+212","Yemen":"+967","Zambia":"+260","Zimbabwe":"+263"}, '#user-country_calling_code', null);</script>
                                </div>
                                <div class="col-sm-6">
                                    <input required="true" type="text" class="form-control" id="user-contact-number" placeholder="10-digit Mobile Number" name="contact-number">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="control-label col-sm-3" for="institution">Institute/Company:</label>
                                <div class="col-sm-9">
                                    <input required="true" type="text" class="form-control typeahead" id="user-institution" placeholder="College/Company Name" name="institution">
                                </div>
                            </div>
                            <p class="errorMsg" style="color:red">* All fields are mandatory.</p>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button id="submitUserDetails" class="btn user_details_submit">
                        Submit
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
<link rel="stylesheet" href="./Subarray_with_given_sum_files/contestDetails.css" type="text/css">

<div class="contest_home_main" style="display: none;">
    <div class="row" style="margin:0px">
        <div class="col-sm-3">
            <ul class="side_bar">
                <a class="back_to_course" id="back_to_course" href="https://practice.geeksforgeeks.org/batchPage.php?batchId=725"><svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-chevron-left" width="20" height="20" viewBox="0 0 24 24" stroke-width="1.5" stroke="#597e8d" fill="none" stroke-linecap="round" stroke-linejoin="round">
                        <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                        <polyline points="15 6 9 12 15 18"></polyline>
                    </svg>
                    Back to Course</a>

                <li class="side_tab active" data-id="instructions">
                    Instructions
                </li>
                <li class="side_tab" data-id="leaderboard">
                    Leaderboard
                </li>
                <li class="side_tab" data-id="summary">
                    Summary
                </li>

            </ul>
        </div>
        <div class="col-sm-8">
        <div class="contest_home_instructions" style="">
    <div class="instructions_div">
        <div class="card">
            <div class="row contest_instructions_name" style="display:flex;align-items:center;padding:16px;overflow: hidden;position: relative;">
                <div class="col-sm-8">
                    <div class="card-body"><div class="card-title">
                            Day 5 | Sliding Window | DSA Bootcamp<span class="contest_live_tag">Live</span>
                        </div>
                        <div class="card-desc"><p>Welcome Geeks,</p>

<p>This is the<strong>&nbsp;fifth&nbsp;contest </strong>of Geek Week. In this contest, you'll solve questions on topics&nbsp;Sliding Window<strong>. </strong>The contest contains <strong>3&nbsp;programming</strong> questions.</p>

<p>Good Luck!</p></div></div>
                </div>
                <div class="col-sm-4 card-meta" style="background-color: #F1F9F6;position: absolute;height: 100%;right: 0;display: flex;flex-direction: column;justify-content: space-evenly;"><div><img class="contest_home_meta_icon" src="./Subarray_with_given_sum_files/Group4904-1610361147.svg">
              <b>3 Questions</b>
          </div>
          <div><img class="contest_home_meta_icon" src="./Subarray_with_given_sum_files/Group4905-2-1610361262.svg">
              <b>100 Marks</b>
          </div><div>
                    <img class="contest_home_meta_icon" src="./Subarray_with_given_sum_files/Group4905-1-1610362237.svg">
                    <b>
                    90 Minutes</b>
                </div></div>
            </div>
        </div>
        <div class="instructions_div instruction_prizes" style="text-align:left"><h2 class="contest-home__heading">Instructions for the Contest </h2>
        <div class="contest-home__desc"><ul>
	<li>Any type of <strong>plagiarism </strong>will not be entertained. In case, anyone is found <strong>guilty</strong>, the score of the concerned participants will be <strong>dropped to 0</strong>.</li>
	<li>The marks for the different questions are 20, 30 or&nbsp;50. There is <strong>5% penalty</strong> (on maximum marks) for each wrong submission. For example, if a problem is of 100 marks and a participant makes a wrong submission, the new maximum marks for that participant are reduced to 95. After next wrong submission of the same problem, the new maximum marks are further reduced to 90.25 and so on. So, it is suggested to use <strong>'Compile &amp; Test'</strong> against sample test cases. option before each submission.</li>
	<li>Languages supported for the contest are:&nbsp;C++, Java, Python, JavaScript</li>
	<li>
	<p><strong>Note: </strong>Make sure other participants don't have access to your code. In case you are using any other online coding environment, you are responsible for the privacy of your code</p>
	</li>
	<li>
	<p><strong>&nbsp;</strong>It is advised to attempt the <strong><a href="https://practice.geeksforgeeks.org/contest/sample-geeks-challenge/">Sample Geeks Challenge</a></strong><strong> </strong> to get familiar with the GeeksforGeeks coding environment</p>
	</li>
</ul>

<p><strong>NOTE</strong> : Make sure to attend the post analysis of these problems by clicking on this<strong> <a href="https://us02web.zoom.us/meeting/register/tZ0rdOqgqzIqGNLfxNNJS6MP7m00cHiCzCL7" target="_blank">zoom link</a></strong>&nbsp;on&nbsp;Oct 9, 2022 at 07:00 PM where our experts will solve and explain the solutions for the problems asked in this&nbsp;contest.</p></div></div>
    </div>
    
    <div class="quiz_div" style="text-align:left">
    </div>
    <div class="home_problem_div" style="text-align:left;margin-bottom:7rem;"><h2 class="contest-home__heading">Coding Problem Details</h2>
          <div class="contest-home__desc">Solve as many problem(s) as you can before the time runs out and based on the accuracy of your correct submission you will get the scores.</div>
          <div class="row contest-home__metadiv">
              <div class="col-md-6 col-xs-12">
                  <div class="row">
                      <div class="contest-home__meta col-md-6"><img class="contest_home_meta_icon" src="./Subarray_with_given_sum_files/Group4906-1610361204.svg">3
                          Questions</div>
                      <div class="contest-home__meta col-md-6"><img class="contest_home_meta_icon" src="./Subarray_with_given_sum_files/Group4905-2-1610361262.svg">100
                          Marks</div>
                  </div>
              </div>
              <div class="col-md-6 col-xs-12">
                  <button class="btn contest-home__button view_contest_problems">Solve Problems</button>
              </div>
          </div></div>
    <div class="text-center contest-report-issue" style="margin-top: 50px;">
    <button id="reportIssueContestBtn" type="button" class="btn btn-warning btn-sm" style="font-size:12px;border-radius:0.3rem;" data-target="#reportIssue" data-toggle="modal" onclick="gtagHelperFunction(&#39;clickopen&#39;,&#39;reportIssueContestBtn&#39;)" utoken="292018650810028845366013">
        <i class="fa fa-bug" aria-hidden="true"></i> 
        Report An Issue
    </button>
    <br><small>If you are facing any issue on this page. Please let us know.</small>
    </div><br>
</div>
<div class="contest_home_summary" style="display:none;">
    <div id="contest_home_summary_loader">
      <svg xmlns="http://www.w3.org/2000/svg" width="76.533" height="39.026" viewBox="0 0 76.533 39.026">
        <path d="M2380.7,6597.866a12.252,12.252,0,0,0-.261-1.513l-30.726-.027a12.545,12.545,0,0,1,.908-3.443,12.337,12.337,0,0,1,2.739-4.044,12.151,12.151,0,0,1,4.018-2.581,12.634,12.634,0,0,1,14.3,3.051l4.852-4.748a18.176,18.176,0,0,0-6.131-4.331,20.037,20.037,0,0,0-8.112-1.564,20.25,20.25,0,0,0-7.671,1.459,19.158,19.158,0,0,0-6.261,4.07,19.584,19.584,0,0,0-4.226,6.184,18.7,18.7,0,0,0-1.487,5.947h-.2a18.674,18.674,0,0,0-1.489-5.947,19.544,19.544,0,0,0-4.226-6.184,19.133,19.133,0,0,0-6.261-4.07,21.354,21.354,0,0,0-15.783.1,18.2,18.2,0,0,0-6.131,4.331l4.853,4.748a13.264,13.264,0,0,1,14.3-3.051,12.131,12.131,0,0,1,4.017,2.581,12.323,12.323,0,0,1,2.74,4.044,12.527,12.527,0,0,1,.908,3.443l-30.726.027a12.256,12.256,0,0,0-.261,1.513,15,15,0,0,0-.1,1.773,20.713,20.713,0,0,0,1.1,6.783,15.709,15.709,0,0,0,3.443,5.686,17.309,17.309,0,0,0,6,4.123,20.587,20.587,0,0,0,7.983,1.46,20.226,20.226,0,0,0,7.669-1.46,19.086,19.086,0,0,0,6.261-4.07,19.506,19.506,0,0,0,4.226-6.184,18.163,18.163,0,0,0,1.153-3.629h.871a18.27,18.27,0,0,0,1.151,3.629,19.545,19.545,0,0,0,4.226,6.184,19.111,19.111,0,0,0,6.261,4.07,20.241,20.241,0,0,0,7.671,1.46,20.572,20.572,0,0,0,7.981-1.46,17.282,17.282,0,0,0,6-4.123,15.717,15.717,0,0,0,3.445-5.686,20.726,20.726,0,0,0,1.1-6.783A15.259,15.259,0,0,0,2380.7,6597.866Zm-46.245,5.608a12.1,12.1,0,0,1-2.766,4.043,12.467,12.467,0,0,1-4.043,2.583,14.378,14.378,0,0,1-9.939.052,11.776,11.776,0,0,1-3.522-2.218,8.459,8.459,0,0,1-1.8-2.374,13.476,13.476,0,0,1-1.173-3.208l23.658,0A11.487,11.487,0,0,1,2334.457,6603.475Zm38.236,2.086a8.466,8.466,0,0,1-1.8,2.374,11.771,11.771,0,0,1-3.522,2.218,14.378,14.378,0,0,1-9.939-.052,12.491,12.491,0,0,1-4.044-2.583,12.088,12.088,0,0,1-2.765-4.043,11.427,11.427,0,0,1-.415-1.126h11.92v0h11.739A13.509,13.509,0,0,1,2372.692,6605.561Z" transform="translate(-2304.273 -6578.666)" fill="#2f8d46"></path>
      </svg>
    </div>
    <div class="contest_home_summary_attempt"></div>
    <div class="contest_home_summary_data">
        <div class="main-header">
            <div class="row summary_card">
                <div class="summary_image col-lg-3 col-md-3 col-sm-6 col-xs-6 " style="height:100%">
                    <div class="ellipse-first">
                        <img class="profile-image">
                    </div>
                </div>

                <div class="summary_details col-sm-6 col-xs-6 col-md-3 col-lg-3">
                    <p class="full-name">
                    </p>
                    <p class="handle">
                        
                    </p>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-6 summary_data col-md-offset-2 col-lg-offset-2 ">
                    
                    <div class="details-card coding_score" align="center">
                        <img src="./Subarray_with_given_sum_files/Problems-1605774989.svg">
                        <div class="wrapper" style="display: flex;flex-direction: row;justify-content: center;align-items: center;">
                            <p class="performance" id="total_coding_score">
                                </p><p id="plag_text" style="color:white;margin-left:4px;display:none;" class="fa fa-info-circle coding-score-plag-summary-tooltip"></p>
                                <p class="coding-plag-message-summary">Coding problem score has been deducted due to plagiarism.</p>
                        </div>
                        <p class="cat-name">CODING<br> SCORE</p>
                    </div>
                    <div class="details-card rank_card_summary" align="center">
                        <img src="./Subarray_with_given_sum_files/Group4903-1611739248.svg">
                        <p class="performance" id="total_rank">0</p>
                        <p class="cat-name">RANK</p>
                    </div>

                </div>
            </div>
            <div class="summary_page_messages">
                <ul>
                    <li class="fixed_contest_summary_msg" style="display: none;"> </li>
                    <li class="get-contest-details-message" style="display: none;"> </li>
                </ul>
            </div>
        </div>
        <h2 class="summary_title row">Performance Overview</h2>
        <div class="row performance_wrapper">
            <div class="col-md-3 col-xs-6 summary_meta_data_div">
                <div class="summary_subtitle">Score</div>
                <div class="summary_subdata">
                    Your Score<br>
                    <span class="summary_score summary_points">0 Points</span><br>
                    <span class="summary_score_meta summary_points_meta">24 points Higher than
                        Average</span>
                </div>
            </div>
            <div class="col-md-3 col-xs-6 summary_meta_data_div summary_time_taken_div">
                <div class="summary_subtitle">Time Taken</div>
                <div class="summary_subdata">
                    Your Time<br>
                    <span class="summary_time summary_points">1 Hr 30 Min</span><br>
                    <span class="summary_time_meta summary_points_meta">30 Mins Better than Average</span>
                </div>
            </div>
            <div class="col-md-3 col-xs-6 summary_meta_data_div summary_problem_solved_count_div">
                <div class="summary_subtitle">Number of Problems</div>
                <div class="summary_subdata">
                    Problems Solved<br>
                    <span class="summary_solved summary_points">3 Problems</span><br>
                    <span class="summary_solved_meta summary_points_meta">0 more than Average</span>
                </div>
            </div>
            <div class="col-md-3 col-xs-6 summary_meta_data_div geek_bits_div">
                <div class="summary_subtitle">Geek Bits Earned</div>
                <div class="summary_subdata">
                    Your Geek Bits<br>
                    <div>
                    <img src="./Subarray_with_given_sum_files/Group5066-1653280576.svg" style="width:4rem;">
                    <span class="summary_geek_bits summary_points" style="padding-top: 2em">2 Geek Bits</span><br></div>
                </div>
            </div>
        </div>
        <div class="row summary_charts">
            <div class="accuracy_chart">
                <h2 class="summary_title">Accuracy Comparison</h2>
                <div id="accuracyChart">
                </div>
            </div>
            <div class="attempts_chart">
                <h2 class="summary_title">All Attempts Summary</h2>
                <div id="allAttempts">
                </div>
            </div>
            <div class="first_attempt">
                <h2 class="summary_title">First Attempt Comparison</h2>
                <div id="scoreChart">
                </div>
            </div>
            <div class="time_chart" style="margin-bottom: 20rem;">
                <h2 class="summary_title">Average Time vs. Time taken by You</h2>
                <div id="timeChart">
                </div>
            </div>
            <script type="text/javascript" src="./Subarray_with_given_sum_files/loader.js.download"></script>
            <script src="./Subarray_with_given_sum_files/contestGraph.js.download"></script>
        </div>
    </div>
</div>
<style>
.coding-plag-message-summary{
    font-size: 12px;
    background-color: black;
    border-radius: 4px;
    padding: 10px;
    color: white;
    width: 200px;
    position: absolute;
    z-index: 100;
    margin: 10px 0px;
    display: none;
}

.coding-score-plag-summary-tooltip:hover + .coding-plag-message-summary, .coding-plag-message-summary:hover{
    display: block;
}


.coding-score-plag-summary-tooltip{
    font-size: 20px;
    cursor: pointer;
}
</style>
<div class="contest_home_leaderboard" style="display:none">
    <div id="contest_home_leaderboard_loader" class="loading-dots">
        <div class="loading-dots--dot"></div>
        <div class="loading-dots--dot"></div>
        <div class="loading-dots--dot"></div>
    </div>
    <div class="container contest_home_leaderboard_cover" style="width:100%;display:none;">

        <div style="display: flex; justify-content: space-between; width: 100%; margin-top: 4rem;">
            <div class="contest_leaderboard__heading">Contest Leaderboard</div>
            <div class="row contest_leaderboard_actions">
                <div class="col-xs-5 contest_leaderboard__refresh-button">
                    <button type="button" class="btn btn-default btn-sm">
                        <span class="glyphicon glyphicon-refresh"></span> Refresh
                    </button>
                </div>
                <div class="col-xs-7 contest_leaderboard_ranking_type_container">
                    <div class="dropdown bootstrap-select form-control bs3"><select id="contest_leaderboard_ranking_type" class="selectpicker form-control" data-icon-base="fas" tabindex="-98">
                        <option value="overall">Overall</option>
                        <option value="current" selected="">Current</option>
                    </select><button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" role="button" data-id="contest_leaderboard_ranking_type"><div class="filter-option"><div class="filter-option-inner"><div class="filter-option-inner-inner">Current</div></div> </div><span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open" role="combobox" style="max-height: 552px; overflow: hidden; min-height: 0px;"><div class="inner open" role="listbox" aria-expanded="false" tabindex="-1" style="max-height: 540px; overflow-y: auto; min-height: 0px;"><ul class="dropdown-menu inner "><li><a role="option" aria-disabled="false" tabindex="0" aria-selected="false"><span class="text">Overall</span></a></li><li class="selected active"><a role="option" aria-disabled="false" tabindex="0" class="selected active" aria-selected="true"><span class="text">Current</span></a></li></ul></div></div></div>
                </div>
            </div>

        </div>
        <small class="currentMsg" style="color: red;font-size: 14px;">*Results gets refreshed every 10 minutes.</small>
        <table class="table leaderboard-rankings-table">
        </table>
        <br>
        <div class="row-text-center pages">

        </div>
    </div>
</div>
        </div>
    </div>
</div>


<div class="coding_problems_main" style="">
    <link rel="stylesheet" href="./Subarray_with_given_sum_files/contestCodingPage.css">
<link href="./Subarray_with_given_sum_files/select2.css" rel="stylesheet">
<script src="./Subarray_with_given_sum_files/select2.js.download"></script>
<script>
    var practiceApiHost = 'https://practiceapi.geeksforgeeks.org/api/v1/';
    var practiceApiOriginHost = 'https://practiceapiorigin.geeksforgeeks.org/api/v1/';
    var baseurl = 'https://practice.geeksforgeeks.org';
    var contestSlug = 'day-5-sliding-window-dsa-bootcamp';
    var URLS3 = "https://media.geeksforgeeks.org/";
</script>

<div class="problem-sub-container problem-landing" style="display: none;">
    <div class="left-list">
        <div class="head-score">
            <p class="all-problem">
                All Problems
            </p>
            
        </div>
        <div class="card-list">
         <div class="problem-list-card">
                  <div class="card-content">
                      <div class="problem-details">
                          <p class="question-title pclass712310">
                              Subarray with given sum&nbsp;&nbsp;
                              <img class="sign" src="./Subarray_with_given_sum_files/Correct-1614749231.svg">
                          </p>
                          <div class="sub-accuracy">
                              <div class="sub-div">
                                  <p class="submission">
                                      Submission: <strong class="sub-count">367</strong>
                                  </p>
                              </div>
                              <div class="acc-div">
                                  <p class="accuracy">
                                      Accuracy: <strong class="sub-count"> 34.05%</strong>
                                  </p>
                              </div>
                          </div>
                      </div>
                      <div class="max-score-solve">
                          <p class="max-marks">
                              Max Marks: <strong class="marks"> 20</strong>
                          </p>
                      <button class="btn btn-success solve" id="0">Solve</button>
                      </div>
                  </div>
              </div>
               <div class="problem-list-card">
                  <div class="card-content">
                      <div class="problem-details">
                          <p class="question-title pclass712311">
                              Count distinct elements in every window&nbsp;&nbsp;
                              
                          </p>
                          <div class="sub-accuracy">
                              <div class="sub-div">
                                  <p class="submission">
                                      Submission: <strong class="sub-count">171</strong>
                                  </p>
                              </div>
                              <div class="acc-div">
                                  <p class="accuracy">
                                      Accuracy: <strong class="sub-count"> 71.97%</strong>
                                  </p>
                              </div>
                          </div>
                      </div>
                      <div class="max-score-solve">
                          <p class="max-marks">
                              Max Marks: <strong class="marks"> 30</strong>
                          </p>
                      <button class="btn btn-success solve" id="1">Solve</button>
                      </div>
                  </div>
              </div>
               <div class="problem-list-card">
                  <div class="card-content">
                      <div class="problem-details">
                          <p class="question-title pclass712312">
                              Substrings of length k with k-1 distinct elements&nbsp;&nbsp;
                              <img class="sign" src="./Subarray_with_given_sum_files/Correct-1614749231.svg">
                          </p>
                          <div class="sub-accuracy">
                              <div class="sub-div">
                                  <p class="submission">
                                      Submission: <strong class="sub-count">148</strong>
                                  </p>
                              </div>
                              <div class="acc-div">
                                  <p class="accuracy">
                                      Accuracy: <strong class="sub-count"> 79.03%</strong>
                                  </p>
                              </div>
                          </div>
                      </div>
                      <div class="max-score-solve">
                          <p class="max-marks">
                              Max Marks: <strong class="marks"> 50</strong>
                          </p>
                      <button class="btn btn-success solve" id="2">Solve</button>
                      </div>
                  </div>
              </div>
              </div>
        <div class="symbol-explaian">
            <ul style="list-style-type: none;">
                <li class="correct">
                    <img class="img-responsive sign" src="./Subarray_with_given_sum_files/Correct-1614749231.svg">
                    <p> Solution Accepted</p>
                </li>
                <!--Currently we don't have partial submissions but we can uncomment it in future  --->
                <!-- <li class="partial">
                    <img class="img-responsive sign"
                        src="https://media.geeksforgeeks.org/img-practice/Partial-1614749368.svg">
                    <p> Partially Solved</p>
                </li> -->
                <li class="wrong">
                    <img class="img-responsive sign" src="./Subarray_with_given_sum_files/incorrect-1614749297.svg">
                    <p> Wrong Answer</p>
                </li>
            </ul>
        </div>
    </div>
    <div class="right-submission">
        <div id="cLoader" class="loading-dots" style="height: 100vh; display: none;">
            <div class="loading-dots--dot verticle-center"></div>
            <div class="loading-dots--dot verticle-center"></div>
            <div class="loading-dots--dot verticle-center"></div>
        </div>
        <div class="submission-details" style="display: block;">

            <div class="top-header">
                <div class="heading">
                    <p>Submissions</p>
                </div>
                <div class="dropdown">
                    <select id="submissionType" data-select2-id="select2-data-submissionType" tabindex="-1" class="select2-hidden-accessible" aria-hidden="true">

                    <option value="allsubmission" data-select2-id="select2-data-6-ku5w"> All Submissions </option><option value="mysubmission"> My Submissions </option></select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="select2-data-4-me9o" style="width: auto;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-disabled="false" aria-labelledby="select2-submissionType-container" aria-controls="select2-submissionType-container"><span class="select2-selection__rendered" id="select2-submissionType-container" role="textbox" aria-readonly="true"> All Submissions </span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                    <div class="submission-status" style="display:inline;">
                        <select class="status select2-hidden-accessible" id="status" data-select2-id="select2-data-status" tabindex="-1" aria-hidden="true">
                            <option value="" data-select2-id="select2-data-2-myri">Select Status</option>
                            <option value="1">Correct</option>
                            <option value="0">Wrong</option>
                        </select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="select2-data-1-te38" style="width: auto;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-disabled="false" aria-labelledby="select2-status-container" aria-controls="select2-status-container"><span class="select2-selection__rendered" id="select2-status-container" role="textbox" aria-readonly="true">Select Status</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                        </div>
                    <select id="problem" data-select2-id="select2-data-problem" tabindex="-1" class="select2-hidden-accessible" aria-hidden="true">
                    <option value="712310" data-select2-id="select2-data-5-d7kc">Subarray with given sum</option><option value="712311">Count distinct elements in every window</option><option value="712312">Substrings of length k with k-1 distinct elements</option></select><span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="select2-data-3-93rk" style="width: auto;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-disabled="false" aria-labelledby="select2-problem-container" aria-controls="select2-problem-container"><span class="select2-selection__rendered" id="select2-problem-container" role="textbox" aria-readonly="true">Subarray with given sum</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                    <button class="reload_submissions select2-container"><svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-refresh" width="28" height="28" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" fill="none" stroke-linecap="round" stroke-linejoin="round">
                            <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                            <path d="M20 11a8.1 8.1 0 0 0 -15.5 -2m-.5 -4v4h4"></path>
                            <path d="M4 13a8.1 8.1 0 0 0 15.5 2m.5 4v-4h-4"></path>
                        </svg></button>
                </div>
            </div>
            <div class="no-sub-img" align="center" style="display: none;">
                <img class="img-responsive no-sub-comp" src="./Subarray_with_given_sum_files/Group4933-1613715111.svg">
                <img class="img-responsive no-sub-text" src="./Subarray_with_given_sum_files/oops-1613715851.png">
            </div>
            <div class="sub-table-div" id="sub-table-div">
                <table>
                    <thead>
                        <tr>
                            <th>Username</th>
                            <th>Status</th>
                            <th>Language</th>
                            <th>Exec Time</th>
                            <th>Submission Time</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody class="submission-table-landing">
                    </tbody>
                </table>
                <div id="sub-loader" class="sub-loader" style="display: none">
                    <i class="fa fa-spin fa-spinner fa-2x"> </i>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="problem-container" style="display: flex;">
    <div class="leftSide">
        <div class="container-left">
            <ul class="nav nav-tabs problem-menu-tabs active">
                <li class="active nav-tabs__problem">
                    <a data-toggle="tab" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#problems"><span class="problem-icon"></span>Problem</a>
                </li>
                <li class="nav-tabs__my-submissions">
                    <a data-toggle="tab" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#submission"> <span class="submission-icon"></span> Submissions </a>
                </li>
            </ul>
            <div class="back-to-all">
                <a class="back-problem" href="JavaScript:void(0)">
                    <img src="./Subarray_with_given_sum_files/back-1614749268.svg" class="img-responsive"> All
                    Problems
                </a>
            </div>
            <div class="tab-content problem-menu-content">

                <div id="problems" class="tab-pane fade in active problem-tab">
                    <div class="problem-intro">
                        <div class="row problem-intro__row">
                            <span class="problem-tab__name">Subarray with given sum</span>
                        </div>
                        <div class="row problem-meta-summary">
                            <strong class="problem-tab__problem-level">
                            </strong>
                            <span class="problem-tab__problem-accuracy">
                                <span class="problem-tab__key">Accuracy:</span>
                            <span class="problem-tab__value"> 34.05%</span></span>
                            <span class="problem-tab__problem-total-submissions">
                                <span class="problem-tab__key"> Submissions:</span>
                            <span class="problem-tab__value"> 367 </span> </span>
                            <span class="problem-tab__problem-points">
                                <span class="problem-tab__key"> Points:</span>
                            <span class="problem-tab__value"> 20</span></span>
                        </div>
                        <hr style="margin-top: 10px;">
                    </div>
                    <div class="problem-statement"><p><span style="font-size:18px">Given an unsorted array <strong>A </strong>of size <strong>N</strong> that contains only&nbsp;non-negative integers, find a continuous sub-array which adds to a given number <strong>S</strong>.</span></p>

<p><span style="font-size:18px">In case of multiple subarrays, return the subarray which comes first on moving from left to right.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5, S = 12
A[] = {1,2,3,7,5}
<strong>Output: </strong>2 4<strong>
Explanation: </strong>The sum of elements 
from 2nd position to 4th position 
is 12.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
<strong>Output: </strong>1 5<strong>
Explanation: </strong>The sum of elements 
from 1st position to 5th position
is 15.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. The task is to complete the function <strong>subarraySum</strong>() which takes arr, N and S as input parameters and returns an <strong>arraylist&nbsp;</strong>containing the&nbsp;<strong>starting </strong>and <strong>ending </strong>positions&nbsp;of the&nbsp;first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting only one element that is -1.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">1 &lt;= A</span><sub>i</sub><span style="font-size:18px"> &lt;= 10<sup>9</sup></span></p>

<p>&nbsp;</p>
</div>
                </div>
                <div id="submission" class="tab-pane fade">
                    <div id="mySubmissions">
                        <div class="row">
                            <h4 style="padding:5px;border-bottom:2px solid #c2b9b9;"> My Submissions:</h4>

                            <small style="cursor:pointer; padding:10px;" class="pull-right" id="latestSubmission">
                                <span id="latestSubmissionIcon">
                                    <i class="fa fa-refresh" aria-hidden="true"></i>
                                </span>
                                Refresh
                            </small>
                            <div class="my-submissions-list to-be-fetched col-sm-12">
                                <div class="table-responsive table-bordered">
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th>Time <small>(IST)</small> </th>
                                                <th>Status</th>
                                                <th>Lang</th>
                                                <th>Code</th>
                                            </tr>
                                        </thead>
                                        <tbody class="submission-list-body"></tbody>
                                    </table>
                                </div>
                                <h4 class="no-sub" style="display: none;"> No Submission Found. </h4>
                                <h3 class="text-center"><i class="fa fa-spinner fa-pulse fa-4x"></i> </h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div id="outputBlock" style="display: none;">
                <div class="outputBlock-header">
                    <div class="outputBlock-header-title">
                        <h4>Output Window</h4>
                    </div>
                    <div class="outputBlock-header-icons pull-right">
                        <a class="output-maximize" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" style="display:none;"><img src="./Subarray_with_given_sum_files/maximize-1603058844.svg"></a>
                        <a class="output-minimize" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#"><img src="./Subarray_with_given_sum_files/minimize-1603060113.svg"></a>
                        <a class="output-modal-open" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#"><img src="./Subarray_with_given_sum_files/enter_modal-1603060983.svg"></a>
                        <a class="output-modal-close" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" style="display:none;"><img src="./Subarray_with_given_sum_files/exit_modal-1603061157.svg"></a>
                        <a class="output-close" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" data-dismiss="modal"><img src="./Subarray_with_given_sum_files/output_window_close-1603060405.svg"></a>
                    </div>
                </div>
                <div class="out">
                    <pre></pre>
                </div>
            </div>
            <div class="modal fade" id="outputModal">
                <div class="modal-dialog ">
                    <div class="modal-content outputModal-content" style="max-height:80vh; overflow-y:auto">
                <div class="outputBlock-header">
                    <div class="outputBlock-header-title">
                        <h4>Output Window</h4>
                    </div>
                    <div class="outputBlock-header-icons pull-right">
                        <a class="output-maximize" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" style="display:none;"><img src="./Subarray_with_given_sum_files/maximize-1603058844.svg"></a>
                        <a class="output-minimize" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#"><img src="./Subarray_with_given_sum_files/minimize-1603060113.svg"></a>
                        <a class="output-modal-open" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#"><img src="./Subarray_with_given_sum_files/enter_modal-1603060983.svg"></a>
                        <a class="output-modal-close" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" style="display:none;"><img src="./Subarray_with_given_sum_files/exit_modal-1603061157.svg"></a>
                        <a class="output-close" href="https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/problems/#" data-dismiss="modal"><img src="./Subarray_with_given_sum_files/output_window_close-1603060405.svg"></a>
                    </div>
                </div>
                <div class="out">
                    <pre></pre>
                </div>
            </div>
                </div>
            </div>
        </div>
    </div>
    <div class="slider">
        <img src="./Subarray_with_given_sum_files/slider-icon-1605160260.svg" style="width: 5px">
    </div>
    <div class="editor-mobile">
        <!----- right part ----------->
        <div class="container-right">
            <div id="sampleTestCases" style="display:none"></div>
            <div class="header-editor">
                <div class="left-div">
                    <div class="dropdown bootstrap-select bs3"><select id="languageDropdown" class="selectpicker" tabindex="-98"><option value="javascript"> Javascript (Node v12.19.0)</option><option value="csharp"> C#</option><option value="python3"> Python3</option><option value="java"> Java (1.8)</option><option value="cpp"> C++ (g++ 5.4)</option></select><button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" role="button" data-id="languageDropdown"><div class="filter-option"><div class="filter-option-inner"><div class="filter-option-inner-inner">Java (1.8)</div></div> </div><span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open" role="combobox" style="max-height: 486px; overflow: hidden; min-height: 92px;"><div class="inner open" role="listbox" aria-expanded="false" tabindex="-1" style="max-height: 474px; overflow-y: auto; min-height: 80px;"><ul class="dropdown-menu inner "><li><a role="option" aria-disabled="false" tabindex="0" aria-selected="false"><span class="text"> Javascript (Node v12.19.0)</span></a></li><li><a role="option" aria-disabled="false" tabindex="0" aria-selected="false"><span class="text"> C#</span></a></li><li><a role="option" aria-disabled="false" tabindex="0" aria-selected="false"><span class="text"> Python3</span></a></li><li><a role="option" aria-disabled="false" tabindex="0" aria-selected="false"><span class="text"> Java (1.8)</span></a></li><li class="selected active"><a role="option" aria-disabled="false" tabindex="0" class="selected active" aria-selected="true"><span class="text"> C++ (g++ 5.4)</span></a></li></ul></div></div></div>
                </div>
                <div class="center-div">
                    <span>Test against custom input</span>
                    <input type="checkbox" id="customInputCheckbox" class="switch-input">
                    <label for="customInputCheckbox" class="switch-label"></label>
                </div>
                <div class="right-div">
                    <a id="darkTheme" style="display:none;">
                        <img src="./Subarray_with_given_sum_files/dark-1600972274.svg">
                    </a>
                    <a id="lightTheme" style="">
                        <img src="./Subarray_with_given_sum_files/light-1600972290.svg">
                    </a>
                    <a id="resetEditor">
                        <img src="./Subarray_with_given_sum_files/reset_code-1600545606.svg">
                    </a>
                    <a id="zoom" href="javascript:void(0)">
                        <img src="./Subarray_with_given_sum_files/full_screen-1600545500.svg">
                    </a>
                </div>
            </div>
            <div id="editor" class="editor editor-block ace_editor ace-dracula ace_dark"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; font-size: 1px; height: 1px; width: 1px; top: 0px; left: 0px;"></textarea><div class="ace_gutter" aria-hidden="true" style="left: 0px; width: 51px;"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="height: 1e+06px; top: -99px; left: 0px; width: 51px;"><div class="ace_gutter-cell " style="height: 19px; top: 95px;">34<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 114px;">35<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 133px;">36<span style="display: inline-block; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 152px;">37<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 171px;">38<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 190px;">39<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 209px;">40<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 228px;">41<span style="display: inline-block; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 247px;">42<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 266px;">43<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 285px;">44<span style="display: inline-block; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 304px;">45<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 323px;">46<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 342px;">47<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 361px;">48<span style="display: inline-block; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 380px;">49<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 399px;">50<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 418px;">51<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 437px;">52<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 456px;">53<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 475px;">54<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 494px;">55<span style="display: none; height: 19px;" class="ace_fold-widget ace_start ace_closed"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 513px;">56<span style="display: none; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div></div></div><div class="ace_scroller" style="left: 51px; right: 7px; bottom: 0px; cursor: default;"><div class="ace_content" style="top: -4px; left: 0px; width: 753px; height: 431px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 708px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_selection ace_br1 ace_start" style="height: 19px; right: 0px; top: 0px; left: 4px;"></div><div class="ace_selection ace_br12" style="height: 19px; width: 0px; top: 418px; left: 4px;"></div><div class="ace_selection ace_br8" style="height: 399px; right: 0px; top: 19px; left: 4px;"></div></div><div class="ace_layer ace_text-layer" style="height: 1e+06px; margin: 0px 4px; top: -95px; left: 0px;"><div class="ace_line" style="height: 19px; top: 95px;">    <span class="ace_comment">//Function to find a continuous sub-array which adds up to a given number.</span></div><div class="ace_line" style="height: 19px; top: 114px;">    <span class="ace_keyword">static</span> <span class="ace_identifier">ArrayList</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_support ace_function">Integer</span><span class="ace_keyword ace_operator">&gt;</span> <span class="ace_identifier">subarraySum</span>(<span class="ace_keyword">int</span>[] <span class="ace_identifier">arr</span>, <span class="ace_keyword">int</span> <span class="ace_identifier">n</span>, <span class="ace_keyword">int</span> <span class="ace_identifier">s</span>) </div><div class="ace_line" style="height: 19px; top: 133px;">    {</div><div class="ace_line" style="height: 19px; top: 152px;"><span class="ace_indent-guide">    </span>    <span class="ace_comment">// Your code here</span></div><div class="ace_line" style="height: 19px; top: 171px;"><span class="ace_indent-guide">    </span>    <span class="ace_identifier">ArrayList</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_support ace_function">Integer</span><span class="ace_keyword ace_operator">&gt;</span> <span class="ace_identifier">start</span><span class="ace_keyword ace_operator">=</span><span class="ace_keyword">new</span> <span class="ace_identifier">ArrayList</span><span class="ace_keyword ace_operator">&lt;&gt;</span>();</div><div class="ace_line" style="height: 19px; top: 190px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">sum</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">0</span>;</div><div class="ace_line" style="height: 19px; top: 209px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">end</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">1</span>;</div><div class="ace_line" style="height: 19px; top: 228px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">for</span>(<span class="ace_keyword">int</span> <span class="ace_identifier">i</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">0</span>;<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_identifier">n</span>;<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">++</span>){</div><div class="ace_line" style="height: 19px; top: 247px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">sum</span> <span class="ace_keyword ace_operator">=</span><span class="ace_identifier">arr</span>[<span class="ace_identifier">i</span>];</div><div class="ace_line" style="height: 19px; top: 266px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">end</span><span class="ace_keyword ace_operator">=</span><span class="ace_identifier">i</span><span class="ace_constant ace_numeric">+1</span>;</div><div class="ace_line" style="height: 19px; top: 285px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">while</span>(<span class="ace_identifier">sum</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_identifier">s</span> <span class="ace_keyword ace_operator">&amp;&amp;</span> <span class="ace_identifier">end</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_identifier">n</span>){</div><div class="ace_line" style="height: 19px; top: 304px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">sum</span><span class="ace_keyword ace_operator">=</span><span class="ace_identifier">sum</span><span class="ace_keyword ace_operator">+</span><span class="ace_identifier">arr</span>[<span class="ace_identifier">end</span><span class="ace_keyword ace_operator">++</span>];</div><div class="ace_line" style="height: 19px; top: 323px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>   </div><div class="ace_line" style="height: 19px; top: 342px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 19px; top: 361px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">if</span>(<span class="ace_identifier">sum</span><span class="ace_keyword ace_operator">==</span><span class="ace_identifier">s</span>){</div><div class="ace_line" style="height: 19px; top: 380px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>  <span class="ace_identifier">start</span>.<span class="ace_identifier">add</span>(<span class="ace_identifier">i</span><span class="ace_constant ace_numeric">+1</span>);</div><div class="ace_line" style="height: 19px; top: 399px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>  <span class="ace_identifier">start</span>.<span class="ace_identifier">add</span>(<span class="ace_identifier">end</span>);</div><div class="ace_line" style="height: 19px; top: 418px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>  <span class="ace_keyword">return</span> <span class="ace_identifier">start</span>;</div><div class="ace_line" style="height: 19px; top: 437px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>   }</div><div class="ace_line" style="height: 19px; top: 456px;"><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 19px; top: 475px;"><span class="ace_indent-guide">    </span>   <span class="ace_identifier">start</span>.<span class="ace_identifier">add</span>(<span class="ace_constant ace_numeric">-1</span>);</div><div class="ace_line" style="height: 19px; top: 494px;"><span class="ace_indent-guide">    </span>   <span class="ace_keyword">return</span> <span class="ace_identifier">start</span>;</div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_hidden-cursors"><div class="ace_cursor" style="display: block; top: 437px; left: 13px; width: 9px; height: 19px; animation-duration: 1000ms;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="width: 12px; bottom: 0px;"><div class="ace_scrollbar-inner" style="width: 12px; height: 551px;"></div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 12px; left: 51px; right: 7px;"><div class="ace_scrollbar-inner" style="height: 12px; width: 753px;"></div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">הההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההה</div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div>
            <div class="footer-editor" style="background: rgb(29, 30, 39);">
                <div class="footer-right">
                    <button id="show-hints" class="btn"><img src="./Subarray_with_given_sum_files/light-bulb-1596781614.svg"></button>
                    <button id="testRun" class="btn"><img src="./Subarray_with_given_sum_files/play-1596780125.svg"> Compile &amp;
                        Run</button>
                    <button id="run" class="btn"><img src="./Subarray_with_given_sum_files/check-square-1596781127.svg">
                        Submit</button>
                </div>
            </div>
        </div>

        <div class="modal fade" id="customInputTestModal">
            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h4 class="modal-title">Enter Custom Input</h4>
                    </div>
                    <div class="modal-body">
                        <span id="customInputFormat"></span>
                        <textarea id="testArea" rows="4" style="width:100%;max-width:100%" maxlength="100000"></textarea><br><br>
                        <ul style="padding-left: 20px">
                                <li class="expected_output"><b>Expected Outcome</b> - runs the test cases against the code of Online Judge.</li>
                            <li><b>My Output</b> - runs the test cases against your code.</li>
                        </ul>
                    </div>
                    <div class="modal-footer">
                            <button id="expectedRun" class="btn expected_output"><img src="./Subarray_with_given_sum_files/check-square-black-1601332644.svg">
                                Expected Output</button>
                        <button id="customInputTestRun" class="btn"><img src="./Subarray_with_given_sum_files/play-white-1601332700.svg"> My
                            Output</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="hintsModal">
            <div class="modal-dialog ">
                <div class="modal-content" style="max-height:90vh; overflow-y:auto">
                    <div class="modal-body hints-modal-body" style="min-height:50vh; overflow-y:auto;"><span class="fa fa-spin fa-spinner" style="top: 50%;left: 50%;transform: translate(50%);font-size: 30px;position: relative;"></span></div>
                    <div class="modal-footer">
                        <button class="btn btn-default" type="button" data-dismiss="modal">Close
                    </button></div>
                </div>
            </div>
        </div>
        <link rel="stylesheet" href="./Subarray_with_given_sum_files/pretify(1).css" type="text/css">
        <script src="./Subarray_with_given_sum_files/runPrettify.js.download"></script>
        <script src="./Subarray_with_given_sum_files/ace.js.download" type="text/javascript" charset="utf-8"></script>
        <script src="./Subarray_with_given_sum_files/ext-language_tools.js.download"></script>
    </div>
</div>

<!-- Error modal -->
    <div class="modal fade" id="gfgErrorModal" tabindex="-1" role="dialog" aria-labelledby="gfgErrorModalLabel" aria-hidden="true">
        <div class="vertical-alignment-helper">
            <div class="modal-dialog vertical-align-center">
                <div class="gfgmodal-content modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span>
                        </button>
                        <h4 class="modal-title text-danger" id="gfgErrorModalLabel">Error!</h4>
                    </div>
                    <div class="modal-body" id="gfgErrorModalBody">...</div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script>
var ALLOWED_INPUT_SIZE = 100000;
</script>
<script src="./Subarray_with_given_sum_files/contestCodingPage.js.download"></script>
</div>


<!-- Contest End Summary Modal -->
<div class="modal fade" id="contestSubmitModal" tabindex="-1" role="dialog" aria-labelledby="contestSubmitModal" aria-hidden="true">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center" role="document">
            <div class="modal-content contest-modal-content">
                <div class="modal-header contest-modal-header">
                    <h4 class="modal-title" id="exampleModalLongTitle"><strong>Any attempts made after submitting the contest will not reflect in your score. 
                        Are you sure you want to submit?</strong></h4>
                </div>
                <div class="modal-body contest-modal-body">
                   
                <h5><strong>Coding Problems Summary</strong></h5>
          <div class="row">
              <div class="col-md-6">
                  <i class="fas fa-circle" style="color:#2F8D46"></i> Solved (Correct)
                  <span class="pull-right coding_qsns_ansrd">2</span>
              </div>
              <!-- <div class="col-md-6">
                  <i class="fas fa-circle" style="color:#576A76"></i> Marked For Review
                  <span class="pull-right quiz_qsns_marked">0</span>
              </div> -->
              <div class="col-md-6">
                  <i class="far fa-circle"></i> Unsolved
                  <span class="pull-right coding_qsns_unansrd">1</span>
              </div>
          </div></div>
                <div class="modal-footer">
                    <button type="button" class="btn review_btn" data-dismiss="modal">Review</button>
                    <button type="button" class="btn modal_submit_btn" id="contest_submit_btn">Submit</button>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="errorModalContest" tabindex="-1" aria-hidden="true" data-backdrop="static" data-keyboard="false">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center" role="document">
            <div class="modal-content contest-modal-content">
                <div class="modal-body contest-modal-body" style="height:auto;text-align: center;display: flex;flex-direction: column;justify-content: center;align-content: center;align-items: center;">
                    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-mood-sad" width="100" height="100" viewBox="0 0 24 24" stroke-width="1.5" stroke="#000000" fill="none" stroke-linecap="round" stroke-linejoin="round" style="margin-bottom: 3rem;margin-top: 3rem;">
                        <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                        <circle cx="12" cy="12" r="9"></circle>
                        <line x1="9" y1="10" x2="9.01" y2="10"></line>
                        <line x1="15" y1="10" x2="15.01" y2="10"></line>
                        <path d="M9.5 15.25a3.5 3.5 0 0 1 5 0"></path>
                    </svg>
                    <span style="font-size: 20px;font-weight: bold;">Oops..!!! Some Error Occured,<br> Press Reload to refresh the page once.</span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn modal_submit_btn" id="reload_button">Reload</button>
                </div>
            </div>
        </div>
    </div>
</div>



<!-- Contest End Feedback Modal -->
<div class="modal fade" id="feedbackModal" tabindex="-1" aria-hidden="true" data-backdrop="static" data-keyboard="false">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center" role="document">
            <div class="modal-content contest-modal-content">
                <div class="modal-body contest-modal-body" style="height:auto;">
                    <lottie-player class="feedback_lott" src="https://practice.geeksforgeeks.org/css-min/json/contest/feedback.json" speed="1" background="transparent"></lottie-player>
                    <div class="feedback_experience" style="display:none;"></div>
                    <div class="feedack_rating_wrapper">
                        <form id="ratingForm">
                            <fieldset class="rating">
                                <input type="radio" id="star5" name="rating" value="5"><label for="star5"></label>
                                <input type="radio" id="star4" name="rating" value="4"><label for="star4"></label>
                                <input type="radio" id="star3" name="rating" value="3"><label for="star3"></label>
                                <input type="radio" id="star2" name="rating" value="2"><label for="star2"></label>
                                <input type="radio" id="star1" name="rating" value="1"><label for="star1"></label>
                            </fieldset>
                        </form>
                    </div>
                    <br>
                    <div class="feedback_text_wrapper">
                        <textarea id="feedback_text" name="feedback_text" rows="4" cols="50" placeholder="(Optional)"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn modal_submit_btn" id="feedback_submit_btn">Submit</button>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="snackbar"></div>
<script>
var authUrl = 'https://auth.geeksforgeeks.org';
var URLHOME = 'https://practice.geeksforgeeks.org'
var currentContestUrl = 'https://practice.geeksforgeeks.org/contest/day-5-sliding-window-dsa-bootcamp/'
var currentTab = 'instructions';
var practiceHost = "https://practiceapi.geeksforgeeks.org/api/v1/";
var contestSlug = 'day-5-sliding-window-dsa-bootcamp'
</script>

<script src="./Subarray_with_given_sum_files/contestDetails.js.download"></script>

<script>
$(document).ready(function() {
    contestObj.controllerPath = "https://practiceapi.geeksforgeeks.org/api/v1/contest/day-5-sliding-window-dsa-bootcamp";
    contestObj.controllerCDNPath = "https://practiceapi.geeksforgeeks.org/api/vr/contest/day-5-sliding-window-dsa-bootcamp";
    contestObj.init();
});
</script>
</div><div class="cke_screen_reader_only cke_copyformatting_notification"><div aria-live="polite"></div></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div id="fb-root" class=" fb_reset"><div style="position: absolute; top: -10000px; width: 0px; height: 0px;"><div></div></div></div></body></html>