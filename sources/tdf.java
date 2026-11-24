// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
