// default package

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xke {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        ko5 ko5Var = mo5.b;
        throw new dy4(str, y79.e);
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
        throw new dy4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), mo5.u(Integer.valueOf(eglGetError)));
    }
}
