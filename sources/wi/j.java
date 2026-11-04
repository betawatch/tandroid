package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import b8.ke;
import gi.m3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.up0;
import org.telegram.ui.a60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j {
    public CameraCaptureSession A;
    public boolean A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public long D0;
    public w E;
    public boolean E0;
    public volatile m0 F;
    public long F0;
    public m0 G;
    public long G0;
    public m0 H;
    public long H0;
    public n0 I;
    public long I0;
    public o0 J;
    public long J0;
    public Range K;
    public long K0;
    public l6.n L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public long O0;
    public boolean P;
    public double P0;
    public boolean Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public int U;
    public long U0;
    public volatile boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public long Y0;
    public boolean Z;
    public long Z0;
    public final Context a;
    public volatile boolean a0;
    public long a1;
    public final CameraManager b;
    public volatile boolean b0;
    public long b1;
    public final TextureView c;
    public volatile boolean c0;
    public long c1;
    public final r0 d;
    public boolean d0;
    public long d1;
    public final int e;
    public boolean e0;
    public double e1;
    public final int f;
    public boolean f0;
    public long f1;
    public final n0 g;
    public boolean g0;
    public long g1;
    public final o0 h;
    public boolean h0;
    public long h1;
    public final boolean i;
    public int i0;
    public long i1;
    public final n j;
    public i j0;
    public long j1;
    public final nh k;
    public i k0;
    public long k1;
    public boolean l0;
    public long l1;
    public HandlerThread m;
    public boolean m0;
    public final m3 m1;
    public Handler n;
    public boolean n0;
    public final a n1;
    public String o;
    public boolean o0;
    public final a o1;
    public CameraCharacteristics p;
    public boolean p0;
    public final s30 p1;
    public Size q;
    public boolean q0;
    public final e q1;
    public volatile Size r;
    public boolean r0;
    public final e r1;
    public volatile int s;
    public boolean s0;
    public final f s1;
    public Surface t;
    public CameraDevice t0;
    public final f t1;
    public Surface u;
    public CameraDevice u0;
    public final g u1;
    public Surface v;
    public CameraDevice v0;
    public s w;
    public CameraDevice w0;
    public m x;
    public i x0;
    public m y;
    public m0 y0;
    public CameraDevice z;
    public boolean z0;
    public final Rect l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i3, n0 n0Var, o0 o0Var, boolean z10, n nVar, nh nhVar) {
        m3 m3Var = new m3(this, 2);
        this.m1 = m3Var;
        this.n1 = new a(this, 4);
        this.o1 = new a(this, 5);
        this.p1 = new s30(this, 4);
        this.q1 = new e(this, 0);
        this.r1 = new e(this, 1);
        this.s1 = new f(this, 0);
        this.t1 = new f(this, 1);
        this.u1 = new g(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = r0Var;
        this.e = r0Var.a;
        this.f = i3;
        this.g = n0Var;
        this.h = o0Var;
        this.i = z10;
        this.j = nVar;
        this.k = nhVar;
        textureView.addOnLayoutChangeListener(m3Var);
    }

    public static Range C(Range[] rangeArr, int i3) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i10 = i3 / 2;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i3))) {
                if (((Integer) range3.getUpper()).intValue() == i3 && ((Integer) range3.getLower()).intValue() >= i10 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        return range != null ? range : range2;
    }

    public static boolean D(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public static int V(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float W(double d, long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        double d10 = j11;
        double d11 = j10 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(j jVar) {
        CameraDevice cameraDevice = jVar.z;
        CameraDevice cameraDevice2 = jVar.t0;
        if (!jVar.n0 || cameraDevice == null || cameraDevice2 == null || jVar.u == null || jVar.v == null || jVar.A != null || jVar.B != null) {
            return;
        }
        jVar.p0 = false;
        jVar.q0 = false;
        try {
            jVar.H0 = SystemClock.elapsedRealtimeNanos();
            jVar.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.r + ", fpsRange=" + jVar.K);
            cameraDevice.createCaptureSession(Arrays.asList(jVar.u), jVar.t1, jVar.n);
            cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.s1, jVar.n);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            jVar.A("session request failed", e10, false);
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z10 = cameraDevice == jVar.z;
        if (!z10 && jVar.n0) {
            n nVar = jVar.j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            nVar.b(sb2.toString());
            jVar.n0 = false;
            jVar.l0 = false;
            jVar.m0 = true;
            jVar.s0 = false;
            jVar.t0 = null;
            jVar.x0 = null;
            jVar.r();
            jVar.u0 = cameraDevice;
            jVar.z0 = jVar.V && jVar.z != null && jVar.A == null && !jVar.X;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.t0) {
            jVar.t0 = null;
        }
        jVar.s0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(t4.c.f("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.y0 != null) {
            jVar.t();
            return;
        }
        if (!jVar.V || jVar.z == null || jVar.A != null || jVar.X) {
            return;
        }
        jVar.j.b("warm camera failed during startup; configuring active camera only");
        jVar.u();
    }

    public static String c(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static boolean d(j jVar, CameraDevice cameraDevice) {
        if (!jVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == jVar.v0) {
            jVar.v0 = null;
        }
        if (cameraDevice == jVar.w0) {
            jVar.w0 = null;
        }
        n nVar = jVar.j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.v0;
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.w0;
        sb2.append(cameraDevice3 != null ? cameraDevice3.getId() : "none");
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.u0) {
            return false;
        }
        jVar.u0 = null;
        jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
        if (!jVar.z0) {
            if (!jVar.X || jVar.y0 == null) {
                return true;
            }
            jVar.j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        }
        jVar.z0 = false;
        if (!jVar.V || jVar.b0 || jVar.z == null) {
            return true;
        }
        jVar.j.b("retrying capture session after standby camera closed");
        jVar.u();
        return true;
    }

    public static void f(j jVar) {
        m0 m0Var = jVar.y0;
        if (m0Var != null && jVar.n0 && jVar.p0 && jVar.q0) {
            jVar.y0 = null;
            if (jVar.b0(m0Var)) {
                return;
            }
            jVar.X = false;
            jVar.a0(m0Var);
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        return (j10 / j11) / 1000000.0f;
    }

    public static l6.n m(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i3;
        l6.n o10;
        n0 n0Var2;
        l6.n o11;
        n0 n0Var3 = n0.c;
        if (n0Var == n0Var3) {
            i3 = r0Var.a;
        } else {
            r0 r0Var2 = r0.b;
            n0 n0Var4 = n0.a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i3 = 960;
                }
                i3 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i3 = 540;
                }
                i3 = 720;
            }
        }
        l6.n o12 = o(sizeArr, i3, n0Var);
        if (o12 != null) {
            return o12;
        }
        if (r0Var == r0.c && n0Var == (n0Var2 = n0.b) && (o11 = o(sizeArr, 480, n0Var2)) != null) {
            return o11;
        }
        int i10 = r0Var.a;
        if (n0Var != n0Var3 && (o10 = o(sizeArr, i10, n0Var3)) != null) {
            return o10;
        }
        int i11 = r0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || i(size2) < i(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (V(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && i(size3) < i(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new l6.n(n(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size n(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(V(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(i(size3), i(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static l6.n o(Size[] sizeArr, int i3, n0 n0Var) {
        int compare;
        l6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i3 * 15) / 100) + i3;
            int min = Math.min(1920, i3 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i3 && V <= i10 && max <= min) {
                Size n4 = n(sizeArr, size);
                l6.n nVar2 = new l6.n(n4, size, n0Var, i3);
                if (nVar != null) {
                    Size size2 = (Size) nVar.b;
                    int abs = Math.abs(Math.min(n4.getWidth(), n4.getHeight()) - 720);
                    Size size3 = (Size) nVar.c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i11 = i(size) + i(n4);
                        long i12 = i(size3) + i(size2);
                        compare = i11 != i12 ? Long.compare(i11, i12) : Long.compare(i(size), i(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                nVar = nVar2;
            }
        }
        return nVar;
    }

    public static boolean s(int[] iArr, int i3) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j10) {
        if (j10 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.n0) {
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            this.j.b(sb2.toString());
            this.n0 = false;
            this.l0 = false;
            this.m0 = true;
            this.p0 = false;
            this.q0 = false;
            if (!z10 || this.A == null) {
                L("DUAL_ACTIVE ".concat(str), exc);
                return;
            }
            r();
            CameraDevice cameraDevice = this.t0;
            this.t0 = null;
            this.x0 = null;
            if (cameraDevice != null) {
                this.u0 = cameraDevice;
                cameraDevice.close();
            }
            if (this.u0 == null && this.X && this.y0 != null) {
                t();
            }
        }
    }

    public final void B(String str, Exception exc) {
        String str2;
        boolean z10;
        m mVar = this.x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.E;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f0 = true;
        this.h0 = true;
        q();
        l6.n nVar = this.L;
        if (nVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.K = C(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) nVar.b;
        this.r = (Size) nVar.c;
        this.s = nVar.a;
        this.I = (n0) nVar.d;
        this.j0 = null;
        this.k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        s sVar = this.w;
        if (sVar != null) {
            sVar.l();
            this.w = null;
        }
        m mVar2 = this.x;
        if (mVar2 != null) {
            mVar2.u();
            this.x = null;
        }
        this.u = null;
        try {
            v();
            O();
            n nVar2 = this.j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.q);
            sb2.append(", recording=");
            sb2.append(this.r);
            sb2.append(", crop=");
            sb2.append(this.s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar2.b(sb2.toString());
            Handler handler = this.n;
            if (!this.V || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e10) {
            N(e10);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        return this.G == m0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            return cameraDevice == this.v0 || cameraDevice == this.w0;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.v0 == null && this.w0 == null) {
            this.A0 = false;
            this.X = false;
            this.j.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (!this.V || this.b0) {
                return;
            }
            I();
        }
    }

    public final void I() {
        if (this.V && !this.W && this.z == null) {
            if (f0.d.b(this.a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.d.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            boolean z10 = false;
            try {
                this.D0 = SystemClock.elapsedRealtimeNanos();
                S(this.F);
                long z11 = z(this.D0);
                if (this.z == null && this.x == null) {
                    K();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                if (this.n0) {
                    int max = Math.max(1, Math.min(720, Math.min(this.c.getWidth(), this.c.getHeight())));
                    surfaceTexture.setDefaultBufferSize(max, max);
                } else {
                    surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                }
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.x == null) {
                    w(surfaceTexture);
                } else {
                    s sVar = this.w;
                    if (sVar != null) {
                        sVar.n(this.r, this.s, D(this.p));
                        Surface surface = null;
                        if (!this.n0 && this.r0) {
                            this.r0 = false;
                            s sVar2 = this.w;
                            Handler handler = sVar2.u;
                            if (sVar2.r0 && handler != null) {
                                handler.post(new a60(sVar2, z10, surface, 17));
                            }
                        }
                        s sVar3 = this.w;
                        Surface surface2 = sVar3.w;
                        if (surface2 == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface2;
                        if (this.n0 && (!sVar3.f || (surface = sVar3.y) == null)) {
                            throw new IllegalStateException("Secondary GL camera surface is unavailable");
                        }
                        this.v = surface;
                    }
                }
                J();
                this.W = true;
                this.G0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s + ", selectionElapsedMs=" + z11 + ", dualActive=" + this.n0);
                this.b.openCamera(this.o, this.q1, this.n);
            } catch (Exception e10) {
                this.W = false;
                N(e10);
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        if (!this.l0 || this.m0 || (z10 = this.s0) || (cameraDevice = this.t0) != null) {
            return;
        }
        m0 m0Var = this.H;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.j0 : this.k0;
        if (iVar != null) {
            String str = iVar.a;
            if (z10 || cameraDevice != null) {
                return;
            }
            try {
                this.x0 = iVar;
                this.s0 = true;
                this.B0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + iVar.b);
                this.b.openCamera(str, this.r1, this.n);
            } catch (Exception e10) {
                this.s0 = false;
                y("open request failed", e10);
            }
        }
    }

    public final void K() {
        if (this.m0) {
            return;
        }
        if (this.l0) {
            this.n0 = true;
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        n nVar = this.j;
        if (i3 < 30) {
            this.m0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l10 = l();
        o0 o0Var = l10.h;
        String str = l10.a;
        m0 m0Var = l10.b;
        m0 m0Var2 = m0.a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.b;
        }
        try {
            try {
                S(m0Var2);
                i l11 = l();
                o0 o0Var2 = l11.h;
                String str2 = l11.a;
                boolean E = E(str, str2);
                this.l0 = E;
                if (E && o0Var != o0Var2) {
                    this.l0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l10.e + "/" + l10.f + ", second=" + l11.e + "/" + l11.f + ", firstFps=" + o0Var.a + ", secondFps=" + o0Var2.a);
                }
                boolean z10 = this.l0;
                if (!z10) {
                    this.m0 = true;
                }
                this.n0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.l0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.l0 ? "" : ", reason=pair not advertised");
                nVar.b(sb2.toString());
                h(l10);
            } catch (Exception e10) {
                this.m0 = true;
                nVar.b("camera warm-switch capability unavailable: " + e10);
                h(l10);
            }
        } catch (Throwable th2) {
            h(l10);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String str2;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.m0 = true;
        this.l0 = false;
        this.z0 = false;
        this.y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        this.v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.t0;
        this.w0 = cameraDevice2;
        this.z = null;
        this.t0 = null;
        this.x0 = null;
        CameraDevice cameraDevice3 = this.u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.u0 = null;
        }
        n nVar = this.j;
        StringBuilder u10 = a1.g.u("camera warm-switch recovery started: reason=", str, ", target=");
        u10.append(this.F);
        u10.append(", targetId=");
        CameraDevice cameraDevice4 = this.v0;
        u10.append(cameraDevice4 == null ? "none" : cameraDevice4.getId());
        u10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.w0;
        u10.append(cameraDevice5 != null ? cameraDevice5.getId() : "none");
        u10.append(", fps=");
        o0 o0Var = this.J;
        u10.append(o0Var == null ? "unknown" : Integer.valueOf(o0Var.a));
        u10.append(", switchElapsedMs=");
        u10.append(z(this.I0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        u10.append(str2);
        nVar.b(u10.toString());
        CameraDevice cameraDevice6 = this.v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.w0;
        if (cameraDevice7 != null && cameraDevice7 != this.v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.m1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new u9.a(19, this, handlerThread));
    }

    public final void N(Exception exc) {
        this.j.a("camera error", exc);
        nh nhVar = this.k;
        ((t0) nhVar.b).i.post(new j0(nhVar, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0L;
        this.c1 = 0L;
        this.d1 = 0L;
        this.e1 = 0.0d;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
        this.j1 = 0L;
        this.k1 = 0L;
        this.l1 = 0L;
    }

    public final void P() {
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0.0d;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
    }

    public final p7.d Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, l6.n nVar) {
        Range[] rangeArr;
        l6.n nVar2;
        int i3;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar3 = this.j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.b;
        if (o0Var == o0Var2) {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i3 = 30;
        } else {
            if (!this.h0) {
                int i10 = o0Var.a;
                Range C = C(rangeArr4, i10);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        Size size = sizeArr[i11];
                        int i12 = i11;
                        int i13 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i10) {
                                rangeArr4 = rangeArr3;
                                length = i13;
                                i11 = i12 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i13;
                        i11 = i12 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        l6.n m10 = m(sizeArr2, this.d, this.g);
                        nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new p7.d(o0.c, C, m10, 18);
                    } catch (RuntimeException unused) {
                        nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + C2);
                return new p7.d(o0Var2, C2, nVar, 18);
            }
            rangeArr = rangeArr4;
            i3 = 30;
            nVar2 = nVar;
        }
        Range C3 = C(rangeArr, i3);
        StringBuilder u10 = a1.g.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        u10.append(this.h0 ? ", reason=session-wide fallback" : "");
        nVar3.b(u10.toString());
        return new p7.d(o0Var2, C3, nVar2, 18);
    }

    public final void R(String str, Exception exc) {
        this.z0 = true;
        y(str, exc);
        if (this.u0 == null) {
            this.z0 = false;
            u();
        } else {
            this.j.b("capture session retry waiting for standby camera close: id=" + this.u0.getId());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        if ((r32 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r14.c).get(r9))) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
    
        if ((r32 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r15.c).get(r9))) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(m0 m0Var) {
        m0 m0Var2;
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        String str;
        long outputMinFrameDuration2;
        String str2;
        int i3;
        i l10;
        CameraCharacteristics.Key key;
        int i10;
        int i11;
        String[] strArr;
        int i12;
        ke keVar;
        String str3;
        String str4;
        p7.d Q;
        ke keVar2;
        n nVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        o0 o0Var;
        m0 m0Var3 = m0.b;
        m0 m0Var4 = m0.a;
        i iVar = m0Var == m0Var4 ? this.j0 : this.k0;
        String str5 = ", facing=";
        if (iVar != null) {
            h(iVar);
            this.j.b("camera outputs restored from cache: id=" + iVar.a + ", facing=" + m0Var + ", preview=" + iVar.d + ", recording=" + iVar.e + ", fps=" + iVar.h.a);
            return;
        }
        boolean z10 = true;
        if (!this.g0) {
            this.g0 = true;
            if (this.h == o0.c) {
                boolean Z = Z(m0Var4);
                boolean Z2 = Z(m0Var3);
                this.h0 = (Z && Z2) ? false : true;
                n nVar2 = this.j;
                StringBuilder sb3 = new StringBuilder("60 fps session capability: front=");
                sb3.append(Z);
                sb3.append(", back=");
                sb3.append(Z2);
                sb3.append(", selected=");
                sb3.append(this.h0 ? 30 : 60);
                nVar2.b(sb3.toString());
            }
        }
        int i13 = m0Var == m0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        ke keVar3 = null;
        ke keVar4 = null;
        int i14 = 0;
        while (true) {
            m0Var2 = m0Var4;
            if (i14 >= length) {
                break;
            }
            String str6 = cameraIdList[i14];
            String[] strArr2 = cameraIdList;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str6);
            int i15 = length;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i13) {
                i10 = i13;
                i11 = i14;
                strArr = strArr2;
                i12 = i15;
                keVar = keVar3;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i11 = i14;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str6 + ", reason=no stream map");
                    i10 = i13;
                    keVar = keVar3;
                    strArr = strArr2;
                    i12 = i15;
                } else {
                    int i16 = i13;
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        strArr = strArr2;
                        i12 = i15;
                        i10 = i16;
                        keVar = keVar3;
                        str3 = str5;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            try {
                                l6.n m10 = m(outputSizes, this.d, this.g);
                                str4 = "camera candidate rejected: id=";
                                strArr = strArr2;
                                i12 = i15;
                                i10 = i16;
                                str6 = str6;
                                keVar = keVar3;
                                try {
                                    Q = Q(str6, cameraCharacteristics, streamConfigurationMap2, outputSizes, m10);
                                    try {
                                        keVar2 = new ke(str6, cameraCharacteristics, outputSizes, m10, Q, 20);
                                        nVar = this.j;
                                        sb2 = new StringBuilder();
                                        sb2.append("camera candidate accepted: id=");
                                        sb2.append(str6);
                                        sb2.append(str5);
                                        sb2.append(m0Var);
                                        sb2.append(", flashAvailable=");
                                        bool = Boolean.TRUE;
                                        key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                        str3 = str5;
                                    } catch (RuntimeException e10) {
                                        e = e10;
                                        str6 = str6;
                                        str3 = str5;
                                        this.j.b(str4 + str6 + ", reason=" + e);
                                        keVar3 = keVar;
                                        i14 = i11 + 1;
                                        m0Var4 = m0Var2;
                                        str5 = str3;
                                        i13 = i10;
                                        cameraIdList = strArr;
                                        length = i12;
                                        z10 = true;
                                    }
                                    try {
                                        sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                                        sb2.append(", fps=");
                                        sb2.append(((o0) Q.b).a);
                                        sb2.append(", preview=");
                                        sb2.append((Size) ((l6.n) Q.c).b);
                                        sb2.append(", recording=");
                                        sb2.append((Size) ((l6.n) Q.c).c);
                                        nVar.b(sb2.toString());
                                        if (keVar4 != null) {
                                        }
                                        keVar4 = keVar2;
                                        o0Var = this.h;
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        this.j.b(str4 + str6 + ", reason=" + e);
                                        keVar3 = keVar;
                                        i14 = i11 + 1;
                                        m0Var4 = m0Var2;
                                        str5 = str3;
                                        i13 = i10;
                                        cameraIdList = strArr;
                                        length = i12;
                                        z10 = true;
                                    }
                                } catch (RuntimeException e12) {
                                    e = e12;
                                }
                            } catch (RuntimeException e13) {
                                e = e13;
                                str4 = "camera candidate rejected: id=";
                                strArr = strArr2;
                                i12 = i15;
                                i10 = i16;
                                str6 = str6;
                                keVar = keVar3;
                                str3 = str5;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                keVar3 = keVar;
                                i14 = i11 + 1;
                                m0Var4 = m0Var2;
                                str5 = str3;
                                i13 = i10;
                                cameraIdList = strArr;
                                length = i12;
                                z10 = true;
                            }
                        } catch (RuntimeException e14) {
                            e = e14;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i12 = i15;
                            i10 = i16;
                        }
                        if (o0Var == o0.b || ((o0) Q.b) == o0Var) {
                            if (keVar != null) {
                            }
                            keVar3 = keVar2;
                            i14 = i11 + 1;
                            m0Var4 = m0Var2;
                            str5 = str3;
                            i13 = i10;
                            cameraIdList = strArr;
                            length = i12;
                            z10 = true;
                        }
                    }
                    keVar3 = keVar;
                    i14 = i11 + 1;
                    m0Var4 = m0Var2;
                    str5 = str3;
                    i13 = i10;
                    cameraIdList = strArr;
                    length = i12;
                    z10 = true;
                }
            }
            str3 = str5;
            keVar3 = keVar;
            i14 = i11 + 1;
            m0Var4 = m0Var2;
            str5 = str3;
            i13 = i10;
            cameraIdList = strArr;
            length = i12;
            z10 = true;
        }
        ke keVar5 = keVar3;
        String str7 = str5;
        ke keVar6 = keVar5 == null ? keVar4 : keVar5;
        if (keVar6 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) keVar6.b;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) keVar6.c;
        Size[] sizeArr = (Size[]) keVar6.d;
        l6.n nVar3 = (l6.n) keVar6.e;
        p7.d dVar = (p7.d) keVar6.f;
        l6.n nVar4 = (l6.n) dVar.c;
        this.o = str8;
        this.H = m0Var;
        this.p = cameraCharacteristics2;
        this.J = (o0) dVar.b;
        this.K = (Range) dVar.d;
        this.f0 = false;
        this.L = nVar3;
        O();
        this.q = (Size) nVar4.b;
        this.r = (Size) nVar4.c;
        this.s = nVar4.a;
        this.I = (n0) nVar4.d;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            Range range = (Range) cameraCharacteristics2.get(key);
            if (range != null) {
                floatValue = ((Float) range.getUpper()).floatValue();
            }
            floatValue = 1.0f;
        } else {
            Float f10 = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f10 != null) {
                floatValue = f10.floatValue();
            }
            floatValue = 1.0f;
        }
        this.O = Math.max(1.0f, Math.min(4.0f, floatValue));
        Size size = this.q;
        StreamConfigurationMap streamConfigurationMap3 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap3 != null) {
            try {
                outputMinFrameDuration = streamConfigurationMap3.getOutputMinFrameDuration(SurfaceTexture.class, size);
            } catch (RuntimeException unused) {
            }
            Size size2 = this.r;
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                try {
                    str = ", flashAvailable=";
                    outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                } catch (RuntimeException unused2) {
                }
                n nVar5 = this.j;
                String str9 = str;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", cameraMode=");
                sb4.append(this.I);
                if (this.I != this.g) {
                    str2 = " (fallback from " + this.g + ")";
                } else {
                    str2 = "";
                }
                sb4.append(str2);
                sb4.append(", crop=");
                sb4.append(this.s);
                sb4.append(", preview=");
                sb4.append(this.q);
                sb4.append(", recording=");
                sb4.append(this.r);
                sb4.append(", previewMinFrameDurationNs=");
                sb4.append(outputMinFrameDuration);
                sb4.append(", recordingMinFrameDurationNs=");
                sb4.append(outputMinFrameDuration2);
                sb4.append(", fps=");
                sb4.append(this.J.a);
                sb4.append(", fpsRange=");
                sb4.append(this.K);
                sb4.append(", timestampSource=");
                sb4.append(D(this.p) ? "REALTIME" : "UNKNOWN");
                sb4.append(this.J != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                nVar5.b(sb4.toString());
                if (m0Var == m0Var2) {
                    if (!this.d0) {
                        i3 = 1;
                        this.d0 = true;
                        Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                        Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                        Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        n nVar6 = this.j;
                        StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                        sb5.append(str8);
                        sb5.append(str7);
                        sb5.append(m0Var);
                        sb5.append(", hardwareLevel=");
                        sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == i3 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i17 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                        sb5.append(", sensorOrientation=");
                        sb5.append(num3);
                        sb5.append(", activeArray=");
                        sb5.append(rect);
                        sb5.append(str9);
                        sb5.append(bool2);
                        sb5.append(", aeModes=");
                        sb5.append(Arrays.toString(iArr));
                        sb5.append(", fpsRanges=");
                        sb5.append(Arrays.toString(rangeArr));
                        sb5.append(", outputSizes=");
                        sb5.append(Arrays.toString(sizeArr));
                        nVar6.b(sb5.toString());
                    }
                    l10 = l();
                    if (l10.b != m0Var2) {
                        this.j0 = l10;
                        return;
                    } else {
                        this.k0 = l10;
                        return;
                    }
                }
                i3 = 1;
                if (!this.e0) {
                    this.e0 = true;
                    Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    n nVar62 = this.j;
                    StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
                    sb52.append(str8);
                    sb52.append(str7);
                    sb52.append(m0Var);
                    sb52.append(", hardwareLevel=");
                    sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == i3 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i17 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
                    sb52.append(", sensorOrientation=");
                    sb52.append(num32);
                    sb52.append(", activeArray=");
                    sb52.append(rect2);
                    sb52.append(str9);
                    sb52.append(bool22);
                    sb52.append(", aeModes=");
                    sb52.append(Arrays.toString(iArr2));
                    sb52.append(", fpsRanges=");
                    sb52.append(Arrays.toString(rangeArr2));
                    sb52.append(", outputSizes=");
                    sb52.append(Arrays.toString(sizeArr));
                    nVar62.b(sb52.toString());
                }
                l10 = l();
                if (l10.b != m0Var2) {
                }
            }
            str = ", flashAvailable=";
            outputMinFrameDuration2 = -1;
            n nVar52 = this.j;
            String str92 = str;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", cameraMode=");
            sb42.append(this.I);
            if (this.I != this.g) {
            }
            sb42.append(str2);
            sb42.append(", crop=");
            sb42.append(this.s);
            sb42.append(", preview=");
            sb42.append(this.q);
            sb42.append(", recording=");
            sb42.append(this.r);
            sb42.append(", previewMinFrameDurationNs=");
            sb42.append(outputMinFrameDuration);
            sb42.append(", recordingMinFrameDurationNs=");
            sb42.append(outputMinFrameDuration2);
            sb42.append(", fps=");
            sb42.append(this.J.a);
            sb42.append(", fpsRange=");
            sb42.append(this.K);
            sb42.append(", timestampSource=");
            sb42.append(D(this.p) ? "REALTIME" : "UNKNOWN");
            sb42.append(this.J != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            nVar52.b(sb42.toString());
            if (m0Var == m0Var2) {
            }
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        str = ", flashAvailable=";
        outputMinFrameDuration2 = -1;
        n nVar522 = this.j;
        String str922 = str;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", cameraMode=");
        sb422.append(this.I);
        if (this.I != this.g) {
        }
        sb422.append(str2);
        sb422.append(", crop=");
        sb422.append(this.s);
        sb422.append(", preview=");
        sb422.append(this.q);
        sb422.append(", recording=");
        sb422.append(this.r);
        sb422.append(", previewMinFrameDurationNs=");
        sb422.append(outputMinFrameDuration);
        sb422.append(", recordingMinFrameDurationNs=");
        sb422.append(outputMinFrameDuration2);
        sb422.append(", fps=");
        sb422.append(this.J.a);
        sb422.append(", fpsRange=");
        sb422.append(this.K);
        sb422.append(", timestampSource=");
        sb422.append(D(this.p) ? "REALTIME" : "UNKNOWN");
        sb422.append(this.J != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        nVar522.b(sb422.toString());
        if (m0Var == m0Var2) {
        }
    }

    public final void T(boolean z10) {
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return;
        }
        handler.post(new up0(16, this, z10));
    }

    public final boolean U(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.o1);
        handler.post(this.o1);
        return true;
    }

    public final void X(w wVar, long j10, m0 m0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.E = wVar;
        this.M = j10;
        this.F = m0Var;
        this.V = true;
        this.b0 = false;
        this.f0 = false;
        this.y = null;
        this.c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        this.j.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.p1);
        Handler handler = this.n;
        if (this.V && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.n;
        if (!this.V || this.b0 || handler == null) {
            return false;
        }
        this.b0 = true;
        this.c0 = false;
        this.j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(m0 m0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i3 = m0Var == m0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i3 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.g)).b) == o0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(m0 m0Var) {
        m0 m0Var2;
        i iVar;
        if (!this.V || this.X || m0Var == this.G) {
            return;
        }
        this.X = true;
        this.Z = true;
        this.P = false;
        this.Q = false;
        this.N = 0.0f;
        nh nhVar = this.k;
        ((t0) nhVar.b).i.post(new u9.a(21, nhVar, m0Var));
        this.I0 = SystemClock.elapsedRealtimeNanos();
        this.E0 = false;
        this.j.b("camera device switch started: from=" + this.G + ", to=" + m0Var);
        if (b0(m0Var)) {
            return;
        }
        if (this.n0) {
            this.y0 = m0Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        s sVar = this.w;
        if (sVar != null) {
            m0 m0Var3 = this.G;
            Handler handler = sVar.u;
            if (sVar.r0 && handler != null) {
                m0Var2 = m0Var;
                handler.post(new ui.b(sVar, m0Var3, m0Var2, handler, 1));
                if (c0(m0Var2)) {
                    if (!this.s0 || (iVar = this.x0) == null || iVar.b != m0Var2) {
                        t();
                        return;
                    } else {
                        this.y0 = m0Var2;
                        this.j.b("camera switch path: waiting for warm device open");
                        return;
                    }
                }
                return;
            }
        }
        m0Var2 = m0Var;
        if (c0(m0Var2)) {
        }
    }

    public final boolean b0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        CaptureRequest.Builder x10;
        if (!this.n0 || !this.p0 || !this.q0 || (cameraDevice = this.z) == null || (cameraDevice2 = this.t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.x0) == null || iVar.b != m0Var || this.w == null) {
            return false;
        }
        this.z = cameraDevice2;
        this.t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.u;
        this.u = this.v;
        this.v = surface;
        this.x0 = this.G == m0.a ? this.j0 : this.k0;
        h(iVar);
        this.G = m0Var;
        boolean z10 = true;
        try {
            try {
                x10 = x(this.z, this.u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.u1, this.n);
            i iVar2 = this.x0;
            if (iVar2 != null) {
                CaptureRequest.Builder x11 = x(this.t0, this.v, iVar2, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.u1, this.n);
            }
            boolean z11 = !this.r0;
            this.r0 = z11;
            long j10 = this.I0;
            s sVar = this.w;
            b bVar = new b(this, m0Var, j10, 0);
            Handler handler = sVar.u;
            if (sVar.r0 && handler != null) {
                handler.post(new a60(sVar, z11, bVar, 17));
            }
            this.p0 = true;
            this.q0 = true;
            this.E0 = true;
            this.Z = false;
            this.X = false;
            this.a0 = false;
            O();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.z.getId() + ", standbyId=" + this.t0.getId() + ", input=" + (this.r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
            this.c.post(new a(this, 1));
            nh nhVar = this.k;
            ((t0) nhVar.b).i.post(new a60(nhVar, new h(this.G, this.I, this.J, this.q, this.r, this.O, F()), z10, 18));
            return true;
        } catch (CameraAccessException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e13) {
            e = e13;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e14) {
            e = e14;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(m0 m0Var) {
        CameraDevice cameraDevice = this.t0;
        i iVar = this.x0;
        if (cameraDevice == null || iVar == null || iVar.b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.z;
        m0 m0Var2 = this.G;
        i iVar2 = m0Var2 != null ? m0Var2 == m0.a ? this.j0 : this.k0 : null;
        q();
        this.t0 = cameraDevice2;
        this.x0 = iVar2;
        this.z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        s sVar = this.w;
        if (sVar != null) {
            sVar.n(this.r, this.s, D(this.p));
            Surface surface = this.w.w;
            if (surface == null) {
                throw new IllegalStateException("GL processor is not started");
            }
            this.u = surface;
        }
        this.E0 = true;
        n nVar = this.j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.o);
        sb2.append(", standbyId=");
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", preparationMs=");
        sb2.append(z(this.I0));
        nVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        Integer num;
        if (this.c0) {
            if (this.o0) {
                this.c.setTransform(new Matrix());
                this.j.b("preview transform: GL output, identity matrix, view=" + this.c.getWidth() + "x" + this.c.getHeight());
                return;
            }
            Size size = this.r;
            if (size == null || this.c.getWidth() == 0 || this.c.getHeight() == 0) {
                return;
            }
            int min = Math.min(this.s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.c;
            boolean z10 = false;
            if (this.p != null && textureView.getDisplay() != null && (num = (Integer) this.p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
                int intValue = ((num.intValue() - (textureView.getDisplay().getRotation() * 90)) + 360) % 360;
                if (intValue == 90 || intValue == 270) {
                    z10 = true;
                }
            }
            float f10 = min;
            float height = (z10 ? size.getHeight() : size.getWidth()) / f10;
            float width = (z10 ? size.getWidth() : size.getHeight()) / f10;
            Matrix matrix = new Matrix();
            matrix.setScale(height, width, this.c.getWidth() * 0.5f, this.c.getHeight() * 0.5f);
            this.c.setTransform(matrix);
            this.j.b("preview transform: view=" + this.c.getWidth() + "x" + this.c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + height + "x" + width);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        CameraDevice cameraDevice;
        CameraCaptureSession cameraCaptureSession = this.A;
        if (!this.V || cameraCaptureSession == null || (cameraDevice = this.z) == null) {
            return;
        }
        try {
            if (cameraDevice != null) {
                try {
                    if (this.u != null) {
                        CaptureRequest.Builder x10 = x(cameraDevice, this.u, l(), true, false);
                        this.C = x10;
                        CameraCaptureSession cameraCaptureSession2 = this.A;
                        if (cameraCaptureSession2 != null) {
                            cameraCaptureSession2.setRepeatingRequest(x10.build(), this.u1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e10) {
                    e = e10;
                    if (!this.n0) {
                        A("active repeating request failed", e, false);
                        return;
                    } else if (this.J == o0.c) {
                        B("60 fps updated request rejected", e);
                        return;
                    } else {
                        N(e);
                        return;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    if (!this.n0) {
                    }
                } catch (IllegalStateException e12) {
                    e = e12;
                    if (this.n0) {
                        A("active repeating request rejected", e, false);
                        return;
                    }
                    if (!this.V || this.b0 || cameraCaptureSession != this.A) {
                        this.j.b("stale repeating request rejection ignored: " + e.getMessage());
                        return;
                    }
                    this.j.b("repeating request rejected by closed camera; reopening device: " + e.getMessage());
                    q();
                    CameraDevice cameraDevice2 = this.z;
                    this.z = null;
                    this.W = false;
                    if (cameraDevice2 == null) {
                        I();
                        return;
                    } else {
                        this.Y = true;
                        cameraDevice2.close();
                        return;
                    }
                }
            }
            throw new IllegalStateException("Camera request surfaces are unavailable");
        } catch (CameraAccessException e13) {
            e = e13;
        } catch (IllegalArgumentException e14) {
            e = e14;
        } catch (IllegalStateException e15) {
            e = e15;
        }
    }

    public final void h(i iVar) {
        this.o = iVar.a;
        this.H = iVar.b;
        this.p = iVar.c;
        this.q = iVar.d;
        this.r = iVar.e;
        this.s = iVar.f;
        this.I = iVar.g;
        this.J = iVar.h;
        this.K = iVar.i;
        this.L = iVar.j;
        this.O = iVar.k;
        this.f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.n1);
        }
        this.y = null;
    }

    public final i l() {
        return new i(this.o, this.H, this.p, this.q, this.r, this.s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.z0 = false;
        this.v0 = null;
        this.w0 = null;
        this.c0 = false;
        this.Z = false;
        this.a0 = false;
        this.C = null;
        this.Q = false;
        this.y0 = null;
        this.s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.z = null;
        }
        CameraDevice cameraDevice2 = this.t0;
        this.t0 = null;
        this.x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.u0;
        this.u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        s sVar = this.w;
        if (sVar != null) {
            sVar.l();
            this.w = null;
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        this.u = null;
        this.v = null;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.q0 = false;
    }

    public final void t() {
        this.y0 = null;
        this.E0 = false;
        this.j.b("camera switch path: sequential".concat(this.l0 ? ", reason=warm device not ready" : ", reason=concurrent pair unavailable"));
        q();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            this.z = null;
            this.C0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else {
            if (this.W) {
                return;
            }
            this.X = false;
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        CameraDevice cameraDevice = this.z;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.H0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.K + ", glPreview=" + this.o0);
            cameraDevice.createCaptureSession(this.o0 ? Arrays.asList(this.u) : Arrays.asList(this.t, this.u), this.t1, this.n);
        } catch (CameraAccessException e10) {
            e = e10;
            if (this.t0 != null || this.m0) {
                if (this.J != o0.c) {
                    B("60 fps session creation rejected", e);
                    return;
                } else {
                    N(e);
                    return;
                }
            }
            if (this.X && this.E0) {
                L("session request failed", e);
                return;
            }
            this.j.b("camera session request failed with warm device open: " + e);
            R("session request failed", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            if (this.t0 != null) {
            }
            if (this.J != o0.c) {
            }
        }
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        Surface surface3;
        this.o0 = this.n0;
        w wVar = this.E;
        long j10 = this.M;
        int i3 = this.e;
        int i10 = this.f;
        int i11 = this.i0;
        if (i11 <= 0) {
            i11 = this.J.a;
        }
        int i12 = i11;
        n nVar = this.j;
        nh nhVar = this.k;
        Objects.requireNonNull(nhVar);
        c cVar = new c(nhVar, 0);
        nh nhVar2 = this.k;
        Objects.requireNonNull(nhVar2);
        m mVar = new m(wVar, j10, i3, i10, i12, nVar, cVar, new c(nhVar2, 1));
        this.x = mVar;
        synchronized (mVar) {
            if (mVar.D) {
                surface = mVar.q;
            } else {
                mVar.q();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.n.start();
                    mVar.D = true;
                    mVar.f.b("codecs prepared: video=" + mVar.n.getName() + ", audio=" + mVar.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.q;
                } catch (IOException | RuntimeException e10) {
                    mVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.r;
        Surface surface5 = this.o0 ? this.t : null;
        boolean z10 = this.n0;
        int i13 = this.e;
        int i14 = this.s;
        boolean D = D(this.p);
        boolean z11 = this.i;
        n nVar2 = this.j;
        m mVar2 = this.x;
        nh nhVar3 = this.k;
        Objects.requireNonNull(nhVar3);
        int i15 = 2;
        s sVar = new s(size, surface4, surface5, z10, i13, i14, D, z11, nVar2, mVar2, new c(nhVar3, i15));
        this.w = sVar;
        sVar.t0 = new a(this, i15);
        s sVar2 = this.w;
        if (sVar2.r0) {
            surface2 = sVar2.w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            sVar2.t = handlerThread;
            handlerThread.start();
            sVar2.q0 = System.nanoTime();
            n nVar3 = sVar2.i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(sVar2.a);
            sb2.append(", crop=");
            sb2.append(sVar2.j);
            sb2.append(", output=");
            sb2.append(sVar2.g);
            sb2.append("x");
            sb2.append(sVar2.g);
            sb2.append(", filter=");
            sb2.append(sVar2.j == sVar2.g ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(sVar2.h);
            sb2.append(", dualInput=");
            sb2.append(sVar2.f);
            sb2.append(", glPreview=");
            sb2.append(sVar2.e != null);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(sVar2.t.getLooper());
            sVar2.u = handler;
            handler.post(new u9.a(20, sVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (sVar2.w0 != null) {
                    RuntimeException runtimeException = sVar2.w0;
                    sVar2.w0 = null;
                    sVar2.l();
                    throw runtimeException;
                }
                surface2 = sVar2.w;
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                sVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.u = surface2;
        if (!this.n0) {
            this.v = null;
            return;
        }
        m0 m0Var = this.H;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.j0 : this.k0;
        if (iVar == null) {
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        s sVar3 = this.w;
        Size size2 = iVar.e;
        int i16 = iVar.f;
        boolean D2 = D(iVar.c);
        Handler handler2 = sVar3.u;
        if (sVar3.r0 && sVar3.f && handler2 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler2.post(new p(sVar3, size2, i16, D2, runtimeExceptionArr, countDownLatch2, 0));
            try {
                countDownLatch2.await();
                RuntimeException runtimeException2 = runtimeExceptionArr[0];
                if (runtimeException2 != null) {
                    throw runtimeException2;
                }
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Secondary input update was interrupted", e12);
            }
        }
        s sVar4 = this.w;
        if (!sVar4.f || (surface3 = sVar4.y) == null) {
            throw new IllegalStateException("Secondary GL camera surface is unavailable");
        }
        this.v = surface3;
    }

    public final void w(SurfaceTexture surfaceTexture) {
        try {
            v();
        } catch (IOException | RuntimeException e10) {
            if (!this.n0) {
                throw e10;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
            s sVar = this.w;
            if (sVar != null) {
                sVar.l();
                this.w = null;
            }
            m mVar = this.x;
            if (mVar != null) {
                mVar.u();
                this.x = null;
            }
            this.u = null;
            this.v = null;
            this.n0 = false;
            this.o0 = false;
            this.l0 = false;
            this.m0 = true;
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
            v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder x(CameraDevice cameraDevice, Surface surface, i iVar, boolean z10, boolean z11) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        Surface surface2;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        if (z10 && !this.o0 && (surface2 = this.t) != null) {
            createCaptureRequest.addTarget(surface2);
        }
        createCaptureRequest.addTarget(surface);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = iVar.c;
        if (s(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = iVar.i;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z11) {
                this.j.b("capture FPS range selected: " + iVar.i + ", cameraId=" + iVar.a + ", active=" + z10);
            }
        }
        if (z10) {
            float y9 = com.google.android.recaptcha.internal.a.y(this.O, 1.0f, this.N, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), y9))));
                    boolean z12 = !this.P && F();
                    cameraCharacteristics = this.p;
                    if (s(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                    createCaptureRequest.set(key2, Integer.valueOf(z12 ? 2 : 0));
                    if (this.Q) {
                        this.j.b("torch request configured: requested=" + this.P + ", applied=" + z12 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                    }
                }
            }
            CameraCharacteristics cameraCharacteristics4 = this.p;
            Rect rect = cameraCharacteristics4 == null ? null : (Rect) cameraCharacteristics4.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect != null) {
                int max = Math.max(1, Math.round(rect.width() / y9));
                int max2 = Math.max(1, Math.round(rect.height() / y9));
                int centerX = rect.centerX() - (max / 2);
                int centerY = rect.centerY() - (max2 / 2);
                this.l.set(centerX, centerY, max + centerX, max2 + centerY);
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
            }
            if (this.P) {
            }
            cameraCharacteristics = this.p;
            if (s(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
            }
            CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
            createCaptureRequest.set(key22, Integer.valueOf(z12 ? 2 : 0));
            if (this.Q) {
            }
        } else {
            if (s((int[]) iVar.c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            }
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        }
        int i3 = this.T + 1;
        this.T = i3;
        createCaptureRequest.setTag(Integer.valueOf(i3));
        if (this.Q) {
            this.U = this.T;
        }
        return createCaptureRequest;
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.m0 = true;
        this.l0 = false;
        this.n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.t0;
        this.t0 = null;
        this.x0 = null;
        if (cameraDevice == null || cameraDevice == this.z) {
            return;
        }
        this.u0 = cameraDevice;
        cameraDevice.close();
    }
}
