package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v3 extends Drawable implements w6, NotificationCenter.NotificationCenterDelegate {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final p5[] f;
    public final zz0 h;
    public final RectF n;
    public final boolean r;
    public final d6 s;
    public boolean v;
    public boolean w;
    public View x;

    public v3(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.c = imageReceiver;
        this.d = new ImageReceiver();
        this.e = 1;
        this.f = new p5[2];
        this.n = new RectF();
        this.s = new d6(new u3(this, 1), 320L, jr.h, 0);
        this.r = false;
        int i10 = g6.d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        e9 e9Var = new e9((c6) null);
        e9Var.r(user);
        imageReceiver.setForUserOrChat(user, e9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new zz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override // org.telegram.ui.Components.w6
    public final void a(aj0 aj0Var) {
        this.x = aj0Var;
        this.d.setParentView(aj0Var);
        this.c.setParentView(aj0Var);
    }

    @Override // org.telegram.ui.Components.w6
    public final void b(ImageReceiver imageReceiver) {
        this.w = false;
        this.c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        p5[] p5VarArr = this.f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.o(this.x);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.o(this.x);
        }
    }

    @Override // org.telegram.ui.Components.w6
    public final void c(ImageReceiver imageReceiver) {
        this.w = true;
        this.c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        p5[] p5VarArr = this.f;
        p5 p5Var = p5VarArr[0];
        if (p5Var != null) {
            p5Var.a(this.x);
        }
        p5 p5Var2 = p5VarArr[1];
        if (p5Var2 != null) {
            p5Var2.a(this.x);
        }
    }

    public final void d() {
        p5 p5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet == null || stickerSet.documents.isEmpty()) {
            this.v = true;
            return;
        }
        TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
        int i10 = 1 - this.e;
        this.e = i10;
        p5[] p5VarArr = this.f;
        p5 p5Var2 = p5VarArr[i10];
        if (p5Var2 != null) {
            p5Var2.o(this.x);
        }
        p5VarArr[this.e] = p5.m(UserConfig.selectedAccount, 9, document);
        p5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Oh, false), PorterDuff.Mode.SRC_IN));
        if (this.w && (p5Var = p5VarArr[this.e]) != null) {
            p5Var.a(this.x);
        }
        AndroidUtilities.runOnUIThread(new u3(this, 0), 2500L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.w) {
            this.v = false;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        p5 p5Var;
        p5 p5Var2;
        Rect bounds = getBounds();
        boolean z10 = this.r;
        float dp = AndroidUtilities.dp((z10 ? 48 : 28) + 38 + 6.66f) + this.h.c;
        float f13 = dp / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - f13, bounds.centerY() - dp2, bounds.centerX() + f13, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.a);
        float f14 = rectF.left;
        float f15 = rectF.top;
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(32.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setImageCoords(f14, f15, dp3, dp4);
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, g6.w0(null, g6.G6, false), canvas);
        if (z10) {
            float dp5 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp5, rectF.centerY(), AndroidUtilities.dp(24.0f), this.b);
            float centerY = rectF.centerY() - AndroidUtilities.dp(16.0f);
            float dp6 = AndroidUtilities.dp(32.0f);
            float dp7 = AndroidUtilities.dp(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp5 - AndroidUtilities.dp(16.0f), centerY, dp6, dp7);
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.s.d(this.e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        p5[] p5VarArr = this.f;
        if (d >= 1.0f || (p5Var2 = p5VarArr[0]) == null) {
            f9 = 24.0f;
            f10 = 0.4f;
            f11 = 255.0f;
            f12 = 12.0f;
        } else {
            canvas.save();
            f9 = 24.0f;
            canvas.translate(0.0f, (this.e == 0 ? -1 : 1) * AndroidUtilities.dp(9.0f) * d);
            float f16 = 1.0f - d;
            f11 = 255.0f;
            float f17 = (f16 * 0.4f) + 0.6f;
            f10 = 0.4f;
            f12 = 12.0f;
            canvas.scale(f17, f17, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            p5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            p5Var2.setAlpha((int) (f16 * 255.0f));
            p5Var2.draw(canvas);
            canvas.restore();
        }
        if (d > 0.0f && (p5Var = p5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * (this.e != 1 ? 1 : -1));
            float f18 = (d * f10) + 0.6f;
            canvas.scale(f18, f18, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            p5Var.setBounds(0, 0, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
            p5Var.setAlpha((int) (d * f11));
            p5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public v3(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new p5[2];
        this.n = new RectF();
        this.s = new d6(new u3(this, 1), 320L, jr.h, 0);
        this.r = true;
        int i10 = g6.d6;
        paint.setColor(g6.w0(null, i10, false));
        paint2.setColor(g6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), g6.l1(0.18f, -16777216));
        e9 e9Var = new e9((c6) null);
        e9Var.r(user);
        imageReceiver.setForUserOrChat(user, e9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document), "120_120", DocumentObject.getSvgThumb(document.thumbs, g6.a7, 0.35f), 0L, null, null, 0);
        this.h = new zz0(UserObject.getUserName(user), 14.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
