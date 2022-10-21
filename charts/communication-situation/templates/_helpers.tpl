{{/* vim: set filetype=mustache: */}}
{{- /*
service.labels.standard prints the standard service Helm labels.
The standard labels are frequently used in metadata.
*/ -}}
{{- define "service.labels.standard" -}}
egova/release: {{ .Release.Name | quote }}
egova/application: {{ .Chart.Name | quote }}
egova/version: {{ .Chart.Version | quote }}
{{- end -}}
{{- define "service.match.labels" -}}
egova/release: {{ .Release.Name | quote }}
{{- end -}}