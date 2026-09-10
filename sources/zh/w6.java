package zh;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class w6 extends View {
    public boolean E;
    public long F;
    public final Path G;
    public final k5 H;
    public final org.telegram.ui.Components.d6 a;
    public final TL_stories.MediaArea b;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f;
    public final Matrix h;
    public final org.telegram.ui.Cells.z n;
    public final xc r;
    public final boolean s;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public w6(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z10 = true;
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(1174405119, 2, -1);
        this.n = f02;
        this.r = new xc(this);
        this.s = false;
        this.v = false;
        this.E = false;
        this.G = new Path();
        this.H = new k5(this, 7);
        this.b = mediaArea;
        boolean z11 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        this.s = z11 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue) || (mediaArea instanceof TL_stories.TL_mediaAreaUrl);
        this.v = z11 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue);
        if (!z11 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z10 = false;
        }
        this.w = z10;
        this.y = z10;
        this.x = z10;
        this.a = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (this.y) {
            float innerRadius = getInnerRadius();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            int width = getWidth();
            int height = getHeight();
            org.telegram.ui.Cells.z zVar = this.n;
            zVar.setBounds(0, 0, width, height);
            zVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.n;
        xc xcVar = this.r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                xcVar.f = new ru(1, view);
            }
            xcVar.c(true);
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xcVar.c(false);
            zVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        return (!(getParent() instanceof View) || (mediaArea = this.b) == null || (mediaAreaCoordinates = mediaArea.coordinates) == null) ? getMeasuredHeight() * 0.2f : (mediaAreaCoordinates.flags & 1) != 0 ? (float) (((mediaAreaCoordinates.radius / 100.0d) * getWidth()) / getScaleX()) : getMeasuredHeight() * 0.2f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float innerRadius = getInnerRadius();
        b(canvas);
        if (this.v && this.E && this.e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = (System.currentTimeMillis() - this.F) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.E = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.e;
            Paint paint = this.c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float dpf2 = AndroidUtilities.dpf2(1.5f);
            paint2.setStrokeWidth(dpf2);
            float f7 = dpf2 / 2.0f;
            rectF.inset(f7, f7);
            float f10 = innerRadius - f7;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void a(Canvas canvas) {
    }
}
