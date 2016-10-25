
@setlocal

@set PWD=%~dp0
@set MVN=%PWD%mvnw

@call "%MVN%" eclipse:eclipse -Dwtpversion=2.0 -DdownloadSources=true -DdownloadJavadocs=true

@endlocal
