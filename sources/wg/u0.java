package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u0 extends ah.o {
    public final /* synthetic */ v0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, Context context, i6 i6Var) {
        super(context, i6Var);
        this.L = v0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        v0 v0Var = this.L;
        v0Var.l2 = L;
        v0Var.k2.G();
    }
}
