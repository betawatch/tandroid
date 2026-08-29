package q2;

import java.util.Random;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends Random {
    public long a;
    public long b;

    @Override // java.util.Random
    public final int next(int i10) {
        return ((int) nextLong()) >>> (32 - i10);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return nextLong() >= 0;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i10, 8);
            while (true) {
                int i11 = min - 1;
                if (min > 0) {
                    bArr[i10] = (byte) nextLong;
                    nextLong >>>= 8;
                    i10++;
                    min = i11;
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
        long j10 = this.a;
        long j11 = this.b;
        long j12 = j10 + j11;
        long j13 = j11 ^ j10;
        this.a = (Long.rotateLeft(j10, 55) ^ j13) ^ (j13 << 14);
        this.b = Long.rotateLeft(j13, 36);
        return j12;
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.a != 0 || this.b != 0) {
            throw new RuntimeException("No seed set");
        }
    }
}
