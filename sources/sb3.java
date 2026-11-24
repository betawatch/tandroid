// default package

import java.io.EOFException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sb3 implements lo7 {
    public final ko7 a;
    public final long b;
    public final long c;
    public final w8b d;
    public byte e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public sb3(w8b w8bVar, long j, long j2, long j3, long j4, boolean z) {
        gre.f(j >= 0 && j2 > j);
        this.d = w8bVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.a = new ko7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int, short] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // lo7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(ja3 ja3Var) {
        long j;
        ko7 ko7Var;
        ?? r14;
        long j2;
        long j3;
        ko7 ko7Var2;
        long j4;
        long j5;
        byte b = this.e;
        long j6 = this.c;
        ko7 ko7Var3 = this.a;
        if (b == 0) {
            j = 0;
            ko7Var = ko7Var3;
            long j7 = ja3Var.d;
            this.h = j7;
            this.e = (byte) 1;
            long j8 = j6 - 65307;
            if (j8 > j7) {
                return j8;
            }
            r14 = 0;
        } else if (b != 1) {
            if (b == 2) {
                long j9 = this.r;
                long j10 = this.s;
                if (j9 == j10) {
                    ko7Var2 = ko7Var3;
                    j5 = -1;
                    j4 = -1;
                } else {
                    long j11 = ja3Var.d;
                    if (ko7Var3.b(ja3Var, j10)) {
                        ko7Var3.a(ja3Var, false);
                        ja3Var.f = 0;
                        long j12 = this.n;
                        long j13 = ko7Var3.b;
                        long j14 = j12 - j13;
                        j3 = 2;
                        int i = ko7Var3.d + ko7Var3.e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.s = j11;
                                this.x = j13;
                            } else {
                                this.r = ja3Var.d + i;
                                this.w = j13;
                            }
                            long j15 = this.s;
                            long j16 = this.r;
                            if (j15 - j16 < 100000) {
                                this.s = j16;
                                ko7Var2 = ko7Var3;
                                j4 = -1;
                                j5 = j16;
                            } else {
                                ko7Var2 = ko7Var3;
                                j4 = -1;
                                j5 = g8c.j((((j15 - j16) * j14) / (this.x - this.w)) + (ja3Var.d - (i * (j14 <= 0 ? 2L : 1L))), j16, j15 - 1);
                            }
                        } else {
                            ko7Var2 = ko7Var3;
                            j5 = -1;
                            j4 = -1;
                        }
                        if (j5 == j4) {
                            return j5;
                        }
                        this.e = (byte) 3;
                    } else {
                        j5 = this.r;
                        if (j5 == j11) {
                            k93.f("No ogg page can be found.");
                            return 0L;
                        }
                        ko7Var2 = ko7Var3;
                        j4 = -1;
                    }
                }
                j3 = 2;
                if (j5 == j4) {
                }
            } else {
                if (b != 3) {
                    if (b == 4) {
                        return -1L;
                    }
                    sdb.a();
                    return 0L;
                }
                ko7Var2 = ko7Var3;
                j4 = -1;
                j3 = 2;
            }
            ko7 ko7Var4 = ko7Var2;
            long j17 = j4;
            while (true) {
                ko7Var4.b(ja3Var, j17);
                ko7Var4.a(ja3Var, false);
                if (ko7Var4.b > this.n) {
                    ja3Var.f = 0;
                    this.e = (byte) 4;
                    return -(this.w + j3);
                }
                ja3Var.l(ko7Var4.d + ko7Var4.e, false);
                this.r = ja3Var.d;
                this.w = ko7Var4.b;
                j17 = -1;
            }
        } else {
            j = 0;
            ko7Var = ko7Var3;
            r14 = 0;
        }
        ko7Var.a = r14;
        ko7Var.b = j;
        ko7Var.c = r14;
        ko7Var.d = r14;
        ko7Var.e = r14;
        if (!ko7Var.b(ja3Var, -1L)) {
            throw new EOFException();
        }
        ko7Var.a(ja3Var, r14);
        ja3Var.l(ko7Var.d + ko7Var.e, r14);
        while (true) {
            j2 = ko7Var.b;
            if ((ko7Var.a & 4) == 4 || !ko7Var.b(ja3Var, -1L) || ja3Var.d >= j6 || !ko7Var.a(ja3Var, true)) {
                break;
            }
            try {
                ja3Var.l(ko7Var.d + ko7Var.e, false);
            } catch (EOFException unused) {
            }
        }
        this.f = j2;
        this.e = (byte) 4;
        return this.h;
    }

    @Override // lo7
    public final void j0(long j) {
        this.n = g8c.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }

    @Override // lo7
    public final fv9 k() {
        if (this.f != 0) {
            return new rb3(this);
        }
        return null;
    }
}
