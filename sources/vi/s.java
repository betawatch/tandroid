package vi;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import li.e3;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.oy0;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s {
    public EGLSurface B;
    public EGLSurface C;
    public int D;
    public int E;
    public volatile boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int[] K;
    public final float[] L;
    public final float[] M;
    public d0 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public Size a;
    public long a0;
    public Size b;
    public int b0;
    public Size c;
    public float c0;
    public final Surface d;
    public n0 d0;
    public final Surface e;
    public n0 e0;
    public final boolean f;
    public int f0;
    public final int g;
    public long g0;
    public final boolean h;
    public long h0;
    public final n i;
    public long i0;
    public int j;
    public long j0;
    public int k;
    public long k0;
    public int l;
    public long l0;
    public boolean m;
    public long m0;
    public boolean n;
    public int n0;
    public boolean o;
    public int o0;
    public volatile long p;
    public long p0;
    public long q0;
    public final r r;
    public volatile boolean r0;
    public final c s;
    public volatile boolean s0;
    public HandlerThread t;
    public volatile a t0;
    public Handler u;
    public Runnable u0;
    public SurfaceTexture v;
    public boolean v0;
    public Surface w;
    public volatile RuntimeException w0;
    public SurfaceTexture x;
    public final o x0;
    public Surface y;
    public volatile long q = Long.MAX_VALUE;
    public EGLDisplay z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public s(Size size, Surface surface, Surface surface2, boolean z10, int i10, int i11, boolean z11, boolean z12, n nVar, r rVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.x0 = new o(this, 1);
        this.a = size;
        this.b = size;
        this.c = size;
        this.d = surface;
        this.e = surface2;
        this.f = z10;
        this.g = i10;
        this.j = i11;
        this.k = i11;
        this.l = i11;
        this.m = z11;
        this.n = z11;
        this.o = z11;
        this.h = z12;
        this.i = nVar;
        this.G = i10;
        this.H = i10;
        this.p = 0L;
        this.s0 = false;
        this.r = rVar;
        this.s = cVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder l4 = b10.l(str, ": 0x");
        l4.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(l4.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0105, code lost:
    
        if ((r0 % 60) == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10) {
        long j10;
        long j11;
        SurfaceTexture surfaceTexture = z10 ? this.x : this.v;
        if (!this.r0 || surfaceTexture == null) {
            return;
        }
        try {
            float[] fArr = z10 ? this.M : this.L;
            int i10 = z10 ? this.E : this.D;
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = surfaceTexture.getTimestamp();
            this.i0++;
            if (z10) {
                j10 = this.k0 + 1;
                this.k0 = j10;
            } else {
                j10 = this.j0 + 1;
                this.j0 = j10;
            }
            if (j10 == 1) {
                this.i.b("first GL input frame: input=" + (z10 ? 1 : 0) + ", cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
            }
            if (z10 != this.F) {
                return;
            }
            if (!this.s0) {
                j(fArr, i10);
                a aVar = this.t0;
                if (this.v0 || aVar == null) {
                    return;
                }
                this.v0 = true;
                aVar.run();
                return;
            }
            if (this.m && timestamp < this.p) {
                j(fArr, i10);
                long j12 = this.l0 + 1;
                this.l0 = j12;
                if (j12 == 1) {
                    this.i.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - this.p) / 1000));
                    return;
                }
                return;
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j13 = this.P;
            if (j13 != 0) {
                long j14 = elapsedRealtimeNanos - j13;
                j11 = 0;
                this.p0 = Math.max(this.p0, j14);
                if (j14 > 50000000) {
                    this.o0++;
                }
            } else {
                j11 = 0;
            }
            long j15 = this.P;
            if (j15 != j11 && elapsedRealtimeNanos - j15 <= 50000000) {
                int i11 = this.O;
                this.O = i11 + 1;
            }
            o();
            this.P = elapsedRealtimeNanos;
            if (this.W == 0) {
                this.T = true;
                this.N.m(i10, fArr, elapsedRealtimeNanos, this.G, this.H);
                if (this.p != j11) {
                    if (this.m) {
                        timestamp = Math.max(j11, timestamp - this.p);
                    } else {
                        if (this.Q < j11) {
                            this.Q = timestamp;
                            this.R = d();
                        }
                        timestamp = this.R + Math.max(0L, timestamp - this.Q);
                    }
                }
                long max = Math.max(timestamp, this.S + 1);
                if (max < this.q) {
                    m(max);
                }
                j(fArr, i10);
                return;
            }
            j(fArr, i10);
            if (this.V) {
                boolean z11 = this.U;
                this.N.g(fArr, i10, true);
                this.U = true;
                if (!z11) {
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    float f7 = (elapsedRealtimeNanos2 - this.Y) / 1000000.0f;
                    int d = v0.d(this.d0, this.e0, Math.round(f7));
                    this.i.b("camera switch first new frame: waitMs=" + f7 + ", rollingAverageMs=" + d);
                    this.W = 3;
                    this.X = elapsedRealtimeNanos2;
                }
                int i12 = this.W;
                if (i12 == 3 || i12 == 4) {
                    Handler handler = this.u;
                    if (handler != null) {
                        handler.removeCallbacks(this.x0);
                    }
                    c();
                }
            }
        } catch (RuntimeException e) {
            this.i.a("GL error", e);
            c cVar = this.s;
            if (cVar != null) {
                e3 e3Var = cVar.b;
                ((u0) e3Var.b).i.post(new j0(e3Var, e, 1));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0133, code lost:
    
        r9 = r9 - r5;
        r7 = 33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: RuntimeException -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0047, blocks: (B:11:0x0026, B:13:0x003b, B:16:0x0042, B:22:0x00c1, B:67:0x004f, B:74:0x006d), top: B:9:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        long d;
        boolean z11;
        int i11;
        if (!this.r0 || this.W == 0) {
            return;
        }
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = elapsedRealtimeNanos - this.X;
            int i12 = this.W;
            try {
                if (i12 == 1) {
                    this.c0 = e(elapsedRealtimeNanos);
                    z10 = true;
                    if (j10 >= Math.max(33L, this.b0) * 1000000) {
                        this.W = this.U ? 3 : 2;
                        this.X = elapsedRealtimeNanos;
                    }
                } else {
                    z10 = true;
                    if (i12 == 2) {
                        this.c0 = e(elapsedRealtimeNanos);
                    } else if (i12 == 3 || i12 == 4) {
                        long j11 = this.Z;
                        if (j10 < j11) {
                            float max = Math.max(0.0f, Math.min(1.0f, j10 / j11));
                            f10 = c3.h0.D(max, 2.0f, 3.0f, max * max);
                            f7 = 1.0f;
                        } else {
                            this.W = 4;
                            float max2 = Math.max(0.0f, Math.min(1.0f, (j10 - j11) / this.a0));
                            f7 = 1.0f - ((3.0f - (max2 * 2.0f)) * (max2 * max2));
                            f10 = 1.0f;
                        }
                        this.N.o(this.c0, f7, f10, this.G, this.H);
                        this.n0++;
                        d = d();
                        if (d < this.q) {
                            m(d);
                        }
                        long j12 = this.Z + this.a0;
                        if (this.W == 4 || j10 < j12) {
                            z11 = z10;
                        } else {
                            d0 d0Var = this.N;
                            if (d0Var.B) {
                                if (d0Var.e) {
                                    d0Var.v = d0Var.y;
                                    d0Var.w = d0Var.x;
                                    z11 = z10;
                                    d0Var.A = z11;
                                    d0Var.z = elapsedRealtimeNanos;
                                } else {
                                    z11 = z10;
                                }
                                d0Var.B = false;
                            } else {
                                z11 = z10;
                            }
                            this.W = 0;
                            this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
                        }
                        i11 = this.W;
                        if (i11 != 0 || this.u == null) {
                        }
                        if (!this.U || (i11 != 3 && i11 != 4)) {
                            z11 = false;
                        }
                        long j13 = 33;
                        long max3 = Math.max(33L, this.b0);
                        Long.signum(max3);
                        long j14 = (max3 * 1000000) - j10;
                        this.u.postDelayed(this.x0, Math.min(z11 ? 70L : j13, this.W == 2 ? j13 : Math.max(1L, (j14 + 999999) / 1000000)));
                        return;
                    }
                }
                f7 = 1.0f;
                f10 = 0.0f;
                this.N.o(this.c0, f7, f10, this.G, this.H);
                this.n0++;
                d = d();
                if (d < this.q) {
                }
                long j122 = this.Z + this.a0;
                if (this.W == 4) {
                }
                z11 = z10;
                i11 = this.W;
                if (i11 != 0) {
                }
            } catch (RuntimeException e) {
                e = e;
                i10 = 0;
                this.W = i10;
                this.i.a("GL error", e);
                c cVar = this.s;
                if (cVar != null) {
                    e3 e3Var = cVar.b;
                    ((u0) e3Var.b).i.post(new j0(e3Var, e, 1));
                }
            }
        } catch (RuntimeException e10) {
            e = e10;
            i10 = 0;
        }
    }

    public final long d() {
        return Math.max(this.p == 0 ? this.S + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.p), this.S + 1);
    }

    public final float e(long j10) {
        long max = Math.max(0L, j10 - this.Y);
        long max2 = Math.max(33L, this.b0) * 1000000;
        float f7 = ((this.N.a * 4.0f) / 48.0f) * 1.15f;
        if (max > max2) {
            return f7 * ((float) Math.sqrt((Math.log1p((max - max2) / max2) * 0.3499999940395355d) + 1.0d));
        }
        float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / max2));
        return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
    }

    public final void f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.z = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("Unable to get EGL display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.A = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        int[] iArr3 = {12344};
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], this.d, iArr3, 0);
        this.B = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        Surface surface = this.e;
        if (surface != null) {
            EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], surface, iArr3, 0);
            this.C = eglCreateWindowSurface2;
            a("Unable to create preview EGL surface", eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE);
            this.I = h(this.C, 12375);
            this.J = h(this.C, 12374);
        }
        g();
        this.i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
        boolean z10 = this.f;
        int i10 = z10 ? 2 : 1;
        int[] iArr4 = new int[i10];
        GLES20.glGenTextures(i10, iArr4, 0);
        int i11 = iArr4[0];
        this.D = i11;
        GLES20.glBindTexture(36197, i11);
        k(i11, this.j);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
        this.v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.v.setOnFrameAvailableListener(new q(this, 0), this.u);
        this.w = new Surface(this.v);
        if (z10) {
            int i12 = iArr4[1];
            this.E = i12;
            GLES20.glBindTexture(36197, i12);
            k(i12, this.j);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
            this.x = surfaceTexture2;
            surfaceTexture2.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
            this.x.setOnFrameAvailableListener(new q(this, 1), this.u);
            this.y = new Surface(this.x);
        }
        Size size = this.a;
        int i13 = this.j;
        boolean z11 = this.h;
        int i14 = this.g;
        this.N = new d0(i14, size, i13, z11);
        GLES20.glViewport(0, 0, i14, i14);
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i10) {
        EGLDisplay eGLDisplay = this.z;
        int[] iArr = this.K;
        return !EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0) ? this.g : Math.max(1, iArr[0]);
    }

    public final void i() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.q0 == 0 ? 0L : System.nanoTime() - this.q0;
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.i0);
        sb2.append(", inputFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.i0 * 1.0E9d) / nanoTime));
        sb2.append(", primaryInputFrames=");
        sb2.append(this.j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.l0);
        sb2.append(", submittedFrames=");
        sb2.append(this.m0);
        sb2.append(", submittedFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.m0 * 1.0E9d) / nanoTime));
        sb2.append(", syntheticFrames=");
        sb2.append(this.n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(this.p0 / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(0 / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f0;
        sb2.append(i10 != 0 ? Float.valueOf((this.g0 / i10) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.h0 / 1000000.0f);
        this.i.b(sb2.toString());
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.x0);
        }
        EGLDisplay eGLDisplay = this.z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
            this.w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.y;
        if (surface2 != null) {
            surface2.release();
            this.y = null;
        }
        SurfaceTexture surfaceTexture4 = this.x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.x = null;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.g.b();
            d0Var.h.b();
            a0 a0Var = d0Var.i;
            if (a0Var != null) {
                a0Var.b();
            }
            y yVar = d0Var.j;
            if (yVar != null) {
                yVar.b();
            }
            d0Var.k.b();
            d0Var.l.b();
            d0Var.m.b();
            z zVar = d0Var.n;
            if (zVar != null) {
                zVar.b();
            }
            int[] iArr = d0Var.t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i11 = this.D;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.D = 0;
        }
        int i12 = this.E;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.z);
        }
        this.z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(float[] fArr, int i10) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (!EGL14.eglMakeCurrent(this.z, eGLSurface, eGLSurface, this.A)) {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            d0 d0Var = this.N;
            int i11 = this.I;
            int i12 = this.J;
            d0Var.getClass();
            GLES20.glDisable(3042);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            d0Var.c(d0Var.g, fArr);
            d0.d(i10);
            GLES20.glDrawArrays(5, 0, 4);
            if (!EGL14.eglSwapBuffers(this.z, this.C)) {
                throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            g();
        }
        Runnable runnable = this.u0;
        if (runnable != null) {
            this.u0 = null;
            runnable.run();
        }
    }

    public final void k(int i10, int i11) {
        GLES20.glBindTexture(36197, i10);
        int i12 = i11 == this.g ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i12);
        GLES20.glTexParameteri(36197, 10240, i12);
    }

    public final void l() {
        Handler handler = this.u;
        HandlerThread handlerThread = this.t;
        if (handler != null) {
            handler.removeCallbacks(this.x0);
        }
        this.u = null;
        this.t = null;
        this.r0 = false;
        if (handler == null || handlerThread == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new oy0(this, handlerThread, countDownLatch, 24));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void m(long j10) {
        this.S = j10;
        EGLExt.eglPresentationTimeANDROID(this.z, this.B, j10);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.z, this.B)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.m0++;
        long j11 = nanoTime2 - nanoTime;
        this.f0++;
        this.g0 += j11;
        this.h0 = Math.max(this.h0, j11);
        if (this.f0 % 30 == 0) {
            this.i.b("encoder swap: average=" + ((this.g0 / this.f0) / 1000000.0f) + " ms, max=" + (this.h0 / 1000000.0f) + " ms");
        }
        r rVar = this.r;
        if (rVar != null) {
            m mVar = (m) rVar;
            long j12 = mVar.C;
            int i10 = (int) (j12 % 256);
            mVar.l[i10] = j10 / 1000;
            mVar.m[i10] = nanoTime2;
            mVar.C = j12 + 1;
            synchronized (mVar) {
                if (mVar.u != null && !mVar.v) {
                    d dVar = mVar.u;
                    mVar.u = null;
                    mVar.f.b("first synchronized video frame submitted");
                    dVar.run();
                }
            }
        }
    }

    public final void n(Size size, int i10, boolean z10) {
        Handler handler = this.u;
        if (!this.r0 || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new p(this, size, i10, z10, runtimeExceptionArr, countDownLatch, 1));
        try {
            countDownLatch.await();
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Input size update was interrupted", e);
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.z, this.B, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0 && (i10 != this.G || i11 != this.H)) {
                    this.G = i10;
                    this.H = i11;
                    this.i.b("EGL output size changed: " + i10 + "x" + i11);
                }
                EGLSurface eGLSurface2 = this.C;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    this.I = h(eGLSurface2, 12375);
                    this.J = h(this.C, 12374);
                }
            }
        }
    }
}
