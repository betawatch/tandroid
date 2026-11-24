// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tz8 implements ValueAnimator.AnimatorUpdateListener {
    public final wz8 a;
    public final rc2 b;
    public final ImageReceiver c;
    public final long d;
    public zl0 e;
    public zl0 f;
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

    public tz8(wz8 wz8Var, long j) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        pc0 pc0Var = new pc0((ylb) null);
        int i = z8c.t0;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(wz8Var.a);
        this.c = imageReceiver2;
        this.a = wz8Var;
        rc2 rc2Var = wz8Var.E;
        this.b = rc2Var;
        this.d = j;
        pc0Var.p = 1.0f;
        if (pg3.D(j)) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            pc0Var.q(W1);
            if (m9c.D(W1)) {
                str2 = jb6.M0(2131745635, null);
                pc0Var.f(1);
                pc0Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.Z(null, null, null, null, pc0Var, 0L, null, W1, 0);
                imageReceiver.q0(gm.L(21.0f));
                imageReceiver.i0(0.0f, 0.0f, gm.L(42.0f), gm.L(42.0f));
                Paint c2 = rc2Var.c2("paintChatActionText");
                if (str2 != null || c2 == null) {
                }
                int L = gm.q.x - gm.L(48.0f);
                TextPaint textPaint = new TextPaint(c2);
                this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r5, 0, r5.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            imageReceiver = imageReceiver2;
            str = W1 != null ? bw2.m(0, W1.first_name, W1.last_name) : "";
            imageReceiver.U(W1, pc0Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            str = L0 != null ? L0.title : "";
            pc0Var.p(L0);
            imageReceiver.U(L0, pc0Var, null);
        }
        str2 = str;
        imageReceiver.q0(gm.L(21.0f));
        imageReceiver.i0(0.0f, 0.0f, gm.L(42.0f), gm.L(42.0f));
        Paint c22 = rc2Var.c2("paintChatActionText");
        if (str2 != null) {
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f4 - f3;
        if (f2 <= f8) {
            return f6 < f3 ? f3 + f5 : f7 > f4 ? f4 - f5 : f;
        }
        float f9 = (f3 + f4) / 2.0f;
        float f10 = f2 - f8;
        float max = Math.max(0.0f, f3 - f6);
        float max2 = Math.max(0.0f, f7 - f4);
        float f11 = max + max2;
        return f11 < 0.1f ? f9 : b10.A(f10, 2.0f, (max - max2) / f11, f9);
    }

    public final void a(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.translate(f - f3, f2 - f3);
        canvas.scale(f3 / gm.L(21.0f), f3 / gm.L(21.0f));
        float f5 = ((this.l * 0.25f) + 0.75f) * f4;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(f5);
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
