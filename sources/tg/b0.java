package tg;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b0 extends hi.r2 {
    public final /* synthetic */ l0 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0 l0Var, Context context, p pVar) {
        super(context, pVar, false, false);
        this.E1 = l0Var;
    }

    @Override // hi.r2
    public final boolean K0(Integer num) {
        if (num.intValue() != 6) {
            return num.intValue() == 2;
        }
        hi.a0 a0Var = this.E1.J1;
        return a0Var != null && a0Var.c();
    }
}
