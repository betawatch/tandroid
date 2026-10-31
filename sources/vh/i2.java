package vh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.oi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i2 extends View {
    public int a;
    public final /* synthetic */ k2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, Context context) {
        super(context);
        this.b = k2Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        k2 k2Var = this.b;
        oi oiVar = k2Var.e;
        ArrayList arrayList = k2Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (k2Var.e0 == k2.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = k2Var.f0;
            if (arrayList2 != null) {
                i12 = (k2Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (k2Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(62.0f)) - (((int) (((int) (size / oiVar.J)) * k2Var.O)) * ((int) Math.ceil(i12 / oiVar.J)))));
    }
}
