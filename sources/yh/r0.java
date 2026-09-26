package yh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class r0 extends oh.c implements le.e {
    public static final /* synthetic */ int s = 0;
    public final le.f f;
    public final ii.q1 h;
    public final oh.b[] n;
    public int r;

    public r0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ii.q1 q1Var) {
        super(context);
        this.f = new le.f(0, this, rr.h, 1600L);
        this.h = q1Var;
        int i10 = org.telegram.ui.ActionBar.h6.Wk;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.09411765f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        org.telegram.ui.ActionBar.h6.l1(0.1254902f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.e.setColor(l1);
        this.n = new oh.b[]{oh.b.b(context, d6Var, oh.a.G, R.string.GiftPreviewModels), oh.b.b(context, d6Var, oh.a.v, R.string.GiftPreviewBackdrops), oh.b.b(context, d6Var, oh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.n;
            if (i11 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i11], w7.y5.l(1.0f, 0, -1));
                this.n[i11].setOnClickListener(new ci.n4(this, i11, 27));
                i11++;
            }
        }
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            oh.b[] bVarArr = this.n;
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

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
