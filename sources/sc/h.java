package sc;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.f {
    public final int a;

    public h(qc.c cVar) {
        super(cVar);
        this.a = 2;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.a;
    }

    @Override // sc.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.a.getClass();
        String a2 = r.a(this);
        kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
