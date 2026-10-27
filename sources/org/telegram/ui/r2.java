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
public final class r2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final j70 a;
    public final h4 b;
    public a3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f;

    public r2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.a = j70Var;
        this.b = h4Var;
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return d3.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        j4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVHeading, j4.j(this.a, this.b, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        j70 j70Var = this.a;
        j70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        j70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            j70 j70Var2 = this.a;
            j70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f;
            h4 h4Var = this.b;
            a3 p10 = j4.p(j70Var2, this, null, richText, dp, 0, pageblocksubtitle2, (h4Var == null || !h4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.qx0.a(), 0, this.b);
            this.c = p10;
            if (p10 != null) {
                j70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.c;
                a3Var.s = this.d;
                a3Var.v = this.e;
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
        return j4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f = pageblocksubtitle;
        requestLayout();
    }
}
