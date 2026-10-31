package xh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.v5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p3 extends Drawable implements n6, us {
    public final Paint a;
    public final Paint b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public int e;
    public final f5[] f;
    public final qz0 h;
    public final RectF n;
    public final boolean r;
    public final t5 s;
    public boolean w;
    public boolean x;
    public View y;

    public p3(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f = new f5[2];
        this.n = new RectF();
        this.s = new t5(new o3(this, 1), 320L, gr.h, 0);
        this.r = false;
        int i10 = t6.d6;
        paint.setColor(t6.x0(null, i10, false));
        paint2.setColor(t6.x0(null, i10, false));
        paint2.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(2.0f), t6.r1(0.18f, -16777216));
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        d();
        this.h = new qz0(h20.p(user), 14.0f, null);
    }

    @Override // org.telegram.ui.Components.n6
    public final void a(ei0 ei0Var) {
        this.y = ei0Var;
        this.d.H0(ei0Var);
        this.c.H0(ei0Var);
    }

    @Override // org.telegram.ui.Components.n6
    public final void b(ImageReceiver imageReceiver) {
        this.x = false;
        this.c.R();
        this.d.R();
        zs.f(d20.s0).n(this, zs.C1);
        f5[] f5VarArr = this.f;
        f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.n(this.y);
        }
        f5 f5Var2 = f5VarArr[1];
        if (f5Var2 != null) {
            f5Var2.n(this.y);
        }
    }

    @Override // org.telegram.ui.Components.n6
    public final void c(ImageReceiver imageReceiver) {
        this.x = true;
        this.c.P();
        this.d.P();
        zs.f(d20.s0).c(this, zs.C1);
        f5[] f5VarArr = this.f;
        f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.a(this.y);
        }
        f5 f5Var2 = f5VarArr[1];
        if (f5Var2 != null) {
            f5Var2.a(this.y);
        }
    }

    public final void d() {
        f5 f5Var;
        TLRPC.TL_messages_stickerSet m0 = ui.b0(d20.s0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 == null || m0.documents.isEmpty()) {
            this.w = true;
            return;
        }
        TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
        int i10 = 1 - this.e;
        this.e = i10;
        f5[] f5VarArr = this.f;
        f5 f5Var2 = f5VarArr[i10];
        if (f5Var2 != null) {
            f5Var2.n(this.y);
        }
        f5VarArr[this.e] = f5.l(d20.s0, 9, document);
        f5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.Ci, false), PorterDuff.Mode.SRC_IN));
        if (this.x && (f5Var = f5VarArr[this.e]) != null) {
            f5Var.a(this.y);
        }
        org.telegram.messenger.i0.h3(new o3(this, 0), 2500L);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.B0 && this.w && this.x) {
            this.w = false;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        f5 f5Var;
        f5 f5Var2;
        Rect bounds = getBounds();
        int x02 = t6.x0(null, t6.d6, false);
        Paint paint = this.a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.r;
        float L = org.telegram.messenger.i0.L((z10 ? 48 : 28) + 38 + 6.66f) + this.h.c;
        float f13 = L / 2.0f;
        float L2 = org.telegram.messenger.i0.L(32.0f) / 2.0f;
        RectF rectF = this.n;
        rectF.set(bounds.centerX() - f13, bounds.centerY() - L2, bounds.centerX() + f13, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        float f14 = rectF.left;
        float f15 = rectF.top;
        float L3 = org.telegram.messenger.i0.L(32.0f);
        float L4 = org.telegram.messenger.i0.L(32.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(f14, f15, L3, L4);
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.i0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, t6.x0(null, t6.G6, false), canvas);
        if (z10) {
            float L5 = rectF.right - org.telegram.messenger.i0.L(22.66f);
            canvas.drawCircle(L5, rectF.centerY(), org.telegram.messenger.i0.L(24.0f), paint2);
            float centerY = rectF.centerY() - org.telegram.messenger.i0.L(16.0f);
            float L6 = org.telegram.messenger.i0.L(32.0f);
            float L7 = org.telegram.messenger.i0.L(32.0f);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L5 - org.telegram.messenger.i0.L(16.0f), centerY, L6, L7);
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.i0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.i0.L(12.0f)));
        f5[] f5VarArr = this.f;
        if (e >= 1.0f || (f5Var2 = f5VarArr[0]) == null) {
            f7 = 24.0f;
            f10 = 1.0f;
            f11 = 12.0f;
            f12 = 255.0f;
        } else {
            canvas.save();
            f7 = 24.0f;
            canvas.translate(0.0f, (this.e == 0 ? -1 : 1) * org.telegram.messenger.i0.L(9.0f) * e);
            float f16 = 1.0f - e;
            f10 = 1.0f;
            float f17 = (f16 * 0.4f) + 0.6f;
            f11 = 12.0f;
            f12 = 255.0f;
            canvas.scale(f17, f17, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            f5Var2.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            f5Var2.setAlpha((int) (f16 * 255.0f));
            f5Var2.draw(canvas);
            canvas.restore();
        }
        if (e > 0.0f && (f5Var = f5VarArr[1]) != null) {
            canvas.save();
            canvas.translate(0.0f, (f10 - e) * org.telegram.messenger.i0.L(9.0f) * (this.e != 1 ? 1 : -1));
            float f18 = (0.4f * e) + 0.6f;
            canvas.scale(f18, f18, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11));
            f5Var.setBounds(0, 0, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7));
            f5Var.setAlpha((int) (e * f12));
            f5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public p3(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f = new f5[2];
        this.n = new RectF();
        this.s = new t5(new o3(this, 1), 320L, gr.h, 0);
        this.r = true;
        int i10 = t6.d6;
        paint.setColor(t6.x0(null, i10, false));
        paint2.setColor(t6.x0(null, i10, false));
        paint2.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(2.0f), t6.r1(0.18f, -16777216));
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        imageReceiver2.r0(ic.b(document), "120_120", ic.c(b8.w(document.thumbs, 120, false, null, false), document), "120_120", v5.d(document.thumbs, t6.a7, 0.35f, false), 0L, null, null, 0);
        this.h = new qz0(h20.p(user), 14.0f, null);
    }
}
