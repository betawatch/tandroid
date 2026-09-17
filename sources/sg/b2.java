package sg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class b2 extends oq {
    public final /* synthetic */ c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = c2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        c2 c2Var = this.y;
        if (c2Var.d) {
            super.setBounds(i10, (int) (i11 - c2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + c2Var.M));
        }
    }
}
