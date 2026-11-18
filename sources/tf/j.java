package tf;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
