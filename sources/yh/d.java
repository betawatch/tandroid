package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends FrameLayout implements k6 {
    public final g9 a;
    public final p6 b;
    public final TextView c;
    public final TextView d;

    public d(Context context, p6 p6Var) {
        super(context);
        this.b = p6Var;
        g9 g9Var = new g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(i0.L(20.0f));
        addView(g9Var, b6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(i0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, b6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(i0.L(2.0f), 1.0f);
        addView(textView2, b6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.z6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = t6.S0;
        g9 g9Var = this.a;
        rf.o.a(canvas, drawable, (g9Var.getWidth() / 2.0f) + g9Var.getLeft(), (g9Var.getHeight() / 2.0f) + g9Var.getTop(), g9Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(218.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = t6.G6;
        p6 p6Var = this.b;
        this.c.setTextColor(t6.w0(i10, p6Var));
        this.d.setTextColor(t6.w0(t6.z6, p6Var));
    }
}
