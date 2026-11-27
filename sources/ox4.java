// default package

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
