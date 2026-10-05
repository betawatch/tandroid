package x9;

import t7.u;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final u c = new u();
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
