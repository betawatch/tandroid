package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v1 extends oq {
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
