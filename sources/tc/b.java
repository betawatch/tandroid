package tc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements rc.c {
    public static final b a = new b();

    @Override // rc.c
    public final rc.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // rc.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
