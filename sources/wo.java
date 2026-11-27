// default package

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class wo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, cp cpVar) {
        Objects.requireNonNull(cpVar);
        vo voVar = new vo(cpVar, (byte) 0);
        bg.a(obj).registerOnBackInvokedCallback(1000000, voVar);
        return voVar;
    }

    public static void c(Object obj, Object obj2) {
        bg.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
