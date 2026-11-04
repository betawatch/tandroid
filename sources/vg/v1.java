package vg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v1 extends xp {
    public final /* synthetic */ w1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.E = w1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        w1 w1Var = this.E;
        if (w1Var.d) {
            super.setBounds(i3, (int) (i10 - w1Var.N), i11, i12);
        } else {
            super.setBounds(i3, i10, i11, (int) (i12 + w1Var.N));
        }
    }
}
