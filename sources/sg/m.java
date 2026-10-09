package sg;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Wallet.p5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ n d;

    public m(n nVar, SurfaceTexture surfaceTexture) {
        this.d = nVar;
        this.a = surfaceTexture;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        n nVar;
        boolean z10;
        n nVar2;
        g gVar;
        n nVar3 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        nVar3.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        nVar3.f = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(nVar3.r.eglGetError()));
        }
        if (!nVar3.r.eglInitialize(eglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(nVar3.r.eglGetError()));
        }
        int i10 = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = EmuDetector.with(nVar3.getContext()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, 4, 12344};
        nVar3.s = null;
        if (!EmuDetector.with(nVar3.getContext()).detect() && nVar3.r.eglChooseConfig(nVar3.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            nVar3.s = eGLConfigArr[0];
        } else {
            if (!nVar3.r.eglChooseConfig(nVar3.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(nVar3.r.eglGetError()));
            }
            if (iArr[0] > 0) {
                nVar3.s = eGLConfigArr[0];
            }
        }
        if (nVar3.s == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        int i11 = nVar3.j() ? 3 : 2;
        EGL10 egl102 = nVar3.r;
        EGLDisplay eGLDisplay = nVar3.f;
        EGLConfig eGLConfig = nVar3.s;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i11, 12344});
        nVar3.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            throw new IllegalStateException("eglCreateContext failed: " + nVar3.r.eglGetError());
        }
        nVar3.f();
        nVar3.h = nVar3.r.eglCreateWindowSurface(nVar3.f, nVar3.s, nVar3.c, null);
        nVar3.f();
        EGLSurface eGLSurface = nVar3.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = nVar3.r.eglGetError();
            if (eglGetError != 12299) {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
            }
            FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else {
            if (!nVar3.r.eglMakeCurrent(nVar3.f, eGLSurface, eGLSurface, nVar3.n)) {
                throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(nVar3.r.eglGetError()));
            }
            nVar3.f();
            nVar3.v = (GL10) nVar3.n.getGL();
            nVar3.f();
        }
        this.d.g();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                try {
                    if (this.d.H && (gVar = (nVar2 = this.d).b) != null) {
                        n.c(nVar2, gVar);
                        this.d.H = false;
                    }
                } finally {
                }
            }
            n nVar4 = this.d;
            if (nVar4.b != null && (!nVar4.G || (!nVar4.T && (nVar4 instanceof p5)))) {
                long nanoTime2 = System.nanoTime();
                n.a(this.d, (nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    AndroidUtilities.runOnUIThread(new l(this, i10));
                }
                nanoTime = nanoTime2;
            }
            try {
                nVar = this.d;
            } catch (InterruptedException unused) {
            }
            if (nVar.b != null && (!nVar.G || (!nVar.T && (nVar instanceof p5)))) {
                z10 = false;
                if (z10) {
                    long nanoTime3 = this.d.w - (System.nanoTime() - nanoTime);
                    if (nanoTime3 > 0) {
                        Thread.sleep(nanoTime3 / 1000000, (int) (nanoTime3 % 1000000));
                    }
                } else {
                    Thread.sleep(100L);
                }
            }
            z10 = true;
            if (z10) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.b) {
                    return;
                }
                n nVar = this.d;
                nVar.c = this.a;
                nVar.H = true;
                try {
                    try {
                        a();
                    } catch (Exception e7) {
                        if (!this.b) {
                            FileLog.e(e7);
                            AndroidUtilities.runOnUIThread(new l(this, 0));
                        }
                    }
                    n.b(this.d);
                } catch (Throwable th2) {
                    n.b(this.d);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
