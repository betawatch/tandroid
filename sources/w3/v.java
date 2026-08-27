package w3;

import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a;
    public final d5.f0 b;
    public final d5.z c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public v(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new d5.f0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d5.z();
                break;
            default:
                this.b = new d5.f0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d5.z();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(d5.z zVar) {
        int i10 = zVar.b;
        if (zVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zVar.c(0, 9, bArr);
        zVar.C(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(m3.l lVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = g0.f;
                d5.z zVar = this.c;
                zVar.getClass();
                zVar.A(bArr.length, bArr);
                this.d = true;
                lVar.q();
                break;
            default:
                byte[] bArr2 = g0.f;
                d5.z zVar2 = this.c;
                zVar2.getClass();
                zVar2.A(bArr2.length, bArr2);
                this.d = true;
                lVar.q();
                break;
        }
    }
}
