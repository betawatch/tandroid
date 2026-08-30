package uf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ l0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
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
        m0 m0Var = this.b;
        if (m0Var.d.h(i51Var)) {
            return;
        }
        int i10 = i51Var.d;
        if (i10 == 2 || i51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", m0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            m0Var.presentFragment(new xn(bundle));
            return;
        }
        if (i10 == 1) {
            m0Var.s = !m0Var.s;
            m0Var.c.V2.N(true);
            m0Var.V(true);
        } else {
            if (i10 == 3) {
                v vVar = m0Var.d;
                m0Var.v = true;
                vVar.h = true;
                m0Var.c.V2.N(true);
                m0Var.V(true);
                return;
            }
            if (i10 == 4) {
                v vVar2 = m0Var.d;
                m0Var.v = false;
                vVar2.h = false;
                m0Var.c.V2.N(true);
                m0Var.V(true);
            }
        }
    }
}
