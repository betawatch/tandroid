package z9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final qb.a c = new qb.a(29);
    public final Object a;
    public Object b;

    public e(da.c cVar) {
        this.a = cVar;
        this.b = c;
    }

    @Override // z9.i
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.b;
        try {
            hVar.read((byte[]) this.a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }
}
