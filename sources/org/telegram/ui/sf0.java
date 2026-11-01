package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ sf0(ig0 ig0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = ig0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ig0 ig0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.tf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ig0 ig0Var2 = ig0Var;
                        switch (i11) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ig0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ig0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ig0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        zf0 l02 = ig0Var2.l0();
                                        ig0Var2.j0.add(0, tL_chatInviteExported2);
                                        ig0Var2.n0(l02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = ig0Var2.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ig0Var2.o0) {
                                            ig0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        zf0 l03 = ig0Var2.l0();
                                        if (ig0Var2.o0 && ig0Var2.f == org.telegram.messenger.e20.i(ig0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ig0Var2.e != null) {
                                            ig0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ig0Var2.j0.add(0, tL_chatInviteExported2);
                                        ig0Var2.n0(l03);
                                    } else {
                                        ig0Var2.s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ig0Var2.d;
                                        if (chatFull2 != null) {
                                            int i12 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i12;
                                            if (i12 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ig0Var2.getMessagesStorage().w1(ig0Var2.d.invitesCount, ig0Var2.n);
                                        }
                                    }
                                    if (ig0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                ig0 ig0Var2 = this.b;
                ig0Var2.getClass();
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.i0.g3(new pd0(ig0Var2, tL_error, tL_chatInviteExported2, false, 8));
                break;
            default:
                final int i11 = 1;
                final ig0 ig0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.tf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ig0 ig0Var22 = ig0Var3;
                        switch (i112) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported32 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ig0Var22.e = tL_chatInviteExported32;
                                    TLRPC.ChatFull chatFull = ig0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported32;
                                    }
                                    if (ig0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        zf0 l02 = ig0Var22.l0();
                                        ig0Var22.j0.add(0, tL_chatInviteExported22);
                                        ig0Var22.n0(l02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = ig0Var22.i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ig0Var22.o0) {
                                            ig0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        zf0 l03 = ig0Var22.l0();
                                        if (ig0Var22.o0 && ig0Var22.f == org.telegram.messenger.e20.i(ig0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ig0Var22.e != null) {
                                            ig0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ig0Var22.j0.add(0, tL_chatInviteExported22);
                                        ig0Var22.n0(l03);
                                    } else {
                                        ig0Var22.s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ig0Var22.d;
                                        if (chatFull2 != null) {
                                            int i12 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i12;
                                            if (i12 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ig0Var22.getMessagesStorage().w1(ig0Var22.d.invitesCount, ig0Var22.n);
                                        }
                                    }
                                    if (ig0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var22), R.raw.linkbroken, 36);
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
