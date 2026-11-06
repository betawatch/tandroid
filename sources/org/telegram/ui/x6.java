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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x6 extends FrameLayout implements org.telegram.messenger.ls {
    public s6 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final TextView c;
    public final org.telegram.ui.Components.j6 d;
    public final org.telegram.ui.Components.l9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.wo n;

    public x6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = f6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        boolean z9 = org.telegram.messenger.hd.a0;
        addView(textView, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 21.0f : 72.0f, 0.0f, z9 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !org.telegram.messenger.hd.a0);
        this.d = j6Var;
        j6Var.b(0.55f, 320L, org.telegram.ui.Components.xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.I6, f6Var);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(j6Var, c8.ha.d(-2, -1.0f, (z10 ? 3 : 5) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.e = l9Var;
        l9Var.getAvatarDrawable().p = 0.8f;
        addView(l9Var, c8.ha.d(38, 38.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 != org.telegram.messenger.qs.i4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.c.getText());
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var == null || j6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) j6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.l9 l9Var = this.e;
        if (l9Var.getVisibility() == 0) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30));
        }
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + j6Var.getMeasuredWidth();
        boolean z9 = org.telegram.messenger.hd.a0;
        TextView textView = this.c;
        if (z9) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        org.telegram.ui.Components.wo woVar = this.n;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
    }

    public void setCanDisable(boolean z9) {
        this.h = z9;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        float f10 = 1.0f;
        this.c.setAlpha((z9 || !this.h) ? 1.0f : 0.5f);
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var.getVisibility() == 0) {
            if (!z9 && this.h) {
                f10 = 0.5f;
            }
            j6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i7) {
        this.c.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.d.setTextColor(i7);
    }
}
