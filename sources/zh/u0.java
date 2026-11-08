package zh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u0 extends g5 {
    public final /* synthetic */ v0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.M = v0Var;
    }

    @Override // org.telegram.ui.Components.g5, org.telegram.ui.Components.o5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.M;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
