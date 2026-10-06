package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a0 extends q0 {
    public final /* synthetic */ k0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k0 k0Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.P = k0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P.f0) {
            return;
        }
        super.invalidate();
    }
}
