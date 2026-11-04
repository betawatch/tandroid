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
public final class u2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public a3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final i50 e;
    public final g4 f;

    public u2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.e = i50Var;
        this.f = g4Var;
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.s;
        this.e.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.s;
        this.e.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.s;
        this.e.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.a;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.a;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        i4.t(this.e, canvas, this, 0);
        this.a.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754853, i4.h(this.e, this.f, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.e;
        i50Var.getClass();
        this.c = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                i50Var.getClass();
                i11 = org.telegram.messenger.g0.L(8);
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(16);
            } else {
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            i50 i50Var2 = this.e;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            g4 g4Var = this.f;
            a3 n4 = i4.n(i50Var2, this, null, richText, L, 0, pageblocktitle2, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.f);
            this.a = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 += this.a.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.a;
                a3Var.s = this.c;
                a3Var.w = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return i4.j(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
