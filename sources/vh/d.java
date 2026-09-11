package vh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h a;
    public final t1 b;
    public final ImageReceiver c;
    public final long d;
    public b e;
    public b f;
    public Paint g;
    public final StaticLayout h;
    public float i;
    public float j;
    public ValueAnimator k;
    public float l;
    public boolean m;
    public ValueAnimator n;
    public float o;
    public boolean p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        i9 i9Var = new i9((f6) null);
        int i10 = UserConfig.selectedAccount;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.a);
        this.c = imageReceiver2;
        this.a = hVar;
        t1 t1Var = hVar.y;
        this.b = t1Var;
        this.d = j3;
        i9Var.p = 1.0f;
        if (DialogObject.isUserDialog(j3)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            i9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                i9Var.g(1);
                i9Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, i9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(g.a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(r2), AndroidUtilities.dp(r2));
                Paint M2 = t1Var.M2("paintChatActionText");
                if (str2 != null || M2 == null) {
                }
                int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(48);
                TextPaint textPaint = new TextPaint(M2);
                this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r5, 0, r5.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            imageReceiver = imageReceiver2;
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            imageReceiver.setForUserOrChat(user, i9Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            str = chat != null ? chat.title : "";
            i9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, i9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(g.a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(r2), AndroidUtilities.dp(r2));
        Paint M22 = t1Var.M2("paintChatActionText");
        if (str2 != null) {
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        float f13 = f10 / 2.0f;
        float f14 = f7 - f13;
        float f15 = f7 + f13;
        float f16 = f12 - f11;
        if (f10 <= f16) {
            return f14 < f11 ? f11 + f13 : f15 > f12 ? f12 - f13 : f7;
        }
        float f17 = (f11 + f12) / 2.0f;
        float f18 = f10 - f16;
        float max = Math.max(0.0f, f11 - f14);
        float max2 = Math.max(0.0f, f15 - f12);
        float f19 = max + max2;
        return f19 < 0.1f ? f17 : a4.a.e(f18, 2.0f, (max - max2) / f19, f17);
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7 - f11, f10 - f11);
        int i10 = g.a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        float f14 = ((this.l * 0.25f) + 0.75f) * f12;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(f14);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.n) {
            this.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.k) {
            this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.a.invalidateSelf();
    }
}
