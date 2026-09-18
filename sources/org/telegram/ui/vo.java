package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;

    public /* synthetic */ vo(ip ipVar, int i10) {
        this.a = i10;
        this.b = ipVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new xo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final ip ipVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                ip ipVar2 = ipVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < ipVar2.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = ipVar2.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ipVar2.t0 = false;
                                AndroidUtilities.runOnUIThread(new xo(ipVar2, 4));
                                break;
                            default:
                                ip ipVar3 = ipVar;
                                ArrayList arrayList = ipVar3.f0;
                                ipVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ipVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        ipVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ipVar3.getParentActivity(), new zo(ipVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        ipVar3.x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    ipVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final ip ipVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                ip ipVar22 = ipVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < ipVar22.X.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = ipVar22.X.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ipVar22.t0 = false;
                                AndroidUtilities.runOnUIThread(new xo(ipVar22, 4));
                                break;
                            default:
                                ip ipVar3 = ipVar2;
                                ArrayList arrayList = ipVar3.f0;
                                ipVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ipVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        ipVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ipVar3.getParentActivity(), new zo(ipVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        ipVar3.x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    ipVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new qh(14, this.b, tL_error));
                break;
        }
    }
}
