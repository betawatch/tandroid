// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
