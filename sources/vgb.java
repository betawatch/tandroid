// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vgb {
    public static final vgb a = new vgb();

    public final xgb a(Looper looper, Handler.Callback callback) {
        return new xgb(new Handler(looper, callback));
    }
}
