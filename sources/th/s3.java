package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s3 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(u3 u3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = u3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                y3 y3Var = this.b.d;
                int i12 = y3Var.y.J;
                if (i12 >= y3Var.r.getPaddingTop() && !y3Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
        }
    }
}
