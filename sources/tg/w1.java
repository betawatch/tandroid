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
import c8.na;
import org.telegram.messenger.f3;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w1 extends n {
    public float A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public final c6 E0;
    public final int s0;
    public boolean t0;
    public final c6 u0;
    public final xt0 v0;
    public final TextureView w0;
    public final Bitmap x0;
    public final Rect y0;
    public final Rect z0;

    public w1(Context context, PointF pointF, xt0 xt0Var, String str) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        Rect rect = new Rect();
        this.y0 = rect;
        this.z0 = new Rect();
        this.A0 = 1.0f;
        this.B0 = new Path();
        this.C0 = true;
        this.D0 = true;
        kr krVar = kr.h;
        this.E0 = new c6(this, 0L, 350L, krVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.v0 = xt0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.x0 = decodeFile;
        if (decodeFile != null) {
            this.A0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.w0 = textureView;
        addView(textureView, na.c(-1.0f, -1));
        this.u0 = new c6(this, 0L, 500L, krVar);
        k();
        setWillNotDraw(false);
    }

    @Override // tg.n
    public final m a() {
        return new u1(this, getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        if (!this.C0) {
            return false;
        }
        if (view != this.w0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float d = this.u0.d(this.t0);
        canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, f3.A(1.0f, d, 4.0f * d, 0.25f));
        float d2 = this.E0.d(this.D0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.y0;
        Rect rect3 = this.z0;
        Bitmap bitmap2 = this.x0;
        Path path2 = this.B0;
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
        boolean drawChild = ((getParent() instanceof h) && ((h) getParent()).a) ? true : super.drawChild(canvas, view, j3);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    public int getAnchor() {
        return this.s0;
    }

    public xt0 getBaseSize() {
        return this.v0;
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.n
    public final void k() {
        xt0 xt0Var = this.v0;
        float f10 = xt0Var.a / 2.0f;
        float f11 = xt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextureView textureView = this.w0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i7) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        xt0 xt0Var = this.v0;
        int i11 = (int) xt0Var.a;
        int i12 = (int) xt0Var.b;
        TextureView textureView = this.w0;
        if (textureView != null) {
            float f10 = this.A0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i12) : i11, TLObject.FLAG_30);
            float f11 = this.A0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i12 : (int) (i11 / f11), TLObject.FLAG_30));
        }
        setMeasuredDimension(i11, i12);
    }

    public final boolean q() {
        return this.t0;
    }

    public void setDraw(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            invalidate();
        }
    }
}
