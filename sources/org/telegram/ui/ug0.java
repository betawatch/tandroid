package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ ug0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = kh0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final kh0 kh0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var2 = kh0Var;
                                    kh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = kh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (kh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        bh0 f02 = kh0Var2.f0();
                                        kh0Var2.f0.add(0, tL_chatInviteExported3);
                                        kh0Var2.h0(f02);
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                kh0 kh0Var3 = kh0Var;
                                ArrayList arrayList = kh0Var3.e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var3.k0) {
                                            kh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 f03 = kh0Var3.f0();
                                        if (kh0Var3.k0 && kh0Var3.f == kh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var3.e != null) {
                                            kh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var3.f0.add(0, tL_chatInviteExported4);
                                        kh0Var3.h0(f03);
                                    } else {
                                        kh0Var3.o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var3.getMessagesStorage().saveChatLinksCount(kh0Var3.n, kh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                kh0 kh0Var2 = this.b;
                kh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new bf0(kh0Var2, tL_error, this.c, 5));
                break;
            default:
                final int i11 = 1;
                final kh0 kh0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var22 = kh0Var3;
                                    kh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = kh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (kh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        bh0 f02 = kh0Var22.f0();
                                        kh0Var22.f0.add(0, tL_chatInviteExported3);
                                        kh0Var22.h0(f02);
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                kh0 kh0Var32 = kh0Var3;
                                ArrayList arrayList = kh0Var32.e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var32.k0) {
                                            kh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 f03 = kh0Var32.f0();
                                        if (kh0Var32.k0 && kh0Var32.f == kh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var32.e != null) {
                                            kh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var32.f0.add(0, tL_chatInviteExported4);
                                        kh0Var32.h0(f03);
                                    } else {
                                        kh0Var32.o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var32.getMessagesStorage().saveChatLinksCount(kh0Var32.n, kh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var32), R.raw.linkbroken, 36);
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
