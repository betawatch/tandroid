// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qt4 extends View {
    public int a;
    public final /* synthetic */ tt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt4(tt4 tt4Var, Context context) {
        super(context);
        this.b = tt4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        tt4 tt4Var = this.b;
        as0 as0Var = tt4Var.e;
        ArrayList arrayList = tt4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.a;
        if (i4 != -1) {
            setMeasuredDimension(size, i4);
            return;
        }
        if (tt4Var.f0 == tt4.k0) {
            i3 = arrayList.size();
        } else {
            ArrayList arrayList2 = tt4Var.g0;
            if (arrayList2 != null) {
                i3 = (tt4Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (tt4Var.d0 ? 1 : 0);
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (gm.q.y - gm.L(62.0f)) - (((int) (((int) (size / as0Var.J)) * tt4Var.P)) * ((int) Math.ceil(i3 / as0Var.J)))));
    }
}
