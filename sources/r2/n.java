package r2;

import android.media.MediaCodec;
import android.os.Build;
import e2.d0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class n extends h2.f {
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
