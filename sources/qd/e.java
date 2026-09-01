package qd;

import ld.c0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final uc.h a;

    public e(uc.h hVar) {
        this.a = hVar;
    }

    @Override // ld.c0
    public final uc.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
