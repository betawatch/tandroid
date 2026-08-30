package wc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int a;

    public h(uc.c cVar) {
        super(cVar);
        this.a = 2;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.a;
    }

    @Override // wc.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r.a.getClass();
        String a2 = s.a(this);
        j.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
