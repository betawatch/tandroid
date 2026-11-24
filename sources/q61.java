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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q61 extends FrameLayout implements gk7 {
    public l61 a;
    public final wjb b;
    public final TextView c;
    public final hn d;
    public final be0 e;
    public boolean f;
    public boolean h;
    public wf2 n;

    public q61(Context context, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        zkb.X(textView, bkb.F6, wjbVar);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
        hn hnVar = new hn(context, true, true, !k96.a0);
        this.d = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        hnVar.setTextSize(gl.L(16.0f));
        hnVar.setGravity((k96.a0 ? 3 : 5) | 16);
        zkb.U(hnVar, bkb.H6, wjbVar);
        boolean z2 = k96.a0;
        addView(hnVar, nme.d(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.e = be0Var;
        be0Var.getAvatarDrawable().p = 0.8f;
        addView(be0Var, nme.d(38, 38.0f, (k96.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i != kk7.k4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(72.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public be0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public hn getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        hn hnVar = this.d;
        if (hnVar == null || hnVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) hnVar.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        int i3 = measuredWidth / 2;
        be0 be0Var = this.e;
        if (be0Var.getVisibility() == 0) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(38.0f), TLObject.FLAG_30));
        }
        hn hnVar = this.d;
        if (hnVar.getVisibility() == 0) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - hnVar.getMeasuredWidth()) - gl.L(8.0f);
        }
        int L = gl.L(12.0f) + hnVar.getMeasuredWidth();
        boolean z = k96.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        wf2 wf2Var = this.n;
        if (wf2Var != null) {
            wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
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
        hn hnVar = this.d;
        if (hnVar.getVisibility() == 0) {
            if (!z && this.h) {
                f = 0.5f;
            }
            hnVar.setAlpha(f);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
