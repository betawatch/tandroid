// default package

import java.util.Random;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yyc extends Random {
    public long a;
    public long b;

    @Override // java.util.Random
    public final int next(int i) {
        return ((int) nextLong()) >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return nextLong() >= 0;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i, 8);
            while (true) {
                int i2 = min - 1;
                if (min > 0) {
                    bArr[i] = (byte) nextLong;
                    nextLong >>>= 8;
                    i++;
                    min = i2;
                }
            }
        }
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (((int) nextLong()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public final long nextLong() {
        long j = this.a;
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        this.a = (Long.rotateLeft(j, 55) ^ j4) ^ (j4 << 14);
        this.b = Long.rotateLeft(j4, 36);
        return j3;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.a == 0 && this.b == 0) {
            return;
        }
        wn4.j("No seed set");
    }
}
