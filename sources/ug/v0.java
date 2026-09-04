package ug;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
