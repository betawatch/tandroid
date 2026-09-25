package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class y6 extends rg.w1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // rg.w1
    public final void a() {
        rg.v1 v1Var = new rg.v1(this.r);
        this.a = v1Var;
        v1Var.N = 105;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.m = true;
        v1Var.h = true;
        if (this.s == 1) {
            v1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                rg.v1 v1Var2 = this.a;
                v1Var2.l = new ci.x7(this, 5);
                v1Var2.r = 17;
                v1Var2.s = 18;
                v1Var2.t = 19;
                v1Var2.P = org.telegram.ui.ActionBar.h6.G6;
                v1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // rg.w1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
