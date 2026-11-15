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
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r1 extends j {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public final u5 D0;
    public final int r0;
    public boolean s0;
    public final u5 t0;
    public final nt0 u0;
    public final TextureView v0;
    public final Bitmap w0;
    public final Rect x0;
    public final Rect y0;
    public float z0;

    public r1(Context context, PointF pointF, nt0 nt0Var, String str) {
        super(context, pointF);
        this.r0 = -1;
        this.s0 = false;
        Rect rect = new Rect();
        this.x0 = rect;
        this.y0 = new Rect();
        this.z0 = 1.0f;
        this.A0 = new Path();
        this.B0 = true;
        this.C0 = true;
        er erVar = er.h;
        this.D0 = new u5(this, 0L, 350L, erVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.u0 = nt0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.w0 = decodeFile;
        if (decodeFile != null) {
            this.z0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.v0 = textureView;
        addView(textureView, ja.c(-1.0f, -1));
        this.t0 = new u5(this, 0L, 500L, erVar);
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
        if (!this.B0) {
            return false;
        }
        if (view != this.v0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float d = this.t0.d(this.s0);
        canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, k5.A(1.0f, d, 4.0f * d, 0.25f));
        float d2 = this.D0.d(this.C0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.x0;
        Rect rect3 = this.y0;
        Bitmap bitmap2 = this.w0;
        Path path2 = this.A0;
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
        return this.r0;
    }

    public nt0 getBaseSize() {
        return this.u0;
    }

    @Override // tg.j
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new pi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        return new pi0(x10, i20.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // tg.j
    public final void k() {
        nt0 nt0Var = this.u0;
        float f10 = nt0Var.a / 2.0f;
        float f11 = nt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextureView textureView = this.v0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i7) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.u0;
        int i11 = (int) nt0Var.a;
        int i12 = (int) nt0Var.b;
        TextureView textureView = this.v0;
        if (textureView != null) {
            float f10 = this.z0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i12) : i11, TLObject.FLAG_30);
            float f11 = this.z0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i12 : (int) (i11 / f11), TLObject.FLAG_30));
        }
        setMeasuredDimension(i11, i12);
    }

    public void setDraw(boolean z10) {
        if (this.B0 != z10) {
            this.B0 = z10;
            invalidate();
        }
    }
}
