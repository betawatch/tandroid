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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u2 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final o70 a;
    public final j4 b;
    public d3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f;

    public u2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.a = o70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        d3 d3Var = this.c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        d3 d3Var = this.c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        d3 d3Var = this.c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        l4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.a, this.b, d3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        o70 o70Var = this.a;
        o70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        o70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            o70 o70Var2 = this.a;
            o70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f;
            j4 j4Var = this.b;
            d3 p10 = l4.p(o70Var2, this, null, richText, dp, 0, pageblocksubtitle2, (j4Var == null || !j4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
            this.c = p10;
            if (p10 != null) {
                o70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.c;
                d3Var.s = this.d;
                d3Var.v = this.e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f = pageblocksubtitle;
        requestLayout();
    }
}
