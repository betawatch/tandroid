package vh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b9 extends View implements y1 {
    public final Drawable a;
    public final int b;
    public Bitmap c;
    public final Paint d;
    public final Paint e;
    public float f;
    public final org.telegram.ui.Components.t5 h;
    public final Path n;

    public b9(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.e = paint2;
        this.h = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.n = new Path();
        this.a = activity.getResources().getDrawable(R.drawable.media_dual_camera2_shadow).mutate();
        this.b = R.drawable.media_dual_camera2;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            this.c = BitmapFactory.decodeResource(getResources(), this.b);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.h.e(false, this.f);
        Drawable drawable = this.a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (e < 1.0f) {
            canvas.save();
            Path path = this.n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * e, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * e, this.d);
            canvas.save();
            Bitmap bitmap = this.c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // vh.y1
    public void setInvert(float f7) {
        this.a.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.b.f(f7, -1, -16777216));
    }

    public void setValue(boolean z10) {
        this.f = z10 ? 1.0f : 0.0f;
        invalidate();
    }
}
