package x9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e implements i {
    public static final ob.a c = new ob.a(26);
    public final Object a;
    public Object b;

    public e(ba.c cVar) {
        this.a = cVar;
        this.b = c;
    }

    @Override // x9.i
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
