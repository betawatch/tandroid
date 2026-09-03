package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uy(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                zy zyVar = ((vy) this.c).b;
                if (i10 == 0) {
                    zyVar.e.remove(this.b - zyVar.n);
                    zyVar.Z();
                    yy yyVar = zyVar.f;
                    if (yyVar != null) {
                        yyVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                tb1 tb1Var = themeActivity.a;
                if (tb1Var != null) {
                    tb1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
