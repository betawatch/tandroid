package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zw(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                ex exVar = (ex) ((j2.n) this.c).c;
                if (i7 == 0) {
                    exVar.e.remove(this.b - exVar.n);
                    exVar.e0();
                    dx dxVar = exVar.f;
                    if (dxVar != null) {
                        dxVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.c, this.b, i7);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                f61 f61Var = themeActivity.a;
                if (f61Var != null) {
                    f61Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
