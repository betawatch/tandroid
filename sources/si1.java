// default package

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class si1 implements ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;

    public si1(ti1 ti1Var, int i) {
        this.b = ti1Var;
        this.a = i;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        nm7.f(this.a).d(new y31(this, (List) obj, (byte) 25));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
