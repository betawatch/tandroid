package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ tf0(kg0 kg0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = kg0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final kg0 kg0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kg0 kg0Var2 = kg0Var;
                        switch (i11) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    kg0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = kg0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (kg0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        bg0 k02 = kg0Var2.k0();
                                        kg0Var2.j0.add(0, tL_chatInviteExported2);
                                        kg0Var2.m0(k02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = kg0Var2.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kg0Var2.o0) {
                                            kg0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        bg0 k03 = kg0Var2.k0();
                                        if (kg0Var2.o0 && kg0Var2.f == org.telegram.messenger.d20.i(kg0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kg0Var2.e != null) {
                                            kg0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kg0Var2.j0.add(0, tL_chatInviteExported2);
                                        kg0Var2.m0(k03);
                                    } else {
                                        kg0Var2.s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kg0Var2.d;
                                        if (chatFull2 != null) {
                                            int i12 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i12;
                                            if (i12 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kg0Var2.getMessagesStorage().w1(kg0Var2.d.invitesCount, kg0Var2.n);
                                        }
                                    }
                                    if (kg0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                kg0 kg0Var2 = this.b;
                kg0Var2.getClass();
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.i0.g3(new qd0(kg0Var2, tL_error, tL_chatInviteExported2, false, 8));
                break;
            default:
                final int i11 = 1;
                final kg0 kg0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kg0 kg0Var22 = kg0Var3;
                        switch (i112) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported32 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    kg0Var22.e = tL_chatInviteExported32;
                                    TLRPC.ChatFull chatFull = kg0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported32;
                                    }
                                    if (kg0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        bg0 k02 = kg0Var22.k0();
                                        kg0Var22.j0.add(0, tL_chatInviteExported22);
                                        kg0Var22.m0(k02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = kg0Var22.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kg0Var22.o0) {
                                            kg0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        bg0 k03 = kg0Var22.k0();
                                        if (kg0Var22.o0 && kg0Var22.f == org.telegram.messenger.d20.i(kg0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kg0Var22.e != null) {
                                            kg0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kg0Var22.j0.add(0, tL_chatInviteExported22);
                                        kg0Var22.m0(k03);
                                    } else {
                                        kg0Var22.s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kg0Var22.d;
                                        if (chatFull2 != null) {
                                            int i12 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i12;
                                            if (i12 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kg0Var22.getMessagesStorage().w1(kg0Var22.d.invitesCount, kg0Var22.n);
                                        }
                                    }
                                    if (kg0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
