package p4;

import ai.r1;
import ai.s1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements c1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ v0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // p4.c1
    public final Object k(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                if (d0Var != null) {
                    throw new ClassCastException();
                }
                e1.k1(null, vVar, i7, this.b, new s1(vVar, i7, 21));
                throw null;
            default:
                return e1.k1(d0Var, vVar, i7, this.b, new r1(d0Var, vVar, i7, 19));
        }
    }
}
