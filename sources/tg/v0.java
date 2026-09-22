package tg;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ za b;

    public /* synthetic */ v0(za zaVar, int i10) {
        this.a = i10;
        this.b = zaVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((a1) this.b).k0.addAll((List) obj2);
                break;
            default:
                ((th.f) this.b).b0.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
