package sf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
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
        w41 w41Var = (w41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.b;
        if (n0Var.d.h(w41Var)) {
            return;
        }
        int i10 = w41Var.d;
        if (i10 == 2 || w41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n0Var.presentFragment(new tn(bundle));
            return;
        }
        if (i10 == 1) {
            n0Var.s = !n0Var.s;
            n0Var.c.U2.N(true);
            n0Var.V(true);
        } else {
            if (i10 == 3) {
                w wVar = n0Var.d;
                n0Var.v = true;
                wVar.h = true;
                n0Var.c.U2.N(true);
                n0Var.V(true);
                return;
            }
            if (i10 == 4) {
                w wVar2 = n0Var.d;
                n0Var.v = false;
                wVar2.h = false;
                n0Var.c.U2.N(true);
                n0Var.V(true);
            }
        }
    }
}
