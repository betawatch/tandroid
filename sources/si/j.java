package si;

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
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.k3;
import ei.y3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import k2.w0;
import m.g3;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.t50;
import org.telegram.ui.v90;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class j {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public w E;
    public long E0;
    public volatile m0 F;
    public long F0;
    public m0 G;
    public long G0;
    public m0 H;
    public long H0;
    public n0 I;
    public long I0;
    public p0 J;
    public long J0;
    public Range K;
    public long K0;
    public j6.l L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public double O0;
    public boolean P;
    public long P0;
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
    public final s0 d;
    public boolean d0;
    public double d1;
    public final int e;
    public boolean e0;
    public long e1;
    public final int f;
    public boolean f0;
    public long f1;
    public final n0 g;
    public boolean g0;
    public long g1;
    public final p0 h;
    public boolean h0;
    public long h1;
    public final boolean i;
    public i i0;
    public long i1;
    public final n j;
    public i j0;
    public long j1;
    public final w0 k;
    public boolean k0;
    public long k1;
    public boolean l0;
    public final y3 l1;
    public HandlerThread m;
    public boolean m0;
    public final a m1;
    public Handler n;
    public boolean n0;
    public final a n1;
    public String o;
    public boolean o0;
    public final t50 o1;
    public CameraCharacteristics p;
    public boolean p0;
    public final e p1;
    public Size q;
    public boolean q0;
    public final e q1;
    public volatile Size r;
    public boolean r0;
    public final f r1;
    public volatile int s;
    public CameraDevice s0;
    public final f s1;
    public Surface t;
    public CameraDevice t0;
    public final g t1;
    public Surface u;
    public CameraDevice u0;
    public Surface v;
    public CameraDevice v0;
    public t w;
    public i w0;
    public m x;
    public m0 x0;
    public m y;
    public boolean y0;
    public CameraDevice z;
    public boolean z0;
    public final Rect l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, s0 s0Var, int i10, n0 n0Var, p0 p0Var, boolean z10, n nVar, w0 w0Var) {
        y3 y3Var = new y3(this, 2);
        this.l1 = y3Var;
        this.m1 = new a(this, 4);
        this.n1 = new a(this, 5);
        this.o1 = new t50(this, 4);
        this.p1 = new e(this, 0);
        this.q1 = new e(this, 1);
        this.r1 = new f(this, 0);
        this.s1 = new f(this, 1);
        this.t1 = new g(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = s0Var;
        this.e = s0Var.a;
        this.f = i10;
        this.g = n0Var;
        this.h = p0Var;
        this.i = z10;
        this.j = nVar;
        this.k = w0Var;
        textureView.addOnLayoutChangeListener(y3Var);
    }

    public static Range C(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) Integer.valueOf(i10)) && (range == null || ((Integer) range2.getLower()).intValue() > ((Integer) range.getLower()).intValue() || (((Integer) range2.getLower()).equals(range.getLower()) && ((Integer) range2.getUpper()).intValue() < ((Integer) range.getUpper()).intValue()))) {
                range = range2;
            }
        }
        return range;
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
        CameraDevice cameraDevice2 = jVar.s0;
        if (!jVar.m0 || cameraDevice == null || cameraDevice2 == null || jVar.u == null || jVar.v == null || jVar.A != null || jVar.B != null) {
            return;
        }
        jVar.o0 = false;
        jVar.p0 = false;
        try {
            jVar.G0 = SystemClock.elapsedRealtimeNanos();
            jVar.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.r + ", fpsRange=" + jVar.K);
            cameraDevice.createCaptureSession(Arrays.asList(jVar.u), jVar.s1, jVar.n);
            cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.r1, jVar.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            jVar.A("session request failed", e, false);
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z10 = cameraDevice == jVar.z;
        if (!z10 && jVar.m0) {
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
            jVar.m0 = false;
            jVar.k0 = false;
            jVar.l0 = true;
            jVar.r0 = false;
            jVar.s0 = null;
            jVar.w0 = null;
            jVar.r();
            jVar.t0 = cameraDevice;
            jVar.y0 = jVar.V && jVar.z != null && jVar.A == null && !jVar.X;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.s0) {
            jVar.s0 = null;
        }
        jVar.r0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(o0.h("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.x0 != null) {
            jVar.t();
            return;
        }
        if (!jVar.V || jVar.z == null || jVar.A != null || jVar.X) {
            return;
        }
        jVar.j.b("warm camera failed during startup; configuring active camera only");
        jVar.u();
    }

    public static String c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static boolean d(j jVar, CameraDevice cameraDevice) {
        if (!jVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == jVar.u0) {
            jVar.u0 = null;
        }
        if (cameraDevice == jVar.v0) {
            jVar.v0 = null;
        }
        n nVar = jVar.j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.u0;
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.v0;
        sb2.append(cameraDevice3 != null ? cameraDevice3.getId() : "none");
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.t0) {
            return false;
        }
        jVar.t0 = null;
        jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
        if (!jVar.y0) {
            if (!jVar.X || jVar.x0 == null) {
                return true;
            }
            jVar.j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        }
        jVar.y0 = false;
        if (!jVar.V || jVar.b0 || jVar.z == null) {
            return true;
        }
        jVar.j.b("retrying capture session after standby camera closed");
        jVar.u();
        return true;
    }

    public static void f(j jVar) {
        m0 m0Var = jVar.x0;
        if (m0Var != null && jVar.m0 && jVar.o0 && jVar.p0) {
            jVar.x0 = null;
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

    public static j6.l m(Size[] sizeArr, s0 s0Var, n0 n0Var) {
        int i10;
        j6.l o10;
        n0 n0Var2;
        j6.l o11;
        n0 n0Var3 = n0.c;
        if (n0Var == n0Var3) {
            i10 = s0Var.a;
        } else {
            s0 s0Var2 = s0.b;
            n0 n0Var4 = n0.a;
            if (s0Var == s0Var2) {
                if (n0Var == n0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l o12 = o(sizeArr, i10, n0Var);
        if (o12 != null) {
            return o12;
        }
        if (s0Var == s0.c && n0Var == (n0Var2 = n0.b) && (o11 = o(sizeArr, 480, n0Var2)) != null) {
            return o11;
        }
        int i11 = s0Var.a;
        if (n0Var != n0Var3 && (o10 = o(sizeArr, i11, n0Var3)) != null) {
            return o10;
        }
        int i12 = s0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || i(size2) < i(size))) {
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
        return new j6.l(n(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static j6.l o(Size[] sizeArr, int i10, n0 n0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, n0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i12 = i(size) + i(n10);
                        long i13 = i(size3) + i(size2);
                        compare = i12 != i13 ? Long.compare(i12, i13) : Long.compare(i(size), i(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static boolean s(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
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
        if (this.m0) {
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
            this.m0 = false;
            this.k0 = false;
            this.l0 = true;
            this.o0 = false;
            this.p0 = false;
            if (!z10 || this.A == null) {
                L("DUAL_ACTIVE ".concat(str), exc);
                return;
            }
            r();
            CameraDevice cameraDevice = this.s0;
            this.s0 = null;
            this.w0 = null;
            if (cameraDevice != null) {
                this.t0 = cameraDevice;
                cameraDevice.close();
            }
            if (this.t0 == null && this.X && this.x0 != null) {
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
                z10 = mVar.z;
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
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = p0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.K = C(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.I = (n0) lVar.d;
        this.i0 = null;
        this.j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        t tVar = this.w;
        if (tVar != null) {
            tVar.l();
            this.w = null;
        }
        m mVar2 = this.x;
        if (mVar2 != null) {
            mVar2.q();
            this.x = null;
        }
        this.u = null;
        try {
            v();
            O();
            n nVar = this.j;
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
            nVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.V || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e) {
            N(e);
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
        if (this.z0) {
            return cameraDevice == this.u0 || cameraDevice == this.v0;
        }
        return false;
    }

    public final void H() {
        if (this.z0 && this.u0 == null && this.v0 == null) {
            this.z0 = false;
            this.X = false;
            this.j.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (!this.V || this.b0) {
                return;
            }
            I();
        }
    }

    public final void I() {
        if (this.V && !this.W && this.z == null) {
            if (f0.c.b(this.a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.c.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            boolean z10 = false;
            try {
                this.C0 = SystemClock.elapsedRealtimeNanos();
                S(this.F);
                long z11 = z(this.C0);
                if (this.z == null && this.x == null) {
                    K();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                if (this.m0) {
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
                    t tVar = this.w;
                    if (tVar != null) {
                        tVar.n(this.r, this.s, D(this.p));
                        Surface surface = null;
                        if (!this.m0 && this.q0) {
                            this.q0 = false;
                            t tVar2 = this.w;
                            Handler handler = tVar2.u;
                            if (tVar2.r0 && handler != null) {
                                handler.post(new v90(tVar2, z10, surface, 16));
                            }
                        }
                        t tVar3 = this.w;
                        Surface surface2 = tVar3.w;
                        if (surface2 == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface2;
                        if (this.m0 && (!tVar3.f || (surface = tVar3.y) == null)) {
                            throw new IllegalStateException("Secondary GL camera surface is unavailable");
                        }
                        this.v = surface;
                    }
                }
                J();
                this.W = true;
                this.F0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s + ", selectionElapsedMs=" + z11 + ", dualActive=" + this.m0);
                this.b.openCamera(this.o, this.p1, this.n);
            } catch (Exception e) {
                this.W = false;
                N(e);
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        if (!this.k0 || this.l0 || (z10 = this.r0) || (cameraDevice = this.s0) != null) {
            return;
        }
        m0 m0Var = this.H;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.i0 : this.j0;
        if (iVar != null) {
            String str = iVar.a;
            if (z10 || cameraDevice != null) {
                return;
            }
            try {
                this.w0 = iVar;
                this.r0 = true;
                this.A0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + iVar.b);
                this.b.openCamera(str, this.q1, this.n);
            } catch (Exception e) {
                this.r0 = false;
                y("open request failed", e);
            }
        }
    }

    public final void K() {
        if (this.l0) {
            return;
        }
        if (this.k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.j;
        if (i10 < 30) {
            this.l0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        p0 p0Var = l4.h;
        String str = l4.a;
        m0 m0Var = l4.b;
        m0 m0Var2 = m0.a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.b;
        }
        try {
            try {
                S(m0Var2);
                i l10 = l();
                p0 p0Var2 = l10.h;
                String str2 = l10.a;
                boolean E = E(str, str2);
                this.k0 = E;
                if (E && p0Var != p0Var2) {
                    this.k0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f + ", second=" + l10.e + "/" + l10.f + ", firstFps=" + p0Var.a + ", secondFps=" + p0Var2.a);
                }
                boolean z10 = this.k0;
                if (!z10) {
                    this.l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.k0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.k0 ? "" : ", reason=pair not advertised");
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.l0 = true;
                nVar.b("camera warm-switch capability unavailable: " + e);
                h(l4);
            }
        } catch (Throwable th2) {
            h(l4);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String str2;
        if (this.z0) {
            return;
        }
        this.z0 = true;
        this.l0 = true;
        this.k0 = false;
        this.y0 = false;
        this.x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        this.u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.s0;
        this.v0 = cameraDevice2;
        this.z = null;
        this.s0 = null;
        this.w0 = null;
        CameraDevice cameraDevice3 = this.t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.t0 = null;
        }
        n nVar = this.j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.u0;
        v.append(cameraDevice4 == null ? "none" : cameraDevice4.getId());
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.v0;
        v.append(cameraDevice5 != null ? cameraDevice5.getId() : "none");
        v.append(", fps=");
        p0 p0Var = this.J;
        v.append(p0Var == null ? "unknown" : Integer.valueOf(p0Var.a));
        v.append(", switchElapsedMs=");
        v.append(z(this.H0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        v.append(str2);
        nVar.b(v.toString());
        CameraDevice cameraDevice6 = this.u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.v0;
        if (cameraDevice7 != null && cameraDevice7 != this.u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new p2.b(24, this, handlerThread));
    }

    public final void N(Exception exc) {
        this.j.a("camera error", exc);
        w0 w0Var = this.k;
        ((u0) w0Var.b).i.post(new p2.b(27, w0Var, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0L;
        this.c1 = 0L;
        this.d1 = 0.0d;
        this.e1 = 0L;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
        this.j1 = 0L;
        this.k1 = 0L;
    }

    public final void P() {
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0.0d;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
    }

    public final g3 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        j6.l lVar2;
        int i10;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.b;
        if (p0Var == p0Var2) {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        } else {
            if (!this.h0) {
                int i11 = p0Var.a;
                Range C = C(rangeArr4, i11);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Size size = sizeArr[i12];
                        int i13 = i12;
                        int i14 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i11) {
                                rangeArr4 = rangeArr3;
                                length = i14;
                                i12 = i13 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i14;
                        i12 = i13 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        j6.l m10 = m(sizeArr2, this.d, this.g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new g3(p0.c, C, m10, 28);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new g3(p0Var2, C2, lVar, 28);
            }
            rangeArr = rangeArr4;
            i10 = 30;
            lVar2 = lVar;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(p0Var.a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        v.append(this.h0 ? ", reason=session-wide fallback" : "");
        nVar.b(v.toString());
        return new g3(p0Var2, C3, lVar2, 28);
    }

    public final void R(String str, Exception exc) {
        this.y0 = true;
        y(str, exc);
        if (this.t0 == null) {
            this.y0 = false;
            u();
        } else {
            this.j.b("capture session retry waiting for standby camera close: id=" + this.t0.getId());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b8, code lost:
    
        if ((r27 == r8 && r4.equals(r4.get(r9)) && !r4.equals(((android.hardware.camera2.CameraCharacteristics) r14.b).get(r9))) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e7, code lost:
    
        if ((r27 == r8 && r4.equals(r4.get(r9)) && !r4.equals(((android.hardware.camera2.CameraCharacteristics) r15.b).get(r9))) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        int i10;
        i l4;
        CameraCharacteristics.Key key;
        int i11;
        String str3;
        int i12;
        z5 z5Var;
        String str4;
        g3 Q;
        z5 z5Var2;
        n nVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        p0 p0Var;
        m0 m0Var3 = m0.b;
        m0 m0Var4 = m0.a;
        i iVar = m0Var == m0Var4 ? this.i0 : this.j0;
        String str5 = ", facing=";
        if (iVar != null) {
            h(iVar);
            this.j.b("camera outputs restored from cache: id=" + iVar.a + ", facing=" + m0Var + ", preview=" + iVar.d + ", recording=" + iVar.e + ", fps=" + iVar.h.a);
            return;
        }
        boolean z10 = true;
        if (!this.g0) {
            this.g0 = true;
            if (this.h == p0.c) {
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
        z5 z5Var3 = null;
        z5 z5Var4 = null;
        int i14 = 0;
        while (true) {
            m0Var2 = m0Var4;
            if (i14 >= length) {
                break;
            }
            String str6 = cameraIdList[i14];
            String[] strArr = cameraIdList;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str6);
            int i15 = length;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i13) {
                i11 = i13;
                str3 = str5;
                i12 = i14;
                z5Var = z5Var3;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i12 = i14;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str6 + ", reason=no stream map");
                    i11 = i13;
                    z5Var = z5Var3;
                    str3 = str5;
                } else {
                    i11 = i13;
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        str3 = str5;
                        z5Var = z5Var3;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            try {
                                j6.l m10 = m(outputSizes, this.d, this.g);
                                str4 = "camera candidate rejected: id=";
                                str6 = str6;
                                z5Var = z5Var3;
                                try {
                                    Q = Q(str6, cameraCharacteristics, streamConfigurationMap2, outputSizes, m10);
                                    z5Var2 = new z5();
                                    z5Var2.a = str6;
                                    z5Var2.b = cameraCharacteristics;
                                    z5Var2.c = outputSizes;
                                    z5Var2.d = m10;
                                    z5Var2.e = Q;
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
                                } catch (RuntimeException e) {
                                    e = e;
                                    str3 = str5;
                                }
                            } catch (RuntimeException e7) {
                                e = e7;
                                str3 = str5;
                                str4 = "camera candidate rejected: id=";
                                str6 = str6;
                                z5Var = z5Var3;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                z5Var3 = z5Var;
                                i14 = i12 + 1;
                                m0Var4 = m0Var2;
                                cameraIdList = strArr;
                                length = i15;
                                i13 = i11;
                                str5 = str3;
                                z10 = true;
                            }
                            try {
                                sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                                sb2.append(", fps=");
                                sb2.append(((p0) Q.b).a);
                                sb2.append(", preview=");
                                sb2.append((Size) ((j6.l) Q.d).b);
                                sb2.append(", recording=");
                                sb2.append((Size) ((j6.l) Q.d).c);
                                nVar.b(sb2.toString());
                                if (z5Var4 != null) {
                                }
                                z5Var4 = z5Var2;
                                p0Var = this.h;
                            } catch (RuntimeException e10) {
                                e = e10;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                z5Var3 = z5Var;
                                i14 = i12 + 1;
                                m0Var4 = m0Var2;
                                cameraIdList = strArr;
                                length = i15;
                                i13 = i11;
                                str5 = str3;
                                z10 = true;
                            }
                        } catch (RuntimeException e11) {
                            e = e11;
                            str3 = str5;
                            str4 = "camera candidate rejected: id=";
                        }
                        if (p0Var == p0.b || ((p0) Q.b) == p0Var) {
                            if (z5Var != null) {
                            }
                            z5Var3 = z5Var2;
                            i14 = i12 + 1;
                            m0Var4 = m0Var2;
                            cameraIdList = strArr;
                            length = i15;
                            i13 = i11;
                            str5 = str3;
                            z10 = true;
                        }
                    }
                }
            }
            z5Var3 = z5Var;
            i14 = i12 + 1;
            m0Var4 = m0Var2;
            cameraIdList = strArr;
            length = i15;
            i13 = i11;
            str5 = str3;
            z10 = true;
        }
        z5 z5Var5 = z5Var3;
        String str7 = str5;
        z5 z5Var6 = z5Var5 == null ? z5Var4 : z5Var5;
        if (z5Var6 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) z5Var6.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) z5Var6.b;
        Size[] sizeArr = (Size[]) z5Var6.c;
        j6.l lVar = (j6.l) z5Var6.d;
        g3 g3Var = (g3) z5Var6.e;
        j6.l lVar2 = (j6.l) g3Var.d;
        this.o = str8;
        this.H = m0Var;
        this.p = cameraCharacteristics2;
        this.J = (p0) g3Var.b;
        this.K = (Range) g3Var.c;
        this.f0 = false;
        this.L = lVar;
        O();
        this.q = (Size) lVar2.b;
        this.r = (Size) lVar2.c;
        this.s = lVar2.a;
        this.I = (n0) lVar2.d;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            Range range = (Range) cameraCharacteristics2.get(key);
            if (range != null) {
                floatValue = ((Float) range.getUpper()).floatValue();
            }
            floatValue = 1.0f;
        } else {
            Float f7 = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f7 != null) {
                floatValue = f7.floatValue();
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
                n nVar3 = this.j;
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
                sb4.append(this.J != this.h ? a1.g.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                nVar3.b(sb4.toString());
                if (m0Var == m0Var2) {
                    if (!this.d0) {
                        i10 = 1;
                        this.d0 = true;
                        Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                        Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                        Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        n nVar4 = this.j;
                        StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                        sb5.append(str8);
                        sb5.append(str7);
                        sb5.append(m0Var);
                        sb5.append(", hardwareLevel=");
                        sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == i10 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i16 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
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
                        nVar4.b(sb5.toString());
                    }
                    l4 = l();
                    if (l4.b != m0Var2) {
                        this.i0 = l4;
                        return;
                    } else {
                        this.j0 = l4;
                        return;
                    }
                }
                i10 = 1;
                if (!this.e0) {
                    this.e0 = true;
                    Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    n nVar42 = this.j;
                    StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
                    sb52.append(str8);
                    sb52.append(str7);
                    sb52.append(m0Var);
                    sb52.append(", hardwareLevel=");
                    sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == i10 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i16 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
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
                    nVar42.b(sb52.toString());
                }
                l4 = l();
                if (l4.b != m0Var2) {
                }
            }
            str = ", flashAvailable=";
            outputMinFrameDuration2 = -1;
            n nVar32 = this.j;
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
            sb42.append(this.J != this.h ? a1.g.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            nVar32.b(sb42.toString());
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
        n nVar322 = this.j;
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
        sb422.append(this.J != this.h ? a1.g.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        nVar322.b(sb422.toString());
        if (m0Var == m0Var2) {
        }
    }

    public final void T(boolean z10) {
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return;
        }
        handler.post(new b60(18, this, z10));
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.n1);
        handler.post(this.n1);
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
        this.y = null;
        this.c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        this.j.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.o1);
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
        int i10 = m0Var == m0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.g)).b) == p0.c) {
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
        w0 w0Var = this.k;
        ((u0) w0Var.b).i.post(new p2.b(26, w0Var, m0Var));
        this.H0 = SystemClock.elapsedRealtimeNanos();
        this.D0 = false;
        this.j.b("camera device switch started: from=" + this.G + ", to=" + m0Var);
        if (b0(m0Var)) {
            return;
        }
        if (this.m0) {
            this.x0 = m0Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        t tVar = this.w;
        if (tVar != null) {
            m0 m0Var3 = this.G;
            Handler handler = tVar.u;
            if (tVar.r0 && handler != null) {
                m0Var2 = m0Var;
                handler.post(new o(tVar, m0Var3, m0Var2, handler, 0));
                if (c0(m0Var2)) {
                    if (!this.r0 || (iVar = this.w0) == null || iVar.b != m0Var2) {
                        t();
                        return;
                    } else {
                        this.x0 = m0Var2;
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
        if (!this.m0 || !this.o0 || !this.p0 || (cameraDevice = this.z) == null || (cameraDevice2 = this.s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.w0) == null || iVar.b != m0Var || this.w == null) {
            return false;
        }
        this.z = cameraDevice2;
        this.s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.u;
        this.u = this.v;
        this.v = surface;
        this.w0 = this.G == m0.a ? this.i0 : this.j0;
        h(iVar);
        this.G = m0Var;
        boolean z10 = true;
        try {
            try {
                x10 = x(this.z, this.u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.t1, this.n);
            i iVar2 = this.w0;
            if (iVar2 != null) {
                CaptureRequest.Builder x11 = x(this.s0, this.v, iVar2, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.t1, this.n);
            }
            boolean z11 = !this.q0;
            this.q0 = z11;
            long j10 = this.H0;
            t tVar = this.w;
            b bVar = new b(this, m0Var, j10, 0);
            Handler handler = tVar.u;
            if (tVar.r0 && handler != null) {
                handler.post(new v90(tVar, z11, bVar, 16));
            }
            this.o0 = true;
            this.p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.a0 = false;
            O();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.z.getId() + ", standbyId=" + this.s0.getId() + ", input=" + (this.q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.c.post(new a(this, 1));
            w0 w0Var = this.k;
            ((u0) w0Var.b).i.post(new v90(w0Var, new h(this.G, this.I, this.J, this.q, this.r, this.O, F()), z10, 17));
            return true;
        } catch (CameraAccessException e10) {
            e = e10;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(m0 m0Var) {
        CameraDevice cameraDevice = this.s0;
        i iVar = this.w0;
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
        i iVar2 = m0Var2 != null ? m0Var2 == m0.a ? this.i0 : this.j0 : null;
        q();
        this.s0 = cameraDevice2;
        this.w0 = iVar2;
        this.z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        t tVar = this.w;
        if (tVar != null) {
            tVar.n(this.r, this.s, D(this.p));
            Surface surface = this.w.w;
            if (surface == null) {
                throw new IllegalStateException("GL processor is not started");
            }
            this.u = surface;
        }
        this.D0 = true;
        n nVar = this.j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.o);
        sb2.append(", standbyId=");
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", preparationMs=");
        sb2.append(z(this.H0));
        nVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        Integer num;
        if (this.c0) {
            if (this.n0) {
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
            float f7 = min;
            float height = (z10 ? size.getHeight() : size.getWidth()) / f7;
            float width = (z10 ? size.getWidth() : size.getHeight()) / f7;
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
                            cameraCaptureSession2.setRepeatingRequest(x10.build(), this.t1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    if (!this.m0) {
                        A("active repeating request failed", e, false);
                        return;
                    } else if (this.J == p0.c) {
                        B("60 fps updated request rejected", e);
                        return;
                    } else {
                        N(e);
                        return;
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    if (!this.m0) {
                    }
                } catch (IllegalStateException e10) {
                    e = e10;
                    if (this.m0) {
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
        } catch (CameraAccessException e11) {
            e = e11;
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (IllegalStateException e13) {
            e = e13;
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
            handler.removeCallbacks(this.m1);
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
        this.z0 = false;
        this.y0 = false;
        this.u0 = null;
        this.v0 = null;
        this.c0 = false;
        this.Z = false;
        this.a0 = false;
        this.C = null;
        this.Q = false;
        this.x0 = null;
        this.r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.z = null;
        }
        CameraDevice cameraDevice2 = this.s0;
        this.s0 = null;
        this.w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.t0;
        this.t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        t tVar = this.w;
        if (tVar != null) {
            tVar.l();
            this.w = null;
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        this.u = null;
        this.v = null;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.q0 = false;
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
        this.p0 = false;
    }

    public final void t() {
        this.x0 = null;
        this.D0 = false;
        this.j.b("camera switch path: sequential".concat(this.k0 ? ", reason=warm device not ready" : ", reason=concurrent pair unavailable"));
        q();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            this.z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
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
            this.G0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.K + ", glPreview=" + this.n0);
            cameraDevice.createCaptureSession(this.n0 ? Arrays.asList(this.u) : Arrays.asList(this.t, this.u), this.s1, this.n);
        } catch (CameraAccessException e) {
            e = e;
            if (this.s0 != null || this.l0) {
                if (this.J != p0.c) {
                    B("60 fps session creation rejected", e);
                    return;
                } else {
                    N(e);
                    return;
                }
            }
            if (this.X && this.D0) {
                L("session request failed", e);
                return;
            }
            this.j.b("camera session request failed with warm device open: " + e);
            R("session request failed", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.s0 != null) {
            }
            if (this.J != p0.c) {
            }
        }
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        Surface surface3;
        this.n0 = this.m0;
        w wVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f;
        int i12 = this.J.a;
        n nVar = this.j;
        w0 w0Var = this.k;
        Objects.requireNonNull(w0Var);
        m mVar = new m(wVar, j10, i10, i11, i12, nVar, new c(w0Var));
        this.x = mVar;
        synchronized (mVar) {
            if (mVar.y) {
                surface = mVar.p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.m.start();
                    mVar.y = true;
                    mVar.f.b("codecs prepared: video=" + mVar.m.getName() + ", audio=" + mVar.n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.p;
                } catch (IOException | RuntimeException e) {
                    mVar.j();
                    throw e;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.r;
        Surface surface5 = this.n0 ? this.t : null;
        boolean z10 = this.m0;
        int i13 = this.e;
        int i14 = this.s;
        boolean D = D(this.p);
        boolean z11 = this.i;
        n nVar2 = this.j;
        m mVar2 = this.x;
        w0 w0Var2 = this.k;
        Objects.requireNonNull(w0Var2);
        t tVar = new t(size, surface4, surface5, z10, i13, i14, D, z11, nVar2, mVar2, new c(w0Var2));
        this.w = tVar;
        tVar.t0 = new a(this, 2);
        t tVar2 = this.w;
        if (tVar2.r0) {
            surface2 = tVar2.w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar2.t = handlerThread;
            handlerThread.start();
            tVar2.q0 = System.nanoTime();
            n nVar3 = tVar2.i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar2.a);
            sb2.append(", crop=");
            sb2.append(tVar2.j);
            sb2.append(", output=");
            sb2.append(tVar2.g);
            sb2.append("x");
            sb2.append(tVar2.g);
            sb2.append(", filter=");
            sb2.append(tVar2.j == tVar2.g ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(tVar2.h);
            sb2.append(", dualInput=");
            sb2.append(tVar2.f);
            sb2.append(", glPreview=");
            sb2.append(tVar2.e != null);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(tVar2.t.getLooper());
            tVar2.u = handler;
            handler.post(new p2.b(25, tVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar2.w0 != null) {
                    RuntimeException runtimeException = tVar2.w0;
                    tVar2.w0 = null;
                    tVar2.l();
                    throw runtimeException;
                }
                surface2 = tVar2.w;
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                tVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.u = surface2;
        if (!this.m0) {
            this.v = null;
            return;
        }
        m0 m0Var = this.H;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.i0 : this.j0;
        if (iVar == null) {
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        t tVar3 = this.w;
        Size size2 = iVar.e;
        int i15 = iVar.f;
        boolean D2 = D(iVar.c);
        Handler handler2 = tVar3.u;
        if (tVar3.r0 && tVar3.f && handler2 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler2.post(new q(tVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
            try {
                countDownLatch2.await();
                RuntimeException runtimeException2 = runtimeExceptionArr[0];
                if (runtimeException2 != null) {
                    throw runtimeException2;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Secondary input update was interrupted", e10);
            }
        }
        t tVar4 = this.w;
        if (!tVar4.f || (surface3 = tVar4.y) == null) {
            throw new IllegalStateException("Secondary GL camera surface is unavailable");
        }
        this.v = surface3;
    }

    public final void w(SurfaceTexture surfaceTexture) {
        try {
            v();
        } catch (IOException | RuntimeException e) {
            if (!this.m0) {
                throw e;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
            t tVar = this.w;
            if (tVar != null) {
                tVar.l();
                this.w = null;
            }
            m mVar = this.x;
            if (mVar != null) {
                mVar.q();
                this.x = null;
            }
            this.u = null;
            this.v = null;
            this.m0 = false;
            this.n0 = false;
            this.k0 = false;
            this.l0 = true;
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
        if (z10 && !this.n0 && (surface2 = this.t) != null) {
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
            float y3 = k3.y(this.O, 1.0f, this.N, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), y3))));
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
                int max = Math.max(1, Math.round(rect.width() / y3));
                int max2 = Math.max(1, Math.round(rect.height() / y3));
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
        int i10 = this.T + 1;
        this.T = i10;
        createCaptureRequest.setTag(Integer.valueOf(i10));
        if (this.Q) {
            this.U = this.T;
        }
        return createCaptureRequest;
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.l0 = true;
        this.k0 = false;
        this.m0 = false;
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
        CameraDevice cameraDevice = this.s0;
        this.s0 = null;
        this.w0 = null;
        if (cameraDevice == null || cameraDevice == this.z) {
            return;
        }
        this.t0 = cameraDevice;
        cameraDevice.close();
    }
}
