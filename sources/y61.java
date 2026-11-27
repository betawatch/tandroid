// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class y61 extends FrameLayout implements fn7 {
    public t61 a;
    public final vnb b;
    public final TextView c;
    public final in d;
    public final de0 e;
    public boolean f;
    public boolean h;
    public og2 n;

    public y61(Context context, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        yob.X(textView, aob.G6, vnbVar);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
        in inVar = new in(context, true, true, !ob6.a0);
        this.d = inVar;
        inVar.b(0.55f, 320L, k43.h);
        inVar.setTextSize(hl.L(16.0f));
        inVar.setGravity((ob6.a0 ? 3 : 5) | 16);
        yob.U(inVar, aob.I6, vnbVar);
        boolean z2 = ob6.a0;
        addView(inVar, tre.d(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.e = de0Var;
        de0Var.getAvatarDrawable().p = 0.8f;
        addView(de0Var, tre.d(38, 38.0f, (ob6.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i != jn7.l4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(72.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    public de0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public in getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        in inVar = this.d;
        if (inVar == null || inVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) inVar.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - hl.L(34.0f);
        int i3 = measuredWidth / 2;
        de0 de0Var = this.e;
        if (de0Var.getVisibility() == 0) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(38.0f), TLObject.FLAG_30));
        }
        in inVar = this.d;
        if (inVar.getVisibility() == 0) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - inVar.getMeasuredWidth()) - hl.L(8.0f);
        }
        int L = hl.L(12.0f) + inVar.getMeasuredWidth();
        boolean z = ob6.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        og2 og2Var = this.n;
        if (og2Var != null) {
            og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30));
        }
    }

    public void setCanDisable(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = 1.0f;
        this.c.setAlpha((z || !this.h) ? 1.0f : 0.5f);
        in inVar = this.d;
        if (inVar.getVisibility() == 0) {
            if (!z && this.h) {
                f = 0.5f;
            }
            inVar.setAlpha(f);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
