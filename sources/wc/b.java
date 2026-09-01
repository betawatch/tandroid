package wc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
