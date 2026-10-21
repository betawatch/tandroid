package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ks0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class g2 extends c71 {
    public final /* synthetic */ ks0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, int i10, hg.o oVar, f2 f2Var, f2 f2Var2, d6 d6Var, ks0 ks0Var) {
        super(context, i10, 0, false, oVar, f2Var, f2Var2, d6Var, 3, 1);
        this.d3 = ks0Var;
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.d3.o();
    }
}
