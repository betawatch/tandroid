package r3;

import h5.d0;
import j3.m0;
import j3.n0;
import java.util.Collections;
import q5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final c0 k;
    public final e4.c l;

    public o(byte[] bArr, int i10) {
        h5.v vVar = new h5.v(bArr, bArr.length);
        vVar.p(i10 * 8);
        this.a = vVar.i(16);
        this.b = vVar.i(16);
        this.c = vVar.i(24);
        this.d = vVar.i(24);
        int i11 = vVar.i(20);
        this.e = i11;
        this.f = d(i11);
        this.g = vVar.i(3) + 1;
        int i12 = vVar.i(5) + 1;
        this.h = i12;
        this.i = a(i12);
        int i13 = vVar.i(4);
        int i14 = vVar.i(32);
        int i15 = d0.a;
        this.j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final n0 c(byte[] bArr, e4.c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        e4.c cVar2 = this.l;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.a(cVar.a);
        }
        m0 m0Var = new m0();
        m0Var.o = "audio/flac";
        m0Var.p = i10;
        m0Var.B = this.g;
        m0Var.C = this.e;
        m0Var.q = Collections.singletonList(bArr);
        m0Var.i = cVar;
        return new n0(m0Var);
    }

    public o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, c0 c0Var, e4.c cVar) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = i14;
        this.f = d(i14);
        this.g = i15;
        this.h = i16;
        this.i = a(i16);
        this.j = j10;
        this.k = c0Var;
        this.l = cVar;
    }
}
