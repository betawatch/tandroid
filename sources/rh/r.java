package rh;

import di.d4;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c90;
import org.telegram.ui.fo;
import org.telegram.ui.ib0;
import org.telegram.ui.lp0;
import ug.a0;
import yh.p2;
import zh.e7;
import zh.f5;
import zh.f7;
import zh.j1;
import zh.j2;
import zh.k2;
import zh.l2;
import zh.p7;
import zh.q2;
import zh.s2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        int i10;
        q2 q2Var;
        q2 q2Var2;
        q2 q2Var3;
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
                    m2 U = LaunchActivity.U();
                    ib0 ib0Var = LaunchActivity.G1.x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            fo W9 = fo.W9(-a0Var.b0.id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new s9.b(14, W9, tL_starsGiveawayOption));
                            if (ib0Var != null) {
                                ib0Var.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            a0Var.dismiss();
                            i2.d.s(R.string.UnknownErrorCode, new Object[]{str2}, zc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 2:
                p2 p2Var = (p2) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((f5) obj3).l;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj6 = arrayList3.get(i15);
                    i15++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        int i16 = lp0.a;
                        m61 J = m61.J(lp0.class);
                        J.G = savedStarGift;
                        J.K(p2Var.b == savedStarGift.gift.id);
                        J.u = 1;
                        arrayList2.add(J);
                    }
                }
                break;
            case 3:
                s2 s2Var = (s2) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                q2[] q2VarArr = s2Var.n;
                d4 d4Var = s2Var.T;
                if (d4Var != null) {
                    d4Var.e(true);
                    s2Var.T = null;
                }
                s2Var.i0 = true;
                s2Var.j0 = starGift == null;
                s2Var.k0 = runnable;
                k2 k2Var = new k2(s2Var.h);
                ArrayList arrayList5 = new ArrayList();
                for (int i17 = 0; i17 < q2VarArr.length; i17++) {
                    q2 q2Var4 = q2VarArr[i17];
                    if (q2Var4 != null) {
                        TL_stars.StarGift starGift2 = q2Var4.h;
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
                    k2Var.e(q2VarArr[((Integer) arrayList5.get(0)).intValue()], 5, 0.0f);
                    k2Var.d(false);
                    k2Var.c(26.0f, -26.0f);
                    k2Var.a(90);
                    k2Var.d(true);
                    k2Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    q2 q2Var5 = q2VarArr[0];
                    if (q2Var5 != null) {
                        TL_stars.StarGift starGift3 = q2Var5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            k2Var.e(q2Var5, iArr[0], 0.0f);
                            k2Var.c(25.0f, -22.0f);
                            i10 = 1;
                            q2Var = q2VarArr[1];
                            if (q2Var != null) {
                                TL_stars.StarGift starGift4 = q2Var.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i10 > 0) {
                                        k2Var.a(42);
                                    }
                                    k2Var.e(q2VarArr[1], iArr[i10], 0.0f);
                                    k2Var.c(25.0f, 31.0f);
                                    i10++;
                                }
                            }
                            q2Var2 = q2VarArr[2];
                            if (q2Var2 != null) {
                                TL_stars.StarGift starGift5 = q2Var2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i10 > 0) {
                                        k2Var.a(42);
                                    }
                                    k2Var.e(q2VarArr[2], iArr[i10], 180.0f);
                                    k2Var.c(-36.0f, -36.0f);
                                    i10++;
                                }
                            }
                            q2Var3 = q2VarArr[3];
                            if (q2Var3 != null) {
                                TL_stars.StarGift starGift6 = q2Var3.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    if (i10 > 0) {
                                        k2Var.a(42);
                                    }
                                    k2Var.e(q2VarArr[3], iArr[i10], 0.0f);
                                    k2Var.c(-31.0f, 31.0f);
                                    i10++;
                                }
                            }
                            k2Var.d(false);
                            k2Var.a(40);
                            k2Var.d(true);
                            k2Var.a(40);
                            i18 = iArr[i10];
                            i11 = 80;
                        }
                    }
                    i10 = 0;
                    q2Var = q2VarArr[1];
                    if (q2Var != null) {
                    }
                    q2Var2 = q2VarArr[2];
                    if (q2Var2 != null) {
                    }
                    q2Var3 = q2VarArr[3];
                    if (q2Var3 != null) {
                    }
                    k2Var.d(false);
                    k2Var.a(40);
                    k2Var.d(true);
                    k2Var.a(40);
                    i18 = iArr[i10];
                    i11 = 80;
                }
                j2 j2Var = new j2(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new c90(s2Var, i18, starGift, 22));
                ArrayList arrayList6 = k2Var.b;
                arrayList6.add(j2Var);
                arrayList6.add(new j2(4, 0.0f, 0.0f, i11, i18, -90, null, null));
                k2Var.d = new j1(s2Var, starGift, arrayList4, runnable);
                k2Var.e = false;
                k2Var.c = 0;
                k2Var.l = false;
                int size3 = arrayList6.size();
                while (true) {
                    l2 l2Var = k2Var.a;
                    if (i13 >= size3) {
                        l2Var.H = k2Var;
                        k2Var.b();
                        break;
                    } else {
                        Object obj7 = arrayList6.get(i13);
                        i13++;
                        j2 j2Var2 = (j2) obj7;
                        int i19 = j2Var2.e;
                        if (i19 >= 0 && i19 < 6) {
                            float f7 = j2Var2.f;
                            if (f7 != 0.0f) {
                                l2Var.y[i19] = f7;
                            }
                        }
                    }
                }
                break;
            case 4:
                p7.A0((p7) obj4, (m61) obj3, (Boolean) obj, (String) obj2);
                break;
            case 5:
                e7.R((e7) obj4, (m61) obj3, (Boolean) obj, (String) obj2);
                break;
            default:
                f7.R((f7) obj4, (m61) obj3, (Boolean) obj, (String) obj2);
                break;
        }
    }
}
