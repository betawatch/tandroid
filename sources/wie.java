// default package

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wie {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        km5 km5Var = mm5.b;
        throw new bw4(str, w59.e);
    }

    public static boolean b(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new bw4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), mm5.u(Integer.valueOf(eglGetError)));
    }
}
