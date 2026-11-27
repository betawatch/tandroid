// default package

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t2a extends ny0 {
    public final c51 S1;
    public final s2a T1;
    public final p55 U1;
    public final w2a V1;
    public final Paint W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final HashSet a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final HashMap d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final LinkedHashMap g2;
    public final mm h2;
    public String i2;
    public n2a j2;
    public int k2;
    public final TLRPC.Chat l2;
    public byte m2;
    public zm0 n2;
    public int o2;
    public cn0 p2;
    public final li7 q2;

    public t2a(e eVar, long j) {
        super(eVar, false);
        this.W1 = new Paint(1);
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        this.Z1 = new HashSet();
        this.a2 = new HashSet();
        this.b2 = new ArrayList();
        this.c2 = new ArrayList();
        this.d2 = new HashMap();
        this.e2 = new ArrayList();
        this.f2 = new ArrayList();
        this.g2 = new LinkedHashMap();
        this.k2 = hl.L(134.0f);
        byte b = 25;
        this.q2 = new li7(this, b);
        this.u0 = 0;
        this.l2 = uc7.s1(this.a).M0(Long.valueOf(-j));
        ((ViewGroup) this.o1.getParent()).removeView(this.o1);
        ViewGroup viewGroup = this.b;
        k43 k43Var = k43.h;
        this.h2 = new mm(viewGroup, 0L, 350L, k43Var);
        w2a w2aVar = new w2a(getContext(), this.J0);
        this.V1 = w2aVar;
        w2aVar.setOnCloseClickListener(new o2a(this, (byte) 7));
        w2aVar.setText(K0());
        w2aVar.setCloseImageVisible(true);
        w2aVar.f.c(false, 0.0f);
        s2a s2aVar = new s2a(this, getContext(), this.J0);
        this.T1 = s2aVar;
        int i = aob.h5;
        yob.h(i, this.J0, s2aVar);
        s2aVar.setOnSearchTextChange(new q2a(this, (byte) 0));
        this.U1 = new p55(getContext(), this.J0);
        k1();
        ViewGroup viewGroup2 = this.b;
        int i2 = this.u0;
        viewGroup2.addView(w2aVar, tre.f(-2.0f, -1, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.b;
        int i3 = this.u0;
        viewGroup3.addView(s2aVar, tre.f(-2.0f, -1, 55, i3, 0, i3, 0));
        dr0 dr0Var = new dr0(getContext(), this.J0, (d79) null);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i, this.J0, dr0Var);
        c51 c51Var = new c51(this.J0, getContext(), true);
        this.S1 = c51Var;
        c51Var.setOnClickListener(new p2a(this, (byte) 1));
        dr0Var.addView(c51Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i4 = this.u0;
        viewGroup4.addView(dr0Var, tre.f(-2.0f, -1, 87, i4, 0, i4, 0));
        n2a n2aVar = this.j2;
        d79 d79Var = this.n1;
        n2aVar.n = arrayList;
        n2aVar.f = d79Var;
        int i5 = this.u0;
        d79Var.setPadding(i5, 0, i5, hl.L(60.0f));
        this.n1.j(new e98(this, (byte) 18));
        this.n1.setOnItemClickListener(new ye9(this, b));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43Var);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new lr(this, (byte) 9));
        j1(false, true);
        b1(1, null, true);
        b1(3, null, true);
    }

    public static boolean c1(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!ik8.A(tL_help_country)) {
            return false;
        }
        String lowerCase = hl.I3(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || uh9.t(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = hl.I3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || uh9.t(" ", str, lowerCase2);
    }

    @Override // nx0
    public final void H() {
        super.H();
        hl.r(this.q2);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        n2a n2aVar = new n2a(this.J0, getContext(), true);
        this.j2 = n2aVar;
        return n2aVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        byte b = this.m2;
        return b != 1 ? b != 2 ? b != 3 ? "" : ob6.M0(2131753281, null) : ob6.M0(2131753596, null) : ob6.M0(2131749469, null);
    }

    @Override // ny0
    public final void N0(Canvas canvas, int i) {
        this.o2 = i;
        float f = hl.m;
        w2a w2aVar = this.V1;
        w2aVar.setTranslationY(Math.max(i, (((w2aVar.getMeasuredHeight() - hl.m) - hl.L(40.0f)) / 2.0f) + f));
        float translationY = w2aVar.getTranslationY() + w2aVar.getMeasuredHeight();
        this.T1.setTranslationY(translationY);
        this.n1.setTranslationY((r2.getMeasuredHeight() + w2aVar.getMeasuredHeight()) - hl.L(16.0f));
        int v0 = aob.v0(aob.h5, this.J0);
        Paint paint = this.W1;
        paint.setColor(v0);
        int max = Math.max(0, i);
        boolean z = max < hl.m;
        mm mmVar = this.h2;
        int U1 = hl.U1(mmVar.d(z), max, 0);
        RectF rectF = hl.P;
        rectF.set(this.u0, U1, this.b.getWidth() - this.u0, hl.L(14.0f) + this.b.getHeight());
        float L = (1.0f - mmVar.c) * hl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // nx0
    public final void Z(Configuration configuration) {
        i1(false, true);
    }

    public final void Z0() {
        if (TextUtils.isEmpty(this.i2)) {
            return;
        }
        this.i2 = null;
        this.T1.setText("");
        hl.r(this.q2);
        ArrayList arrayList = this.b2;
        arrayList.clear();
        arrayList.addAll(on0.f(this.l2.id));
        j1(false, false);
        j1(true, true);
    }

    public final /* synthetic */ void a1(boolean z, Pair pair) {
        if (z) {
            Map map = (Map) pair.first;
            HashMap hashMap = this.d2;
            hashMap.putAll(map);
            this.e2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new ny2(this, (byte) 1));
        }
        if (this.m2 == 3) {
            j1(true, true);
            f1(true);
        }
    }

    public final void b1(int i, String str, boolean z) {
        byte b = 2;
        TLRPC.Chat chat = this.l2;
        byte b2 = 1;
        if (i == 1) {
            long j = chat.id;
            r2a r2aVar = new r2a(this, z, (byte) 0);
            uc7 s1 = uc7.s1(yac.t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = s1.h1(j);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new ql(s1, r2aVar, b));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            r2a r2aVar2 = new r2a(this, z, (byte) 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(yac.t0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = ob6.D0().B != null ? ob6.D0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ye(r2aVar2, (byte) 4));
            return;
        }
        long j2 = chat.id;
        q2a q2aVar = new q2a(this, b2);
        uc7 s12 = uc7.s1(yac.t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(yac.t0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new p87((Object) s12, j2, (Object) q2aVar, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(int i, ArrayList arrayList) {
        this.m2 = i;
        this.i2 = null;
        HashSet hashSet = this.a2;
        hashSet.clear();
        HashSet hashSet2 = this.Z1;
        hashSet2.clear();
        ArrayList arrayList2 = this.b2;
        arrayList2.clear();
        LinkedHashMap linkedHashMap = this.g2;
        linkedHashMap.clear();
        if (i == 1) {
            arrayList2.addAll(this.c2);
        } else if (i == 2) {
            arrayList2.addAll(on0.f(this.l2.id));
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TLObject tLObject = (TLObject) obj;
                long j = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j));
                linkedHashMap.put(Long.valueOf(j), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        s2a s2aVar = this.T1;
        s2aVar.setText("");
        s2aVar.d.b(false);
        s2aVar.b(false, hashSet2, new o2a(this, (byte) 5), this.f2);
        k1();
        j1(false, true);
        this.V1.setText(K0());
        h1(false);
        f1(false);
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        zm0 zm0Var = this.n2;
        if (zm0Var != null) {
            zm0Var.run();
        }
    }

    public final void e1(boolean z) {
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0 || z) {
            byte b = this.m2;
            LinkedHashMap linkedHashMap = this.g2;
            if (b == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                cn0 cn0Var = this.p2;
                if (cn0Var != null) {
                    cn0Var.c.l1.F(0);
                    ao0 ao0Var = cn0Var.a;
                    ArrayList arrayList2 = ao0Var.Y1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i = pn0.w;
                        ao0Var.d2 = 0;
                    } else {
                        int i2 = pn0.w;
                        ao0Var.d2 = 1;
                    }
                    ao0Var.i2 = 0;
                    ao0Var.g1(false, true);
                    ao0Var.f1(true);
                    ao0Var.X0();
                    return;
                }
                return;
            }
            if (b == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                cn0 cn0Var2 = this.p2;
                if (cn0Var2 != null) {
                    dn0 dn0Var = cn0Var2.c;
                    dn0Var.l1.F(0);
                    ao0 ao0Var2 = cn0Var2.a;
                    boolean z2 = !dn0Var.d;
                    ArrayList arrayList4 = ao0Var2.X1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    ao0Var2.g1(z2, true);
                    return;
                }
                return;
            }
            if (b == 3) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = this.f2;
                int size = arrayList6.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList6.get(i3);
                    i3++;
                    TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                    if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                        arrayList5.add(tL_help_country);
                    }
                }
                cn0 cn0Var3 = this.p2;
                if (cn0Var3 != null) {
                    cn0Var3.c.l1.F(0);
                    ao0 ao0Var3 = cn0Var3.a;
                    ArrayList arrayList7 = ao0Var3.Z1;
                    arrayList7.clear();
                    arrayList7.addAll(arrayList5);
                    ao0Var3.g1(false, true);
                }
            }
        }
    }

    public final void f1(boolean z) {
        d79 d79Var = this.n1;
        if (!z) {
            d79Var.x0(0);
            return;
        }
        z46 z46Var = new z46(getContext(), 2, 0.6f);
        z46Var.a = 1;
        z46Var.p = hl.L(38.0f);
        d79Var.getLayoutManager().v0(z46Var);
    }

    public final void g1() {
        byte b = this.m2;
        String G = b != 1 ? b != 2 ? b != 3 ? "" : ob6.G((int) on0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : ob6.G((int) on0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : ob6.M0(2131753265, null);
        cn0 cn0Var = this.p2;
        if (cn0Var != null) {
            new d31(cn0Var.c.c, cn0Var.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void h1(boolean z) {
        c51 c51Var = this.S1;
        c51Var.setShowZero(false);
        byte b = this.m2;
        c51Var.i(b != 1 ? (b == 2 || b == 3) ? ob6.M0(2131745674, null) : "" : ob6.M0(2131753282, null), z, true);
        HashSet hashSet = this.Z1;
        c51Var.c(hashSet.size(), z);
        c51Var.setEnabled(hashSet.size() > 0);
    }

    public final void i1(boolean z, boolean z2) {
        int i;
        n2a n2aVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.m2 == 1) {
            String M0 = ob6.M0(2131749323, null);
            m2a m2aVar = new m2a(9, false);
            m2aVar.h = (byte) 1;
            m2aVar.i = R.drawable.menu_random;
            m2aVar.f = M0;
            arrayList2.add(m2aVar);
        }
        m2a m2aVar2 = new m2a(10, false);
        p55 p55Var = this.U1;
        m2aVar2.p = p55Var;
        arrayList2.add(m2aVar2);
        byte b = this.m2;
        HashSet hashSet = this.Z1;
        if (b == 3) {
            ArrayList arrayList3 = this.e2;
            int size = arrayList3.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.d2.get(str)) {
                    if (TextUtils.isEmpty(this.i2) || c1(tL_help_country, hl.I3(this.i2).toLowerCase())) {
                        i += hl.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        m2a m2aVar3 = new m2a(6, true);
                        m2aVar3.e = tL_help_country;
                        m2aVar3.j = contains;
                        arrayList4.add(m2aVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int L = hl.L(32.0f) + i;
                    String upperCase = str.toUpperCase();
                    m2a m2aVar4 = new m2a(7, false);
                    m2aVar4.f = upperCase;
                    arrayList2.add(m2aVar4);
                    arrayList2.addAll(arrayList4);
                    i = L;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i = 0;
        }
        ArrayList arrayList6 = this.b2;
        int size2 = arrayList6.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList6.get(i3);
            i3++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i += hl.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(wf3.m(inputPeer)));
            m2a m2aVar5 = new m2a(3, true);
            m2aVar5.d = inputPeer;
            m2aVar5.c = null;
            m2aVar5.j = contains2;
            arrayList2.add(m2aVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new m2a(5, false));
            i += hl.L(150.0f);
        }
        byte b2 = 0;
        int max = Math.max(0, ((int) (hl.q.y * 0.6f)) - i);
        m2a m2aVar6 = new m2a(-1, false);
        m2aVar6.k = max;
        arrayList2.add(m2aVar6);
        if (hashSet.size() > 0 && this.m2 != 3) {
            p55Var.a(ob6.M0(2131743285, null), new p2a(this, b2));
        } else if (z) {
            p55Var.setRightText(null);
        } else {
            si siVar = p55Var.b;
            siVar.c(null, false, true);
            siVar.setOnClickListener(null);
            siVar.setVisibility(0);
        }
        if (!z2 || (n2aVar = this.j2) == null) {
            return;
        }
        if (z) {
            n2aVar.E(arrayList, arrayList2);
        } else {
            n2aVar.f();
        }
    }

    public final void j1(boolean z, boolean z2) {
        i1(z, z2);
        int i = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                h1(z);
                return;
            }
            View childAt = d79Var.getChildAt(i);
            if (childAt instanceof e3a) {
                int S = RecyclerView.S(childAt) - 1;
                if (S >= 0) {
                    ArrayList arrayList = this.Y1;
                    if (S < arrayList.size()) {
                        m2a m2aVar = (m2a) arrayList.get(S);
                        e3a e3aVar = (e3a) childAt;
                        e3aVar.c(m2aVar.j, z);
                        e3aVar.i(z, 1.0f);
                    }
                }
                i++;
            }
            if (childAt instanceof v2a) {
                ((v2a) childAt).c(this.Z1.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i++;
        }
    }

    public final void k1() {
        String H;
        byte b = this.m2;
        p55 p55Var = this.U1;
        if (b == 1) {
            TLRPC.Chat chat = this.l2;
            H = ob6.H(',', xc2.V(chat) ? "Subscribers" : "Members", Math.max(0, this.j2.F(chat) - 1));
            p55Var.setLayerHeight(32);
        } else if (b == 2) {
            H = ob6.G((int) on0.g(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            p55Var.setLayerHeight(32);
        } else if (b != 3) {
            H = "";
        } else {
            H = ob6.G((int) on0.i(), "BoostingSelectUpToCountriesPlural", new Object[0]);
            p55Var.setLayerHeight(1);
        }
        p55Var.setText(H);
    }
}
