package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x2 extends View {
    public int a;
    public final /* synthetic */ z2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(z2 z2Var, Context context) {
        super(context);
        this.b = z2Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        z2 z2Var = this.b;
        l2 l2Var = z2Var.e;
        ArrayList arrayList = z2Var.V;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (z2Var.b0 == z2.g0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = z2Var.c0;
            if (arrayList2 != null) {
                i12 = (z2Var.a0 ? arrayList.size() : 0) + arrayList2.size() + (z2Var.W ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / l2Var.J)) * z2Var.L)) * ((int) Math.ceil(i12 / l2Var.J)))));
    }
}
