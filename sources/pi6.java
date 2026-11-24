// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pi6 {
    public short a;

    public final void a(byte b) {
        int i = 128;
        do {
            short s = this.a;
            boolean z = (32768 & s) == 0;
            short s2 = (short) (s << 1);
            if (z ^ ((b & i) == 0)) {
                this.a = (short) (s2 ^ 32773);
            } else {
                this.a = s2;
            }
            i >>>= 1;
        } while (i != 0);
    }
}
