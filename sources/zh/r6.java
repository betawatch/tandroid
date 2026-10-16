package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class r6 extends sg.x1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        c();
    }

    @Override // sg.x1
    public final void a() {
        sg.w1 w1Var = new sg.w1(this.r);
        this.a = w1Var;
        w1Var.N = 105;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.m = true;
        w1Var.h = true;
        if (this.s == 1) {
            w1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                sg.w1 w1Var2 = this.a;
                w1Var2.l = new di.w7(this, 5);
                w1Var2.r = 17;
                w1Var2.s = 18;
                w1Var2.t = 19;
                w1Var2.P = org.telegram.ui.ActionBar.g6.G6;
                w1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // sg.x1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
