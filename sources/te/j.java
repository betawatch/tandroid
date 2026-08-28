package te;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public short a;

    public final void a(byte b10) {
        int i9 = 128;
        do {
            short s10 = this.a;
            if (((32768 & s10) == 0) ^ ((b10 & i9) == 0)) {
                this.a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.a = (short) (s10 << 1);
            }
            i9 >>>= 1;
        } while (i9 != 0);
    }
}
