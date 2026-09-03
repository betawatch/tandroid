package xe;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k {
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
