package x9;

import t7.u;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
