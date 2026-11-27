// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tza extends b0b {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ e0b p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tza(e0b e0bVar, Context context, vnb vnbVar, boolean z, int i) {
        super(context, vnbVar);
        this.p0 = e0bVar;
        this.n0 = z;
        this.o0 = i;
    }

    @Override // b0b
    public final void e(int i) {
        long j = i;
        e0b e0bVar = this.p0;
        e0bVar.J0(j);
        c51 c51Var = e0bVar.w1;
        if (c51Var != null) {
            c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131744704, ob6.E(j, ',')), e0bVar.M1), true, true);
        }
        if (this.n0) {
            m96 m96Var = e0bVar.A1;
            m96Var.g = j;
            e0bVar.B1.set(m96Var);
            int i2 = this.o0;
            f(eg5.b(i2, i, 3), eg5.b(i2, i, 4), true);
        }
    }

    @Override // b0b
    public final void setValue(int i) {
        super.setValue(i);
        if (this.n0) {
            int i2 = this.o0;
            f(eg5.b(i2, i, 3), eg5.b(i2, i, 4), true);
        }
    }
}
