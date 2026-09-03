package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f6 implements View.OnFocusChangeListener {
    public final /* synthetic */ i6 a;

    public f6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            i6 i6Var = this.a;
            i6Var.f0 = true;
            f2.j0 j0Var = (f2.j0) i6Var.d.getLayoutManager();
            xh.o oVar = new xh.o(i6Var.getContext(), 2);
            oVar.a = 1;
            oVar.p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            j0Var.w0(oVar);
        }
    }
}
