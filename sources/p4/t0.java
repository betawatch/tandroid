package p4;

import jg.a2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ t0(a1 a1Var, int i7) {
        this.a = i7;
        this.b = a1Var;
    }

    @Override // p4.a1
    public final Object l(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                if (d0Var != null) {
                    throw new ClassCastException();
                }
                c1.k1(null, vVar, i7, this.b, new l2.q(vVar, i7, 18));
                throw null;
            default:
                return c1.k1(d0Var, vVar, i7, this.b, new a2(d0Var, vVar, i7, 17));
        }
    }
}
