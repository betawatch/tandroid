package y3;

import android.media.MediaCodec;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class l extends k3.g {
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(IllegalStateException illegalStateException, n nVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String str = null;
        sb2.append(nVar == null ? null : nVar.a);
        if (f0.a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = str;
    }
}
