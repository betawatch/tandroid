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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf8 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        iy9 iy9Var = (iy9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        hy9 hy9Var = iy9Var.b2;
        hy9 hy9Var2 = iy9Var.a2;
        TLRPC.User user = iy9Var.T1;
        hy9 hy9Var3 = iy9Var.Z1;
        if (hy9Var3 != null) {
            ArrayList arrayList2 = hy9Var3.d;
            if (hy9Var2 != null) {
                ArrayList arrayList3 = hy9Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(y6c.h(iy9Var.a).e()));
                arrayList.add(c4c.E(3, gl.L(64.0f)));
                int i = 29;
                if (hy9Var != null && !TextUtils.isEmpty(hy9Var.c.q)) {
                    ArrayList arrayList4 = hy9Var.d;
                    int size = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList4.get(i2);
                        i2++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(cf3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(cf3.d(tLObject)));
                            c4c w = c4c.w(tLObject);
                            w.L(cf3.d(tLObject) == cf3.d(iy9Var.V1));
                            arrayList.add(w);
                        }
                    }
                    if (hy9Var.f) {
                        arrayList.add(c4c.p(29));
                        arrayList.add(c4c.p(29));
                        arrayList.add(c4c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(c4c.k(iy9Var.Y1));
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
                        if (cf3.d((TLObject) obj4) == cf3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(cf3.d(user)))) {
                                arrayList.add(c4c.r(k96.M0(hc2.V(iy9Var.S1) ? 2131752504 : 2131749307, null)));
                                hashSet.add(Long.valueOf(cf3.d(user)));
                                c4c w2 = c4c.w(user);
                                w2.L(cf3.d(user) == cf3.d(iy9Var.V1));
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
                    if (!hashSet.contains(Long.valueOf(cf3.d(tLObject2)))) {
                        if (z) {
                            arrayList.add(c4c.r(k96.M0(hc2.V(iy9Var.S1) ? 2131752504 : 2131749307, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(cf3.d(tLObject2)));
                        c4c w3 = c4c.w(tLObject2);
                        w3.L(cf3.d(tLObject2) == cf3.d(iy9Var.V1));
                        arrayList.add(w3);
                    }
                    i = i5;
                }
                int i6 = i;
                if (hy9Var3.f) {
                    arrayList.add(c4c.p(i6));
                    arrayList.add(c4c.p(i6));
                    arrayList.add(c4c.p(i6));
                }
                if (user == null || hashSet.contains(Long.valueOf(cf3.d(user)))) {
                    z2 = true;
                } else {
                    arrayList.add(c4c.r(k96.M0(hc2.V(iy9Var.S1) ? 2131752276 : 2131749236, null)));
                    hashSet.add(Long.valueOf(cf3.d(user)));
                    c4c w4 = c4c.w(user);
                    w4.L(cf3.d(user) == cf3.d(iy9Var.V1));
                    arrayList.add(w4);
                    z2 = false;
                }
                int size4 = arrayList3.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj6 = arrayList3.get(i7);
                    i7++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(cf3.d(tLObject3)))) {
                        if (z2) {
                            arrayList.add(c4c.r(k96.M0(hc2.V(iy9Var.S1) ? 2131752276 : 2131749236, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(cf3.d(tLObject3)));
                        c4c w5 = c4c.w(tLObject3);
                        w5.L(cf3.d(tLObject3) == cf3.d(iy9Var.V1));
                        arrayList.add(w5);
                    }
                }
                if (arrayList3.isEmpty() || !hy9Var2.f) {
                    return;
                }
                arrayList.add(c4c.p(i6));
                arrayList.add(c4c.p(i6));
                arrayList.add(c4c.p(i6));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        hy9 hy9Var = (hy9) this.b;
        ArrayList arrayList = hy9Var.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = hy9Var.a;
        ArrayList arrayList2 = hy9Var.d;
        int i2 = 0;
        if (tL_error != null) {
            if (hy9Var.r) {
                arrayList2.clear();
                hy9Var.r = false;
            }
            hy9Var.h = true;
            hy9Var.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        na7.q1(i).b4(channels_channelparticipants.users, false);
        na7.q1(i).V3(channels_channelparticipants.chats, false);
        if (hy9Var.r) {
            arrayList2.clear();
            hy9Var.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject Z1 = na7.q1(i).Z1(cf3.n(channelParticipant.peer));
            if (Z1 != null) {
                arrayList2.add(Z1);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            hy9Var.h = true;
        }
        hy9Var.f = false;
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj4 = arrayList.get(i2);
            i2++;
            ((Runnable) obj4).run();
        }
    }

    private final void d(Object obj, Object obj2) {
        ny9 ny9Var = (ny9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        xsa xsaVar = ny9Var.T1;
        if (xsaVar == null) {
            return;
        }
        ArrayList arrayList2 = xsaVar.l;
        arrayList.add(c4c.D(gl.L(16.0f)));
        if (xsaVar.i && arrayList2.isEmpty()) {
            c4c q = c4c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            c4c q2 = c4c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            c4c q3 = c4c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            c4c q4 = c4c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c4c q5 = c4c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c4c q6 = c4c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            c4c q7 = c4c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            c4c q8 = c4c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            c4c q9 = c4c.q(9, 34);
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
                if (!savedStarGift.collection_id.contains(Integer.valueOf(ny9Var.S1))) {
                    int i4 = mv4.b;
                    c4c K = c4c.K(mv4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = ny9Var.U1;
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
            if (xsaVar.i || !xsaVar.j) {
                while (true) {
                    if (i >= (i2 <= 0 ? 3 : i2)) {
                        break;
                    }
                    i++;
                    c4c q10 = c4c.q(i, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(c4c.D(gl.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        qy9 qy9Var = (qy9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i = qy9Var.W1;
        y1b y1bVar = qy9Var.U1;
        if (y1bVar == null) {
            return;
        }
        arrayList.add(c4c.D(gl.L(16.0f)));
        ArrayList arrayList2 = y1bVar.i;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            k27 k27Var = (k27) obj3;
            int i5 = v3b.c;
            c4c K = c4c.K(v3b.class);
            K.v = 1;
            K.A = 0;
            K.H = k27Var;
            K.C = (k27Var == null || (storyItem = k27Var.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i;
            K.L(qy9Var.V1.containsKey(Integer.valueOf(k27Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i3--;
            if (i3 == 0) {
                i3 = i;
            }
        }
        if (y1bVar.k() || !y1bVar.r) {
            while (true) {
                if (i2 >= (i3 <= 0 ? i : i3)) {
                    break;
                }
                i2++;
                c4c q = c4c.q(i2, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(c4c.D(gl.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        kna knaVar = (kna) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = knaVar.Y1;
        boolean z = knaVar.p2;
        ee0 ee0Var = knaVar.b2;
        ArrayList arrayList3 = knaVar.W1;
        ArrayList arrayList4 = knaVar.V1;
        ee0 ee0Var2 = knaVar.a2;
        ee0 ee0Var3 = knaVar.Z1;
        ArrayList arrayList5 = knaVar.X1;
        if (arrayList5 == null || arrayList4 == null || arrayList3 == null) {
            return;
        }
        arrayList.add(c4c.D(gl.L(315.0f)));
        int i = 0;
        ee0Var3.a = 0;
        ee0Var3.b();
        ee0Var2.a = 0;
        ee0Var2.b();
        ee0Var.a = 0;
        ee0Var.b();
        int i2 = knaVar.e2.s;
        if (i2 == 0) {
            arrayList.add(c4c.g(gl.S2(k96.H(',', z ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList5.size()))));
            int size = arrayList5.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(c4c.g(gl.S2(k96.H(',', z ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList5.size()))));
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj4 = arrayList2.get(i);
                i++;
                arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
            }
            return;
        }
        if (i2 == 1) {
            arrayList.add(c4c.g(gl.S2(k96.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
            int size3 = arrayList4.size();
            while (i < size3) {
                Object obj5 = arrayList4.get(i);
                i++;
                arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) ee0Var.b())));
            }
            return;
        }
        if (i2 == 2) {
            arrayList.add(c4c.g(gl.S2(k96.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj6 = arrayList3.get(i);
                i++;
                arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ee0Var.b())));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        vua vuaVar = (vua) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(c4c.k(vuaVar.S1));
        arrayList.add(c4c.u(k96.M0(2131743973, null)));
        ArrayList r = gta.v(vuaVar.a, false).r();
        if (r == null || r.isEmpty()) {
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < r.size(); i3++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i3);
                if (vuaVar.X1 || !tL_starsGiftOption.extended) {
                    int i4 = i2 + 1;
                    int i5 = wua.b;
                    c4c K = c4c.K(wua.class);
                    K.d = i3;
                    K.A = i2;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = k96.H(' ', "StarsCount", (int) j);
                    K.n = tL_starsGiftOption.loadingStorePrice ? null : ci0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i2 = i4;
                } else {
                    i++;
                }
            }
            boolean z = vuaVar.X1;
            if (!z && i > 0) {
                String M0 = k96.M0(z ? 2131747652 : 2131747643, null);
                boolean z2 = !vuaVar.X1;
                int i6 = sua.b;
                c4c K2 = c4c.K(sua.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = z2;
                K2.r = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(c4c.k(vuaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        zua zuaVar = (zua) this.b;
        ArrayList arrayList = (ArrayList) obj;
        long j = zuaVar.S1;
        dr0 dr0Var = zuaVar.T1;
        arrayList.add(c4c.m(dr0Var));
        boolean z = zuaVar.Y1;
        if (z) {
            oo1.o(2131743973, null, arrayList);
        }
        ArrayList w = gta.v(zuaVar.a, false).w();
        if (z) {
            if (w == null || w.isEmpty()) {
                arrayList.add(c4c.p(31));
                arrayList.add(c4c.p(31));
                arrayList.add(c4c.p(31));
            } else {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !zuaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(wua.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(c4c.k(dr0Var));
                    arrayList.add(c4c.u(k96.M0(2131743973, null)));
                    int i5 = 0;
                    for (int i6 = 0; i6 < w.size(); i6++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i6);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(wua.i(i6, i3, tL_starsTopupOption2));
                            i5++;
                            i3++;
                        }
                    }
                    if (i5 == 0) {
                        int i7 = 0;
                        while (i7 < w.size()) {
                            arrayList.add(wua.i(i7, i3, (TL_stars.TL_starsTopupOption) w.get(i7)));
                            i7++;
                            i3++;
                        }
                        boolean z3 = zuaVar.a2;
                        if (!z3 && i2 > 0) {
                            String M0 = k96.M0(z3 ? 2131747652 : 2131747643, null);
                            boolean z4 = !zuaVar.a2;
                            int i8 = sua.b;
                            c4c K = c4c.K(sua.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = z4;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        zuaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z5 = zuaVar.a2;
                    if (!z5 && i2 > 0) {
                        String M02 = k96.M0(z5 ? 2131747652 : 2131747643, null);
                        boolean z6 = !zuaVar.a2;
                        int i9 = sua.b;
                        c4c K2 = c4c.K(sua.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = z6;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i10 = 0;
                    while (i10 < w.size()) {
                        arrayList.add(wua.i(i10, i3, (TL_stars.TL_starsTopupOption) w.get(i10)));
                        i10++;
                        i3++;
                    }
                }
            }
        }
        arrayList.add(c4c.k(zuaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        ava avaVar = (ava) this.b;
        ArrayList arrayList = (ArrayList) obj;
        oo1.o(2131743973, null, arrayList);
        ArrayList w = gta.v(avaVar.a, false).w();
        if (w == null || w.isEmpty()) {
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
        } else {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < w.size(); i3++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i3);
                if (!tL_starsTopupOption.extended || avaVar.U1) {
                    arrayList.add(wua.i(i3, i2, tL_starsTopupOption));
                    i2++;
                } else {
                    i++;
                }
            }
            boolean z = avaVar.U1;
            if (!z && i > 0) {
                String M0 = k96.M0(z ? 2131747652 : 2131747643, null);
                boolean z2 = !avaVar.U1;
                int i4 = sua.b;
                c4c K = c4c.K(sua.class);
                K.d = -1;
                K.m = M0;
                K.f = z2;
                K.r = true;
                arrayList.add(K);
            }
        }
        arrayList.add(c4c.k(avaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        gva gvaVar = (gva) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        boolean z = gvaVar.e;
        int i3 = gvaVar.d;
        long j = gvaVar.f;
        int i4 = gvaVar.c;
        if (j != 0) {
            ct0 g = ct0.g(i4);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                int i6 = dva.b;
                c4c K = c4c.K(dva.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (g.k(j).e[i3]) {
                return;
            }
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            return;
        }
        gta v = gta.v(i4, z);
        ArrayList[] arrayListArr = v.q;
        if (z && uz4.c(i4)) {
            if (gvaVar.n == null) {
                gvaVar.n = new kyb();
            }
            gvaVar.r = c.C(i4).x();
            ArrayList arrayList4 = arrayListArr[i3];
            kyb kybVar = gvaVar.n;
            tz4 tz4Var = uz4.b[i4];
            String x = c.C(i4).x();
            HashSet hashSet = kybVar.a;
            HashSet hashSet2 = kybVar.a;
            HashMap hashMap = kybVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            kybVar.b(4, new ArrayList(hashSet2));
            if (tz4Var != null && tz4Var.g == null && System.currentTimeMillis() - tz4Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + tz4Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = tz4Var.c;
                wallettransaction.date = tz4Var.d;
                wallettransaction.peer = new hyb(x);
                arrayList2.add(jyb.i(wallettransaction, kybVar));
            }
            HashSet e = uz4.e(i4);
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 == null || ((!e.contains(str2) && (tz4Var == null || !starsTransaction.id.equals(tz4Var.g))) || starsTransaction.amount == null)) {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i8 = dva.b;
                    c4c K2 = c4c.K(dva.class);
                    K2.H = starsTransaction;
                    K2.r = false;
                    arrayList2.add(K2);
                } else {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (tz4Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(tz4Var.g)) {
                            str = tz4Var.b;
                            sb.append(str);
                            wallettransaction2.id = sb.toString();
                            wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                            wallettransaction2.failed = starsTransaction.failed;
                            i2 = i3;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new hyb(x);
                            arrayList2.add(jyb.i(wallettransaction2, kybVar));
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
                    wallettransaction2.peer = new hyb(x);
                    arrayList2.add(jyb.i(wallettransaction2, kybVar));
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
                int i10 = dva.b;
                c4c K3 = c4c.K(dva.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (v.u[i]) {
            return;
        }
        arrayList2.add(c4c.q(arrayList2.size(), 7));
        arrayList2.add(c4c.q(arrayList2.size(), 7));
        arrayList2.add(c4c.q(arrayList2.size(), 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a7  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i;
        Object[] objArr;
        int i2;
        ld9 ld9Var;
        byte b = this.a;
        byte b2 = 5;
        int i3 = -1;
        byte b3 = 3;
        char c = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                uf8 uf8Var = (uf8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                String M0 = k96.M0(2131754273, null);
                c4c c4cVar = new c4c(2);
                c4cVar.m = M0;
                c4cVar.k = R.raw.bubble;
                arrayList.add(c4cVar);
                c4c i4 = c4c.i(1, k96.M0(2131754274, null));
                i4.L(uf8Var.n);
                arrayList.add(i4);
                arrayList.add(c4c.B(2, null));
                if (uf8Var.n) {
                    oo1.o(2131746684, null, arrayList);
                    int[] a = ija.a(new int[]{0, 10, 50, 100, kk7.d3, kk7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) uf8Var.getMessagesController().k4.H1.f());
                    sc8 sc8Var = new sc8((byte) 1);
                    hja hjaVar = new hja();
                    hjaVar.c = a;
                    hjaVar.d = (byte) 20;
                    hjaVar.e = sc8Var;
                    uf8Var.b.d((int) Utilities.k(uf8Var.r, 10000L, 0L), hjaVar, new zf7(uf8Var, (byte) 16));
                    arrayList.add(c4c.j(3, uf8Var.b));
                    arrayList.add(c4c.B(4, uf8Var.r > 0 ? uf8Var.Z() : null));
                    TLRPC.Chat K0 = uf8Var.getMessagesController().K0(Long.valueOf(uf8Var.a));
                    if (K0 != null && !TextUtils.isEmpty(hc2.K(K0, false))) {
                        uf8Var.c.setLink(uf8Var.getMessagesController().N2 + "/" + hc2.K(K0, false) + "?direct");
                        arrayList.add(c4c.u(k96.M0(2131752375, null)));
                        arrayList.add(c4c.j(5, uf8Var.c));
                        break;
                    }
                }
                break;
            case 1:
                yf8 yf8Var = (yf8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = yf8Var.e;
                ArrayList arrayList4 = yf8Var.n;
                if (yf8Var.d == null) {
                    arrayList2.add(c4c.q(-1, 7));
                    arrayList2.add(c4c.q(-2, 7));
                    arrayList2.add(c4c.q(-3, 7));
                    yf8Var.R = false;
                    break;
                } else {
                    boolean isEmpty = TextUtils.isEmpty(yf8Var.x);
                    if (isEmpty) {
                        if (!arrayList3.isEmpty()) {
                            arrayList2.add(c4c.r(k96.M0(2131745530, null)));
                        }
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj4 = arrayList3.get(i5);
                            i5++;
                            c4c c4cVar2 = new c4c(33);
                            c4cVar2.H = (k27) obj4;
                            arrayList2.add(c4cVar2);
                        }
                    } else {
                        if (!arrayList4.isEmpty()) {
                            arrayList2.add(c4c.r(k96.M0(2131745531, null)));
                        }
                        int size2 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj5 = arrayList4.get(i6);
                            i6++;
                            c4c c4cVar3 = new c4c(33);
                            c4cVar3.H = (k27) obj5;
                            arrayList2.add(c4cVar3);
                        }
                    }
                    if (yf8Var.w || ((yf8Var.N && !yf8Var.O) || (!isEmpty && !arrayList4.isEmpty() && !yf8Var.s))) {
                        arrayList2.add(c4c.q(yf8Var.M * 3, 7));
                        arrayList2.add(c4c.q((yf8Var.M * 3) + 1, 7));
                        arrayList2.add(c4c.q((yf8Var.M * 3) + 2, 7));
                    }
                    yf8Var.R = arrayList2.isEmpty();
                    break;
                }
                break;
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.E0(true);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                RectF rectF = ProfileActivity.Z6;
                hx4 hx4Var = profileActivity.Q6;
                hx4Var.a((Bitmap) obj2);
                tk0.c(hx4Var, profileActivity.fragmentView);
                profileActivity.R6.d();
                break;
            case 4:
                pq8 pq8Var = (pq8) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                wjb wjbVar = pq8Var.c;
                lca lcaVar = pq8Var.a;
                xsa xsaVar = pq8Var.e;
                if (xsaVar != null) {
                    if ((!xsaVar.e || xsaVar.g != 783) && xsaVar.l.size() <= 0) {
                        xsa xsaVar2 = pq8Var.e;
                        if (xsaVar2.j && !xsaVar2.i) {
                        }
                    }
                    xsa xsaVar3 = pq8Var.e;
                    int max = Math.max(1, (xsaVar3 == null || (i = xsaVar3.n) == 0) ? 3 : Math.min(3, i));
                    xsa xsaVar4 = pq8Var.e;
                    if (xsaVar4 != null) {
                        ArrayList arrayList6 = xsaVar4.l;
                        int size3 = arrayList6.size();
                        int i7 = 3;
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj6 = arrayList6.get(i8);
                            i8++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                            boolean z = pq8Var.d;
                            int i9 = mv4.b;
                            c4c K = c4c.K(mv4.class);
                            K.v = 1;
                            K.A = 0;
                            K.H = savedStarGift;
                            K.r = true;
                            K.f = false;
                            K.s = z;
                            K.h = pq8Var.h && (pq8Var.e != lcaVar.d || savedStarGift.pinned_to_top);
                            arrayList5.add(K);
                            i7--;
                            if (i7 == 0) {
                                i7 = 3;
                            }
                        }
                        xsa xsaVar5 = pq8Var.e;
                        if (xsaVar5.i || !xsaVar5.j) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < (i7 <= 0 ? 3 : i7)) {
                                    i10++;
                                    c4c q = c4c.q(i10, 34);
                                    q.v = 1;
                                    arrayList5.add(q);
                                }
                            }
                        }
                    }
                    if (lcaVar.d == pq8Var.e) {
                        arrayList5.add(c4c.D(gl.L(20.0f)));
                        if (lcaVar.c == y6c.h(pq8Var.b).e()) {
                            int i11 = bkb.y6;
                            int v0 = bkb.v0(i11, wjbVar);
                            String M02 = k96.M0(2131746478, null);
                            int L = gl.L(24.0f);
                            int i12 = qq8.b;
                            c4c K2 = c4c.K(qq8.class);
                            K2.m = M02;
                            K2.A = 17;
                            K2.C = v0;
                            K2.B = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.r = false;
                            K2.H = wjbVar;
                            K2.I = Integer.valueOf(i11);
                            arrayList5.add(K2);
                        }
                        arrayList5.add(c4c.D(gl.L(82.0f)));
                    } else if (!arrayList5.isEmpty()) {
                        arrayList5.add(c4c.D(gl.L(82.0f)));
                    }
                    if (!arrayList5.isEmpty()) {
                        arrayList5.add(0, c4c.D(gl.L(pq8Var.I ? 42.0f : 12.0f)));
                    }
                    if (pq8Var.f.getSpanCount() != max) {
                        gl.c3(new zp8(pq8Var, max, c == true ? 1 : 0));
                    }
                    lcaVar.p();
                    lcaVar.post(new tp8(lcaVar, (byte) 3));
                    break;
                }
                break;
            case 5:
                js8 js8Var = (js8) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!js8Var.T && !js8Var.S) {
                    js8Var.H = bitmap;
                    js8Var.n.invalidate();
                    js8Var.d();
                    js8Var.F.a(bitmap2);
                    js8Var.h.post(new ds8(js8Var, (byte) 0));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 6:
                fv8 fv8Var = (fv8) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList7 = fv8Var.e;
                fv8Var.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    fv8Var.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        fv8Var.b.serializeToStream(serializedData);
                        na7.q1(fv8Var.a).X3.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                fv8Var.d = shareThemeBackdrops != null;
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
                a89 a89Var = (a89) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                q5c q5cVar = a89Var.f;
                b89 b89Var = a89Var.w;
                ArrayList arrayList10 = b89Var.r1;
                jo0 jo0Var = a89Var.h;
                if (jo0Var.getMeasuredHeight() <= 0) {
                    jo0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), TLObject.FLAG_31));
                }
                c4c D = c4c.D(jo0Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList9.add(D);
                int measuredHeight = (int) ((jo0Var.getMeasuredHeight() / gl.p) + 0.0f);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a89Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || a89Var.c != null || a89Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || a89Var.c != null) {
                        Context context = a89Var.getContext();
                        int i14 = bkb.K6;
                        int i15 = b89.v1;
                        ld5 ld5Var = new ld5(context, i14, 21, 0, 0, false, false, b89Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = a89Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            ld5Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a89Var.c;
                            if (tL_reportResultChooseOption != null) {
                                ld5Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        zkb.h(bkb.g5, b89Var.J0, ld5Var);
                        c4c k = c4c.k(ld5Var);
                        k.d = -2;
                        arrayList9.add(k);
                        measuredHeight += 40;
                    }
                    if (a89Var.b != null) {
                        for (int i16 = 0; i16 < a89Var.b.options.size(); i16++) {
                            c4c c4cVar4 = new c4c(30);
                            c4cVar4.m = a89Var.b.options.get(i16).text;
                            c4cVar4.k = R.drawable.msg_arrowright;
                            c4cVar4.d = i16;
                            arrayList9.add(c4cVar4);
                            measuredHeight += 50;
                        }
                    } else if (a89Var.c != null) {
                        for (int i17 = 0; i17 < a89Var.c.options.size(); i17++) {
                            c4c c4cVar5 = new c4c(30);
                            c4cVar5.m = a89Var.c.options.get(i17).text;
                            c4cVar5.k = R.drawable.msg_arrowright;
                            c4cVar5.d = i17;
                            arrayList9.add(c4cVar5);
                            measuredHeight += 50;
                        }
                    } else if (a89Var.d != null) {
                        if (a89Var.n == null) {
                            Context context2 = a89Var.getContext();
                            int i18 = b89.v1;
                            z79 z79Var = new z79(a89Var, context2, b89Var.J0);
                            a89Var.n = z79Var;
                            z79Var.setShowLimitWhenNear(100);
                        }
                        a89Var.n.d.setHint(k96.M0(a89Var.d.optional ? 2131746043 : 2131746049, null));
                        c4c k2 = c4c.k(a89Var.n);
                        k2.d = -3;
                        arrayList9.add(k2);
                        long j = b89Var.t1;
                        if (arrayList10 != null && !arrayList10.isEmpty()) {
                            arrayList9.add(c4c.C(k96.M0(arrayList10.size() > 1 ? 2131746045 : 2131746048, null)));
                        } else if (cf3.D(j)) {
                            arrayList9.add(c4c.C(k96.M0(2131746044, null)));
                        } else if (hc2.V(na7.q1(b89Var.a).K0(Long.valueOf(-j)))) {
                            arrayList9.add(c4c.C(k96.M0(2131746047, null)));
                        } else {
                            arrayList9.add(c4c.C(k96.M0(2131746046, null)));
                        }
                        if (a89Var.r == null) {
                            u41 u41Var = new u41(b89Var.J0, a89Var.getContext(), true);
                            a89Var.s = u41Var;
                            u41Var.i(k96.M0(2131746042, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(a89Var.getContext());
                            a89Var.r = frameLayout;
                            zkb.h(bkb.g5, b89Var.J0, frameLayout);
                            a89Var.r.addView(a89Var.s, nme.d(-1, 48.0f, kk7.D1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(a89Var.getContext());
                            zkb.h(bkb.c7, b89Var.J0, view);
                            a89Var.r.addView(view, nme.a(-1.0f, 1.0f / gl.p, 48));
                        }
                        a89Var.s.setEnabled(a89Var.d.optional || !TextUtils.isEmpty(a89Var.n.getText()));
                        a89Var.s.setOnClickListener(new ik8(a89Var, b2));
                        c4c k3 = c4c.k(a89Var.r);
                        k3.d = -4;
                        arrayList9.add(k3);
                        measuredHeight += kk7.w1;
                    }
                    ((c4c) b00.f(1, arrayList9)).j = true;
                    if (b89Var.o1 && a89Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(a89Var.getContext());
                        Drawable mutate = a89Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        zkb.x(frameLayout2, mutate, bkb.a7, b89Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        zkb.x(frameLayout2, colorDrawable, bkb.Z6, b89Var.J0, PorterDuff.Mode.SRC_IN);
                        fm2 fm2Var = new fm2(colorDrawable, mutate, 0, 0);
                        fm2Var.x = true;
                        frameLayout2.setBackground(fm2Var);
                        l46 l46Var = new l46(a89Var.getContext(), null);
                        l46Var.setTextSize(1, 14.0f);
                        l46Var.setText(gl.H2(k96.M0(2131746040, null), b89Var.J0, null));
                        zkb.X(l46Var, bkb.z6, b89Var.J0);
                        l46Var.setGravity(17);
                        frameLayout2.addView(l46Var, nme.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        c4c k4 = c4c.k(frameLayout2);
                        k4.d = -3;
                        arrayList9.add(k4);
                        measuredHeight += 46;
                    }
                }
                if (q5cVar != null) {
                    int i19 = b89.v1;
                    if (b89Var.b.getMeasuredHeight() - gl.m < gl.L(measuredHeight)) {
                        q5cVar.f3.j1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList9);
                        q5cVar.f3.j1(true);
                        break;
                    }
                }
                break;
            case 8:
                z99 z99Var = (z99) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                q99 q99Var = z99Var.d;
                ArrayList arrayList12 = q99Var.d;
                int size5 = arrayList12.size();
                int i20 = 0;
                while (i20 < size5) {
                    Object obj8 = arrayList12.get(i20);
                    i20++;
                    arrayList11.add(mv4.i(0, (TL_stars.TL_starGiftUnique) obj8, false, false, false, true, false));
                }
                if (q99Var.y || !q99Var.z) {
                    c4c q2 = c4c.q(-1, 34);
                    q2.v = 1;
                    arrayList11.add(q2);
                    c4c q3 = c4c.q(-2, 34);
                    q3.v = 1;
                    arrayList11.add(q3);
                    c4c q4 = c4c.q(-3, 34);
                    q4.v = 1;
                    arrayList11.add(q4);
                    if (q99Var.d.isEmpty()) {
                        c4c q5 = c4c.q(-4, 34);
                        q5.v = 1;
                        arrayList11.add(q5);
                        c4c q6 = c4c.q(-5, 34);
                        q6.v = 1;
                        arrayList11.add(q6);
                        c4c q7 = c4c.q(-6, 34);
                        q7.v = 1;
                        arrayList11.add(q7);
                        c4c q8 = c4c.q(-7, 34);
                        q8.v = 1;
                        arrayList11.add(q8);
                        c4c q9 = c4c.q(-8, 34);
                        q9.v = 1;
                        arrayList11.add(q9);
                        c4c q10 = c4c.q(-9, 34);
                        q10.v = 1;
                        arrayList11.add(q10);
                        c4c q11 = c4c.q(-10, 34);
                        q11.v = 1;
                        arrayList11.add(q11);
                        c4c q12 = c4c.q(-11, 34);
                        q12.v = 1;
                        arrayList11.add(q12);
                        c4c q13 = c4c.q(-12, 34);
                        q13.v = 1;
                        arrayList11.add(q13);
                        c4c q14 = c4c.q(-13, 34);
                        q14.v = 1;
                        arrayList11.add(q14);
                        c4c q15 = c4c.q(-14, 34);
                        q15.v = 1;
                        arrayList11.add(q15);
                        c4c q16 = c4c.q(-15, 34);
                        q16.v = 1;
                        arrayList11.add(q16);
                    }
                }
                z99Var.i0(arrayList11.isEmpty() && !q99Var.y);
                break;
            case 9:
                y99 y99Var = (y99) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                x99 x99Var = y99Var.T1;
                if (x99Var != null) {
                    xsa xsaVar6 = x99Var.b;
                    q99 q99Var2 = x99Var.c;
                    if (xsaVar6 != null && q99Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(y99Var.a).getCurrentTime();
                        arrayList13.add(c4c.t(-1, k96.M0(2131749754, null)));
                        ArrayList arrayList14 = xsaVar6.l;
                        int size6 = arrayList14.size();
                        int i21 = 0;
                        int i22 = 0;
                        boolean z2 = true;
                        while (i22 < size6) {
                            Object obj9 = arrayList14.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj9;
                            boolean z3 = z2;
                            if (y99Var.b2.contains(Long.valueOf(savedStarGift2.gift.id)) || cq7.m(savedStarGift2.gift)) {
                                z2 = z3;
                            } else {
                                boolean z4 = savedStarGift2.can_craft_at <= currentTime;
                                c4c i23 = mv4.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i23.g = z4;
                                arrayList13.add(i23);
                                i21++;
                                z2 = false;
                            }
                        }
                        boolean z5 = z2;
                        if (xsaVar6.i || !xsaVar6.j) {
                            int i24 = i21 % 3;
                            int i25 = 6 - i24;
                            for (int i26 = 0; i26 < i25; i26++) {
                                c4c q17 = c4c.q((i26 - i24) + 1, 35);
                                q17.v = 1;
                                arrayList13.add(q17);
                            }
                        } else if (z5) {
                            arrayList13.add(c4c.g(k96.M0(2131749753, null)));
                        }
                        if (q99Var2.e > 0 || y99Var.e2) {
                            y99Var.e2 = true;
                            String M03 = k96.M0(2131749756, null);
                            c4c c4cVar6 = new c4c(42);
                            c4cVar6.d = -2;
                            c4cVar6.p = M03;
                            arrayList13.add(c4cVar6);
                            HorizontalScrollView horizontalScrollView = y99Var.U1;
                            if (horizontalScrollView != null) {
                                arrayList13.add(c4c.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList15 = q99Var2.d;
                            int size7 = arrayList15.size();
                            int i27 = 0;
                            while (i27 < size7) {
                                Object obj10 = arrayList15.get(i27);
                                i27++;
                                arrayList13.add(mv4.i(0, (TL_stars.TL_starGiftUnique) obj10, false, true, false, true, true));
                            }
                            if (q99Var2.y || !q99Var2.z) {
                                c4c q18 = c4c.q(10, 35);
                                q18.v = 1;
                                arrayList13.add(q18);
                                c4c q19 = c4c.q(11, 35);
                                q19.v = 1;
                                arrayList13.add(q19);
                                c4c q20 = c4c.q(12, 35);
                                q20.v = 1;
                                arrayList13.add(q20);
                                c4c q21 = c4c.q(13, 35);
                                q21.v = 1;
                                arrayList13.add(q21);
                                c4c q22 = c4c.q(14, 35);
                                q22.v = 1;
                                arrayList13.add(q22);
                                c4c q23 = c4c.q(15, 35);
                                q23.v = 1;
                                arrayList13.add(q23);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                ((ArrayList) obj).add(c4c.k(((cb9) obj3).S1));
                break;
            case 11:
                gb9 gb9Var = (gb9) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                arrayList16.add(c4c.j(1, gb9Var.V1));
                arrayList16.add(c4c.j(3, gb9Var.Y1));
                if (gb9Var.d2 != null) {
                    arrayList16.add(c4c.j(2, gb9Var.W1));
                    break;
                }
                break;
            case 12:
                ye9.K3((ye9[]) obj3, (ArrayList) obj, (l5c) obj2);
                break;
            case 13:
                ye9 ye9Var = (ye9) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList17 = (ArrayList) obj2;
                ArrayList arrayList18 = ye9Var.t3;
                ArrayList arrayList19 = new ArrayList(arrayList17.size());
                int size8 = arrayList17.size();
                int i28 = 0;
                while (i28 < size8) {
                    Object obj11 = arrayList17.get(i28);
                    i28++;
                    Object obj12 = ((c4c) obj11).H;
                    if (obj12 instanceof lk0) {
                        arrayList19.add((lk0) obj12);
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
                        lk0 lk0Var = (lk0) obj13;
                        int indexOf = arrayList18.indexOf(lk0Var);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i32 = indexOf + 1;
                            if (ye9.t3(lk0Var) && !((TL_iv.pageBlockDetails) lk0Var.b).open) {
                                int M3 = ye9Var.M3(indexOf);
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
                                ld9 ld9Var2 = ye9Var.R3;
                                if (ld9Var2 != null) {
                                    ld9Var2.d();
                                }
                                for (int i35 = 0; i35 < arrayList21.size(); i35++) {
                                    arrayList18.set(i29 + i35, (lk0) arrayList21.get(i35));
                                }
                                lk0 lk0Var2 = ye9Var.a4;
                                ArrayList arrayList22 = ye9.A4;
                                if (lk0Var2 != null) {
                                    ArrayList arrayList23 = lk0Var2.k;
                                    int indexOf2 = arrayList18.indexOf(lk0Var2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList24 = indexOf2 > 0 ? ((lk0) arrayList18.get(indexOf2 - 1)).k : arrayList22;
                                        int i36 = indexOf2 + 1;
                                        if (i36 < arrayList18.size()) {
                                            arrayList22 = ((lk0) arrayList18.get(i36)).k;
                                        }
                                        if (arrayList24.size() < arrayList22.size()) {
                                            arrayList24 = arrayList22;
                                        }
                                        if (!arrayList23.equals(arrayList24)) {
                                            arrayList23.clear();
                                            arrayList23.addAll(arrayList24);
                                            objArr = true;
                                            boolean t2 = ye9Var.t2();
                                            i2 = 0;
                                            while (i2 < arrayList18.size()) {
                                                lk0 lk0Var3 = (lk0) arrayList18.get(i2);
                                                if (!lk0Var3.i && !ye9.t3(lk0Var3)) {
                                                    lk0 lk0Var4 = i2 > 0 ? (lk0) arrayList18.get(i2 - 1) : null;
                                                    int max2 = lk0Var4 != null ? Math.max(0, lk0Var4.c) : 0;
                                                    if (ye9.A3(lk0Var3.b)) {
                                                        lk0Var3.c = max2;
                                                        if (max2 > 0) {
                                                            lk0Var3.d = lk0Var4.d > 0 ? 1 : 0;
                                                            lk0Var3.e = false;
                                                            lk0Var3.f = false;
                                                        }
                                                    } else {
                                                        int i37 = lk0Var3.c;
                                                        max2++;
                                                        if (i37 > max2) {
                                                            lk0Var3.c = max2;
                                                        } else {
                                                            max2 = i37;
                                                        }
                                                    }
                                                    if (max2 <= 0) {
                                                        lk0Var3.c = 0;
                                                        lk0Var3.d = 0;
                                                        lk0Var3.e = false;
                                                        lk0Var3.f = false;
                                                    }
                                                }
                                                i2++;
                                            }
                                            ye9Var.t4();
                                            ye9Var.V1();
                                            if (!objArr == true || t2) {
                                                ye9Var.g3.O(true);
                                                ye9Var.z4();
                                            } else {
                                                ye9Var.z4();
                                            }
                                            ld9Var = ye9Var.R3;
                                            if (ld9Var == null) {
                                                ld9Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean t22 = ye9Var.t2();
                                i2 = 0;
                                while (i2 < arrayList18.size()) {
                                }
                                ye9Var.t4();
                                ye9Var.V1();
                                if (objArr == true) {
                                }
                                ye9Var.g3.O(true);
                                ye9Var.z4();
                                ld9Var = ye9Var.R3;
                                if (ld9Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 14:
                tq9 tq9Var = (tq9) obj3;
                tq9Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                tq9Var.e = paint;
                Bitmap bitmap3 = tq9Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                tq9Var.d = bitmapShader;
                paint.setShader(bitmapShader);
                tq9Var.f = new Matrix();
                hx4 hx4Var2 = tq9Var.h;
                hx4Var2.a((Bitmap) obj2);
                tk0.c(hx4Var2, tq9Var.s);
                ViewGroup viewGroup = tq9Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 15:
                ((ArrayList) obj).add(c4c.k(((wb5) obj3).T1));
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
                z3a z3aVar = (z3a) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    z3aVar.getMessagesController().R3(updates, false);
                    break;
                }
                break;
            case 21:
                ((d8a) obj3).a0((ArrayList) obj);
                break;
            case 22:
                vma vmaVar = (vma) obj3;
                ArrayList arrayList25 = (ArrayList) obj;
                LinearLayout linearLayout = vmaVar.T1;
                if (linearLayout != null) {
                    arrayList25.add(c4c.k(linearLayout));
                }
                LinearLayout linearLayout2 = vmaVar.U1;
                if (linearLayout2 != null) {
                    arrayList25.add(c4c.k(linearLayout2));
                    break;
                }
                break;
            case 23:
                f(obj, obj2);
                break;
            case 24:
                ((jva) obj3).E0((ArrayList) obj, (l5c) obj2);
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
                u0b u0bVar = (u0b) obj3;
                CharSequence charSequence = (CharSequence) obj;
                u0bVar.q1.setText(charSequence);
                TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
                tL_stickers_renameStickerSet.stickerset = hq6.b0(u0bVar.M1.set);
                tL_stickers_renameStickerSet.title = charSequence.toString();
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_stickers_renameStickerSet, new lg1((p8c) obj2, b3));
                break;
        }
    }
}
