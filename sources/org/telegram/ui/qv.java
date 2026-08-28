package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ qv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                dyVar.r4(dyVar.E2, 104, true, true, null);
                break;
            case 1:
                dy dyVar2 = this.b;
                ArrayList arrayList = dyVar2.E2;
                if (dyVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        long longValue = ((Long) arrayList.get(i9)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = dyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(dyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new dv(dyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new dv(dyVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                dy dyVar3 = this.b;
                dyVar3.getContactsController().loadGlobalPrivacySetting();
                dyVar3.K4();
                break;
        }
        return true;
    }
}
