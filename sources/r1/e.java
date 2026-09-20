package r1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class e {
    public final long a;
    public final long b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j3;
            this.b = j10;
        }
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
