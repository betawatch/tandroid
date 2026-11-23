package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v0 extends ah.o {
    public final /* synthetic */ w0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Context context, h6 h6Var) {
        super(context, h6Var);
        this.L = w0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        w0 w0Var = this.L;
        w0Var.l2 = L;
        w0Var.k2.G();
    }
}
