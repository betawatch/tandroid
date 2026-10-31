package y9;

import t7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements i {
    public static final u c = new u(27);
    public final Object a;
    public Object b;

    public e(ca.c cVar) {
        this.a = cVar;
        this.b = c;
    }

    @Override // y9.i
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
