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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sp0 extends FrameLayout {
    public int E;
    public dp0 F;
    public eh.d G;
    public eh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final m10 a;
    public final s4.c0 b;
    public final c8 c;
    public int d;
    public final org.telegram.ui.Components.h6 e;
    public final ArrayList f;
    public fp0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public final Paint w;
    public int x;
    public int y;

    public sp0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.J = new Path();
        this.K = TLObject.FLAG_31;
        m10 m10Var = new m10(this, context, u6Var, 2);
        this.a = m10Var;
        m10Var.setClipToPadding(false);
        m10Var.setClipChildren(false);
        m10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        m10Var.setOverScrollMode(2);
        m10Var.setHorizontalScrollBarEnabled(false);
        m10Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.b = c0Var;
        m10Var.setLayoutManager(c0Var);
        c8 c8Var = new c8(this, 5);
        this.c = c8Var;
        m10Var.setAdapter(c8Var);
        m10Var.setOnItemClickListener(new h(this, 21));
        addView(m10Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.h6(m10Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        m10 m10Var = this.a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                m10Var.y0(clamp);
            } else {
                m10Var.v0(clamp);
            }
        }
        m10Var.invalidate();
    }

    public final void b(int i10) {
        View m10 = this.b.m(i10);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i10 == this.d ? this.E : this.y);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ag.v.g(this.G, 0, 0, getWidth(), getHeight());
        ag.v.g(this.H, 0, 0, getWidth(), getHeight());
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
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
