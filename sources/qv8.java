// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qv8 extends FrameLayout {
    public final /* synthetic */ sv8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv8(sv8 sv8Var, Context context) {
        super(context);
        this.a = sv8Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        sv8 sv8Var = this.a;
        pm3 pm3Var = sv8Var.M;
        RectF rectF = sv8Var.N;
        RectF rectF2 = sv8Var.O;
        frc frcVar = sv8Var.r;
        if (view == frcVar && sv8Var.K > 0.0f) {
            rectF2.set(0.0f, 0.0f, frcVar.getWidth(), frcVar.getHeight());
            frcVar.getMatrix().mapRect(rectF2);
            rectF2.offset(frcVar.getLeft(), frcVar.getTop());
            rectF2.inset(-hl.L(4.0f), -hl.L(4.0f));
            float L = hl.L(28.0f);
            if (rectF2.top < sv8Var.K + L && rectF2.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(rectF2, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                rectF.set(rectF2.left, rectF2.top, rectF2.right, Math.min(rectF2.bottom, sv8Var.K));
                if (rectF.height() > 0.0f) {
                    canvas.drawRect(rectF, pm3Var.w(1.0f, 1));
                }
                float f = rectF2.left;
                float f2 = sv8Var.K;
                rectF.set(f, f2, rectF2.right, L + f2);
                pm3Var.r(canvas, rectF, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        sv8 sv8Var = this.a;
        TextView textView = sv8Var.x;
        ir8 ir8Var = sv8Var.w;
        frc frcVar = sv8Var.r;
        getLocationOnScreen(sv8Var.W);
        int i5 = sv8Var.I.a;
        int width = getWidth();
        mq5 mq5Var = sv8Var.I;
        int g = ik8.g(width - mq5Var.a, mq5Var.c, 2, i5);
        int height = ((getHeight() - sv8Var.I.d) - hl.L(16.0f)) - (sv8Var.c() ? ir8Var.getMeasuredHeight() : 0);
        ir8Var.layout(g - (ir8Var.getMeasuredWidth() / 2), height, ((ir8Var.getMeasuredWidth() + 1) / 2) + g, ir8Var.getMeasuredHeight() + height);
        int L = hl.L(36.0f) + Math.max(sv8Var.I.b, hl.m);
        textView.layout(g - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + g, textView.getMeasuredHeight() + L);
        sv8Var.d();
        int measuredHeight = (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + hl.L(12.0f) : 0) + hl.L(24.0f) + Math.max(sv8Var.I.b, hl.m);
        int max = Math.max(measuredHeight, Math.min(Math.max(measuredHeight, (height - hl.L(24.0f)) - frcVar.getMeasuredHeight()), (getHeight() - frcVar.getMeasuredHeight()) / 2));
        int measuredWidth = g - (frcVar.getMeasuredWidth() / 2);
        frcVar.layout(measuredWidth, max, frcVar.getMeasuredWidth() + measuredWidth, frcVar.getMeasuredHeight() + max);
        sv8Var.s.layout(0, 0, getWidth(), getHeight());
        sv8Var.n.layout(0, 0, getWidth(), getHeight());
        uk0.c(sv8Var.F, this);
        sv8Var.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        sv8 sv8Var = this.a;
        frc frcVar = sv8Var.r;
        mq5 mq5Var = sv8Var.I;
        int max = Math.max(1, (size - mq5Var.a) - mq5Var.c);
        sv8Var.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - hl.L(24.0f)), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
        TextView textView = sv8Var.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - hl.L(48.0f)), TLObject.FLAG_31), 0);
        int min = Math.min(hl.L(420.0f), Math.max(1, max - hl.L(24.0f)));
        int max2 = Math.max(1, (((size2 - Math.max(sv8Var.I.b, hl.m)) - sv8Var.I.d) - hl.L(sv8Var.c() ? 120.0f : 48.0f)) - (textView.getVisibility() == 0 ? textView.getMeasuredHeight() + hl.L(12.0f) : 0));
        frcVar.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), 0);
        if (frcVar.getMeasuredHeight() > max2) {
            int paddingRight = frcVar.getPaddingRight() + frcVar.getPaddingLeft();
            int paddingBottom = frcVar.getPaddingBottom() + frcVar.getPaddingTop();
            frcVar.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max2 - paddingBottom) * (min - paddingRight)) / Math.max(1, frcVar.getMeasuredHeight() - paddingBottom)) + paddingRight), TLObject.FLAG_30), 0);
        }
        sv8Var.s.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        sv8Var.n.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }
}
