// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vw3 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vw3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hl.c3(new lw3((Object) this, (byte) 2));
                break;
            case 1:
                if (((sf6) obj).O != null) {
                    hl.c3(new z96(this, (byte) 7));
                    break;
                }
                break;
            case 2:
                hl.c3(new fe7(this, (byte) 24));
                break;
            case 3:
                try {
                    Socket socket = ((c59) obj).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                bu6 bu6Var = (bu6) obj;
                ArrayDeque arrayDeque = bu6Var.h;
                if (!arrayDeque.isEmpty() && bu6Var.k == null && bu6Var.b != 0) {
                    v99 v99Var = bu6Var.c;
                    int[] e = qd1.e(arrayDeque);
                    v99Var.getClass();
                    xve.e("Must be called from the main thread.");
                    if (v99Var.w()) {
                        hed hedVar = new hed(v99Var, e);
                        v99.x(hedVar);
                        basePendingResult = hedVar;
                    } else {
                        basePendingResult = v99.t();
                    }
                    bu6Var.k = basePendingResult;
                    basePendingResult.i(new baf(bu6Var, (byte) 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
