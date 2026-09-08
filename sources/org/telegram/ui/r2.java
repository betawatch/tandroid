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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 a;
    public final g4 b;
    public b3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f;

    public r2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        i4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.a, this.b, b3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        v70 v70Var = this.a;
        v70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        v70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            v70 v70Var2 = this.a;
            v70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f;
            g4 g4Var = this.b;
            b3 p5 = i4.p(v70Var2, this, null, richText, dp, 0, pageblocksubheader2, (g4Var == null || !g4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a(), 0, this.b);
            this.c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                b3 b3Var = this.c;
                b3Var.s = this.d;
                b3Var.v = i13;
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
        return i4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f = pageblocksubheader;
        requestLayout();
    }
}
