package p4;

import ai.u1;
import ai.v1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements c1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ v0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // p4.c1
    public final Object k(e0 e0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                if (e0Var != null) {
                    throw new ClassCastException();
                }
                e1.k1(null, vVar, i7, this.b, new v1(vVar, i7, 21));
                throw null;
            default:
                return e1.k1(e0Var, vVar, i7, this.b, new u1(e0Var, vVar, i7, 19));
        }
    }
}
