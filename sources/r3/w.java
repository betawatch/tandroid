package r3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(v vVar, u uVar) {
        if (this.c > 0) {
            vVar.c(this.d, this.e, this.f, this.g, uVar);
            this.c = 0;
        }
    }

    public final void b(v vVar, long j10, int i10, int i11, int i12, u uVar) {
        if (!(this.g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i13 = this.c;
            int i14 = i13 + 1;
            this.c = i14;
            if (i13 == 0) {
                this.d = j10;
                this.e = i10;
                this.f = 0;
            }
            this.f += i11;
            this.g = i12;
            if (i14 >= 16) {
                a(vVar, uVar);
            }
        }
    }

    public final void c(l lVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        lVar.c(0, 10, bArr);
        lVar.t();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                r1 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.b = true;
    }
}
