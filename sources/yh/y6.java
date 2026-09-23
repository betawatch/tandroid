package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class y6 extends rg.v1 {
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

    @Override // rg.v1
    public final void a() {
        rg.u1 u1Var = new rg.u1(this.r);
        this.a = u1Var;
        u1Var.N = 105;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.m = true;
        u1Var.h = true;
        if (this.s == 1) {
            u1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                rg.u1 u1Var2 = this.a;
                u1Var2.l = new ci.x7(this, 5);
                u1Var2.r = 17;
                u1Var2.s = 18;
                u1Var2.t = 19;
                u1Var2.P = org.telegram.ui.ActionBar.h6.G6;
                u1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // rg.v1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
