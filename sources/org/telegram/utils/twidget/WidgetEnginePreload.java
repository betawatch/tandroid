package org.telegram.utils.twidget;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class WidgetEnginePreload implements ZygotePreload {
    public void doPreload(ApplicationInfo applicationInfo) {
        try {
            WidgetEngineService.c(applicationInfo.sourceDir);
        } catch (Throwable th2) {
            Log.e("WidgetEngine", "app zygote preload failed", th2);
        }
    }
}
