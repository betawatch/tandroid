package rg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.pr;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d2 extends k {
    public boolean A0;
    public boolean B0;
    public final e6 C0;
    public final int q0;
    public boolean r0;
    public final e6 s0;
    public final iv0 t0;
    public final TextureView u0;
    public final Bitmap v0;
    public final Rect w0;
    public final Rect x0;
    public float y0;
    public final Path z0;

    public d2(Context context, PointF pointF, iv0 iv0Var, String str) {
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
        pr prVar = pr.h;
        this.C0 = new e6(this, 0L, 350L, prVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.t0 = iv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.v0 = decodeFile;
        if (decodeFile != null) {
            this.y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.u0 = textureView;
        addView(textureView, x5.c(-1.0f, -1));
        this.s0 = new e6(this, 0L, 500L, prVar);
        k();
        setWillNotDraw(false);
    }

    @Override // rg.k
    public final j a() {
        return new b2(this, getContext());
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
        float e7 = this.s0.e(this.r0);
        canvas.scale(1.0f - (e7 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, org.telegram.messenger.w1.A(1.0f, e7, 4.0f * e7, 0.25f));
        float e10 = this.C0.e(this.B0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.w0;
        Rect rect3 = this.x0;
        Bitmap bitmap2 = this.v0;
        Path path2 = this.z0;
        if (e10 < 1.0f) {
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
        path.addCircle(width, height, min * e10, Path.Direction.CW);
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

    public iv0 getBaseSize() {
        return this.t0;
    }

    @Override // rg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = wl.u(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(u10, wl.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override // rg.k
    public final void k() {
        iv0 iv0Var = this.t0;
        float f7 = iv0Var.a / 2.0f;
        float f10 = iv0Var.b / 2.0f;
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.u0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        iv0 iv0Var = this.t0;
        int i12 = (int) iv0Var.a;
        int i13 = (int) iv0Var.b;
        TextureView textureView = this.u0;
        if (textureView != null) {
            float f7 = this.y0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f7 >= 1.0f ? (int) (f7 * i13) : i12, TLObject.FLAG_30);
            float f10 = this.y0;
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? i13 : (int) (i12 / f10), TLObject.FLAG_30));
        }
        setMeasuredDimension(i12, i13);
    }

    public void setDraw(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            invalidate();
        }
    }
}
