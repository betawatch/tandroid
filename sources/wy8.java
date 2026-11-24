// default package

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wy8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public byte d;

    public wy8(Context context, wjb wjbVar) {
        super(context);
        this.d = (byte) 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.C5, bkb.D5, wjbVar);
        boolean z = k96.a0;
        addView(radioButton, nme.d(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 18, 14.0f, z ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.i5, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z2 = k96.a0;
        addView(textView, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 51, 13.0f, z2 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.x6, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((k96.a0 ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z3 = k96.a0;
        addView(textView2, nme.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 51, 37.0f, z3 ? 51 : 21, 0.0f));
    }

    public final void a(int i, int i2) {
        this.c.b(i, i2);
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.a.setText(charSequence);
        this.b.setVisibility(8);
        this.c.a(z, false);
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
        int i3;
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - gl.L(72.0f), TLObject.FLAG_30), i2);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        int L = gl.L(this.d);
        if (textView.getVisibility() == 0) {
            i3 = textView.getMeasuredHeight() + gl.L(4.0f);
        } else {
            i3 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i3, TLObject.FLAG_30));
    }
}
