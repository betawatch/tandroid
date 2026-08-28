package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f;

    public z1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.e, this.f);
        l4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVKicker, l4.j(this.a, this.b, e3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.a;
        a70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f = AndroidUtilities.dp(16.0f);
                i11 = AndroidUtilities.dp(8.0f);
            } else {
                this.f = AndroidUtilities.dp(8.0f);
                i11 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            a70 a70Var2 = this.a;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i12 = this.f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            j4 j4Var = this.b;
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, i12, pageblockkicker2, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
            this.c = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 += this.c.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.c;
                e3Var.s = this.e;
                e3Var.v = this.f;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
