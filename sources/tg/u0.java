package tg;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb b;

    public /* synthetic */ u0(bb bbVar, int i10) {
        this.a = i10;
        this.b = bbVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((z0) this.b).k0.addAll((List) obj2);
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
