package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g0 extends LimitPreviewView {
    public final /* synthetic */ h0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Context context, int i7, int i10, int i11, float f10, g6 g6Var) {
        super(context, i7, i10, i11, f10, g6Var);
        this.p0 = h0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.X1) {
            return;
        }
        super.invalidate();
    }
}
