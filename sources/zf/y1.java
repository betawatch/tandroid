package zf;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y1 extends fq {
    public final /* synthetic */ z1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = z1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i9, int i10, int i11, int i12) {
        z1 z1Var = this.y;
        if (z1Var.d) {
            super.setBounds(i9, (int) (i10 - z1Var.I), i11, i12);
        } else {
            super.setBounds(i9, i10, i11, (int) (i12 + z1Var.I));
        }
    }
}
