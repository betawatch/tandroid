package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ vg0(lh0 lh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = lh0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final lh0 lh0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    lh0 lh0Var2 = lh0Var;
                                    lh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = lh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (lh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ch0 h02 = lh0Var2.h0();
                                        lh0Var2.j0.add(0, tL_chatInviteExported3);
                                        lh0Var2.j0(h02);
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(lh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                lh0 lh0Var3 = lh0Var;
                                ArrayList arrayList = lh0Var3.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!lh0Var3.o0) {
                                            lh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ch0 h03 = lh0Var3.h0();
                                        if (lh0Var3.o0 && lh0Var3.f == lh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (lh0Var3.e != null) {
                                            lh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        lh0Var3.j0.add(0, tL_chatInviteExported4);
                                        lh0Var3.j0(h03);
                                    } else {
                                        lh0Var3.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = lh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            lh0Var3.getMessagesStorage().saveChatLinksCount(lh0Var3.n, lh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (lh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(lh0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                lh0 lh0Var2 = this.b;
                lh0Var2.getClass();
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new ne0(lh0Var2, tL_error, tL_chatInviteExported2, false, 8));
                break;
            default:
                final int i11 = 1;
                final lh0 lh0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    lh0 lh0Var22 = lh0Var3;
                                    lh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = lh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (lh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported32 = tL_chatInviteExported3;
                                        tL_chatInviteExported32.revoked = true;
                                        ch0 h02 = lh0Var22.h0();
                                        lh0Var22.j0.add(0, tL_chatInviteExported32);
                                        lh0Var22.j0(h02);
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(lh0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                lh0 lh0Var32 = lh0Var3;
                                ArrayList arrayList = lh0Var32.i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported3;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!lh0Var32.o0) {
                                            lh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ch0 h03 = lh0Var32.h0();
                                        if (lh0Var32.o0 && lh0Var32.f == lh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (lh0Var32.e != null) {
                                            lh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        lh0Var32.j0.add(0, tL_chatInviteExported4);
                                        lh0Var32.j0(h03);
                                    } else {
                                        lh0Var32.s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = lh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            lh0Var32.getMessagesStorage().saveChatLinksCount(lh0Var32.n, lh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (lh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(lh0Var32), R.raw.linkbroken, 36);
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
