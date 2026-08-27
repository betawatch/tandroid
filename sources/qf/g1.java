package qf;

import android.app.Activity;
import java.util.ArrayList;
import lh.o6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ n1 a;

    public g1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        c6 c6Var;
        n1 n1Var = this.a;
        ArrayList arrayList = n1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                n1Var.finishFragment();
                return;
            } else {
                n1.X(n1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getParentActivity(), 0, n1Var.getResourceProvider());
                alertDialog$Builder.a.N = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.P = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new lh.p(this, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((n2) n1Var).currentAccount;
        p1 c10 = q1.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = n1Var.getParentActivity();
        i12 = ((n2) n1Var).currentAccount;
        c6Var = ((n2) n1Var).resourceProvider;
        n1.d0(parentActivity, i12, null, c10, c6Var, new o6(this, intValue, 3));
    }
}
