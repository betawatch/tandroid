// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p38 extends d79 {
    public final /* synthetic */ boolean f3;
    public final /* synthetic */ a48 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p38(a48 a48Var, Context context, vnb vnbVar, int i) {
        super(context, vnbVar);
        this.g3 = a48Var;
        this.f3 = i;
    }

    @Override // d79
    public final Integer X0(int i) {
        a48 a48Var = this.g3;
        if ((i < a48Var.c0 || i >= a48Var.d0) && (i < a48Var.e0 || i >= a48Var.f0)) {
            return super.X0(i);
        }
        return 0;
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a48 a48Var = this.g3;
        g48 g48Var = a48Var.F;
        if (!a48Var.H || g48Var == null || a48Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(g48Var.getLeft() + a48Var.G.getLeft(), a48Var.G.getTop());
        g48Var.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a48 a48Var = this.g3;
        a48Var.h();
        if (a48Var.L != null) {
            if (a48Var.K == null || !a48Var.b()) {
                return;
            }
            a48Var.K.o(false);
            return;
        }
        h48 h48Var = a48Var.q0;
        axa axaVar = this.f3 ? h48Var.c : h48Var.b;
        if (axaVar == null || !a48Var.b()) {
            return;
        }
        axaVar.a();
    }
}
