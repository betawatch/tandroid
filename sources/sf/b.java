package sf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Utilities.Callback5, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
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
        w41 w41Var = (w41) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.b;
        if (dVar.d.h(w41Var)) {
            return;
        }
        int i10 = w41Var.d;
        if (i10 == 2 || w41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new tn(bundle));
            return;
        }
        if (i10 == 1) {
            dVar.s = !dVar.s;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 6) {
            w wVar = dVar.d;
            dVar.v = true;
            wVar.h = true;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 7) {
            w wVar2 = dVar.d;
            dVar.v = false;
            wVar2.h = false;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 3) {
            dVar.x = 0;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 4) {
            dVar.x = 1;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 5) {
            dVar.x = 2;
            dVar.c.U2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.B, new b5() { // from class: sf.c
                @Override // org.telegram.ui.Components.b5
                public final void I(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            m8 m8Var = (m8) view;
                            dVar2.B = i12;
                            m8Var.u(LocaleController.formatShortDateTime(i12), true);
                            dVar2.V(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            m8 m8Var2 = (m8) view;
                            dVar3.C = i12;
                            m8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            dVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.C, new b5() { // from class: sf.c
                @Override // org.telegram.ui.Components.b5
                public final void I(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            m8 m8Var = (m8) view;
                            dVar2.B = i122;
                            m8Var.u(LocaleController.formatShortDateTime(i122), true);
                            dVar2.V(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            m8 m8Var2 = (m8) view;
                            dVar3.C = i122;
                            m8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            dVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !dVar.w;
            dVar.w = z10;
            ((q8) view).setChecked(z10);
            dVar.V(true);
        }
    }
}
