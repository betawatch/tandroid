package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x6 extends FrameLayout implements org.telegram.messenger.us {
    public s6 a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final TextView c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.g9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.ep n;

    public x6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = p6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, !org.telegram.messenger.cd.X);
        this.d = f6Var;
        f6Var.b(0.55f, 320L, org.telegram.ui.Components.gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setGravity((org.telegram.messenger.cd.X ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.I6, p6Var);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(f6Var, w7.b6.d(-2, -1.0f, (z11 ? 3 : 5) | 48, z11 ? 21.0f : 72.0f, 0.0f, z11 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.getAvatarDrawable().p = 0.8f;
        addView(g9Var, w7.b6.d(38, 38.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 != org.telegram.messenger.zs.i4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.c.getText());
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var == null || f6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) f6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var.getVisibility() == 0) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(38.0f), TLObject.FLAG_30));
        }
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var.getVisibility() == 0) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(8.0f);
        }
        int L = org.telegram.messenger.i0.L(12.0f) + f6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.cd.X;
        TextView textView = this.c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        org.telegram.ui.Components.ep epVar = this.n;
        if (epVar != null) {
            epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
        }
    }

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f7 = 1.0f;
        this.c.setAlpha((z10 || !this.h) ? 1.0f : 0.5f);
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f7 = 0.5f;
            }
            f6Var.setAlpha(f7);
        }
    }

    public void setTextColor(int i10) {
        this.c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
