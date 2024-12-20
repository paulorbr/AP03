rm -rf build
mkdir -p build/gen build/obj build/apk
"$BUILD_TOOLS/aapt" package -f -m -J build/gen/ -S res -M AndroidManifest.xml -I "$PLATFORM/android.jar"
javac --release 11 -classpath "$PLATFORM/android.jar" -d build/obj build/gen/net/hanshq/hello/R.java java/net/hanshq/hello/MainActivity.java
"$BUILD_TOOLS/d8" --release --lib "$PLATFORM/android.jar" --output build/apk/ build/obj/net/hanshq/hello/*.class
