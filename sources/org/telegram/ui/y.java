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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ y(l4 l4Var, TLObject tLObject, int i9, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.e = l4Var;
        this.b = tLObject;
        this.c = i9;
        this.f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.q1 K;
        int i9 = 0;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.e;
                TLObject tLObject = this.b;
                int i10 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i10).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i10).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (!(tLObject2 instanceof TLRPC.TL_webPage)) {
                    if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
                        TL_iv.Page page = webPage.cached_page;
                        if (page != null) {
                            int i11 = page.views;
                            int i12 = tL_webPageNotModified.cached_page_views;
                            if (i11 != i12) {
                                page.views = i12;
                                page.flags |= 8;
                                while (true) {
                                    p3[] p3VarArr = l4Var.q0;
                                    if (i9 >= p3VarArr.length) {
                                        if (messageObject != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(messageObject.messageOwner);
                                            MessagesStorage.getInstance(i10).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                            break;
                                        }
                                    } else {
                                        j4 j4Var = p3VarArr[i9].c;
                                        if (j4Var.A == webPage && (K = l4Var.q0[i9].b.K(j4Var.h() - 1)) != null) {
                                            l4Var.q0[i9].c.y(K);
                                        }
                                        i9++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!l4Var.Z.isEmpty() && l4Var.Z.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i10).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                l4Var.Z.add(tL_webPage);
                            } else {
                                l4Var.Z.set(0, tL_webPage);
                            }
                            if (l4Var.Z.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                l4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    l4Var.V(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        MessagesStorage.getInstance(i10).putWebPages(hVar);
                        break;
                    }
                }
                break;
            default:
                ve.d dVar = (ve.d) this.e;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f;
                TLObject tLObject3 = this.b;
                int i13 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z12 = this.d;
                if (dVar != null) {
                    dVar.b();
                } else {
                    try {
                        c2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    c2VarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    MessagesController.getInstance(i13).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i13).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                ve.e.p(context, uri, z12, false);
                break;
        }
    }

    public /* synthetic */ y(ve.d dVar, org.telegram.ui.ActionBar.c2[] c2VarArr, TLObject tLObject, int i9, Uri uri, Context context, boolean z10) {
        this.e = dVar;
        this.f = c2VarArr;
        this.b = tLObject;
        this.c = i9;
        this.h = uri;
        this.n = context;
        this.d = z10;
    }
}
