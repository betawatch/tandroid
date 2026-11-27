// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
