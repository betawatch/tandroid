package pf;

import android.app.Activity;
import java.util.ArrayList;
import kh.p6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ n1 a;

    public g1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        int i11;
        b6 b6Var;
        n1 n1Var = this.a;
        ArrayList arrayList = n1Var.b;
        if (i9 == -1) {
            if (arrayList.isEmpty()) {
                n1Var.finishFragment();
                return;
            } else {
                n1.W(n1Var);
                return;
            }
        }
        if (i9 != 1) {
            if (i9 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getParentActivity(), 0, n1Var.getResourceProvider());
                alertDialog$Builder.a.N = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.P = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new kh.p(this, 18));
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
        i10 = ((o2) n1Var).currentAccount;
        q1 c10 = r1.f(i10).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = n1Var.getParentActivity();
        i11 = ((o2) n1Var).currentAccount;
        b6Var = ((o2) n1Var).resourceProvider;
        n1.c0(parentActivity, i11, null, c10, b6Var, new p6(this, intValue, 3));
    }
}
