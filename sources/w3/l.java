package w3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.c) {
            int i12 = this.f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f = (i11 - i10) + i12;
            } else {
                this.d = ((bArr[i13] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }
}
