// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class sv9 {
    public rv9 a;
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
    public final zh6 f = new zh6();
    public final ArrayList g = new ArrayList();
    public final zh6 h = new zh6();
    public final zh6 i = new zh6();
    public final ArrayList j = new ArrayList();
    public final int m = yac.t0;
    public boolean p = true;
    public boolean s = false;

    public sv9(boolean z) {
        this.o = z;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z = false;
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
                qv9 qv9Var = (qv9) this.r.get(charSequence2);
                if (qv9Var == null) {
                    qv9Var = new qv9();
                    qv9Var.a = charSequence2;
                    this.r.put(charSequence2, qv9Var);
                } else {
                    this.q.remove(qv9Var);
                }
                qv9Var.b = (int) (System.currentTimeMillis() / 1000);
                this.q.add(0, qv9Var);
                z = true;
            }
            if (z) {
                jf7.Y(this.m).a.c(new en9(this, this.q, (byte) 11));
            }
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
        jf7.Y(this.m).a.c(new pv9(this, (byte) 1));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        return this.b.size() > 0;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        TLRPC.Chat chat;
        this.k = arrayList;
        this.l = arrayList2;
        zh6 zh6Var = this.f;
        if (zh6Var.m() != 0) {
            int i = 0;
            if (arrayList != null) {
                size = arrayList.size();
            } else if (arrayList2 == null) {
                return;
            } else {
                size = 0;
            }
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i < size2) {
                Object obj = i < size ? arrayList.get(i) : arrayList2.get(i - size);
                if (obj instanceof sl3) {
                    obj = ((sl3) obj).a;
                }
                if (obj instanceof zda) {
                    obj = ((zda) obj).b;
                }
                boolean z = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) zh6Var.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        zh6Var.l(user2.id);
                    }
                    long j = user.id;
                    zh6 zh6Var2 = this.h;
                    TLObject tLObject = (TLObject) zh6Var2.f(j);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        zh6Var2.l(user.id);
                    }
                    long j2 = user.id;
                    zh6 zh6Var3 = this.i;
                    Object f = zh6Var3.f(j2);
                    if (f != null) {
                        this.j.remove(f);
                        zh6Var3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) zh6Var.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    zh6Var.l(-chat.id);
                }
                i++;
            }
        }
    }

    public final void g(String str, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, int i, int i2) {
        h(str, z, z2, z3, z4, false, j, z5, i, i2, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[LOOP:2: B:56:0x0192->B:58:0x0198, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z, final boolean z2, final boolean z3, boolean z4, final boolean z5, long j, boolean z6, int i, final int i2, final long j2, final Runnable runnable) {
        int i3;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int size;
        int i5;
        boolean z11;
        String str2;
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        ArrayList arrayList = this.b;
        int size2 = arrayList.size();
        int i6 = 0;
        while (true) {
            i3 = this.m;
            if (i6 >= size2) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            ConnectionsManager.getInstance(i3).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        zh6 zh6Var = this.f;
        ArrayList arrayList3 = this.e;
        zh6 zh6Var2 = this.h;
        ArrayList arrayList4 = this.g;
        zh6 zh6Var3 = this.i;
        ArrayList arrayList5 = this.j;
        if (str == null) {
            arrayList4.clear();
            zh6Var2.b();
            arrayList3.clear();
            zh6Var.b();
            arrayList2.clear();
            arrayList5.clear();
            zh6Var3.b();
            this.a.p(i2);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i == 1) {
                    tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsAdmins();
                    tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
                } else if (i == 3) {
                    tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsBanned();
                    tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
                } else if (i == 0) {
                    tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsKicked();
                    tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
                } else {
                    tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
                    tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
                }
                tL_channelParticipantsSearch.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = uc7.s1(i3).h1(j);
                z8 = z4;
                arrayList6.add(new Pair(tL_channels_getParticipants, new vi1((Object) this, (Object) str, z8, (byte) 11)));
            } else {
                z8 = z4;
                this.n = str.toLowerCase();
            }
            z7 = true;
            z9 = false;
        } else {
            z7 = true;
            z8 = z4;
            arrayList4.clear();
            zh6Var2.b();
            z9 = true;
        }
        if (z) {
            if (str.length() <= 0) {
                arrayList3.clear();
                zh6Var.b();
                arrayList2.clear();
                z10 = false;
                if (!z5 && z6 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    zh6Var3.b();
                    String h = f78.h(str, false);
                    ArrayList arrayList7 = lv2.r(i3).f0;
                    size = arrayList7.size();
                    z11 = false;
                    for (i5 = 0; i5 < size; i5++) {
                        TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(((TLRPC.TL_contact) arrayList7.get(i5)).user_id));
                        if (X1 != null && (str2 = X1.phone) != null && str2.startsWith(h)) {
                            if (!z11) {
                                z11 = X1.phone.length() == h.length() ? z7 : false;
                            }
                            arrayList5.add(X1);
                            zh6Var3.k(X1.id, X1);
                        }
                    }
                    if (!z11) {
                        arrayList5.add("section");
                        arrayList5.add(h);
                    }
                    z10 = false;
                }
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList8 = new ArrayList();
                i4 = 0;
                while (i4 < arrayList6.size()) {
                    TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i4)).first;
                    arrayList8.add(null);
                    final AtomicInteger atomicInteger2 = new AtomicInteger();
                    final AtomicInteger atomicInteger3 = atomicInteger;
                    final ArrayList arrayList9 = arrayList8;
                    final int i7 = i4;
                    final ArrayList arrayList10 = arrayList6;
                    atomicInteger2.set(ConnectionsManager.getInstance(i3).sendRequest(tLObject, new RequestDelegate() { // from class: nv9
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final sv9 sv9Var = sv9.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i8 = i7;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i9 = i2;
                            final Runnable runnable2 = runnable;
                            hl.c3(new Runnable() { // from class: ov9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i8, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    sv9 sv9Var2 = sv9.this;
                                    ArrayList arrayList14 = sv9Var2.b;
                                    if (arrayList14.contains(valueOf)) {
                                        arrayList14.remove(valueOf);
                                        int incrementAndGet = atomicInteger5.incrementAndGet();
                                        ArrayList arrayList15 = arrayList12;
                                        if (incrementAndGet == arrayList15.size()) {
                                            for (int i10 = 0; i10 < arrayList15.size(); i10++) {
                                                RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i10)).second;
                                                Pair pair2 = (Pair) arrayList13.get(i10);
                                                if (pair2 != null) {
                                                    requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                                }
                                            }
                                            sv9Var2.i();
                                            ArrayList arrayList16 = sv9Var2.k;
                                            if (arrayList16 != null) {
                                                sv9Var2.f(arrayList16, sv9Var2.l);
                                            }
                                            ArrayList arrayList17 = sv9Var2.d;
                                            ArrayList arrayList18 = sv9Var2.e;
                                            zh6 zh6Var4 = sv9Var2.f;
                                            rv9 rv9Var = sv9Var2.a;
                                            if (rv9Var != null) {
                                                zh6 Z0 = rv9Var.Z0();
                                                if (Z0 != null) {
                                                    int m = Z0.m();
                                                    for (int i11 = 0; i11 < m; i11++) {
                                                        TLRPC.User user = (TLRPC.User) zh6Var4.f(Z0.j(i11));
                                                        if (user != null) {
                                                            arrayList18.remove(user);
                                                            arrayList17.remove(user);
                                                            zh6Var4.l(user.id);
                                                        }
                                                    }
                                                }
                                                zh6 D0 = sv9Var2.a.D0();
                                                if (D0 != null) {
                                                    int m2 = D0.m();
                                                    for (int i12 = 0; i12 < m2; i12++) {
                                                        TLRPC.User user2 = (TLRPC.User) zh6Var4.f(D0.j(i12));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            zh6Var4.l(user2.id);
                                                        }
                                                    }
                                                }
                                            }
                                            sv9Var2.a.p(i9);
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
                    i4 = i7 + 1;
                    arrayList6 = arrayList10;
                    atomicInteger = atomicInteger3;
                    arrayList8 = arrayList9;
                }
                if (z10) {
                    return;
                }
                this.a.p(i2);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z12 = z8;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: mv9
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    boolean z16;
                    zh6 zh6Var4;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    zh6 zh6Var5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z17;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    zh6 zh6Var6;
                    sv9 sv9Var = sv9.this;
                    boolean z18 = sv9Var.o;
                    int i8 = sv9Var.m;
                    ArrayList arrayList12 = sv9Var.d;
                    ArrayList arrayList13 = sv9Var.e;
                    zh6 zh6Var7 = sv9Var.f;
                    if (sv9Var.a.C1(i2) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        zh6Var7.b();
                        arrayList12.clear();
                        uc7.s1(i8).c4(tL_contacts_found2.chats, false);
                        uc7.s1(i8).j4(tL_contacts_found2.users, false);
                        jf7.Y(i8).j1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        zh6 zh6Var8 = new zh6();
                        zh6 zh6Var9 = new zh6();
                        for (int i9 = 0; i9 < tL_contacts_found2.chats.size(); i9++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i9);
                            zh6Var8.k(chat3.id, chat3);
                        }
                        for (int i10 = 0; i10 < tL_contacts_found2.users.size(); i10++) {
                            TLRPC.User user3 = tL_contacts_found2.users.get(i10);
                            zh6Var9.k(user3.id, user3);
                        }
                        int i11 = 0;
                        while (true) {
                            z13 = z2;
                            z14 = z5;
                            z15 = z3;
                            z16 = z12;
                            if (i11 >= 2) {
                                break;
                            }
                            if (i11 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z18) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z17 = z18;
                                i11++;
                                zh6Var8 = zh6Var8;
                                z18 = z17;
                            }
                            z17 = z18;
                            int i12 = 0;
                            while (i12 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i12);
                                boolean z19 = z16;
                                int i13 = i12;
                                long j3 = peer.user_id;
                                if (j3 != 0) {
                                    user2 = (TLRPC.User) zh6Var9.f(j3);
                                    chat2 = null;
                                } else {
                                    long j4 = peer.chat_id;
                                    if (j4 != 0) {
                                        chat2 = (TLRPC.Chat) zh6Var8.f(j4);
                                    } else {
                                        long j5 = peer.channel_id;
                                        if (j5 != 0) {
                                            chat2 = (TLRPC.Chat) zh6Var8.f(j5);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 != null) {
                                    if (z13 && ((!z14 || xc2.b(chat2)) && ((sv9Var.p || !xc2.r0(chat2)) && sv9Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        zh6Var7.k(-chat2.id, chat2);
                                    }
                                } else if (user2 != null && !z14 && ((z15 || !user2.bot) && ((z19 || !user2.self) && ((sv9Var.p || i11 != 1 || user2.contact) && sv9Var.d(user2))))) {
                                    arrayList13.add(user2);
                                    zh6Var6 = zh6Var8;
                                    zh6Var7.k(user2.id, user2);
                                    zh6Var8 = zh6Var6;
                                    i12 = i13 + 1;
                                    z16 = z19;
                                }
                                zh6Var6 = zh6Var8;
                                zh6Var8 = zh6Var6;
                                i12 = i13 + 1;
                                z16 = z19;
                            }
                            i11++;
                            zh6Var8 = zh6Var8;
                            z18 = z17;
                        }
                        zh6 zh6Var10 = zh6Var8;
                        if (!z18) {
                            int i14 = 0;
                            while (i14 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i14);
                                long j6 = peer2.user_id;
                                if (j6 != 0) {
                                    zh6Var4 = zh6Var10;
                                    user = (TLRPC.User) zh6Var9.f(j6);
                                    chat = null;
                                } else {
                                    long j7 = peer2.chat_id;
                                    if (j7 != 0) {
                                        zh6Var4 = zh6Var10;
                                        chat = (TLRPC.Chat) zh6Var4.f(j7);
                                    } else {
                                        zh6Var4 = zh6Var10;
                                        long j8 = peer2.channel_id;
                                        if (j8 != 0) {
                                            chat = (TLRPC.Chat) zh6Var4.f(j8);
                                        } else {
                                            chat = null;
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j9 = j2;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    zh6Var5 = zh6Var9;
                                    if (user != null && !z14 && ((z15 || !user.bot) && ((z16 || !user.self) && user.id != j9 && sv9Var.d(user)))) {
                                        arrayList12.add(user);
                                        zh6Var7.k(user.id, user);
                                    }
                                } else if (!z13 || (z14 && !xc2.b(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    zh6Var5 = zh6Var9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    zh6Var5 = zh6Var9;
                                    if ((-chat.id) != j9 && sv9Var.d(chat)) {
                                        arrayList12.add(chat);
                                        zh6Var7.k(-chat.id, chat);
                                    }
                                }
                                i14++;
                                tL_contacts_found2 = tL_contacts_found;
                                zh6Var9 = zh6Var5;
                                zh6Var10 = zh6Var4;
                            }
                        }
                        sv9Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z10 = z9;
        if (!z5) {
            arrayList5.clear();
            zh6Var3.b();
            String h2 = f78.h(str, false);
            ArrayList arrayList72 = lv2.r(i3).f0;
            size = arrayList72.size();
            z11 = false;
            while (i5 < size) {
            }
            if (!z11) {
            }
            z10 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i4 = 0;
        while (i4 < arrayList6.size()) {
        }
        if (z10) {
        }
    }

    public final void i() {
        zh6 zh6Var = this.f;
        if (zh6Var.m() != 0) {
            zh6 zh6Var2 = this.h;
            int m = zh6Var2.m();
            for (int i = 0; i < m; i++) {
                TLRPC.User user = (TLRPC.User) zh6Var.f(zh6Var2.j(i));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    zh6Var.l(user.id);
                }
            }
        }
    }
}
