// default package

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
import org.webrtc.EglBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xn9 {
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
    public ho9 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public byte W;
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
    public cp9 d0;
    public final Surface e;
    public cp9 e0;
    public final boolean f;
    public int f0;
    public final short g;
    public long g0;
    public final boolean h;
    public long h0;
    public final sn9 i;
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
    public final wn9 r;
    public volatile boolean r0;
    public final gn9 s;
    public volatile int s0;
    public HandlerThread t;
    public volatile boolean t0;
    public Handler u;
    public volatile dn9 u0;
    public SurfaceTexture v;
    public fn9 v0;
    public Surface w;
    public boolean w0;
    public SurfaceTexture x;
    public volatile RuntimeException x0;
    public Surface y;
    public final un9 y0;
    public volatile long q = Long.MAX_VALUE;
    public EGLDisplay z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    /* JADX WARN: Multi-variable type inference failed */
    public xn9(Size size, Surface surface, Surface surface2, boolean z, int i, int i2, boolean z2, boolean z3, sn9 sn9Var, wn9 wn9Var, gn9 gn9Var) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.y0 = new un9(this, (byte) 1);
        this.a = size;
        this.b = size;
        this.c = size;
        this.d = surface;
        this.e = surface2;
        this.f = z;
        this.g = i;
        this.j = i2;
        this.k = i2;
        this.l = i2;
        this.m = z2;
        this.n = z2;
        this.o = z2;
        this.h = z3;
        this.i = sn9Var;
        this.G = i;
        this.H = i;
        this.p = 0L;
        this.t0 = false;
        this.r = wn9Var;
        this.s = gn9Var;
    }

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        grb.k(c00.l(str, ": 0x"), Integer.toHexString(EGL14.eglGetError()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        if ((r0 % 60) == 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        long j;
        long j2;
        SurfaceTexture surfaceTexture = z ? this.x : this.v;
        if (!this.r0 || surfaceTexture == null) {
            return;
        }
        try {
            float[] fArr = z ? this.M : this.L;
            int i = z ? this.E : this.D;
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = surfaceTexture.getTimestamp();
            this.i0++;
            if (z) {
                j = this.k0 + 1;
                this.k0 = j;
            } else {
                j = this.j0 + 1;
                this.j0 = j;
            }
            if (j == 1) {
                this.i.b("first GL input frame: input=" + (z ? 1 : 0) + ", cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
            }
            if (z == this.F) {
                if (!this.t0) {
                    j(i, fArr);
                    dn9 dn9Var = this.u0;
                    if (this.w0 || dn9Var == null) {
                        return;
                    }
                    this.w0 = true;
                    dn9Var.run();
                    return;
                }
                if (this.m && timestamp < this.p) {
                    j(i, fArr);
                    long j3 = this.l0 + 1;
                    this.l0 = j3;
                    if (j3 == 1) {
                        this.i.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - this.p) / 1000));
                        return;
                    }
                    return;
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long j4 = this.P;
                if (j4 != 0) {
                    long j5 = elapsedRealtimeNanos - j4;
                    j2 = 0;
                    this.p0 = Math.max(this.p0, j5);
                    if (j5 > 50000000) {
                        this.o0++;
                    }
                } else {
                    j2 = 0;
                }
                long j6 = this.P;
                if (j6 != j2 && elapsedRealtimeNanos - j6 <= 50000000) {
                    int i2 = this.O;
                    this.O = i2 + 1;
                }
                o();
                this.P = elapsedRealtimeNanos;
                if (this.W == 0) {
                    this.T = true;
                    this.N.m(i, fArr, elapsedRealtimeNanos, this.G, this.H);
                    if (this.p != j2) {
                        if (this.m) {
                            timestamp = Math.max(j2, timestamp - this.p);
                        } else {
                            if (this.Q < j2) {
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
                    j(i, fArr);
                    return;
                }
                j(i, fArr);
                if (this.V) {
                    boolean z2 = this.U;
                    this.N.f(fArr, i, true);
                    this.U = true;
                    if (!z2) {
                        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                        float f = (elapsedRealtimeNanos2 - this.Y) / 1000000.0f;
                        int d = mp9.d(this.d0, this.e0, Math.round(f));
                        this.i.b("camera switch first new frame: waitMs=" + f + ", rollingAverageMs=" + d);
                        this.W = (byte) 3;
                        this.X = elapsedRealtimeNanos2;
                    }
                    byte b = this.W;
                    if (b == 3 || b == 4) {
                        Handler handler = this.u;
                        if (handler != null) {
                            handler.removeCallbacks(this.y0);
                        }
                        c();
                    }
                }
            }
        } catch (RuntimeException e) {
            this.i.a("GL error", e);
            pq8 pq8Var = this.s.b;
            ((jp9) pq8Var.b).i.post(new zo9(pq8Var, e, (byte) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[Catch: RuntimeException -> 0x014f, TryCatch #0 {RuntimeException -> 0x014f, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0039, B:14:0x0040, B:17:0x0097, B:19:0x00ba, B:20:0x00bd, B:24:0x00ca, B:26:0x00d0, B:28:0x00d4, B:29:0x00e2, B:30:0x00e4, B:31:0x0109, B:33:0x010d, B:35:0x0111, B:39:0x0119, B:40:0x0130, B:43:0x0143, B:47:0x0137, B:48:0x011f, B:54:0x0049, B:57:0x0059, B:59:0x0063, B:61:0x007a), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[Catch: RuntimeException -> 0x014f, TryCatch #0 {RuntimeException -> 0x014f, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0039, B:14:0x0040, B:17:0x0097, B:19:0x00ba, B:20:0x00bd, B:24:0x00ca, B:26:0x00d0, B:28:0x00d4, B:29:0x00e2, B:30:0x00e4, B:31:0x0109, B:33:0x010d, B:35:0x0111, B:39:0x0119, B:40:0x0130, B:43:0x0143, B:47:0x0137, B:48:0x011f, B:54:0x0049, B:57:0x0059, B:59:0x0063, B:61:0x007a), top: B:6:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        float f;
        float f2;
        long d;
        byte b;
        long j;
        long j2;
        long j3;
        ho9 ho9Var;
        if (!this.r0 || this.W == 0) {
            return;
        }
        byte b2 = 0;
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j4 = elapsedRealtimeNanos - this.X;
            byte b3 = this.W;
            if (b3 == 1) {
                this.c0 = e(elapsedRealtimeNanos);
                z = true;
                if (j4 >= Math.max(33L, this.b0) * 1000000) {
                    this.W = this.U ? (byte) 3 : (byte) 2;
                    this.X = elapsedRealtimeNanos;
                }
            } else {
                z = true;
                if (b3 == 2) {
                    this.c0 = e(elapsedRealtimeNanos);
                } else if (b3 == 3 || b3 == 4) {
                    long j5 = this.Z;
                    if (j4 < j5) {
                        float max = Math.max(0.0f, Math.min(1.0f, j4 / j5));
                        f2 = xnb.B(max, 2.0f, 3.0f, max * max);
                        f = 1.0f;
                    } else {
                        this.W = (byte) 4;
                        float max2 = Math.max(0.0f, Math.min(1.0f, (j4 - j5) / this.a0));
                        f = 1.0f - ((3.0f - (max2 * 2.0f)) * (max2 * max2));
                        f2 = 1.0f;
                    }
                    this.N.o(this.c0, f, f2, this.G, this.H);
                    this.n0++;
                    d = d();
                    if (d < this.q) {
                        m(d);
                    }
                    long j6 = this.Z + this.a0;
                    if (this.W == 4 && j4 >= j6) {
                        ho9Var = this.N;
                        if (ho9Var.C) {
                            if (ho9Var.e) {
                                ho9Var.w = ho9Var.z;
                                ho9Var.x = ho9Var.y;
                                ho9Var.B = z;
                                ho9Var.A = elapsedRealtimeNanos;
                            }
                            ho9Var.C = false;
                        }
                        this.W = (byte) 0;
                        this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
                    }
                    b = this.W;
                    if (b != 0 || this.u == null) {
                    }
                    if (this.U && (b == 3 || b == 4)) {
                        j2 = j6 - j4;
                        j3 = 70;
                        j = 33;
                    } else {
                        j = 33;
                        long max3 = Math.max(33L, this.b0);
                        Long.signum(max3);
                        j2 = (max3 * 1000000) - j4;
                        j3 = 33;
                    }
                    this.u.postDelayed(this.y0, Math.min(j3, this.W == 2 ? j : Math.max(1L, (j2 + 999999) / 1000000)));
                    return;
                }
            }
            f = 1.0f;
            f2 = 0.0f;
            this.N.o(this.c0, f, f2, this.G, this.H);
            this.n0++;
            d = d();
            if (d < this.q) {
            }
            long j62 = this.Z + this.a0;
            if (this.W == 4) {
                ho9Var = this.N;
                if (ho9Var.C) {
                }
                this.W = (byte) 0;
                this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
            }
            b = this.W;
            if (b != 0) {
            }
        } catch (RuntimeException e) {
            this.W = (byte) 0;
            this.i.a("GL error", e);
            pq8 pq8Var = this.s.b;
            ((jp9) pq8Var.b).i.post(new zo9(pq8Var, e, b2));
        }
    }

    public final long d() {
        return Math.max(this.p == 0 ? this.S + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.p), this.S + 1);
    }

    public final float e(long j) {
        long max = Math.max(0L, j - this.Y);
        long max2 = Math.max(33L, this.b0) * 1000000;
        float f = ((this.N.a * 4.0f) / 48.0f) * 1.15f;
        if (max > max2) {
            return f * ((float) Math.sqrt((Math.log1p((max - max2) / max2) * 0.3499999940395355d) + 1.0d));
        }
        float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / max2));
        return (1.0f - (((max3 * max3) * max3) * max3)) * f;
    }

    public final void f() {
        final byte b = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.z = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            grb.i("Unable to get EGL display");
            return;
        }
        int[] iArr = new int[2];
        final byte b2 = 1;
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            grb.i("Unable to initialize EGL");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            grb.i("Unable to choose EGL config");
            return;
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
        boolean z = this.f;
        int i = z ? 2 : 1;
        int[] iArr4 = new int[i];
        GLES20.glGenTextures(i, iArr4, 0);
        int i2 = iArr4[0];
        this.D = i2;
        GLES20.glBindTexture(36197, i2);
        k(i2, this.j);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
        this.v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.v.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: tn9
            public final /* synthetic */ xn9 b;

            {
                this.b = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                byte b3 = b;
                xn9 xn9Var = this.b;
                switch (b3) {
                    case 0:
                        xn9Var.b(false);
                        break;
                    default:
                        xn9Var.b(true);
                        break;
                }
            }
        }, this.u);
        this.w = new Surface(this.v);
        if (z) {
            int i3 = iArr4[1];
            this.E = i3;
            GLES20.glBindTexture(36197, i3);
            k(i3, this.j);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
            this.x = surfaceTexture2;
            surfaceTexture2.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
            this.x.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: tn9
                public final /* synthetic */ xn9 b;

                {
                    this.b = this;
                }

                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture22) {
                    byte b3 = b2;
                    xn9 xn9Var = this.b;
                    switch (b3) {
                        case 0:
                            xn9Var.b(false);
                            break;
                        default:
                            xn9Var.b(true);
                            break;
                    }
                }
            }, this.u);
            this.y = new Surface(this.x);
        }
        ho9 ho9Var = new ho9(this.g, this.j, this.a, this.h);
        this.N = ho9Var;
        int i4 = ((this.s0 % 360) + 360) % 360;
        if (ho9Var.s != i4) {
            ho9Var.s = i4;
            ho9Var.v();
        }
        short s = this.g;
        GLES20.glViewport(0, 0, s, s);
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        lq5.o(Integer.toHexString(EGL14.eglGetError()), "Unable to make EGL context current: 0x");
    }

    public final int h(EGLSurface eGLSurface, int i) {
        EGLDisplay eGLDisplay = this.z;
        int[] iArr = this.K;
        return !EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0) ? this.g : Math.max(1, iArr[0]);
    }

    public final void i() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.q0 == 0 ? 0L : System.nanoTime() - this.q0;
        StringBuilder sb = new StringBuilder("GL summary: inputFrames=");
        sb.append(this.i0);
        sb.append(", inputFps=");
        sb.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.i0 * 1.0E9d) / nanoTime));
        sb.append(", primaryInputFrames=");
        sb.append(this.j0);
        sb.append(", secondaryInputFrames=");
        sb.append(this.k0);
        sb.append(", preOriginFrames=");
        sb.append(this.l0);
        sb.append(", submittedFrames=");
        sb.append(this.m0);
        sb.append(", submittedFps=");
        sb.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.m0 * 1.0E9d) / nanoTime));
        sb.append(", syntheticFrames=");
        sb.append(this.n0);
        sb.append(", largeFrameGaps=");
        sb.append(this.o0);
        sb.append(", maxFrameGapMs=");
        sb.append(this.p0 / 1000000.0f);
        sb.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=0.0, swapAverageMs=");
        int i = this.f0;
        sb.append(i != 0 ? Float.valueOf((this.g0 / i) / 1000000.0f) : "n/a");
        sb.append(", swapMaxMs=");
        sb.append(this.h0 / 1000000.0f);
        this.i.b(sb.toString());
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
        ho9 ho9Var = this.N;
        if (ho9Var != null) {
            ho9Var.g.b();
            ho9Var.h.b();
            eo9 eo9Var = ho9Var.i;
            if (eo9Var != null) {
                eo9Var.b();
            }
            do9 do9Var = ho9Var.j;
            if (do9Var != null) {
                do9Var.b();
            }
            ho9Var.k.b();
            ho9Var.l.b();
            ho9Var.m.b();
            rc0 rc0Var = ho9Var.n;
            if (rc0Var != null) {
                rc0Var.b();
            }
            int[] iArr = ho9Var.u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = ho9Var.t;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i2 = this.D;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.D = 0;
        }
        int i3 = this.E;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
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

    public final void j(int i, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (!EGL14.eglMakeCurrent(this.z, eGLSurface, eGLSurface, this.A)) {
                lq5.o(Integer.toHexString(EGL14.eglGetError()), "Unable to make preview EGL surface current: 0x");
                return;
            }
            ho9 ho9Var = this.N;
            int i2 = this.I;
            int i3 = this.J;
            ho9Var.getClass();
            GLES20.glDisable(3042);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            ho9Var.b(ho9Var.g, fArr);
            ho9.c(i);
            GLES20.glDrawArrays(5, 0, 4);
            if (!EGL14.eglSwapBuffers(this.z, this.C)) {
                lq5.o(Integer.toHexString(EGL14.eglGetError()), "Unable to swap preview EGL buffers: 0x");
                return;
            }
            g();
        }
        fn9 fn9Var = this.v0;
        if (fn9Var != null) {
            this.v0 = null;
            fn9Var.run();
        }
    }

    public final void k(int i, int i2) {
        GLES20.glBindTexture(36197, i);
        int i3 = i2 == this.g ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i3);
        GLES20.glTexParameteri(36197, 10240, i3);
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
        handler.post(new sa8(this, handlerThread, countDownLatch, (byte) 25));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void m(long j) {
        this.S = j;
        EGLExt.eglPresentationTimeANDROID(this.z, this.B, j);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.z, this.B)) {
            lq5.o(Integer.toHexString(EGL14.eglGetError()), "Unable to swap EGL buffers: 0x");
            return;
        }
        long nanoTime2 = System.nanoTime();
        this.m0++;
        long j2 = nanoTime2 - nanoTime;
        this.f0++;
        this.g0 += j2;
        this.h0 = Math.max(this.h0, j2);
        if (this.f0 % 30 == 0) {
            this.i.b("encoder swap: average=" + ((this.g0 / this.f0) / 1000000.0f) + " ms, max=" + (this.h0 / 1000000.0f) + " ms");
        }
        wn9 wn9Var = this.r;
        if (wn9Var != null) {
            rn9 rn9Var = (rn9) wn9Var;
            long j3 = rn9Var.C;
            int i = (int) (j3 % 256);
            rn9Var.l[i] = j / 1000;
            rn9Var.m[i] = nanoTime2;
            rn9Var.C = j3 + 1;
            synchronized (rn9Var) {
                if (rn9Var.u == null || rn9Var.v) {
                    return;
                }
                hn9 hn9Var = rn9Var.u;
                rn9Var.u = null;
                rn9Var.f.b("first synchronized video frame submitted");
                hn9Var.run();
            }
        }
    }

    public final void n(Size size, int i, boolean z) {
        Handler handler = this.u;
        if (!this.r0 || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new vn9(this, size, i, z, runtimeExceptionArr, countDownLatch, (byte) 1));
        try {
            countDownLatch.await();
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            su3.f("Input size update was interrupted", e);
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i = iArr[0];
            if (EGL14.eglQuerySurface(this.z, this.B, 12374, iArr, 0)) {
                int i2 = iArr[0];
                if (i > 0 && i2 > 0 && (i != this.G || i2 != this.H)) {
                    this.G = i;
                    this.H = i2;
                    this.i.b("EGL output size changed: " + i + "x" + i2);
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
