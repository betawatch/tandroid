// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yta {
    public final byte a;
    public final byte b;
    public float c;

    /* JADX WARN: Multi-variable type inference failed */
    public yta(int i, int i2) {
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
