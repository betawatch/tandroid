package xh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p8 {
    public int a;
    public final RectF b;
    public final org.telegram.ui.Components.d6 c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f;
    public final Matrix g;
    public final Paint h;
    public final boolean i;
    public long j;
    public final ImageReceiver k;
    public final g9 l;
    public final g9 m;
    public t01 n;
    public t01 o;
    public boolean p;
    public final xc q;
    public int r;
    public Drawable s;
    public Drawable t;
    public t01 u;
    public int v;
    public final /* synthetic */ q8 w;

    public p8(q8 q8Var, boolean z10, long j3) {
        String str;
        r8 r8Var = q8Var.r;
        this.w = q8Var;
        this.b = new RectF();
        wr wrVar = wr.h;
        this.c = new org.telegram.ui.Components.d6(q8Var, 0L, 600L, wrVar);
        this.d = new org.telegram.ui.Components.d6(q8Var, 0L, 200L, wrVar);
        this.e = new org.telegram.ui.Components.d6(q8Var, 0L, 350L, wrVar);
        this.f = null;
        this.g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(q8Var);
        this.k = imageReceiver;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.l = g9Var;
        g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
        this.m = g9Var2;
        this.q = new xc(q8Var);
        this.i = z10;
        this.j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(r8Var.c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            imageReceiver.setForUserOrChat(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(r8Var.c).getChat(Long.valueOf(-j3));
            str = chat == null ? "" : chat.title;
            g9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, g9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        g9Var2.g(21);
        g9Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c8, r8Var.b));
        this.n = new t01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.c.d(this.a, false);
        int i10 = this.a;
        q8 q8Var = this.w;
        if (i10 >= 0 && i10 < q8Var.b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (q8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, q8Var.f);
        float dp = ((q8Var.f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                float dp3 = AndroidUtilities.dp(56.0f);
                f10 = 40.0f;
                float dp4 = AndroidUtilities.dp(56.0f);
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), dp3, dp4);
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp5 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp6 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp7 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp8 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                g9 g9Var = this.m;
                g9Var.setBounds(dp5, dp6, dp7, dp8);
                g9Var.y = (int) (e * f7 * e7);
                g9Var.draw(canvas);
                g9Var.y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.o.c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.o.c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, q8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f != null) {
            Matrix matrix = this.g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        t01 t01Var = this.o;
        t01Var.c(dp - (t01Var.c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        t01 t01Var2 = this.n;
        t01Var2.p = width - AndroidUtilities.dp(4.0f);
        t01Var2.c(dp - (this.n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, q8Var.r.b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.t.setAlpha(i13);
            this.s.setAlpha(i13);
            this.t.draw(canvas);
            this.s.draw(canvas);
            t01 t01Var3 = this.u;
            t01Var3.c(dp - (t01Var3.c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        String str;
        String str2;
        q8 q8Var = this.w;
        r8 r8Var = q8Var.r;
        if (this.i) {
            if ((this.p ? 2666000L : this.j == UserConfig.getInstance(r8Var.c).getClientUserId() ? 0L : this.j) != j3) {
                this.p = j3 == UserObject.ANONYMOUS;
                if (j3 == 0 || j3 == UserObject.ANONYMOUS) {
                    j3 = UserConfig.getInstance(r8Var.c).getClientUserId();
                }
                this.j = j3;
                if (this.p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.k;
                    g9 g9Var = this.l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(r8Var.c).getUser(Long.valueOf(this.j));
                        str = UserObject.getForcedFirstName(user);
                        g9Var.r(user);
                        imageReceiver.setForUserOrChat(user, g9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(r8Var.c).getChat(Long.valueOf(-this.j));
                        str = chat == null ? "" : chat.title;
                        g9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, g9Var);
                    }
                    str2 = str;
                }
                this.n = new t01(str2, 12.0f, null);
                q8Var.invalidate();
            }
        }
    }
}
