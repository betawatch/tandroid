// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xp2 implements zw2 {
    public static final xp2 b = new xp2(0);
    public static final xp2 c = new xp2(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ xp2(byte b2) {
        this.a = b2;
    }

    @Override // zw2
    public final mx2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return u24.a;
        }
    }

    @Override // zw2
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
