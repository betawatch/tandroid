package sg;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import rg.x1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p {
    public final Context a;
    public final Handler b;
    public final int c;
    public EGLConfig l;
    public a m;
    public a n;
    public a o;
    public long p;
    public long q;
    public int r;
    public final ArrayList e = new ArrayList();
    public volatile r[] f = new r[0];
    public final AtomicBoolean g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay i = EGL14.EGL_NO_DISPLAY;
    public EGLContext j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.a = context;
        this.c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.i = eglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Wallet EGL initialize failed");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Wallet EGL config failed");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.l = eGLConfig;
        this.j = EGL14.eglCreateContext(this.i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.i, this.l, new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.k = eglCreatePbufferSurface;
        if (!EGL14.eglMakeCurrent(this.i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.j)) {
            throw new IllegalStateException("Wallet EGL context failed");
        }
        Context context = this.a;
        a aVar = new a(context, 2);
        aVar.C = 2;
        this.m = aVar;
        a aVar2 = new a(context, 2);
        aVar2.C = 2;
        this.n = aVar2;
        this.q = 0L;
        this.p = 0L;
        this.r = 0;
    }

    public final void b() {
        a aVar = this.m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.o = null;
        this.n = null;
        this.m = null;
        EGLDisplay eGLDisplay = this.i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.i, this.k);
        EGL14.eglDestroyContext(this.i, this.j);
        EGL14.eglTerminate(this.i);
        EGL14.eglReleaseThread();
        this.i = EGL14.EGL_NO_DISPLAY;
        this.j = EGL14.EGL_NO_CONTEXT;
        this.k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.g.compareAndSet(false, true)) {
            this.b.post(new x1(this, 4));
        }
    }
}
