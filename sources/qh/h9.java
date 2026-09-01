package qh;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h9 extends org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(ca caVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = caVar;
                super(null);
                this.currentAccount = caVar.c;
                break;
            default:
                this.b = caVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.s50
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new oh.n2(8, this.b.a);
            default:
                return new oh.n2(9, this.b.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.a) {
            case 0:
                this.b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
