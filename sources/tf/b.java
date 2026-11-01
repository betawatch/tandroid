package tf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // tf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // tf.a
    public final int b() {
        return -1;
    }

    @Override // tf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // tf.a
    public final void d() {
        this.c = 0;
    }

    @Override // tf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
