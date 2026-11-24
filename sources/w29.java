// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w29 extends q59 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ a39 d;

    public w29(a39 a39Var, Context context) {
        this.d = a39Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 2;
    }

    @Override // y59
    public final int b() {
        a39 a39Var = this.d;
        return a39Var.f + (a39Var.e < 0 ? a39Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        a39 a39Var = this.d;
        if (i == a39Var.c) {
            return 2;
        }
        if (i == a39Var.e) {
            return 3;
        }
        return i == b() - 1 ? 4 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        vb0 vb0Var = (vb0) u69Var.a;
        a39 a39Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) a39Var.getMediaDataController().h.get(i - a39Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((d) a39Var).currentAccount;
        boolean contains = str.contains(hs6.d0(i2).S());
        i3 = ((d) a39Var).currentAccount;
        vb0Var.a(tL_availableReaction, contains, i3);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        tk5 tk5Var;
        View view;
        a39 a39Var = this.d;
        Context context = this.c;
        if (i == 0) {
            tk5Var = ((d) a39Var).parentLayout;
            uob uobVar = new uob(context, tk5Var, 2);
            uobVar.setImportantForAccessibility(4);
            uobVar.x = a39Var;
            view = uobVar;
        } else if (i == 2) {
            njb njbVar = new njb(context);
            njbVar.setText(jb6.M0(2131751289, null));
            view = njbVar;
        } else if (i == 3) {
            z29 z29Var = new z29(a39Var, context);
            z29Var.a(false);
            view = z29Var;
        } else if (i != 4) {
            view = new vb0(context, true, true);
        } else {
            View o72Var = new o72(context, (byte) 22);
            o72Var.setTag(-33024);
            view = o72Var;
        }
        return new b59(view);
    }
}
