package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ qe0(gf0 gf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.a = i7;
        this.b = gf0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final gf0 gf0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.re0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var2 = gf0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    gf0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = gf0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (gf0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        ye0 l02 = gf0Var2.l0();
                                        gf0Var2.k0.add(0, tL_chatInviteExported2);
                                        gf0Var2.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = gf0Var2.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!gf0Var2.p0) {
                                            gf0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        ye0 l03 = gf0Var2.l0();
                                        if (gf0Var2.p0 && gf0Var2.f == org.telegram.messenger.j10.i(gf0Var2.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (gf0Var2.e != null) {
                                            gf0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        gf0Var2.k0.add(0, tL_chatInviteExported2);
                                        gf0Var2.n0(l03);
                                    } else {
                                        gf0Var2.t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = gf0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            gf0Var2.getMessagesStorage().w1(gf0Var2.d.invitesCount, gf0Var2.n);
                                        }
                                    }
                                    if (gf0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                gf0 gf0Var2 = this.b;
                gf0Var2.getClass();
                org.telegram.messenger.g0.g3(new mc0(gf0Var2, tL_error, this.c, 7));
                break;
            default:
                final int i10 = 1;
                final gf0 gf0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.re0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var22 = gf0Var3;
                        switch (i102) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    gf0Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = gf0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (gf0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        ye0 l02 = gf0Var22.l0();
                                        gf0Var22.k0.add(0, tL_chatInviteExported22);
                                        gf0Var22.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ArrayList arrayList = gf0Var22.j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!gf0Var22.p0) {
                                            gf0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        ye0 l03 = gf0Var22.l0();
                                        if (gf0Var22.p0 && gf0Var22.f == org.telegram.messenger.j10.i(gf0Var22.getAccountInstance().a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (gf0Var22.e != null) {
                                            gf0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        gf0Var22.k0.add(0, tL_chatInviteExported22);
                                        gf0Var22.n0(l03);
                                    } else {
                                        gf0Var22.t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = gf0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            gf0Var22.getMessagesStorage().w1(gf0Var22.d.invitesCount, gf0Var22.n);
                                        }
                                    }
                                    if (gf0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var22), R.raw.linkbroken, 36);
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
