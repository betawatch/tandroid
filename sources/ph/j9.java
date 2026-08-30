package ph;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j9 extends org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(da daVar, int i10) {
        super(null);
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = daVar;
                super(null);
                this.currentAccount = daVar.c;
                break;
            default:
                this.b = daVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.q50
    public final Activity getParentActivity() {
        switch (this.a) {
        }
        return this.b.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.a) {
            case 0:
                return new nh.m2(8, this.b.a);
            default:
                return new nh.m2(9, this.b.a);
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
