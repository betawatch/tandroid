// default package

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ox4 extends ul {
    public final /* synthetic */ px4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox4(px4 px4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = px4Var;
    }

    @Override // ul, em
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
