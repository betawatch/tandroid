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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class w1 extends View implements org.telegram.ui.Cells.q9, d3 {
    public final u70 a;
    public final f4 b;
    public a3 c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f;

    public w1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.a = u70Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.Cells.q9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.d3
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
        return org.telegram.messenger.rk.a(this);
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
        if (this.d == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.e, this.f);
        h4.v(this.a, canvas, this, 0);
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
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVKicker, h4.j(this.a, this.b, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        u70 u70Var = this.a;
        u70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            u70 u70Var2 = this.a;
            u70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            f4 f4Var = this.b;
            a3 p5 = h4.p(u70Var2, this, null, richText, dp, i13, pageblockkicker2, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.uw0.a(), 0, this.b);
            this.c = p5;
            if (p5 != null) {
                u70Var.getClass();
                i12 += this.c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.c;
                a3Var.s = this.e;
                a3Var.v = this.f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
