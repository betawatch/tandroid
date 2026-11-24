// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pq2 implements px2 {
    public static final pq2 b = new pq2(0);
    public static final pq2 c = new pq2(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ pq2(byte b2) {
        this.a = b2;
    }

    @Override // px2
    public final cy2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return k34.a;
        }
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
