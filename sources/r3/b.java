package r3;

import ag.j2;
import b4.c;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import f5.d0;
import f5.v;
import i7.i0;
import i7.j0;
import i7.w5;
import j3.t1;
import java.util.Arrays;
import l4.s0;
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.o;
import o3.t;
import o3.w;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final f5.w b = new f5.w(new byte[32768], 0);
    public final boolean c = false;
    public final n d = new n();
    public int g = 0;

    @Override // o3.k
    public final int d(l lVar, n nVar) {
        t oVar;
        long j10;
        boolean z10;
        int i10 = this.g;
        if (i10 == 0) {
            boolean z11 = !this.c;
            ((h) lVar).f = 0;
            h hVar = (h) lVar;
            long h = hVar.h();
            c a2 = j0.a(lVar, z11);
            hVar.t((int) (hVar.h() - h));
            this.h = a2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i10 == 1) {
            ((h) lVar).f(bArr, 0, bArr.length, false);
            ((h) lVar).f = 0;
            this.g = 2;
            return 0;
        }
        if (i10 == 2) {
            f5.w wVar = new f5.w(4);
            ((h) lVar).c(wVar.a, 0, 4, false);
            if (wVar.s() != 1716281667) {
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
                v vVar = new v(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.f(bArr2, 0, 4, false);
                boolean h10 = vVar.h();
                int i11 = vVar.i(7);
                int i12 = vVar.i(24) + 4;
                if (i11 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.c(bArr3, 0, 38, false);
                    flacStreamMetadata = new FlacStreamMetadata(bArr3, 4);
                } else {
                    if (flacStreamMetadata == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i11 == 3) {
                        f5.w wVar2 = new f5.w(i12);
                        hVar2.c(wVar2.a, 0, i12, false);
                        flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(j0.b(wVar2));
                    } else if (i11 == 4) {
                        f5.w wVar3 = new f5.w(i12);
                        hVar2.c(wVar3.a, 0, i12, false);
                        wVar3.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(Arrays.asList(w5.b(wVar3, false, false).a));
                    } else if (i11 == 6) {
                        f5.w wVar4 = new f5.w(i12);
                        hVar2.c(wVar4.a, 0, i12, false);
                        wVar4.D(4);
                        flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(z.y(PictureFrame.fromPictureBlock(wVar4)));
                    } else {
                        hVar2.t(i12);
                    }
                }
                int i13 = d0.a;
                this.i = flacStreamMetadata;
                z12 = h10;
            }
            this.i.getClass();
            this.j = Math.max(this.i.minFrameSize, 6);
            w wVar5 = this.f;
            int i14 = d0.a;
            wVar5.b(this.i.getFormat(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j11 = 0;
        if (i10 == 4) {
            ((h) lVar).f = 0;
            f5.w wVar6 = new f5.w(2);
            h hVar3 = (h) lVar;
            hVar3.f(wVar6.a, 0, 2, false);
            int w10 = wVar6.w();
            if ((w10 >> 2) != 16382) {
                hVar3.f = 0;
                throw t1.a("First frame does not start with sync code.", null);
            }
            hVar3.f = 0;
            this.k = w10;
            m mVar = this.e;
            int i15 = d0.a;
            long j12 = hVar3.d;
            long j13 = hVar3.c;
            this.i.getClass();
            FlacStreamMetadata flacStreamMetadata2 = this.i;
            if (flacStreamMetadata2.seekTable != null) {
                oVar = new o(flacStreamMetadata2, j12, 0);
            } else if (j13 == -1 || flacStreamMetadata2.totalSamples <= 0) {
                oVar = new o(flacStreamMetadata2.getDurationUs());
            } else {
                a aVar = new a(new s0(flacStreamMetadata2, 27), new j2(flacStreamMetadata2, this.k), flacStreamMetadata2.getDurationUs(), flacStreamMetadata2.totalSamples, j12, j13, flacStreamMetadata2.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata2.minFrameSize));
                this.l = aVar;
                oVar = aVar.a;
            }
            mVar.D1(oVar);
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
            hVar4.b(1, false);
            byte[] bArr4 = new byte[1];
            hVar4.f(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            hVar4.b(2, false);
            int i16 = z13 ? 7 : 6;
            f5.w wVar7 = new f5.w(i16);
            byte[] bArr5 = wVar7.a;
            int i17 = 0;
            while (i17 < i16) {
                int d = hVar4.d(i17, i16 - i17, bArr5);
                if (d == -1) {
                    break;
                }
                i17 += d;
            }
            wVar7.B(i17);
            hVar4.f = 0;
            try {
                long x4 = wVar7.x();
                if (!z13) {
                    x4 *= flacStreamMetadata3.maxBlockSizeSamples;
                }
                j11 = x4;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw t1.a(null, null);
            }
            this.n = j11;
        } else {
            f5.w wVar8 = this.b;
            int i18 = wVar8.c;
            if (i18 < 32768) {
                int read = ((h) lVar).read(wVar8.a, i18, 32768 - i18);
                r3 = read == -1;
                if (!r3) {
                    wVar8.B(i18 + read);
                } else if (wVar8.a() == 0) {
                    long j14 = this.n * 1000000;
                    FlacStreamMetadata flacStreamMetadata4 = this.i;
                    int i19 = d0.a;
                    this.f.c(j14 / flacStreamMetadata4.sampleRate, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i20 = wVar8.b;
            int i21 = this.m;
            int i22 = this.j;
            if (i21 < i22) {
                wVar8.D(Math.min(i22 - i21, wVar8.a()));
            }
            this.i.getClass();
            int i23 = wVar8.b;
            while (true) {
                int i24 = wVar8.c - 16;
                n nVar2 = this.d;
                if (i23 <= i24) {
                    wVar8.C(i23);
                    if (i0.a(wVar8, this.i, this.k, nVar2)) {
                        wVar8.C(i23);
                        j10 = nVar2.a;
                        break;
                    }
                    i23++;
                } else {
                    if (r3) {
                        while (true) {
                            int i25 = wVar8.c;
                            if (i23 > i25 - this.j) {
                                wVar8.C(i25);
                                break;
                            }
                            wVar8.C(i23);
                            try {
                                z10 = i0.a(wVar8, this.i, this.k, nVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (wVar8.b > wVar8.c) {
                                z10 = false;
                            }
                            if (z10) {
                                wVar8.C(i23);
                                j10 = nVar2.a;
                                break;
                            }
                            i23++;
                        }
                    } else {
                        wVar8.C(i23);
                    }
                    j10 = -1;
                }
            }
            int i26 = wVar8.b - i20;
            wVar8.C(i20);
            this.f.e(i26, wVar8);
            int i27 = this.m + i26;
            this.m = i27;
            if (j10 != -1) {
                long j15 = this.n * 1000000;
                FlacStreamMetadata flacStreamMetadata5 = this.i;
                int i28 = d0.a;
                this.f.c(j15 / flacStreamMetadata5.sampleRate, 1, i27, 0, null);
                this.m = 0;
                this.n = j10;
            }
            if (wVar8.a() < 16) {
                int a10 = wVar8.a();
                byte[] bArr6 = wVar8.a;
                System.arraycopy(bArr6, wVar8.b, bArr6, 0, a10);
                wVar8.C(0);
                wVar8.B(a10);
            }
        }
        return 0;
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        j0.a(lVar, false);
        f5.w wVar = new f5.w(4);
        ((h) lVar).f(wVar.a, 0, 4, false);
        return wVar.s() == 1716281667;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
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

    @Override // o3.k
    public final void i(m mVar) {
        this.e = mVar;
        this.f = mVar.Z1(0, 1);
        mVar.e1();
    }

    @Override // o3.k
    public final void release() {
    }
}
