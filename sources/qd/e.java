package qd;

import java.util.Iterator;
import td.q1;
import v7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // qd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                c cVar = new c();
                cVar.c = w6.a(cVar, cVar, q1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new rd.b((String) this.b);
        }
    }
}
