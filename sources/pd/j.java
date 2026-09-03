package pd;

import dd.p;
import kotlin.jvm.internal.k;
import ld.b0;
import ld.f1;
import org.telegram.tgnet.TLObject;
import qd.s;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends k implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        uc.f fVar = (uc.f) obj2;
        uc.g key = fVar.getKey();
        uc.f fVar2 = this.b.b.get(key);
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
