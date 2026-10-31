package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public z2 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final m60 e;
    public final f4 f;

    public t2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.e = m60Var;
        this.f = f4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.s;
        this.e.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.s;
        this.e.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.s;
        this.e.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.a;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.a;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.a;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        h4.t(this.e, canvas, this, 0);
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
        z2 z2Var = this.a;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754853, h4.h(this.e, this.f, z2Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.e;
        m60Var.getClass();
        this.c = org.telegram.messenger.i0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                m60Var.getClass();
                i12 = org.telegram.messenger.i0.L(8);
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L(16);
            } else {
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            m60 m60Var2 = this.e;
            m60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            f4 f4Var = this.f;
            z2 n10 = h4.n(m60Var2, this, null, richText, L, 0, pageblocktitle2, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.f);
            this.a = n10;
            if (n10 != null) {
                m60Var.getClass();
                i12 += this.a.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.a;
                z2Var.s = this.c;
                z2Var.w = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.j(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
