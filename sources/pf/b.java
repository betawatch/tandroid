package pf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Utilities.Callback5, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i9) {
        this.a = i9;
        this.b = dVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.b;
        if (dVar.d.h(l41Var)) {
            return;
        }
        int i9 = l41Var.d;
        if (i9 == 2 || l41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new qn(bundle));
            return;
        }
        if (i9 == 1) {
            dVar.s = !dVar.s;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 6) {
            x xVar = dVar.d;
            dVar.v = true;
            xVar.h = true;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 7) {
            x xVar2 = dVar.d;
            dVar.v = false;
            xVar2.h = false;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 3) {
            dVar.x = 0;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 4) {
            dVar.x = 1;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 5) {
            dVar.x = 2;
            dVar.c.U2.N(true);
            dVar.U(true);
            return;
        }
        if (i9 == 8) {
            final int i10 = 0;
            y4.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.B, new x4() { // from class: pf.c
                @Override // org.telegram.ui.Components.x4
                public final void B(int i11, int i12, boolean z10) {
                    switch (i10) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            p8 p8Var = (p8) view;
                            dVar2.B = i11;
                            p8Var.u(LocaleController.formatShortDateTime(i11), true);
                            dVar2.U(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            p8 p8Var2 = (p8) view;
                            dVar3.C = i11;
                            p8Var2.u(LocaleController.formatShortDateTime(i11), true);
                            dVar3.U(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i9 == 9) {
            final int i11 = 1;
            y4.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.C, new x4() { // from class: pf.c
                @Override // org.telegram.ui.Components.x4
                public final void B(int i112, int i12, boolean z10) {
                    switch (i11) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            p8 p8Var = (p8) view;
                            dVar2.B = i112;
                            p8Var.u(LocaleController.formatShortDateTime(i112), true);
                            dVar2.U(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            p8 p8Var2 = (p8) view;
                            dVar3.C = i112;
                            p8Var2.u(LocaleController.formatShortDateTime(i112), true);
                            dVar3.U(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i9 == 10) {
            boolean z10 = !dVar.w;
            dVar.w = z10;
            ((t8) view).setChecked(z10);
            dVar.U(true);
        }
    }
}
