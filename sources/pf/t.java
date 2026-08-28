package pf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ t(u uVar, int i9) {
        this.a = i9;
        this.b = uVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final u uVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: pf.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i9;
                        TLObject tLObject2 = tLObject;
                        u uVar2 = uVar;
                        switch (i10) {
                            case 0:
                                int i11 = uVar2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    uVar2.b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    uVar2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = uVar2.b;
                                int i12 = uVar2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    uVar2.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                uVar2.c = false;
                                uVar2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final u uVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: pf.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        u uVar22 = uVar2;
                        switch (i102) {
                            case 0:
                                int i11 = uVar22.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    uVar22.b.add(tL_businessChatLink);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    uVar22.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = uVar22.b;
                                int i12 = uVar22.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    MessagesController.getInstance(i12).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i12).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i12).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    uVar22.f();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                uVar22.c = false;
                                uVar22.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
