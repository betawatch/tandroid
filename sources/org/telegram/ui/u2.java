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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public a3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final w70 e;
    public final f4 f;

    public u2(Context context, w70 w70Var, f4 f4Var) {
        super(context);
        this.e = w70Var;
        this.f = f4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.d3
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
        return org.telegram.messenger.wl.b(this);
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
        h4.v(this.e, canvas, this, 0);
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
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVTitle, h4.j(this.e, this.f, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        w70 w70Var = this.e;
        w70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                w70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                w70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                w70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            w70 w70Var2 = this.e;
            w70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            f4 f4Var = this.f;
            a3 p5 = h4.p(w70Var2, this, null, richText, dp, 0, pageblocktitle2, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.f);
            this.a = p5;
            if (p5 != null) {
                w70Var.getClass();
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
        return h4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
