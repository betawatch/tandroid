package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public z2 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final o50 e;
    public final e4 f;

    public t2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.e = o50Var;
        this.f = e4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.s;
        this.e.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.s;
        this.e.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.s;
        this.e.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
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
        g4.t(this.e, canvas, this, 0);
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
        accessibilityNodeInfo.setText(g4.g(2131754853, g4.h(this.e, this.f, z2Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.e;
        o50Var.getClass();
        this.c = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                o50Var.getClass();
                i11 = org.telegram.messenger.g0.L(8);
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L(16);
            } else {
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            o50 o50Var2 = this.e;
            o50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            e4 e4Var = this.f;
            z2 n10 = g4.n(o50Var2, this, null, richText, L, 0, pageblocktitle2, (e4Var == null || !e4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.mu0.a(), 0, this.f);
            this.a = n10;
            if (n10 != null) {
                o50Var.getClass();
                i11 += this.a.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.a;
                z2Var.s = this.c;
                z2Var.w = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return g4.j(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
