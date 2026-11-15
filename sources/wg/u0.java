package wg;

import ai.d1;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.o2;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.a31;
import tg.a2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u0 extends ja {
    public final hi.d T1;
    public final t0 U1;
    public final x3 V1;
    public final ah.e W1;
    public final Paint X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet a2;
    public final HashSet b2;
    public final ArrayList c2;
    public final ArrayList d2;
    public final HashMap e2;
    public final ArrayList f2;
    public final ArrayList g2;
    public final LinkedHashMap h2;
    public final u5 i2;
    public String j2;
    public xg.i k2;
    public int l2;
    public final TLRPC.Chat m2;
    public int n2;
    public i o2;
    public int p2;
    public k q2;
    public final s4.s0 r2;

    public u0(e2 e2Var, long j3) {
        super(e2Var, false);
        this.X1 = new Paint(1);
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        this.a2 = new HashSet();
        this.b2 = new HashSet();
        this.c2 = new ArrayList();
        this.d2 = new ArrayList();
        this.e2 = new HashMap();
        this.f2 = new ArrayList();
        this.g2 = new ArrayList();
        this.h2 = new LinkedHashMap();
        this.l2 = org.telegram.messenger.g0.L(134.0f);
        this.r2 = new s4.s0(this, 8);
        this.u0 = 0;
        this.m2 = np.s1(this.a).M0(Long.valueOf(-j3));
        ((ViewGroup) this.p1.getParent()).removeView(this.p1);
        ViewGroup viewGroup = this.b;
        er erVar = er.h;
        this.i2 = new u5(viewGroup, 0L, 350L, erVar);
        ah.e eVar = new ah.e(getContext(), this.J0);
        this.W1 = eVar;
        eVar.setOnCloseClickListener(new p0(this, 7));
        eVar.setText(O0());
        eVar.setCloseImageVisible(true);
        eVar.f.c(false, 0.0f);
        t0 t0Var = new t0(this, getContext(), this.J0);
        this.U1 = t0Var;
        int i7 = j6.h5;
        q6.h(i7, t0Var, this.J0);
        t0Var.setOnSearchTextChange(new r0(this, 0));
        this.V1 = new x3(getContext(), this.J0);
        o1();
        ViewGroup viewGroup2 = this.b;
        int i10 = this.u0;
        viewGroup2.addView(eVar, c8.ja.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.b;
        int i11 = this.u0;
        viewGroup3.addView(t0Var, c8.ja.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (uj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        q6.h(i7, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.T1 = dVar;
        dVar.setOnClickListener(new q0(this, 1));
        aVar.addView(dVar, c8.ja.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i12 = this.u0;
        viewGroup4.addView(aVar, c8.ja.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.i iVar = this.k2;
        uj0 uj0Var = this.o1;
        iVar.n = arrayList;
        iVar.f = uj0Var;
        int i13 = this.u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.o1.j(new vh.d(this, 1));
        this.o1.setOnItemClickListener(new a2(this, 12));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(erVar);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new ai.h0(this, 9));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static /* synthetic */ void d1(u0 u0Var, boolean z10, Pair pair) {
        HashMap hashMap = u0Var.e2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            u0Var.f2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new vh.c(u0Var, 1));
        }
        if (u0Var.n2 == 3) {
            u0Var.n1(true, true);
            u0Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!com.google.android.gms.internal.vision.e2.s(tL_help_country)) {
            return false;
        }
        String lowerCase = org.telegram.messenger.g0.N3(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || i5.c.A(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = org.telegram.messenger.g0.N3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || i5.c.A(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.r2);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        xg.i iVar = new xg.i(getContext(), this.J0, true);
        this.k2 = iVar;
        return iVar;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        int i7 = this.n2;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131753288, null) : hd.M0(2131753603, null) : hd.M0(2131749680, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final void R0(Canvas canvas, int i7) {
        this.p2 = i7;
        float f10 = org.telegram.messenger.g0.m;
        ah.e eVar = this.W1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.U1.setTranslationY(translationY);
        this.o1.setTranslationY((r2.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = j6.w0(j6.h5, this.J0);
        Paint paint = this.X1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        boolean z10 = max < org.telegram.messenger.g0.m;
        u5 u5Var = this.i2;
        int W1 = org.telegram.messenger.g0.W1(u5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.u0, W1, this.b.getWidth() - this.u0, org.telegram.messenger.g0.L(14.0f) + this.b.getHeight());
        float L = (1.0f - u5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        i iVar = this.o2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void e1() {
        if (TextUtils.isEmpty(this.j2)) {
            return;
        }
        this.j2 = null;
        this.U1.setText("");
        org.telegram.messenger.g0.r(this.r2);
        ArrayList arrayList = this.c2;
        arrayList.clear();
        arrayList.addAll(q.e(this.m2.id));
        n1(false, false);
        n1(true, true);
    }

    public final void f1(int i7, String str, boolean z10) {
        TLRPC.Chat chat = this.m2;
        if (i7 == 1) {
            long j3 = chat.id;
            s0 s0Var = new s0(this, z10, 0);
            np s12 = np.s1(m10.t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.t0);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = s12.h1(j3);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new a31(10, s12, s0Var));
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            s0 s0Var2 = new s0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(m10.t0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = hd.E0().B != null ? hd.E0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new d1(s0Var2, 24));
            return;
        }
        long j10 = chat.id;
        r0 r0Var = new r0(this, 1);
        np s13 = np.s1(m10.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(m10.t0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new o2(s13, j10, r0Var, 7));
    }

    public final void h1(int i7, List list) {
        this.n2 = i7;
        this.j2 = null;
        HashSet hashSet = this.b2;
        hashSet.clear();
        HashSet hashSet2 = this.a2;
        hashSet2.clear();
        ArrayList arrayList = this.c2;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.h2;
        linkedHashMap.clear();
        if (i7 == 1) {
            arrayList.addAll(this.d2);
        } else if (i7 == 2) {
            arrayList.addAll(q.e(this.m2.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j3 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j3 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        t0 t0Var = this.U1;
        t0Var.setText("");
        t0Var.d.b(false);
        t0Var.b(false, hashSet2, new p0(this, 4), this.g2);
        o1();
        n1(false, true);
        this.W1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        HashSet hashSet = this.a2;
        if (hashSet.size() != 0 || z10) {
            int i7 = this.n2;
            LinkedHashMap linkedHashMap = this.h2;
            if (i7 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                k kVar = this.q2;
                if (kVar != null) {
                    kVar.c.m1.C(0);
                    y yVar = kVar.a;
                    ArrayList arrayList2 = yVar.Z1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i10 = yg.d.w;
                        yVar.e2 = 0;
                    } else {
                        int i11 = yg.d.w;
                        yVar.e2 = 1;
                    }
                    yVar.j2 = 0;
                    yVar.k1(false, true);
                    yVar.j1(true);
                    yVar.b1();
                    return;
                }
                return;
            }
            if (i7 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                k kVar2 = this.q2;
                if (kVar2 != null) {
                    l lVar = kVar2.c;
                    lVar.m1.C(0);
                    y yVar2 = kVar2.a;
                    boolean z11 = !lVar.d;
                    ArrayList arrayList4 = yVar2.Y1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    yVar2.k1(z11, true);
                    return;
                }
                return;
            }
            if (i7 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.g2;
            int size = arrayList6.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList6.get(i12);
                i12++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            k kVar3 = this.q2;
            if (kVar3 != null) {
                kVar3.c.m1.C(0);
                y yVar3 = kVar3.a;
                ArrayList arrayList7 = yVar3.a2;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                yVar3.k1(false, true);
            }
        }
    }

    public final void j1(boolean z10) {
        uj0 uj0Var = this.o1;
        if (!z10) {
            uj0Var.v0(0);
            return;
        }
        pi.l lVar = new pi.l(getContext(), 2, 0.6f);
        lVar.a = 1;
        lVar.p = org.telegram.messenger.g0.L(38.0f);
        uj0Var.getLayoutManager().w0(lVar);
    }

    public final void k1() {
        int i7 = this.n2;
        String G = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.G((int) np.s1(m10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : hd.G((int) q.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : hd.M0(2131753272, null);
        k kVar = this.q2;
        if (kVar != null) {
            new cc(kVar.c.c, kVar.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void l1(boolean z10) {
        hi.d dVar = this.T1;
        dVar.setShowZero(false);
        int i7 = this.n2;
        dVar.i(i7 != 1 ? (i7 == 2 || i7 == 3) ? hd.M0(2131745946, null) : "" : hd.M0(2131753289, null), z10, true);
        HashSet hashSet = this.a2;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void m1(boolean z10, boolean z11) {
        int i7;
        xg.i iVar;
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.n2 == 1) {
            String M0 = hd.M0(2131749552, null);
            xg.h hVar = new xg.h(9, false);
            hVar.i = 1;
            hVar.j = R.drawable.menu_random;
            hVar.g = M0;
            arrayList2.add(hVar);
        }
        xg.h hVar2 = new xg.h(10, false);
        x3 x3Var = this.V1;
        hVar2.q = x3Var;
        arrayList2.add(hVar2);
        int i10 = this.n2;
        HashSet hashSet = this.a2;
        if (i10 == 3) {
            ArrayList arrayList3 = this.f2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.e2.get(str)) {
                    if (TextUtils.isEmpty(this.j2) || g1(tL_help_country, org.telegram.messenger.g0.N3(this.j2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.h hVar3 = new xg.h(6, true);
                        hVar3.f = tL_help_country;
                        hVar3.k = contains;
                        arrayList4.add(hVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(32.0f) + i7;
                    String upperCase = str.toUpperCase();
                    xg.h hVar4 = new xg.h(7, false);
                    hVar4.g = upperCase;
                    arrayList2.add(hVar4);
                    arrayList2.addAll(arrayList4);
                    i7 = L;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i7 = 0;
        }
        ArrayList arrayList6 = this.c2;
        int size2 = arrayList6.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList6.get(i12);
            i12++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i7 += org.telegram.messenger.g0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(m5.n(inputPeer)));
            xg.h hVar5 = new xg.h(3, true);
            hVar5.d = inputPeer;
            hVar5.c = null;
            hVar5.e = null;
            hVar5.k = contains2;
            arrayList2.add(hVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int i13 = 0;
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i7);
        xg.h hVar6 = new xg.h(-1, false);
        hVar6.l = max;
        arrayList2.add(hVar6);
        if (hashSet.size() > 0 && this.n2 != 3) {
            x3Var.a(hd.M0(2131743630, null), new q0(this, i13));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (!z11 || (iVar = this.k2) == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.o1;
            if (i7 >= uj0Var.getChildCount()) {
                l1(z10);
                return;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt instanceof ah.r) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.Z1;
                    if (R < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(R);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.k, z10);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            rVar.i(z10, this.k2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            rVar.i(z10, 1.0f);
                        }
                    }
                }
                i7++;
            }
            if (childAt instanceof ah.c) {
                ((ah.c) childAt).c(this.a2.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i7++;
        }
    }

    public final void o1() {
        String H;
        int i7 = this.n2;
        x3 x3Var = this.V1;
        if (i7 == 1) {
            TLRPC.Chat chat = this.m2;
            H = hd.H(',', t3.V(chat) ? "Subscribers" : "Members", Math.max(0, this.k2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        } else if (i7 == 2) {
            H = hd.G((int) q.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            x3Var.setLayerHeight(32);
        } else if (i7 != 3) {
            H = "";
        } else {
            H = hd.G((int) np.s1(m10.t0).q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
            x3Var.setLayerHeight(1);
        }
        x3Var.setText(H);
    }
}
