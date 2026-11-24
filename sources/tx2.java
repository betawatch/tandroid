// default package

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tx2 implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ tx2(fy0 fy0Var, byte b) {
        this.a = b;
        this.b = fy0Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        fy0 fy0Var = this.b;
        switch (b) {
            case 0:
                ((xx2) fy0Var).W1.addAll((List) obj2);
                break;
            default:
                ((zy9) fy0Var).f2.addAll((List) obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
