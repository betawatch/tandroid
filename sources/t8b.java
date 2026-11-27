// default package

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
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class t8b extends View {
    public final boolean E;
    public boolean F;
    public long G;
    public final Path H;
    public final s8b I;
    public final mm a;
    public final TL_stories.MediaArea b;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f;
    public final Matrix h;
    public final hf0 n;
    public final v41 r;
    public final boolean s;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public t8b(Context context, FrameLayout frameLayout, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z = true;
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        hf0 f0 = aob.f0(1174405119, 2, -1);
        this.n = f0;
        this.r = new v41(this);
        this.s = false;
        this.w = false;
        this.F = false;
        this.H = new Path();
        this.I = new s8b(this, (byte) 0);
        this.b = mediaArea;
        boolean z2 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        this.s = z2 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue) || (mediaArea instanceof TL_stories.TL_mediaAreaUrl);
        this.w = z2 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue);
        if (!z2 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z = false;
        }
        this.x = z;
        this.E = z;
        this.y = z;
        this.a = new mm(frameLayout, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f0.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (this.E) {
            float innerRadius = getInnerRadius();
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.H;
            path.rewind();
            path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            int width = getWidth();
            int height = getHeight();
            hf0 hf0Var = this.n;
            hf0Var.setBounds(0, 0, width, height);
            hf0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        hf0 hf0Var = this.n;
        v41 v41Var = this.r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                v41Var.f = new vc(view, (byte) 6);
            }
            v41Var.c(true);
            hf0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            hf0Var.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            v41Var.c(false);
            hf0Var.setState(new int[0]);
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
        if (this.w && this.F && this.e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = (System.currentTimeMillis() - this.G) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.F = false;
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
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float N = hl.N(1.5f);
            paint2.setStrokeWidth(N);
            float f = N / 2.0f;
            rectF.inset(f, f);
            float f2 = innerRadius - f;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
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
