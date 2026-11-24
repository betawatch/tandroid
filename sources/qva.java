// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qva extends yva {
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ int o0;
    public final /* synthetic */ bwa p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qva(bwa bwaVar, Context context, wjb wjbVar, boolean z, int i) {
        super(context, wjbVar);
        this.p0 = bwaVar;
        this.n0 = z;
        this.o0 = i;
    }

    @Override // yva
    public final void e(int i) {
        long j = i;
        bwa bwaVar = this.p0;
        bwaVar.I0(j);
        u41 u41Var = bwaVar.w1;
        if (u41Var != null) {
            u41Var.i(jva.Y0(false, k96.a0(null, null, 2131744810, k96.E(j, ',')), bwaVar.M1), true, true);
        }
        if (this.n0) {
            i76 i76Var = bwaVar.A1;
            i76Var.g = j;
            bwaVar.B1.set(i76Var);
            int i2 = this.o0;
            f(de5.b(i2, i, 3), de5.b(i2, i, 4), true);
        }
    }

    @Override // yva
    public final void setValue(int i) {
        super.setValue(i);
        if (this.n0) {
            int i2 = this.o0;
            f(de5.b(i2, i, 3), de5.b(i2, i, 4), true);
        }
    }
}
