package z7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class xf implements n5.b {
    public final Object a;
    public final Object b;

    public xf(Context context) {
        this.b = new AtomicLong(-1L);
        this.a = new p6.b(context, p6.b.k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
    }

    @Override // hd.a
    public Object get() {
        return new m5.d((Context) ((n5.c) this.a).a, (m.g3) ((ki.t1) this.b).get());
    }

    public xf(n5.c cVar, ki.t1 t1Var) {
        this.a = cVar;
        this.b = t1Var;
    }
}
