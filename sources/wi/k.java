package wi;

import a8.r7;
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
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import fi.n3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Wallet.g2;
import org.telegram.ui.g60;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public int C0;
    public CaptureRequest.Builder D;
    public long D0;
    public x E;
    public long E0;
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
    public m6.n L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public double N0;
    public long O0;
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
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context a;
    public volatile boolean a0;
    public long a1;
    public final CameraManager b;
    public boolean b0;
    public long b1;
    public final TextureView c;
    public boolean c0;
    public double c1;
    public final r0 d;
    public boolean d0;
    public long d1;
    public final int e;
    public boolean e0;
    public long e1;
    public final int f;
    public boolean f0;
    public long f1;
    public final n0 g;
    public int g0;
    public long g1;
    public final o0 h;
    public i h0;
    public long h1;
    public final boolean i;
    public i i0;
    public long i1;
    public final o j;
    public boolean j0;
    public long j1;
    public final rt k;
    public boolean k0;
    public final n3 k1;
    public boolean l0;
    public final a l1;
    public HandlerThread m;
    public boolean m0;
    public final a m1;
    public Handler n;
    public boolean n0;
    public final w30 n1;
    public String o;
    public boolean o0;
    public final e o1;
    public CameraCharacteristics p;
    public CameraDevice p0;
    public final e p1;
    public Size q;
    public i q0;
    public final f q1;
    public volatile Size r;
    public m0 r0;
    public final f r1;
    public volatile int s;
    public final g s1;
    public Surface t;
    public Surface u;
    public volatile boolean u0;
    public Surface v;
    public j v0;
    public t w;
    public j w0;
    public n x;
    public int x0;
    public n y;
    public HandlerThread y0;
    public CameraDevice z;
    public long z0;
    public final Rect l = new Rect();
    public float O = 1.0f;
    public final ArrayList s0 = new ArrayList();
    public final ArrayList t0 = new ArrayList();
    public int t1 = 1;

    public k(Context context, TextureView textureView, r0 r0Var, int i7, n0 n0Var, o0 o0Var, boolean z9, o oVar, rt rtVar) {
        n3 n3Var = new n3(this, 2);
        this.k1 = n3Var;
        this.l1 = new a(this, 5);
        this.m1 = new a(this, 6);
        this.n1 = new w30(this, 4);
        this.o1 = new e(this, 0);
        this.p1 = new e(this, 1);
        this.q1 = new f(this, 0);
        this.r1 = new f(this, 1);
        this.s1 = new g(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = r0Var;
        this.e = r0Var.a;
        this.f = i7;
        this.g = n0Var;
        this.h = o0Var;
        this.i = z9;
        this.j = oVar;
        this.k = rtVar;
        textureView.addOnLayoutChangeListener(n3Var);
    }

    public static long A(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range D(Range[] rangeArr, int i7) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i10 = i7 > 30 ? i7 / 2 : 1;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i7))) {
                if (((Integer) range3.getUpper()).intValue() == i7 && ((Integer) range3.getLower()).intValue() >= i10 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        return range != null ? range : range2;
    }

    public static boolean E(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public static int U(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float V(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d2 = j10;
        double d10 = j3 / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d10 * d10))) / 1000000.0d);
    }

    public static void a(k kVar) {
        CameraDevice cameraDevice = kVar.z;
        CameraDevice cameraDevice2 = kVar.p0;
        if (!kVar.l0 || cameraDevice == null || cameraDevice2 == null || kVar.u == null || kVar.v == null || kVar.A != null || kVar.B != null) {
            return;
        }
        kVar.m0 = false;
        kVar.n0 = false;
        try {
            kVar.F0 = SystemClock.elapsedRealtimeNanos();
            kVar.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.r + ", fpsRange=" + kVar.K);
            cameraDevice.createCaptureSession(Arrays.asList(kVar.u), kVar.r1, kVar.n);
            cameraDevice2.createCaptureSession(Arrays.asList(kVar.v), kVar.q1, kVar.n);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            kVar.B("session request failed", e10, false);
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        int i7 = 1;
        if (cameraDevice == kVar.z) {
            kVar.p();
            kVar.z = null;
            kVar.q(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(rf.b.i("Active camera ", str));
            }
            kVar.M(illegalStateException);
            return;
        }
        if (cameraDevice == kVar.p0) {
            kVar.p0 = null;
        }
        if (!kVar.l0) {
            kVar.q(cameraDevice, 1);
            return;
        }
        o oVar = kVar.j;
        StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
        sb2.append(str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        sb2.append(str2);
        oVar.b(sb2.toString());
        boolean z9 = false;
        kVar.l0 = false;
        kVar.j0 = false;
        kVar.k0 = true;
        kVar.q0 = null;
        kVar.r();
        boolean z10 = kVar.V && kVar.z != null && kVar.A == null && !kVar.W;
        if (kVar.W && kVar.r0 != null) {
            z9 = true;
        }
        if (z10) {
            i7 = 3;
        } else if (z9) {
            i7 = 4;
        }
        kVar.q(cameraDevice, i7);
    }

    public static void c(k kVar, CameraDevice cameraDevice) {
        kVar.s0.remove(cameraDevice);
        kVar.t0.remove(cameraDevice);
        if (cameraDevice == kVar.z) {
            kVar.z = null;
        }
        if (cameraDevice == kVar.p0) {
            kVar.p0 = null;
        }
        o oVar = kVar.j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(kVar.s0.size());
        sb2.append(", closing=");
        sb2.append(kVar.t0.size());
        sb2.append(", afterClose=");
        int i7 = kVar.t1;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "CONTINUE_SWITCH" : "RETRY_SESSION" : "REOPEN" : "NONE");
        sb2.append(", closeElapsedMs=");
        sb2.append(A(kVar.A0));
        oVar.b(sb2.toString());
        if (kVar.t0.isEmpty()) {
            int i10 = kVar.t1;
            kVar.t1 = 1;
            if (!kVar.V || kVar.Z || i10 == 1) {
                return;
            }
            int c10 = p1.g.c(i10);
            if (c10 == 1) {
                kVar.W = false;
                kVar.H();
                return;
            }
            if (c10 != 2) {
                if (c10 != 3) {
                    return;
                }
                kVar.j.b("continuing pending switch after DUAL_ACTIVE fallback");
                kVar.t();
                return;
            }
            if (kVar.z == null || kVar.A != null) {
                return;
            }
            kVar.j.b("retrying capture session after standby camera closed");
            kVar.u();
        }
    }

    public static void d(k kVar) {
        m0 m0Var = kVar.r0;
        if (m0Var != null && kVar.l0 && kVar.m0 && kVar.n0) {
            kVar.r0 = null;
            if (kVar.a0(m0Var)) {
                return;
            }
            kVar.W = false;
            kVar.Z(m0Var);
        }
    }

    public static String e(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static long h(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float i(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (j3 / j10) / 1000000.0f;
    }

    public static m6.n l(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i7;
        m6.n n10;
        n0 n0Var2;
        m6.n n11;
        n0 n0Var3 = n0.c;
        if (n0Var == n0Var3) {
            i7 = r0Var.a;
        } else {
            r0 r0Var2 = r0.b;
            n0 n0Var4 = n0.a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i7 = 960;
                }
                i7 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i7 = 540;
                }
                i7 = 720;
            }
        }
        m6.n n12 = n(sizeArr, i7, n0Var);
        if (n12 != null) {
            return n12;
        }
        if (r0Var == r0.c && n0Var == (n0Var2 = n0.b) && (n11 = n(sizeArr, 480, n0Var2)) != null) {
            return n11;
        }
        int i10 = r0Var.a;
        if (n0Var != n0Var3 && (n10 = n(sizeArr, i10, n0Var3)) != null) {
            return n10;
        }
        int i11 = r0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (U(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || h(size2) < h(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (U(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && h(size3) < h(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new m6.n(m(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size m(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(U(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(h(size3), h(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static m6.n n(Size[] sizeArr, int i7, n0 n0Var) {
        int compare;
        m6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int U = U(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (U >= i7 && U <= i10 && max <= min) {
                Size m10 = m(sizeArr, size);
                m6.n nVar2 = new m6.n(m10, size, n0Var, i7);
                if (nVar != null) {
                    Size size2 = (Size) nVar.b;
                    int abs = Math.abs(Math.min(m10.getWidth(), m10.getHeight()) - 720);
                    Size size3 = (Size) nVar.c;
                    int abs2 = Math.abs(U(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long h = h(size) + h(m10);
                        long h7 = h(size3) + h(size2);
                        compare = h != h7 ? Long.compare(h, h7) : Long.compare(h(size), h(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                nVar = nVar2;
            }
        }
        return nVar;
    }

    public static boolean s(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void B(String str, Exception exc, boolean z9) {
        String str2;
        if (this.l0) {
            o oVar = this.j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z9);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            oVar.b(sb2.toString());
            int i7 = 0;
            this.l0 = false;
            this.j0 = false;
            this.k0 = true;
            this.m0 = false;
            this.n0 = false;
            if (z9 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.p0;
                this.p0 = null;
                this.q0 = null;
                if (this.W && this.r0 != null) {
                    i7 = 1;
                }
                if (cameraDevice != null) {
                    q(cameraDevice, i7 != 0 ? 4 : 1);
                    return;
                } else {
                    if (i7 != 0) {
                        t();
                        return;
                    }
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.k0 = true;
            this.j0 = false;
            this.l0 = false;
            this.r0 = null;
            p();
            r();
            this.z = null;
            this.p0 = null;
            this.q0 = null;
            this.v0 = null;
            this.w0 = null;
            o oVar2 = this.j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.F);
            u10.append(", devices=");
            u10.append(this.s0.size());
            u10.append(", switchElapsedMs=");
            u10.append(A(this.G0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            oVar2.b(u10.toString());
            if (this.s0.isEmpty()) {
                this.W = false;
                if (!this.V || this.Z) {
                    return;
                }
                H();
                return;
            }
            this.A0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.s0);
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q((CameraDevice) obj, 2);
            }
        }
    }

    public final void C(String str, Exception exc) {
        String str2;
        boolean z9;
        n nVar = this.x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.d0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.d0 = true;
        this.f0 = true;
        p();
        m6.n nVar2 = this.L;
        if (nVar2 == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.K = D(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) nVar2.b;
        this.r = (Size) nVar2.c;
        this.s = nVar2.a;
        this.I = (n0) nVar2.d;
        this.h0 = null;
        this.i0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        t tVar = this.w;
        if (tVar != null) {
            tVar.l();
            this.w = null;
        }
        n nVar3 = this.x;
        if (nVar3 != null) {
            nVar3.u();
            this.x = null;
        }
        this.u = null;
        try {
            v();
            O();
            o oVar = this.j;
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
            oVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.V || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e10) {
            N(e10);
        }
    }

    public final boolean F(String str, String str2) {
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

    public final boolean G() {
        CameraCharacteristics cameraCharacteristics;
        return this.G == m0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void H() {
        if (this.V && this.v0 == null && this.z == null) {
            if (f0.d.b(this.a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.d.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                this.B0 = SystemClock.elapsedRealtimeNanos();
                R(this.F);
                long A = A(this.B0);
                if (this.z == null && this.x == null) {
                    K();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                TextureView textureView = this.c;
                int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                surfaceTexture.setDefaultBufferSize(max, max);
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                boolean z9 = false;
                if (this.x == null) {
                    w();
                } else {
                    t tVar = this.w;
                    if (tVar != null) {
                        tVar.n(this.r, this.s, E(this.p));
                        Surface surface = null;
                        if (!this.l0 && this.o0) {
                            this.o0 = false;
                            t tVar2 = this.w;
                            Handler handler = tVar2.u;
                            if (tVar2.r0 && handler != null) {
                                handler.post(new g60(tVar2, z9, surface, 17));
                            }
                        }
                        t tVar3 = this.w;
                        Surface surface2 = tVar3.w;
                        if (surface2 == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface2;
                        if (this.l0 && (!tVar3.f || (surface = tVar3.y) == null)) {
                            throw new IllegalStateException("Secondary GL camera surface is unavailable");
                        }
                        this.v = surface;
                    }
                }
                J();
                this.E0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s + ", selectionElapsedMs=" + A + ", dualActive=" + this.l0);
                I(this.o, false);
            } catch (Exception e10) {
                N(e10);
            }
        }
    }

    public final void I(String str, boolean z9) {
        j jVar = new j(this, z9 ? this.p1 : this.o1, z9);
        if (z9) {
            this.w0 = jVar;
        } else {
            this.v0 = jVar;
        }
        try {
            this.b.openCamera(str, jVar, this.n);
        } catch (CameraAccessException | RuntimeException e10) {
            jVar.c();
            if (!z9 ? this.v0 == jVar : this.w0 == jVar) {
                if (z9) {
                    this.w0 = null;
                } else {
                    this.v0 = null;
                }
            }
            throw e10;
        }
    }

    public final void J() {
        if (this.l0 && !this.k0 && this.w0 == null && this.p0 == null) {
            m0 m0Var = this.H;
            m0 m0Var2 = m0.a;
            i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.h0 : this.i0;
            if (iVar == null) {
                return;
            }
            try {
                String str = iVar.a;
                this.q0 = iVar;
                this.z0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + iVar.b);
                I(str, true);
            } catch (Exception e10) {
                y("standby open request failed", e10);
            }
        }
    }

    public final void K() {
        if (this.k0) {
            return;
        }
        if (this.j0) {
            this.l0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.j;
        if (i7 < 30) {
            this.k0 = true;
            oVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        i k10 = k();
        o0 o0Var = k10.h;
        String str = k10.a;
        m0 m0Var = k10.b;
        m0 m0Var2 = m0.a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.b;
        }
        try {
            try {
                R(m0Var2);
                i k11 = k();
                o0 o0Var2 = k11.h;
                String str2 = k11.a;
                boolean F = F(str, str2);
                this.j0 = F;
                if (F && o0Var != o0Var2) {
                    this.j0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.e + "/" + k10.f + ", second=" + k11.e + "/" + k11.f + ", firstFps=" + o0Var.a + ", secondFps=" + o0Var2.a);
                }
                boolean z9 = this.j0;
                if (!z9) {
                    this.k0 = true;
                }
                this.l0 = z9;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.j0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.j0 ? "" : ", reason=pair not advertised");
                oVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.k0 = true;
                oVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void L() {
        this.u0 = true;
        this.V = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.k1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new u9.f(24, this, handlerThread));
    }

    public final void M(Exception exc) {
        boolean z9;
        n nVar = this.x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                this.j.a("camera lost while recording", exc);
                rt rtVar = this.k;
                ((t0) rtVar.b).i.post(new j0(rtVar, exc, 0));
                return;
            }
        }
        N(exc);
    }

    public final void N(Exception exc) {
        this.j.a("camera error", exc);
        rt rtVar = this.k;
        ((t0) rtVar.b).i.post(new j0(rtVar, exc, 1));
    }

    public final void O() {
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0L;
        this.c1 = 0.0d;
        this.d1 = 0L;
        this.e1 = 0L;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
        this.j1 = 0L;
    }

    public final void P() {
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0.0d;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
    }

    public final hy0 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, m6.n nVar) {
        Range[] rangeArr;
        m6.n nVar2;
        int i7;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.b;
        if (o0Var == o0Var2) {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i7 = 30;
        } else {
            if (!this.f0) {
                int i10 = o0Var.a;
                Range D = D(rangeArr4, i10);
                if (D != null) {
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
                        m6.n l10 = l(sizeArr2, this.d, this.g);
                        oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + D + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new hy0(o0.c, D, l10, 24);
                    } catch (RuntimeException unused) {
                        oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range D2 = D(rangeArr2, 30);
                oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + D2);
                return new hy0(o0Var2, D2, nVar, 24);
            }
            rangeArr = rangeArr4;
            i7 = 30;
            nVar2 = nVar;
        }
        Range D3 = D(rangeArr, i7);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.a);
        u10.append(", mode=REGULAR, range=");
        u10.append(D3);
        u10.append(this.f0 ? ", reason=session-wide fallback" : "");
        oVar.b(u10.toString());
        return new hy0(o0Var2, D3, nVar2, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        if ((r32 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r14.c).get(r9))) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
    
        if ((r32 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r15.c).get(r9))) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(m0 m0Var) {
        m0 m0Var2;
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        String str;
        long outputMinFrameDuration2;
        String str2;
        int i7;
        i k10;
        CameraCharacteristics.Key key;
        int i10;
        int i11;
        String[] strArr;
        int i12;
        r7 r7Var;
        String str3;
        String str4;
        hy0 Q;
        r7 r7Var2;
        o oVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        o0 o0Var;
        m0 m0Var3 = m0.b;
        m0 m0Var4 = m0.a;
        i iVar = m0Var == m0Var4 ? this.h0 : this.i0;
        String str5 = ", facing=";
        if (iVar != null) {
            g(iVar);
            this.j.b("camera outputs restored from cache: id=" + iVar.a + ", facing=" + m0Var + ", preview=" + iVar.d + ", recording=" + iVar.e + ", fps=" + iVar.h.a);
            return;
        }
        boolean z9 = true;
        if (!this.e0) {
            this.e0 = true;
            if (this.h == o0.c) {
                boolean Y = Y(m0Var4);
                boolean Y2 = Y(m0Var3);
                this.f0 = (Y && Y2) ? false : true;
                o oVar2 = this.j;
                StringBuilder sb3 = new StringBuilder("60 fps session capability: front=");
                sb3.append(Y);
                sb3.append(", back=");
                sb3.append(Y2);
                sb3.append(", selected=");
                sb3.append(this.f0 ? 30 : 60);
                oVar2.b(sb3.toString());
            }
        }
        int i13 = m0Var == m0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        r7 r7Var3 = null;
        r7 r7Var4 = null;
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
                r7Var = r7Var3;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i11 = i14;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str6 + ", reason=no stream map");
                    i10 = i13;
                    r7Var = r7Var3;
                    strArr = strArr2;
                    i12 = i15;
                } else {
                    int i16 = i13;
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        strArr = strArr2;
                        i12 = i15;
                        i10 = i16;
                        r7Var = r7Var3;
                        str3 = str5;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            try {
                                m6.n l10 = l(outputSizes, this.d, this.g);
                                str4 = "camera candidate rejected: id=";
                                strArr = strArr2;
                                i12 = i15;
                                i10 = i16;
                                str6 = str6;
                                r7Var = r7Var3;
                                try {
                                    Q = Q(str6, cameraCharacteristics, streamConfigurationMap2, outputSizes, l10);
                                    try {
                                        r7Var2 = new r7(str6, cameraCharacteristics, outputSizes, l10, Q, 23);
                                        oVar = this.j;
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
                                        r7Var3 = r7Var;
                                        i14 = i11 + 1;
                                        m0Var4 = m0Var2;
                                        str5 = str3;
                                        i13 = i10;
                                        cameraIdList = strArr;
                                        length = i12;
                                        z9 = true;
                                    }
                                    try {
                                        sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                                        sb2.append(", fps=");
                                        sb2.append(((o0) Q.b).a);
                                        sb2.append(", preview=");
                                        sb2.append((Size) ((m6.n) Q.d).b);
                                        sb2.append(", recording=");
                                        sb2.append((Size) ((m6.n) Q.d).c);
                                        oVar.b(sb2.toString());
                                        if (r7Var4 != null) {
                                        }
                                        r7Var4 = r7Var2;
                                        o0Var = this.h;
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        this.j.b(str4 + str6 + ", reason=" + e);
                                        r7Var3 = r7Var;
                                        i14 = i11 + 1;
                                        m0Var4 = m0Var2;
                                        str5 = str3;
                                        i13 = i10;
                                        cameraIdList = strArr;
                                        length = i12;
                                        z9 = true;
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
                                r7Var = r7Var3;
                                str3 = str5;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                r7Var3 = r7Var;
                                i14 = i11 + 1;
                                m0Var4 = m0Var2;
                                str5 = str3;
                                i13 = i10;
                                cameraIdList = strArr;
                                length = i12;
                                z9 = true;
                            }
                        } catch (RuntimeException e14) {
                            e = e14;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i12 = i15;
                            i10 = i16;
                        }
                        if (o0Var == o0.b || ((o0) Q.b) == o0Var) {
                            if (r7Var != null) {
                            }
                            r7Var3 = r7Var2;
                            i14 = i11 + 1;
                            m0Var4 = m0Var2;
                            str5 = str3;
                            i13 = i10;
                            cameraIdList = strArr;
                            length = i12;
                            z9 = true;
                        }
                    }
                    r7Var3 = r7Var;
                    i14 = i11 + 1;
                    m0Var4 = m0Var2;
                    str5 = str3;
                    i13 = i10;
                    cameraIdList = strArr;
                    length = i12;
                    z9 = true;
                }
            }
            str3 = str5;
            r7Var3 = r7Var;
            i14 = i11 + 1;
            m0Var4 = m0Var2;
            str5 = str3;
            i13 = i10;
            cameraIdList = strArr;
            length = i12;
            z9 = true;
        }
        r7 r7Var5 = r7Var3;
        String str7 = str5;
        r7 r7Var6 = r7Var5 == null ? r7Var4 : r7Var5;
        if (r7Var6 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) r7Var6.b;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) r7Var6.c;
        Size[] sizeArr = (Size[]) r7Var6.d;
        m6.n nVar = (m6.n) r7Var6.e;
        hy0 hy0Var = (hy0) r7Var6.f;
        m6.n nVar2 = (m6.n) hy0Var.d;
        this.o = str8;
        this.H = m0Var;
        this.p = cameraCharacteristics2;
        this.J = (o0) hy0Var.b;
        this.K = (Range) hy0Var.c;
        this.d0 = false;
        this.L = nVar;
        O();
        this.q = (Size) nVar2.b;
        this.r = (Size) nVar2.c;
        this.s = nVar2.a;
        this.I = (n0) nVar2.d;
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
                o oVar3 = this.j;
                String str9 = str;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", displayRotation=");
                sb4.append(z());
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
                sb4.append(E(this.p) ? "REALTIME" : "UNKNOWN");
                sb4.append(this.J != this.h ? a8.p0.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                oVar3.b(sb4.toString());
                if (m0Var == m0Var2) {
                    if (!this.b0) {
                        i7 = 1;
                        this.b0 = true;
                        Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                        Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                        Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        o oVar4 = this.j;
                        StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                        sb5.append(str8);
                        sb5.append(str7);
                        sb5.append(m0Var);
                        sb5.append(", hardwareLevel=");
                        sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == i7 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i17 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
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
                        oVar4.b(sb5.toString());
                    }
                    k10 = k();
                    if (k10.b != m0Var2) {
                        this.h0 = k10;
                        return;
                    } else {
                        this.i0 = k10;
                        return;
                    }
                }
                i7 = 1;
                if (!this.c0) {
                    this.c0 = true;
                    Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    o oVar42 = this.j;
                    StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
                    sb52.append(str8);
                    sb52.append(str7);
                    sb52.append(m0Var);
                    sb52.append(", hardwareLevel=");
                    sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == i7 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i17 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
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
                    oVar42.b(sb52.toString());
                }
                k10 = k();
                if (k10.b != m0Var2) {
                }
            }
            str = ", flashAvailable=";
            outputMinFrameDuration2 = -1;
            o oVar32 = this.j;
            String str92 = str;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", displayRotation=");
            sb42.append(z());
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
            sb42.append(E(this.p) ? "REALTIME" : "UNKNOWN");
            sb42.append(this.J != this.h ? a8.p0.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            oVar32.b(sb42.toString());
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
        o oVar322 = this.j;
        String str922 = str;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", displayRotation=");
        sb422.append(z());
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
        sb422.append(E(this.p) ? "REALTIME" : "UNKNOWN");
        sb422.append(this.J != this.h ? a8.p0.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        oVar322.b(sb422.toString());
        if (m0Var == m0Var2) {
        }
    }

    public final void S(boolean z9) {
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return;
        }
        handler.post(new tp0(16, this, z9));
    }

    public final boolean T(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.m1);
        handler.post(this.m1);
        return true;
    }

    public final void W(x xVar, long j3, m0 m0Var) {
        if (this.u0) {
            this.j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.E = xVar;
        this.M = j3;
        this.F = m0Var;
        this.V = true;
        this.Z = false;
        this.d0 = false;
        this.y = null;
        this.a0 = true;
        this.D0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        this.j.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.n1);
        Handler handler = this.n;
        if (this.V && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean X() {
        Handler handler = this.n;
        if (!this.V || this.Z || handler == null) {
            return false;
        }
        this.Z = true;
        this.a0 = false;
        this.j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean Y(m0 m0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i7 = m0Var == m0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, this.d, this.g)).b) == o0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Z(m0 m0Var) {
        if (!this.V || this.W || m0Var == this.G) {
            return;
        }
        this.W = true;
        this.X = true;
        this.P = false;
        this.Q = false;
        this.N = 0.0f;
        rt rtVar = this.k;
        ((t0) rtVar.b).i.post(new u9.f(26, rtVar, m0Var));
        this.G0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.G + ", to=" + m0Var);
        if (a0(m0Var)) {
            return;
        }
        if (this.l0) {
            this.r0 = m0Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        t tVar = this.w;
        if (tVar != null) {
            m0 m0Var2 = this.G;
            Handler handler = tVar.u;
            if (tVar.r0 && handler != null) {
                handler.post(new wg.r(tVar, m0Var2, m0Var, handler, 1));
            }
        }
        t();
    }

    public final boolean a0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        if (!this.l0 || !this.m0 || !this.n0 || (cameraDevice = this.z) == null || (cameraDevice2 = this.p0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.q0) == null || iVar.b != m0Var || this.w == null) {
            return false;
        }
        this.z = cameraDevice2;
        this.p0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.u;
        this.u = this.v;
        this.v = surface;
        this.q0 = this.G == m0.a ? this.h0 : this.i0;
        g(iVar);
        this.G = m0Var;
        boolean z9 = true;
        try {
            try {
                CaptureRequest.Builder x10 = x(this.z, this.u, iVar, true, false);
                try {
                    this.C = x10;
                    this.A.setRepeatingRequest(x10.build(), this.s1, this.n);
                    i iVar2 = this.q0;
                    if (iVar2 != null) {
                        CaptureRequest.Builder x11 = x(this.p0, this.v, iVar2, false, false);
                        this.D = x11;
                        this.B.setRepeatingRequest(x11.build(), this.s1, this.n);
                    }
                    boolean z10 = !this.o0;
                    this.o0 = z10;
                    long j3 = this.G0;
                    t tVar = this.w;
                    b bVar = new b(this, m0Var, j3, 0);
                    Handler handler = tVar.u;
                    if (tVar.r0 && handler != null) {
                        handler.post(new g60(tVar, z10, bVar, 17));
                    }
                    this.m0 = true;
                    this.n0 = true;
                    this.X = false;
                    this.W = false;
                    this.Y = false;
                    O();
                    this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.z.getId() + ", standbyId=" + this.p0.getId() + ", input=" + (this.o0 ? 1 : 0) + ", elapsedMs=" + A(this.G0));
                    this.c.post(new a(this, 2));
                    rt rtVar = this.k;
                    ((t0) rtVar.b).i.post(new g60(rtVar, new h(this.G, this.I, this.J, this.q, this.r, this.O, G()), z9, 18));
                    return true;
                } catch (CameraAccessException e10) {
                    e = e10;
                    B("role switch request failed", e, false);
                    return true;
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    B("role switch request failed", e, false);
                    return true;
                } catch (IllegalStateException e12) {
                    e = e12;
                    B("role switch request failed", e, false);
                    return true;
                }
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e13) {
                e = e13;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e14) {
            e = e14;
        }
    }

    public final void b0() {
        if (this.a0) {
            this.c.setTransform(new Matrix());
            if (z() != this.C0) {
                a aVar = new a(this, 1);
                Handler handler = this.n;
                if (handler != null) {
                    handler.post(aVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        CameraDevice cameraDevice;
        CameraCaptureSession cameraCaptureSession = this.A;
        if (!this.V || cameraCaptureSession == null || (cameraDevice = this.z) == null) {
            return;
        }
        try {
            if (cameraDevice != null) {
                try {
                    if (this.u != null) {
                        CaptureRequest.Builder x10 = x(cameraDevice, this.u, k(), true, false);
                        this.C = x10;
                        CameraCaptureSession cameraCaptureSession2 = this.A;
                        if (cameraCaptureSession2 != null) {
                            cameraCaptureSession2.setRepeatingRequest(x10.build(), this.s1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e10) {
                    e = e10;
                    if (!this.l0) {
                        B("active repeating request failed", e, false);
                        return;
                    } else if (this.J == o0.c) {
                        C("60 fps updated request rejected", e);
                        return;
                    } else {
                        N(e);
                        return;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    if (!this.l0) {
                    }
                } catch (IllegalStateException e12) {
                    e = e12;
                    if (this.l0) {
                        B("active repeating request rejected", e, false);
                        return;
                    }
                    if (!this.V || this.Z || cameraCaptureSession != this.A) {
                        this.j.b("stale repeating request rejection ignored: " + e.getMessage());
                        return;
                    }
                    this.j.b("repeating request rejected by closed camera; reopening device: " + e.getMessage());
                    p();
                    CameraDevice cameraDevice2 = this.z;
                    this.z = null;
                    if (cameraDevice2 == null) {
                        H();
                        return;
                    } else {
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        q(cameraDevice2, 2);
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

    public final void g(i iVar) {
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
        this.d0 = false;
        O();
    }

    public final void j() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.l1);
        }
        this.y = null;
    }

    public final i k() {
        return new i(this.o, this.H, this.p, this.q, this.r, this.s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void o() {
        j();
        this.W = false;
        this.t1 = 1;
        this.v0 = null;
        this.w0 = null;
        this.a0 = false;
        this.X = false;
        this.Y = false;
        this.C = null;
        this.Q = false;
        this.r0 = null;
        p();
        r();
        this.z = null;
        this.p0 = null;
        this.q0 = null;
        if (!this.s0.isEmpty()) {
            this.A0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("closing camera devices: count=" + this.s0.size());
            ArrayList arrayList = new ArrayList(this.s0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q((CameraDevice) obj, 1);
            }
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
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
    }

    public final void p() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void q(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.t0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.t1 = i7;
        }
        cameraDevice.close();
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.n0 = false;
    }

    public final void t() {
        this.r0 = null;
        this.j.b("camera switch path: sequential".concat(this.j0 ? ", reason=standby session not ready" : ", reason=concurrent pair unavailable"));
        p();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            this.z = null;
            this.A0 = SystemClock.elapsedRealtimeNanos();
            q(cameraDevice, 2);
        } else {
            if (this.v0 != null) {
                return;
            }
            this.W = false;
            H();
        }
    }

    public final void u() {
        CameraDevice cameraDevice = this.z;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.F0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.K);
            cameraDevice.createCaptureSession(Arrays.asList(this.u), this.r1, this.n);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            if (this.J == o0.c) {
                C("60 fps session creation rejected", e10);
            } else {
                N(e10);
            }
        }
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        Surface surface3;
        x xVar = this.E;
        long j3 = this.M;
        int i7 = this.e;
        int i10 = this.f;
        int i11 = this.g0;
        if (i11 <= 0) {
            i11 = this.J.a;
        }
        int i12 = i11;
        o oVar = this.j;
        rt rtVar = this.k;
        Objects.requireNonNull(rtVar);
        c cVar = new c(rtVar, 0);
        rt rtVar2 = this.k;
        Objects.requireNonNull(rtVar2);
        n nVar = new n(xVar, j3, i7, i10, i12, oVar, cVar, new c(rtVar2, 1));
        this.x = nVar;
        synchronized (nVar) {
            if (nVar.D) {
                surface = nVar.q;
            } else {
                nVar.q();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.n.start();
                    nVar.D = true;
                    nVar.f.b("codecs prepared: video=" + nVar.n.getName() + ", audio=" + nVar.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.q;
                } catch (IOException | RuntimeException e10) {
                    nVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.r;
        Surface surface5 = this.t;
        boolean z9 = this.l0;
        int i13 = this.e;
        int i14 = this.s;
        boolean E = E(this.p);
        boolean z10 = this.i;
        o oVar2 = this.j;
        n nVar2 = this.x;
        rt rtVar3 = this.k;
        Objects.requireNonNull(rtVar3);
        t tVar = new t(size, surface4, surface5, z9, i13, i14, E, z10, oVar2, nVar2, new c(rtVar3, 2));
        this.w = tVar;
        tVar.u0 = new a(this, 3);
        int z11 = z();
        this.C0 = z11;
        t tVar2 = this.w;
        tVar2.s0 = z11;
        Handler handler = tVar2.u;
        if (tVar2.r0 && handler != null) {
            handler.post(new g2(tVar2, z11, 11));
        }
        t tVar3 = this.w;
        if (tVar3.r0) {
            surface2 = tVar3.w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar3.t = handlerThread;
            handlerThread.start();
            tVar3.q0 = System.nanoTime();
            o oVar3 = tVar3.i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar3.a);
            sb2.append(", crop=");
            sb2.append(tVar3.j);
            sb2.append(", output=");
            sb2.append(tVar3.g);
            sb2.append("x");
            sb2.append(tVar3.g);
            sb2.append(", filter=");
            sb2.append(tVar3.j == tVar3.g ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(tVar3.h);
            sb2.append(", dualInput=");
            sb2.append(tVar3.f);
            sb2.append(", glPreview=");
            sb2.append(tVar3.e != null);
            oVar3.b(sb2.toString());
            Handler handler2 = new Handler(tVar3.t.getLooper());
            tVar3.u = handler2;
            handler2.post(new u9.f(25, tVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar3.x0 != null) {
                    RuntimeException runtimeException = tVar3.x0;
                    tVar3.x0 = null;
                    tVar3.l();
                    throw runtimeException;
                }
                surface2 = tVar3.w;
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                tVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.u = surface2;
        if (!this.l0) {
            this.v = null;
            return;
        }
        m0 m0Var = this.H;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.h0 : this.i0;
        if (iVar == null) {
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        t tVar4 = this.w;
        Size size2 = iVar.e;
        int i15 = iVar.f;
        boolean E2 = E(iVar.c);
        Handler handler3 = tVar4.u;
        if (tVar4.r0 && tVar4.f && handler3 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler3.post(new r(tVar4, size2, i15, E2, runtimeExceptionArr, countDownLatch2, 0));
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
        t tVar5 = this.w;
        if (!tVar5.f || (surface3 = tVar5.y) == null) {
            throw new IllegalStateException("Secondary GL camera surface is unavailable");
        }
        this.v = surface3;
    }

    public final void w() {
        try {
            v();
        } catch (IOException | RuntimeException e10) {
            if (!this.l0) {
                throw e10;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
            t tVar = this.w;
            if (tVar != null) {
                tVar.l();
                this.w = null;
            }
            n nVar = this.x;
            if (nVar != null) {
                nVar.u();
                this.x = null;
            }
            this.u = null;
            this.v = null;
            this.l0 = false;
            this.j0 = false;
            this.k0 = true;
            v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder x(CameraDevice cameraDevice, Surface surface, i iVar, boolean z9, boolean z10) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
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
            if (z10) {
                this.j.b("capture FPS range selected: " + iVar.i + ", cameraId=" + iVar.a + ", active=" + z9);
            }
        }
        if (z9) {
            float z11 = com.google.android.recaptcha.internal.a.z(this.O, 1.0f, this.N, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z11))));
                    boolean z12 = !this.P && G();
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
                int max = Math.max(1, Math.round(rect.width() / z11));
                int max2 = Math.max(1, Math.round(rect.height() / z11));
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
        int i7 = this.T + 1;
        this.T = i7;
        createCaptureRequest.setTag(Integer.valueOf(i7));
        if (this.Q) {
            this.U = this.T;
        }
        return createCaptureRequest;
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.k0 = true;
        this.j0 = false;
        this.l0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.p0;
        this.p0 = null;
        this.q0 = null;
        this.w0 = null;
        if (cameraDevice == null || cameraDevice == this.z) {
            return;
        }
        q(cameraDevice, 1);
    }

    public final int z() {
        Display display = this.c.getDisplay();
        if (display == null) {
            return 0;
        }
        int rotation = display.getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return qs.K2;
        }
        if (rotation != 3) {
            return 0;
        }
        return qs.t4;
    }
}
