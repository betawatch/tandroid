// default package

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rg0 extends o59 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        k5f k5fVar = (k5f) pair.first;
        ua9 ua9Var = (ua9) pair.second;
        try {
            k5fVar.a(ua9Var);
        } catch (RuntimeException e) {
            BasePendingResult.m(ua9Var);
            throw e;
        }
    }
}
