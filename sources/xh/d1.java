package xh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.m5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class d1 extends m5 {
    public final /* synthetic */ e1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = e1Var;
    }

    @Override // org.telegram.ui.Components.m5, org.telegram.ui.Components.u5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.M;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
