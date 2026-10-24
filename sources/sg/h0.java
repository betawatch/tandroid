package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, g6 g6Var) {
        super(context, i10, i11, i12, f7, g6Var);
        this.p0 = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.f0) {
            return;
        }
        super.invalidate();
    }
}
