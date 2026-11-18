package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v0 extends ah.o {
    public final /* synthetic */ w0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Context context, i6 i6Var) {
        super(context, i6Var);
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
