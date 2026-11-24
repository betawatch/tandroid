// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wt5 extends n39 {
    public final Context c;
    public final /* synthetic */ xt5 d;

    public wt5(xt5 xt5Var, Context context) {
        this.d = xt5Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return this.d.s1.size();
    }

    @Override // w39
    public final int d(int i) {
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLObject K0;
        String str;
        xt5 xt5Var = this.d;
        long B1 = k27.B1((TLRPC.Peer) xt5Var.s1.get(i));
        int i2 = xt5Var.a;
        if (B1 > 0) {
            K0 = na7.q1(i2).V1(Long.valueOf(B1));
            str = k96.M0(2131743107, null);
        } else {
            K0 = na7.q1(i2).K0(Long.valueOf(-B1));
            str = null;
        }
        int i3 = xt5Var.v1;
        View view = s49Var.a;
        if (i3 == 0) {
            ((waa) view).c(B1, B1 == k27.B1(xt5Var.w1), null);
        } else {
            ((za5) view).e(K0, null, str, i != b() - 1);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View za5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            za5Var = new waa(2, null, this.c);
            za5Var.setLayoutParams(new e49(gl.L(80.0f), gl.L(100.0f)));
        } else {
            za5Var = new za5(2, 0, null, this.c, false, i2 == 2);
        }
        return new y29(za5Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        s49Var.b();
        long B1 = k27.B1(this.d.w1);
        View view = s49Var.a;
        if (!(view instanceof za5)) {
            waa waaVar = (waa) view;
            waaVar.b(B1 == waaVar.getCurrentDialog(), false);
        } else {
            za5 za5Var = (za5) view;
            Object object = za5Var.getObject();
            za5Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
