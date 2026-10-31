package ph;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.d5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y0 extends d5 {
    public final /* synthetic */ z0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = z0Var;
    }

    @Override // org.telegram.ui.Components.d5, org.telegram.ui.Components.l5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.M;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
