// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ygc implements sa8 {
    public static ygc h;
    public xa8 a;
    public h91 b;
    public long c;
    public boolean d;
    public final xia e = new xia(this, (byte) 14);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (hgc.m1 == null && xgc.d() == null) ? false : true;
        if (sharedInstance == null || !z) {
            ygc ygcVar = h;
            if (ygcVar != null) {
                h = null;
                xa8 xa8Var = ygcVar.a;
                if (xa8Var != null) {
                    ygcVar.a = null;
                    xa8Var.g();
                    return;
                }
                return;
            }
            return;
        }
        ygc ygcVar2 = h;
        if (ygcVar2 == null) {
            ygcVar2 = new ygc();
            h = ygcVar2;
        }
        xa8 xa8Var2 = ygcVar2.a;
        if (xa8Var2 == null || !xa8Var2.e()) {
            ygcVar2.a = mb3.c().k(ygcVar2);
        }
        xa8 xa8Var3 = ygcVar2.a;
        if (xa8Var3.c == 2) {
            xa8Var3.d();
            return;
        }
        xgc d = hgc.m1 == null ? xgc.d() : null;
        xa8 xa8Var4 = ygcVar2.a;
        ?? r5 = d != null ? 1 : 0;
        boolean z2 = d != null && d.e;
        byte b = xa8Var4.c;
        if (b != 3) {
            xa8Var4.f = r5;
            xa8Var4.g = z2;
            if (b == 2) {
                xa8Var4.d = r5;
            } else {
                xa8Var4.c = r5;
            }
            xa8Var4.b.d();
        }
        ygcVar2.a.d();
    }

    @Override // sa8
    public final View C0() {
        return null;
    }

    @Override // sa8
    public final boolean F2() {
        return true;
    }

    @Override // sa8
    public final boolean G0() {
        hgc hgcVar = hgc.m1;
        return hgcVar != null && hgcVar.d0.isAttachedToWindow();
    }

    @Override // sa8
    public final void G2(int i) {
        b91.b(i, false);
        gl.d3(new cza((byte) 8), 300L);
    }

    @Override // sa8
    public final void L1(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        b91.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        h91 h91Var = (h91) view;
        this.b = h91Var;
        h91Var.b();
        this.c = b91.c();
        this.d = h91.a(VoIPService.getSharedInstance());
        xia xiaVar = this.e;
        gl.r(xiaVar);
        gl.d3(xiaVar, 500L);
        this.f = false;
        if (hgc.m1 != null || xgc.d() == null) {
            return;
        }
        xgc d = xgc.d();
        aic aicVar = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, aicVar.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // sa8
    public final int Q0() {
        int i;
        if (!h91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zhc a = a();
        if (a == null || (i = a.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i;
    }

    @Override // sa8
    public final int S1() {
        int i;
        if (!h91.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zhc a = a();
        if (a == null || (i = a.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i;
    }

    @Override // sa8
    public final boolean U() {
        return true;
    }

    public final zhc a() {
        aic aicVar;
        h91 h91Var = this.b;
        if (h91Var != null) {
            zhc zhcVar = h91Var.a.d;
            if (zhcVar.rotatedFrameWidth > 0) {
                return zhcVar;
            }
        }
        hgc hgcVar = hgc.m1;
        if (hgcVar != null && (aicVar = hgcVar.d0) != null) {
            return aicVar.d;
        }
        xgc d = xgc.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // sa8
    public final boolean a0(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override // sa8
    public final boolean a1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // sa8
    public final float a2() {
        return 0.0f;
    }

    @Override // sa8
    public final boolean b0() {
        return false;
    }

    @Override // sa8
    public final boolean d1() {
        return false;
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
    public final void n(View view) {
        b91.a = false;
        gl.r(this.e);
        this.b = null;
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            try {
                if (hgcVar.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) hgcVar.b.getSystemService("window");
                    agc agcVar = hgcVar.u0;
                    agcVar.getClass();
                    windowManager.addView(agcVar, eic.a());
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            hgcVar.l1 = false;
            hgcVar.k1 = null;
            hgcVar.y();
            hgcVar.u0.invalidate();
            return;
        }
        if (xgc.d() != null) {
            xgc d = xgc.d();
            gw9 gw9Var = d.a;
            try {
                if (gw9Var.getParent() == null) {
                    d.c.addView(gw9Var, d.d);
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override // sa8
    public final void n0(Rect rect) {
        rect.setEmpty();
    }

    @Override // sa8
    public final void o2(int i, ArrayList arrayList) {
        b91.a(i, arrayList, false);
    }

    @Override // sa8
    public final View p0(LaunchActivity launchActivity) {
        return new h91(launchActivity);
    }

    @Override // sa8
    public final boolean p1() {
        return false;
    }

    @Override // sa8
    public final void q0(View view) {
        gl.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        h91 h91Var = (h91) view;
        h91Var.f.b();
        h91Var.a.d.release();
    }

    @Override // sa8
    public final int u() {
        return 10;
    }

    @Override // sa8
    public final void u1() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            hgcVar.G0 = true;
            hgcVar.d0.d.release();
            hgcVar.e0.d.release();
            hgcVar.c0.release();
            hgcVar.b();
            hgcVar.u0.d();
            hgc.m1 = null;
            b();
        }
        xgc.b();
    }

    @Override // sa8
    public final void y(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override // sa8
    public final void y0(View view) {
        h91 h91Var;
        hgc hgcVar = hgc.m1;
        if (hgcVar == null || (h91Var = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        h91Var.getClass();
        h91Var.r = SystemClock.elapsedRealtime();
        h91Var.b();
        hgcVar.k1 = this.b.a;
        hgcVar.l1 = true;
        hgcVar.y();
        try {
            ((WindowManager) hgcVar.b.getSystemService("window")).removeView(hgcVar.u0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // sa8
    public final void L0() {
    }

    @Override // sa8
    public final void P1() {
    }

    @Override // sa8
    public final void e() {
    }

    @Override // sa8
    public final void k() {
    }

    @Override // sa8
    public final void H0(ya8 ya8Var) {
    }

    @Override // sa8
    public final void S0(float f) {
    }

    @Override // sa8
    public final void f(long j) {
    }

    @Override // sa8
    public final void r2(Canvas canvas, int i, int i2) {
    }
}
