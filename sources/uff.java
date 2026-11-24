// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uff extends yff {
    @Override // yff
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(td4.o(i, "Index > length: ", ", 47"));
    }

    @Override // yff
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // yff
    public final int j() {
        return 47;
    }
}
