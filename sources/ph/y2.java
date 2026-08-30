package ph;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y2 extends View {
    public int a;
    public final /* synthetic */ a3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(a3 a3Var, Context context) {
        super(context);
        this.b = a3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        a3 a3Var = this.b;
        m2 m2Var = a3Var.e;
        ArrayList arrayList = a3Var.V;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (a3Var.b0 == a3.g0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = a3Var.c0;
            if (arrayList2 != null) {
                i12 = (a3Var.a0 ? arrayList.size() : 0) + arrayList2.size() + (a3Var.W ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / m2Var.J)) * a3Var.L)) * ((int) Math.ceil(i12 / m2Var.J)))));
    }
}
