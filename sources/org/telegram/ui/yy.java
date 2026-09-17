package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                    dzVar.Z();
                    cz czVar = dzVar.f;
                    if (czVar != null) {
                        czVar.a();
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
                gc1 gc1Var = themeActivity.a;
                if (gc1Var != null) {
                    gc1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
