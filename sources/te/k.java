package te;

import j3.r0;
import org.telegram.messenger.OneUIUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, OneUIUtilities.ONE_UI_4_0, 48000, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, OneUIUtilities.ONE_UI_4_0}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] l = {-1, 1, 1, 4};
    public static final int[][] m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public k(int i9, int i10, int i11) {
        int i12 = (i9 >> 3) & 3;
        this.a = i12;
        if (i12 == 1) {
            throw new i("Reserved version");
        }
        int i13 = (i9 >> 1) & 3;
        this.b = i13;
        if (i13 == 0) {
            throw new i("Reserved layer");
        }
        int i14 = (i10 >> 4) & 15;
        this.d = i14;
        if (i14 == 15) {
            throw new i("Reserved bitrate");
        }
        if (i14 == 0) {
            throw new i("Free bitrate");
        }
        int i15 = (i10 >> 2) & 3;
        this.c = i15;
        if (i15 == 3) {
            throw new i("Reserved frequency");
        }
        int i16 = (i11 >> 6) & 3;
        this.e = i16;
        this.f = (i10 >> 1) & 1;
        int i17 = i9 & 1;
        this.g = i17;
        int i18 = i17 != 0 ? 4 : 6;
        i18 = i13 == 1 ? i18 + m[i16][i12] : i18;
        if (b() < i18) {
            throw new i(r0.l(i18, "Frame size must be at least "));
        }
    }

    public final int a() {
        return i[this.d][j[this.a][this.b]];
    }

    public final int b() {
        int[][] iArr = k;
        int i9 = this.a;
        int[] iArr2 = iArr[i9];
        int i10 = this.b;
        return (((a() * iArr2[i10]) / h[this.c][i9]) + this.f) * l[i10];
    }

    public final long c(long j10) {
        long j11 = (this.b == 3 ? 384 : 1152) * j10 * 1000;
        int b10 = b();
        int[] iArr = h[this.c];
        long j12 = j11 / (iArr[r0] * b10);
        return (this.a == 3 || this.e != 3) ? j12 : j12 / 2;
    }

    public final boolean d(k kVar) {
        return this.b == kVar.b && this.a == kVar.a && this.c == kVar.c && this.e == kVar.e;
    }
}
