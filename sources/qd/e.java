package qd;

import ld.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
