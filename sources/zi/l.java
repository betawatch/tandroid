package zi;

import a8.r7;
import a8.xa;
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
import com.google.android.gms.internal.vision.e2;
import hi.m3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.z30;
import org.telegram.ui.f60;
import org.telegram.ui.nb1;
import tg.v1;
import y7.f7;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class l {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public y D;
    public long D0;
    public volatile n0 E;
    public long E0;
    public n0 F;
    public long F0;
    public n0 G;
    public long G0;
    public o0 H;
    public long H0;
    public q0 I;
    public long I0;
    public Range J;
    public long J0;
    public xa K;
    public long K0;
    public long L;
    public long L0;
    public volatile float M;
    public double M0;
    public long N0;
    public boolean O;
    public long O0;
    public boolean P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public volatile boolean U;
    public long U0;
    public boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public volatile boolean X;
    public long X0;
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context a;
    public boolean a0;
    public long a1;
    public final CameraManager b;
    public boolean b0;
    public double b1;
    public final TextureView c;
    public boolean c0;
    public long c1;
    public final t0 d;
    public boolean d0;
    public long d1;
    public final int e;
    public boolean e0;
    public long e1;
    public final int f;
    public int f0;
    public long f1;
    public final o0 g;
    public j g0;
    public long g1;
    public final q0 h;
    public j h0;
    public long h1;
    public final boolean i;
    public boolean i0;
    public long i1;
    public final p j;
    public boolean j0;
    public final m3 j1;
    public final u7.i k;
    public boolean k0;
    public final a k1;
    public boolean l0;
    public final a l1;
    public HandlerThread m;
    public boolean m0;
    public final z30 m1;
    public Handler n;
    public boolean n0;
    public final f n1;
    public String o;
    public CameraDevice o0;
    public final f o1;
    public CameraCharacteristics p;
    public j p0;
    public final g p1;
    public volatile Size q;
    public n0 q0;
    public final g q1;
    public volatile int r;
    public final h r1;
    public Surface s;
    public Surface t;
    public volatile boolean t0;
    public Surface u;
    public k u0;
    public u v;
    public k v0;
    public o w;
    public int w0;
    public o x;
    public HandlerThread x0;
    public CameraDevice y;
    public long y0;
    public CameraCaptureSession z;
    public long z0;
    public final Rect l = new Rect();
    public float N = 1.0f;
    public final ArrayList r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();
    public int s1 = 1;

    public l(Context context, TextureView textureView, t0 t0Var, int i7, o0 o0Var, q0 q0Var, boolean z10, p pVar, u7.i iVar) {
        m3 m3Var = new m3(this, 2);
        this.j1 = m3Var;
        this.k1 = new a(this, 5);
        this.l1 = new a(this, 6);
        this.m1 = new z30(this, 5);
        this.n1 = new f(this, 0);
        this.o1 = new f(this, 1);
        this.p1 = new g(this, 0);
        this.q1 = new g(this, 1);
        this.r1 = new h(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = t0Var;
        this.e = t0Var.a;
        this.f = i7;
        this.g = o0Var;
        this.h = q0Var;
        this.i = z10;
        this.j = pVar;
        this.k = iVar;
        textureView.addOnLayoutChangeListener(m3Var);
    }

    public static Range C(Range[] rangeArr, int i7) {
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

    public static boolean D(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public static float R(CameraCharacteristics cameraCharacteristics) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null || rect.width() <= 0 || rect.height() <= 0) {
            return 1.3333334f;
        }
        return Math.max(rect.width(), rect.height()) / Math.min(rect.width(), rect.height());
    }

    public static float U(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d2 = j10;
        double d10 = j3 / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d10 * d10))) / 1000000.0d);
    }

    public static void a(l lVar) {
        CameraDevice cameraDevice = lVar.y;
        CameraDevice cameraDevice2 = lVar.o0;
        if (!lVar.k0 || cameraDevice == null || cameraDevice2 == null || lVar.t == null || lVar.u == null || lVar.z != null || lVar.A != null) {
            return;
        }
        lVar.l0 = false;
        lVar.m0 = false;
        try {
            lVar.E0 = SystemClock.elapsedRealtimeNanos();
            lVar.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + lVar.q + ", fpsRange=" + lVar.J);
            cameraDevice.createCaptureSession(Arrays.asList(lVar.t), lVar.q1, lVar.n);
            cameraDevice2.createCaptureSession(Arrays.asList(lVar.u), lVar.p1, lVar.n);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            lVar.A("session request failed", e10, false);
        }
    }

    public static void b(l lVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        int i7 = 1;
        if (cameraDevice == lVar.y) {
            lVar.o();
            lVar.y = null;
            lVar.p(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(r.b.k("Active camera ", str));
            }
            lVar.L(illegalStateException);
            return;
        }
        if (cameraDevice == lVar.o0) {
            lVar.o0 = null;
        }
        if (!lVar.k0) {
            lVar.p(cameraDevice, 1);
            return;
        }
        p pVar = lVar.j;
        StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
        sb2.append(str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        sb2.append(str2);
        pVar.b(sb2.toString());
        boolean z10 = false;
        lVar.k0 = false;
        lVar.i0 = false;
        lVar.j0 = true;
        lVar.p0 = null;
        lVar.q();
        boolean z11 = lVar.U && lVar.y != null && lVar.z == null && !lVar.V;
        if (lVar.V && lVar.q0 != null) {
            z10 = true;
        }
        if (z11) {
            i7 = 3;
        } else if (z10) {
            i7 = 4;
        }
        lVar.p(cameraDevice, i7);
    }

    public static void c(l lVar, CameraDevice cameraDevice) {
        lVar.r0.remove(cameraDevice);
        lVar.s0.remove(cameraDevice);
        if (cameraDevice == lVar.y) {
            lVar.y = null;
        }
        if (cameraDevice == lVar.o0) {
            lVar.o0 = null;
        }
        p pVar = lVar.j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(lVar.r0.size());
        sb2.append(", closing=");
        sb2.append(lVar.s0.size());
        sb2.append(", afterClose=");
        int i7 = lVar.s1;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "CONTINUE_SWITCH" : "RETRY_SESSION" : "REOPEN" : "NONE");
        sb2.append(", closeElapsedMs=");
        sb2.append(z(lVar.z0));
        pVar.b(sb2.toString());
        if (lVar.s0.isEmpty()) {
            int i10 = lVar.s1;
            lVar.s1 = 1;
            if (!lVar.U || lVar.Y || i10 == 1) {
                return;
            }
            int c10 = p1.g.c(i10);
            if (c10 == 1) {
                lVar.V = false;
                lVar.G();
                return;
            }
            if (c10 != 2) {
                if (c10 != 3) {
                    return;
                }
                lVar.j.b("continuing pending switch after DUAL_ACTIVE fallback");
                lVar.s();
                return;
            }
            if (lVar.y == null || lVar.z != null) {
                return;
            }
            lVar.j.b("retrying capture session after standby camera closed");
            lVar.t();
        }
    }

    public static void d(l lVar) {
        n0 n0Var = lVar.q0;
        if (n0Var != null && lVar.k0 && lVar.l0 && lVar.m0) {
            lVar.q0 = null;
            if (lVar.Z(n0Var)) {
                return;
            }
            lVar.V = false;
            lVar.Y(n0Var);
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

    public static xa l(Size[] sizeArr, float f10, t0 t0Var, o0 o0Var) {
        int i7;
        xa m10;
        o0 o0Var2;
        xa m11;
        o0 o0Var3 = o0.c;
        if (o0Var == o0Var3) {
            i7 = t0Var.a;
        } else {
            t0 t0Var2 = t0.b;
            o0 o0Var4 = o0.a;
            if (t0Var == t0Var2) {
                if (o0Var == o0Var4) {
                    i7 = 960;
                }
                i7 = 720;
            } else {
                if (o0Var != o0Var4) {
                    i7 = 540;
                }
                i7 = 720;
            }
        }
        xa m12 = m(sizeArr, f10, i7, o0Var);
        if (m12 != null) {
            return m12;
        }
        if (t0Var == t0.c && o0Var == (o0Var2 = o0.b) && (m11 = m(sizeArr, f10, 480, o0Var2)) != null) {
            return m11;
        }
        int i10 = t0Var.a;
        if (o0Var != o0Var3 && (m10 = m(sizeArr, f10, i10, o0Var3)) != null) {
            return m10;
        }
        int i11 = t0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (Math.min(size2.getWidth(), size2.getHeight()) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || h(size2) < h(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (Math.min(size3.getWidth(), size3.getHeight()) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && h(size3) < h(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new xa(size, o0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), 28);
    }

    public static xa m(Size[] sizeArr, float f10, int i7, o0 o0Var) {
        xa xaVar = null;
        float f11 = 0.0f;
        for (Size size : sizeArr) {
            int i10 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i7 && min2 <= i10 && max <= min) {
                float min3 = (Math.min(1.0f, f10 / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i7) / Math.min(size.getWidth(), size.getHeight());
                if (xaVar == null || min3 > f11 || (min3 == f11 && h(size) < h((Size) xaVar.c))) {
                    xaVar = new xa(size, o0Var, i7, 28);
                    f11 = min3;
                }
            }
        }
        return xaVar;
    }

    public static boolean r(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.k0) {
            p pVar = this.j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            pVar.b(sb2.toString());
            int i7 = 0;
            this.k0 = false;
            this.i0 = false;
            this.j0 = true;
            this.l0 = false;
            this.m0 = false;
            if (z10 && this.z != null) {
                q();
                CameraDevice cameraDevice = this.o0;
                this.o0 = null;
                this.p0 = null;
                if (this.V && this.q0 != null) {
                    i7 = 1;
                }
                if (cameraDevice != null) {
                    p(cameraDevice, i7 != 0 ? 4 : 1);
                    return;
                } else {
                    if (i7 != 0) {
                        s();
                        return;
                    }
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.j0 = true;
            this.i0 = false;
            this.k0 = false;
            this.q0 = null;
            o();
            q();
            this.y = null;
            this.o0 = null;
            this.p0 = null;
            this.u0 = null;
            this.v0 = null;
            p pVar2 = this.j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.E);
            u10.append(", devices=");
            u10.append(this.r0.size());
            u10.append(", switchElapsedMs=");
            u10.append(z(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            pVar2.b(u10.toString());
            if (this.r0.isEmpty()) {
                this.V = false;
                if (!this.U || this.Y) {
                    return;
                }
                G();
                return;
            }
            this.z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                p((CameraDevice) obj, 2);
            }
        }
    }

    public final void B(String str, Exception exc) {
        String str2;
        boolean z10;
        o oVar = this.w;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.c0 = true;
        this.e0 = true;
        o();
        xa xaVar = this.K;
        if (xaVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = q0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.J = C(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) xaVar.c;
        this.r = xaVar.b;
        this.H = (o0) xaVar.d;
        this.g0 = null;
        this.h0 = null;
        x("frame-rate fallback changed stream configuration", exc);
        u uVar = this.v;
        if (uVar != null) {
            uVar.l();
            this.v = null;
        }
        o oVar2 = this.w;
        if (oVar2 != null) {
            oVar2.u();
            this.w = null;
        }
        this.t = null;
        try {
            u();
            N();
            p pVar = this.j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", recording=");
            sb2.append(this.q);
            sb2.append(", crop=");
            sb2.append(this.r);
            sb2.append(", fpsRange=");
            sb2.append(this.J);
            pVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.U || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e10) {
            M(e10);
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
        return this.F == n0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void G() {
        if (this.U && this.u0 == null && this.y == null) {
            if (f0.d.b(this.a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.d.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                this.A0 = SystemClock.elapsedRealtimeNanos();
                Q(this.E);
                long z10 = z(this.A0);
                if (this.y == null && this.w == null) {
                    J();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                TextureView textureView = this.c;
                int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                surfaceTexture.setDefaultBufferSize(max, max);
                if (this.s == null) {
                    this.s = new Surface(surfaceTexture);
                }
                boolean z11 = false;
                if (this.w == null) {
                    v();
                } else {
                    u uVar = this.v;
                    if (uVar != null) {
                        uVar.n(this.q, this.r, D(this.p));
                        Surface surface = null;
                        if (!this.k0 && this.n0) {
                            this.n0 = false;
                            u uVar2 = this.v;
                            Handler handler = uVar2.u;
                            if (uVar2.r0 && handler != null) {
                                handler.post(new f60(uVar2, z11, surface, 17));
                            }
                        }
                        u uVar3 = this.v;
                        Surface surface2 = uVar3.w;
                        if (surface2 == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.t = surface2;
                        if (this.k0 && (!uVar3.f || (surface = uVar3.y) == null)) {
                            throw new IllegalStateException("Secondary GL camera surface is unavailable");
                        }
                        this.u = surface;
                    }
                }
                I();
                this.D0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", recording=" + this.q + ", crop=" + this.r + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.k0);
                H(this.o, false);
            } catch (Exception e10) {
                M(e10);
            }
        }
    }

    public final void H(String str, boolean z10) {
        k kVar = new k(this, z10 ? this.o1 : this.n1, z10);
        if (z10) {
            this.v0 = kVar;
        } else {
            this.u0 = kVar;
        }
        try {
            this.b.openCamera(str, kVar, this.n);
        } catch (CameraAccessException | RuntimeException e10) {
            kVar.c();
            if (!z10 ? this.u0 == kVar : this.v0 == kVar) {
                if (z10) {
                    this.v0 = null;
                } else {
                    this.u0 = null;
                }
            }
            throw e10;
        }
    }

    public final void I() {
        if (this.k0 && !this.j0 && this.v0 == null && this.o0 == null) {
            n0 n0Var = this.G;
            n0 n0Var2 = n0.a;
            j jVar = (n0Var == n0Var2 ? n0.b : n0Var2) == n0Var2 ? this.g0 : this.h0;
            if (jVar == null) {
                return;
            }
            try {
                String str = jVar.a;
                this.p0 = jVar;
                this.y0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + jVar.b);
                H(str, true);
            } catch (Exception e10) {
                x("standby open request failed", e10);
            }
        }
    }

    public final void J() {
        if (this.j0) {
            return;
        }
        if (this.i0) {
            this.k0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        p pVar = this.j;
        if (i7 < 30) {
            this.j0 = true;
            pVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        j k10 = k();
        q0 q0Var = k10.g;
        String str = k10.a;
        n0 n0Var = k10.b;
        n0 n0Var2 = n0.a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.b;
        }
        try {
            try {
                Q(n0Var2);
                j k11 = k();
                q0 q0Var2 = k11.g;
                String str2 = k11.a;
                boolean E = E(str, str2);
                this.i0 = E;
                if (E && q0Var != q0Var2) {
                    this.i0 = false;
                    pVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.d + "/" + k10.e + ", second=" + k11.d + "/" + k11.e + ", firstFps=" + q0Var.a + ", secondFps=" + q0Var2.a);
                }
                boolean z10 = this.i0;
                if (!z10) {
                    this.j0 = true;
                }
                this.k0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.i0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.i0 ? "" : ", reason=pair not advertised");
                pVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.j0 = true;
                pVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void K() {
        this.t0 = true;
        this.U = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.j1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new e(0, this, handlerThread));
    }

    public final void L(Exception exc) {
        boolean z10;
        o oVar = this.w;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                this.j.a("camera lost while recording", exc);
                u7.i iVar = this.k;
                ((v0) iVar.a).i.post(new k0(iVar, exc, 0));
                return;
            }
        }
        M(exc);
    }

    public final void M(Exception exc) {
        this.j.a("camera error", exc);
        u7.i iVar = this.k;
        ((v0) iVar.a).i.post(new k0(iVar, exc, 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0.0d;
        this.c1 = 0L;
        this.d1 = 0L;
        this.e1 = 0L;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
    }

    public final void O() {
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0.0d;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
    }

    public final f7 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, xa xaVar) {
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        p pVar = this.j;
        q0 q0Var = this.h;
        q0 q0Var2 = q0.b;
        if (q0Var == q0Var2 || this.e0) {
            Range C = C(rangeArr, 30);
            StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
            u10.append(q0Var.a);
            u10.append(", mode=REGULAR, range=");
            u10.append(C);
            u10.append(this.e0 ? ", reason=session-wide fallback" : "");
            pVar.b(u10.toString());
            return new f7(q0Var2, C, xaVar);
        }
        int i7 = q0Var.a;
        Range C2 = C(rangeArr, i7);
        if (C2 != null) {
            ArrayList arrayList = new ArrayList(sizeArr.length);
            int length = sizeArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                Size size = sizeArr[i11];
                int i12 = length;
                long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                if (outputMinFrameDuration <= 0 || outputMinFrameDuration <= 1000000000 / i7) {
                    arrayList.add(size);
                }
                i10 = i11 + 1;
                length = i12;
            }
            Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
            try {
                xa l10 = l(sizeArr2, R(cameraCharacteristics), this.d, this.g);
                pVar.b("fps selection: id=" + str + ", requested=" + i7 + ", mode=REGULAR, range=" + C2 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                return new f7(q0.c, C2, l10);
            } catch (RuntimeException unused) {
                pVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
            }
        } else {
            pVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range C3 = C(rangeArr, 30);
        pVar.b("fps selection: id=" + str + ", requested=" + i7 + ", fallback=30, range=" + C3);
        return new f7(q0Var2, C3, xaVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|(2:61|62)|(2:(1:91)(1:69)|(7:71|72|73|(4:(1:(1:85)(1:83))|86|87|39)|37|38|39))|92|72|73|(1:75)|(0)|86|87|39) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0204, code lost:
    
        if ((r31 == r8 && r13.equals(r4.get(r15)) && !r13.equals(((android.hardware.camera2.CameraCharacteristics) r14.c).get(r15))) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(n0 n0Var) {
        float floatValue;
        String str;
        j k10;
        CameraCharacteristics.Key key;
        int i7;
        n0 n0Var2;
        int i10;
        int i11;
        String[] strArr;
        String str2;
        r7 r7Var;
        r7 r7Var2;
        String str3;
        r7 r7Var3;
        f7 P;
        r7 r7Var4;
        p pVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        q0 q0Var;
        n0 n0Var3 = n0.b;
        n0 n0Var4 = n0.a;
        j jVar = n0Var == n0Var4 ? this.g0 : this.h0;
        String str4 = ", facing=";
        if (jVar != null) {
            g(jVar);
            this.j.b("camera outputs restored from cache: id=" + jVar.a + ", facing=" + n0Var + ", recording=" + jVar.d + ", fps=" + jVar.g.a);
            return;
        }
        if (!this.d0) {
            this.d0 = true;
            if (this.h == q0.c) {
                boolean X = X(n0Var4);
                boolean X2 = X(n0Var3);
                this.e0 = (X && X2) ? false : true;
                p pVar2 = this.j;
                StringBuilder sb3 = new StringBuilder("60 fps session capability: front=");
                sb3.append(X);
                sb3.append(", back=");
                sb3.append(X2);
                sb3.append(", selected=");
                sb3.append(this.e0 ? 30 : 60);
                pVar2.b(sb3.toString());
            }
        }
        int i12 = n0Var == n0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        r7 r7Var5 = null;
        r7 r7Var6 = null;
        int i13 = 0;
        while (i13 < length) {
            String[] strArr2 = cameraIdList;
            String str5 = strArr2[i13];
            int i14 = length;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str5);
            r7 r7Var7 = r7Var5;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i12) {
                i7 = i12;
                n0Var2 = n0Var4;
                i10 = i13;
            } else {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i10 = i13;
                if (streamConfigurationMap == null) {
                    this.j.b("camera candidate rejected: id=" + str5 + ", reason=no stream map");
                    i7 = i12;
                    n0Var2 = n0Var4;
                } else {
                    int i15 = i12;
                    String str6 = str5;
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        n0Var2 = n0Var4;
                        strArr = strArr2;
                        i11 = i14;
                        r7Var = r7Var7;
                        i7 = i15;
                        r7Var2 = r7Var6;
                        str2 = str4;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                        r7Var6 = r7Var2;
                        r7Var5 = r7Var;
                        i13 = i10 + 1;
                        str4 = str2;
                        n0Var4 = n0Var2;
                        i12 = i7;
                        cameraIdList = strArr;
                        length = i11;
                    } else {
                        try {
                        } catch (RuntimeException e10) {
                            e = e10;
                            n0Var2 = n0Var4;
                            strArr = strArr2;
                            i11 = i14;
                            r7Var = r7Var7;
                            i7 = i15;
                        }
                        try {
                            xa l10 = l(outputSizes, R(cameraCharacteristics), this.d, this.g);
                            n0Var2 = n0Var4;
                            strArr = strArr2;
                            i11 = i14;
                            r7Var = r7Var7;
                            i7 = i15;
                            r7Var3 = r7Var6;
                            str6 = str6;
                            try {
                                P = P(str6, cameraCharacteristics, streamConfigurationMap, outputSizes, l10);
                                try {
                                    r7Var4 = new r7(str6, cameraCharacteristics, outputSizes, l10, P, 23);
                                    pVar = this.j;
                                    sb2 = new StringBuilder();
                                    str3 = "camera candidate rejected: id=";
                                    try {
                                        sb2.append("camera candidate accepted: id=");
                                        sb2.append(str6);
                                        sb2.append(str4);
                                        sb2.append(n0Var);
                                        sb2.append(", flashAvailable=");
                                        bool = Boolean.TRUE;
                                        key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                        str2 = str4;
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        str2 = str4;
                                    }
                                } catch (RuntimeException e12) {
                                    e = e12;
                                    str2 = str4;
                                    str6 = str6;
                                    str3 = "camera candidate rejected: id=";
                                    r7Var6 = r7Var3;
                                    this.j.b(str3 + str6 + ", reason=" + e);
                                    r7Var5 = r7Var;
                                    i13 = i10 + 1;
                                    str4 = str2;
                                    n0Var4 = n0Var2;
                                    i12 = i7;
                                    cameraIdList = strArr;
                                    length = i11;
                                }
                            } catch (RuntimeException e13) {
                                e = e13;
                                str2 = str4;
                            }
                        } catch (RuntimeException e14) {
                            e = e14;
                            n0Var2 = n0Var4;
                            strArr = strArr2;
                            i11 = i14;
                            r7Var = r7Var7;
                            i7 = i15;
                            str6 = str6;
                            str2 = str4;
                            str3 = "camera candidate rejected: id=";
                            this.j.b(str3 + str6 + ", reason=" + e);
                            r7Var5 = r7Var;
                            i13 = i10 + 1;
                            str4 = str2;
                            n0Var4 = n0Var2;
                            i12 = i7;
                            cameraIdList = strArr;
                            length = i11;
                        }
                        try {
                            sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                            sb2.append(", fps=");
                            sb2.append(((q0) P.a).a);
                            sb2.append(", recording=");
                            sb2.append((Size) ((xa) P.c).c);
                            sb2.append(", crop=");
                            sb2.append(((xa) P.c).b);
                            pVar.b(sb2.toString());
                        } catch (RuntimeException e15) {
                            e = e15;
                            r7Var6 = r7Var3;
                            this.j.b(str3 + str6 + ", reason=" + e);
                            r7Var5 = r7Var;
                            i13 = i10 + 1;
                            str4 = str2;
                            n0Var4 = n0Var2;
                            i12 = i7;
                            cameraIdList = strArr;
                            length = i11;
                        }
                        if (r7Var3 != null) {
                            if (!(n0Var == n0Var3 && bool.equals(cameraCharacteristics.get(key2)) && !bool.equals(((CameraCharacteristics) r7Var3.c).get(key2)))) {
                                r7Var6 = r7Var3;
                                q0Var = this.h;
                                if (q0Var != q0.b || ((q0) P.a) == q0Var) {
                                    if (r7Var != null) {
                                    }
                                    r7Var5 = r7Var4;
                                    i13 = i10 + 1;
                                    str4 = str2;
                                    n0Var4 = n0Var2;
                                    i12 = i7;
                                    cameraIdList = strArr;
                                    length = i11;
                                }
                                r7Var5 = r7Var;
                                i13 = i10 + 1;
                                str4 = str2;
                                n0Var4 = n0Var2;
                                i12 = i7;
                                cameraIdList = strArr;
                                length = i11;
                            }
                        }
                        r7Var6 = r7Var4;
                        q0Var = this.h;
                        if (q0Var != q0.b) {
                        }
                        if (r7Var != null) {
                        }
                        r7Var5 = r7Var4;
                        i13 = i10 + 1;
                        str4 = str2;
                        n0Var4 = n0Var2;
                        i12 = i7;
                        cameraIdList = strArr;
                        length = i11;
                    }
                }
            }
            strArr = strArr2;
            i11 = i14;
            r7Var = r7Var7;
            r7Var2 = r7Var6;
            str2 = str4;
            r7Var6 = r7Var2;
            r7Var5 = r7Var;
            i13 = i10 + 1;
            str4 = str2;
            n0Var4 = n0Var2;
            i12 = i7;
            cameraIdList = strArr;
            length = i11;
        }
        n0 n0Var5 = n0Var4;
        String str7 = str4;
        r7 r7Var8 = r7Var6;
        if (r7Var5 == null) {
            r7Var5 = r7Var8;
        }
        if (r7Var5 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) r7Var5.b;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) r7Var5.c;
        Size[] sizeArr = (Size[]) r7Var5.d;
        xa xaVar = (xa) r7Var5.e;
        f7 f7Var = (f7) r7Var5.f;
        xa xaVar2 = (xa) f7Var.c;
        this.o = str8;
        this.G = n0Var;
        this.p = cameraCharacteristics2;
        this.I = (q0) f7Var.a;
        this.J = (Range) f7Var.b;
        this.c0 = false;
        this.K = xaVar;
        N();
        this.q = (Size) xaVar2.c;
        this.r = xaVar2.b;
        this.H = (o0) xaVar2.d;
        if (Build.VERSION.SDK_INT >= 30) {
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
        this.N = Math.max(1.0f, Math.min(4.0f, floatValue));
        Size size = this.q;
        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        long j3 = -1;
        if (streamConfigurationMap2 != null) {
            try {
                j3 = streamConfigurationMap2.getOutputMinFrameDuration(SurfaceTexture.class, size);
            } catch (RuntimeException unused) {
            }
        }
        p pVar3 = this.j;
        StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
        sb4.append(this.e);
        sb4.append("x");
        sb4.append(this.e);
        sb4.append(", displayRotation=");
        sb4.append(y());
        sb4.append(", cameraMode=");
        sb4.append(this.H);
        if (this.H != this.g) {
            str = " (fallback from " + this.g + ")";
        } else {
            str = "";
        }
        sb4.append(str);
        sb4.append(", crop=");
        sb4.append(this.r);
        sb4.append(", recording=");
        sb4.append(this.q);
        sb4.append(", sensorAspect=");
        sb4.append(R(cameraCharacteristics2));
        sb4.append(", recordingMinFrameDurationNs=");
        sb4.append(j3);
        sb4.append(", fps=");
        sb4.append(this.I.a);
        sb4.append(", fpsRange=");
        sb4.append(this.J);
        sb4.append(", timestampSource=");
        sb4.append(D(this.p) ? "REALTIME" : "UNKNOWN");
        sb4.append(this.I != this.h ? a8.p0.n(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        pVar3.b(sb4.toString());
        if (n0Var == n0Var5) {
            if (!this.a0) {
                this.a0 = true;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                p pVar4 = this.j;
                StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                sb5.append(str8);
                sb5.append(str7);
                sb5.append(n0Var);
                sb5.append(", hardwareLevel=");
                sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (Build.VERSION.SDK_INT < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                sb5.append(", sensorOrientation=");
                sb5.append(num3);
                sb5.append(", activeArray=");
                sb5.append(rect);
                sb5.append(", flashAvailable=");
                sb5.append(bool2);
                sb5.append(", aeModes=");
                sb5.append(Arrays.toString(iArr));
                sb5.append(", fpsRanges=");
                sb5.append(Arrays.toString(rangeArr));
                sb5.append(", outputSizes=");
                sb5.append(Arrays.toString(sizeArr));
                pVar4.b(sb5.toString());
            }
            k10 = k();
            if (k10.b != n0Var5) {
                this.g0 = k10;
                return;
            } else {
                this.h0 = k10;
                return;
            }
        }
        if (!this.b0) {
            this.b0 = true;
            Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            p pVar42 = this.j;
            StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
            sb52.append(str8);
            sb52.append(str7);
            sb52.append(n0Var);
            sb52.append(", hardwareLevel=");
            sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == 1 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (Build.VERSION.SDK_INT < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
            sb52.append(", sensorOrientation=");
            sb52.append(num32);
            sb52.append(", activeArray=");
            sb52.append(rect2);
            sb52.append(", flashAvailable=");
            sb52.append(bool22);
            sb52.append(", aeModes=");
            sb52.append(Arrays.toString(iArr2));
            sb52.append(", fpsRanges=");
            sb52.append(Arrays.toString(rangeArr2));
            sb52.append(", outputSizes=");
            sb52.append(Arrays.toString(sizeArr));
            pVar42.b(sb52.toString());
        }
        k10 = k();
        if (k10.b != n0Var5) {
        }
    }

    public final void S(boolean z10) {
        Handler handler = this.n;
        if (!this.U || handler == null) {
            return;
        }
        handler.post(new fp0(18, this, z10));
    }

    public final boolean T(float f10) {
        this.M = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.n;
        if (!this.U || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.l1);
        handler.post(this.l1);
        return true;
    }

    public final void V(y yVar, long j3, n0 n0Var) {
        if (this.t0) {
            this.j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.D = yVar;
        this.L = j3;
        this.E = n0Var;
        this.U = true;
        this.Y = false;
        this.c0 = false;
        this.x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        this.j.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.m1);
        Handler handler = this.n;
        if (this.U && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean W() {
        Handler handler = this.n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean X(n0 n0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i7 = n0Var == n0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((q0) P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, R(cameraCharacteristics), this.d, this.g)).a) == q0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Y(n0 n0Var) {
        if (!this.U || this.V || n0Var == this.F) {
            return;
        }
        this.V = true;
        this.W = true;
        this.O = false;
        this.P = false;
        this.M = 0.0f;
        u7.i iVar = this.k;
        ((v0) iVar.a).i.post(new e(2, iVar, n0Var));
        this.F0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.F + ", to=" + n0Var);
        if (Z(n0Var)) {
            return;
        }
        if (this.k0) {
            this.q0 = n0Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        u uVar = this.v;
        if (uVar != null) {
            n0 n0Var2 = this.F;
            Handler handler = uVar.u;
            if (uVar.r0 && handler != null) {
                handler.post(new v1(uVar, n0Var2, n0Var, handler, 4));
            }
        }
        s();
    }

    public final boolean Z(n0 n0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        CaptureRequest.Builder w10;
        if (!this.k0 || !this.l0 || !this.m0 || (cameraDevice = this.y) == null || (cameraDevice2 = this.o0) == null || (cameraCaptureSession = this.z) == null || (cameraCaptureSession2 = this.A) == null || (jVar = this.p0) == null || jVar.b != n0Var || this.v == null) {
            return false;
        }
        this.y = cameraDevice2;
        this.o0 = cameraDevice;
        this.z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.t;
        this.t = this.u;
        this.u = surface;
        this.p0 = this.F == n0.a ? this.g0 : this.h0;
        g(jVar);
        this.F = n0Var;
        boolean z10 = true;
        try {
            try {
                w10 = w(this.y, this.t, jVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.B = w10;
            this.z.setRepeatingRequest(w10.build(), this.r1, this.n);
            j jVar2 = this.p0;
            if (jVar2 != null) {
                CaptureRequest.Builder w11 = w(this.o0, this.u, jVar2, false, false);
                this.C = w11;
                this.A.setRepeatingRequest(w11.build(), this.r1, this.n);
            }
            boolean z11 = !this.n0;
            this.n0 = z11;
            long j3 = this.F0;
            u uVar = this.v;
            b bVar = new b(this, n0Var, j3, 0);
            Handler handler = uVar.u;
            if (uVar.r0 && handler != null) {
                handler.post(new f60(uVar, z11, bVar, 17));
            }
            this.l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.y.getId() + ", standbyId=" + this.o0.getId() + ", input=" + (this.n0 ? 1 : 0) + ", elapsedMs=" + z(this.F0));
            this.c.post(new a(this, 2));
            u7.i iVar = this.k;
            ((v0) iVar.a).i.post(new f60(iVar, new i(this.F, this.H, this.I, this.q, this.N, F()), z10, 18));
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

    public final void a0() {
        if (this.Z) {
            this.c.setTransform(new Matrix());
            if (y() != this.B0) {
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
        CameraCaptureSession cameraCaptureSession = this.z;
        if (!this.U || cameraCaptureSession == null || (cameraDevice = this.y) == null) {
            return;
        }
        try {
            if (cameraDevice != null) {
                try {
                    if (this.t != null) {
                        CaptureRequest.Builder w10 = w(cameraDevice, this.t, k(), true, false);
                        this.B = w10;
                        CameraCaptureSession cameraCaptureSession2 = this.z;
                        if (cameraCaptureSession2 != null) {
                            cameraCaptureSession2.setRepeatingRequest(w10.build(), this.r1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e10) {
                    e = e10;
                    if (!this.k0) {
                        A("active repeating request failed", e, false);
                        return;
                    } else if (this.I == q0.c) {
                        B("60 fps updated request rejected", e);
                        return;
                    } else {
                        M(e);
                        return;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    if (!this.k0) {
                    }
                } catch (IllegalStateException e12) {
                    e = e12;
                    if (this.k0) {
                        A("active repeating request rejected", e, false);
                        return;
                    }
                    if (!this.U || this.Y || cameraCaptureSession != this.z) {
                        this.j.b("stale repeating request rejection ignored: " + e.getMessage());
                        return;
                    }
                    this.j.b("repeating request rejected by closed camera; reopening device: " + e.getMessage());
                    o();
                    CameraDevice cameraDevice2 = this.y;
                    this.y = null;
                    if (cameraDevice2 == null) {
                        G();
                        return;
                    } else {
                        this.z0 = SystemClock.elapsedRealtimeNanos();
                        p(cameraDevice2, 2);
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

    public final void g(j jVar) {
        this.o = jVar.a;
        this.G = jVar.b;
        this.p = jVar.c;
        this.q = jVar.d;
        this.r = jVar.e;
        this.H = jVar.f;
        this.I = jVar.g;
        this.J = jVar.h;
        this.K = jVar.i;
        this.N = jVar.j;
        this.c0 = false;
        N();
    }

    public final void j() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.k1);
        }
        this.x = null;
    }

    public final j k() {
        return new j(this.o, this.G, this.p, this.q, this.r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void n() {
        j();
        this.V = false;
        this.s1 = 1;
        this.u0 = null;
        this.v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.q0 = null;
        o();
        q();
        this.y = null;
        this.o0 = null;
        this.p0 = null;
        if (!this.r0.isEmpty()) {
            this.z0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("closing camera devices: count=" + this.r0.size());
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                p((CameraDevice) obj, 1);
            }
        }
        u uVar = this.v;
        if (uVar != null) {
            uVar.l();
            this.v = null;
        }
        Surface surface = this.s;
        if (surface != null) {
            surface.release();
            this.s = null;
        }
        this.t = null;
        this.u = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
    }

    public final void o() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.z = null;
        }
        this.B = null;
    }

    public final void p(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.s1 = i7;
        }
        cameraDevice.close();
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
        this.m0 = false;
    }

    public final void s() {
        this.q0 = null;
        this.j.b("camera switch path: sequential".concat(this.i0 ? ", reason=standby session not ready" : ", reason=concurrent pair unavailable"));
        o();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            this.y = null;
            this.z0 = SystemClock.elapsedRealtimeNanos();
            p(cameraDevice, 2);
        } else {
            if (this.u0 != null) {
                return;
            }
            this.V = false;
            G();
        }
    }

    public final void t() {
        CameraDevice cameraDevice = this.y;
        if (cameraDevice == null || this.s == null || this.t == null) {
            return;
        }
        try {
            this.E0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: recording=" + this.q + ", fpsRange=" + this.J);
            cameraDevice.createCaptureSession(Arrays.asList(this.t), this.q1, this.n);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            if (this.I == q0.c) {
                B("60 fps session creation rejected", e10);
            } else {
                M(e10);
            }
        }
    }

    public final void u() {
        Surface surface;
        Surface surface2;
        Surface surface3;
        y yVar = this.D;
        long j3 = this.L;
        int i7 = this.e;
        int i10 = this.f;
        int i11 = this.f0;
        if (i11 <= 0) {
            i11 = this.I.a;
        }
        int i12 = i11;
        p pVar = this.j;
        u7.i iVar = this.k;
        Objects.requireNonNull(iVar);
        c cVar = new c(iVar, 0);
        u7.i iVar2 = this.k;
        Objects.requireNonNull(iVar2);
        o oVar = new o(yVar, j3, i7, i10, i12, pVar, cVar, new c(iVar2, 1));
        this.w = oVar;
        synchronized (oVar) {
            if (oVar.D) {
                surface = oVar.q;
            } else {
                oVar.q();
                long nanoTime = System.nanoTime();
                try {
                    oVar.b();
                    oVar.a();
                    oVar.n.start();
                    oVar.D = true;
                    oVar.f.b("codecs prepared: video=" + oVar.n.getName() + ", audio=" + oVar.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = oVar.q;
                } catch (IOException | RuntimeException e10) {
                    oVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.q;
        Surface surface5 = this.s;
        boolean z10 = this.k0;
        int i13 = this.e;
        int i14 = this.r;
        boolean D = D(this.p);
        boolean z11 = this.i;
        p pVar2 = this.j;
        o oVar2 = this.w;
        u7.i iVar3 = this.k;
        Objects.requireNonNull(iVar3);
        u uVar = new u(size, surface4, surface5, z10, i13, i14, D, z11, pVar2, oVar2, new c(iVar3, 2));
        this.v = uVar;
        uVar.u0 = new a(this, 3);
        int y10 = y();
        this.B0 = y10;
        u uVar2 = this.v;
        uVar2.s0 = y10;
        Handler handler = uVar2.u;
        if (uVar2.r0 && handler != null) {
            handler.post(new nb1(uVar2, y10, 14));
        }
        u uVar3 = this.v;
        if (uVar3.r0) {
            surface2 = uVar3.w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            uVar3.t = handlerThread;
            handlerThread.start();
            uVar3.q0 = System.nanoTime();
            p pVar3 = uVar3.i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(uVar3.a);
            sb2.append(", crop=");
            sb2.append(uVar3.j);
            sb2.append(", output=");
            sb2.append(uVar3.g);
            sb2.append("x");
            sb2.append(uVar3.g);
            sb2.append(", filter=");
            sb2.append(uVar3.j == uVar3.g ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(uVar3.h);
            sb2.append(", dualInput=");
            sb2.append(uVar3.f);
            sb2.append(", glPreview=");
            sb2.append(uVar3.e != null);
            pVar3.b(sb2.toString());
            Handler handler2 = new Handler(uVar3.t.getLooper());
            uVar3.u = handler2;
            handler2.post(new e(1, uVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (uVar3.x0 != null) {
                    RuntimeException runtimeException = uVar3.x0;
                    uVar3.x0 = null;
                    uVar3.l();
                    throw runtimeException;
                }
                surface2 = uVar3.w;
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                uVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.t = surface2;
        if (!this.k0) {
            this.u = null;
            return;
        }
        n0 n0Var = this.G;
        n0 n0Var2 = n0.a;
        j jVar = (n0Var == n0Var2 ? n0.b : n0Var2) == n0Var2 ? this.g0 : this.h0;
        if (jVar == null) {
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        u uVar4 = this.v;
        Size size2 = jVar.d;
        int i15 = jVar.e;
        boolean D2 = D(jVar.c);
        Handler handler3 = uVar4.u;
        if (uVar4.r0 && uVar4.f && handler3 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler3.post(new s(uVar4, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
        u uVar5 = this.v;
        if (!uVar5.f || (surface3 = uVar5.y) == null) {
            throw new IllegalStateException("Secondary GL camera surface is unavailable");
        }
        this.u = surface3;
    }

    public final void v() {
        try {
            u();
        } catch (IOException | RuntimeException e10) {
            if (!this.k0) {
                throw e10;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
            u uVar = this.v;
            if (uVar != null) {
                uVar.l();
                this.v = null;
            }
            o oVar = this.w;
            if (oVar != null) {
                oVar.u();
                this.w = null;
            }
            this.t = null;
            this.u = null;
            this.k0 = false;
            this.i0 = false;
            this.j0 = true;
            u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder w(CameraDevice cameraDevice, Surface surface, j jVar, boolean z10, boolean z11) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        createCaptureRequest.addTarget(surface);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = jVar.c;
        if (r(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = jVar.h;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z11) {
                this.j.b("capture FPS range selected: " + jVar.h + ", cameraId=" + jVar.a + ", active=" + z10);
            }
        }
        if (z10) {
            float z12 = e2.z(this.N, 1.0f, this.M, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z12))));
                    boolean z13 = !this.O && F();
                    cameraCharacteristics = this.p;
                    if (r(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                    createCaptureRequest.set(key2, Integer.valueOf(z13 ? 2 : 0));
                    if (this.P) {
                        this.j.b("torch request configured: requested=" + this.O + ", applied=" + z13 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                    }
                }
            }
            CameraCharacteristics cameraCharacteristics4 = this.p;
            Rect rect = cameraCharacteristics4 == null ? null : (Rect) cameraCharacteristics4.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect != null) {
                int max = Math.max(1, Math.round(rect.width() / z12));
                int max2 = Math.max(1, Math.round(rect.height() / z12));
                int centerX = rect.centerX() - (max / 2);
                int centerY = rect.centerY() - (max2 / 2);
                this.l.set(centerX, centerY, max + centerX, max2 + centerY);
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
            }
            if (this.O) {
            }
            cameraCharacteristics = this.p;
            if (r(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
            }
            CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
            createCaptureRequest.set(key22, Integer.valueOf(z13 ? 2 : 0));
            if (this.P) {
            }
        } else {
            if (r((int[]) jVar.c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            }
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        }
        int i7 = this.S + 1;
        this.S = i7;
        createCaptureRequest.setTag(Integer.valueOf(i7));
        if (this.P) {
            this.T = this.S;
        }
        return createCaptureRequest;
    }

    public final void x(String str, Exception exc) {
        String str2;
        this.j0 = true;
        this.i0 = false;
        this.k0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.j.b(sb2.toString());
        q();
        CameraDevice cameraDevice = this.o0;
        this.o0 = null;
        this.p0 = null;
        this.v0 = null;
        if (cameraDevice == null || cameraDevice == this.y) {
            return;
        }
        p(cameraDevice, 1);
    }

    public final int y() {
        Display display = this.c.getDisplay();
        if (display == null) {
            return 0;
        }
        int rotation = display.getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return ns.K2;
        }
        if (rotation != 3) {
            return 0;
        }
        return ns.t4;
    }
}
