package p4;

import ai.t1;
import ai.u1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                e1.k1(null, vVar, i7, this.b, new u1(vVar, i7, 21));
                throw null;
            default:
                return e1.k1(e0Var, vVar, i7, this.b, new t1(e0Var, vVar, i7, 19));
        }
    }
}
