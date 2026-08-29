package y3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a;
    public final f5.c0 b;
    public final f5.w c;
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
                this.b = new f5.c0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new f5.w();
                break;
            default:
                this.b = new f5.c0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new f5.w();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(f5.w wVar) {
        int i10 = wVar.b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.c(0, 9, bArr);
        wVar.C(i10);
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

    public final void a(o3.l lVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = f5.d0.f;
                f5.w wVar = this.c;
                wVar.getClass();
                wVar.A(bArr.length, bArr);
                this.d = true;
                lVar.s();
                break;
            default:
                byte[] bArr2 = f5.d0.f;
                f5.w wVar2 = this.c;
                wVar2.getClass();
                wVar2.A(bArr2.length, bArr2);
                this.d = true;
                lVar.s();
                break;
        }
    }
}
