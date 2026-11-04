package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.a) {
            case 0:
                cx cxVar = (cx) ((mi.h0) this.c).c;
                if (i3 == 0) {
                    cxVar.e.remove(this.b - cxVar.n);
                    cxVar.e0();
                    bx bxVar = cxVar.f;
                    if (bxVar != null) {
                        bxVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.c, this.b, i3);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putInt("sortContactsBy", i3);
                edit.commit();
                v51 v51Var = themeActivity.a;
                if (v51Var != null) {
                    v51Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
