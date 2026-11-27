// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y53 extends s18 {
    public final /* synthetic */ byte c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y53(float f, byte b) {
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

    @Override // s18
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
