package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;

    public /* synthetic */ zg0(ph0 ph0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.a = i10;
        this.b = ph0Var;
        this.c = tL_chatInviteExported;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ph0 ph0Var = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ah0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ph0 ph0Var2 = ph0Var;
                                    ph0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = ph0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (ph0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        gh0 f02 = ph0Var2.f0();
                                        ph0Var2.g0.add(0, tL_chatInviteExported3);
                                        ph0Var2.h0(f02);
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ph0 ph0Var3 = ph0Var;
                                ArrayList arrayList = ph0Var3.f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ph0Var3.l0) {
                                            ph0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        gh0 f03 = ph0Var3.f0();
                                        if (ph0Var3.l0 && ph0Var3.f == ph0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ph0Var3.e != null) {
                                            ph0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ph0Var3.g0.add(0, tL_chatInviteExported4);
                                        ph0Var3.h0(f03);
                                    } else {
                                        ph0Var3.p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ph0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ph0Var3.getMessagesStorage().saveChatLinksCount(ph0Var3.n, ph0Var3.d.invitesCount);
                                        }
                                    }
                                    if (ph0Var3.getParentActivity() != null) {
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var3), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                ph0 ph0Var2 = this.b;
                ph0Var2.getClass();
                AndroidUtilities.runOnUIThread(new hf0(ph0Var2, tL_error, this.c, 5));
                break;
            default:
                final int i11 = 1;
                final ph0 ph0Var3 = this.b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ah0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ph0 ph0Var22 = ph0Var3;
                                    ph0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = ph0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (ph0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        gh0 f02 = ph0Var22.f0();
                                        ph0Var22.g0.add(0, tL_chatInviteExported3);
                                        ph0Var22.h0(f02);
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var22), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ph0 ph0Var32 = ph0Var3;
                                ArrayList arrayList = ph0Var32.f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ph0Var32.l0) {
                                            ph0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        gh0 f03 = ph0Var32.f0();
                                        if (ph0Var32.l0 && ph0Var32.f == ph0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ph0Var32.e != null) {
                                            ph0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ph0Var32.g0.add(0, tL_chatInviteExported4);
                                        ph0Var32.h0(f03);
                                    } else {
                                        ph0Var32.p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ph0Var32.d;
                                        if (chatFull2 != null) {
                                            int i112 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i112;
                                            if (i112 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ph0Var32.getMessagesStorage().saveChatLinksCount(ph0Var32.n, ph0Var32.d.invitesCount);
                                        }
                                    }
                                    if (ph0Var32.getParentActivity() != null) {
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var32), R.raw.linkbroken, 36);
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
