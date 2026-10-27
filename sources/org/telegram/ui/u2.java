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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public a3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final j70 e;
    public final h4 f;

    public u2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.e = j70Var;
        this.f = h4Var;
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return d3.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.a;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.a;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        j4.v(this.e, canvas, this, 0);
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
        a3 a3Var = this.a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVTitle, j4.j(this.e, this.f, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        j70 j70Var = this.e;
        j70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                j70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                j70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                j70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            j70 j70Var2 = this.e;
            j70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            h4 h4Var = this.f;
            a3 p10 = j4.p(j70Var2, this, null, richText, dp, 0, pageblocktitle2, (h4Var == null || !h4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.qx0.a(), 0, this.f);
            this.a = p10;
            if (p10 != null) {
                j70Var.getClass();
                i12 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.a;
                a3Var.s = this.c;
                a3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
