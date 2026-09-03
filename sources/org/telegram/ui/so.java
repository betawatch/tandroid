package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp b;

    public /* synthetic */ so(fp fpVar, int i10) {
        this.a = i10;
        this.b = fpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new uo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final fp fpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                fp fpVar2 = fpVar;
                                if (z4) {
                                    for (int i11 = 0; i11 < fpVar2.U.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = fpVar2.U.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                fpVar2.q0 = false;
                                AndroidUtilities.runOnUIThread(new uo(fpVar2, 4));
                                break;
                            default:
                                fp fpVar3 = fpVar;
                                ArrayList arrayList = fpVar3.c0;
                                fpVar3.a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && fpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        fpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(fpVar3.getParentActivity(), new wo(fpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z10 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        fpVar3.x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    fpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final fp fpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                fp fpVar22 = fpVar2;
                                if (z4) {
                                    for (int i112 = 0; i112 < fpVar22.U.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = fpVar22.U.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                fpVar22.q0 = false;
                                AndroidUtilities.runOnUIThread(new uo(fpVar22, 4));
                                break;
                            default:
                                fp fpVar3 = fpVar2;
                                ArrayList arrayList = fpVar3.c0;
                                fpVar3.a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && fpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        fpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(fpVar3.getParentActivity(), new wo(fpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z10 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        fpVar3.x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    fpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new hc(27, this.b, tL_error));
                break;
        }
    }
}
