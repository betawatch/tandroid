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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public c3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final f70 e;
    public final i4 f;

    public w2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.e = f70Var;
        this.f = i4Var;
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.a;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override // org.telegram.ui.f3
    public int getBoundLeft() {
        c3 c3Var = this.a;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.f3
    public int getBoundRight() {
        c3 c3Var = this.a;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.f3
    public int getLastLineBoundRight() {
        c3 c3Var = this.a;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.a;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.a;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        k4.v(this.e, canvas, this, 0);
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
        c3 c3Var = this.a;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVTitle, k4.j(this.e, this.f, c3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        f70 f70Var = this.e;
        f70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                f70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                f70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                f70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            f70 f70Var2 = this.e;
            f70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            i4 i4Var = this.f;
            c3 p5 = k4.p(f70Var2, this, null, richText, dp, 0, pageblocktitle2, (i4Var == null || !i4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ix0.a(), 0, this.f);
            this.a = p5;
            if (p5 != null) {
                f70Var.getClass();
                i12 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.a;
                c3Var.s = this.c;
                c3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return k4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
