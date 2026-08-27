package qf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Utilities.Callback5, a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.X();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n41 n41Var = (n41) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final e eVar = this.b;
        if (eVar.d.h(n41Var)) {
            return;
        }
        int i10 = n41Var.d;
        if (i10 == 2 || n41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", eVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            eVar.presentFragment(new rn(bundle));
            return;
        }
        if (i10 == 1) {
            eVar.s = !eVar.s;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 6) {
            x xVar = eVar.d;
            eVar.v = true;
            xVar.h = true;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 7) {
            x xVar2 = eVar.d;
            eVar.v = false;
            xVar2.h = false;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 3) {
            eVar.x = 0;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 4) {
            eVar.x = 1;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 5) {
            eVar.x = 2;
            eVar.c.U2.N(true);
            eVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            y4.y(eVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), eVar.B, new x4() { // from class: qf.d
                @Override // org.telegram.ui.Components.x4
                public final void I(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            e eVar2 = eVar;
                            eVar2.getClass();
                            l8 l8Var = (l8) view;
                            eVar2.B = i12;
                            l8Var.u(LocaleController.formatShortDateTime(i12), true);
                            eVar2.V(true);
                            break;
                        default:
                            e eVar3 = eVar;
                            eVar3.getClass();
                            l8 l8Var2 = (l8) view;
                            eVar3.C = i12;
                            l8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            eVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            y4.y(eVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), eVar.C, new x4() { // from class: qf.d
                @Override // org.telegram.ui.Components.x4
                public final void I(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            e eVar2 = eVar;
                            eVar2.getClass();
                            l8 l8Var = (l8) view;
                            eVar2.B = i122;
                            l8Var.u(LocaleController.formatShortDateTime(i122), true);
                            eVar2.V(true);
                            break;
                        default:
                            e eVar3 = eVar;
                            eVar3.getClass();
                            l8 l8Var2 = (l8) view;
                            eVar3.C = i122;
                            l8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            eVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !eVar.w;
            eVar.w = z10;
            ((p8) view).setChecked(z10);
            eVar.V(true);
        }
    }
}
