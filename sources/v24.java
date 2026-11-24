// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v24 extends View {
    public ff0 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Drawable f;
    public final String h;
    public int n;
    public int r;
    public int s;
    public int w;

    public v24(Activity activity) {
        super(activity);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.n = -761748;
        this.r = gl.L(26.0f);
        this.s = kk7.d4;
        this.w = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(gl.L(18.0f));
        paint.setTypeface(gl.o());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(gl.L(18.0f));
        paint2.setTypeface(gl.o());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = k96.M0(2131752029, null);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ff0 ff0Var = this.a;
        if (ff0Var != null) {
            ff0Var.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ff0 ff0Var = this.a;
        if (ff0Var != null) {
            ff0Var.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i = this.n;
        Paint paint = this.b;
        paint.setColor(i);
        float width2 = getWidth();
        float height2 = getHeight();
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, width2, height2);
        float f = this.r;
        canvas.drawRoundRect(rectF, f, f, paint);
        Drawable drawable = this.f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.s);
        drawable.draw(canvas);
        int i2 = this.w;
        Paint paint2 = this.c;
        paint2.setAlpha(i2);
        int i3 = (this.w / kk7.d4) * 38;
        Paint paint3 = this.d;
        paint3.setAlpha(i3);
        String str = this.h;
        canvas.drawText(str, width, gl.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + gl.L(6.0f), paint3);
        if (this.a == null) {
            ff0 Y = bkb.Y(bkb.w0(null, bkb.h6, false), 8, 8);
            this.a = Y;
            Y.setCallback(this);
        }
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.a.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
