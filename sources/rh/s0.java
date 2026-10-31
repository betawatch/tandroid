package rh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s0 extends gh.c implements fe.e {
    public static final /* synthetic */ int w = 0;
    public final fe.f f;
    public final ph.h1 h;
    public final gh.b[] n;
    public final org.telegram.ui.ActionBar.p6 r;
    public int s;

    public s0(Context context, org.telegram.ui.ActionBar.p6 p6Var, ph.h1 h1Var) {
        super(context);
        this.f = new fe.f(0, this, gr.h, 1600L);
        this.h = h1Var;
        this.r = p6Var;
        int i10 = org.telegram.ui.ActionBar.t6.Kl;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.09411765f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.t6.r1(0.1254902f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.e.setColor(r12);
        int i11 = 0;
        this.n = new gh.b[]{gh.b.c(context, p6Var, gh.a.G, 2131749634), gh.b.c(context, p6Var, gh.a.w, 2131749651), gh.b.c(context, p6Var, gh.a.J, 2131749632)};
        int i12 = 0;
        while (true) {
            gh.b[] bVarArr = this.n;
            if (i12 >= bVarArr.length) {
                bVarArr[0].f(true, false);
                return;
            } else {
                this.a.addView(bVarArr[i12], w7.b6.l(1.0f, 0, -1));
                this.n[i12].setOnClickListener(new r0(this, i12, i11));
                i12++;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.s;
        if (i11 != i10) {
            gh.b[] bVarArr = this.n;
            bVarArr[i11].f(false, true);
            bVarArr[i10].f(true, true);
            this.s = i10;
            this.f.a(i10);
            this.h.a(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f.f;
        float W1 = org.telegram.messenger.i0.W1(f7 / 3.0f, org.telegram.messenger.i0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f));
        float W12 = org.telegram.messenger.i0.W1((f7 + 1.0f) / 3.0f, org.telegram.messenger.i0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f));
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
        Rect rect = this.c;
        rect.set((int) W1, org.telegram.messenger.i0.L(8.0f), (int) W12, measuredHeight);
        int L = org.telegram.messenger.i0.L(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -L;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        b();
        invalidate();
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
