package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ to(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new vo(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final gp gpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                gp gpVar2 = gpVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < gpVar2.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = gpVar2.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                gpVar2.t0 = false;
                                AndroidUtilities.runOnUIThread(new vo(gpVar2, 4));
                                break;
                            default:
                                gp gpVar3 = gpVar;
                                ArrayList arrayList = gpVar3.f0;
                                gpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && gpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        gpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(gpVar3.getParentActivity(), new xo(gpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        gpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    gpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final gp gpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wo
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                gp gpVar22 = gpVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < gpVar22.X.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = gpVar22.X.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                gpVar22.t0 = false;
                                AndroidUtilities.runOnUIThread(new vo(gpVar22, 4));
                                break;
                            default:
                                gp gpVar3 = gpVar2;
                                ArrayList arrayList = gpVar3.f0;
                                gpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && gpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        gpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(gpVar3.getParentActivity(), new xo(gpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        gpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    gpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new rh(10, this.b, tL_error));
                break;
        }
    }
}
