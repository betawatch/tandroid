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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xx extends View {
    public final ImageReceiver a;
    public final Drawable b;
    public final Paint c;
    public final Paint d;

    public xx(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.h1 = new l0(this, (byte) 21);
        this.b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(3.0f));
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
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), gl.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), this.d);
        float L = gl.L(42.0f);
        float L2 = gl.L(42.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0((getWidth() / 2.0f) - gl.L(66.0f), (getHeight() / 2.0f) - (gl.L(42.0f) / 2.0f), L, L2);
        imageReceiver.h(canvas, null);
        Paint paint = this.c;
        canvas.drawLine((getWidth() / 2.0f) - gl.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + gl.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - gl.L(8.0f), getWidth() / 2.0f, gl.L(8.0f) + (getHeight() / 2.0f), paint);
        int L3 = gl.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (gl.L(42.0f) / 2);
        int L4 = gl.L(66.0f) + (getWidth() / 2);
        int L5 = (gl.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.b;
        drawable.setBounds(L3, height, L4, L5);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon l0 = hq6.l0(tL_attachMenuBot);
        if (l0 != null) {
            this.a.d0(gl5.b(l0.icon), "42_42", uo3.f(l0.icon, bkb.p5, 1.0f, null), "svg", tL_attachMenuBot, 0);
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
