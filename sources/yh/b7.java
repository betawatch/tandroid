package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class b7 extends rg.y1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // rg.y1
    public final void a() {
        rg.x1 x1Var = new rg.x1(this.r);
        this.a = x1Var;
        x1Var.N = 105;
        int i10 = 0;
        x1Var.M = false;
        x1Var.G = false;
        x1Var.K = true;
        x1Var.H = true;
        x1Var.J = false;
        x1Var.m = true;
        x1Var.h = true;
        if (this.s == 1) {
            x1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                rg.x1 x1Var2 = this.a;
                x1Var2.l = new ci.y7(this, 5);
                x1Var2.r = 17;
                x1Var2.s = 18;
                x1Var2.t = 19;
                x1Var2.P = org.telegram.ui.ActionBar.i6.G6;
                x1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // rg.y1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
