// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sv extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f;

    public sv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override // ew
    public int getBoundLeft() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.h(this.a, 18.0f, cwVar.k() + cwVar.s);
    }

    @Override // ew
    public int getBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.C(this.a, 18.0f, cwVar.l() + cwVar.s);
    }

    @Override // ew
    public int getLastLineBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.C(this.a, 18.0f, cwVar.m() + cwVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ik8.a(this);
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        o.s(this.a, canvas, this, 0);
        this.c.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754858, o.g(this.a, this.b, cwVar)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sv svVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        this.d = hl.L(18.0f);
        xi5Var.getClass();
        this.e = hl.L(8.0f);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            xi5 xi5Var2 = this.a;
            int h = ik8.h(xi5Var2, 36.0f, size);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f;
            ex exVar = this.b;
            svVar = this;
            cw n = o.n(xi5Var2, svVar, null, richText, h, 0, pageblocksubtitle2, (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
            svVar.c = n;
            if (n != null) {
                xi5Var.getClass();
                i3 = svVar.c.d.getHeight() + hl.L(16.0f);
                cw cwVar = svVar.c;
                cwVar.s = svVar.d;
                cwVar.w = svVar.e;
            } else {
                i3 = 0;
            }
        } else {
            svVar = this;
            i3 = 1;
        }
        svVar.setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f = pageblocksubtitle;
        requestLayout();
    }
}
