package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ xo(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new zo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final kp kpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ap
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                kp kpVar2 = kpVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < kpVar2.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = kpVar2.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                kpVar2.t0 = false;
                                AndroidUtilities.runOnUIThread(new zo(kpVar2, 4));
                                break;
                            default:
                                kp kpVar3 = kpVar;
                                ArrayList arrayList = kpVar3.f0;
                                kpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && kpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        kpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(kpVar3.getParentActivity(), new bp(kpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        kpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    kpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final kp kpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ap
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                kp kpVar22 = kpVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < kpVar22.X.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = kpVar22.X.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                kpVar22.t0 = false;
                                AndroidUtilities.runOnUIThread(new zo(kpVar22, 4));
                                break;
                            default:
                                kp kpVar3 = kpVar2;
                                ArrayList arrayList = kpVar3.f0;
                                kpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && kpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        kpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(kpVar3.getParentActivity(), new bp(kpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        kpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    kpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new wh(10, this.b, tL_error));
                break;
        }
    }
}
