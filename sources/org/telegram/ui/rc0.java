package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ rc0(fg0 fg0Var, int i9) {
        this.a = i9;
        this.b = fg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.n0 = false;
                fg0Var.x1(true, true);
                break;
            case 1:
                this.b.Y = false;
                break;
            default:
                fg0 fg0Var2 = this.b;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing() && fg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(fg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
