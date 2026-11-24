// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class za5 implements vc8 {
    public static za5 e;
    public ad8 a;
    public va5 b;
    public float c;
    public String d;

    public static ArrayList a(long j, qd2 qd2Var) {
        c75 c75Var;
        ArrayList arrayList = qd2Var.f;
        ArrayList arrayList2 = new ArrayList();
        g95 g95Var = g95.s5;
        rd2 rd2Var = null;
        if (g95Var != null && (c75Var = g95Var.T3) != null && c75Var.b) {
            rd2Var = c75Var.e;
        }
        if (rd2Var != null && b(qd2Var, rd2Var, j)) {
            arrayList2.add(rd2Var);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            rd2 rd2Var2 = (rd2) arrayList.get(i);
            if (rd2Var2 != rd2Var && b(qd2Var, rd2Var2, j)) {
                arrayList2.add(rd2Var2);
            }
        }
        return arrayList2;
    }

    public static boolean b(qd2 qd2Var, rd2 rd2Var, long j) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (rd2Var == qd2Var.z || (groupCallParticipant = rd2Var.a) == null || groupCallParticipant.self) {
            return false;
        }
        long B1 = k47.B1(groupCallParticipant.peer);
        if (B1 == j || qd2Var.d.f(B1) == null) {
            return false;
        }
        boolean z = rd2Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant2 = rd2Var.a;
        if ((z ? groupCallParticipant2.presentation : groupCallParticipant2.video) != null) {
            return (z ? groupCallParticipant2.presentationEndpoint : groupCallParticipant2.videoEndpoint) != null;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void d() {
        ad8 ad8Var;
        za5 za5Var = e;
        if (za5Var == null || (ad8Var = za5Var.a) == null || !ad8Var.e()) {
            return;
        }
        oa5 oa5Var = oa5.f0;
        ad8 ad8Var2 = e.a;
        boolean z = false;
        ?? r4 = oa5Var != null ? 1 : 0;
        if (oa5Var != null && oa5Var.r) {
            z = true;
        }
        byte b = ad8Var2.c;
        if (b != 3) {
            ad8Var2.f = r4;
            ad8Var2.g = z;
            if (b == 2) {
                ad8Var2.d = r4;
            } else {
                ad8Var2.c = r4;
            }
            ad8Var2.b.d();
        }
    }

    public static void f() {
        tp9.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) {
            za5 za5Var = e;
            if (za5Var != null) {
                e = null;
                ad8 ad8Var = za5Var.a;
                if (ad8Var != null) {
                    za5Var.a = null;
                    ad8Var.g();
                    return;
                }
                return;
            }
            return;
        }
        za5 za5Var2 = e;
        if (za5Var2 == null) {
            za5Var2 = new za5();
            za5Var2.c = 1.0f;
            e = za5Var2;
        }
        ad8 ad8Var2 = za5Var2.a;
        if (ad8Var2 == null || !ad8Var2.e()) {
            e.a = yc3.c().k(e);
            d();
        }
        za5 za5Var3 = e;
        if (za5Var3.b == null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            qd2 qd2Var = sharedInstance3 != null ? sharedInstance3.groupCall : null;
            if (sharedInstance2 != null && qd2Var != null) {
                ArrayList a = a(sharedInstance2.getSelfId(), qd2Var);
                int max = Math.max(1, a.size());
                float[] fArr = new float[max];
                float[] fArr2 = new float[max];
                Arrays.fill(fArr2, 1.0f);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.size(); i++) {
                    rd2 rd2Var = (rd2) a.get(i);
                    float f = rd2Var.c;
                    if (f <= 0.0f) {
                        f = 0.0f;
                    }
                    fArr[i] = f;
                    boolean z = rd2Var.b;
                    fArr2[i] = z ? 2.0f : 1.0f;
                    TLRPC.GroupCallParticipant groupCallParticipant = rd2Var.a;
                    sb.append(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
                    sb.append(':');
                    sb.append(Math.round(fArr[i] * 100.0f));
                    sb.append(';');
                }
                String sb2 = sb.toString();
                if (!sb2.equals(za5Var3.d)) {
                    za5Var3.d = sb2;
                    za5Var3.c = gre.a(fArr, fArr2, 0.45f, 2.35f, null, 0.0f).a;
                }
            }
        }
        e.a.d();
    }

    @Override // vc8
    public final boolean A0() {
        return true;
    }

    @Override // vc8
    public final void B0(int i) {
        ka1.b(i, true);
        gm.d3(new bn3((byte) 14), 300L);
    }

    @Override // vc8
    public final boolean D() {
        return true;
    }

    @Override // vc8
    public final boolean F(boolean z, float f, lx9 lx9Var) {
        return false;
    }

    @Override // vc8
    public final boolean G() {
        return false;
    }

    @Override // vc8
    public final void I(Rect rect) {
        rect.setEmpty();
    }

    @Override // vc8
    public final View J(LaunchActivity launchActivity) {
        return new va5(this, launchActivity);
    }

    @Override // vc8
    public final void K(View view) {
        ((va5) view).h();
        if (this.b == view) {
            this.b = null;
        }
    }

    @Override // vc8
    public final View O() {
        return null;
    }

    @Override // vc8
    public final boolean P() {
        return g95.s5 != null && g95.t5;
    }

    @Override // vc8
    public final int S() {
        va5 va5Var = this.b;
        return Math.round((va5Var != null ? va5Var.n : this.c) * 1000.0f);
    }

    @Override // vc8
    public final boolean V() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        qd2 qd2Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
        if (sharedInstance == null || qd2Var == null || sharedInstance.isHangingUp() || qd2Var.k()) {
            return false;
        }
        TLRPC.GroupCall groupCall = qd2Var.b;
        return groupCall == null || !groupCall.rtmp_stream;
    }

    @Override // vc8
    public final boolean W() {
        return false;
    }

    @Override // vc8
    public final re8 Y() {
        return null;
    }

    @Override // vc8
    public final boolean a0() {
        return true;
    }

    @Override // vc8
    public final void e0() {
        this.a = null;
        g95 g95Var = g95.s5;
        if (g95Var != null && g95Var.getWindow() != null) {
            g95Var.getWindow().getDecorView().setVisibility(0);
        }
        gm.c3(new bn3((byte) 14));
    }

    @Override // vc8
    public final long getDuration() {
        return 0L;
    }

    @Override // vc8
    public final boolean i() {
        return true;
    }

    @Override // vc8
    public final long k() {
        return 0L;
    }

    @Override // vc8
    public final void l(View view) {
        ka1.a = false;
        ((va5) view).h();
        va5 va5Var = this.b;
        if (va5Var == view) {
            this.c = va5Var.n;
            this.b = null;
        }
        g95 g95Var = g95.s5;
        if (g95Var != null) {
            if (g95Var.getWindow() != null) {
                g95Var.getWindow().getDecorView().setVisibility(0);
            }
            g95Var.n1();
        }
        oa5.k(view.getContext());
    }

    @Override // vc8
    public final void m0(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = false;
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z = true;
        }
        ka1.a = z;
        this.b = (va5) view;
        g95 g95Var = g95.s5;
        if (g95Var != null) {
            g95Var.m1();
            if (g95Var.getWindow() != null) {
                g95Var.getWindow().getDecorView().setVisibility(4);
            }
        }
        va5 va5Var = this.b;
        if (!va5Var.w) {
            va5Var.w = true;
            va5Var.x = SystemClock.elapsedRealtime();
            VoIPService.getSharedInstance();
            va5Var.H = ka1.c();
            va5Var.f.a();
            va5Var.i(true);
            gm.d3(va5Var.J, 250L);
        }
        oa5.k(view.getContext());
    }

    @Override // vc8
    public final int o0() {
        return 1000;
    }

    @Override // vc8
    public final int p() {
        return 10;
    }

    @Override // vc8
    public final float p0() {
        return 0.0f;
    }

    @Override // vc8
    public final void q0(int i, ArrayList arrayList) {
        ka1.a(i, arrayList, true);
    }

    @Override // vc8
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override // vc8
    public final void M(View view) {
    }

    @Override // vc8
    public final void Q(bd8 bd8Var) {
    }

    @Override // vc8
    public final void R() {
    }

    @Override // vc8
    public final void T(float f) {
    }

    @Override // vc8
    public final void c() {
    }

    @Override // vc8
    public final void e(long j) {
    }

    @Override // vc8
    public final void j() {
    }

    @Override // vc8
    public final void n0() {
    }

    @Override // vc8
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
