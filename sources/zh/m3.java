package zh;

import bi.v9;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.r0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ n3 c;

    public m3(n3 n3Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.c = n3Var;
        this.a = r0Var;
        this.b = j3;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        n3 n3Var = this.c;
        v9 v9Var = n3Var.Q1;
        if (i7 != 1) {
            if (i7 == -1) {
                n3Var.dismiss();
                return;
            }
            return;
        }
        k60 k60Var = n3Var.V1;
        if (k60Var != null) {
            k60Var.u();
        }
        k60 F = k60.F(n3Var.c, n3Var.I0, this.a);
        n3Var.V1 = F;
        long e10 = p10.i(n3Var.a).e();
        long j3 = this.b;
        boolean w10 = j3 == e10 ? true : j3 >= 0 ? false : org.telegram.messenger.t3.w(5, qp.s1(n3Var.a).M0(Long.valueOf(-j3)));
        org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, F.e, F.d, false, false);
        F.d(z0Var3);
        F.k();
        org.telegram.ui.ActionBar.z0 h = F.h();
        h.setText(id.M0(2131750196, null));
        org.telegram.ui.ActionBar.z0 h7 = F.h();
        h7.setText(id.M0(2131750200, null));
        org.telegram.ui.ActionBar.z0 h10 = F.h();
        h10.setText(id.M0(2131750195, null));
        org.telegram.ui.ActionBar.z0 h11 = F.h();
        h11.setText(id.M0(2131750197, null));
        if (w10) {
            F.k();
            org.telegram.ui.ActionBar.z0 h12 = F.h();
            h12.setText(id.M0(2131750202, null));
            org.telegram.ui.ActionBar.z0 h13 = F.h();
            h13.setText(id.M0(2131750201, null));
            z0Var2 = h13;
            z0Var = h12;
        } else {
            z0Var = null;
            z0Var2 = null;
        }
        gp0 gp0Var = new gp0(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
        gp0Var.run();
        z0Var3.setOnClickListener(new wg.z0(10, this, gp0Var));
        d2.j(h, v9Var, gp0Var, 1);
        d2.j(h7, v9Var, gp0Var, 2);
        d2.j(h10, v9Var, gp0Var, 4);
        d2.j(h11, v9Var, gp0Var, 8);
        if (w10) {
            d2.j(z0Var, v9Var, gp0Var, 256);
            d2.j(z0Var2, v9Var, gp0Var, 512);
        }
        F.Y = true;
        F.J = false;
        F.s = 0;
        F.Z();
    }
}
