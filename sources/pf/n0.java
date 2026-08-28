package pf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ n0(o0 o0Var, int i9) {
        this.a = i9;
        this.b = o0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
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
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o0 o0Var = this.b;
        if (o0Var.d.h(l41Var)) {
            return;
        }
        int i9 = l41Var.d;
        if (i9 == 2 || l41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", o0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            o0Var.presentFragment(new qn(bundle));
            return;
        }
        if (i9 == 1) {
            o0Var.s = !o0Var.s;
            o0Var.c.U2.N(true);
            o0Var.U(true);
        } else {
            if (i9 == 3) {
                x xVar = o0Var.d;
                o0Var.v = true;
                xVar.h = true;
                o0Var.c.U2.N(true);
                o0Var.U(true);
                return;
            }
            if (i9 == 4) {
                x xVar2 = o0Var.d;
                o0Var.v = false;
                xVar2.h = false;
                o0Var.c.U2.N(true);
                o0Var.U(true);
            }
        }
    }
}
