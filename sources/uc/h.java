package uc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.g {
    public final int a;

    public h(sc.c cVar) {
        super(cVar);
        this.a = 2;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.a;
    }

    @Override // uc.a
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
