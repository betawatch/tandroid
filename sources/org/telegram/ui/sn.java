package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ sn(jo joVar, int i7) {
        this.a = i7;
        this.b = joVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(new tn(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i7 = 0;
                final jo joVar = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                jo joVar2 = joVar;
                                ArrayList arrayList = joVar2.g0;
                                joVar2.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && joVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        joVar2.n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(joVar2.getParentActivity(), new xn(joVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        joVar2.y.addView(nVar, c8.ma.o(-1, 72));
                                    }
                                    joVar2.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                jo joVar3 = joVar;
                                if (z11) {
                                    for (int i12 = 0; i12 < joVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = joVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                joVar3.t0 = false;
                                org.telegram.messenger.g0.g3(new tn(joVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final jo joVar2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.vn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jo joVar22 = joVar2;
                                ArrayList arrayList = joVar22.g0;
                                joVar22.e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && joVar22.getParentActivity() != null) {
                                    for (int i102 = 0; i102 < arrayList.size(); i102++) {
                                        joVar22.n.removeView((View) arrayList.get(i102));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(joVar22.getParentActivity(), new xn(joVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        joVar22.y.addView(nVar, c8.ma.o(-1, 72));
                                    }
                                    joVar22.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                jo joVar3 = joVar2;
                                if (z11) {
                                    for (int i12 = 0; i12 < joVar3.Y.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = joVar3.Y.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                joVar3.t0 = false;
                                org.telegram.messenger.g0.g3(new tn(joVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                org.telegram.messenger.g0.g3(new ci(6, this.b, tL_error));
                break;
        }
    }
}
