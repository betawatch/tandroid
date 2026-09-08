package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u50 {
    public final org.telegram.ui.Components.f01 d;
    public final org.telegram.ui.Components.f01 e;
    public final org.telegram.ui.Components.f01 f;
    public t50 g;
    public int j;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final w50[] c = new w50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.e6 i = new org.telegram.ui.Components.e6(new g10(this, 7), 320, org.telegram.ui.Components.pr.h, 0);
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public u50() {
        int i10 = 0;
        while (true) {
            w50[] w50VarArr = this.c;
            if (i10 >= w50VarArr.length) {
                this.a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
                this.d = new org.telegram.ui.Components.f01(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.f01 f01Var = new org.telegram.ui.Components.f01(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                f01Var.n(99);
                f01Var.q(AndroidUtilities.dp(200.0f));
                f01Var.m(AndroidUtilities.dp(2.66f));
                this.e = f01Var;
                this.f = new org.telegram.ui.Components.f01(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            w50VarArr[i10] = new w50(i10);
            i10++;
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        canvas.save();
        org.telegram.ui.Components.f01 f01Var = this.d;
        f01Var.p = f7 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.j, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
        Paint paint = this.a;
        paint.setColor(d);
        float e7 = this.i.e(this.h);
        float l4 = f01Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float dp = AndroidUtilities.dp(28.0f);
        float dp2 = AndroidUtilities.dp(232.0f);
        float j3 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp2, f10);
        float lerp2 = AndroidUtilities.lerp(dp, j3, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp3 = AndroidUtilities.dp(18.0f);
        int dp4 = AndroidUtilities.dp(30.0f);
        int i10 = dp3 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        float dp5 = AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f11 = dp3 / 2.0f;
        float f12 = centerY;
        float f13 = centerY2;
        RectF rectF2 = this.k;
        rectF2.set(dp5 - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (r3 * 2);
        float dp6 = (int) ((dp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp6) + f15);
        float f17 = dp4 / 2.0f;
        float dp7 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17);
        RectF rectF3 = this.l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, dp7);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        w50[] w50VarArr = this.c;
        boolean b10 = w50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp6) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (w50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.f01 f01Var2 = this.d;
        f01Var2.c(f14 - (f01Var2.l() / 2.0f), dp / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e7) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp6 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (w50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp6 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = w50VarArr[3].b(canvas, rectF3, f10) ? true : z10;
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp2 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j3 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j3 - AndroidUtilities.dp(40.0f)), paint2);
            this.f.c(rectF.centerX() - (this.f.l() / 2.0f), j3 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        this.h = strArr == null;
        for (int i10 = 0; i10 < 4; i10++) {
            w50 w50Var = this.c[i10];
            String str = strArr == null ? null : strArr[i10];
            v50 v50Var = w50Var.k;
            boolean z10 = w50Var.f;
            w50Var.f = str != null;
            if (str != null && (w50Var.d == null || !TextUtils.equals(w50Var.l, str))) {
                org.telegram.ui.Components.q5 q5Var = w50Var.d;
                if (q5Var != null) {
                    q5Var.p(v50Var);
                }
                w50Var.c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5();
                q5Var2.l = 1.0f;
                q5Var2.n = null;
                q5Var2.o = null;
                q5Var2.g = 21;
                q5Var2.h = productionAccount;
                q5Var2.y();
                org.telegram.ui.Components.q5.x();
                w50Var.d = q5Var2;
                w50Var.l = str;
                q5Var2.r(str);
                w50Var.c();
                if (w50Var.j) {
                    w50Var.d.b(v50Var);
                }
            }
            if (w50Var.f && !z10) {
                w50Var.e = false;
            }
        }
        t50 t50Var = this.g;
        if (t50Var != null) {
            t50Var.invalidate();
        }
    }
}
