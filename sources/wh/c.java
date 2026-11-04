package wh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.ma;
import xg.w0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma b;

    public /* synthetic */ c(ma maVar, int i3) {
        this.a = i3;
        this.b = maVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((h) this.b).U1.addAll((List) obj2);
                break;
            default:
                ((w0) this.b).d2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i3 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
