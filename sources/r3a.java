// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r3a implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ s3a b;

    public r3a(s3a s3aVar, Runnable runnable) {
        this.b = s3aVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new q3a((Object) this, (Object) tLObject, (Object) this.a, (byte) 0));
    }
}
