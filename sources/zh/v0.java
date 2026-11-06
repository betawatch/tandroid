package zh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v0 extends g5 {
    public final /* synthetic */ w0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.M = w0Var;
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
