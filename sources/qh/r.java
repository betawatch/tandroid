package qh;

import ci.d4;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.p61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.eb0;
import org.telegram.ui.hp0;
import org.telegram.ui.web.w1;
import org.telegram.ui.zn;
import tg.a0;
import yh.e5;
import yh.e7;
import yh.f7;
import yh.i1;
import yh.k2;
import yh.l2;
import yh.m2;
import yh.p7;
import yh.r2;
import yh.t2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i10;
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        int i11;
        int i12 = this.a;
        int i13 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                s sVar = (s) obj4;
                String str = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i14 = sVar.a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i14).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i14).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        webPage = messageMedia.webpage;
                        sVar.b.put(str, webPage);
                        arrayList = (ArrayList) sVar.c.remove(str);
                        if (arrayList == null) {
                            int size = arrayList.size();
                            while (i13 < size) {
                                Object obj5 = arrayList.get(i13);
                                i13++;
                                ((Utilities.Callback2) obj5).run(webPage, tL_error);
                            }
                            break;
                        }
                    }
                }
                webPage = null;
                sVar.b.put(str, webPage);
                arrayList = (ArrayList) sVar.c.remove(str);
                if (arrayList == null) {
                }
                break;
            case 1:
                a0 a0Var = (a0) obj4;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                a0Var.q0.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    n2 U = LaunchActivity.U();
                    eb0 eb0Var = LaunchActivity.G1.x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            zn W9 = zn.W9(-a0Var.b0.id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new w1(26, W9, tL_starsGiveawayOption));
                            if (eb0Var != null) {
                                eb0Var.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            a0Var.dismiss();
                            hg.c.q(R.string.UnknownErrorCode, new Object[]{str2}, ad.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 2:
                xh.r2 r2Var4 = (xh.r2) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((e5) obj3).l;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj6 = arrayList3.get(i15);
                    i15++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        int i16 = hp0.a;
                        p61 J = p61.J(hp0.class);
                        J.G = savedStarGift;
                        J.K(r2Var4.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
            case 3:
                t2 t2Var = (t2) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                r2[] r2VarArr = t2Var.n;
                d4 d4Var = t2Var.T;
                if (d4Var != null) {
                    d4Var.e(true);
                    t2Var.T = null;
                }
                t2Var.i0 = true;
                t2Var.j0 = starGift == null;
                t2Var.k0 = runnable;
                l2 l2Var = new l2(t2Var.h);
                ArrayList arrayList5 = new ArrayList();
                for (int i17 = 0; i17 < r2VarArr.length; i17++) {
                    r2 r2Var5 = r2VarArr[i17];
                    if (r2Var5 != null) {
                        TL_stars.StarGift starGift2 = r2Var5.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList5.add(Integer.valueOf(i17));
                        }
                    }
                }
                int i18 = 4;
                if (arrayList5.size() == 1) {
                    l2Var.e(r2VarArr[((Integer) arrayList5.get(0)).intValue()], 5, 0.0f);
                    l2Var.d(false);
                    l2Var.c(26.0f, -26.0f);
                    l2Var.a(90);
                    l2Var.d(true);
                    l2Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    r2 r2Var6 = r2VarArr[0];
                    if (r2Var6 != null) {
                        TL_stars.StarGift starGift3 = r2Var6.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            l2Var.e(r2Var6, iArr[0], 0.0f);
                            l2Var.c(25.0f, -22.0f);
                            i10 = 1;
                            r2Var = r2VarArr[1];
                            if (r2Var != null) {
                                TL_stars.StarGift starGift4 = r2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        l2Var.a(42);
                                    }
                                    l2Var.e(r2VarArr[1], iArr[i10], 0.0f);
                                    l2Var.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            r2Var2 = r2VarArr[2];
                            if (r2Var2 != null) {
                                TL_stars.StarGift starGift5 = r2Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        l2Var.a(42);
                                    }
                                    l2Var.e(r2VarArr[2], iArr[i10], 180.0f);
                                    l2Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            r2Var3 = r2VarArr[3];
                            if (r2Var3 != null) {
                                TL_stars.StarGift starGift6 = r2Var3.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i10 > 0) {
                                        l2Var.a(42);
                                    }
                                    l2Var.e(r2VarArr[3], iArr[i10], 0.0f);
                                    l2Var.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            l2Var.d(false);
                            l2Var.a(40);
                            l2Var.d(true);
                            l2Var.a(40);
                            i18 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    r2Var = r2VarArr[1];
                    if (r2Var != null) {
                    }
                    r2Var2 = r2VarArr[2];
                    if (r2Var2 != null) {
                    }
                    r2Var3 = r2VarArr[3];
                    if (r2Var3 != null) {
                    }
                    l2Var.d(false);
                    l2Var.a(40);
                    l2Var.d(true);
                    l2Var.a(40);
                    i18 = iArr[i10];
                    i11 = 80;
                }
                k2 k2Var = new k2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new bi0(t2Var, i18, starGift, 21));
                ArrayList arrayList6 = l2Var.b;
                arrayList6.add(k2Var);
                arrayList6.add(new k2(4, 0.0f, 0.0f, i11, i18, -90, null, null));
                l2Var.d = new i1(t2Var, starGift, arrayList4, runnable, 3);
                l2Var.e = false;
                l2Var.c = 0;
                l2Var.l = false;
                int size3 = arrayList6.size();
                while (true) {
                    m2 m2Var = l2Var.a;
                    if (i13 >= size3) {
                        m2Var.H = l2Var;
                        l2Var.b();
                        break;
                    } else {
                        Object obj7 = arrayList6.get(i13);
                        i13++;
                        k2 k2Var2 = (k2) obj7;
                        int i19 = k2Var2.e;
                        if (i19 >= 0 && i19 < 6) {
                            float f7 = k2Var2.f;
                            if (f7 != 0.0f) {
                                m2Var.y[i19] = f7;
                            }
                        }
                    }
                }
                break;
            case 4:
                p7.A0((p7) obj4, (p61) obj3, (Boolean) obj, (String) obj2);
                break;
            case 5:
                e7.R((e7) obj4, (p61) obj3, (Boolean) obj, (String) obj2);
                break;
            default:
                f7.R((f7) obj4, (p61) obj3, (Boolean) obj, (String) obj2);
                break;
        }
    }
}
