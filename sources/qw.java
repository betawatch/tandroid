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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qw extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f;

    public qw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override // dx
    public int getBoundLeft() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.h(this.a, 18.0f, bxVar.k() + bxVar.s);
    }

    @Override // dx
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.l() + bxVar.s);
    }

    @Override // dx
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
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
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754862, o.g(this.a, this.b, bxVar)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        qw qwVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        this.d = gm.L(18.0f);
        ui5Var.getClass();
        this.e = gm.L(8.0f);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            ui5 ui5Var2 = this.a;
            int h = wi8.h(ui5Var2, 36.0f, size);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f;
            ey eyVar = this.b;
            qwVar = this;
            bx n = o.n(ui5Var2, qwVar, null, richText, h, 0, pageblocksubheader2, (eyVar == null || !eyVar.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), 0, this.b);
            qwVar.c = n;
            if (n != null) {
                int height = n.d.getHeight() + qwVar.e;
                int i4 = qwVar.e;
                i3 = height + i4;
                bx bxVar = qwVar.c;
                bxVar.s = qwVar.d;
                bxVar.w = i4;
            } else {
                i3 = 0;
            }
        } else {
            qwVar = this;
            i3 = 1;
        }
        qwVar.setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f = pageblocksubheader;
        requestLayout();
    }
}
