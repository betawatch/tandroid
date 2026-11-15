package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ rn(ho hoVar, int i7) {
        this.a = i7;
        this.b = hoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new sn(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i7 = 0;
                final ho hoVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.un
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                ho hoVar2 = hoVar;
                                ArrayList arrayList = hoVar2.g0;
                                hoVar2.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hoVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        hoVar2.n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hoVar2.getParentActivity(), new vn(hoVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        hoVar2.y.addView(nVar, c8.ja.o(-1, 72));
                                    }
                                    hoVar2.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ho hoVar3 = hoVar;
                                if (z11) {
                                    for (int i12 = 0; i12 < hoVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = hoVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hoVar3.t0 = false;
                                org.telegram.messenger.g0.h3(new sn(hoVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final ho hoVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.un
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ho hoVar22 = hoVar2;
                                ArrayList arrayList = hoVar22.g0;
                                hoVar22.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hoVar22.getParentActivity() != null) {
                                    for (int i102 = 0; i102 < arrayList.size(); i102++) {
                                        hoVar22.n.removeView((View) arrayList.get(i102));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hoVar22.getParentActivity(), new vn(hoVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        hoVar22.y.addView(nVar, c8.ja.o(-1, 72));
                                    }
                                    hoVar22.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ho hoVar3 = hoVar2;
                                if (z11) {
                                    for (int i12 = 0; i12 < hoVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = hoVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hoVar3.t0 = false;
                                org.telegram.messenger.g0.h3(new sn(hoVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                org.telegram.messenger.g0.h3(new zg(10, this.b, tL_error));
                break;
        }
    }
}
