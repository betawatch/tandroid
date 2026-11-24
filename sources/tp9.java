// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tp9 implements vc8, jm7 {
    public static tp9 w;
    public ad8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public wc8 e;
    public sp9 f;
    public rp9 h;
    public final int r;
    public long s;
    public final qp9 b = new qp9(this);
    public final ei7 n = new ei7(this, (byte) 22);

    public tp9(int i) {
        this.r = i;
        nm7.f(i).a(this, nm7.w2);
        nm7.f(i).a(this, nm7.B2);
    }

    public static qd2 b() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        qd2 qd2Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || qd2Var == null || (groupCall = qd2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return qd2Var;
    }

    public static boolean d() {
        ad8 ad8Var;
        tp9 tp9Var = w;
        return (tp9Var == null || (ad8Var = tp9Var.a) == null || !ad8Var.f()) ? false : true;
    }

    public static void f(Activity activity) {
        bd8 h;
        if (b() != null) {
            tp9 tp9Var = w;
            if (tp9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                tp9 tp9Var2 = new tp9(sharedInstance != null ? sharedInstance.getAccount() : z8c.t0);
                w = tp9Var2;
                tp9Var = tp9Var2;
            }
            ad8 ad8Var = tp9Var.a;
            if (ad8Var == null || !ad8Var.e()) {
                tp9Var.a = yc3.c().k(tp9Var);
            }
            ad8 ad8Var2 = tp9Var.a;
            if (ad8Var2.c != 0 || (h = ad8Var2.h(activity, null, true)) == null) {
                return;
            }
            wc8 wc8Var = new wc8(h);
            tp9Var.e = wc8Var;
            tp9Var.b.a = wc8Var;
            tp9Var.a();
            tp9Var.s = SystemClock.elapsedRealtime();
            ei7 ei7Var = tp9Var.n;
            gm.r(ei7Var);
            gm.d3(ei7Var, 700L);
            g95 g95Var = g95.s5;
            if (g95Var != null) {
                g95Var.dismiss();
            }
            pp9 pp9Var = pp9.Q0;
            if (pp9Var != null) {
                pp9Var.dismiss();
            }
            gm.c3(new bo6((byte) 19));
        }
    }

    public static void h(boolean z) {
        g95 g95Var = g95.s5;
        if (g95Var != null && g95Var.getWindow() != null) {
            g95Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
        }
        pp9 pp9Var = pp9.Q0;
        if (pp9Var == null || pp9Var.getWindow() == null) {
            return;
        }
        pp9Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
    }

    public static void m() {
        qd2 b = b();
        tp9 tp9Var = w;
        if (b != null) {
            if (tp9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                tp9Var = new tp9(sharedInstance != null ? sharedInstance.getAccount() : z8c.t0);
                w = tp9Var;
            }
            ad8 ad8Var = tp9Var.a;
            if (ad8Var == null || !ad8Var.e()) {
                tp9Var.a = yc3.c().k(tp9Var);
            }
            w.a();
            w.a.d();
            return;
        }
        if (tp9Var != null) {
            w = null;
            int i = tp9Var.r;
            nm7.f(i).n(tp9Var, nm7.w2);
            nm7.f(i).n(tp9Var, nm7.B2);
            ad8 ad8Var2 = tp9Var.a;
            if (ad8Var2 != null) {
                tp9Var.a = null;
                ad8Var2.g();
            }
            tp9Var.g();
        }
    }

    @Override // vc8
    public final boolean A0() {
        return false;
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
        return new sp9(this, launchActivity);
    }

    @Override // vc8
    public final void K(View view) {
        if (view == this.f) {
            h(false);
        }
        sp9 sp9Var = this.f;
        if (view == sp9Var) {
            sp9Var.b = false;
            gm.r(sp9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        sp9 sp9Var2 = (sp9) view;
        sp9Var2.b = false;
        gm.r(sp9Var2.e);
        sp9Var2.a.d.release();
    }

    @Override // vc8
    public final void M(View view) {
        h(true);
    }

    @Override // vc8
    public final View O() {
        return null;
    }

    @Override // vc8
    public final boolean P() {
        return pp9.Q0 != null && g95.t5;
    }

    @Override // vc8
    public final void Q(bd8 bd8Var) {
        wc8 wc8Var = new wc8(bd8Var);
        this.e = wc8Var;
        this.b.a = wc8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        ei7 ei7Var = this.n;
        gm.r(ei7Var);
        gm.d3(ei7Var, 700L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
    @Override // vc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int S() {
        float f;
        if (this.b.c > 0) {
            return this.b.c;
        }
        qd2 b = b();
        if (b != null) {
            ArrayList arrayList = b.f;
            if (!arrayList.isEmpty()) {
                f = ((rd2) arrayList.get(0)).c;
                if (f <= 0.0f) {
                    return Math.round(f * 1000.0f);
                }
                return 16;
            }
        }
        f = 0.0f;
        if (f <= 0.0f) {
        }
    }

    @Override // vc8
    public final boolean V() {
        return b() != null;
    }

    @Override // vc8
    public final boolean W() {
        return false;
    }

    @Override // vc8
    public final re8 Y() {
        return null;
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        qd2 b = b();
        boolean z = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || b == null || b.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            rd2 rd2Var = (rd2) b.f.get(0);
            groupCallParticipant = rd2Var.a;
            z = rd2Var.b;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.c;
        if (groupCallParticipant == groupCallParticipant2 && z == this.d) {
            return;
        }
        if (groupCallParticipant2 != null) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
        if (groupCallParticipant == null || sharedInstance == null || !sharedInstance.addExtraRemoteSink(groupCallParticipant, z, this.b)) {
            return;
        }
        this.c = groupCallParticipant;
        this.d = z;
        StringBuilder sb = new StringBuilder("bound ");
        sb.append(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        String sb2 = sb.toString();
        if (e21.a) {
            fc4.b("rtmp pip: ".concat(sb2));
        }
    }

    @Override // vc8
    public final boolean a0() {
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.w2 || i == nm7.B2) {
            a();
            sp9 sp9Var = this.f;
            if (sp9Var != null) {
                sp9Var.a();
            }
        }
    }

    @Override // vc8
    public final void e0() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        g();
        gm.c3(new bo6((byte) 19));
        gm.c3(new bo6((byte) 18));
    }

    public final void g() {
        gm.r(this.n);
        rp9 rp9Var = this.h;
        if (rp9Var != null) {
            rp9Var.a.K();
            VideoFrame videoFrame = rp9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                rp9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        wc8 wc8Var = this.e;
        if (wc8Var != null) {
            wc8Var.a();
            this.e = null;
        }
        if (this.c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.c, this.d, this.b);
            }
            this.c = null;
        }
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
        h(false);
        sp9 sp9Var = this.f;
        if (view == sp9Var) {
            sp9Var.b = false;
            gm.r(sp9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // vc8
    public final void m0(View view) {
        sp9 sp9Var = (sp9) view;
        this.f = sp9Var;
        if (!sp9Var.b) {
            sp9Var.b = true;
            gm.d3(sp9Var.e, 500L);
        }
        sp9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override // vc8
    public final void n0() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance == null || launchActivity == null || b() == null) {
            ad8 ad8Var = this.a;
            if (ad8Var != null) {
                ad8Var.b();
                return;
            }
            return;
        }
        if (g95.s5 == null && pp9.Q0 == null) {
            g95.S0(launchActivity, j5.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a != null) {
            wc8 wc8Var = this.e;
            this.e = null;
            this.b.a = null;
            this.a.a(new u35(this, wc8Var, (byte) 29));
            gm.c3(new bo6((byte) 19));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    @Override // vc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0() {
        float f;
        if (this.b.d > 0) {
            return this.b.d;
        }
        qd2 b = b();
        if (b != null) {
            ArrayList arrayList = b.f;
            if (!arrayList.isEmpty()) {
                f = ((rd2) arrayList.get(0)).c;
                return f <= 0.0f ? 1000 : 9;
            }
        }
        f = 0.0f;
        if (f <= 0.0f) {
        }
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
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        wc8 wc8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (wc8Var != null) {
            wc8Var.a();
        }
        surfaceTexture.release();
    }

    @Override // vc8
    public final void B0(int i) {
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
    public final void q0(int i, ArrayList arrayList) {
    }

    @Override // vc8
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
