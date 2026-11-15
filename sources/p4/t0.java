package p4;

import ai.r1;
import ai.s1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ t0(a1 a1Var, int i7) {
        this.a = i7;
        this.b = a1Var;
    }

    @Override // p4.a1
    public final Object k(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                if (d0Var != null) {
                    throw new ClassCastException();
                }
                c1.k1(null, vVar, i7, this.b, new s1(vVar, i7, 21));
                throw null;
            default:
                return c1.k1(d0Var, vVar, i7, this.b, new r1(d0Var, vVar, i7, 18));
        }
    }
}
