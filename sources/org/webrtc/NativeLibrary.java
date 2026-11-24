package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class DefaultLoader implements NativeLibraryLoader {
        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.d(NativeLibrary.TAG, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            boolean z = libraryLoaded;
            String str2 = TAG;
            if (z) {
                Logging.d(str2, "Native library has already been loaded.");
                return;
            }
            Logging.d(str2, "Loading native library: " + str);
            libraryLoaded = nativeLibraryLoader.load(str);
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
