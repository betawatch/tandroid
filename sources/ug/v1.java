package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v1 extends fq {
    public final /* synthetic */ w1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.E = w1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        w1 w1Var = this.E;
        if (w1Var.d) {
            super.setBounds(i7, (int) (i10 - w1Var.N), i11, i12);
        } else {
            super.setBounds(i7, i10, i11, (int) (i12 + w1Var.N));
        }
    }
}
