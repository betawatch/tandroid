package th;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e2 extends s6 {
    public final /* synthetic */ o7 H;
    public final /* synthetic */ z2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(z2 z2Var, Context context, g2 g2Var, org.telegram.ui.ActionBar.p6 p6Var, o7 o7Var) {
        super(context, g2Var, p6Var);
        this.I = z2Var;
        this.H = o7Var;
    }

    @Override // th.s6
    public final void b(boolean z10) {
        v2 v2Var = this.I.z1;
        if (v2Var != null) {
            o7 o7Var = ((f7) v2Var).d;
            o7Var.i1 = z10;
            o7Var.d0();
        }
    }

    @Override // th.s6
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
