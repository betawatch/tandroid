package u2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
