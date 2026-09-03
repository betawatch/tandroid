package ph;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q1 extends xw0 {
    public final /* synthetic */ boolean w3;
    public final /* synthetic */ r1 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, i10, f6Var);
        this.x3 = r1Var;
        this.w3 = z4;
    }

    @Override // org.telegram.ui.Components.xw0
    public final tw0[] A1(tw0[] tw0VarArr) {
        if (tw0VarArr != null && this.w3) {
            int i10 = 0;
            while (true) {
                if (i10 >= tw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                tw0 tw0Var = tw0VarArr[i10];
                if (tw0Var != null && tw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = tw0VarArr.length;
                tw0[] tw0VarArr2 = new tw0[length];
                tw0VarArr2[0] = tw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    tw0VarArr2[i11] = tw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return tw0VarArr2;
            }
        }
        return tw0VarArr;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void D1(int i10) {
        super.D1(i10);
        this.x3.d(false);
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }
}
