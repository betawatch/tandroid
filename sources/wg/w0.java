package wg;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.h3;
import c8.ha;
import fi.o1;
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
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.n41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w0 extends na {
    public final fi.d P1;
    public final v0 Q1;
    public final x3 R1;
    public final ah.e S1;
    public final Paint T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final HashSet W1;
    public final HashSet X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashMap a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final LinkedHashMap d2;
    public final w5 e2;
    public String f2;
    public xg.i g2;
    public int h2;
    public final TLRPC.Chat i2;
    public int j2;
    public i k2;
    public int l2;
    public k m2;
    public final tg.y n2;

    public w0(f2 f2Var, long j3) {
        super(f2Var, false);
        this.T1 = new Paint(1);
        this.U1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        this.W1 = new HashSet();
        this.X1 = new HashSet();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new HashMap();
        this.b2 = new ArrayList();
        this.c2 = new ArrayList();
        this.d2 = new LinkedHashMap();
        this.h2 = org.telegram.messenger.g0.L(134.0f);
        this.n2 = new tg.y(this, 5);
        this.t0 = 0;
        this.i2 = qp.s1(this.a).M0(Long.valueOf(-j3));
        ((ViewGroup) this.l1.getParent()).removeView(this.l1);
        ViewGroup viewGroup = this.b;
        xq xqVar = xq.h;
        this.e2 = new w5(viewGroup, 0L, 350L, xqVar);
        ah.e eVar = new ah.e(getContext(), this.I0);
        this.S1 = eVar;
        eVar.setOnCloseClickListener(new r0(this, 7));
        eVar.setText(O0());
        eVar.setCloseImageVisible(true);
        eVar.f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.I0);
        this.Q1 = v0Var;
        int i7 = k6.h5;
        r6.i(i7, v0Var, this.I0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.R1 = new x3(getContext(), this.I0);
        o1();
        ViewGroup viewGroup2 = this.b;
        int i10 = this.t0;
        viewGroup2.addView(eVar, ha.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.b;
        int i11 = this.t0;
        viewGroup3.addView(v0Var, ha.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.I0, (pj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i7, aVar, this.I0);
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.P1 = dVar;
        dVar.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar, ha.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i12 = this.t0;
        viewGroup4.addView(aVar, ha.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.i iVar = this.g2;
        pj0 pj0Var = this.k1;
        iVar.n = arrayList;
        iVar.f = pj0Var;
        int i13 = this.t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.k1.j(new ui(this, 28));
        this.k1.setOnItemClickListener(new u5.e(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.m = false;
        this.k1.setItemAnimator(kVar);
        this.k1.i(new o1(this, 8));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static /* synthetic */ void d1(w0 w0Var, boolean z9, Pair pair) {
        HashMap hashMap = w0Var.a2;
        if (z9) {
            hashMap.putAll((Map) pair.first);
            w0Var.b2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new vh.c(w0Var, 1));
        }
        if (w0Var.j2 == 3) {
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
        if (lowerCase.startsWith(str) || jg.g.A(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = org.telegram.messenger.g0.O3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || jg.g.A(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        org.telegram.messenger.g0.r(this.n2);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, true);
        this.g2 = iVar;
        return iVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        int i7 = this.j2;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131753288, null) : hd.M0(2131753603, null) : hd.M0(2131749679, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void R0(Canvas canvas, int i7) {
        this.l2 = i7;
        float f10 = org.telegram.messenger.g0.m;
        ah.e eVar = this.S1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + f10));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.Q1.setTranslationY(translationY);
        this.k1.setTranslationY((r2.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = k6.w0(k6.h5, this.I0);
        Paint paint = this.T1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        boolean z9 = max < org.telegram.messenger.g0.m;
        w5 w5Var = this.e2;
        int W1 = org.telegram.messenger.g0.W1(w5Var.d(z9), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.t0, W1, this.b.getWidth() - this.t0, org.telegram.messenger.g0.L(14.0f) + this.b.getHeight());
        float L = (1.0f - w5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        i iVar = this.k2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void e1() {
        if (TextUtils.isEmpty(this.f2)) {
            return;
        }
        this.f2 = null;
        this.Q1.setText("");
        org.telegram.messenger.g0.r(this.n2);
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        arrayList.addAll(s.e(this.i2.id));
        n1(false, false);
        n1(true, true);
    }

    public final void f1(int i7, String str, boolean z9) {
        TLRPC.Chat chat = this.i2;
        if (i7 == 1) {
            long j3 = chat.id;
            u0 u0Var = new u0(this, z9, 0);
            qp s12 = qp.s1(p10.s0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.s0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new n41(8, s12, u0Var));
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            u0 u0Var2 = new u0(this, z9, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(p10.s0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = hd.E0().B != null ? hd.E0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new bi.j0(u0Var2, 23));
            return;
        }
        long j10 = chat.id;
        t0 t0Var = new t0(this, 1);
        qp s13 = qp.s1(p10.s0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(p10.s0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new h3(s13, j10, t0Var, 7));
    }

    public final void h1(int i7, List list) {
        this.j2 = i7;
        this.f2 = null;
        HashSet hashSet = this.X1;
        hashSet.clear();
        HashSet hashSet2 = this.W1;
        hashSet2.clear();
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.d2;
        linkedHashMap.clear();
        if (i7 == 1) {
            arrayList.addAll(this.Z1);
        } else if (i7 == 2) {
            arrayList.addAll(s.e(this.i2.id));
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
        v0 v0Var = this.Q1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.c2);
        o1();
        n1(false, true);
        this.S1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z9) {
        HashSet hashSet = this.W1;
        if (hashSet.size() != 0 || z9) {
            int i7 = this.j2;
            LinkedHashMap linkedHashMap = this.d2;
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
                k kVar = this.m2;
                if (kVar != null) {
                    kVar.c.i1.E(0);
                    a0 a0Var = kVar.a;
                    ArrayList arrayList2 = a0Var.V1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i10 = yg.d.w;
                        a0Var.a2 = 0;
                    } else {
                        int i11 = yg.d.w;
                        a0Var.a2 = 1;
                    }
                    a0Var.f2 = 0;
                    a0Var.k1(false, true);
                    a0Var.j1(true);
                    a0Var.b1();
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
                k kVar2 = this.m2;
                if (kVar2 != null) {
                    l lVar = kVar2.c;
                    lVar.i1.E(0);
                    a0 a0Var2 = kVar2.a;
                    boolean z10 = !lVar.d;
                    ArrayList arrayList4 = a0Var2.U1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    a0Var2.k1(z10, true);
                    return;
                }
                return;
            }
            if (i7 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.c2;
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
            k kVar3 = this.m2;
            if (kVar3 != null) {
                kVar3.c.i1.E(0);
                a0 a0Var3 = kVar3.a;
                ArrayList arrayList7 = a0Var3.W1;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                a0Var3.k1(false, true);
            }
        }
    }

    public final void j1(boolean z9) {
        pj0 pj0Var = this.k1;
        if (!z9) {
            pj0Var.v0(0);
            return;
        }
        mi.m mVar = new mi.m(getContext(), 2, 0.6f);
        mVar.a = 1;
        mVar.p = org.telegram.messenger.g0.L(38.0f);
        pj0Var.getLayoutManager().w0(mVar);
    }

    public final void k1() {
        int i7 = this.j2;
        String G = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.G((int) qp.s1(p10.s0).p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : hd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : hd.M0(2131753272, null);
        k kVar = this.m2;
        if (kVar != null) {
            new hc(kVar.c.c, kVar.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void l1(boolean z9) {
        fi.d dVar = this.P1;
        dVar.setShowZero(false);
        int i7 = this.j2;
        dVar.i(i7 != 1 ? (i7 == 2 || i7 == 3) ? hd.M0(2131745947, null) : "" : hd.M0(2131753289, null), z9, true);
        HashSet hashSet = this.W1;
        dVar.c(hashSet.size(), z9);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void m1(boolean z9, boolean z10) {
        int i7;
        xg.i iVar;
        ArrayList arrayList = this.U1;
        arrayList.clear();
        ArrayList arrayList2 = this.V1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.j2 == 1) {
            String M0 = hd.M0(2131749551, null);
            xg.h hVar = new xg.h(9, false);
            hVar.i = 1;
            hVar.j = R.drawable.menu_random;
            hVar.g = M0;
            arrayList2.add(hVar);
        }
        xg.h hVar2 = new xg.h(10, false);
        x3 x3Var = this.R1;
        hVar2.q = x3Var;
        arrayList2.add(hVar2);
        int i10 = this.j2;
        HashSet hashSet = this.W1;
        if (i10 == 3) {
            ArrayList arrayList3 = this.b2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.a2.get(str)) {
                    if (TextUtils.isEmpty(this.f2) || g1(tL_help_country, org.telegram.messenger.g0.O3(this.f2).toLowerCase())) {
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
        ArrayList arrayList6 = this.Y1;
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
        if (hashSet.size() > 0 && this.j2 != 3) {
            x3Var.a(hd.M0(2131743631, null), new s0(this, i13));
        } else if (z9) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (!z10 || (iVar = this.g2) == null) {
            return;
        }
        if (z9) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    public final void n1(boolean z9, boolean z10) {
        m1(z9, z10);
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.k1;
            if (i7 >= pj0Var.getChildCount()) {
                l1(z9);
                return;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (childAt instanceof ah.r) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.V1;
                    if (R < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(R);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.k, z9);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            rVar.i(z9, this.g2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            rVar.i(z9, 1.0f);
                        }
                    }
                }
                i7++;
            }
            if (childAt instanceof ah.c) {
                ((ah.c) childAt).c(this.W1.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i7++;
        }
    }

    public final void o1() {
        String H;
        int i7 = this.j2;
        x3 x3Var = this.R1;
        if (i7 == 1) {
            TLRPC.Chat chat = this.i2;
            H = hd.H(',', t3.V(chat) ? "Subscribers" : "Members", Math.max(0, this.g2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        } else if (i7 == 2) {
            H = hd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            x3Var.setLayerHeight(32);
        } else if (i7 != 3) {
            H = "";
        } else {
            H = hd.G((int) qp.s1(p10.s0).p0, "BoostingSelectUpToCountriesPlural", new Object[0]);
            x3Var.setLayerHeight(1);
        }
        x3Var.setText(H);
    }
}
