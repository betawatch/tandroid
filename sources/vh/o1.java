package vh;

import android.content.Context;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.yv0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o1 extends cw0 {
    public final /* synthetic */ boolean G3;
    public final /* synthetic */ p1 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var);
        this.H3 = p1Var;
        this.G3 = z10;
    }

    @Override // org.telegram.ui.Components.cw0
    public final boolean D1() {
        return tc.e(8200);
    }

    @Override // org.telegram.ui.Components.cw0
    public final yv0[] E1(yv0[] yv0VarArr) {
        if (yv0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 >= yv0VarArr.length) {
                    i10 = -1;
                    break;
                }
                yv0 yv0Var = yv0VarArr[i10];
                if (yv0Var != null && yv0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = yv0VarArr.length;
                yv0[] yv0VarArr2 = new yv0[length];
                yv0VarArr2[0] = yv0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    yv0VarArr2[i11] = yv0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return yv0VarArr2;
            }
        }
        return yv0VarArr;
    }

    @Override // org.telegram.ui.Components.cw0
    public final void H1(int i10) {
        super.H1(i10);
        this.H3.d(false);
    }
}
