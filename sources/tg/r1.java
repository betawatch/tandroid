package tg;

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
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r1 extends j {
    public boolean A0;
    public boolean B0;
    public final w5 C0;
    public final int q0;
    public boolean r0;
    public final w5 s0;
    public final ot0 t0;
    public final TextureView u0;
    public final Bitmap v0;
    public final Rect w0;
    public final Rect x0;
    public float y0;
    public final Path z0;

    public r1(Context context, PointF pointF, ot0 ot0Var, String str) {
        super(context, pointF);
        this.q0 = -1;
        this.r0 = false;
        Rect rect = new Rect();
        this.w0 = rect;
        this.x0 = new Rect();
        this.y0 = 1.0f;
        this.z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        xq xqVar = xq.h;
        this.C0 = new w5(this, 0L, 350L, xqVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.t0 = ot0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.v0 = decodeFile;
        if (decodeFile != null) {
            this.y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.u0 = textureView;
        addView(textureView, ha.c(-1.0f, -1));
        this.s0 = new w5(this, 0L, 500L, xqVar);
        k();
        setWillNotDraw(false);
    }

    @Override // tg.j
    public final i a() {
        return new p1(this, getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        if (!this.A0) {
            return false;
        }
        if (view != this.u0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float d = this.s0.d(this.r0);
        canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, k5.A(1.0f, d, 4.0f * d, 0.25f));
        float d2 = this.C0.d(this.B0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.w0;
        Rect rect3 = this.x0;
        Bitmap bitmap2 = this.v0;
        Path path2 = this.z0;
        if (d2 < 1.0f) {
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
            super.drawChild(canvas, view, j3);
            canvas.restore();
        } else {
            rect = rect3;
            bitmap = bitmap2;
            path = path2;
        }
        canvas.save();
        path.rewind();
        path.addCircle(width, height, min * d2, Path.Direction.CW);
        canvas.clipPath(path);
        if (bitmap != null) {
            rect.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        boolean drawChild = ((getParent() instanceof d) && ((d) getParent()).a) ? true : super.drawChild(canvas, view, j3);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    public int getAnchor() {
        return this.q0;
    }

    public ot0 getBaseSize() {
        return this.t0;
    }

    @Override // tg.j
    public li0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new li0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new li0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // tg.j
    public final void k() {
        ot0 ot0Var = this.t0;
        float f10 = ot0Var.a / 2.0f;
        float f11 = ot0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextureView textureView = this.u0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i7) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ot0 ot0Var = this.t0;
        int i11 = (int) ot0Var.a;
        int i12 = (int) ot0Var.b;
        TextureView textureView = this.u0;
        if (textureView != null) {
            float f10 = this.y0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i12) : i11, TLObject.FLAG_30);
            float f11 = this.y0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i12 : (int) (i11 / f11), TLObject.FLAG_30));
        }
        setMeasuredDimension(i11, i12);
    }

    public void setDraw(boolean z9) {
        if (this.A0 != z9) {
            this.A0 = z9;
            invalidate();
        }
    }
}
