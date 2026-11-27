// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class t3a extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v3a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3a(v3a v3aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = v3aVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        v3a v3aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(v3aVar.d.e), TLObject.FLAG_30));
                break;
            default:
                z3a z3aVar = v3aVar.d;
                int i3 = z3aVar.y.J;
                if (i3 >= z3aVar.r.getPaddingTop() && !z3aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
                break;
        }
    }
}
