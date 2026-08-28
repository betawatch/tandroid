package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i9, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
                ArrayList arrayList = notificationsCustomSettingsActivity.E;
                View view = this.c;
                if (!(view instanceof org.telegram.ui.Cells.v8)) {
                    notificationsCustomSettingsActivity.k0(true);
                    break;
                } else {
                    int i9 = this.d;
                    if (i9 >= 0 && i9 < arrayList.size()) {
                        ((yj0) arrayList.get(i9)).h = notificationsCustomSettingsActivity.e0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.e0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    break;
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
                View view2 = this.c;
                if (!(view2 instanceof org.telegram.ui.Cells.ba)) {
                    notificationsCustomSettingsActivity2.k0(true);
                    break;
                } else {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((yj0) arrayList2.get(i10)).f = notificationsCustomSettingsActivity2.f0();
                    }
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view2;
                    baVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.f0(), true, baVar.h);
                    break;
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.E;
                View view3 = this.c;
                if (!(view3 instanceof org.telegram.ui.Cells.ba)) {
                    notificationsCustomSettingsActivity3.k0(true);
                    break;
                } else {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((yj0) arrayList3.get(i11)).f = notificationsCustomSettingsActivity3.g0();
                    }
                    org.telegram.ui.Cells.ba baVar2 = (org.telegram.ui.Cells.ba) view3;
                    baVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.g0(), true, baVar2.h);
                    break;
                }
                break;
        }
    }
}
