package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ tv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                gy gyVar = this.b;
                gyVar.r4(gyVar.E2, 104, true, true, null);
                break;
            case 1:
                gy gyVar2 = this.b;
                ArrayList arrayList = gyVar2.E2;
                if (gyVar2.getParentActivity() != null) {
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat chat = gyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z10 = false;
                        }
                    }
                    org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(gyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gv(gyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new gv(gyVar2, 20), z10);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                gy gyVar3 = this.b;
                gyVar3.getContactsController().loadGlobalPrivacySetting();
                gyVar3.K4();
                break;
        }
        return true;
    }
}
