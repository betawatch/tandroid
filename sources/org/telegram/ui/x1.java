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
public final class x1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final d70 a;
    public final j4 b;
    public d3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f;

    public x1(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.a = d70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
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
        int c10 = d3Var.c() + d3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
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
        if (this.f == null) {
            return;
        }
        d3 d3Var = this.c;
        d70 d70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, d70Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVFooter, l4.j(this.a, this.b, d3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            d70 d70Var = this.a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f.text;
            d70 d70Var2 = this.a;
            d70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f;
            j4 j4Var = this.b;
            d3 p5 = l4.p(d70Var2, this, null, richText, dp2, 0, pageblockfooter2, (j4Var == null || !j4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.dx0.a(), 0, this.b);
            this.c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f.level > 0) {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.c;
                d3Var.s = this.d;
                d3Var.v = this.e;
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

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f = pageblockfooter;
        requestLayout();
    }
}
