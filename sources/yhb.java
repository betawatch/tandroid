// default package

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yhb extends FrameLayout {
    public TextView a;
    public TextView b;
    public RadioButton c;
    public boolean d;
    public int e;
    public float f;
    public boolean h;
    public byte n;

    static {
        new pm("animationProgress", (byte) 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        this.f = f;
        getMeasuredWidth();
        gl.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.c.a(false, false);
        this.d = z;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = gl.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z);
    }

    public final void c() {
        RadioButton radioButton = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        byte b = this.n;
        boolean z = this.h;
        boolean z2 = k96.a0;
        if (z == z2) {
            return;
        }
        this.h = z2;
        textView2.setGravity((z2 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z3 = k96.a0;
        layoutParams.gravity = (z3 ? 5 : 3) | 48;
        layoutParams.leftMargin = gl.L(z3 ? b : 64.0f);
        layoutParams.rightMargin = gl.L(k96.a0 ? 64.0f : b);
        textView2.setLayoutParams(layoutParams);
        textView.setGravity(k96.a0 ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z4 = k96.a0;
        layoutParams2.gravity = (z4 ? 5 : 3) | 48;
        layoutParams2.leftMargin = gl.L(z4 ? b : 64.0f);
        layoutParams2.rightMargin = gl.L(k96.a0 ? 64.0f : b);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (k96.a0 ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(64.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TextView textView = this.b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.c;
        accessibilityNodeInfo.setChecked(radioButton.f);
        accessibilityNodeInfo.setContentDescription(k96.M0(radioButton.f ? 2131747699 : 2131747701, null));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.b.getVisibility() == 0 ? 64.0f : this.e) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        clearAnimation();
        super.setBackgroundColor(i);
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setHeight(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
