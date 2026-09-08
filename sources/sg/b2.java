package sg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
