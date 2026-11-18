package ug;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w1 extends mq {
    public final /* synthetic */ x1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.E = x1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        x1 x1Var = this.E;
        if (x1Var.d) {
            super.setBounds(i7, (int) (i10 - x1Var.N), i11, i12);
        } else {
            super.setBounds(i7, i10, i11, (int) (i12 + x1Var.N));
        }
    }
}
