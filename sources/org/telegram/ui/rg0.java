package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ rg0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = hh0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final hh0 hh0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var2 = hh0Var;
                                    hh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = hh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (hh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var2.f0();
                                        hh0Var2.f0.add(0, tL_chatInviteExported3);
                                        hh0Var2.h0(f02);
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                hh0 hh0Var3 = hh0Var;
                                ArrayList arrayList = hh0Var3.e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var3.k0) {
                                            hh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var3.f0();
                                        if (hh0Var3.k0 && hh0Var3.f == hh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var3.e != null) {
                                            hh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var3.f0.add(0, tL_chatInviteExported4);
                                        hh0Var3.h0(f03);
                                    } else {
                                        hh0Var3.o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var3.getMessagesStorage().saveChatLinksCount(hh0Var3.n, hh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var3.getParentActivity() != null) {
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                hh0 hh0Var2 = this.b;
                hh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new xe0(hh0Var2, tL_error, this.c, 5));
                break;
            default:
                final int i11 = 1;
                final hh0 hh0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var22 = hh0Var3;
                                    hh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = hh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (hh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var22.f0();
                                        hh0Var22.f0.add(0, tL_chatInviteExported3);
                                        hh0Var22.h0(f02);
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                hh0 hh0Var32 = hh0Var3;
                                ArrayList arrayList = hh0Var32.e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var32.k0) {
                                            hh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var32.f0();
                                        if (hh0Var32.k0 && hh0Var32.f == hh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var32.e != null) {
                                            hh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var32.f0.add(0, tL_chatInviteExported4);
                                        hh0Var32.h0(f03);
                                    } else {
                                        hh0Var32.o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var32.getMessagesStorage().saveChatLinksCount(hh0Var32.n, hh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var32.getParentActivity() != null) {
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var32), R.raw.linkbroken, 36);
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
