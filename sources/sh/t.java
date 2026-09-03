package sh;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                i0Var.v.d.U2.h1(1, i0Var.R.b);
                i0Var.b.a(false, true);
                i0Var.setAllowNestedScroll(true);
                d20 d20Var = i0Var.y;
                AndroidUtilities.hideKeyboard(d20Var.r);
                d20Var.r.clearFocus();
                break;
            case 1:
                i0 i0Var2 = this.b;
                i0Var2.x.d.U2.h1(1, i0Var2.R.b);
                i0Var2.c.a(false, true);
                i0Var2.setAllowNestedScroll(true);
                d20 d20Var2 = i0Var2.B;
                AndroidUtilities.hideKeyboard(d20Var2.r);
                d20Var2.r.clearFocus();
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
