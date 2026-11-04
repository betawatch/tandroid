package t2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final o c;
    public final String d;

    public p(d2.v vVar, t tVar, boolean z10, int i3) {
        this("Decoder init failed: [" + i3 + "], " + vVar, tVar, vVar.s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i3 < 0 ? "neg_" : "") + Math.abs(i3));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z10;
        this.c = oVar;
        this.d = str3;
    }
}
