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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public d3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final d70 e;
    public final j4 f;

    public x2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.e = d70Var;
        this.f = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.a;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        d3 d3Var = this.a;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        d3 d3Var = this.a;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        d3 d3Var = this.a;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.a;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.a;
        if (d3Var != null) {
            d3Var.detach(this);
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
        d3 d3Var = this.a;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVTitle, l4.j(this.e, this.f, d3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.e;
        d70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                d70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                d70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            d70 d70Var2 = this.e;
            d70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            j4 j4Var = this.f;
            d3 p5 = l4.p(d70Var2, this, null, richText, dp, 0, pageblocktitle2, (j4Var == null || !j4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.dx0.a(), 0, this.f);
            this.a = p5;
            if (p5 != null) {
                d70Var.getClass();
                i12 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.a;
                d3Var.s = this.c;
                d3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
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
