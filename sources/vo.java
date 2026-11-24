// default package

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, bp bpVar) {
        Objects.requireNonNull(bpVar);
        uo uoVar = new uo(bpVar, (byte) 0);
        zf.a(obj).registerOnBackInvokedCallback(1000000, uoVar);
        return uoVar;
    }

    public static void c(Object obj, Object obj2) {
        zf.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
