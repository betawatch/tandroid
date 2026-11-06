package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class yd extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.q5 b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public yd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, org.telegram.messenger.qs.E1, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        f10.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, f6Var);
        f10.addView(textView2, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.b = q5Var;
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setTextSize(1, 13.0f);
        addView(q5Var, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            Paint d = f6Var != null ? f6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d != null) {
                canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(17.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }
}
