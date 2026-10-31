package vh;

import android.content.Context;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o1 extends bw0 {
    public final /* synthetic */ boolean G3;
    public final /* synthetic */ p1 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var);
        this.H3 = p1Var;
        this.G3 = z10;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean D1() {
        return sc.e(8200);
    }

    @Override // org.telegram.ui.Components.bw0
    public final xv0[] E1(xv0[] xv0VarArr) {
        if (xv0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 >= xv0VarArr.length) {
                    i10 = -1;
                    break;
                }
                xv0 xv0Var = xv0VarArr[i10];
                if (xv0Var != null && xv0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = xv0VarArr.length;
                xv0[] xv0VarArr2 = new xv0[length];
                xv0VarArr2[0] = xv0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    xv0VarArr2[i11] = xv0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return xv0VarArr2;
            }
        }
        return xv0VarArr;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void H1(int i10) {
        super.H1(i10);
        this.H3.d(false);
    }
}
