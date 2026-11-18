package tf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class j {
    public short a;

    public final void a(byte b10) {
        int i7 = 128;
        do {
            short s5 = this.a;
            if (((32768 & s5) == 0) ^ ((b10 & i7) == 0)) {
                this.a = (short) (((short) (s5 << 1)) ^ 32773);
            } else {
                this.a = (short) (s5 << 1);
            }
            i7 >>>= 1;
        } while (i7 != 0);
    }
}
