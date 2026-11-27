// default package

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sg0 extends b99 {
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
        baf bafVar = (baf) pair.first;
        ie9 ie9Var = (ie9) pair.second;
        try {
            bafVar.a(ie9Var);
        } catch (RuntimeException e) {
            BasePendingResult.m(ie9Var);
            throw e;
        }
    }
}
