// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yy extends View {
    public final ImageReceiver a;
    public final Drawable b;
    public final Paint c;
    public final Paint d;

    public yy(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.h1 = new l0(this, (byte) 23);
        this.b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), gm.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), this.d);
        float L = gm.L(42.0f);
        float L2 = gm.L(42.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0((getWidth() / 2.0f) - gm.L(66.0f), (getHeight() / 2.0f) - (gm.L(42.0f) / 2.0f), L, L2);
        imageReceiver.h(canvas, null);
        Paint paint = this.c;
        canvas.drawLine((getWidth() / 2.0f) - gm.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + gm.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - gm.L(8.0f), getWidth() / 2.0f, gm.L(8.0f) + (getHeight() / 2.0f), paint);
        int L3 = gm.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (gm.L(42.0f) / 2);
        int L4 = gm.L(66.0f) + (getWidth() / 2);
        int L5 = (gm.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.b;
        drawable.setBounds(L3, height, L4, L5);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon l0 = hs6.l0(tL_attachMenuBot);
        if (l0 != null) {
            this.a.d0(gn5.b(l0.icon), "42_42", eq3.f(l0.icon, cmb.p5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d.setColor(i);
    }

    public void setColor(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b.setColorFilter(i, mode);
        this.c.setColor(i);
        this.a.p1 = new PorterDuffColorFilter(i, mode);
    }
}
