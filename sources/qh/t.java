package qh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ t(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.v.d.T2.h1(1, i0Var.Q.b);
                i0Var.b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                x10 x10Var = i0Var.y;
                AndroidUtilities.hideKeyboard(x10Var.r);
                x10Var.r.clearFocus();
                break;
            case 1:
                i0 i0Var2 = this.b;
                i0Var2.x.d.T2.h1(1, i0Var2.Q.b);
                i0Var2.c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                x10 x10Var2 = i0Var2.A;
                AndroidUtilities.hideKeyboard(x10Var2.r);
                x10Var2.r.clearFocus();
                break;
            default:
                i0 i0Var3 = this.b;
                i0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", i0Var3.e);
                i0Var3.s.presentFragment(new n(bundle));
                i0Var3.dismiss();
                break;
        }
    }
}
