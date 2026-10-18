package r2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final o c;
    public final String d;

    public p(b2.w wVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + wVar, tVar, wVar.s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z10;
        this.c = oVar;
        this.d = str3;
    }
}
