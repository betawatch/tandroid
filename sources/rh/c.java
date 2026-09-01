package rh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import eg.y;
import fg.o2;
import fg.p2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c extends p2 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // fg.p2
    public final void a() {
        o2 o2Var = new o2(this.r);
        this.a = o2Var;
        o2Var.N = 106;
        int i10 = 0;
        o2Var.M = false;
        o2Var.G = false;
        o2Var.K = true;
        o2Var.H = true;
        o2Var.J = false;
        o2Var.m = true;
        o2Var.h = true;
        if (this.s == 1) {
            o2Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                o2 o2Var2 = this.a;
                o2Var2.l = new y(this, 5);
                o2Var2.r = 17;
                o2Var2.s = 18;
                o2Var2.t = 19;
                o2Var2.P = k6.G6;
                o2Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // fg.p2
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
