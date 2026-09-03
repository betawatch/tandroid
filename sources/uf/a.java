package uf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
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
        i51 i51Var = (i51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.d.h(i51Var)) {
            return;
        }
        int i10 = i51Var.d;
        if (i10 == 2 || i51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new zn(bundle));
            return;
        }
        if (i10 == 1) {
            cVar.s = !cVar.s;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 6) {
            v vVar = cVar.d;
            cVar.v = true;
            vVar.h = true;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 7) {
            v vVar2 = cVar.d;
            cVar.v = false;
            vVar2.h = false;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 3) {
            cVar.x = 0;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 4) {
            cVar.x = 1;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 5) {
            cVar.x = 2;
            cVar.c.V2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            z4.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.C, new y4() { // from class: uf.b
                @Override // org.telegram.ui.Components.y4
                public final void J(int i12, int i13, boolean z4) {
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            n8 n8Var = (n8) view;
                            cVar2.C = i12;
                            n8Var.u(LocaleController.formatShortDateTime(i12), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            n8 n8Var2 = (n8) view;
                            cVar3.D = i12;
                            n8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            z4.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.D, new y4() { // from class: uf.b
                @Override // org.telegram.ui.Components.y4
                public final void J(int i122, int i13, boolean z4) {
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            n8 n8Var = (n8) view;
                            cVar2.C = i122;
                            n8Var.u(LocaleController.formatShortDateTime(i122), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            n8 n8Var2 = (n8) view;
                            cVar3.D = i122;
                            n8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z4 = !cVar.w;
            cVar.w = z4;
            ((r8) view).setChecked(z4);
            cVar.V(true);
        }
    }
}
