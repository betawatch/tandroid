package ug;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb b;

    public /* synthetic */ v0(bb bbVar, int i10) {
        this.a = i10;
        this.b = bbVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((a1) this.b).k0.addAll((List) obj2);
                break;
            default:
                ((uh.f) this.b).b0.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
