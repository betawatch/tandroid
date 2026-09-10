package zh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f2 extends y6 {
    public final /* synthetic */ u7 H;
    public final /* synthetic */ a3 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(a3 a3Var, Context context, h2 h2Var, org.telegram.ui.ActionBar.f6 f6Var, u7 u7Var) {
        super(context, h2Var, f6Var);
        this.I = a3Var;
        this.H = u7Var;
    }

    @Override // zh.y6
    public final void b(boolean z10) {
        w2 w2Var = this.I.Q1;
        if (w2Var != null) {
            u7 u7Var = ((l7) w2Var).d;
            u7Var.i1 = z10;
            u7Var.P();
        }
    }

    @Override // zh.y6
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
