package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ tc0(fg0 fg0Var, int i10) {
        this.a = i10;
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
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new yc0(fg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
