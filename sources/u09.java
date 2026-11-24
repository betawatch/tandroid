// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u09 extends n39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ y09 d;

    public u09(y09 y09Var, Context context) {
        this.d = y09Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 3 || i == 2;
    }

    @Override // w39
    public final int b() {
        y09 y09Var = this.d;
        return y09Var.f + (y09Var.e < 0 ? y09Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        y09 y09Var = this.d;
        if (i == y09Var.c) {
            return 2;
        }
        if (i == y09Var.e) {
            return 3;
        }
        return i == b() - 1 ? 4 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        va0 va0Var = (va0) s49Var.a;
        y09 y09Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) y09Var.getMediaDataController().h.get(i - y09Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((d) y09Var).currentAccount;
        boolean contains = str.contains(hq6.d0(i2).S());
        i3 = ((d) y09Var).currentAccount;
        va0Var.a(tL_availableReaction, contains, i3);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        ui5 ui5Var;
        View view;
        y09 y09Var = this.d;
        Context context = this.c;
        if (i == 0) {
            ui5Var = ((d) y09Var).parentLayout;
            tmb tmbVar = new tmb(context, ui5Var, 2);
            tmbVar.setImportantForAccessibility(4);
            tmbVar.x = y09Var;
            view = tmbVar;
        } else if (i == 2) {
            mhb mhbVar = new mhb(context);
            mhbVar.setText(k96.M0(2131751340, null));
            view = mhbVar;
        } else if (i == 3) {
            x09 x09Var = new x09(y09Var, context);
            x09Var.a(false);
            view = x09Var;
        } else if (i != 4) {
            view = new va0(context, true, true);
        } else {
            View d62Var = new d62(context, (byte) 22);
            d62Var.setTag(-33024);
            view = d62Var;
        }
        return new y29(view);
    }
}
