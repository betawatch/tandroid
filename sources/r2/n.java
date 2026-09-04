package r2;

import android.media.MediaCodec;
import android.os.Build;
import e2.d0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class n extends h2.e {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(IllegalStateException illegalStateException, o oVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(oVar == null ? null : oVar.a);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        this.a = Build.VERSION.SDK_INT >= 23 ? z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : d0.y(z10 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
