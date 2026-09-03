package ye;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j {
    public short a;

    public final void a(byte b10) {
        int i10 = 128;
        do {
            short s6 = this.a;
            if (((32768 & s6) == 0) ^ ((b10 & i10) == 0)) {
                this.a = (short) (((short) (s6 << 1)) ^ 32773);
            } else {
                this.a = (short) (s6 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
