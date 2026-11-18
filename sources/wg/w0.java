package wg;

import ai.e1;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.p2;
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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.e31;
import tg.z1;
import ug.j1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w0 extends sa {
    public final hi.d T1;
    public final v0 U1;
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
    public final c6 i2;
    public String j2;
    public xg.h k2;
    public int l2;
    public final TLRPC.Chat m2;
    public int n2;
    public i o2;
    public int p2;
    public k q2;
    public final s4.s0 r2;

    public w0(h2 h2Var, long j3) {
        super(h2Var, false);
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
        this.m2 = mp.u1(this.a).O0(Long.valueOf(-j3));
        ((ViewGroup) this.p1.getParent()).removeView(this.p1);
        ViewGroup viewGroup = this.b;
        lr lrVar = lr.h;
        this.i2 = new c6(viewGroup, 0L, 350L, lrVar);
        ah.e eVar = new ah.e(getContext(), this.J0);
        this.W1 = eVar;
        eVar.setOnCloseClickListener(new r0(this, 7));
        eVar.setText(P0());
        eVar.setCloseImageVisible(true);
        eVar.f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.J0);
        this.U1 = v0Var;
        int i7 = n6.h5;
        u6.h(i7, v0Var, this.J0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.V1 = new x3(getContext(), this.J0);
        p1();
        ViewGroup viewGroup2 = this.b;
        int i10 = this.u0;
        viewGroup2.addView(eVar, ma.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.b;
        int i11 = this.u0;
        viewGroup3.addView(v0Var, ma.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (ck0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        u6.h(i7, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.T1 = dVar;
        dVar.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar, ma.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i12 = this.u0;
        viewGroup4.addView(aVar, ma.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.h hVar = this.k2;
        ck0 ck0Var = this.o1;
        hVar.n = arrayList;
        hVar.f = ck0Var;
        int i13 = this.u0;
        ck0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.o1.j(new j1(this, 2));
        this.o1.setOnItemClickListener(new z1(this, 13));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(lrVar);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new ai.i0(this, 9));
        o1(false, true);
        g1(1, null, true);
        g1(3, null, true);
    }

    public static /* synthetic */ void e1(w0 w0Var, boolean z10, Pair pair) {
        HashMap hashMap = w0Var.e2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            w0Var.f2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new vh.c(w0Var, 1));
        }
        if (w0Var.n2 == 3) {
            w0Var.o1(true, true);
            w0Var.k1(true);
        }
    }

    public static boolean h1(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!e2.s(tL_help_country)) {
            return false;
        }
        String lowerCase = org.telegram.messenger.g0.M3(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || i5.c.B(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = org.telegram.messenger.g0.M3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || i5.c.B(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.r2);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, true);
        this.k2 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        int i7 = this.n2;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.M0(2131753286, null) : gd.M0(2131753601, null) : gd.M0(2131749508, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void S0(Canvas canvas, int i7) {
        this.p2 = i7;
        float f10 = org.telegram.messenger.g0.m;
        ah.e eVar = this.W1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.U1.setTranslationY(translationY);
        this.o1.setTranslationY((r2.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = n6.w0(n6.h5, this.J0);
        Paint paint = this.X1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        boolean z10 = max < org.telegram.messenger.g0.m;
        c6 c6Var = this.i2;
        int W1 = org.telegram.messenger.g0.W1(c6Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.u0, W1, this.b.getWidth() - this.u0, org.telegram.messenger.g0.L(14.0f) + this.b.getHeight());
        float L = (1.0f - c6Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void c0(Configuration configuration) {
        n1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        i iVar = this.o2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void f1() {
        if (TextUtils.isEmpty(this.j2)) {
            return;
        }
        this.j2 = null;
        this.U1.setText("");
        org.telegram.messenger.g0.r(this.r2);
        ArrayList arrayList = this.c2;
        arrayList.clear();
        arrayList.addAll(s.e(this.m2.id));
        o1(false, false);
        o1(true, true);
    }

    public final void g1(int i7, String str, boolean z10) {
        TLRPC.Chat chat = this.m2;
        if (i7 == 1) {
            long j3 = chat.id;
            u0 u0Var = new u0(this, z10, 0);
            mp u12 = mp.u1(j10.t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.t0);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = u12.j1(j3);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new e31(10, u12, u0Var));
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            u0 u0Var2 = new u0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(j10.t0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = gd.E0().B != null ? gd.E0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new e1(u0Var2, 26));
            return;
        }
        long j10 = chat.id;
        t0 t0Var = new t0(this, 1);
        mp u13 = mp.u1(j10.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(j10.t0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new p2(u13, j10, t0Var, 7));
    }

    public final void i1(int i7, List list) {
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
            arrayList.addAll(s.e(this.m2.id));
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
        v0 v0Var = this.U1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.g2);
        p1();
        o1(false, true);
        this.W1.setText(P0());
        m1(false);
        k1(false);
    }

    public final void j1(boolean z10) {
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
                    kVar.c.m1.A(0);
                    a0 a0Var = kVar.a;
                    ArrayList arrayList2 = a0Var.Z1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i10 = yg.d.w;
                        a0Var.e2 = 0;
                    } else {
                        int i11 = yg.d.w;
                        a0Var.e2 = 1;
                    }
                    a0Var.j2 = 0;
                    a0Var.l1(false, true);
                    a0Var.k1(true);
                    a0Var.c1();
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
                    lVar.m1.A(0);
                    a0 a0Var2 = kVar2.a;
                    boolean z11 = !lVar.d;
                    ArrayList arrayList4 = a0Var2.Y1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    a0Var2.l1(z11, true);
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
                kVar3.c.m1.A(0);
                a0 a0Var3 = kVar3.a;
                ArrayList arrayList7 = a0Var3.a2;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                a0Var3.l1(false, true);
            }
        }
    }

    public final void k1(boolean z10) {
        ck0 ck0Var = this.o1;
        if (!z10) {
            ck0Var.v0(0);
            return;
        }
        pi.l lVar = new pi.l(getContext(), 2, 0.6f);
        lVar.a = 1;
        lVar.p = org.telegram.messenger.g0.L(38.0f);
        ck0Var.getLayoutManager().w0(lVar);
    }

    public final void l1() {
        int i7 = this.n2;
        String G = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.G((int) mp.u1(j10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : gd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : gd.M0(2131753270, null);
        k kVar = this.q2;
        if (kVar != null) {
            new lc(kVar.c.c, kVar.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void m1(boolean z10) {
        hi.d dVar = this.T1;
        dVar.setShowZero(false);
        int i7 = this.n2;
        dVar.i(i7 != 1 ? (i7 == 2 || i7 == 3) ? gd.M0(2131745751, null) : "" : gd.M0(2131753287, null), z10, true);
        HashSet hashSet = this.a2;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void n1(boolean z10, boolean z11) {
        int i7;
        xg.h hVar;
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.n2 == 1) {
            String M0 = gd.M0(2131749377, null);
            xg.g gVar = new xg.g(9, false);
            gVar.h = 1;
            gVar.i = R.drawable.menu_random;
            gVar.f = M0;
            arrayList2.add(gVar);
        }
        xg.g gVar2 = new xg.g(10, false);
        x3 x3Var = this.V1;
        gVar2.p = x3Var;
        arrayList2.add(gVar2);
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
                    if (TextUtils.isEmpty(this.j2) || h1(tL_help_country, org.telegram.messenger.g0.M3(this.j2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.g gVar3 = new xg.g(6, true);
                        gVar3.e = tL_help_country;
                        gVar3.j = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(32.0f) + i7;
                    String upperCase = str.toUpperCase();
                    xg.g gVar4 = new xg.g(7, false);
                    gVar4.f = upperCase;
                    arrayList2.add(gVar4);
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
            boolean contains2 = hashSet.contains(Long.valueOf(n5.n(inputPeer)));
            xg.g gVar5 = new xg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.j = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int i13 = 0;
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i7);
        xg.g gVar6 = new xg.g(-1, false);
        gVar6.k = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.n2 != 3) {
            x3Var.a(gd.M0(2131743393, null), new s0(this, i13));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (!z11 || (hVar = this.k2) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.f();
        }
    }

    public final void o1(boolean z10, boolean z11) {
        n1(z10, z11);
        int i7 = 0;
        while (true) {
            ck0 ck0Var = this.o1;
            if (i7 >= ck0Var.getChildCount()) {
                m1(z10);
                return;
            }
            View childAt = ck0Var.getChildAt(i7);
            if (childAt instanceof ah.r) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.Z1;
                    if (R < arrayList.size()) {
                        xg.g gVar = (xg.g) arrayList.get(R);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(gVar.j, z10);
                        rVar.i(z10, 1.0f);
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

    public final void p1() {
        String H;
        int i7 = this.n2;
        x3 x3Var = this.V1;
        if (i7 == 1) {
            TLRPC.Chat chat = this.m2;
            H = gd.H(',', v3.V(chat) ? "Subscribers" : "Members", Math.max(0, this.k2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        } else if (i7 == 2) {
            H = gd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            x3Var.setLayerHeight(32);
        } else if (i7 != 3) {
            H = "";
        } else {
            H = gd.G((int) mp.u1(j10.t0).q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
            x3Var.setLayerHeight(1);
        }
        x3Var.setText(H);
    }
}
