// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class rt1 extends d79 implements j6b {
    public final /* synthetic */ zu1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt1(zu1 zu1Var, Context context, xu1 xu1Var) {
        super(context, xu1Var);
        this.f3 = zu1Var;
    }

    @Override // j6b
    public final void b(int[] iArr) {
        zu1 zu1Var = this.f3;
        iArr[0] = ((int) zu1Var.P9) - hl.L(4.0f);
        iArr[1] = uh9.f(3.0f, zu1Var.A0.getPaddingBottom(), zu1Var.A0.getMeasuredHeight());
    }
}
