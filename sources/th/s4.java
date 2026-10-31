package th;

import j$.util.function.Consumer$-CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements Consumer {
    public final /* synthetic */ t4 a;

    public /* synthetic */ s4(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        org.telegram.messenger.i0.g3(new o0(7, this.a, (List) obj));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
