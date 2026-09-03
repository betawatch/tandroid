package wc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
