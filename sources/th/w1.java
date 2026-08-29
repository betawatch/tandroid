package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w1 extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public final Paint b;
    public final Path c;
    public final RectF d;
    public final Outline e;
    public boolean f;

    public w1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f = true;
        this.a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (g6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), g6.l1(0.1f, -16777216));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float radius;
        boolean z10 = this.f;
        Drawable drawable = this.a;
        Path path = this.c;
        if (z10) {
            Outline outline = this.e;
            path.reset();
            Rect bounds = getBounds();
            RectF rectF = this.d;
            rectF.set(bounds);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    drawable.getOutline(outline);
                    radius = outline.getRadius();
                } catch (Throwable unused) {
                }
                if (radius <= 0.0f) {
                    path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
                } else {
                    path.addRect(rectF, Path.Direction.CW);
                }
                this.f = false;
            }
            radius = -1.0f;
            if (radius <= 0.0f) {
            }
            this.f = false;
        }
        canvas.drawPath(path, this.b);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        this.f = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f9, float f10) {
        this.a.setHotspot(f9, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
