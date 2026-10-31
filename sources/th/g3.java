package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends tk0 implements l5 {
    public final /* synthetic */ y3 e3;
    public final /* synthetic */ y3 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(y3 y3Var, Context context, b bVar) {
        super(context, bVar);
        this.f3 = y3Var;
        this.e3 = y3Var;
    }

    @Override // th.l5
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.i0.L(this.e3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f3.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
