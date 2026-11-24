// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xz1 extends o39 {
    public final /* synthetic */ byte f3;
    public final Paint g3;
    public final Paint h3;
    public boolean i3;
    public boolean j3;
    public final Object k3;
    public final Object l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(Context context, byte b) {
        super(context, null);
        this.f3 = b;
        switch (b) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.g3 = paint;
                Paint paint2 = new Paint(1);
                this.h3 = paint2;
                this.k3 = new lm(this);
                this.l3 = new lm(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                break;
            default:
                s33 s33Var = s33.h;
                this.k3 = new fm0(320L, this, s33Var);
                this.l3 = new fm0(320L, this, s33Var);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gl.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gl.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.g3 = paint3;
                Paint paint4 = new Paint(1);
                this.h3 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                break;
        }
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Object obj = this.l3;
        Object obj2 = this.k3;
        switch (b) {
            case 0:
                this.j3 = false;
                this.i3 = false;
                super.dispatchDraw(canvas);
                ((fm0) obj2).a(this.i3, true);
                ((fm0) obj).a(this.j3, true);
                break;
            default:
                super.dispatchDraw(canvas);
                int e = (int) (((lm) obj2).e(false, this.i3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint = this.g3;
                paint.setAlpha(e);
                canvas.drawRect(0.0f, 0.0f, getWidth(), gl.L(8.0f), paint);
                int e2 = (int) (((lm) obj).e(false, this.j3 ? 1.0f : 0.0f) * 255.0f);
                Paint paint2 = this.h3;
                paint2.setAlpha(e2);
                canvas.save();
                canvas.translate(0.0f, getHeight() - gl.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), gl.L(8.0f), paint2);
                canvas.restore();
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 0:
                float x = view.getX();
                float width = view.getWidth() + x;
                boolean z = true;
                boolean z2 = x < ((float) gl.L(10.0f));
                boolean z3 = width > ((float) (getMeasuredWidth() - gl.L(10.0f)));
                if (!z2 && !z3) {
                    z = false;
                }
                this.i3 |= z2;
                this.j3 |= z3;
                canvas.save();
                if (z) {
                    canvas.clipRect(gl.L(19.0f), 0, getMeasuredWidth() - gl.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                if (z2) {
                    float L = gl.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), gl.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(ls6.B(1.0f, ((fm0) this.k3).e, gl.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z3) {
                    float measuredWidth = getMeasuredWidth() - gl.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - gl.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(tb4.A(1.0f, ((fm0) this.l3).e, gl.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.h3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        switch (this.f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.i3 || canScrollVertically2 != this.j3) {
                    this.i3 = canScrollVertically;
                    this.j3 = canScrollVertically2;
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                float f = 0.0f;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof s02) {
                        f = ((s02) childAt).a.d() + f;
                    }
                }
                int floor = (size <= f || childCount <= 0) ? 0 : (int) Math.floor((r1 - f) / childCount);
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    if (childAt2 instanceof s02) {
                        ((s02) childAt2).a.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
