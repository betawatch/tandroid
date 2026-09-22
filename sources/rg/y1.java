package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y1 extends pq {
    public final /* synthetic */ z1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.y = z1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        z1 z1Var = this.y;
        if (z1Var.d) {
            super.setBounds(i10, (int) (i11 - z1Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + z1Var.M));
        }
    }
}
