package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class x6 extends sg.z1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // sg.z1
    public final void a() {
        sg.y1 y1Var = new sg.y1(this.r);
        this.a = y1Var;
        y1Var.N = 105;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.m = true;
        y1Var.h = true;
        if (this.s == 1) {
            y1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                sg.y1 y1Var2 = this.a;
                y1Var2.l = new di.a8(this, 5);
                y1Var2.r = 17;
                y1Var2.s = 18;
                y1Var2.t = 19;
                y1Var2.P = org.telegram.ui.ActionBar.j6.G6;
                y1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // sg.z1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
