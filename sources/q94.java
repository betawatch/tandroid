// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q94 extends ViewGroup implements fn7 {
    public static final /* synthetic */ int e = 0;
    public final vnb a;
    public final TextView b;
    public final int c;
    public ArrayList d;

    public q94(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = vnbVar;
        this.c = i;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(ob6.M0(2131747989, null));
        textView.setTextSize(13.0f);
        textView.setTypeface(hl.o());
        textView.setIncludeFontPadding(false);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            getChildAt(i3).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jn7.e().n(this, jn7.l4);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(hl.L(14.0f), getHeight() - 1, getWidth() - hl.L(14.0f), getHeight() - 1, aob.j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(hl.L(14.0f), hl.L(10.0f), getWidth() - hl.L(14.0f), hl.L(24.0f));
        int L = hl.L(14.0f);
        int L2 = hl.L(32.0f);
        for (int i5 = 1; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (L > hl.L(14.0f) && childAt.getMeasuredWidth() + L > getWidth() - hl.L(14.0f)) {
                L = hl.L(14.0f);
                L2 = hl.L(34.0f) + L2;
            }
            int width = ob6.a0 ? (getWidth() - L) - childAt.getMeasuredWidth() : L;
            childAt.layout(width, L2, childAt.getMeasuredWidth() + width, hl.L(28.0f) + L2);
            L = uh9.w(5.0f, childAt.getMeasuredWidth(), L);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(28.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), TLObject.FLAG_30));
        int L2 = hl.L(32.0f);
        int i3 = 0;
        for (int i4 = 1; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
            if (i3 > 0 && childAt.getMeasuredWidth() + i3 > L) {
                L2 = hl.L(34.0f) + L2;
                i3 = 0;
            }
            i3 = uh9.w(5.0f, childAt.getMeasuredWidth(), i3);
        }
        setMeasuredDimension(size, hl.L(12.0f) + L2 + (getChildCount() > 1 ? hl.L(28.0f) : 0));
    }
}
