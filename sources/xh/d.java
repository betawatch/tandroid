package xh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h a;
    public final q1 b;
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

    public d(h hVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        u8 u8Var = new u8((e6) null);
        int i3 = h10.t0;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.a);
        this.c = imageReceiver2;
        this.a = hVar;
        q1 q1Var = hVar.E;
        this.b = q1Var;
        this.d = j10;
        u8Var.p = 1.0f;
        if (m5.E(j10)) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            u8Var.r(a22);
            if (l10.B(a22)) {
                str2 = bd.M0(2131745911, null);
                u8Var.g(1);
                u8Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, u8Var, 0L, null, a22, 0);
                imageReceiver.J0(g0.L(g.a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(r2), g0.L(r2));
                Paint Z1 = q1Var.Z1("paintChatActionText");
                if (str2 != null || Z1 == null) {
                }
                int L = g0.q.x - g0.L(48);
                TextPaint textPaint = new TextPaint(Z1);
                this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r5, 0, r5.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            imageReceiver = imageReceiver2;
            str = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : "";
            imageReceiver.i0(a22, u8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            str = M0 != null ? M0.title : "";
            u8Var.q(M0);
            imageReceiver.i0(M0, u8Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, g0.L(r2), g0.L(r2));
        Paint Z12 = q1Var.Z1("paintChatActionText");
        if (str2 != null) {
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14 = f11 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f10 + f14;
        float f17 = f13 - f12;
        if (f11 <= f17) {
            return f15 < f12 ? f12 + f14 : f16 > f13 ? f13 - f14 : f10;
        }
        float f18 = (f12 + f13) / 2.0f;
        float f19 = f11 - f17;
        float max = Math.max(0.0f, f12 - f15);
        float max2 = Math.max(0.0f, f16 - f13);
        float f20 = max + max2;
        return f20 < 0.1f ? f18 : a1.g.A(f19, 2.0f, (max - max2) / f20, f18);
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i3 = g.a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        float f15 = ((this.l * 0.25f) + 0.75f) * f13;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(f15);
        imageReceiver.h(canvas, null);
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
