// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s63 extends o08 {
    public final /* synthetic */ byte c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(float f, byte b) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.c = b;
        switch (b) {
            case 1:
                super(2, Float.valueOf(Math.max(f, 0.0f)));
                this.d = Math.max(f, 0.0f);
                break;
            default:
                this.d = Math.max(f, 0.0f);
                break;
        }
    }

    @Override // o08
    public final String toString() {
        byte b = this.c;
        float f = this.d;
        switch (b) {
            case 0:
                return "[Dash: length=" + f + "]";
            default:
                return "[Gap: length=" + f + "]";
        }
    }
}
