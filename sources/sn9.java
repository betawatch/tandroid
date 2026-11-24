// default package

import android.app.Activity;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sn9 implements sa8, gk7 {
    public static sn9 w;
    public xa8 a;
    public TLRPC.GroupCallParticipant c;
    public boolean d;
    public ta8 e;
    public rn9 f;
    public qn9 h;
    public final int r;
    public long s;
    public final pn9 b = new pn9(this);
    public final bg7 n = new bg7(this, (byte) 22);

    public sn9(int i) {
        this.r = i;
        kk7.f(i).a(this, kk7.v2);
        kk7.f(i).a(this, kk7.A2);
    }

    public static fc2 b() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        fc2 fc2Var = sharedInstance != null ? sharedInstance.groupCall : null;
        if (sharedInstance == null || fc2Var == null || (groupCall = fc2Var.b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return fc2Var;
    }

    public static boolean c() {
        xa8 xa8Var;
        sn9 sn9Var = w;
        return (sn9Var == null || (xa8Var = sn9Var.a) == null || !xa8Var.e()) ? false : true;
    }

    public static void d(Activity activity) {
        ya8 g;
        if (b() != null) {
            sn9 sn9Var = w;
            if (sn9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                sn9 sn9Var2 = new sn9(sharedInstance != null ? sharedInstance.getAccount() : y6c.t0);
                w = sn9Var2;
                sn9Var = sn9Var2;
            }
            xa8 xa8Var = sn9Var.a;
            if (xa8Var == null || !xa8Var.d()) {
                sn9Var.a = mb3.c().k(sn9Var);
            }
            xa8 xa8Var2 = sn9Var.a;
            if (xa8Var2.c != 0 || (g = xa8Var2.g(activity, null, true)) == null) {
                return;
            }
            ta8 ta8Var = new ta8(g);
            sn9Var.e = ta8Var;
            sn9Var.b.a = ta8Var;
            sn9Var.a();
            sn9Var.s = SystemClock.elapsedRealtime();
            bg7 bg7Var = sn9Var.n;
            gl.r(bg7Var);
            gl.e3(bg7Var, 700L);
            h75 h75Var = h75.s5;
            if (h75Var != null) {
                h75Var.dismiss();
            }
            on9 on9Var = on9.Q0;
            if (on9Var != null) {
                on9Var.dismiss();
            }
            gl.d3(new am6((byte) 19));
        }
    }

    public static void h(boolean z) {
        h75 h75Var = h75.s5;
        if (h75Var != null && h75Var.getWindow() != null) {
            h75Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
        }
        on9 on9Var = on9.Q0;
        if (on9Var == null || on9Var.getWindow() == null) {
            return;
        }
        on9Var.getWindow().getDecorView().setVisibility(z ? 4 : 0);
    }

    public static void i() {
        fc2 b = b();
        sn9 sn9Var = w;
        if (b != null) {
            if (sn9Var == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                sn9Var = new sn9(sharedInstance != null ? sharedInstance.getAccount() : y6c.t0);
                w = sn9Var;
            }
            xa8 xa8Var = sn9Var.a;
            if (xa8Var == null || !xa8Var.d()) {
                sn9Var.a = mb3.c().k(sn9Var);
            }
            w.a();
            w.a.c();
            return;
        }
        if (sn9Var != null) {
            w = null;
            int i = sn9Var.r;
            kk7.f(i).n(sn9Var, kk7.v2);
            kk7.f(i).n(sn9Var, kk7.A2);
            xa8 xa8Var2 = sn9Var.a;
            if (xa8Var2 != null) {
                sn9Var.a = null;
                xa8Var2.f();
            }
            sn9Var.g();
        }
    }

    @Override // sa8
    public final void A0(SurfaceTexture surfaceTexture) {
        ta8 ta8Var = this.e;
        this.e = null;
        this.b.a = null;
        a();
        if (ta8Var != null) {
            ta8Var.a();
        }
        surfaceTexture.release();
    }

    @Override // sa8
    public final View C0() {
        return null;
    }

    @Override // sa8
    public final boolean F2() {
        return false;
    }

    @Override // sa8
    public final boolean G0() {
        return on9.Q0 != null && h75.t5;
    }

    @Override // sa8
    public final void H0(ya8 ya8Var) {
        ta8 ta8Var = new ta8(ya8Var);
        this.e = ta8Var;
        this.b.a = ta8Var;
        a();
        this.s = SystemClock.elapsedRealtime();
        bg7 bg7Var = this.n;
        gl.r(bg7Var);
        gl.e3(bg7Var, 700L);
    }

    @Override // sa8
    public final void L1(View view) {
        rn9 rn9Var = (rn9) view;
        this.f = rn9Var;
        if (!rn9Var.b) {
            rn9Var.b = true;
            gl.e3(rn9Var.e, 500L);
        }
        rn9Var.a();
        this.b.b = this.f.a.d;
        a();
    }

    @Override // sa8
    public final void P1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance == null || launchActivity == null || b() == null) {
            xa8 xa8Var = this.a;
            if (xa8Var != null) {
                xa8Var.b();
                return;
            }
            return;
        }
        if (h75.s5 == null && on9.Q0 == null) {
            h75.S0(launchActivity, j5.a(sharedInstance.getAccount()), null, null, false, null);
        }
        if (this.a != null) {
            ta8 ta8Var = this.e;
            this.e = null;
            this.b.a = null;
            this.a.a(new x15(this, ta8Var, (byte) 28));
            gl.d3(new am6((byte) 19));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
    @Override // sa8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Q0() {
        float f;
        if (this.b.c > 0) {
            return this.b.c;
        }
        fc2 b = b();
        if (b != null) {
            ArrayList arrayList = b.f;
            if (!arrayList.isEmpty()) {
                f = ((gc2) arrayList.get(0)).c;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    @Override // sa8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int S1() {
        float f;
        if (this.b.d > 0) {
            return this.b.d;
        }
        fc2 b = b();
        if (b != null) {
            ArrayList arrayList = b.f;
            if (!arrayList.isEmpty()) {
                f = ((gc2) arrayList.get(0)).c;
                return f <= 0.0f ? 1000 : 9;
            }
        }
        f = 0.0f;
        if (f <= 0.0f) {
        }
    }

    @Override // sa8
    public final boolean T() {
        return true;
    }

    @Override // sa8
    public final boolean Z(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    public final void a() {
        TLRPC.GroupCallParticipant groupCallParticipant;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        fc2 b = b();
        boolean z = false;
        if (!((this.b.a == null && this.b.b == null) ? false : true) || b == null || b.f.isEmpty()) {
            groupCallParticipant = null;
        } else {
            gc2 gc2Var = (gc2) b.f.get(0);
            groupCallParticipant = gc2Var.a;
            z = gc2Var.b;
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
        if (w01.a) {
            fa4.b("rtmp pip: ".concat(sb2));
        }
    }

    @Override // sa8
    public final boolean a0() {
        return false;
    }

    @Override // sa8
    public final boolean a1() {
        return b() != null;
    }

    @Override // sa8
    public final float a2() {
        return 0.0f;
    }

    @Override // sa8
    public final boolean d1() {
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.v2 || i == kk7.A2) {
            a();
            rn9 rn9Var = this.f;
            if (rn9Var != null) {
                rn9Var.a();
            }
        }
    }

    public final void g() {
        gl.r(this.n);
        qn9 qn9Var = this.h;
        if (qn9Var != null) {
            qn9Var.a.K();
            VideoFrame videoFrame = qn9Var.b;
            if (videoFrame != null) {
                videoFrame.release();
                qn9Var.b = null;
            }
            this.h = null;
        }
        this.b.a = null;
        this.b.b = null;
        ta8 ta8Var = this.e;
        if (ta8Var != null) {
            ta8Var.a();
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

    @Override // sa8
    public final long getDuration() {
        return 0L;
    }

    @Override // sa8
    public final boolean j() {
        return true;
    }

    @Override // sa8
    public final oc8 k1() {
        return null;
    }

    @Override // sa8
    public final long m() {
        return 0L;
    }

    @Override // sa8
    public final void m0(Rect rect) {
        rect.setEmpty();
    }

    @Override // sa8
    public final void n(View view) {
        h(false);
        rn9 rn9Var = this.f;
        if (view == rn9Var) {
            rn9Var.b = false;
            gl.r(rn9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
    }

    @Override // sa8
    public final View o0(LaunchActivity launchActivity) {
        return new rn9(this, launchActivity);
    }

    @Override // sa8
    public final void p0(View view) {
        if (view == this.f) {
            h(false);
        }
        rn9 rn9Var = this.f;
        if (view == rn9Var) {
            rn9Var.b = false;
            gl.r(rn9Var.e);
            this.f = null;
            this.b.b = null;
            a();
        }
        rn9 rn9Var2 = (rn9) view;
        rn9Var2.b = false;
        gl.r(rn9Var2.e);
        rn9Var2.a.d.release();
    }

    @Override // sa8
    public final boolean p1() {
        return false;
    }

    @Override // sa8
    public final int u() {
        return 10;
    }

    @Override // sa8
    public final void u1() {
        this.a = null;
        if (this.f != null) {
            h(false);
        }
        g();
        gl.d3(new am6((byte) 19));
        gl.d3(new am6((byte) 18));
    }

    @Override // sa8
    public final void x0(View view) {
        h(true);
    }

    @Override // sa8
    public final void L0() {
    }

    @Override // sa8
    public final void e() {
    }

    @Override // sa8
    public final void k() {
    }

    @Override // sa8
    public final void G2(int i) {
    }

    @Override // sa8
    public final void S0(float f) {
    }

    @Override // sa8
    public final void f(long j) {
    }

    @Override // sa8
    public final void o2(int i, ArrayList arrayList) {
    }

    @Override // sa8
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
