// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xpa {
    public final byte a;
    public final byte b;
    public float c;

    /* JADX WARN: Multi-variable type inference failed */
    public xpa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final float a(int i) {
        byte b = this.b;
        byte b2 = this.a;
        if (b == i) {
            if (b2 == i) {
                return 1.0f;
            }
            return this.c;
        }
        if (b2 == i) {
            return 1.0f - this.c;
        }
        return 0.0f;
    }

    public final boolean b(int i) {
        return this.a == i || this.b == i;
    }

    public final boolean c(int i) {
        return this.b == i;
    }

    public final boolean d(int i) {
        return this.b == i;
    }
}
