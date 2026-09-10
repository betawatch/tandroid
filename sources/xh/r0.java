package xh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r0 extends nh.c implements le.d {
    public static final /* synthetic */ int s = 0;
    public final le.e f;
    public final org.telegram.ui.web.y1 h;
    public final nh.b[] n;
    public int r;

    public r0(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.y1 y1Var) {
        super(context);
        this.f = new le.e(0, this, wr.h, 1600L);
        this.h = y1Var;
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.09411765f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        org.telegram.ui.ActionBar.j6.l1(0.1254902f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setColor(l1);
        this.n = new nh.b[]{nh.b.b(context, f6Var, nh.a.G, R.string.GiftPreviewModels), nh.b.b(context, f6Var, nh.a.v, R.string.GiftPreviewBackdrops), nh.b.b(context, f6Var, nh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            nh.b[] bVarArr = this.n;
            if (i11 >= bVarArr.length) {
                bVarArr[0].e(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i11], w7.a6.l(1.0f, 0, -1));
                this.n[i11].setOnClickListener(new bi.j5(this, i11, 27));
                i11++;
            }
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.r;
        if (i11 != i10) {
            nh.b[] bVarArr = this.n;
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

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
