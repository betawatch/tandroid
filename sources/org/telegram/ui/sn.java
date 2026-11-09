package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ sn(io ioVar, int i7) {
        this.a = i7;
        this.b = ioVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new tn(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i7 = 0;
                final io ioVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                io ioVar2 = ioVar;
                                ArrayList arrayList = ioVar2.f0;
                                ioVar2.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ioVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        ioVar2.n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ioVar2.getParentActivity(), new wn(ioVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z9 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        ioVar2.y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    ioVar2.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                io ioVar3 = ioVar;
                                if (z10) {
                                    for (int i12 = 0; i12 < ioVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = ioVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ioVar3.s0 = false;
                                org.telegram.messenger.g0.h3(new tn(ioVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final io ioVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                io ioVar22 = ioVar2;
                                ArrayList arrayList = ioVar22.f0;
                                ioVar22.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ioVar22.getParentActivity() != null) {
                                    for (int i102 = 0; i102 < arrayList.size(); i102++) {
                                        ioVar22.n.removeView((View) arrayList.get(i102));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ioVar22.getParentActivity(), new wn(ioVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z9 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        ioVar22.y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    ioVar22.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                io ioVar3 = ioVar2;
                                if (z10) {
                                    for (int i12 = 0; i12 < ioVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = ioVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ioVar3.s0 = false;
                                org.telegram.messenger.g0.h3(new tn(ioVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                org.telegram.messenger.g0.h3(new rf(21, this.b, tL_error));
                break;
        }
    }
}
