// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class q1a extends r59 implements o4b {
    public final /* synthetic */ i2a f3;
    public final /* synthetic */ i2a g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1a(i2a i2aVar, Context context, r63 r63Var) {
        super(context, r63Var);
        this.g3 = i2aVar;
        this.f3 = i2aVar;
    }

    @Override // o4b
    public final void b(int[] iArr) {
        iArr[0] = gm.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
