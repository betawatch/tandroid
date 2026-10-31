package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;

    public k(Context context) {
        super(context);
        setPadding(i0.L(22.0f), 0, i0.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.j5, null);
        textView.setGravity(cd.X ? 5 : 3);
        addView(textView, b6.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        a7.V(textView2, t6.q5, null);
        textView2.setGravity(cd.X ? 5 : 3);
        addView(textView2, b6.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), t6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(56.0f), TLObject.FLAG_30));
    }
}
