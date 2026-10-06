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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class v2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public b3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final t70 e;
    public final g4 f;

    public v2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.e = t70Var;
        this.f = g4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.a;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        b3 b3Var = this.a;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        b3 b3Var = this.a;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        b3 b3Var = this.a;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.a;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.a;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        i4.v(this.e, canvas, this, 0);
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
        b3 b3Var = this.a;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVTitle, i4.j(this.e, this.f, b3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.e;
        t70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                t70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                t70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            t70 t70Var2 = this.e;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            g4 g4Var = this.f;
            b3 p5 = i4.p(t70Var2, this, null, richText, dp, 0, pageblocktitle2, (g4Var == null || !g4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.gx0.a(), 0, this.f);
            this.a = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.a;
                b3Var.s = this.c;
                b3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return i4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
