// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tif {
    public final kff a;
    public final String b;
    public final Object[] c;
    public final int d;

    public tif(kff kffVar, String str, Object[] objArr) {
        this.a = kffVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    public final int a() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
