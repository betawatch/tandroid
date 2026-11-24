// default package

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ud2 implements ResultCallback {
    public final /* synthetic */ je2 a;
    public final /* synthetic */ xd2 b;

    public ud2(xd2 xd2Var, je2 je2Var) {
        this.b = xd2Var;
        this.a = je2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        je2 je2Var = this.a;
        ArrayList d = je2Var.d((je2Var.f.c ? 2 : 0) | 5);
        xd2 xd2Var = this.b;
        kk7.f(xd2Var.a).d(new n92(this, d, (byte) 11));
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
