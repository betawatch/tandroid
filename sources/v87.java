// default package

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class v87 implements Consumer {
    public final /* synthetic */ oc7 a;
    public final /* synthetic */ long b;

    public /* synthetic */ v87(oc7 oc7Var, long j) {
        this.a = oc7Var;
        this.b = j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        oc7 oc7Var = this.a;
        oc7Var.getClass();
        gm.c3(new m77(oc7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
