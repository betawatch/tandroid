package r2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class q extends Exception {
    public final String a;
    public final boolean b;
    public final p c;
    public final String d;

    public q(b2.s sVar, u uVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, uVar, sVar.r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public q(String str, Throwable th2, String str2, boolean z10, p pVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z10;
        this.c = pVar;
        this.d = str3;
    }
}
