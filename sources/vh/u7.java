package vh;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.ActionBar.k2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(o8 o8Var, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = o8Var;
                super(null);
                this.currentAccount = o8Var.c;
                break;
            default:
                this.b = o8Var;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new org.telegram.ui.web.a0(8, this.b.a);
            default:
                return new org.telegram.ui.web.a0(9, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(k2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
