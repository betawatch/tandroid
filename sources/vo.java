// default package

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class vo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, bp bpVar) {
        Objects.requireNonNull(bpVar);
        uo uoVar = new uo(bpVar, (byte) 0);
        ag.a(obj).registerOnBackInvokedCallback(1000000, uoVar);
        return uoVar;
    }

    public static void c(Object obj, Object obj2) {
        ag.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
