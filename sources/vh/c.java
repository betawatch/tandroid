package vh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ja;
import wg.u0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja b;

    public /* synthetic */ c(ja jaVar, int i7) {
        this.a = i7;
        this.b = jaVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((h) this.b).X1.addAll((List) obj2);
                break;
            default:
                ((u0) this.b).g2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i7 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
