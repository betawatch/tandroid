// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s74 {
    public final uzb a;
    public final int[] b;

    public s74(uzb uzbVar, int... iArr) {
        if (iArr.length == 0) {
            ncd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = uzbVar;
        this.b = iArr;
    }
}
