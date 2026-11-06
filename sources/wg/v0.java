package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v0 extends ah.o {
    public final /* synthetic */ w0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = w0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        w0 w0Var = this.K;
        w0Var.h2 = L;
        w0Var.g2.G();
    }
}
