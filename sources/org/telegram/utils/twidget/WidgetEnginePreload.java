package org.telegram.utils.twidget;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
