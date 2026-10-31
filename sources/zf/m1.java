package zf;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.wd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m1 {
    public l1 a;
    public ArrayList k;
    public ArrayList l;
    public String n;
    public final boolean o;
    public ArrayList q;
    public HashMap r;
    public final ArrayList b = new ArrayList();
    public String c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f = new a0.h();
    public final ArrayList g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h i = new a0.h();
    public final ArrayList j = new ArrayList();
    public final int m = d20.s0;
    public boolean p = true;
    public boolean s = false;

    public m1(boolean z10) {
        this.o = z10;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
        boolean z10 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                start++;
            }
            String charSequence2 = charSequence.subSequence(start, end).toString();
            if (this.r == null) {
                this.r = new HashMap();
                this.q = new ArrayList();
            }
            k1 k1Var = (k1) this.r.get(charSequence2);
            if (k1Var == null) {
                k1Var = new k1();
                k1Var.a = charSequence2;
                this.r.put(charSequence2, k1Var);
            } else {
                this.q.remove(k1Var);
            }
            k1Var.b = (int) (System.currentTimeMillis() / 1000);
            this.q.add(0, k1Var);
            z10 = true;
        }
        if (z10) {
            hs.a0(this.m).a.c(new yh.o(7, this, this.q));
        }
    }

    public final void b() {
        this.e.clear();
        this.f.b();
        this.d.clear();
    }

    public final void c() {
        this.q = new ArrayList();
        this.r = new HashMap();
        hs.a0(this.m).a.c(new j1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        return this.b.size() > 0;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Chat chat;
        this.k = arrayList;
        this.l = arrayList2;
        a0.h hVar = this.f;
        if (hVar.m() != 0) {
            if (arrayList == null && arrayList2 == null) {
                return;
            }
            int i10 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i10 < size2) {
                Object obj = i10 < size ? arrayList.get(i10) : arrayList2.get(i10 - size);
                if (obj instanceof y) {
                    obj = ((y) obj).a;
                }
                if (obj instanceof dp0) {
                    obj = ((dp0) obj).b;
                }
                boolean z10 = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        hVar.l(user2.id);
                    }
                    long j10 = user.id;
                    a0.h hVar2 = this.h;
                    TLObject tLObject = (TLObject) hVar2.f(j10);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        hVar2.l(user.id);
                    }
                    long j11 = user.id;
                    a0.h hVar3 = this.i;
                    Object f7 = hVar3.f(j11);
                    if (f7 != null) {
                        this.j.remove(f7);
                        hVar3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    hVar.l(-chat.id);
                }
                i10++;
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b A[LOOP:2: B:56:0x0195->B:58:0x019b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j10, boolean z15, int i10, final int i11, final long j11, final Runnable runnable) {
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i13;
        int size;
        int i14;
        boolean z20;
        String str2;
        ArrayList arrayList = this.b;
        int size2 = arrayList.size();
        int i15 = 0;
        while (true) {
            i12 = this.m;
            if (i15 >= size2) {
                break;
            }
            Object obj = arrayList.get(i15);
            i15++;
            ConnectionsManager.getInstance(i12).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        a0.h hVar = this.f;
        ArrayList arrayList3 = this.e;
        a0.h hVar2 = this.h;
        ArrayList arrayList4 = this.g;
        a0.h hVar3 = this.i;
        ArrayList arrayList5 = this.j;
        if (str == null) {
            arrayList4.clear();
            hVar2.b();
            arrayList3.clear();
            hVar.b();
            arrayList2.clear();
            arrayList5.clear();
            hVar3.b();
            this.a.i(i11);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j10 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i10 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i10 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i10 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = vp.r1(i12).g1(j10);
                z17 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new wd(this, str, z17, 8)));
            } else {
                z17 = z13;
                this.n = str.toLowerCase();
            }
            z16 = true;
            z18 = false;
        } else {
            z16 = true;
            z17 = z13;
            arrayList4.clear();
            hVar2.b();
            z18 = true;
        }
        if (z10) {
            if (str.length() <= 0) {
                arrayList3.clear();
                hVar.b();
                arrayList2.clear();
                z19 = false;
                if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    hVar3.b();
                    String d = af.b.d(str, false);
                    ArrayList arrayList7 = i5.r(i12).e0;
                    size = arrayList7.size();
                    z20 = false;
                    for (i14 = 0; i14 < size; i14++) {
                        TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList7.get(i14)).user_id));
                        if (Z1 != null && (str2 = Z1.phone) != null && str2.startsWith(d)) {
                            if (!z20) {
                                z20 = Z1.phone.length() == d.length() ? z16 : false;
                            }
                            arrayList5.add(Z1);
                            hVar3.k(Z1, Z1.id);
                        }
                    }
                    if (!z20) {
                        arrayList5.add("section");
                        arrayList5.add(d);
                    }
                    z19 = false;
                }
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList8 = new ArrayList();
                i13 = 0;
                while (i13 < arrayList6.size()) {
                    TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i13)).first;
                    arrayList8.add(null);
                    final AtomicInteger atomicInteger2 = new AtomicInteger();
                    final AtomicInteger atomicInteger3 = atomicInteger;
                    final ArrayList arrayList9 = arrayList8;
                    final int i16 = i13;
                    final ArrayList arrayList10 = arrayList6;
                    atomicInteger2.set(ConnectionsManager.getInstance(i12).sendRequest(tLObject, new RequestDelegate() { // from class: zf.h1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final m1 m1Var = m1.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i17 = i16;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i18 = i11;
                            final Runnable runnable2 = runnable;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: zf.i1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i17, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    m1 m1Var2 = m1.this;
                                    ArrayList arrayList14 = m1Var2.b;
                                    if (arrayList14.contains(valueOf)) {
                                        arrayList14.remove(valueOf);
                                        int incrementAndGet = atomicInteger5.incrementAndGet();
                                        ArrayList arrayList15 = arrayList12;
                                        if (incrementAndGet == arrayList15.size()) {
                                            for (int i19 = 0; i19 < arrayList15.size(); i19++) {
                                                RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i19)).second;
                                                Pair pair2 = (Pair) arrayList13.get(i19);
                                                if (pair2 != null) {
                                                    requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                                }
                                            }
                                            m1Var2.i();
                                            ArrayList arrayList16 = m1Var2.k;
                                            if (arrayList16 != null) {
                                                m1Var2.f(arrayList16, m1Var2.l);
                                            }
                                            ArrayList arrayList17 = m1Var2.d;
                                            ArrayList arrayList18 = m1Var2.e;
                                            a0.h hVar4 = m1Var2.f;
                                            l1 l1Var = m1Var2.a;
                                            if (l1Var != null) {
                                                a0.h M = l1Var.M();
                                                if (M != null) {
                                                    int m10 = M.m();
                                                    for (int i20 = 0; i20 < m10; i20++) {
                                                        TLRPC.User user = (TLRPC.User) hVar4.f(M.j(i20));
                                                        if (user != null) {
                                                            arrayList18.remove(user);
                                                            arrayList17.remove(user);
                                                            hVar4.l(user.id);
                                                        }
                                                    }
                                                }
                                                a0.h x10 = m1Var2.a.x();
                                                if (x10 != null) {
                                                    int m11 = x10.m();
                                                    for (int i21 = 0; i21 < m11; i21++) {
                                                        TLRPC.User user2 = (TLRPC.User) hVar4.f(x10.j(i21));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            hVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                            }
                                            m1Var2.a.i(i18);
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }));
                    arrayList.add(Integer.valueOf(atomicInteger2.get()));
                    i13 = i16 + 1;
                    arrayList6 = arrayList10;
                    atomicInteger = atomicInteger3;
                    arrayList8 = arrayList9;
                }
                if (z19) {
                    return;
                }
                this.a.i(i11);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z21 = z17;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: zf.g1
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
                
                    if (r10.bot == false) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
                
                    if (r10.self == false) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
                
                    if (r10.contact != false) goto L67;
                 */
                @Override // org.telegram.tgnet.RequestDelegate
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    boolean z22;
                    boolean z23;
                    boolean z24;
                    boolean z25;
                    a0.h hVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z26;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    a0.h hVar6;
                    m1 m1Var = m1.this;
                    boolean z27 = m1Var.o;
                    int i17 = m1Var.m;
                    ArrayList arrayList12 = m1Var.d;
                    ArrayList arrayList13 = m1Var.e;
                    a0.h hVar7 = m1Var.f;
                    if (m1Var.a.Y(i11) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        hVar7.b();
                        arrayList12.clear();
                        vp.r1(i17).P3(tL_contacts_found2.chats, false);
                        vp.r1(i17).V3(tL_contacts_found2.users, false);
                        hs.a0(i17).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.h hVar8 = new a0.h();
                        a0.h hVar9 = new a0.h();
                        for (int i18 = 0; i18 < tL_contacts_found2.chats.size(); i18++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i18);
                            hVar8.k(chat3, chat3.id);
                        }
                        for (int i19 = 0; i19 < tL_contacts_found2.users.size(); i19++) {
                            TLRPC.User user3 = tL_contacts_found2.users.get(i19);
                            hVar9.k(user3, user3.id);
                        }
                        int i20 = 0;
                        while (true) {
                            z22 = z11;
                            z23 = z14;
                            z24 = z12;
                            z25 = z21;
                            if (i20 >= 2) {
                                break;
                            }
                            if (i20 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z27) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z26 = z27;
                                i20++;
                                hVar8 = hVar8;
                                z27 = z26;
                            }
                            z26 = z27;
                            int i21 = 0;
                            while (i21 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i21);
                                boolean z28 = z25;
                                int i22 = i21;
                                long j12 = peer.user_id;
                                if (j12 != 0) {
                                    user2 = (TLRPC.User) hVar9.f(j12);
                                    chat2 = null;
                                } else {
                                    long j13 = peer.chat_id;
                                    if (j13 != 0) {
                                        chat2 = (TLRPC.Chat) hVar8.f(j13);
                                    } else {
                                        long j14 = peer.channel_id;
                                        if (j14 != 0) {
                                            chat2 = (TLRPC.Chat) hVar8.f(j14);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 != null) {
                                    if (z22 && ((!z23 || w3.b(chat2)) && ((m1Var.p || !w3.r0(chat2)) && m1Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        hVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user2 != null) {
                                    if (!z23) {
                                        if (!z24) {
                                        }
                                        if (!z28) {
                                        }
                                        if (!m1Var.p) {
                                            if (i20 == 1) {
                                            }
                                        }
                                        if (m1Var.d(user2)) {
                                            arrayList13.add(user2);
                                            hVar6 = hVar8;
                                            hVar7.k(user2, user2.id);
                                            hVar8 = hVar6;
                                            i21 = i22 + 1;
                                            z25 = z28;
                                        }
                                    }
                                }
                                hVar6 = hVar8;
                                hVar8 = hVar6;
                                i21 = i22 + 1;
                                z25 = z28;
                            }
                            i20++;
                            hVar8 = hVar8;
                            z27 = z26;
                        }
                        a0.h hVar10 = hVar8;
                        if (!z27) {
                            int i23 = 0;
                            while (i23 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i23);
                                long j15 = peer2.user_id;
                                if (j15 != 0) {
                                    hVar4 = hVar10;
                                    user = (TLRPC.User) hVar9.f(j15);
                                    chat = null;
                                } else {
                                    long j16 = peer2.chat_id;
                                    if (j16 != 0) {
                                        hVar4 = hVar10;
                                        chat = (TLRPC.Chat) hVar4.f(j16);
                                    } else {
                                        hVar4 = hVar10;
                                        long j17 = peer2.channel_id;
                                        if (j17 != 0) {
                                            chat = (TLRPC.Chat) hVar4.f(j17);
                                        } else {
                                            chat = null;
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j18 = j11;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if (user != null && !z23 && ((z24 || !user.bot) && ((z25 || !user.self) && user.id != j18 && m1Var.d(user)))) {
                                        arrayList12.add(user);
                                        hVar7.k(user, user.id);
                                    }
                                } else if (!z22 || (z23 && !w3.b(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if ((-chat.id) != j18 && m1Var.d(chat)) {
                                        arrayList12.add(chat);
                                        hVar7.k(chat, -chat.id);
                                    }
                                }
                                i23++;
                                tL_contacts_found2 = tL_contacts_found;
                                hVar9 = hVar5;
                                hVar10 = hVar4;
                            }
                        }
                        m1Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z19 = z18;
        if (!z14) {
            arrayList5.clear();
            hVar3.b();
            String d10 = af.b.d(str, false);
            ArrayList arrayList72 = i5.r(i12).e0;
            size = arrayList72.size();
            z20 = false;
            while (i14 < size) {
            }
            if (!z20) {
            }
            z19 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i13 = 0;
        while (i13 < arrayList6.size()) {
        }
        if (z19) {
        }
    }

    public final void i() {
        a0.h hVar = this.f;
        if (hVar.m() == 0) {
            return;
        }
        a0.h hVar2 = this.h;
        int m10 = hVar2.m();
        for (int i10 = 0; i10 < m10; i10++) {
            TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
            if (user != null) {
                this.e.remove(user);
                this.d.remove(user);
                hVar.l(user.id);
            }
        }
    }
}
