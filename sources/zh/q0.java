package zh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q0 extends ph.c implements ne.d {
    public static final /* synthetic */ int s = 0;
    public final ne.e f;
    public final ji.p1 h;
    public final ph.b[] n;
    public int r;

    public q0(Context context, org.telegram.ui.ActionBar.c6 c6Var, ji.p1 p1Var) {
        super(context);
        this.f = new ne.e(0, this, es.h, 1600L);
        this.h = p1Var;
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.09411765f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        org.telegram.ui.ActionBar.g6.m1(0.1254902f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.e.setColor(m12);
        this.n = new ph.b[]{ph.b.b(context, c6Var, ph.a.G, R.string.GiftPreviewModels), ph.b.b(context, c6Var, ph.a.v, R.string.GiftPreviewBackdrops), ph.b.b(context, c6Var, ph.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.n;
            if (i11 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i11], w7.z5.l(1.0f, 0, -1));
                this.n[i11].setOnClickListener(new di.m4(this, i11, 28));
                i11++;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            ph.b[] bVarArr = this.n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.r = i10;
            this.f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.c;
        rect.set((int) lerp, AndroidUtilities.dp(8.0f), (int) lerp2, measuredHeight);
        int dp = AndroidUtilities.dp(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        b();
        invalidate();
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
