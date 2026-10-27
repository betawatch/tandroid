package ug;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p {
    public final Context a;
    public final Handler b;
    public final int c;
    public final int e;
    public EGLConfig m;
    public a n;
    public a o;
    public a p;
    public long q;
    public long r;
    public int s;
    public final ArrayList f = new ArrayList();
    public volatile r[] g = new r[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] i = new int[2];
    public EGLDisplay j = EGL14.EGL_NO_DISPLAY;
    public EGLContext k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context, int i10) {
        this.a = context;
        this.e = i10;
        this.c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.j = eglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Wallet EGL initialize failed");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Wallet EGL config failed");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.m = eGLConfig;
        this.k = EGL14.eglCreateContext(this.j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.j, this.m, new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.l = eglCreatePbufferSurface;
        if (!EGL14.eglMakeCurrent(this.j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.k)) {
            throw new IllegalStateException("Wallet EGL context failed");
        }
        Context context = this.a;
        a aVar = new a(context, 2);
        int i10 = this.e;
        aVar.C = i10;
        this.n = aVar;
        a aVar2 = new a(context, 2);
        aVar2.C = i10;
        this.o = aVar2;
        this.r = 0L;
        this.q = 0L;
        this.s = 0;
    }

    public final void b() {
        a aVar = this.n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.p = null;
        this.o = null;
        this.n = null;
        EGLDisplay eGLDisplay = this.j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.j, this.l);
        EGL14.eglDestroyContext(this.j, this.k);
        EGL14.eglTerminate(this.j);
        EGL14.eglReleaseThread();
        this.j = EGL14.EGL_NO_DISPLAY;
        this.k = EGL14.EGL_NO_CONTEXT;
        this.l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.b.post(new ti.g(this, 3));
        }
    }
}
