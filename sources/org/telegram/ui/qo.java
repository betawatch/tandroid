package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ qo(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new so(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final dp dpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.to
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                dp dpVar2 = dpVar;
                                if (z4) {
                                    for (int i11 = 0; i11 < dpVar2.U.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = dpVar2.U.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                dpVar2.q0 = false;
                                AndroidUtilities.runOnUIThread(new so(dpVar2, 4));
                                break;
                            default:
                                dp dpVar3 = dpVar;
                                ArrayList arrayList = dpVar3.c0;
                                dpVar3.a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && dpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        dpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(dpVar3.getParentActivity(), new uo(dpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z10 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        dpVar3.x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    dpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final dp dpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.to
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                dp dpVar22 = dpVar2;
                                if (z4) {
                                    for (int i112 = 0; i112 < dpVar22.U.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = dpVar22.U.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                dpVar22.q0 = false;
                                AndroidUtilities.runOnUIThread(new so(dpVar22, 4));
                                break;
                            default:
                                dp dpVar3 = dpVar2;
                                ArrayList arrayList = dpVar3.c0;
                                dpVar3.a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && dpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        dpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(dpVar3.getParentActivity(), new uo(dpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z10 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        dpVar3.x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    dpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new yb(28, this.b, tL_error));
                break;
        }
    }
}
