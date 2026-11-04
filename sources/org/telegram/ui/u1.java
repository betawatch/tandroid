package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public int d;
    public int e;
    public TL_iv.PageBlock f;

    public u1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + this.d;
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + this.d;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + this.d;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        i4.t(this.a, canvas, this, 0);
        this.c.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754863, i4.h(this.a, this.b, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.a;
        i50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        i50Var.getClass();
        this.e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            i50 i50Var2 = this.a;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f;
            g4 g4Var = this.b;
            a3 n4 = i4.n(i50Var2, this, null, richText, L, 0, pageBlock2, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
            this.c = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 = this.c.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.c;
                a3Var.s = this.d;
                a3Var.w = this.e;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return i4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f = pageBlock;
        requestLayout();
    }
}
