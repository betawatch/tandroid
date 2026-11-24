// default package

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class td2 implements ResultCallback {
    public final /* synthetic */ je2 a;
    public final /* synthetic */ xd2 b;

    public td2(xd2 xd2Var, je2 je2Var) {
        this.b = xd2Var;
        this.a = je2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ArrayList d = this.a.d(7);
        xd2 xd2Var = this.b;
        kk7.f(xd2Var.a).d(new n92(this, d, (byte) 10));
        xd2Var.U1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
