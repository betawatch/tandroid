package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s1 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final r50 a;
    public final e4 b;
    public z2 c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f;

    public s1(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.a = r50Var;
        this.b = e4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.s;
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        z2 z2Var = this.c;
        r50 r50Var = this.a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            g4.t(r50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, r50Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754865, g4.h(this.a, this.b, z2Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockFooter pageblockfooter = this.f;
        if (pageblockfooter != null) {
            int i12 = pageblockfooter.level;
            r50 r50Var = this.a;
            i11 = 0;
            if (i12 == 0) {
                r50Var.getClass();
                this.e = org.telegram.messenger.g0.L(8);
                r50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.e = 0;
                r50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f.text;
            r50 r50Var2 = this.a;
            r50Var2.getClass();
            int L2 = (size - org.telegram.messenger.g0.L(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f;
            e4 e4Var = this.b;
            z2 n10 = g4.n(r50Var2, this, null, richText, L2, 0, pageblockfooter2, (e4Var == null || !e4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.nu0.a(), 0, this.b);
            this.c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f.level > 0) {
                    r50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    r50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                z2 z2Var = this.c;
                z2Var.s = this.d;
                z2Var.w = this.e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return g4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f = pageblockfooter;
        requestLayout();
    }
}
