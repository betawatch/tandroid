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
public final class y2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public e3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final a70 e;
    public final j4 f;

    public y2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.e = a70Var;
        this.f = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.a;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        e3 e3Var = this.a;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        e3 e3Var = this.a;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        e3 e3Var = this.a;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.a;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.a;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        l4.v(this.e, canvas, this, 0);
        this.a.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        e3 e3Var = this.a;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVTitle, l4.j(this.e, this.f, e3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.e;
        a70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                a70Var.getClass();
                i11 = AndroidUtilities.dp(8);
                a70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                a70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            a70 a70Var2 = this.e;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            j4 j4Var = this.f;
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, 0, pageblocktitle2, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.f);
            this.a = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.a;
                e3Var.s = this.c;
                e3Var.v = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
