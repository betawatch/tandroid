package p3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d5.g0;
import d5.y;
import d5.z;
import h3.t1;
import h7.r;
import h7.s;
import java.util.Arrays;
import lh.p;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import z3.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final z b = new z(new byte[32768], 0);
    public final boolean c = false;
    public final n d = new n();
    public int g = 0;

    @Override // m3.k
    public final int b(l lVar, n nVar) {
        t oVar;
        long j10;
        boolean z10;
        int i10 = this.g;
        if (i10 == 0) {
            boolean z11 = !this.c;
            ((h) lVar).f = 0;
            h hVar = (h) lVar;
            long i11 = hVar.i();
            c a2 = s.a(lVar, z11);
            hVar.t((int) (hVar.i() - i11));
            this.h = a2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i10 == 1) {
            ((h) lVar).g(bArr, 0, bArr.length, false);
            ((h) lVar).f = 0;
            this.g = 2;
            return 0;
        }
        if (i10 == 2) {
            z zVar = new z(4);
            ((h) lVar).d(zVar.a, 0, 4, false);
            if (zVar.s() != 1716281667) {
                throw t1.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        if (i10 == 3) {
            FlacStreamMetadata flacStreamMetadata = this.i;
            boolean z12 = false;
            while (!z12) {
                ((h) lVar).f = 0;
                byte[] bArr2 = new byte[4];
                y yVar = new y(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.g(bArr2, 0, 4, false);
                boolean h = yVar.h();
                int i12 = yVar.i(7);
                int i13 = yVar.i(24) + 4;
                if (i12 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.d(bArr3, 0, 38, false);
                    flacStreamMetadata = new FlacStreamMetadata(bArr3, 4);
                } else {
                    if (flacStreamMetadata == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i12 == 3) {
                        z zVar2 = new z(i13);
                        hVar2.d(zVar2.a, 0, i13, false);
                        flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(s.b(zVar2));
                    } else if (i12 == 4) {
                        z zVar3 = new z(i13);
                        hVar2.d(zVar3.a, 0, i13, false);
                        zVar3.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(Arrays.asList(h7.t.b(zVar3, false, false).a));
                    } else if (i12 == 6) {
                        z zVar4 = new z(i13);
                        hVar2.d(zVar4.a, 0, i13, false);
                        zVar4.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(p8.z.y(PictureFrame.fromPictureBlock(zVar4)));
                    } else {
                        hVar2.t(i13);
                    }
                }
                int i14 = g0.a;
                this.i = flacStreamMetadata;
                z12 = h;
            }
            this.i.getClass();
            this.j = Math.max(this.i.minFrameSize, 6);
            w wVar = this.f;
            int i15 = g0.a;
            wVar.c(this.i.getFormat(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j11 = 0;
        if (i10 == 4) {
            ((h) lVar).f = 0;
            z zVar5 = new z(2);
            h hVar3 = (h) lVar;
            hVar3.g(zVar5.a, 0, 2, false);
            int w10 = zVar5.w();
            if ((w10 >> 2) != 16382) {
                hVar3.f = 0;
                throw t1.a("First frame does not start with sync code.", null);
            }
            hVar3.f = 0;
            this.k = w10;
            m mVar = this.e;
            int i16 = g0.a;
            long j12 = hVar3.d;
            long j13 = hVar3.c;
            this.i.getClass();
            FlacStreamMetadata flacStreamMetadata2 = this.i;
            if (flacStreamMetadata2.seekTable != null) {
                oVar = new o(flacStreamMetadata2, j12, 0);
            } else if (j13 == -1 || flacStreamMetadata2.totalSamples <= 0) {
                oVar = new o(flacStreamMetadata2.getDurationUs());
            } else {
                a aVar = new a(new p(flacStreamMetadata2, 15), new b6.a(flacStreamMetadata2, this.k), flacStreamMetadata2.getDurationUs(), flacStreamMetadata2.totalSamples, j12, j13, flacStreamMetadata2.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata2.minFrameSize));
                this.l = aVar;
                oVar = aVar.a;
            }
            mVar.n(oVar);
            this.g = 5;
            return 0;
        }
        if (i10 != 5) {
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
            int i17 = z13 ? 7 : 6;
            z zVar6 = new z(i17);
            byte[] bArr5 = zVar6.a;
            int i18 = 0;
            while (i18 < i17) {
                int e9 = hVar4.e(i18, i17 - i18, bArr5);
                if (e9 == -1) {
                    break;
                }
                i18 += e9;
            }
            zVar6.B(i18);
            hVar4.f = 0;
            try {
                long x8 = zVar6.x();
                if (!z13) {
                    x8 *= flacStreamMetadata3.maxBlockSizeSamples;
                }
                j11 = x8;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw t1.a(null, null);
            }
            this.n = j11;
        } else {
            z zVar7 = this.b;
            int i19 = zVar7.c;
            if (i19 < 32768) {
                int read = ((h) lVar).read(zVar7.a, i19, 32768 - i19);
                r3 = read == -1;
                if (!r3) {
                    zVar7.B(i19 + read);
                } else if (zVar7.a() == 0) {
                    long j14 = this.n * 1000000;
                    FlacStreamMetadata flacStreamMetadata4 = this.i;
                    int i20 = g0.a;
                    this.f.e(j14 / flacStreamMetadata4.sampleRate, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i21 = zVar7.b;
            int i22 = this.m;
            int i23 = this.j;
            if (i22 < i23) {
                zVar7.D(Math.min(i23 - i22, zVar7.a()));
            }
            this.i.getClass();
            int i24 = zVar7.b;
            while (true) {
                int i25 = zVar7.c - 16;
                n nVar2 = this.d;
                if (i24 <= i25) {
                    zVar7.C(i24);
                    if (r.a(zVar7, this.i, this.k, nVar2)) {
                        zVar7.C(i24);
                        j10 = nVar2.a;
                        break;
                    }
                    i24++;
                } else {
                    if (r3) {
                        while (true) {
                            int i26 = zVar7.c;
                            if (i24 > i26 - this.j) {
                                zVar7.C(i26);
                                break;
                            }
                            zVar7.C(i24);
                            try {
                                z10 = r.a(zVar7, this.i, this.k, nVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (zVar7.b > zVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                zVar7.C(i24);
                                j10 = nVar2.a;
                                break;
                            }
                            i24++;
                        }
                    } else {
                        zVar7.C(i24);
                    }
                    j10 = -1;
                }
            }
            int i27 = zVar7.b - i21;
            zVar7.C(i21);
            this.f.a(i27, zVar7);
            int i28 = this.m + i27;
            this.m = i28;
            if (j10 != -1) {
                long j15 = this.n * 1000000;
                FlacStreamMetadata flacStreamMetadata5 = this.i;
                int i29 = g0.a;
                this.f.e(j15 / flacStreamMetadata5.sampleRate, 1, i28, 0, null);
                this.m = 0;
                this.n = j10;
            }
            if (zVar7.a() < 16) {
                int a3 = zVar7.a();
                byte[] bArr6 = zVar7.a;
                System.arraycopy(bArr6, zVar7.b, bArr6, 0, a3);
                zVar7.C(0);
                zVar7.B(a3);
            }
        }
        return 0;
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.e = mVar;
        this.f = mVar.C(0, 1);
        mVar.A();
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        s.a(lVar, false);
        z zVar = new z(4);
        ((h) lVar).g(zVar.a, 0, 4, false);
        return zVar.s() == 1716281667;
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
