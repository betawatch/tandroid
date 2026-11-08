package u2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final o c;
    public final String d;

    public p(e2.u uVar, t tVar, boolean z9, int i7) {
        this("Decoder init failed: [" + i7 + "], " + uVar, tVar, uVar.s, z9, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public p(String str, Throwable th2, String str2, boolean z9, o oVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z9;
        this.c = oVar;
        this.d = str3;
    }
}
