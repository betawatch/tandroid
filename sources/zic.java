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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zic implements vc8 {
    public static zic h;
    public ad8 a;
    public qa1 b;
    public long c;
    public boolean d;
    public final zka e = new zka(this, (byte) 14);
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (iic.m1 == null && yic.d() == null) ? false : true;
        if (sharedInstance == null || !z) {
            zic zicVar = h;
            if (zicVar != null) {
                h = null;
                ad8 ad8Var = zicVar.a;
                if (ad8Var != null) {
                    zicVar.a = null;
                    ad8Var.g();
                    return;
                }
                return;
            }
            return;
        }
        zic zicVar2 = h;
        if (zicVar2 == null) {
            zicVar2 = new zic();
            h = zicVar2;
        }
        ad8 ad8Var2 = zicVar2.a;
        if (ad8Var2 == null || !ad8Var2.e()) {
            zicVar2.a = yc3.c().k(zicVar2);
        }
        ad8 ad8Var3 = zicVar2.a;
        if (ad8Var3.c == 2) {
            ad8Var3.d();
            return;
        }
        yic d = iic.m1 == null ? yic.d() : null;
        ad8 ad8Var4 = zicVar2.a;
        ?? r5 = d != null ? 1 : 0;
        boolean z2 = d != null && d.e;
        byte b = ad8Var4.c;
        if (b != 3) {
            ad8Var4.f = r5;
            ad8Var4.g = z2;
            if (b == 2) {
                ad8Var4.d = r5;
            } else {
                ad8Var4.c = r5;
            }
            ad8Var4.b.d();
        }
        zicVar2.a.d();
    }

    @Override // vc8
    public final boolean A0() {
        return true;
    }

    @Override // vc8
    public final void B0(int i) {
        ka1.b(i, false);
        gm.d3(new e1b((byte) 8), 300L);
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
        return new qa1(launchActivity);
    }

    @Override // vc8
    public final void K(View view) {
        gm.r(this.e);
        if (this.b == view) {
            this.b = null;
        }
        qa1 qa1Var = (qa1) view;
        qa1Var.f.b();
        qa1Var.a.d.release();
    }

    @Override // vc8
    public final void M(View view) {
        qa1 qa1Var;
        iic iicVar = iic.m1;
        if (iicVar == null || (qa1Var = this.b) != view || this.f) {
            return;
        }
        this.f = true;
        qa1Var.getClass();
        qa1Var.r = SystemClock.elapsedRealtime();
        qa1Var.b();
        iicVar.k1 = this.b.a;
        iicVar.l1 = true;
        iicVar.y();
        try {
            ((WindowManager) iicVar.b.getSystemService("window")).removeView(iicVar.u0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vc8
    public final View O() {
        return null;
    }

    @Override // vc8
    public final boolean P() {
        iic iicVar = iic.m1;
        return iicVar != null && iicVar.d0.isAttachedToWindow();
    }

    @Override // vc8
    public final int S() {
        int i;
        if (!qa1.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zjc a = a();
        if (a == null || (i = a.rotatedFrameWidth) <= 0) {
            return 9;
        }
        return i;
    }

    @Override // vc8
    public final boolean V() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || sharedInstance.isHangingUp() || sharedInstance.getCallState() == 11 || sharedInstance.getCallState() == 10) ? false : true;
    }

    @Override // vc8
    public final boolean W() {
        return false;
    }

    @Override // vc8
    public final re8 Y() {
        return null;
    }

    public final zjc a() {
        akc akcVar;
        qa1 qa1Var = this.b;
        if (qa1Var != null) {
            zjc zjcVar = qa1Var.a.d;
            if (zjcVar.rotatedFrameWidth > 0) {
                return zjcVar;
            }
        }
        iic iicVar = iic.m1;
        if (iicVar != null && (akcVar = iicVar.d0) != null) {
            return akcVar.d;
        }
        yic d = yic.d();
        if (d != null) {
            return d.s.d;
        }
        return null;
    }

    @Override // vc8
    public final boolean a0() {
        return false;
    }

    @Override // vc8
    public final void e0() {
        this.a = null;
        if (h == this) {
            h = null;
        }
        iic iicVar = iic.m1;
        if (iicVar != null) {
            iicVar.G0 = true;
            iicVar.d0.d.release();
            iicVar.e0.d.release();
            iicVar.c0.release();
            iicVar.b();
            iicVar.u0.d();
            iic.m1 = null;
            b();
        }
        yic.b();
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
        gm.r(this.e);
        this.b = null;
        iic iicVar = iic.m1;
        if (iicVar != null) {
            try {
                if (iicVar.u0.getParent() == null) {
                    WindowManager windowManager = (WindowManager) iicVar.b.getSystemService("window");
                    bic bicVar = iicVar.u0;
                    bicVar.getClass();
                    windowManager.addView(bicVar, ekc.a());
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            iicVar.l1 = false;
            iicVar.k1 = null;
            iicVar.y();
            iicVar.u0.invalidate();
            return;
        }
        if (yic.d() != null) {
            yic d = yic.d();
            qw9 qw9Var = d.a;
            try {
                if (qw9Var.getParent() == null) {
                    d.c.addView(qw9Var, d.d);
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.r.d, d.s.d);
            }
        }
    }

    @Override // vc8
    public final void m0(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ka1.a = (sharedInstance == null || sharedInstance.getVideoState(false) == 0) ? false : true;
        qa1 qa1Var = (qa1) view;
        this.b = qa1Var;
        qa1Var.b();
        this.c = ka1.c();
        this.d = qa1.a(VoIPService.getSharedInstance());
        zka zkaVar = this.e;
        gm.r(zkaVar);
        gm.d3(zkaVar, 500L);
        this.f = false;
        if (iic.m1 != null || yic.d() == null) {
            return;
        }
        yic d = yic.d();
        akc akcVar = this.b.a;
        d.getClass();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 != null) {
            sharedInstance2.setSinks(d.r.d, akcVar.d);
        }
        try {
            d.c.removeView(d.a);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vc8
    public final int o0() {
        int i;
        if (!qa1.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        zjc a = a();
        if (a == null || (i = a.rotatedFrameHeight) <= 0) {
            return 16;
        }
        return i;
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
        ka1.a(i, arrayList, false);
    }

    @Override // vc8
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
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
