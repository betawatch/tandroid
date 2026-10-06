package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ uo(hp hpVar, int i10) {
        this.a = i10;
        this.b = hpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new wo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final hp hpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                hp hpVar2 = hpVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < hpVar2.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = hpVar2.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hpVar2.u0 = false;
                                AndroidUtilities.runOnUIThread(new wo(hpVar2, 4));
                                break;
                            default:
                                hp hpVar3 = hpVar;
                                ArrayList arrayList = hpVar3.g0;
                                hpVar3.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        hpVar3.n.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hpVar3.getParentActivity(), new yo(hpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        hpVar3.y.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    hpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final hp hpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                hp hpVar22 = hpVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < hpVar22.Y.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = hpVar22.Y.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hpVar22.u0 = false;
                                AndroidUtilities.runOnUIThread(new wo(hpVar22, 4));
                                break;
                            default:
                                hp hpVar3 = hpVar2;
                                ArrayList arrayList = hpVar3.g0;
                                hpVar3.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        hpVar3.n.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hpVar3.getParentActivity(), new yo(hpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        hpVar3.y.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    hpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new oh(14, this.b, tL_error));
                break;
        }
    }
}
