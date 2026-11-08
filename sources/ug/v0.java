package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final w70 c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ w0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, ug.v0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [ug.j1] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ug.n0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ug.t1] */
    public v0(w0 w0Var, Context context, int i7) {
        super(context);
        a aVar;
        this.n = w0Var;
        setOrientation(1);
        vs0 vs0Var = (vs0) w0Var.k1.get(i7);
        int i10 = vs0Var.a;
        if (i10 == 0) {
            a bVar = new b(context, w0Var.I0);
            bVar.b.setOnScrollListener(new r0(w0Var, 1));
            aVar = bVar;
        } else if (i10 == 14 || i10 == 28) {
            a iVar = new i(i10 == 28 ? 1 : 0, context, w0Var.I0);
            iVar.b.setOnScrollListener(new r0(w0Var, 0));
            aVar = iVar;
        } else {
            aVar = i10 == 5 ? new s0(context, w0Var.a) : i10 == 10 ? new n0(context, w0Var.I0) : new t1(context, w0Var.t1, w0Var.a, vs0Var.a, w0Var.I0);
        }
        this.f = aVar;
        addView(aVar);
        this.e = aVar;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = k6.j5;
        k5.n(textView, i11, w0Var.I0, 1, 20.0f);
        addView(textView, ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        this.c = w70Var;
        w70Var.setGravity(1);
        w70Var.setTextSize(1, 15.0f);
        r6.V(w70Var, i11, w0Var.I0);
        if (!w0Var.v1) {
            w70Var.setLines(2);
        }
        addView(w70Var, ha.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j3);
        }
        boolean z9 = view instanceof a;
        if (z9) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.C1);
        }
        if (z9) {
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
        boolean z9 = viewGroup instanceof a;
        w0 w0Var = this.n;
        if (z9) {
            ((a) viewGroup).setTopOffset(w0Var.C1);
        }
        viewGroup.getLayoutParams().height = w0Var.q1;
        w70 w70Var = this.c;
        w70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            w70Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
