package u2;

import android.media.MediaCodec;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class n extends k2.f {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(IllegalStateException illegalStateException, o oVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(oVar == null ? null : oVar.a);
        boolean z9 = illegalStateException instanceof MediaCodec.CodecException;
        if (z9) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = z9 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
