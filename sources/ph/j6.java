package ph;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j6 implements View.OnFocusChangeListener {
    public final /* synthetic */ m6 a;

    public j6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            m6 m6Var = this.a;
            m6Var.f0 = true;
            f2.i0 i0Var = (f2.i0) m6Var.d.getLayoutManager();
            wh.o oVar = new wh.o(m6Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            i0Var.w0(oVar);
        }
    }
}
