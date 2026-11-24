// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u31 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ gk7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(y31 y31Var, Context context) {
        super(context);
        this.e = y31Var;
        this.b = -1;
        this.c = new Rect();
        this.d = new lm(220L, this, s33.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                xl3 xl3Var = (xl3) this.d;
                Path path = (Path) this.c;
                x02 x02Var = (x02) this.e;
                il0 il0Var = x02Var.y2;
                if (il0Var != null) {
                    il0Var.setBounds(0, (int) x02Var.S3, getMeasuredWidth(), getMeasuredHeight());
                    il0Var.draw(canvas);
                }
                float L = gl.L(20.0f);
                int L2 = gl.L(7.0f);
                int L3 = gl.L(7.0f);
                RectF rectF = gl.P;
                float f = L2;
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, kk7.d4, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), gl.L(6.0f) + L2);
                xl3Var.s(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - gl.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                xl3Var.s(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                lm lmVar = (lm) this.d;
                y31 y31Var = (y31) this.e;
                float e = lmVar.e(false, y31Var.n.getWidth());
                Rect rect = (Rect) this.c;
                float f = e / 2.0f;
                rect.set((int) (width - (y31Var.n.getScaleX() * f)), (int) (((1.0f - y31Var.n.getScaleY()) * y31Var.n.getHeight()) + y31Var.n.getY()), (int) ((y31Var.n.getScaleX() * f) + width), (int) (y31Var.n.getY() + y31Var.n.getHeight()));
                y31Var.r.setBounds(rect);
                y31Var.r.draw(canvas);
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                int i5 = this.b;
                ImageView imageView = ((x02) this.e).v1;
                int top = i5 - imageView.getTop();
                super.onLayout(z, i, i2, i3, i4);
                this.b = getHeight();
                if (imageView.getVisibility() == 0 && getHeight() - imageView.getTop() != top) {
                    imageView.setTranslationY(imageView.getTranslationY() + ((getHeight() - imageView.getTop()) - top));
                    imageView.animate().translationY(0.0f).setDuration(320L).setInterpolator(s33.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                y31 y31Var = (y31) this.e;
                y31Var.n.measure(i, i2);
                invalidate();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.b, gl.L(36.0f) + y31Var.n.getMeasuredHeight()), TLObject.FLAG_30));
                if (this.b < 0) {
                    this.b = getMeasuredHeight();
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(x02 x02Var, Context context) {
        super(context);
        this.e = x02Var;
        this.c = new Path();
        this.d = new xl3((byte) 7);
    }
}
