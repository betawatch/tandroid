package wc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements uc.c {
    public static final b a = new b();

    @Override // uc.c
    public final uc.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // uc.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
