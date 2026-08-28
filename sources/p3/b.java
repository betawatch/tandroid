package p3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d5.f0;
import d5.x;
import d5.y;
import g7.r;
import g7.s;
import h3.t1;
import java.util.Arrays;
import kh.p;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import o8.z;
import z3.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements k {
    public m e;
    public w f;
    public c h;
    public FlacStreamMetadata i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final y b = new y(new byte[32768], 0);
    public final boolean c = false;
    public final n d = new n();
    public int g = 0;

    @Override // m3.k
    public final int b(l lVar, n nVar) {
        t oVar;
        long j10;
        boolean z10;
        int i9 = this.g;
        if (i9 == 0) {
            boolean z11 = !this.c;
            ((h) lVar).f = 0;
            h hVar = (h) lVar;
            long k10 = hVar.k();
            c a2 = s.a(lVar, z11);
            hVar.u((int) (hVar.k() - k10));
            this.h = a2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i9 == 1) {
            ((h) lVar).g(bArr, 0, bArr.length, false);
            ((h) lVar).f = 0;
            this.g = 2;
            return 0;
        }
        if (i9 == 2) {
            y yVar = new y(4);
            ((h) lVar).d(yVar.a, 0, 4, false);
            if (yVar.s() != 1716281667) {
                throw t1.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        if (i9 == 3) {
            FlacStreamMetadata flacStreamMetadata = this.i;
            boolean z12 = false;
            while (!z12) {
                ((h) lVar).f = 0;
                byte[] bArr2 = new byte[4];
                x xVar = new x(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.g(bArr2, 0, 4, false);
                boolean h = xVar.h();
                int i10 = xVar.i(7);
                int i11 = xVar.i(24) + 4;
                if (i10 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.d(bArr3, 0, 38, false);
                    flacStreamMetadata = new FlacStreamMetadata(bArr3, 4);
                } else {
                    if (flacStreamMetadata == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 == 3) {
                        y yVar2 = new y(i11);
                        hVar2.d(yVar2.a, 0, i11, false);
                        flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(s.b(yVar2));
                    } else if (i10 == 4) {
                        y yVar3 = new y(i11);
                        hVar2.d(yVar3.a, 0, i11, false);
                        yVar3.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(Arrays.asList(g7.t.b(yVar3, false, false).a));
                    } else if (i10 == 6) {
                        y yVar4 = new y(i11);
                        hVar2.d(yVar4.a, 0, i11, false);
                        yVar4.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(z.y(PictureFrame.fromPictureBlock(yVar4)));
                    } else {
                        hVar2.u(i11);
                    }
                }
                int i12 = f0.a;
                this.i = flacStreamMetadata;
                z12 = h;
            }
            this.i.getClass();
            this.j = Math.max(this.i.minFrameSize, 6);
            w wVar = this.f;
            int i13 = f0.a;
            wVar.c(this.i.getFormat(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j11 = 0;
        if (i9 == 4) {
            ((h) lVar).f = 0;
            y yVar5 = new y(2);
            h hVar3 = (h) lVar;
            hVar3.g(yVar5.a, 0, 2, false);
            int w8 = yVar5.w();
            if ((w8 >> 2) != 16382) {
                hVar3.f = 0;
                throw t1.a("First frame does not start with sync code.", null);
            }
            hVar3.f = 0;
            this.k = w8;
            m mVar = this.e;
            int i14 = f0.a;
            long j12 = hVar3.d;
            long j13 = hVar3.c;
            this.i.getClass();
            FlacStreamMetadata flacStreamMetadata2 = this.i;
            if (flacStreamMetadata2.seekTable != null) {
                oVar = new o(flacStreamMetadata2, j12, 0);
            } else if (j13 == -1 || flacStreamMetadata2.totalSamples <= 0) {
                oVar = new o(flacStreamMetadata2.getDurationUs());
            } else {
                a aVar = new a(new p(flacStreamMetadata2, 15), new a6.a(flacStreamMetadata2, this.k), flacStreamMetadata2.getDurationUs(), flacStreamMetadata2.totalSamples, j12, j13, flacStreamMetadata2.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata2.minFrameSize));
                this.l = aVar;
                oVar = aVar.a;
            }
            mVar.y(oVar);
            this.g = 5;
            return 0;
        }
        if (i9 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        a aVar2 = this.l;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(lVar, nVar);
        }
        if (this.n == -1) {
            FlacStreamMetadata flacStreamMetadata3 = this.i;
            ((h) lVar).f = 0;
            h hVar4 = (h) lVar;
            hVar4.a(1, false);
            byte[] bArr4 = new byte[1];
            hVar4.g(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            hVar4.a(2, false);
            int i15 = z13 ? 7 : 6;
            y yVar6 = new y(i15);
            byte[] bArr5 = yVar6.a;
            int i16 = 0;
            while (i16 < i15) {
                int e10 = hVar4.e(i16, i15 - i16, bArr5);
                if (e10 == -1) {
                    break;
                }
                i16 += e10;
            }
            yVar6.B(i16);
            hVar4.f = 0;
            try {
                long x10 = yVar6.x();
                if (!z13) {
                    x10 *= flacStreamMetadata3.maxBlockSizeSamples;
                }
                j11 = x10;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw t1.a(null, null);
            }
            this.n = j11;
        } else {
            y yVar7 = this.b;
            int i17 = yVar7.c;
            if (i17 < 32768) {
                int read = ((h) lVar).read(yVar7.a, i17, 32768 - i17);
                r3 = read == -1;
                if (!r3) {
                    yVar7.B(i17 + read);
                } else if (yVar7.a() == 0) {
                    long j14 = this.n * 1000000;
                    FlacStreamMetadata flacStreamMetadata4 = this.i;
                    int i18 = f0.a;
                    this.f.e(j14 / flacStreamMetadata4.sampleRate, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i19 = yVar7.b;
            int i20 = this.m;
            int i21 = this.j;
            if (i20 < i21) {
                yVar7.D(Math.min(i21 - i20, yVar7.a()));
            }
            this.i.getClass();
            int i22 = yVar7.b;
            while (true) {
                int i23 = yVar7.c - 16;
                n nVar2 = this.d;
                if (i22 <= i23) {
                    yVar7.C(i22);
                    if (r.a(yVar7, this.i, this.k, nVar2)) {
                        yVar7.C(i22);
                        j10 = nVar2.a;
                        break;
                    }
                    i22++;
                } else {
                    if (r3) {
                        while (true) {
                            int i24 = yVar7.c;
                            if (i22 > i24 - this.j) {
                                yVar7.C(i24);
                                break;
                            }
                            yVar7.C(i22);
                            try {
                                z10 = r.a(yVar7, this.i, this.k, nVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (yVar7.b > yVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                yVar7.C(i22);
                                j10 = nVar2.a;
                                break;
                            }
                            i22++;
                        }
                    } else {
                        yVar7.C(i22);
                    }
                    j10 = -1;
                }
            }
            int i25 = yVar7.b - i19;
            yVar7.C(i19);
            this.f.a(i25, yVar7);
            int i26 = this.m + i25;
            this.m = i26;
            if (j10 != -1) {
                long j15 = this.n * 1000000;
                FlacStreamMetadata flacStreamMetadata5 = this.i;
                int i27 = f0.a;
                this.f.e(j15 / flacStreamMetadata5.sampleRate, 1, i26, 0, null);
                this.m = 0;
                this.n = j10;
            }
            if (yVar7.a() < 16) {
                int a3 = yVar7.a();
                byte[] bArr6 = yVar7.a;
                System.arraycopy(bArr6, yVar7.b, bArr6, 0, a3);
                yVar7.C(0);
                yVar7.B(a3);
            }
        }
        return 0;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.e = mVar;
        this.f = mVar.I(0, 1);
        mVar.B();
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        s.a(lVar, false);
        y yVar = new y(4);
        ((h) lVar).g(yVar.a, 0, 4, false);
        return yVar.s() == 1716281667;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        this.n = j11 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.z(0);
    }

    @Override // m3.k
    public final void release() {
    }
}
