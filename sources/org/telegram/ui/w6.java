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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w6 extends FrameLayout implements org.telegram.messenger.fs {
    public r6 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final TextView c;
    public final org.telegram.ui.Components.n6 d;
    public final org.telegram.ui.Components.q9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.mp n;

    public w6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.b = i6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        boolean z10 = org.telegram.messenger.gd.a0;
        addView(textView, c8.ma.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, !org.telegram.messenger.gd.a0);
        this.d = n6Var;
        n6Var.b(0.55f, 320L, org.telegram.ui.Components.lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setGravity((org.telegram.messenger.gd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.I6, i6Var);
        boolean z11 = org.telegram.messenger.gd.a0;
        addView(n6Var, c8.ma.d(-2, -1.0f, (z11 ? 3 : 5) | 48, z11 ? 21.0f : 72.0f, 0.0f, z11 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.e = q9Var;
        q9Var.getAvatarDrawable().p = 0.8f;
        addView(q9Var, c8.ma.d(38, 38.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 != org.telegram.messenger.ks.k4 || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(org.telegram.messenger.gd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public org.telegram.ui.Components.n6 getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.c.getText());
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (n6Var == null || n6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) n6Var.getText());
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
        org.telegram.ui.Components.q9 q9Var = this.e;
        if (q9Var.getVisibility() == 0) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), TLObject.FLAG_30));
        }
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (n6Var.getVisibility() == 0) {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - n6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + n6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.gd.a0;
        TextView textView = this.c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        org.telegram.ui.Components.mp mpVar = this.n;
        if (mpVar != null) {
            mpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
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
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (n6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            n6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i7) {
        this.c.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.d.setTextColor(i7);
    }
}
