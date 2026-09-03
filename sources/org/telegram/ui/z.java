package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ z(n4 n4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.e = n4Var;
        this.b = tLObject;
        this.c = i10;
        this.f = webPage;
        this.h = messageObject;
        this.d = z4;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.l1 K;
        int i10 = 0;
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.e;
                TLObject tLObject = this.b;
                int i11 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z4 = this.d;
                String str = (String) this.n;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z10) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (!(tLObject2 instanceof TLRPC.TL_webPage)) {
                    if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
                        TL_iv.Page page = webPage.cached_page;
                        if (page != null) {
                            int i12 = page.views;
                            int i13 = tL_webPageNotModified.cached_page_views;
                            if (i12 != i13) {
                                page.views = i13;
                                page.flags |= 8;
                                while (true) {
                                    r3[] r3VarArr = n4Var.r0;
                                    if (i10 >= r3VarArr.length) {
                                        if (messageObject != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(messageObject.messageOwner);
                                            MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                            break;
                                        }
                                    } else {
                                        l4 l4Var = r3VarArr[i10].c;
                                        if (l4Var.B == webPage && (K = n4Var.r0[i10].b.K(l4Var.h() - 1)) != null) {
                                            n4Var.r0[i10].c.y(K);
                                        }
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!n4Var.a0.isEmpty() && n4Var.a0.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z4) {
                                n4Var.a0.add(tL_webPage);
                            } else {
                                n4Var.a0.set(0, tL_webPage);
                            }
                            if (n4Var.a0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                n4Var.e0(z4 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    n4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        MessagesStorage.getInstance(i11).putWebPages(hVar);
                        break;
                    }
                }
                break;
            default:
                ze.c cVar = (ze.c) this.e;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f;
                TLObject tLObject3 = this.b;
                int i14 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z11 = this.d;
                if (cVar != null) {
                    cVar.b();
                } else {
                    try {
                        d2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    d2VarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    MessagesController.getInstance(i14).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i14).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                ze.d.p(context, uri, z11, false);
                break;
        }
    }

    public /* synthetic */ z(ze.c cVar, org.telegram.ui.ActionBar.d2[] d2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z4) {
        this.e = cVar;
        this.f = d2VarArr;
        this.b = tLObject;
        this.c = i10;
        this.h = uri;
        this.n = context;
        this.d = z4;
    }
}
