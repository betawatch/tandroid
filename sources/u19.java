// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u19 extends r59 {
    public final /* synthetic */ c29 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u19(c29 c29Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.f3 = c29Var;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        c29 c29Var = this.f3;
        j37 j37Var = c29Var.K;
        if (j37Var != null) {
            j37Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        c29Var.f();
    }
}
