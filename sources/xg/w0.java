package xg;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ci.u2;
import gi.o1;
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
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.m21;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w0 extends ma {
    public final gi.d Q1;
    public final v0 R1;
    public final x3 S1;
    public final bh.d T1;
    public final Paint U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final HashSet X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashMap b2;
    public final ArrayList c2;
    public final ArrayList d2;
    public final LinkedHashMap e2;
    public final u5 f2;
    public String g2;
    public yg.h h2;
    public int i2;
    public final TLRPC.Chat j2;
    public int k2;
    public k l2;
    public int m2;
    public m n2;
    public final wi.i0 o2;

    public w0(d2 d2Var, long j10) {
        super(d2Var, false);
        this.U1 = new Paint(1);
        this.V1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W1 = arrayList;
        this.X1 = new HashSet();
        this.Y1 = new HashSet();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        this.b2 = new HashMap();
        this.c2 = new ArrayList();
        this.d2 = new ArrayList();
        this.e2 = new LinkedHashMap();
        this.i2 = org.telegram.messenger.g0.L(134.0f);
        this.o2 = new wi.i0(this, 1);
        this.u0 = 0;
        this.j2 = hp.s1(this.a).M0(Long.valueOf(-j10));
        ((ViewGroup) this.m1.getParent()).removeView(this.m1);
        ViewGroup viewGroup = this.b;
        xq xqVar = xq.h;
        this.f2 = new u5(viewGroup, 0L, 350L, xqVar);
        bh.d dVar = new bh.d(getContext(), this.J0);
        this.T1 = dVar;
        dVar.setOnCloseClickListener(new r0(this, 7));
        dVar.setText(O0());
        dVar.setCloseImageVisible(true);
        dVar.f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.J0);
        this.R1 = v0Var;
        int i3 = k6.h5;
        r6.i(i3, v0Var, this.J0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.S1 = new x3(getContext(), this.J0);
        o1();
        ViewGroup viewGroup2 = this.b;
        int i10 = this.u0;
        viewGroup2.addView(dVar, mf.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.b;
        int i11 = this.u0;
        viewGroup3.addView(v0Var, mf.f(-2.0f, -1, 55, i11, 0, i11, 0));
        bh.a aVar = new bh.a(getContext(), this.J0, (tj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i3, aVar, this.J0);
        gi.d dVar2 = new gi.d(getContext(), this.J0, true);
        this.Q1 = dVar2;
        dVar2.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar2, mf.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i12 = this.u0;
        viewGroup4.addView(aVar, mf.f(-2.0f, -1, 87, i12, 0, i12, 0));
        yg.h hVar = this.h2;
        tj0 tj0Var = this.l1;
        hVar.n = arrayList;
        hVar.f = tj0Var;
        int i13 = this.u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.l1.j(new wh.d(this, 1));
        this.l1.setOnItemClickListener(new c(this, 3));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.m = false;
        this.l1.setItemAnimator(kVar);
        this.l1.i(new o1(this, 8));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static /* synthetic */ void d1(w0 w0Var, boolean z10, Pair pair) {
        HashMap hashMap = w0Var.b2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            w0Var.c2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new wh.c(w0Var, 1));
        }
        if (w0Var.k2 == 3) {
            w0Var.n1(true, true);
            w0Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!com.google.android.recaptcha.internal.a.u(tL_help_country)) {
            return false;
        }
        String lowerCase = org.telegram.messenger.g0.O3(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || p1.z(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = org.telegram.messenger.g0.O3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || p1.z(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        org.telegram.messenger.g0.r(this.o2);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        yg.h hVar = new yg.h(getContext(), this.J0, true);
        this.h2 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        int i3 = this.k2;
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : bd.M0(2131753288, null) : bd.M0(2131753603, null) : bd.M0(2131749688, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void R0(Canvas canvas, int i3) {
        this.m2 = i3;
        float f10 = org.telegram.messenger.g0.m;
        bh.d dVar = this.T1;
        dVar.setTranslationY(Math.max(i3, (((dVar.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.R1.setTranslationY(translationY);
        this.l1.setTranslationY((r2.getMeasuredHeight() + dVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = k6.w0(k6.h5, this.J0);
        Paint paint = this.U1;
        paint.setColor(w02);
        int max = Math.max(0, i3);
        boolean z10 = max < org.telegram.messenger.g0.m;
        u5 u5Var = this.f2;
        int W1 = org.telegram.messenger.g0.W1(u5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.u0, W1, this.b.getWidth() - this.u0, org.telegram.messenger.g0.L(14.0f) + this.b.getHeight());
        float L = (1.0f - u5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        k kVar = this.l2;
        if (kVar != null) {
            kVar.run();
        }
    }

    public final void e1() {
        if (TextUtils.isEmpty(this.g2)) {
            return;
        }
        this.g2 = null;
        this.R1.setText("");
        org.telegram.messenger.g0.r(this.o2);
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(s.e(this.j2.id));
        n1(false, false);
        n1(true, true);
    }

    public final void f1(int i3, String str, boolean z10) {
        TLRPC.Chat chat = this.j2;
        if (i3 == 1) {
            long j10 = chat.id;
            u0 u0Var = new u0(this, z10, 0);
            hp s12 = hp.s1(h10.t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = s12.h1(j10);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new m21(11, s12, u0Var));
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            u0 u0Var2 = new u0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(h10.t0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = bd.E0().B != null ? bd.E0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ci.d0(u0Var2, 23));
            return;
        }
        long j11 = chat.id;
        t0 t0Var = new t0(this, 1);
        hp s13 = hp.s1(h10.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(h10.t0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new u2(s13, j11, t0Var, 7));
    }

    public final void h1(int i3, List list) {
        this.k2 = i3;
        this.g2 = null;
        HashSet hashSet = this.Y1;
        hashSet.clear();
        HashSet hashSet2 = this.X1;
        hashSet2.clear();
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.e2;
        linkedHashMap.clear();
        if (i3 == 1) {
            arrayList.addAll(this.a2);
        } else if (i3 == 2) {
            arrayList.addAll(s.e(this.j2.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j10 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        v0 v0Var = this.R1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.d2);
        o1();
        n1(false, true);
        this.T1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        HashSet hashSet = this.X1;
        if (hashSet.size() != 0 || z10) {
            int i3 = this.k2;
            LinkedHashMap linkedHashMap = this.e2;
            if (i3 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                m mVar = this.n2;
                if (mVar != null) {
                    mVar.c.j1.D(0);
                    a0 a0Var = mVar.a;
                    ArrayList arrayList2 = a0Var.W1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i10 = zg.d.w;
                        a0Var.b2 = 0;
                    } else {
                        int i11 = zg.d.w;
                        a0Var.b2 = 1;
                    }
                    a0Var.g2 = 0;
                    a0Var.k1(false, true);
                    a0Var.j1(true);
                    a0Var.b1();
                    return;
                }
                return;
            }
            if (i3 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                m mVar2 = this.n2;
                if (mVar2 != null) {
                    n nVar = mVar2.c;
                    nVar.j1.D(0);
                    a0 a0Var2 = mVar2.a;
                    boolean z11 = !nVar.d;
                    ArrayList arrayList4 = a0Var2.V1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    a0Var2.k1(z11, true);
                    return;
                }
                return;
            }
            if (i3 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.d2;
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
            m mVar3 = this.n2;
            if (mVar3 != null) {
                mVar3.c.j1.D(0);
                a0 a0Var3 = mVar3.a;
                ArrayList arrayList7 = a0Var3.X1;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                a0Var3.k1(false, true);
            }
        }
    }

    public final void j1(boolean z10) {
        tj0 tj0Var = this.l1;
        if (!z10) {
            tj0Var.v0(0);
            return;
        }
        ni.m mVar = new ni.m(getContext(), 2, 0.6f);
        mVar.a = 1;
        mVar.p = org.telegram.messenger.g0.L(38.0f);
        tj0Var.getLayoutManager().w0(mVar);
    }

    public final void k1() {
        int i3 = this.k2;
        String G = i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : bd.G((int) hp.s1(h10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : bd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : bd.M0(2131753272, null);
        m mVar = this.n2;
        if (mVar != null) {
            new fc(mVar.c.c, mVar.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void l1(boolean z10) {
        gi.d dVar = this.Q1;
        dVar.setShowZero(false);
        int i3 = this.k2;
        dVar.i(i3 != 1 ? (i3 == 2 || i3 == 3) ? bd.M0(2131745956, null) : "" : bd.M0(2131753289, null), z10, true);
        HashSet hashSet = this.X1;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void m1(boolean z10, boolean z11) {
        int i3;
        yg.h hVar;
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.k2 == 1) {
            String M0 = bd.M0(2131749560, null);
            yg.g gVar = new yg.g(9, false);
            gVar.i = 1;
            gVar.j = R.drawable.menu_random;
            gVar.g = M0;
            arrayList2.add(gVar);
        }
        yg.g gVar2 = new yg.g(10, false);
        x3 x3Var = this.S1;
        gVar2.q = x3Var;
        arrayList2.add(gVar2);
        int i10 = this.k2;
        HashSet hashSet = this.X1;
        if (i10 == 3) {
            ArrayList arrayList3 = this.c2;
            int size = arrayList3.size();
            i3 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.b2.get(str)) {
                    if (TextUtils.isEmpty(this.g2) || g1(tL_help_country, org.telegram.messenger.g0.O3(this.g2).toLowerCase())) {
                        i3 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        yg.g gVar3 = new yg.g(6, true);
                        gVar3.f = tL_help_country;
                        gVar3.k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(32.0f) + i3;
                    String upperCase = str.toUpperCase();
                    yg.g gVar4 = new yg.g(7, false);
                    gVar4.g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i3 = L;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i3 = 0;
        }
        ArrayList arrayList6 = this.Z1;
        int size2 = arrayList6.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList6.get(i12);
            i12++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i3 += org.telegram.messenger.g0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(m5.n(inputPeer)));
            yg.g gVar5 = new yg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new yg.g(5, false));
            i3 += org.telegram.messenger.g0.L(150.0f);
        }
        int i13 = 0;
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i3);
        yg.g gVar6 = new yg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.k2 != 3) {
            x3Var.a(bd.M0(2131743640, null), new s0(this, i13));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (!z11 || (hVar = this.h2) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.f();
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.l1;
            if (i3 >= tj0Var.getChildCount()) {
                l1(z10);
                return;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt instanceof bh.p) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.W1;
                    if (R < arrayList.size()) {
                        yg.g gVar = (yg.g) arrayList.get(R);
                        bh.p pVar = (bh.p) childAt;
                        pVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            pVar.i(z10, this.h2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            pVar.i(z10, 1.0f);
                        }
                    }
                }
                i3++;
            }
            if (childAt instanceof bh.c) {
                ((bh.c) childAt).c(this.X1.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i3++;
        }
    }

    public final void o1() {
        String H;
        int i3 = this.k2;
        x3 x3Var = this.S1;
        if (i3 == 1) {
            TLRPC.Chat chat = this.j2;
            H = bd.H(',', t3.V(chat) ? "Subscribers" : "Members", Math.max(0, this.h2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        } else if (i3 == 2) {
            H = bd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            x3Var.setLayerHeight(32);
        } else if (i3 != 3) {
            H = "";
        } else {
            H = bd.G((int) hp.s1(h10.t0).q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
            x3Var.setLayerHeight(1);
        }
        x3Var.setText(H);
    }
}
