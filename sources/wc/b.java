package wc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
