package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y extends p0 {
    public final /* synthetic */ i0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i0 i0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.R = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
