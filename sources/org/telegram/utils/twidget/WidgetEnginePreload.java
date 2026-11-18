package org.telegram.utils.twidget;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
