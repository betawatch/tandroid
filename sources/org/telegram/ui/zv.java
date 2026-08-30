package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ zv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                oyVar.r4(oyVar.F2, 104, true, true, null);
                break;
            case 1:
                oy oyVar2 = this.b;
                ArrayList arrayList = oyVar2.F2;
                if (oyVar2.getParentActivity() != null) {
                    boolean z4 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            z4 = false;
                        }
                        TLRPC.Chat chat = oyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat != null && !ChatObject.canWriteToChat(chat)) {
                            z4 = false;
                        }
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(oyVar2, view);
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mv(oyVar2, 19), false);
                    H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new mv(oyVar2, 20), z4);
                    H.Z();
                    break;
                }
                break;
            case 2:
                this.b.p4(view);
                break;
            default:
                oy oyVar3 = this.b;
                oyVar3.getContactsController().loadGlobalPrivacySetting();
                oyVar3.K4();
                break;
        }
        return true;
    }
}
