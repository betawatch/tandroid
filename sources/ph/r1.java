package ph;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class r1 extends xw0 {
    public final /* synthetic */ boolean w3;
    public final /* synthetic */ s1 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, i10, f6Var);
        this.x3 = s1Var;
        this.w3 = z4;
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.xw0
    public final tw0[] B1(tw0[] tw0VarArr) {
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
    public final void E1(int i10) {
        super.E1(i10);
        this.x3.d(false);
    }
}
