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
public final class t1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f;

    public t1(Context context, i50 i50Var, g4 g4Var) {
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
        int k10 = a3Var.k() + a3Var.s;
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.s;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.s;
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
        if (this.f == null) {
            return;
        }
        a3 a3Var = this.c;
        i50 i50Var = this.a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.t(i50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754865, i4.h(this.a, this.b, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockFooter pageblockfooter = this.f;
        if (pageblockfooter != null) {
            int i12 = pageblockfooter.level;
            i50 i50Var = this.a;
            i11 = 0;
            if (i12 == 0) {
                i50Var.getClass();
                this.e = org.telegram.messenger.g0.L(8);
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.e = 0;
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f.text;
            i50 i50Var2 = this.a;
            i50Var2.getClass();
            int L2 = (size - org.telegram.messenger.g0.L(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f;
            g4 g4Var = this.b;
            a3 n4 = i4.n(i50Var2, this, null, richText, L2, 0, pageblockfooter2, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
            this.c = n4;
            if (n4 != null) {
                int height = n4.d.getHeight();
                if (this.f.level > 0) {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                a3 a3Var = this.c;
                a3Var.s = this.d;
                a3Var.w = this.e;
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

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f = pageblockfooter;
        requestLayout();
    }
}
