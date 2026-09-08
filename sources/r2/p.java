package r2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final o c;
    public final String d;

    public p(b2.s sVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, tVar, sVar.r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z10;
        this.c = oVar;
        this.d = str3;
    }
}
