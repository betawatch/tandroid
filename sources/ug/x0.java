package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.f3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final m80 c;
    public LinearLayout d;
    public final n0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ y0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, ug.x0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [ug.m1] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ug.p0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ug.w1] */
    public x0(y0 y0Var, Context context, int i7) {
        super(context);
        a aVar;
        this.n = y0Var;
        setOrientation(1);
        ws0 ws0Var = (ws0) y0Var.o1.get(i7);
        int i10 = ws0Var.a;
        if (i10 == 0) {
            a bVar = new b(context, y0Var.J0);
            bVar.b.setOnScrollListener(new t0(y0Var, 1));
            aVar = bVar;
        } else if (i10 == 14 || i10 == 28) {
            a iVar = new i(i10 == 28 ? 1 : 0, context, y0Var.J0);
            iVar.b.setOnScrollListener(new t0(y0Var, 0));
            aVar = iVar;
        } else {
            aVar = i10 == 5 ? new u0(context, y0Var.a) : i10 == 10 ? new p0(context, y0Var.J0) : new w1(context, y0Var.x1, y0Var.a, ws0Var.a, y0Var.J0);
        }
        this.f = aVar;
        addView(aVar);
        this.e = aVar;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = m6.j5;
        f3.l(textView, i11, y0Var.J0, 1, 20.0f);
        addView(textView, ma.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        m80 m80Var = new m80(context, null);
        this.c = m80Var;
        m80Var.setGravity(1);
        m80Var.setTextSize(1, 15.0f);
        t6.U(m80Var, i11, y0Var.J0);
        if (!y0Var.z1) {
            m80Var.setLines(2);
        }
        addView(m80Var, ma.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j3);
        }
        boolean z10 = view instanceof a;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.G1);
        }
        if (z10) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof a;
        y0 y0Var = this.n;
        if (z10) {
            ((a) viewGroup).setTopOffset(y0Var.G1);
        }
        viewGroup.getLayoutParams().height = y0Var.u1;
        m80 m80Var = this.c;
        m80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            m80Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
