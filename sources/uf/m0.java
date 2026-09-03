package uf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
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
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.b;
        if (n0Var.d.h(i51Var)) {
            return;
        }
        int i10 = i51Var.d;
        if (i10 == 2 || i51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n0Var.presentFragment(new zn(bundle));
            return;
        }
        if (i10 == 1) {
            n0Var.s = !n0Var.s;
            n0Var.c.V2.N(true);
            n0Var.V(true);
        } else {
            if (i10 == 3) {
                v vVar = n0Var.d;
                n0Var.v = true;
                vVar.h = true;
                n0Var.c.V2.N(true);
                n0Var.V(true);
                return;
            }
            if (i10 == 4) {
                v vVar2 = n0Var.d;
                n0Var.v = false;
                vVar2.h = false;
                n0Var.c.V2.N(true);
                n0Var.V(true);
            }
        }
    }
}
