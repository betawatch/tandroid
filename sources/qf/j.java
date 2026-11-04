package qf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public short a;

    public final void a(byte b10) {
        int i3 = 128;
        do {
            short s6 = this.a;
            if (((32768 & s6) == 0) ^ ((b10 & i3) == 0)) {
                this.a = (short) (((short) (s6 << 1)) ^ 32773);
            } else {
                this.a = (short) (s6 << 1);
            }
            i3 >>>= 1;
        } while (i3 != 0);
    }
}
