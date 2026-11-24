// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vv5 extends q59 {
    public final Context c;
    public final /* synthetic */ wv5 d;

    public vv5(wv5 wv5Var, Context context) {
        this.d = wv5Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.d.s1.size();
    }

    @Override // y59
    public final int d(int i) {
        return 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLObject L0;
        String str;
        wv5 wv5Var = this.d;
        long B1 = k47.B1((TLRPC.Peer) wv5Var.s1.get(i));
        int i2 = wv5Var.a;
        if (B1 > 0) {
            L0 = oc7.r1(i2).W1(Long.valueOf(B1));
            str = jb6.M0(2131743033, null);
        } else {
            L0 = oc7.r1(i2).L0(Long.valueOf(-B1));
            str = null;
        }
        int i3 = wv5Var.v1;
        View view = u69Var.a;
        if (i3 == 0) {
            ((wca) view).c(B1, B1 == k47.B1(wv5Var.w1), null);
        } else {
            ((xc5) view).e(L0, null, str, i != b() - 1);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View xc5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            xc5Var = new wca(2, null, this.c);
            xc5Var.setLayoutParams(new g69(gm.L(80.0f), gm.L(100.0f)));
        } else {
            xc5Var = new xc5(2, 0, null, this.c, false, i2 == 2);
        }
        return new b59(xc5Var);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        u69Var.b();
        long B1 = k47.B1(this.d.w1);
        View view = u69Var.a;
        if (!(view instanceof xc5)) {
            wca wcaVar = (wca) view;
            wcaVar.b(B1 == wcaVar.getCurrentDialog(), false);
        } else {
            xc5 xc5Var = (xc5) view;
            Object object = xc5Var.getObject();
            xc5Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
