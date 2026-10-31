package yd;

import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
