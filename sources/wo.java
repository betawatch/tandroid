// default package

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
