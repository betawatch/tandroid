package qd;

import ld.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
