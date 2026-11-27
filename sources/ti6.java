// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ti6 {
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
