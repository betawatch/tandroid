package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ss0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final z70 c;
    public LinearLayout d;
    public final m0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ x0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, ug.w0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [ug.k1] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ug.o0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ug.w1] */
    public w0(x0 x0Var, Context context, int i7) {
        super(context);
        a aVar;
        this.n = x0Var;
        setOrientation(1);
        ss0 ss0Var = (ss0) x0Var.o1.get(i7);
        int i10 = ss0Var.a;
        if (i10 == 0) {
            a bVar = new b(context, x0Var.J0);
            bVar.b.setOnScrollListener(new s0(x0Var, 1));
            aVar = bVar;
        } else if (i10 == 14 || i10 == 28) {
            a iVar = new i(i10 == 28 ? 1 : 0, context, x0Var.J0);
            iVar.b.setOnScrollListener(new s0(x0Var, 0));
            aVar = iVar;
        } else {
            aVar = i10 == 5 ? new t0(context, x0Var.a) : i10 == 10 ? new o0(context, x0Var.J0) : new w1(context, x0Var.x1, x0Var.a, ss0Var.a, x0Var.J0);
        }
        this.f = aVar;
        addView(aVar);
        this.e = aVar;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = j6.j5;
        k5.m(textView, i11, x0Var.J0, 1, 20.0f);
        addView(textView, ja.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        z70 z70Var = new z70(context, null);
        this.c = z70Var;
        z70Var.setGravity(1);
        z70Var.setTextSize(1, 15.0f);
        q6.U(z70Var, i11, x0Var.J0);
        if (!x0Var.z1) {
            z70Var.setLines(2);
        }
        addView(z70Var, ja.t(-1, -2, 1, 21, 10, 21, 16));
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
        x0 x0Var = this.n;
        if (z10) {
            ((a) viewGroup).setTopOffset(x0Var.G1);
        }
        viewGroup.getLayoutParams().height = x0Var.u1;
        z70 z70Var = this.c;
        z70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            z70Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
