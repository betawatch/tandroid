package yf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b2 extends j {
    public final int m0;
    public boolean n0;
    public final y5 o0;
    public final qu0 p0;
    public final TextureView q0;
    public final Bitmap r0;
    public final Rect s0;
    public final Rect t0;
    public float u0;
    public final Path v0;
    public boolean w0;
    public boolean x0;
    public final y5 y0;

    public b2(Context context, PointF pointF, qu0 qu0Var, String str) {
        super(context, pointF);
        this.m0 = -1;
        this.n0 = false;
        Rect rect = new Rect();
        this.s0 = rect;
        this.t0 = new Rect();
        this.u0 = 1.0f;
        this.v0 = new Path();
        this.w0 = true;
        this.x0 = true;
        gr grVar = gr.h;
        this.y0 = new y5(this, 0L, 350L, grVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.p0 = qu0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.r0 = decodeFile;
        if (decodeFile != null) {
            this.u0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.q0 = textureView;
        addView(textureView, e6.c(-1.0f, -1));
        this.o0 = new y5(this, 0L, 500L, grVar);
        k();
        setWillNotDraw(false);
    }

    @Override // yf.j
    public final i a() {
        return new z1(this, getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        if (!this.w0) {
            return false;
        }
        if (view != this.q0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float e10 = this.o0.e(this.n0);
        canvas.scale(1.0f - (e10 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e10, 4.0f * e10, 0.25f));
        float e11 = this.y0.e(this.x0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.s0;
        Rect rect3 = this.t0;
        Bitmap bitmap2 = this.r0;
        Path path2 = this.v0;
        if (e11 < 1.0f) {
            rect = rect3;
            bitmap = bitmap2;
            canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
            path2.rewind();
            path = path2;
            path.addCircle(width, height, min, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
        } else {
            rect = rect3;
            bitmap = bitmap2;
            path = path2;
        }
        canvas.save();
        path.rewind();
        path.addCircle(width, height, min * e11, Path.Direction.CW);
        canvas.clipPath(path);
        if (bitmap != null) {
            rect.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        boolean drawChild = ((getParent() instanceof d) && ((d) getParent()).a) ? true : super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    public int getAnchor() {
        return this.m0;
    }

    public qu0 getBaseSize() {
        return this.p0;
    }

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override // yf.j
    public final void k() {
        qu0 qu0Var = this.p0;
        float f10 = qu0Var.a / 2.0f;
        float f11 = qu0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        TextureView textureView = this.q0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i9) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.p0;
        int i11 = (int) qu0Var.a;
        int i12 = (int) qu0Var.b;
        TextureView textureView = this.q0;
        if (textureView != null) {
            float f10 = this.u0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i12) : i11, TLObject.FLAG_30);
            float f11 = this.u0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i12 : (int) (i11 / f11), TLObject.FLAG_30));
        }
        setMeasuredDimension(i11, i12);
    }

    public void setDraw(boolean z10) {
        if (this.w0 != z10) {
            this.w0 = z10;
            invalidate();
        }
    }
}
