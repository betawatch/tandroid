package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ty(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                yy yyVar = ((uy) this.c).b;
                if (i10 == 0) {
                    yyVar.e.remove(this.b - yyVar.n);
                    yyVar.Z();
                    xy xyVar = yyVar.f;
                    if (xyVar != null) {
                        xyVar.a();
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
                sb1 sb1Var = themeActivity.a;
                if (sb1Var != null) {
                    sb1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
