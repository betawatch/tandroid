package qh;

import android.animation.ValueAnimator;
import android.content.Context;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class ma extends View implements b2 {
    public final Path a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public final org.telegram.ui.Components.z5 e;
    public Drawable f;
    public Bitmap h;
    public int n;
    public ValueAnimator r;

    public ma(Context context) {
        super(context);
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(3);
        this.c = paint2;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 380L, pr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(lc0 lc0Var, boolean z4) {
        if (this.f == lc0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (!z4) {
            setDrawable(lc0Var);
            return;
        }
        this.r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        this.r.addUpdateListener(new eg.q(this, new AtomicBoolean(), lc0Var, 3));
        this.r.start();
    }

    public final void b(boolean z4, boolean z10) {
        this.d = z4;
        if (!z10) {
            this.e.d(z4 ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        float e6 = this.e.e(this.d);
        int intrinsicWidth = this.f.getIntrinsicWidth();
        int intrinsicHeight = this.f.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e6 <= 0.0f) {
            this.f.setBounds(rect);
            this.f.draw(canvas);
        } else if (e6 < 1.0f) {
            canvas.save();
            Path path = this.a;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e6, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            this.f.setBounds(rect);
            this.f.draw(canvas);
            canvas.restore();
        }
        if (e6 > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e6, this.b);
            canvas.save();
            Bitmap bitmap = this.h;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.c);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null || this.n == 0) {
            return;
        }
        this.h = BitmapFactory.decodeResource(getResources(), this.n);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i10) {
        this.f = getContext().getResources().getDrawable(i10).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i10 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i10);
        }
        invalidate();
    }

    @Override // qh.b2
    public void setInvert(float f10) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.b.setColor(i0.a.d(f10, -1, -16777216));
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        this.d = z4;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
