package vg;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.n6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ m d;

    public l(m mVar, SurfaceTexture surfaceTexture) {
        this.d = mVar;
        this.a = surfaceTexture;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        m mVar;
        boolean z9;
        m mVar2;
        f fVar;
        m mVar3 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        mVar3.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        mVar3.f = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(mVar3.r.eglGetError()));
        }
        if (!mVar3.r.eglInitialize(eglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(mVar3.r.eglGetError()));
        }
        int i7 = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = n6.h(mVar3.getContext()).f() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, mVar3.getMsaaSamples(), 12344};
        mVar3.s = null;
        if (!n6.h(mVar3.getContext()).f() && mVar3.r.eglChooseConfig(mVar3.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            mVar3.s = eGLConfigArr[0];
        } else {
            if (!mVar3.r.eglChooseConfig(mVar3.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(mVar3.r.eglGetError()));
            }
            if (iArr[0] > 0) {
                mVar3.s = eGLConfigArr[0];
            }
        }
        EGLConfig eGLConfig = mVar3.s;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        int i10 = mVar3.S == 4 ? 3 : 2;
        EGL10 egl102 = mVar3.r;
        EGLDisplay eGLDisplay = mVar3.f;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i10, 12344});
        mVar3.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            throw new IllegalStateException("eglCreateContext failed: " + mVar3.r.eglGetError());
        }
        mVar3.f();
        mVar3.h = mVar3.r.eglCreateWindowSurface(mVar3.f, mVar3.s, mVar3.c, null);
        mVar3.f();
        EGLSurface eGLSurface = mVar3.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = mVar3.r.eglGetError();
            if (eglGetError != 12299) {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
            }
            a8.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else {
            if (!mVar3.r.eglMakeCurrent(mVar3.f, eGLSurface, eGLSurface, mVar3.n)) {
                throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(mVar3.r.eglGetError()));
            }
            mVar3.f();
            mVar3.w = (GL10) mVar3.n.getGL();
            mVar3.f();
        }
        this.d.g();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                try {
                    if (this.d.H && (fVar = (mVar2 = this.d).b) != null) {
                        m.c(mVar2, fVar);
                        this.d.H = false;
                    }
                } finally {
                }
            }
            m mVar4 = this.d;
            if (mVar4.b != null && !mVar4.G) {
                long nanoTime2 = System.nanoTime();
                m.a(this.d, (nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    g0.h3(new k(this, i7));
                }
                nanoTime = nanoTime2;
            }
            try {
                mVar = this.d;
            } catch (InterruptedException unused) {
            }
            if (mVar.b != null && !mVar.G) {
                z9 = false;
                if (z9) {
                    long nanoTime3 = this.d.x - (System.nanoTime() - nanoTime);
                    if (nanoTime3 > 0) {
                        Thread.sleep(nanoTime3 / 1000000, (int) (nanoTime3 % 1000000));
                    }
                } else {
                    Thread.sleep(100L);
                }
            }
            z9 = true;
            if (z9) {
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
                m mVar = this.d;
                mVar.c = this.a;
                mVar.H = true;
                try {
                    try {
                        a();
                    } catch (Exception e10) {
                        if (!this.b) {
                            a8.g(e10, true);
                            g0.h3(new k(this, 0));
                        }
                    }
                    m.b(this.d);
                } catch (Throwable th2) {
                    m.b(this.d);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
