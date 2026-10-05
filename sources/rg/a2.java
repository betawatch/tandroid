package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.sq;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class a2 extends sq {
    public final /* synthetic */ b2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = b2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        b2 b2Var = this.y;
        if (b2Var.d) {
            super.setBounds(i10, (int) (i11 - b2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + b2Var.M));
        }
    }
}
