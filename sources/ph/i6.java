package ph;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i6 implements View.OnFocusChangeListener {
    public final /* synthetic */ l6 a;

    public i6(l6 l6Var) {
        this.a = l6Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            l6 l6Var = this.a;
            l6Var.f0 = true;
            f2.i0 i0Var = (f2.i0) l6Var.d.getLayoutManager();
            wh.o oVar = new wh.o(l6Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            i0Var.w0(oVar);
        }
    }
}
