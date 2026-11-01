package yd;

import td.c0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final cd.h a;

    public e(cd.h hVar) {
        this.a = hVar;
    }

    @Override // td.c0
    public final cd.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
