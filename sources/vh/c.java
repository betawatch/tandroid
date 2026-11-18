package vh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
import wg.w0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ c(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((g) this.b).X1.addAll((List) obj2);
                break;
            default:
                ((w0) this.b).g2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
