package sc;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public i(int i9, qc.c cVar) {
        super(cVar);
        this.arity = i9;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // sc.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.a.getClass();
        String a2 = r.a(this);
        kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
