// default package

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class y97 implements Consumer {
    public final /* synthetic */ uc7 a;
    public final /* synthetic */ long b;

    public /* synthetic */ y97(uc7 uc7Var, long j) {
        this.a = uc7Var;
        this.b = j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        uc7 uc7Var = this.a;
        uc7Var.getClass();
        hl.c3(new p77(uc7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
