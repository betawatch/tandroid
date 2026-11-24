// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tdf extends xdf {
    @Override // xdf
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(de9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(tb4.n(i, "Index > length: ", ", 47"));
    }

    @Override // xdf
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // xdf
    public final int j() {
        return 47;
    }
}
