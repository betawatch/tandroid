package org.telegram.utils.twidget;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class WidgetEnginePreload implements ZygotePreload {
    public void doPreload(ApplicationInfo applicationInfo) {
        try {
            WidgetEngineService.e(applicationInfo.sourceDir);
        } catch (Throwable th) {
            Log.e("WidgetEngine", "app zygote preload failed", th);
        }
    }
}
