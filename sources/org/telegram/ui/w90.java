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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w90 extends FrameLayout {
    public final /* synthetic */ x90 E;
    public final ImageView a;
    public final LinearLayout b;
    public final di.tb c;
    public final org.telegram.ui.Components.h6 d;
    public final ImageView e;
    public final Switch f;
    public final org.telegram.ui.Components.fp h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(x90 x90Var, Context context) {
        super(context);
        this.E = x90Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i7 = org.telegram.ui.ActionBar.j6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, null, mode);
        imageView.setVisibility(8);
        addView(imageView, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        di.tb tbVar = new di.tb(context, 29);
        this.c = tbVar;
        tbVar.setLines(1);
        tbVar.setSingleLine(true);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        tbVar.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(tbVar, i10, null);
        tbVar.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        tbVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.d = h6Var;
        h6Var.b(0.35f, 200L, org.telegram.ui.Components.er.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, null);
        h6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        if (org.telegram.messenger.hd.a0) {
            linearLayout.addView(imageView2, c8.ja.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(h6Var, c8.ja.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(tbVar, c8.ja.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(tbVar, c8.ja.p(-2, -2, 1.0f, 16));
            linearLayout.addView(h6Var, c8.ja.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, c8.ja.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f = r32;
        r32.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.j6.M6;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        r32.d(i11, i12, i13, i13);
        r32.setImportantForAccessibility(2);
        addView(r32, c8.ja.d(37, 50.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(21, context, null);
        this.h = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(true, false);
        fpVar.setDrawBackgroundAsArc(10);
        fpVar.setVisibility(8);
        fpVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(fpVar, c8.ja.d(21, 21.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
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
    public final int a(int i7) {
        boolean q10 = this.E.getUserConfig().q();
        int bitCount = Integer.bitCount(i7);
        if (q10) {
            if ((i7 & TLObject.FLAG_12) > 0) {
                bitCount--;
            }
            if ((i7 & TLObject.FLAG_13) > 0) {
                bitCount--;
            }
        } else {
            if ((i7 & 16) > 0) {
                bitCount--;
            }
            if ((i7 & 8) > 0) {
                bitCount--;
            }
        }
        if (org.telegram.messenger.gz.o() < 1 && (i7 & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (org.telegram.messenger.gz.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.a;
            }
            return (org.telegram.ui.Components.fz0.c() || (i7 & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i7) > 0) {
            bitCount--;
        }
        if (org.telegram.ui.Components.fz0.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            org.telegram.ui.Components.fp fpVar = this.h;
            Switch r12 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z11) {
                imageView.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                r12.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                org.telegram.messenger.i20.m(fpVar.animate(), z10 ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z10 ? 0.5f : 1.0f);
                linearLayout.setAlpha(z10 ? 0.5f : 1.0f);
                r12.setAlpha(z10 ? 0.5f : 1.0f);
                fpVar.setAlpha(z10 ? 0.5f : 1.0f);
            }
            setEnabled(!z10);
        }
    }

    public final void c(s90 s90Var, boolean z10) {
        int d = org.telegram.messenger.qc.d(true);
        int i7 = s90Var.e;
        this.x = a(d & i7);
        this.y = a(i7);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z10 && !org.telegram.messenger.hd.a0) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.hd.a0;
        di.tb tbVar = this.c;
        if (z10) {
            if (this.r) {
                float L = org.telegram.messenger.g0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.k0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - org.telegram.messenger.g0.L(64.0f)) + (tbVar.getTranslationX() < 0.0f ? org.telegram.messenger.g0.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
                return;
            }
            return;
        }
        if (this.r) {
            float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f);
            canvas.drawRect(measuredWidth - org.telegram.messenger.g0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f)) / 2.0f, measuredWidth, (org.telegram.messenger.g0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.k0);
        }
        if (this.n) {
            canvas.drawLine(tbVar.getTranslationX() + org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.fp fpVar = this.h;
        accessibilityNodeInfo.setClassName(fpVar.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (fpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(fpVar.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c.getText());
        if (this.w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.hd.a0("Of", null, 2131747829, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
