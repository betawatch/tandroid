package xd;

import ld.p;
import org.telegram.tgnet.TLObject;
import td.b0;
import td.f1;
import yd.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        cd.f fVar = (cd.f) obj2;
        cd.g key = fVar.getKey();
        cd.f fVar2 = this.b.b.get(key);
        if (key != b0.b) {
            return Integer.valueOf(fVar != fVar2 ? TLObject.FLAG_31 : intValue + 1);
        }
        f1 f1Var = (f1) fVar2;
        f1 f1Var2 = (f1) fVar;
        while (true) {
            if (f1Var2 != null) {
                if (f1Var2 == f1Var || !(f1Var2 instanceof s)) {
                    break;
                }
                f1Var2 = f1Var2.getParent();
            } else {
                f1Var2 = null;
                break;
            }
        }
        if (f1Var2 == f1Var) {
            if (f1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var2 + ", expected child of " + f1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
