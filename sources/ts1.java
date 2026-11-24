// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ts1 extends kxe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // kxe
    public final void a(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                yv1Var.K9 = !z;
                if (z) {
                    if (yv1Var.v9 != null) {
                        yv1Var.Bc(0.0f);
                        yv1Var.v9 = null;
                    }
                    yv1Var.w9 = false;
                    yv1Var.C9 = false;
                    rt1 rt1Var = yv1Var.E9;
                    if (rt1Var != null) {
                        gm.r(rt1Var.I);
                        rt1Var.a();
                    }
                }
                yv1Var.dd();
                break;
            case 1:
                f57 f57Var = (f57) obj;
                z47 z47Var = f57Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f57Var.s;
                l57 l57Var = f57Var.d0;
                if (l57Var.s) {
                    if (!z) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                            break;
                        }
                    } else if (z47Var.v - z47Var.u <= oc7.r1(l57Var.x).l4.N1.f()) {
                        nkb nkbVar = z47Var.W;
                        k47 a = f57Var.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                        o47 o47Var = l57Var.d;
                        if (o47Var.d == null) {
                            int i = z47Var.u;
                            o47Var.e = i;
                            int i2 = z47Var.v;
                            o47Var.f = i2;
                            o47Var.d = nv1.b(i, i2, a);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(f57Var.J);
                            break;
                        }
                    } else {
                        f57Var.f();
                        break;
                    }
                }
                break;
            default:
                a58 a58Var = (a58) obj;
                w48 w48Var = a58Var.G1;
                boolean w = a58Var.A0.W.w();
                oab oabVar = ((fab) w48Var).d;
                oabVar.j1 = w;
                oabVar.U();
                break;
        }
    }

    @Override // kxe
    public final void b() {
        a aVar;
        a aVar2;
        switch (this.a) {
            case 0:
                yv1 yv1Var = (yv1) this.b;
                aVar = ((d) yv1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) yv1Var).actionBar;
                    if (aVar2.y()) {
                        yv1Var.M5(false);
                    }
                }
                yv1Var.i6();
                yv1Var.N3.j(58, 0L, null);
                break;
        }
    }
}
