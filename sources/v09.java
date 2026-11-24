// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v09 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public v09(Context context, boolean z) {
        super(context);
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(gm.L(20.0f));
        if (z) {
            anb.O(radioButton, cmb.C5, cmb.D5, null);
        } else {
            anb.O(radioButton, cmb.f7, cmb.g7, null);
        }
        boolean z2 = jb6.a0;
        addView(radioButton, qoe.d(22, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 0 : 20, 10.0f, z2 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z) {
            anb.X(textView, cmb.i5, null);
        } else {
            anb.X(textView, cmb.F6, null);
        }
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        boolean z3 = jb6.a0;
        addView(textView, qoe.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 23 : 61, 10.0f, z3 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z) {
            anb.X(textView2, cmb.p5, null);
        } else {
            anb.X(textView2, cmb.y6, null);
        }
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, gm.L(12.0f));
        boolean z4 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 17 : 61, 35.0f, z4 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z) {
        this.c.a(z, true);
    }

    public final void b(String str, String str2, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.setText(str2);
        this.c.a(z2, false);
        this.d = z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(gm.L(jb6.a0 ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - gm.L(jb6.a0 ? 60.0f : 0.0f), getHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
    }
}
