package qh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.yw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r1 extends yw0 {
    public final /* synthetic */ boolean w3;
    public final /* synthetic */ s1 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, i10, g6Var);
        this.x3 = s1Var;
        this.w3 = z4;
    }

    @Override // org.telegram.ui.Components.yw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    @Override // org.telegram.ui.Components.yw0
    public final uw0[] B1(uw0[] uw0VarArr) {
        if (uw0VarArr != null && this.w3) {
            int i10 = 0;
            while (true) {
                if (i10 >= uw0VarArr.length) {
                    i10 = -1;
                    break;
                }
                uw0 uw0Var = uw0VarArr[i10];
                if (uw0Var != null && uw0Var.b) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                int length = uw0VarArr.length;
                uw0[] uw0VarArr2 = new uw0[length];
                uw0VarArr2[0] = uw0VarArr[i10];
                int i11 = 1;
                while (i11 < length) {
                    uw0VarArr2[i11] = uw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                    i11++;
                }
                return uw0VarArr2;
            }
        }
        return uw0VarArr;
    }

    @Override // org.telegram.ui.Components.yw0
    public final void E1(int i10) {
        super.E1(i10);
        this.x3.d(false);
    }
}
