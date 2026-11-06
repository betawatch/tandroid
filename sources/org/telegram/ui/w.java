package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ w(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.e = g4Var;
        this.b = tLObject;
        this.c = i7;
        this.f = webPage;
        this.h = ijVar;
        this.d = z9;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.d1 K;
        int i7 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.e;
                TLObject tLObject = this.b;
                int i10 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.h;
                boolean z9 = this.d;
                String str = (String) this.n;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z10) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.qp.s1(i10).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.qp.s1(i10).S3(tL_messages_webPage.chats, false);
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
                                    k3[] k3VarArr = g4Var.u0;
                                    if (i7 >= k3VarArr.length) {
                                        if (ijVar != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(ijVar.k);
                                            org.telegram.messenger.yr.a0(i10).h1(-2, 0, ijVar.p1 ? 1 : 0, org.telegram.messenger.ij.B0(ijVar.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        e4 e4Var = k3VarArr[i7].c;
                                        if (e4Var.E == webPage && (K = g4Var.u0[i7].b.K(e4Var.b() - 1)) != null) {
                                            g4Var.u0[i7].c.y(K);
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.d0.isEmpty() && g4Var.d0.get(0) == webPage) {
                            if (ijVar != null) {
                                ijVar.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(ijVar.k);
                                org.telegram.messenger.yr.a0(i10).h1(-2, 0, ijVar.p1 ? 1 : 0, org.telegram.messenger.ij.B0(ijVar.k), 0L, tL_messages_messages2, false);
                            }
                            if (z9) {
                                g4Var.d0.add(tL_webPage);
                            } else {
                                g4Var.d0.set(0, tL_webPage);
                            }
                            if (g4Var.d0.size() == 1) {
                                org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                g4Var.c0(z9 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    g4Var.T(str, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i10);
                        if (!org.telegram.messenger.yr.s0(hVar)) {
                            a02.a.c(new org.telegram.messenger.bq(a02, hVar, i7));
                            break;
                        }
                    }
                }
                break;
            default:
                vf.b bVar = (vf.b) this.e;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.f;
                TLObject tLObject3 = this.b;
                int i13 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z11 = this.d;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        u1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    u1VarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    org.telegram.messenger.qp.s1(i13).Y3(webpagepreview.users, false);
                    org.telegram.messenger.qp.s1(i13).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            org.telegram.messenger.qs.f(i13).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                vf.c.q(context, uri, z11, false);
                break;
        }
    }

    public /* synthetic */ w(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z9) {
        this.e = bVar;
        this.f = u1VarArr;
        this.b = tLObject;
        this.c = i7;
        this.h = uri;
        this.n = context;
        this.d = z9;
    }
}
