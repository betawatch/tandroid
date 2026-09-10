package zf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j3) {
        this.b = j3;
    }

    @Override // zf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // zf.a
    public final int b() {
        return -1;
    }

    @Override // zf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // zf.a
    public final void d() {
        this.c = 0;
    }

    @Override // zf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
