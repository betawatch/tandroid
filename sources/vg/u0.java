package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.ls0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final s70 c;
    public LinearLayout d;
    public final k0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ v0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, vg.u0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [vg.m1] */
    /* JADX WARN: Type inference failed for: r15v9, types: [vg.m0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [vg.w1] */
    public u0(v0 v0Var, Context context, int i3) {
        super(context);
        a aVar;
        this.n = v0Var;
        setOrientation(1);
        ls0 ls0Var = (ls0) v0Var.l1.get(i3);
        int i10 = ls0Var.a;
        if (i10 == 0) {
            a bVar = new b(context, v0Var.J0);
            bVar.b.setOnScrollListener(new q0(v0Var, 1));
            aVar = bVar;
        } else if (i10 == 14 || i10 == 28) {
            a iVar = new i(i10 == 28 ? 1 : 0, context, v0Var.J0);
            iVar.b.setOnScrollListener(new q0(v0Var, 0));
            aVar = iVar;
        } else {
            aVar = i10 == 5 ? new r0(context, v0Var.a) : i10 == 10 ? new m0(context, v0Var.J0) : new w1(context, v0Var.u1, v0Var.a, ls0Var.a, v0Var.J0);
        }
        this.f = aVar;
        addView(aVar);
        this.e = aVar;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = k6.j5;
        k5.n(textView, i11, v0Var.J0, 1, 20.0f);
        addView(textView, mf.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        s70 s70Var = new s70(context, null);
        this.c = s70Var;
        s70Var.setGravity(1);
        s70Var.setTextSize(1, 15.0f);
        r6.V(s70Var, i11, v0Var.J0);
        if (!v0Var.w1) {
            s70Var.setLines(2);
        }
        addView(s70Var, mf.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view instanceof a;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.D1);
        }
        if (z10) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof a;
        v0 v0Var = this.n;
        if (z10) {
            ((a) viewGroup).setTopOffset(v0Var.D1);
        }
        viewGroup.getLayoutParams().height = v0Var.r1;
        s70 s70Var = this.c;
        s70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i3, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            s70Var.setVisibility(8);
            super.onMeasure(i3, i10);
        }
    }
}
