package y3;

import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final n c;
    public final String d;

    public p(t0 t0Var, t tVar, boolean z10, int i9) {
        this("Decoder init failed: [" + i9 + "], " + t0Var, tVar, t0Var.B, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i9 < 0 ? "neg_" : "") + Math.abs(i9));
    }

    public p(String str, Throwable th, String str2, boolean z10, n nVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z10;
        this.c = nVar;
        this.d = str3;
    }
}
