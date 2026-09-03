package vf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
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
        h51 h51Var = (h51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.b;
        if (n0Var.d.h(h51Var)) {
            return;
        }
        int i10 = h51Var.d;
        if (i10 == 2 || h51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n0Var.presentFragment(new xn(bundle));
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
