package qh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import dg.a0;
import eg.p2;
import eg.q2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c extends q2 {
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

    @Override // eg.q2
    public final void a() {
        p2 p2Var = new p2(this.r);
        this.a = p2Var;
        p2Var.N = 106;
        int i10 = 0;
        p2Var.M = false;
        p2Var.G = false;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.J = false;
        p2Var.m = true;
        p2Var.h = true;
        if (this.s == 1) {
            p2Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                p2 p2Var2 = this.a;
                p2Var2.l = new a0(this, 5);
                p2Var2.r = 17;
                p2Var2.s = 18;
                p2Var2.t = 19;
                p2Var2.P = j6.G6;
                p2Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // eg.q2
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
