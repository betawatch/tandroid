// default package

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
