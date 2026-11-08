package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s1 extends xp {
    public final /* synthetic */ t1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.D = t1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        t1 t1Var = this.D;
        if (t1Var.d) {
            super.setBounds(i7, (int) (i10 - t1Var.M), i11, i12);
        } else {
            super.setBounds(i7, i10, i11, (int) (i12 + t1Var.M));
        }
    }
}
