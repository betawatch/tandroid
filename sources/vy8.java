// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class vy8 extends FrameLayout {
    public final TextView a;
    public final RadioButton b;
    public boolean c;

    public vy8(Context context, wjb wjbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.f7, bkb.g7, wjbVar);
        boolean z = k96.a0;
        addView(radioButton, nme.d(22, 22.0f, (z ? 3 : 5) | 48, z ? 22 : 0, 14.0f, z ? 0 : 22, 0.0f));
    }

    public final void a(boolean z, boolean z2) {
        this.b.a(z, z2);
    }

    public final void b(ArrayList arrayList, boolean z) {
        super.setEnabled(z);
        RadioButton radioButton = this.b;
        TextView textView = this.a;
        if (arrayList == null) {
            textView.setAlpha(z ? 1.0f : 0.5f);
            radioButton.setAlpha(z ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(radioButton, (Property<RadioButton, Float>) property, z ? 1.0f : 0.5f));
        }
    }

    public final void c(String str, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.a(z, false);
        this.c = z2;
        setWillNotDraw(!z2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setRadioIcon(Drawable drawable) {
        this.b.setIcon(drawable);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public vy8(Context context) {
        this(context, null);
    }
}
