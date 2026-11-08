package vh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.na;
import wg.w0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ c(na naVar, int i7) {
        this.a = i7;
        this.b = naVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((g) this.b).T1.addAll((List) obj2);
                break;
            default:
                ((w0) this.b).c2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
