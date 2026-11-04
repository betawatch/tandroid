package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s90 extends FrameLayout {
    public final /* synthetic */ t90 E;
    public final ImageView a;
    public final LinearLayout b;
    public final ci.ec c;
    public final org.telegram.ui.Components.h6 d;
    public final ImageView e;
    public final Switch f;
    public final org.telegram.ui.Components.wo h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(t90 t90Var, Context context) {
        super(context);
        this.E = t90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i3 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, null, mode);
        imageView.setVisibility(8);
        addView(imageView, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        ci.ec ecVar = new ci.ec(context, 29);
        this.c = ecVar;
        ecVar.setLines(1);
        ecVar.setSingleLine(true);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(ecVar, i10, null);
        ecVar.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        ecVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.d = h6Var;
        h6Var.b(0.35f, 200L, org.telegram.ui.Components.xq.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, null);
        h6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        if (org.telegram.messenger.bd.a0) {
            linearLayout.addView(imageView2, b8.mf.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(h6Var, b8.mf.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(ecVar, b8.mf.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(ecVar, b8.mf.p(-2, -2, 1.0f, 16));
            linearLayout.addView(h6Var, b8.mf.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, b8.mf.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, b8.mf.d(-1, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f = r32;
        r32.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.k6.M6;
        int i12 = org.telegram.ui.ActionBar.k6.N6;
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        r32.d(i11, i12, i13, i13);
        r32.setImportantForAccessibility(2);
        addView(r32, b8.mf.d(37, 50.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.h = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(true, false);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setVisibility(8);
        woVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.bd.a0;
        addView(woVar, b8.mf.d(21, 21.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r5 & org.telegram.tgnet.TLObject.FLAG_14) > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        if ((r5 & 4) > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i3) {
        boolean q10 = this.E.getUserConfig().q();
        int bitCount = Integer.bitCount(i3);
        if (q10) {
            if ((i3 & TLObject.FLAG_12) > 0) {
                bitCount--;
            }
            if ((i3 & TLObject.FLAG_13) > 0) {
                bitCount--;
            }
        } else {
            if ((i3 & 16) > 0) {
                bitCount--;
            }
            if ((i3 & 8) > 0) {
                bitCount--;
            }
        }
        if (org.telegram.messenger.az.o() < 1 && (i3 & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (org.telegram.messenger.az.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.a;
            }
            return (org.telegram.ui.Components.cz0.c() || (i3 & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i3) > 0) {
            bitCount--;
        }
        if (org.telegram.ui.Components.cz0.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            org.telegram.ui.Components.wo woVar = this.h;
            Switch r12 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z11) {
                imageView.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                r12.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                org.telegram.messenger.camera.q.k(woVar.animate(), z10 ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z10 ? 0.5f : 1.0f);
                linearLayout.setAlpha(z10 ? 0.5f : 1.0f);
                r12.setAlpha(z10 ? 0.5f : 1.0f);
                woVar.setAlpha(z10 ? 0.5f : 1.0f);
            }
            setEnabled(!z10);
        }
    }

    public final void c(o90 o90Var, boolean z10) {
        int d = org.telegram.messenger.lc.d(true);
        int i3 = o90Var.e;
        this.x = a(d & i3);
        this.y = a(i3);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z10 && !org.telegram.messenger.bd.a0) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.bd.a0;
        ci.ec ecVar = this.c;
        if (z10) {
            if (this.r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.k0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f)) + (ecVar.getTranslationX() < 0.0f ? org.telegram.messenger.g0.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                return;
            }
            return;
        }
        if (this.r) {
            float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.k0);
        }
        if (this.n) {
            canvas.drawLine(ecVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.wo woVar = this.h;
        accessibilityNodeInfo.setClassName(woVar.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (woVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(woVar.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c.getText());
        if (this.w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.bd.a0("Of", null, 2131747837, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
