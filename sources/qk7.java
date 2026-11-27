// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class qk7 extends FrameLayout {
    public final mm a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ sk7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk7(sk7 sk7Var, Context context) {
        super(context);
        this.e = sk7Var;
        this.a = new mm(250L, this, k43.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(aob.v0(aob.h5, sk7Var.J0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        sk7 sk7Var = this.e;
        Integer num = sk7Var.p1;
        int intValue = num != null ? num.intValue() : aob.v0(aob.h5, sk7Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = sk7Var.l1.getViewPages();
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f2 = this.d;
                if (view instanceof rk7) {
                    rk7 rk7Var = (rk7) view;
                    f = Math.max(0.0f, rk7Var.getHeight() - rk7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f2;
                view.getVisibility();
            }
        }
        float e = this.a.e(false, this.d <= ((float) hl.m) ? 1.0f : 0.0f);
        float max = Math.max(hl.m, this.d) - (hl.m * e);
        this.d = max;
        RectF rectF = hl.P;
        rectF.set(sk7Var.u0, max, getWidth() - sk7Var.u0, hl.L(8.0f) + getHeight());
        float U1 = hl.U1(e, hl.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (sk7Var.F != null) {
            sk7Var.F.setTranslationY(Math.max((sk7Var.b.getY() + this.d) + sk7Var.t0, sk7Var.F.getHeight() + (hl.L(56.0f) + hl.m)) - sk7Var.F.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.dismiss();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        sk7 sk7Var = this.e;
        FrameLayout frameLayout = sk7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
            i3 = sk7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        sk7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
