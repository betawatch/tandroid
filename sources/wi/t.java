package wi;

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
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s31;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class t {
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
    public m0 d0;
    public final Surface e;
    public m0 e0;
    public final boolean f;
    public int f0;
    public final int g;
    public long g0;
    public final boolean h;
    public long h0;
    public final o i;
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
    public final s r;
    public volatile boolean r0;
    public final c s;
    public volatile int s0;
    public HandlerThread t;
    public volatile boolean t0;
    public Handler u;
    public volatile a u0;
    public SurfaceTexture v;
    public Runnable v0;
    public Surface w;
    public boolean w0;
    public SurfaceTexture x;
    public volatile RuntimeException x0;
    public Surface y;
    public final q y0;
    public volatile long q = Long.MAX_VALUE;
    public EGLDisplay z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public t(Size size, Surface surface, Surface surface2, boolean z9, int i7, int i10, boolean z10, boolean z11, o oVar, s sVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.y0 = new q(this, 1);
        this.a = size;
        this.b = size;
        this.c = size;
        this.d = surface;
        this.e = surface2;
        this.f = z9;
        this.g = i7;
        this.j = i10;
        this.k = i10;
        this.l = i10;
        this.m = z10;
        this.n = z10;
        this.o = z10;
        this.h = z11;
        this.i = oVar;
        this.G = i7;
        this.H = i7;
        this.p = 0L;
        this.t0 = false;
        this.r = sVar;
        this.s = cVar;
    }

    public static void a(String str, boolean z9) {
        if (z9) {
            return;
        }
        StringBuilder j3 = rf.b.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0105, code lost:
    
        if ((r0 % 60) == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z9) {
        long j3;
        long j10;
        SurfaceTexture surfaceTexture = z9 ? this.x : this.v;
        if (!this.r0 || surfaceTexture == null) {
            return;
        }
        try {
            float[] fArr = z9 ? this.M : this.L;
            int i7 = z9 ? this.E : this.D;
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = surfaceTexture.getTimestamp();
            this.i0++;
            if (z9) {
                j3 = this.k0 + 1;
                this.k0 = j3;
            } else {
                j3 = this.j0 + 1;
                this.j0 = j3;
            }
            if (j3 == 1) {
                this.i.b("first GL input frame: input=" + (z9 ? 1 : 0) + ", cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
            }
            if (z9 != this.F) {
                return;
            }
            if (!this.t0) {
                j(i7, fArr);
                a aVar = this.u0;
                if (this.w0 || aVar == null) {
                    return;
                }
                this.w0 = true;
                aVar.run();
                return;
            }
            if (this.m && timestamp < this.p) {
                j(i7, fArr);
                long j11 = this.l0 + 1;
                this.l0 = j11;
                if (j11 == 1) {
                    this.i.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - this.p) / 1000));
                    return;
                }
                return;
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j12 = this.P;
            if (j12 != 0) {
                long j13 = elapsedRealtimeNanos - j12;
                j10 = 0;
                this.p0 = Math.max(this.p0, j13);
                if (j13 > 50000000) {
                    this.o0++;
                }
            } else {
                j10 = 0;
            }
            long j14 = this.P;
            if (j14 != j10 && elapsedRealtimeNanos - j14 <= 50000000) {
                int i10 = this.O;
                this.O = i10 + 1;
            }
            o();
            this.P = elapsedRealtimeNanos;
            if (this.W == 0) {
                this.T = true;
                this.N.m(i7, fArr, elapsedRealtimeNanos, this.G, this.H);
                if (this.p != j10) {
                    if (this.m) {
                        timestamp = Math.max(j10, timestamp - this.p);
                    } else {
                        if (this.Q < j10) {
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
                j(i7, fArr);
                return;
            }
            j(i7, fArr);
            if (this.V) {
                boolean z10 = this.U;
                this.N.g(fArr, i7, true);
                this.U = true;
                if (!z10) {
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    float f10 = (elapsedRealtimeNanos2 - this.Y) / 1000000.0f;
                    int d = u0.d(this.d0, this.e0, Math.round(f10));
                    this.i.b("camera switch first new frame: waitMs=" + f10 + ", rollingAverageMs=" + d);
                    this.W = 3;
                    this.X = elapsedRealtimeNanos2;
                }
                int i11 = this.W;
                if (i11 == 3 || i11 == 4) {
                    Handler handler = this.u;
                    if (handler != null) {
                        handler.removeCallbacks(this.y0);
                    }
                    c();
                }
            }
        } catch (RuntimeException e10) {
            this.i.a("GL error", e10);
            c cVar = this.s;
            if (cVar != null) {
                rt rtVar = cVar.b;
                ((t0) rtVar.b).i.post(new j0(rtVar, e10, 1));
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
        int i7;
        boolean z9;
        float f10;
        float f11;
        long d;
        boolean z10;
        int i10;
        if (!this.r0 || this.W == 0) {
            return;
        }
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j3 = elapsedRealtimeNanos - this.X;
            int i11 = this.W;
            try {
                if (i11 == 1) {
                    this.c0 = e(elapsedRealtimeNanos);
                    z9 = true;
                    if (j3 >= Math.max(33L, this.b0) * 1000000) {
                        this.W = this.U ? 3 : 2;
                        this.X = elapsedRealtimeNanos;
                    }
                } else {
                    z9 = true;
                    if (i11 == 2) {
                        this.c0 = e(elapsedRealtimeNanos);
                    } else if (i11 == 3 || i11 == 4) {
                        long j10 = this.Z;
                        if (j3 < j10) {
                            float max = Math.max(0.0f, Math.min(1.0f, j3 / j10));
                            f11 = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                            f10 = 1.0f;
                        } else {
                            this.W = 4;
                            float max2 = Math.max(0.0f, Math.min(1.0f, (j3 - j10) / this.a0));
                            f10 = 1.0f - ((3.0f - (max2 * 2.0f)) * (max2 * max2));
                            f11 = 1.0f;
                        }
                        this.N.o(this.c0, f10, f11, this.G, this.H);
                        this.n0++;
                        d = d();
                        if (d < this.q) {
                            m(d);
                        }
                        long j11 = this.Z + this.a0;
                        if (this.W == 4 || j3 < j11) {
                            z10 = z9;
                        } else {
                            d0 d0Var = this.N;
                            if (d0Var.C) {
                                if (d0Var.e) {
                                    d0Var.w = d0Var.z;
                                    d0Var.x = d0Var.y;
                                    z10 = z9;
                                    d0Var.B = z10;
                                    d0Var.A = elapsedRealtimeNanos;
                                } else {
                                    z10 = z9;
                                }
                                d0Var.C = false;
                            } else {
                                z10 = z9;
                            }
                            this.W = 0;
                            this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
                        }
                        i10 = this.W;
                        if (i10 != 0 || this.u == null) {
                        }
                        if (!this.U || (i10 != 3 && i10 != 4)) {
                            z10 = false;
                        }
                        long j12 = 33;
                        long max3 = Math.max(33L, this.b0);
                        Long.signum(max3);
                        long j13 = (max3 * 1000000) - j3;
                        this.u.postDelayed(this.y0, Math.min(z10 ? 70L : j12, this.W == 2 ? j12 : Math.max(1L, (j13 + 999999) / 1000000)));
                        return;
                    }
                }
                f10 = 1.0f;
                f11 = 0.0f;
                this.N.o(this.c0, f10, f11, this.G, this.H);
                this.n0++;
                d = d();
                if (d < this.q) {
                }
                long j112 = this.Z + this.a0;
                if (this.W == 4) {
                }
                z10 = z9;
                i10 = this.W;
                if (i10 != 0) {
                }
            } catch (RuntimeException e10) {
                e = e10;
                i7 = 0;
                this.W = i7;
                this.i.a("GL error", e);
                c cVar = this.s;
                if (cVar != null) {
                    rt rtVar = cVar.b;
                    ((t0) rtVar.b).i.post(new j0(rtVar, e, 1));
                }
            }
        } catch (RuntimeException e11) {
            e = e11;
            i7 = 0;
        }
    }

    public final long d() {
        return Math.max(this.p == 0 ? this.S + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.p), this.S + 1);
    }

    public final float e(long j3) {
        long max = Math.max(0L, j3 - this.Y);
        long max2 = Math.max(33L, this.b0) * 1000000;
        float f10 = ((this.N.a * 4.0f) / 48.0f) * 1.15f;
        if (max > max2) {
            return f10 * ((float) Math.sqrt((Math.log1p((max - max2) / max2) * 0.3499999940395355d) + 1.0d));
        }
        float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / max2));
        return (1.0f - (((max3 * max3) * max3) * max3)) * f10;
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
        boolean z9 = this.f;
        int i7 = z9 ? 2 : 1;
        int[] iArr4 = new int[i7];
        GLES20.glGenTextures(i7, iArr4, 0);
        int i10 = iArr4[0];
        this.D = i10;
        GLES20.glBindTexture(36197, i10);
        k(i10, this.j);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
        this.v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.v.setOnFrameAvailableListener(new p(this, 1), this.u);
        this.w = new Surface(this.v);
        if (z9) {
            int i11 = iArr4[1];
            this.E = i11;
            GLES20.glBindTexture(36197, i11);
            k(i11, this.j);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
            this.x = surfaceTexture2;
            surfaceTexture2.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
            this.x.setOnFrameAvailableListener(new p(this, 0), this.u);
            this.y = new Surface(this.x);
        }
        d0 d0Var = new d0(this.g, this.j, this.a, this.h);
        this.N = d0Var;
        int i12 = ((this.s0 % 360) + 360) % 360;
        if (d0Var.s != i12) {
            d0Var.s = i12;
            d0Var.v();
        }
        int i13 = this.g;
        GLES20.glViewport(0, 0, i13, i13);
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i7) {
        EGLDisplay eGLDisplay = this.z;
        int[] iArr = this.K;
        return !EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0) ? this.g : Math.max(1, iArr[0]);
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
        int i7 = this.f0;
        sb2.append(i7 != 0 ? Float.valueOf((this.g0 / i7) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.h0 / 1000000.0f);
        this.i.b(sb2.toString());
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
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
            z zVar = d0Var.j;
            if (zVar != null) {
                zVar.b();
            }
            d0Var.k.b();
            d0Var.l.b();
            d0Var.m.b();
            b3.h hVar = d0Var.n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = d0Var.u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.t;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i10 = this.D;
        if (i10 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i10}, 0);
            this.D = 0;
        }
        int i11 = this.E;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
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

    public final void j(int i7, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (!EGL14.eglMakeCurrent(this.z, eGLSurface, eGLSurface, this.A)) {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            d0 d0Var = this.N;
            int i10 = this.I;
            int i11 = this.J;
            d0Var.getClass();
            GLES20.glDisable(3042);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i10, i11);
            d0Var.c(d0Var.g, fArr);
            d0.d(i7);
            GLES20.glDrawArrays(5, 0, 4);
            if (!EGL14.eglSwapBuffers(this.z, this.C)) {
                throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            g();
        }
        Runnable runnable = this.v0;
        if (runnable != null) {
            this.v0 = null;
            runnable.run();
        }
    }

    public final void k(int i7, int i10) {
        GLES20.glBindTexture(36197, i7);
        int i11 = i10 == this.g ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.u;
        HandlerThread handlerThread = this.t;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
        }
        this.u = null;
        this.t = null;
        this.r0 = false;
        if (handler == null || handlerThread == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new s31(this, handlerThread, countDownLatch, 24));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void m(long j3) {
        this.S = j3;
        EGLExt.eglPresentationTimeANDROID(this.z, this.B, j3);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.z, this.B)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.m0++;
        long j10 = nanoTime2 - nanoTime;
        this.f0++;
        this.g0 += j10;
        this.h0 = Math.max(this.h0, j10);
        if (this.f0 % 30 == 0) {
            this.i.b("encoder swap: average=" + ((this.g0 / this.f0) / 1000000.0f) + " ms, max=" + (this.h0 / 1000000.0f) + " ms");
        }
        s sVar = this.r;
        if (sVar != null) {
            n nVar = (n) sVar;
            long j11 = nVar.C;
            int i7 = (int) (j11 % 256);
            nVar.l[i7] = j3 / 1000;
            nVar.m[i7] = nanoTime2;
            nVar.C = j11 + 1;
            synchronized (nVar) {
                if (nVar.u != null && !nVar.v) {
                    d dVar = nVar.u;
                    nVar.u = null;
                    nVar.f.b("first synchronized video frame submitted");
                    dVar.run();
                }
            }
        }
    }

    public final void n(Size size, int i7, boolean z9) {
        Handler handler = this.u;
        if (!this.r0 || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new r(this, size, i7, z9, runtimeExceptionArr, countDownLatch, 1));
        try {
            countDownLatch.await();
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Input size update was interrupted", e10);
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i7 = iArr[0];
            if (EGL14.eglQuerySurface(this.z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i7 > 0 && i10 > 0 && (i7 != this.G || i10 != this.H)) {
                    this.G = i7;
                    this.H = i10;
                    this.i.b("EGL output size changed: " + i7 + "x" + i10);
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
