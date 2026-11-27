// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class ou8 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
