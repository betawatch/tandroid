// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sq0 extends Drawable implements yx {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;
    public int h;

    public sq0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.e = imageReceiver2;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f = mutate;
        int w0 = bkb.w0(null, bkb.K5, false);
        this.h = w0;
        mutate.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        imageReceiver.U(user, pb0Var, null);
        imageReceiver.q0(gl.L(25.0f));
        pb0 pb0Var2 = new pb0((wjb) null);
        pb0Var2.q(user2);
        imageReceiver2.U(user2, pb0Var2, null);
        imageReceiver2.q0(gl.L(25.0f));
    }

    @Override // yx
    public final void a(ry8 ry8Var) {
        this.e.p0(ry8Var);
        this.d.p0(ry8Var);
    }

    @Override // yx
    public final void b(ImageReceiver imageReceiver) {
        this.d.K();
        this.e.K();
    }

    @Override // yx
    public final void c(ImageReceiver imageReceiver) {
        this.d.I();
        this.e.I();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bkb.K5;
        int w0 = bkb.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        float L = gl.L(136.0f) / 2.0f;
        float centerY = bounds.centerY() - gl.L(25.0f);
        float L2 = gl.L(50.0f);
        float L3 = gl.L(50.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(bounds.centerX() - L, centerY, L2, L3);
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + gl.L(41.0f);
        float L4 = gl.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L4, gl.L(14.0f), paint);
        canvas.drawCircle(centerX, L4, gl.L(12.0f), this.c);
        int w02 = bkb.w0(null, i, false);
        int i2 = this.h;
        Drawable drawable = this.f;
        if (w02 != i2) {
            this.h = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - gl.L(9.0f)), (int) (L4 - gl.L(9.0f)), (int) (centerX + gl.L(9.0f)), (int) (L4 + gl.L(9.0f)));
        drawable.draw(canvas);
        float centerX2 = bounds.centerX() - gl.L(3.33f);
        float centerY2 = bounds.centerY() - gl.L(7.0f);
        float L5 = gl.L(3.33f) + bounds.centerX();
        float centerY3 = bounds.centerY();
        Paint paint2 = this.a;
        canvas.drawLine(centerX2, centerY2, L5, centerY3, paint2);
        canvas.drawLine(bounds.centerX() - gl.L(3.33f), gl.L(7.0f) + bounds.centerY(), gl.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        float centerY4 = bounds.centerY() - gl.L(25.0f);
        float L6 = gl.L(50.0f);
        float L7 = gl.L(50.0f);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.i0((bounds.centerX() + L) - gl.L(50.0f), centerY4, L6, L7);
        imageReceiver2.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
