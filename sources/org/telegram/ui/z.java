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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public /* synthetic */ z(m4 m4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.e = m4Var;
        this.b = tLObject;
        this.c = i10;
        this.f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.o1 K;
        int i10 = 0;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.e;
                TLObject tLObject = this.b;
                int i11 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z11) {
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
                                    q3[] q3VarArr = m4Var.q0;
                                    if (i10 >= q3VarArr.length) {
                                        if (messageObject != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(messageObject.messageOwner);
                                            MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                            break;
                                        }
                                    } else {
                                        k4 k4Var = q3VarArr[i10].c;
                                        if (k4Var.A == webPage && (K = m4Var.q0[i10].b.K(k4Var.h() - 1)) != null) {
                                            m4Var.q0[i10].c.y(K);
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
                        if (!m4Var.Z.isEmpty() && m4Var.Z.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i11).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                m4Var.Z.add(tL_webPage);
                            } else {
                                m4Var.Z.set(0, tL_webPage);
                            }
                            if (m4Var.Z.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                m4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    m4Var.V(str, false);
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
                we.d dVar = (we.d) this.e;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f;
                TLObject tLObject3 = this.b;
                int i14 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z12 = this.d;
                if (dVar != null) {
                    dVar.b();
                } else {
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
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
                we.e.p(context, uri, z12, false);
                break;
        }
    }

    public /* synthetic */ z(we.d dVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.e = dVar;
        this.f = b2VarArr;
        this.b = tLObject;
        this.c = i10;
        this.h = uri;
        this.n = context;
        this.d = z10;
    }
}
