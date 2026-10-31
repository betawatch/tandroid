package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sn0 extends FrameLayout {
    public int D;
    public int E;
    public dn0 F;
    public vg.f G;
    public vg.f H;
    public boolean I;
    public final Path J;
    public int K;
    public final nb0 a;
    public final s4.a0 b;
    public final x7 c;
    public int d;
    public final org.telegram.ui.Components.t5 e;
    public final ArrayList f;
    public fn0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public sn0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.J = new Path();
        this.K = TLObject.FLAG_31;
        nb0 nb0Var = new nb0(this, context, p6Var, 1);
        this.a = nb0Var;
        nb0Var.setClipToPadding(false);
        nb0Var.setClipChildren(false);
        nb0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        nb0Var.setOverScrollMode(2);
        nb0Var.setHorizontalScrollBarEnabled(false);
        nb0Var.setItemAnimator(null);
        s4.a0 a0Var = new s4.a0(0, false);
        this.b = a0Var;
        nb0Var.setLayoutManager(a0Var);
        x7 x7Var = new x7(this, 6);
        this.c = x7Var;
        nb0Var.setAdapter(x7Var);
        nb0Var.setOnItemClickListener(new g(this, 20));
        addView(nb0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.t5(nb0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.e(true, i10);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        nb0 nb0Var = this.a;
        if (!isEmpty) {
            int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
            if (z10) {
                nb0Var.y0(j10);
            } else {
                nb0Var.v0(j10);
            }
        }
        nb0Var.invalidate();
    }

    public final void b(int i10) {
        View m10 = this.b.m(i10);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i10 == this.d ? this.E : this.D);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rf.o.g(this.G, 0, 0, getWidth(), getHeight());
        rf.o.g(this.H, 0, 0, getWidth(), getHeight());
        (this.I ? this.H : this.G).draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = L;
        path.addRoundRect(f7, f7, i10 - L, i11 - L, org.telegram.messenger.i0.L(18.0f) - L, org.telegram.messenger.i0.L(18.0f) - L, Path.Direction.CW);
    }
}
