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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x71 extends FrameLayout implements jm7 {
    public s71 a;
    public final ylb b;
    public final TextView c;
    public final io d;
    public final bf0 e;
    public boolean f;
    public boolean h;
    public jh2 n;

    public x71(Context context, ylb ylbVar) {
        super(context);
        this.b = ylbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        anb.X(textView, cmb.F6, ylbVar);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
        io ioVar = new io(context, true, true, !jb6.a0);
        this.d = ioVar;
        ioVar.b(0.55f, 320L, d53.h);
        ioVar.setTextSize(gm.L(16.0f));
        ioVar.setGravity((jb6.a0 ? 3 : 5) | 16);
        anb.U(ioVar, cmb.H6, ylbVar);
        boolean z2 = jb6.a0;
        addView(ioVar, qoe.d(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        bf0Var.getAvatarDrawable().p = 0.8f;
        addView(bf0Var, qoe.d(38, 38.0f, (jb6.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i != nm7.m4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(72.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public bf0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public io getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        io ioVar = this.d;
        if (ioVar == null || ioVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) ioVar.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(34.0f);
        int i3 = measuredWidth / 2;
        bf0 bf0Var = this.e;
        if (bf0Var.getVisibility() == 0) {
            bf0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(38.0f), TLObject.FLAG_30));
        }
        io ioVar = this.d;
        if (ioVar.getVisibility() == 0) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - ioVar.getMeasuredWidth()) - gm.L(8.0f);
        }
        int L = gm.L(12.0f) + ioVar.getMeasuredWidth();
        boolean z = jb6.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        jh2 jh2Var = this.n;
        if (jh2Var != null) {
            jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30));
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
        io ioVar = this.d;
        if (ioVar.getVisibility() == 0) {
            if (!z && this.h) {
                f = 0.5f;
            }
            ioVar.setAlpha(f);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
