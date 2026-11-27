// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class tt4 extends View {
    public int a;
    public final /* synthetic */ wt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt4(wt4 wt4Var, Context context) {
        super(context);
        this.b = wt4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        wt4 wt4Var = this.b;
        ar0 ar0Var = wt4Var.e;
        ArrayList arrayList = wt4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.a;
        if (i4 != -1) {
            setMeasuredDimension(size, i4);
            return;
        }
        if (wt4Var.f0 == wt4.k0) {
            i3 = arrayList.size();
        } else {
            ArrayList arrayList2 = wt4Var.g0;
            if (arrayList2 != null) {
                i3 = (wt4Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (wt4Var.d0 ? 1 : 0);
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (hl.q.y - hl.L(62.0f)) - (((int) (((int) (size / ar0Var.J)) * wt4Var.P)) * ((int) Math.ceil(i3 / ar0Var.J)))));
    }
}
