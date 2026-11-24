// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vh8 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        k0a k0aVar = (k0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        j0a j0aVar = k0aVar.b2;
        j0a j0aVar2 = k0aVar.a2;
        TLRPC.User user = k0aVar.T1;
        j0a j0aVar3 = k0aVar.Z1;
        if (j0aVar3 != null) {
            ArrayList arrayList2 = j0aVar3.d;
            if (j0aVar2 != null) {
                ArrayList arrayList3 = j0aVar2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(z8c.h(k0aVar.a).e()));
                arrayList.add(c6c.E(3, gm.L(64.0f)));
                int i = 29;
                if (j0aVar != null && !TextUtils.isEmpty(j0aVar.c.q)) {
                    ArrayList arrayList4 = j0aVar.d;
                    int size = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList4.get(i2);
                        i2++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(pg3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(pg3.d(tLObject)));
                            c6c w = c6c.w(tLObject);
                            w.L(pg3.d(tLObject) == pg3.d(k0aVar.V1));
                            arrayList.add(w);
                        }
                    }
                    if (j0aVar.f) {
                        arrayList.add(c6c.p(29));
                        arrayList.add(c6c.p(29));
                        arrayList.add(c6c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(c6c.k(k0aVar.Y1));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        if (pg3.d((TLObject) obj4) == pg3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(pg3.d(user)))) {
                                arrayList.add(c6c.r(jb6.M0(sd2.V(k0aVar.S1) ? 2131752463 : 2131749256, null)));
                                hashSet.add(Long.valueOf(pg3.d(user)));
                                c6c w2 = c6c.w(user);
                                w2.L(pg3.d(user) == pg3.d(k0aVar.V1));
                                arrayList.add(w2);
                                z = false;
                            }
                        }
                    }
                }
                z = true;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj5 = arrayList2.get(i4);
                    i4++;
                    TLObject tLObject2 = (TLObject) obj5;
                    int i5 = i;
                    if (!hashSet.contains(Long.valueOf(pg3.d(tLObject2)))) {
                        if (z) {
                            arrayList.add(c6c.r(jb6.M0(sd2.V(k0aVar.S1) ? 2131752463 : 2131749256, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(pg3.d(tLObject2)));
                        c6c w3 = c6c.w(tLObject2);
                        w3.L(pg3.d(tLObject2) == pg3.d(k0aVar.V1));
                        arrayList.add(w3);
                    }
                    i = i5;
                }
                int i6 = i;
                if (j0aVar3.f) {
                    arrayList.add(c6c.p(i6));
                    arrayList.add(c6c.p(i6));
                    arrayList.add(c6c.p(i6));
                }
                if (user == null || hashSet.contains(Long.valueOf(pg3.d(user)))) {
                    z2 = true;
                } else {
                    arrayList.add(c6c.r(jb6.M0(sd2.V(k0aVar.S1) ? 2131752226 : 2131749185, null)));
                    hashSet.add(Long.valueOf(pg3.d(user)));
                    c6c w4 = c6c.w(user);
                    w4.L(pg3.d(user) == pg3.d(k0aVar.V1));
                    arrayList.add(w4);
                    z2 = false;
                }
                int size4 = arrayList3.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj6 = arrayList3.get(i7);
                    i7++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(pg3.d(tLObject3)))) {
                        if (z2) {
                            arrayList.add(c6c.r(jb6.M0(sd2.V(k0aVar.S1) ? 2131752226 : 2131749185, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(pg3.d(tLObject3)));
                        c6c w5 = c6c.w(tLObject3);
                        w5.L(pg3.d(tLObject3) == pg3.d(k0aVar.V1));
                        arrayList.add(w5);
                    }
                }
                if (arrayList3.isEmpty() || !j0aVar2.f) {
                    return;
                }
                arrayList.add(c6c.p(i6));
                arrayList.add(c6c.p(i6));
                arrayList.add(c6c.p(i6));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        j0a j0aVar = (j0a) this.b;
        ArrayList arrayList = j0aVar.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = j0aVar.a;
        ArrayList arrayList2 = j0aVar.d;
        int i2 = 0;
        if (tL_error != null) {
            if (j0aVar.r) {
                arrayList2.clear();
                j0aVar.r = false;
            }
            j0aVar.h = true;
            j0aVar.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        oc7.r1(i).d4(channels_channelparticipants.users, false);
        oc7.r1(i).X3(channels_channelparticipants.chats, false);
        if (j0aVar.r) {
            arrayList2.clear();
            j0aVar.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject a2 = oc7.r1(i).a2(pg3.n(channelParticipant.peer));
            if (a2 != null) {
                arrayList2.add(a2);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            j0aVar.h = true;
        }
        j0aVar.f = false;
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj4 = arrayList.get(i2);
            i2++;
            ((Runnable) obj4).run();
        }
    }

    private final void d(Object obj, Object obj2) {
        p0a p0aVar = (p0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ava avaVar = p0aVar.T1;
        if (avaVar == null) {
            return;
        }
        ArrayList arrayList2 = avaVar.l;
        arrayList.add(c6c.D(gm.L(16.0f)));
        if (avaVar.i && arrayList2.isEmpty()) {
            c6c q = c6c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            c6c q2 = c6c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            c6c q3 = c6c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            c6c q4 = c6c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c6c q5 = c6c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c6c q6 = c6c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            c6c q7 = c6c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            c6c q8 = c6c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            c6c q9 = c6c.q(9, 34);
            q9.v = 1;
            arrayList.add(q9);
        } else {
            int size = arrayList2.size();
            int i = 0;
            int i2 = 3;
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (!savedStarGift.collection_id.contains(Integer.valueOf(p0aVar.S1))) {
                    int i4 = nx4.b;
                    c6c K = c6c.K(nx4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = p0aVar.U1;
                    int i5 = savedStarGift.msg_id;
                    K.L(hashSet.contains(Long.valueOf(i5 == 0 ? savedStarGift.saved_id : i5)));
                    K.v = 1;
                    arrayList.add(K);
                    i2--;
                    if (i2 == 0) {
                        i2 = 3;
                    }
                }
            }
            if (avaVar.i || !avaVar.j) {
                while (true) {
                    if (i >= (i2 <= 0 ? 3 : i2)) {
                        break;
                    }
                    i++;
                    c6c q10 = c6c.q(i, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(c6c.D(gm.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        s0a s0aVar = (s0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i = s0aVar.W1;
        z3b z3bVar = s0aVar.U1;
        if (z3bVar == null) {
            return;
        }
        arrayList.add(c6c.D(gm.L(16.0f)));
        ArrayList arrayList2 = z3bVar.i;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            k47 k47Var = (k47) obj3;
            int i5 = w5b.c;
            c6c K = c6c.K(w5b.class);
            K.v = 1;
            K.A = 0;
            K.H = k47Var;
            K.C = (k47Var == null || (storyItem = k47Var.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i;
            K.L(s0aVar.V1.containsKey(Integer.valueOf(k47Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i3--;
            if (i3 == 0) {
                i3 = i;
            }
        }
        if (z3bVar.k() || !z3bVar.r) {
            while (true) {
                if (i2 >= (i3 <= 0 ? i : i3)) {
                    break;
                }
                i2++;
                c6c q = c6c.q(i2, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(c6c.D(gm.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        kpa kpaVar = (kpa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = kpaVar.Y1;
        boolean z = kpaVar.p2;
        ef0 ef0Var = kpaVar.b2;
        ArrayList arrayList3 = kpaVar.W1;
        ArrayList arrayList4 = kpaVar.V1;
        ef0 ef0Var2 = kpaVar.a2;
        ef0 ef0Var3 = kpaVar.Z1;
        ArrayList arrayList5 = kpaVar.X1;
        if (arrayList5 == null || arrayList4 == null || arrayList3 == null) {
            return;
        }
        arrayList.add(c6c.D(gm.L(315.0f)));
        int i = 0;
        ef0Var3.a = 0;
        ef0Var3.b();
        ef0Var2.a = 0;
        ef0Var2.b();
        ef0Var.a = 0;
        ef0Var.b();
        int i2 = kpaVar.e2.s;
        if (i2 == 0) {
            arrayList.add(c6c.g(gm.S2(jb6.H(',', z ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList5.size()))));
            int size = arrayList5.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(c6c.g(gm.S2(jb6.H(',', z ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList5.size()))));
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
            }
            return;
        }
        if (i2 == 1) {
            arrayList.add(c6c.g(gm.S2(jb6.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj5 = arrayList4.get(i);
                i++;
                arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) ef0Var.b())));
            }
            return;
        }
        if (i2 == 2) {
            arrayList.add(c6c.g(gm.S2(jb6.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj6 = arrayList3.get(i);
                i++;
                arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ef0Var.b())));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        zwa zwaVar = (zwa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(c6c.k(zwaVar.S1));
        arrayList.add(c6c.u(jb6.M0(2131743899, null)));
        ArrayList r = jva.v(zwaVar.a, false).r();
        if (r == null || r.isEmpty()) {
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < r.size(); i3++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i3);
                if (zwaVar.X1 || !tL_starsGiftOption.extended) {
                    int i4 = i2 + 1;
                    int i5 = axa.b;
                    c6c K = c6c.K(axa.class);
                    K.d = i3;
                    K.A = i2;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = jb6.H(' ', "StarsCount", (int) j);
                    K.n = tL_starsGiftOption.loadingStorePrice ? null : cj0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i2 = i4;
                } else {
                    i++;
                }
            }
            boolean z = zwaVar.X1;
            if (!z && i > 0) {
                String M0 = jb6.M0(z ? 2131747578 : 2131747569, null);
                boolean z2 = !zwaVar.X1;
                int i6 = wwa.b;
                c6c K2 = c6c.K(wwa.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = z2;
                K2.r = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(c6c.k(zwaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        dxa dxaVar = (dxa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        long j = dxaVar.S1;
        ds0 ds0Var = dxaVar.T1;
        arrayList.add(c6c.m(ds0Var));
        boolean z = dxaVar.Y1;
        if (z) {
            aq1.o(2131743899, null, arrayList);
        }
        ArrayList w = jva.v(dxaVar.a, false).w();
        if (z) {
            if (w == null || w.isEmpty()) {
                arrayList.add(c6c.p(31));
                arrayList.add(c6c.p(31));
                arrayList.add(c6c.p(31));
            } else {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !dxaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(axa.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(c6c.k(ds0Var));
                    arrayList.add(c6c.u(jb6.M0(2131743899, null)));
                    int i5 = 0;
                    for (int i6 = 0; i6 < w.size(); i6++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i6);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(axa.i(i6, i3, tL_starsTopupOption2));
                            i5++;
                            i3++;
                        }
                    }
                    if (i5 == 0) {
                        int i7 = 0;
                        while (i7 < w.size()) {
                            arrayList.add(axa.i(i7, i3, (TL_stars.TL_starsTopupOption) w.get(i7)));
                            i7++;
                            i3++;
                        }
                        boolean z3 = dxaVar.a2;
                        if (!z3 && i2 > 0) {
                            String M0 = jb6.M0(z3 ? 2131747578 : 2131747569, null);
                            boolean z4 = !dxaVar.a2;
                            int i8 = wwa.b;
                            c6c K = c6c.K(wwa.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = z4;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        dxaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z5 = dxaVar.a2;
                    if (!z5 && i2 > 0) {
                        String M02 = jb6.M0(z5 ? 2131747578 : 2131747569, null);
                        boolean z6 = !dxaVar.a2;
                        int i9 = wwa.b;
                        c6c K2 = c6c.K(wwa.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = z6;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i10 = 0;
                    while (i10 < w.size()) {
                        arrayList.add(axa.i(i10, i3, (TL_stars.TL_starsTopupOption) w.get(i10)));
                        i10++;
                        i3++;
                    }
                }
            }
        }
        arrayList.add(c6c.k(dxaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        exa exaVar = (exa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        aq1.o(2131743899, null, arrayList);
        ArrayList w = jva.v(exaVar.a, false).w();
        if (w == null || w.isEmpty()) {
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < w.size(); i3++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i3);
                if (!tL_starsTopupOption.extended || exaVar.U1) {
                    arrayList.add(axa.i(i3, i2, tL_starsTopupOption));
                    i2++;
                } else {
                    i++;
                }
            }
            boolean z = exaVar.U1;
            if (!z && i > 0) {
                String M0 = jb6.M0(z ? 2131747578 : 2131747569, null);
                boolean z2 = !exaVar.U1;
                int i4 = wwa.b;
                c6c K = c6c.K(wwa.class);
                K.d = -1;
                K.m = M0;
                K.f = z2;
                K.r = true;
                arrayList.add(K);
            }
        }
        arrayList.add(c6c.k(exaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        kxa kxaVar = (kxa) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        boolean z = kxaVar.e;
        int i3 = kxaVar.d;
        long j = kxaVar.f;
        int i4 = kxaVar.c;
        if (j != 0) {
            ku0 g = ku0.g(i4);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                int i6 = hxa.b;
                c6c K = c6c.K(hxa.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (g.k(j).e[i3]) {
                return;
            }
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            return;
        }
        jva v = jva.v(i4, z);
        ArrayList[] arrayListArr = v.q;
        if (z && u15.c(i4)) {
            if (kxaVar.n == null) {
                kxaVar.n = new l0c();
            }
            kxaVar.r = c.C(i4).x();
            ArrayList arrayList4 = arrayListArr[i3];
            l0c l0cVar = kxaVar.n;
            t15 t15Var = u15.b[i4];
            String x = c.C(i4).x();
            HashSet hashSet = l0cVar.a;
            HashSet hashSet2 = l0cVar.a;
            HashMap hashMap = l0cVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            l0cVar.b(4, new ArrayList(hashSet2));
            if (t15Var != null && t15Var.g == null && System.currentTimeMillis() - t15Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + t15Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = t15Var.c;
                wallettransaction.date = t15Var.d;
                wallettransaction.peer = new i0c(x);
                arrayList2.add(k0c.i(wallettransaction, l0cVar));
            }
            HashSet e = u15.e(i4);
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 == null || ((!e.contains(str2) && (t15Var == null || !starsTransaction.id.equals(t15Var.g))) || starsTransaction.amount == null)) {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i8 = hxa.b;
                    c6c K2 = c6c.K(hxa.class);
                    K2.H = starsTransaction;
                    K2.r = false;
                    arrayList2.add(K2);
                } else {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (t15Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(t15Var.g)) {
                            str = t15Var.b;
                            sb.append(str);
                            wallettransaction2.id = sb.toString();
                            wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                            wallettransaction2.failed = starsTransaction.failed;
                            i2 = i3;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new i0c(x);
                            arrayList2.add(k0c.i(wallettransaction2, l0cVar));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    str = starsTransaction.id;
                    sb.append(str);
                    wallettransaction2.id = sb.toString();
                    wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                    wallettransaction2.failed = starsTransaction.failed;
                    i2 = i3;
                    wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                    wallettransaction2.date = starsTransaction.date;
                    wallettransaction2.peer = new i0c(x);
                    arrayList2.add(k0c.i(wallettransaction2, l0cVar));
                }
                i3 = i2;
                arrayList4 = arrayList;
            }
            i = i3;
        } else {
            i = i3;
            ArrayList arrayList5 = arrayListArr[i];
            int size3 = arrayList5.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj5 = arrayList5.get(i9);
                i9++;
                int i10 = hxa.b;
                c6c K3 = c6c.K(hxa.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (v.u[i]) {
            return;
        }
        arrayList2.add(c6c.q(arrayList2.size(), 7));
        arrayList2.add(c6c.q(arrayList2.size(), 7));
        arrayList2.add(c6c.q(arrayList2.size(), 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a8  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i;
        Object[] objArr;
        int i2;
        of9 of9Var;
        byte b = this.a;
        int i3 = -1;
        byte b2 = 3;
        char c = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wh8 wh8Var = (wh8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                String M0 = jb6.M0(2131754241, null);
                c6c c6cVar = new c6c(2);
                c6cVar.m = M0;
                c6cVar.k = R.raw.bubble;
                arrayList.add(c6cVar);
                c6c i4 = c6c.i(1, jb6.M0(2131754242, null));
                i4.L(wh8Var.n);
                arrayList.add(i4);
                arrayList.add(c6c.B(2, null));
                if (wh8Var.n) {
                    aq1.o(2131746610, null, arrayList);
                    int[] a = jla.a(new int[]{0, 10, 50, 100, nm7.d3, nm7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) wh8Var.getMessagesController().l4.H1.f());
                    i98 i98Var = new i98((byte) 3);
                    ila ilaVar = new ila();
                    ilaVar.c = a;
                    ilaVar.d = (byte) 20;
                    ilaVar.e = i98Var;
                    wh8Var.b.d((int) Utilities.k(wh8Var.r, 10000L, 0L), ilaVar, new ci7(wh8Var, (byte) 16));
                    arrayList.add(c6c.j(3, wh8Var.b));
                    arrayList.add(c6c.B(4, wh8Var.r > 0 ? wh8Var.a0() : null));
                    TLRPC.Chat L0 = wh8Var.getMessagesController().L0(Long.valueOf(wh8Var.a));
                    if (L0 != null && !TextUtils.isEmpty(sd2.K(L0, false))) {
                        wh8Var.c.setLink(wh8Var.getMessagesController().N2 + "/" + sd2.K(L0, false) + "?direct");
                        arrayList.add(c6c.u(jb6.M0(2131752331, null)));
                        arrayList.add(c6c.j(5, wh8Var.c));
                        break;
                    }
                }
                break;
            case 1:
                ai8 ai8Var = (ai8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ai8Var.e;
                ArrayList arrayList4 = ai8Var.n;
                if (ai8Var.d == null) {
                    arrayList2.add(c6c.q(-1, 7));
                    arrayList2.add(c6c.q(-2, 7));
                    arrayList2.add(c6c.q(-3, 7));
                    ai8Var.R = false;
                    break;
                } else {
                    boolean isEmpty = TextUtils.isEmpty(ai8Var.x);
                    if (isEmpty) {
                        if (!arrayList3.isEmpty()) {
                            arrayList2.add(c6c.r(jb6.M0(2131745456, null)));
                        }
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj4 = arrayList3.get(i5);
                            i5++;
                            c6c c6cVar2 = new c6c(33);
                            c6cVar2.H = (k47) obj4;
                            arrayList2.add(c6cVar2);
                        }
                    } else {
                        if (!arrayList4.isEmpty()) {
                            arrayList2.add(c6c.r(jb6.M0(2131745457, null)));
                        }
                        int size2 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj5 = arrayList4.get(i6);
                            i6++;
                            c6c c6cVar3 = new c6c(33);
                            c6cVar3.H = (k47) obj5;
                            arrayList2.add(c6cVar3);
                        }
                    }
                    if (ai8Var.w || ((ai8Var.N && !ai8Var.O) || (!isEmpty && !arrayList4.isEmpty() && !ai8Var.s))) {
                        arrayList2.add(c6c.q(ai8Var.M * 3, 7));
                        arrayList2.add(c6c.q((ai8Var.M * 3) + 1, 7));
                        arrayList2.add(c6c.q((ai8Var.M * 3) + 2, 7));
                    }
                    ai8Var.R = arrayList2.isEmpty();
                    break;
                }
                break;
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                RectF rectF = ProfileActivity.e7;
                jz4 jz4Var = profileActivity.V6;
                jz4Var.a((Bitmap) obj2);
                tl0.c(jz4Var, profileActivity.fragmentView);
                profileActivity.W6.d();
                break;
            case 4:
                rs8 rs8Var = (rs8) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ylb ylbVar = rs8Var.c;
                lea leaVar = rs8Var.a;
                ava avaVar = rs8Var.e;
                if (avaVar != null) {
                    if ((!avaVar.e || avaVar.g != 783) && avaVar.l.size() <= 0) {
                        ava avaVar2 = rs8Var.e;
                        if (avaVar2.j && !avaVar2.i) {
                        }
                    }
                    ava avaVar3 = rs8Var.e;
                    int max = Math.max(1, (avaVar3 == null || (i = avaVar3.n) == 0) ? 3 : Math.min(3, i));
                    ava avaVar4 = rs8Var.e;
                    if (avaVar4 != null) {
                        ArrayList arrayList6 = avaVar4.l;
                        int size3 = arrayList6.size();
                        int i7 = 3;
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj6 = arrayList6.get(i8);
                            i8++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                            boolean z = rs8Var.d;
                            int i9 = nx4.b;
                            c6c K = c6c.K(nx4.class);
                            K.v = 1;
                            K.A = 0;
                            K.H = savedStarGift;
                            K.r = true;
                            K.f = false;
                            K.s = z;
                            K.h = rs8Var.h && (rs8Var.e != leaVar.d || savedStarGift.pinned_to_top);
                            arrayList5.add(K);
                            i7--;
                            if (i7 == 0) {
                                i7 = 3;
                            }
                        }
                        ava avaVar5 = rs8Var.e;
                        if (avaVar5.i || !avaVar5.j) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < (i7 <= 0 ? 3 : i7)) {
                                    i10++;
                                    c6c q = c6c.q(i10, 34);
                                    q.v = 1;
                                    arrayList5.add(q);
                                }
                            }
                        }
                    }
                    if (leaVar.d == rs8Var.e) {
                        arrayList5.add(c6c.D(gm.L(20.0f)));
                        if (leaVar.c == z8c.h(rs8Var.b).e()) {
                            int i11 = cmb.y6;
                            int v0 = cmb.v0(i11, ylbVar);
                            String M02 = jb6.M0(2131746404, null);
                            int L = gm.L(24.0f);
                            int i12 = ss8.b;
                            c6c K2 = c6c.K(ss8.class);
                            K2.m = M02;
                            K2.A = 17;
                            K2.C = v0;
                            K2.B = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.r = false;
                            K2.H = ylbVar;
                            K2.I = Integer.valueOf(i11);
                            arrayList5.add(K2);
                        }
                        arrayList5.add(c6c.D(gm.L(82.0f)));
                    } else if (!arrayList5.isEmpty()) {
                        arrayList5.add(c6c.D(gm.L(82.0f)));
                    }
                    if (!arrayList5.isEmpty()) {
                        arrayList5.add(0, c6c.D(gm.L(rs8Var.I ? 42.0f : 12.0f)));
                    }
                    if (rs8Var.f.getSpanCount() != max) {
                        gm.c3(new bs8(rs8Var, max, c == true ? 1 : 0));
                    }
                    leaVar.p();
                    leaVar.post(new ur8(leaVar, (byte) 3));
                    break;
                }
                break;
            case 5:
                ku8 ku8Var = (ku8) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!ku8Var.T && !ku8Var.S) {
                    ku8Var.H = bitmap;
                    ku8Var.n.invalidate();
                    ku8Var.d();
                    ku8Var.F.a(bitmap2);
                    ku8Var.h.post(new eu8(ku8Var, (byte) 0));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 6:
                gx8 gx8Var = (gx8) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList7 = gx8Var.e;
                gx8Var.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    gx8Var.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        gx8Var.b.serializeToStream(serializedData);
                        oc7.r1(gx8Var.a).X3.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                gx8Var.d = shareThemeBackdrops != null;
                ArrayList arrayList8 = new ArrayList(arrayList7);
                arrayList7.clear();
                int size4 = arrayList8.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj7 = arrayList8.get(i13);
                    i13++;
                    ((Runnable) obj7).run();
                }
                break;
            case 7:
                ca9 ca9Var = (ca9) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                q7c q7cVar = ca9Var.f;
                da9 da9Var = ca9Var.w;
                ArrayList arrayList10 = da9Var.r1;
                jp0 jp0Var = ca9Var.h;
                if (jp0Var.getMeasuredHeight() <= 0) {
                    jp0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(120.0f), TLObject.FLAG_31));
                }
                c6c D = c6c.D(jp0Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList9.add(D);
                int measuredHeight = (int) ((jp0Var.getMeasuredHeight() / gm.p) + 0.0f);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ca9Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || ca9Var.c != null || ca9Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || ca9Var.c != null) {
                        Context context = ca9Var.getContext();
                        int i14 = cmb.K6;
                        int i15 = da9.v1;
                        jf5 jf5Var = new jf5(context, i14, 21, 0, 0, false, false, da9Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = ca9Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            jf5Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ca9Var.c;
                            if (tL_reportResultChooseOption != null) {
                                jf5Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        anb.h(cmb.g5, da9Var.J0, jf5Var);
                        c6c k = c6c.k(jf5Var);
                        k.d = -2;
                        arrayList9.add(k);
                        measuredHeight += 40;
                    }
                    if (ca9Var.b != null) {
                        for (int i16 = 0; i16 < ca9Var.b.options.size(); i16++) {
                            c6c c6cVar4 = new c6c(30);
                            c6cVar4.m = ca9Var.b.options.get(i16).text;
                            c6cVar4.k = R.drawable.msg_arrowright;
                            c6cVar4.d = i16;
                            arrayList9.add(c6cVar4);
                            measuredHeight += 50;
                        }
                    } else if (ca9Var.c != null) {
                        for (int i17 = 0; i17 < ca9Var.c.options.size(); i17++) {
                            c6c c6cVar5 = new c6c(30);
                            c6cVar5.m = ca9Var.c.options.get(i17).text;
                            c6cVar5.k = R.drawable.msg_arrowright;
                            c6cVar5.d = i17;
                            arrayList9.add(c6cVar5);
                            measuredHeight += 50;
                        }
                    } else if (ca9Var.d != null) {
                        if (ca9Var.n == null) {
                            Context context2 = ca9Var.getContext();
                            int i18 = da9.v1;
                            ba9 ba9Var = new ba9(ca9Var, context2, da9Var.J0);
                            ca9Var.n = ba9Var;
                            ba9Var.setShowLimitWhenNear(100);
                        }
                        ca9Var.n.d.setHint(jb6.M0(ca9Var.d.optional ? 2131745969 : 2131745975, null));
                        c6c k2 = c6c.k(ca9Var.n);
                        k2.d = -3;
                        arrayList9.add(k2);
                        long j = da9Var.t1;
                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                            arrayList9.add(c6c.C(jb6.M0(arrayList10.size() > 1 ? 2131745971 : 2131745974, null)));
                        } else if (pg3.D(j)) {
                            arrayList9.add(c6c.C(jb6.M0(2131745970, null)));
                        } else if (sd2.V(oc7.r1(da9Var.a).L0(Long.valueOf(-j)))) {
                            arrayList9.add(c6c.C(jb6.M0(2131745973, null)));
                        } else {
                            arrayList9.add(c6c.C(jb6.M0(2131745972, null)));
                        }
                        if (ca9Var.r == null) {
                            b61 b61Var = new b61(da9Var.J0, ca9Var.getContext(), true);
                            ca9Var.s = b61Var;
                            b61Var.i(jb6.M0(2131745968, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(ca9Var.getContext());
                            ca9Var.r = frameLayout;
                            anb.h(cmb.g5, da9Var.J0, frameLayout);
                            ca9Var.r.addView(ca9Var.s, qoe.d(-1, 48.0f, nm7.D1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(ca9Var.getContext());
                            anb.h(cmb.c7, da9Var.J0, view);
                            ca9Var.r.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 48));
                        }
                        ca9Var.s.setEnabled(ca9Var.d.optional || !TextUtils.isEmpty(ca9Var.n.getText()));
                        ca9Var.s.setOnClickListener(new wk8(ca9Var, (byte) 8));
                        c6c k3 = c6c.k(ca9Var.r);
                        k3.d = -4;
                        arrayList9.add(k3);
                        measuredHeight += nm7.w1;
                    }
                    ((c6c) b10.f(1, arrayList9)).j = true;
                    if (da9Var.o1 && ca9Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(ca9Var.getContext());
                        Drawable mutate = ca9Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        anb.x(frameLayout2, mutate, cmb.a7, da9Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        anb.x(frameLayout2, colorDrawable, cmb.Z6, da9Var.J0, PorterDuff.Mode.SRC_IN);
                        sn2 sn2Var = new sn2(colorDrawable, mutate, 0, 0);
                        sn2Var.x = true;
                        frameLayout2.setBackground(sn2Var);
                        l66 l66Var = new l66(ca9Var.getContext(), null);
                        l66Var.setTextSize(1, 14.0f);
                        l66Var.setText(gm.H2(jb6.M0(2131745966, null), da9Var.J0, null));
                        anb.X(l66Var, cmb.z6, da9Var.J0);
                        l66Var.setGravity(17);
                        frameLayout2.addView(l66Var, qoe.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        c6c k4 = c6c.k(frameLayout2);
                        k4.d = -3;
                        arrayList9.add(k4);
                        measuredHeight += 46;
                    }
                }
                if (q7cVar != null) {
                    int i19 = da9.v1;
                    if (da9Var.b.getMeasuredHeight() - gm.m < gm.L(measuredHeight)) {
                        q7cVar.f3.j1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList9);
                        q7cVar.f3.j1(true);
                        break;
                    }
                }
                break;
            case 8:
                zb9 zb9Var = (zb9) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                qb9 qb9Var = zb9Var.d;
                ArrayList arrayList12 = qb9Var.d;
                int size5 = arrayList12.size();
                int i20 = 0;
                while (i20 < size5) {
                    Object obj8 = arrayList12.get(i20);
                    i20++;
                    arrayList11.add(nx4.i(0, (TL_stars.TL_starGiftUnique) obj8, false, false, false, true, false));
                }
                if (qb9Var.y || !qb9Var.z) {
                    c6c q2 = c6c.q(-1, 34);
                    q2.v = 1;
                    arrayList11.add(q2);
                    c6c q3 = c6c.q(-2, 34);
                    q3.v = 1;
                    arrayList11.add(q3);
                    c6c q4 = c6c.q(-3, 34);
                    q4.v = 1;
                    arrayList11.add(q4);
                    if (qb9Var.d.isEmpty()) {
                        c6c q5 = c6c.q(-4, 34);
                        q5.v = 1;
                        arrayList11.add(q5);
                        c6c q6 = c6c.q(-5, 34);
                        q6.v = 1;
                        arrayList11.add(q6);
                        c6c q7 = c6c.q(-6, 34);
                        q7.v = 1;
                        arrayList11.add(q7);
                        c6c q8 = c6c.q(-7, 34);
                        q8.v = 1;
                        arrayList11.add(q8);
                        c6c q9 = c6c.q(-8, 34);
                        q9.v = 1;
                        arrayList11.add(q9);
                        c6c q10 = c6c.q(-9, 34);
                        q10.v = 1;
                        arrayList11.add(q10);
                        c6c q11 = c6c.q(-10, 34);
                        q11.v = 1;
                        arrayList11.add(q11);
                        c6c q12 = c6c.q(-11, 34);
                        q12.v = 1;
                        arrayList11.add(q12);
                        c6c q13 = c6c.q(-12, 34);
                        q13.v = 1;
                        arrayList11.add(q13);
                        c6c q14 = c6c.q(-13, 34);
                        q14.v = 1;
                        arrayList11.add(q14);
                        c6c q15 = c6c.q(-14, 34);
                        q15.v = 1;
                        arrayList11.add(q15);
                        c6c q16 = c6c.q(-15, 34);
                        q16.v = 1;
                        arrayList11.add(q16);
                    }
                }
                zb9Var.j0(arrayList11.isEmpty() && !qb9Var.y);
                break;
            case 9:
                yb9 yb9Var = (yb9) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                xb9 xb9Var = yb9Var.T1;
                if (xb9Var != null) {
                    ava avaVar6 = xb9Var.b;
                    qb9 qb9Var2 = xb9Var.c;
                    if (avaVar6 != null && qb9Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(yb9Var.a).getCurrentTime();
                        arrayList13.add(c6c.t(-1, jb6.M0(2131749703, null)));
                        ArrayList arrayList14 = avaVar6.l;
                        int size6 = arrayList14.size();
                        int i21 = 0;
                        int i22 = 0;
                        boolean z2 = true;
                        while (i22 < size6) {
                            Object obj9 = arrayList14.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj9;
                            boolean z3 = z2;
                            if (yb9Var.b2.contains(Long.valueOf(savedStarGift2.gift.id)) || fs7.m(savedStarGift2.gift)) {
                                z2 = z3;
                            } else {
                                boolean z4 = savedStarGift2.can_craft_at <= currentTime;
                                c6c i23 = nx4.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i23.g = z4;
                                arrayList13.add(i23);
                                i21++;
                                z2 = false;
                            }
                        }
                        boolean z5 = z2;
                        if (avaVar6.i || !avaVar6.j) {
                            int i24 = i21 % 3;
                            int i25 = 6 - i24;
                            for (int i26 = 0; i26 < i25; i26++) {
                                c6c q17 = c6c.q((i26 - i24) + 1, 35);
                                q17.v = 1;
                                arrayList13.add(q17);
                            }
                        } else if (z5) {
                            arrayList13.add(c6c.g(jb6.M0(2131749702, null)));
                        }
                        if (qb9Var2.e > 0 || yb9Var.e2) {
                            yb9Var.e2 = true;
                            String M03 = jb6.M0(2131749705, null);
                            c6c c6cVar6 = new c6c(42);
                            c6cVar6.d = -2;
                            c6cVar6.p = M03;
                            arrayList13.add(c6cVar6);
                            HorizontalScrollView horizontalScrollView = yb9Var.U1;
                            if (horizontalScrollView != null) {
                                arrayList13.add(c6c.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList15 = qb9Var2.d;
                            int size7 = arrayList15.size();
                            int i27 = 0;
                            while (i27 < size7) {
                                Object obj10 = arrayList15.get(i27);
                                i27++;
                                arrayList13.add(nx4.i(0, (TL_stars.TL_starGiftUnique) obj10, false, true, false, true, true));
                            }
                            if (qb9Var2.y || !qb9Var2.z) {
                                c6c q18 = c6c.q(10, 35);
                                q18.v = 1;
                                arrayList13.add(q18);
                                c6c q19 = c6c.q(11, 35);
                                q19.v = 1;
                                arrayList13.add(q19);
                                c6c q20 = c6c.q(12, 35);
                                q20.v = 1;
                                arrayList13.add(q20);
                                c6c q21 = c6c.q(13, 35);
                                q21.v = 1;
                                arrayList13.add(q21);
                                c6c q22 = c6c.q(14, 35);
                                q22.v = 1;
                                arrayList13.add(q22);
                                c6c q23 = c6c.q(15, 35);
                                q23.v = 1;
                                arrayList13.add(q23);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                ((ArrayList) obj).add(c6c.k(((cd9) obj3).S1));
                break;
            case 11:
                gd9 gd9Var = (gd9) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                arrayList16.add(c6c.j(1, gd9Var.V1));
                arrayList16.add(c6c.j(3, gd9Var.Y1));
                if (gd9Var.d2 != null) {
                    arrayList16.add(c6c.j(2, gd9Var.W1));
                    break;
                }
                break;
            case 12:
                ch9.K3((ch9[]) obj3, (ArrayList) obj, (l7c) obj2);
                break;
            case 13:
                ch9 ch9Var = (ch9) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList17 = (ArrayList) obj2;
                ArrayList arrayList18 = ch9Var.t3;
                ArrayList arrayList19 = new ArrayList(arrayList17.size());
                int size8 = arrayList17.size();
                int i28 = 0;
                while (i28 < size8) {
                    Object obj11 = arrayList17.get(i28);
                    i28++;
                    Object obj12 = ((c6c) obj11).H;
                    if (obj12 instanceof ll0) {
                        arrayList19.add((ll0) obj12);
                    }
                }
                if (arrayList19.size() >= 2) {
                    ArrayList arrayList20 = new ArrayList();
                    int size9 = arrayList19.size();
                    int i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i30 = 0;
                    int i31 = 0;
                    while (i31 < size9) {
                        Object obj13 = arrayList19.get(i31);
                        i31++;
                        ll0 ll0Var = (ll0) obj13;
                        int indexOf = arrayList18.indexOf(ll0Var);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i32 = indexOf + 1;
                            if (ch9.t3(ll0Var) && !((TL_iv.pageBlockDetails) ll0Var.b).open) {
                                int M3 = ch9Var.M3(indexOf);
                                i32 = M3 >= arrayList18.size() ? arrayList18.size() : M3 + 1;
                            }
                            arrayList20.add(new ArrayList(arrayList18.subList(indexOf, i32)));
                            i29 = Math.min(i29, indexOf);
                            i3 = Math.max(i3, i32);
                            i30 += i32 - indexOf;
                        }
                    }
                    if (i30 == i3 - i29) {
                        ArrayList arrayList21 = new ArrayList(i30);
                        int size10 = arrayList20.size();
                        int i33 = 0;
                        while (i33 < size10) {
                            Object obj14 = arrayList20.get(i33);
                            i33++;
                            arrayList21.addAll((ArrayList) obj14);
                        }
                        for (int i34 = 0; i34 < arrayList21.size(); i34++) {
                            if (arrayList18.get(i29 + i34) != arrayList21.get(i34)) {
                                of9 of9Var2 = ch9Var.R3;
                                if (of9Var2 != null) {
                                    of9Var2.d();
                                }
                                for (int i35 = 0; i35 < arrayList21.size(); i35++) {
                                    arrayList18.set(i29 + i35, (ll0) arrayList21.get(i35));
                                }
                                ll0 ll0Var2 = ch9Var.a4;
                                ArrayList arrayList22 = ch9.A4;
                                if (ll0Var2 != null) {
                                    ArrayList arrayList23 = ll0Var2.k;
                                    int indexOf2 = arrayList18.indexOf(ll0Var2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList24 = indexOf2 > 0 ? ((ll0) arrayList18.get(indexOf2 - 1)).k : arrayList22;
                                        int i36 = indexOf2 + 1;
                                        if (i36 < arrayList18.size()) {
                                            arrayList22 = ((ll0) arrayList18.get(i36)).k;
                                        }
                                        if (arrayList24.size() < arrayList22.size()) {
                                            arrayList24 = arrayList22;
                                        }
                                        if (!arrayList23.equals(arrayList24)) {
                                            arrayList23.clear();
                                            arrayList23.addAll(arrayList24);
                                            objArr = true;
                                            boolean t2 = ch9Var.t2();
                                            i2 = 0;
                                            while (i2 < arrayList18.size()) {
                                                ll0 ll0Var3 = (ll0) arrayList18.get(i2);
                                                if (!ll0Var3.i && !ch9.t3(ll0Var3)) {
                                                    ll0 ll0Var4 = i2 > 0 ? (ll0) arrayList18.get(i2 - 1) : null;
                                                    int max2 = ll0Var4 != null ? Math.max(0, ll0Var4.c) : 0;
                                                    if (ch9.A3(ll0Var3.b)) {
                                                        ll0Var3.c = max2;
                                                        if (max2 > 0) {
                                                            ll0Var3.d = ll0Var4.d > 0 ? 1 : 0;
                                                            ll0Var3.e = false;
                                                            ll0Var3.f = false;
                                                        }
                                                    } else {
                                                        int i37 = ll0Var3.c;
                                                        max2++;
                                                        if (i37 > max2) {
                                                            ll0Var3.c = max2;
                                                        } else {
                                                            max2 = i37;
                                                        }
                                                    }
                                                    if (max2 <= 0) {
                                                        ll0Var3.c = 0;
                                                        ll0Var3.d = 0;
                                                        ll0Var3.e = false;
                                                        ll0Var3.f = false;
                                                    }
                                                }
                                                i2++;
                                            }
                                            ch9Var.t4();
                                            ch9Var.V1();
                                            if (!objArr == true || t2) {
                                                ch9Var.g3.O(true);
                                                ch9Var.z4();
                                            } else {
                                                ch9Var.z4();
                                            }
                                            of9Var = ch9Var.R3;
                                            if (of9Var == null) {
                                                of9Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean t22 = ch9Var.t2();
                                i2 = 0;
                                while (i2 < arrayList18.size()) {
                                }
                                ch9Var.t4();
                                ch9Var.V1();
                                if (objArr == true) {
                                }
                                ch9Var.g3.O(true);
                                ch9Var.z4();
                                of9Var = ch9Var.R3;
                                if (of9Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 14:
                vs9 vs9Var = (vs9) obj3;
                vs9Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                vs9Var.e = paint;
                Bitmap bitmap3 = vs9Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                vs9Var.d = bitmapShader;
                paint.setShader(bitmapShader);
                vs9Var.f = new Matrix();
                jz4 jz4Var2 = vs9Var.h;
                jz4Var2.a((Bitmap) obj2);
                tl0.c(jz4Var2, vs9Var.s);
                ViewGroup viewGroup = vs9Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 15:
                ((ArrayList) obj).add(c6c.k(((ud5) obj3).T1));
                break;
            case 16:
                b(obj, obj2);
                break;
            case 17:
                c(obj, obj2);
                break;
            case 18:
                d(obj, obj2);
                break;
            case 19:
                e(obj, obj2);
                break;
            case 20:
                a6a a6aVar = (a6a) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    a6aVar.getMessagesController().T3(updates, false);
                    break;
                }
                break;
            case 21:
                ((daa) obj3).b0((ArrayList) obj);
                break;
            case 22:
                woa woaVar = (woa) obj3;
                ArrayList arrayList25 = (ArrayList) obj;
                LinearLayout linearLayout = woaVar.T1;
                if (linearLayout != null) {
                    arrayList25.add(c6c.k(linearLayout));
                }
                LinearLayout linearLayout2 = woaVar.U1;
                if (linearLayout2 != null) {
                    arrayList25.add(c6c.k(linearLayout2));
                    break;
                }
                break;
            case 23:
                f(obj, obj2);
                break;
            case 24:
                ((nxa) obj3).F0((ArrayList) obj, (l7c) obj2);
                break;
            case 25:
                g(obj, obj2);
                break;
            case 26:
                h(obj, obj2);
                break;
            case 27:
                i(obj, obj2);
                break;
            case 28:
                j(obj, obj2);
                break;
            default:
                x2b x2bVar = (x2b) obj3;
                CharSequence charSequence = (CharSequence) obj;
                x2bVar.q1.setText(charSequence);
                TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
                tL_stickers_renameStickerSet.stickerset = hs6.b0(x2bVar.M1.set);
                tL_stickers_renameStickerSet.title = charSequence.toString();
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_stickers_renameStickerSet, new th1((qac) obj2, b2));
                break;
        }
    }
}
