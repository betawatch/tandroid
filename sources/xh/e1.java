package xh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class e1 extends o5 {
    public final /* synthetic */ f1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = f1Var;
    }

    @Override // org.telegram.ui.Components.o5, org.telegram.ui.Components.w5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.M;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
