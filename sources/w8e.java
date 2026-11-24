// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w8e extends n9e {
    public final char[] e;

    public w8e(q8e q8eVar) {
        super(q8eVar, (Character) null);
        this.e = new char[512];
        if (q8eVar.b.length != 16) {
            i98.g();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.e;
            char[] cArr2 = q8eVar.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // n9e
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        m2f.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
