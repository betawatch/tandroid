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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public f3 a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final p70 e;
    public final l4 f;

    public z2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.e = p70Var;
        this.f = l4Var;
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.a;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        f3 f3Var = this.a;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        f3 f3Var = this.a;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        f3 f3Var = this.a;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.a;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.a;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null || this.a == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        n4.v(this.e, canvas, this, 0);
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
        f3 f3Var = this.a;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVTitle, n4.j(this.e, this.f, f3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.e;
        p70Var.getClass();
        this.c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                p70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                p70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                p70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            p70 p70Var2 = this.e;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            l4 l4Var = this.f;
            f3 p10 = n4.p(p70Var2, this, null, richText, dp, 0, pageblocktitle2, (l4Var == null || !l4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.f);
            this.a = p10;
            if (p10 != null) {
                p70Var.getClass();
                i12 += this.a.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.a;
                f3Var.s = this.c;
                f3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return n4.l(this.e, this.f, motionEvent, this, this.a, this.c, this.d) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
