package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ rv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                fyVar.r4(fyVar.E2, 104, true, true, null);
                break;
            case 1:
                fy fyVar2 = this.b;
                ArrayList arrayList = fyVar2.E2;
                if (fyVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = fyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(fyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ev(fyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new ev(fyVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                fy fyVar3 = this.b;
                fyVar3.getContactsController().loadGlobalPrivacySetting();
                fyVar3.K4();
                break;
        }
        return true;
    }
}
