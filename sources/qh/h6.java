package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h6 implements View.OnFocusChangeListener {
    public final /* synthetic */ k6 a;

    public h6(k6 k6Var) {
        this.a = k6Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            k6 k6Var = this.a;
            k6Var.f0 = true;
            f2.j0 j0Var = (f2.j0) k6Var.d.getLayoutManager();
            xh.o oVar = new xh.o(k6Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            j0Var.w0(oVar);
        }
    }
}
