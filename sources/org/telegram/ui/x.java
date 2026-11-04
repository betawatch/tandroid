package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ x(i4 i4Var, TLObject tLObject, int i3, TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar, boolean z10, String str) {
        this.e = i4Var;
        this.b = tLObject;
        this.c = i3;
        this.f = webPage;
        this.h = ziVar;
        this.d = z10;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u4.d1 K;
        int i3 = 0;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.e;
                TLObject tLObject = this.b;
                int i10 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.h;
                boolean z10 = this.d;
                String str = (String) this.n;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.hp.s1(i10).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.hp.s1(i10).S3(tL_messages_webPage.chats, false);
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
                                    l3[] l3VarArr = i4Var.v0;
                                    if (i3 >= l3VarArr.length) {
                                        if (ziVar != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(ziVar.k);
                                            org.telegram.messenger.qr.a0(i10).h1(-2, 0, ziVar.p1 ? 1 : 0, org.telegram.messenger.zi.B0(ziVar.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        g4 g4Var = l3VarArr[i3].c;
                                        if (g4Var.F == webPage && (K = i4Var.v0[i3].b.K(g4Var.b() - 1)) != null) {
                                            i4Var.v0[i3].c.y(K);
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!i4Var.e0.isEmpty() && i4Var.e0.get(0) == webPage) {
                            if (ziVar != null) {
                                ziVar.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(ziVar.k);
                                org.telegram.messenger.qr.a0(i10).h1(-2, 0, ziVar.p1 ? 1 : 0, org.telegram.messenger.zi.B0(ziVar.k), 0L, tL_messages_messages2, false);
                            }
                            if (z10) {
                                i4Var.e0.add(tL_webPage);
                            } else {
                                i4Var.e0.set(0, tL_webPage);
                            }
                            if (i4Var.e0.size() == 1) {
                                org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                i4Var.c0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    i4Var.T(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i10);
                        if (!org.telegram.messenger.qr.s0(hVar)) {
                            a02.a.c(new org.telegram.messenger.sp(a02, hVar, i3));
                            break;
                        }
                    }
                }
                break;
            default:
                sf.b bVar = (sf.b) this.e;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.f;
                TLObject tLObject3 = this.b;
                int i13 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z12 = this.d;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        s1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    s1VarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    org.telegram.messenger.hp.s1(i13).Y3(webpagepreview.users, false);
                    org.telegram.messenger.hp.s1(i13).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            org.telegram.messenger.hs.f(i13).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                sf.c.q(context, uri, z12, false);
                break;
        }
    }

    public /* synthetic */ x(sf.b bVar, org.telegram.ui.ActionBar.s1[] s1VarArr, TLObject tLObject, int i3, Uri uri, Context context, boolean z10) {
        this.e = bVar;
        this.f = s1VarArr;
        this.b = tLObject;
        this.c = i3;
        this.h = uri;
        this.n = context;
        this.d = z10;
    }
}
