// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yd5 {
    public final yzb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public yd5(yzb yzbVar) {
        this.a = yzbVar;
    }

    public final void a(int i, int i2, byte[] bArr) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i, long j, boolean z) {
        jte.p(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
