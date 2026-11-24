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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rv extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f;

    public rv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override // dw
    public int getBoundLeft() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.h(this.a, 18.0f, bwVar.k() + bwVar.s);
    }

    @Override // dw
    public int getBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.C(this.a, 18.0f, bwVar.l() + bwVar.s);
    }

    @Override // dw
    public int getLastLineBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.C(this.a, 18.0f, bwVar.m() + bwVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ug8.a(this);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
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
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754862, o.g(this.a, this.b, bwVar)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        rv rvVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        this.d = gl.L(18.0f);
        vg5Var.getClass();
        this.e = gl.L(8.0f);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            vg5 vg5Var2 = this.a;
            int h = ug8.h(vg5Var2, 36.0f, size);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f;
            dx dxVar = this.b;
            rvVar = this;
            bw n = o.n(vg5Var2, rvVar, null, richText, h, 0, pageblocksubtitle2, (dxVar == null || !dxVar.H) ? Layout.Alignment.ALIGN_NORMAL : lwa.a(), 0, this.b);
            rvVar.c = n;
            if (n != null) {
                vg5Var.getClass();
                i3 = rvVar.c.d.getHeight() + gl.L(16.0f);
                bw bwVar = rvVar.c;
                bwVar.s = rvVar.d;
                bwVar.w = rvVar.e;
            } else {
                i3 = 0;
            }
        } else {
            rvVar = this;
            i3 = 1;
        }
        rvVar.setMeasuredDimension(size, i3);
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
