// default package

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
