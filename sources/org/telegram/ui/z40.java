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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z40 {
    public final org.telegram.ui.Components.nz0 d;
    public final org.telegram.ui.Components.nz0 e;
    public final org.telegram.ui.Components.nz0 f;
    public fh.l2 g;
    public int j;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final b50[] c = new b50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.y5 i = new org.telegram.ui.Components.y5(new o00(this, 7), 320, org.telegram.ui.Components.gr.h, 0);
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public z40() {
        int i9 = 0;
        while (true) {
            b50[] b50VarArr = this.c;
            if (i9 >= b50VarArr.length) {
                this.a.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.tg, false));
                this.d = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                nz0Var.n(99);
                nz0Var.q(AndroidUtilities.dp(200.0f));
                nz0Var.m(AndroidUtilities.dp(2.66f));
                this.e = nz0Var;
                this.f = new org.telegram.ui.Components.nz0(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            b50VarArr[i9] = new b50(i9);
            i9++;
        }
    }

    public final boolean a(Canvas canvas, float f10, float f11) {
        canvas.save();
        org.telegram.ui.Components.nz0 nz0Var = this.d;
        nz0Var.p = f10 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f11, this.j, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.tg, false));
        Paint paint = this.a;
        paint.setColor(d);
        float e10 = this.i.e(this.h);
        float l10 = nz0Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float dp = AndroidUtilities.dp(28.0f);
        float dp2 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp2, f11);
        float lerp2 = AndroidUtilities.lerp(dp, j10, f11);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f11);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f10 - lerp) / 2.0f, 0.0f, (f10 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp3 = AndroidUtilities.dp(18.0f);
        int dp4 = AndroidUtilities.dp(30.0f);
        int i9 = dp3 / 2;
        int centerY = ((int) rectF.centerY()) - i9;
        int centerY2 = ((int) rectF.centerY()) + i9;
        float dp5 = AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f12 = dp3 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        RectF rectF2 = this.k;
        rectF2.set(dp5 - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (r3 * 2);
        float dp6 = (int) ((dp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp6) + f16);
        float f18 = dp4 / 2.0f;
        float dp7 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18);
        RectF rectF3 = this.l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, dp7);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        b50[] b50VarArr = this.c;
        boolean b10 = b50VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp6) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (b50VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        org.telegram.ui.Components.nz0 nz0Var2 = this.d;
        nz0Var2.c(f15 - (nz0Var2.l() / 2.0f), dp / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e10) * (1.0f - f11), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp6 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (b50VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp6 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        boolean z11 = b50VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp2 / 2.0f)), AndroidUtilities.dp(54.0f), f11, -1, canvas);
            Paint paint2 = this.b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f.c(rectF.centerX() - (this.f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        this.h = strArr == null;
        for (int i9 = 0; i9 < 4; i9++) {
            b50 b50Var = this.c[i9];
            String str = strArr == null ? null : strArr[i9];
            a50 a50Var = b50Var.k;
            boolean z10 = b50Var.f;
            b50Var.f = str != null;
            if (str != null && (b50Var.d == null || !TextUtils.equals(b50Var.l, str))) {
                org.telegram.ui.Components.k5 k5Var = b50Var.d;
                if (k5Var != null) {
                    k5Var.p(a50Var);
                }
                b50Var.c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5();
                k5Var2.l = 1.0f;
                k5Var2.n = null;
                k5Var2.o = null;
                k5Var2.g = 21;
                k5Var2.h = productionAccount;
                k5Var2.y();
                org.telegram.ui.Components.k5.x();
                b50Var.d = k5Var2;
                b50Var.l = str;
                k5Var2.r(str);
                b50Var.c();
                if (b50Var.j) {
                    b50Var.d.b(a50Var);
                }
            }
            if (b50Var.f && !z10) {
                b50Var.e = false;
            }
        }
        fh.l2 l2Var = this.g;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }
}
