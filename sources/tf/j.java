package tf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
