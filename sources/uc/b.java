package uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements sc.c {
    public static final b a = new b();

    @Override // sc.c
    public final sc.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // sc.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
