// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ys1 extends kg5 {
    public final /* synthetic */ zu1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(zu1 zu1Var, Activity activity) {
        super(activity, 3);
        this.X0 = zu1Var;
    }

    @Override // kg5, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - hl.L(120.0f)) + this.X0.R1);
    }
}
