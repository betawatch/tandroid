package sc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements qc.c {
    public static final b a = new b();

    @Override // qc.c
    public final qc.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // qc.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
