package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yy(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                dz dzVar = ((zy) this.c).b;
                if (i10 == 0) {
                    dzVar.e.remove(this.b - dzVar.n);
                    dzVar.Y();
                    cz czVar = dzVar.f;
                    if (czVar != null) {
                        czVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                zb1 zb1Var = themeActivity.a;
                if (zb1Var != null) {
                    zb1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
