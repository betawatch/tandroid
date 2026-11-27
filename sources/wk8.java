// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wk8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final p66 c;
    public LinearLayout d;
    public final wu7 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ xk8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, wk8] */
    /* JADX WARN: Type inference failed for: r15v10, types: [dm8] */
    /* JADX WARN: Type inference failed for: r15v9, types: [lk8] */
    /* JADX WARN: Type inference failed for: r3v5, types: [yfc] */
    public wk8(xk8 xk8Var, Context context, int i) {
        super(context);
        lg0 lg0Var;
        this.n = xk8Var;
        byte b = 1;
        setOrientation(1);
        sl8 sl8Var = (sl8) xk8Var.n1.get(i);
        byte b2 = sl8Var.a;
        byte b3 = 0;
        if (b2 == 0) {
            lg0 rp3Var = new rp3(context, xk8Var.J0);
            rp3Var.b.setOnScrollListener(new qk8(xk8Var, b));
            lg0Var = rp3Var;
        } else if (b2 == 14 || b2 == 28) {
            lg0 m94Var = new m94(b2 == 28 ? 1 : 0, xk8Var.J0, context);
            m94Var.b.setOnScrollListener(new qk8(xk8Var, b3));
            lg0Var = m94Var;
        } else {
            lg0Var = b2 == 5 ? new rk8(context, xk8Var.a) : b2 == 10 ? new lk8(context, xk8Var.J0) : new yfc(context, xk8Var.w1, xk8Var.a, sl8Var.a, xk8Var.J0);
        }
        this.f = lg0Var;
        addView(lg0Var);
        this.e = lg0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i2 = aob.j5;
        qd4.w(textView, i2, xk8Var.J0, 1, 20.0f);
        addView(textView, tre.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        p66 p66Var = new p66(context, null);
        this.c = p66Var;
        p66Var.setGravity(1);
        p66Var.setTextSize(1, 15.0f);
        yob.X(p66Var, i2, xk8Var.J0);
        if (!xk8Var.y1) {
            p66Var.setLines(2);
        }
        addView(p66Var, tre.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j);
        }
        if (view instanceof lg0) {
            setTranslationY(0.0f);
            return super.drawChild(canvas, view, j);
        }
        setTranslationY(this.n.F1);
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z = viewGroup instanceof lg0;
        xk8 xk8Var = this.n;
        if (z) {
            ((lg0) viewGroup).setTopOffset(xk8Var.F1);
        }
        viewGroup.getLayoutParams().height = xk8Var.t1;
        p66 p66Var = this.c;
        p66Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = hl.L(16.0f);
            textView.setVisibility(8);
            p66Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
