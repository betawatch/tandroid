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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y6 extends FrameLayout implements org.telegram.messenger.cs {
    public t6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final TextView c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.k9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.wo n;

    public y6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        boolean z10 = org.telegram.messenger.bd.a0;
        addView(textView, b8.mf.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, !org.telegram.messenger.bd.a0);
        this.d = h6Var;
        h6Var.b(0.55f, 320L, org.telegram.ui.Components.xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity((org.telegram.messenger.bd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.I6, e6Var);
        boolean z11 = org.telegram.messenger.bd.a0;
        addView(h6Var, b8.mf.d(-2, -1.0f, (z11 ? 3 : 5) | 48, z11 ? 21.0f : 72.0f, 0.0f, z11 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.e = k9Var;
        k9Var.getAvatarDrawable().p = 0.8f;
        addView(k9Var, b8.mf.d(38, 38.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TextView textView;
        if (i3 != org.telegram.messenger.hs.i4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.bd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.c.getText());
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var == null || h6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) h6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.k9 k9Var = this.e;
        if (k9Var.getVisibility() == 0) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30));
        }
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var.getVisibility() == 0) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + h6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.bd.a0;
        TextView textView = this.c;
        if (z10) {
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

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f10 = 1.0f;
        this.c.setAlpha((z10 || !this.h) ? 1.0f : 0.5f);
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            h6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i3) {
        this.c.setTextColor(i3);
    }

    public void setTextValueColor(int i3) {
        this.d.setTextColor(i3);
    }
}
