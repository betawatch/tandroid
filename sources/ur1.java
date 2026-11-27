// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ur1 extends b0f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // b0f
    public final void a(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                zu1Var.K9 = !z;
                if (z) {
                    if (zu1Var.v9 != null) {
                        zu1Var.Bc(0.0f);
                        zu1Var.v9 = null;
                    }
                    zu1Var.w9 = false;
                    zu1Var.C9 = false;
                    ss1 ss1Var = zu1Var.E9;
                    if (ss1Var != null) {
                        hl.r(ss1Var.I);
                        ss1Var.a();
                    }
                }
                zu1Var.dd();
                break;
            case 1:
                m57 m57Var = (m57) obj;
                g57 g57Var = m57Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m57Var.s;
                s57 s57Var = m57Var.d0;
                if (s57Var.s) {
                    if (!z) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                            break;
                        }
                    } else if (g57Var.v - g57Var.u <= uc7.s1(s57Var.x).k4.V1.f()) {
                        hmb hmbVar = g57Var.W;
                        r47 a = m57Var.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                        v47 v47Var = s57Var.d;
                        if (v47Var.d == null) {
                            int i = g57Var.u;
                            v47Var.e = i;
                            int i2 = g57Var.v;
                            v47Var.f = i2;
                            v47Var.d = ou1.b(i, i2, a);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(m57Var.J);
                            break;
                        }
                    } else {
                        m57Var.f();
                        break;
                    }
                }
                break;
            default:
                o68 o68Var = (o68) obj;
                k68 k68Var = o68Var.A1;
                boolean w = o68Var.u0.W.w();
                lcb lcbVar = ((ccb) k68Var).d;
                lcbVar.j1 = w;
                lcbVar.U();
                break;
        }
    }

    @Override // b0f
    public final void b() {
        a aVar;
        a aVar2;
        switch (this.a) {
            case 0:
                zu1 zu1Var = (zu1) this.b;
                aVar = ((e) zu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) zu1Var).actionBar;
                    if (aVar2.z()) {
                        zu1Var.L5(false);
                    }
                }
                zu1Var.i6();
                zu1Var.N3.j(58, 0L, null);
                break;
        }
    }
}
