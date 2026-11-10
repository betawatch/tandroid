package vh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ma;
import wg.w0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma b;

    public /* synthetic */ c(ma maVar, int i7) {
        this.a = i7;
        this.b = maVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((g) this.b).W1.addAll((List) obj2);
                break;
            default:
                ((w0) this.b).f2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
