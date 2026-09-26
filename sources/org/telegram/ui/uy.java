package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                yb1 yb1Var = themeActivity.a;
                if (yb1Var != null) {
                    yb1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
