package w3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public final m3.w a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public l(m3.w wVar) {
        this.a = wVar;
    }

    public final void a(int i9, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = this.f;
            int i12 = (i9 + 1) - i11;
            if (i12 >= i10) {
                this.f = (i10 - i9) + i11;
            } else {
                this.d = ((bArr[i12] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }
}
