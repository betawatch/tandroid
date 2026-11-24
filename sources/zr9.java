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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class zr9 {
    public yr9 a;
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
    public final vf6 f = new vf6();
    public final ArrayList g = new ArrayList();
    public final vf6 h = new vf6();
    public final vf6 i = new vf6();
    public final ArrayList j = new ArrayList();
    public final int m = y6c.t0;
    public boolean p = true;
    public boolean s = false;

    public zr9(boolean z) {
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
                xr9 xr9Var = (xr9) this.r.get(charSequence2);
                if (xr9Var == null) {
                    xr9Var = new xr9();
                    xr9Var.a = charSequence2;
                    this.r.put(charSequence2, xr9Var);
                } else {
                    this.q.remove(xr9Var);
                }
                xr9Var.b = (int) (System.currentTimeMillis() / 1000);
                this.q.add(0, xr9Var);
                z = true;
            }
            if (z) {
                ad7.Y(this.m).a.c(new tj9(this, this.q, (byte) 12));
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
        ad7.Y(this.m).a.c(new wr9(this, (byte) 0));
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
        vf6 vf6Var = this.f;
        if (vf6Var.m() != 0) {
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
                if (obj instanceof al3) {
                    obj = ((al3) obj).a;
                }
                if (obj instanceof iaa) {
                    obj = ((iaa) obj).b;
                }
                boolean z = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) vf6Var.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        vf6Var.l(user2.id);
                    }
                    long j = user.id;
                    vf6 vf6Var2 = this.h;
                    TLObject tLObject = (TLObject) vf6Var2.f(j);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        vf6Var2.l(user.id);
                    }
                    long j2 = user.id;
                    vf6 vf6Var3 = this.i;
                    Object f = vf6Var3.f(j2);
                    if (f != null) {
                        this.j.remove(f);
                        vf6Var3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) vf6Var.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    vf6Var.l(-chat.id);
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
        vf6 vf6Var = this.f;
        ArrayList arrayList3 = this.e;
        vf6 vf6Var2 = this.h;
        ArrayList arrayList4 = this.g;
        vf6 vf6Var3 = this.i;
        ArrayList arrayList5 = this.j;
        if (str == null) {
            arrayList4.clear();
            vf6Var2.b();
            arrayList3.clear();
            vf6Var.b();
            arrayList2.clear();
            arrayList5.clear();
            vf6Var3.b();
            this.a.r(i2);
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
                tL_channels_getParticipants.channel = na7.q1(i3).f1(j);
                z8 = z4;
                arrayList6.add(new Pair(tL_channels_getParticipants, new mi1((Object) this, (Object) str, z8, (byte) 11)));
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
            vf6Var2.b();
            z9 = true;
        }
        if (z) {
            if (str.length() <= 0) {
                arrayList3.clear();
                vf6Var.b();
                arrayList2.clear();
                z10 = false;
                if (!z5 && z6 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    vf6Var3.b();
                    String h = p38.h(str, false);
                    ArrayList arrayList7 = qu2.r(i3).f0;
                    size = arrayList7.size();
                    z11 = false;
                    for (i5 = 0; i5 < size; i5++) {
                        TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(((TLRPC.TL_contact) arrayList7.get(i5)).user_id));
                        if (V1 != null && (str2 = V1.phone) != null && str2.startsWith(h)) {
                            if (!z11) {
                                z11 = V1.phone.length() == h.length() ? z7 : false;
                            }
                            arrayList5.add(V1);
                            vf6Var3.k(V1, V1.id);
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
                    atomicInteger2.set(ConnectionsManager.getInstance(i3).sendRequest(tLObject, new RequestDelegate() { // from class: ur9
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final zr9 zr9Var = zr9.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i8 = i7;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i9 = i2;
                            final Runnable runnable2 = runnable;
                            gl.d3(new Runnable() { // from class: vr9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i8, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    zr9 zr9Var2 = zr9.this;
                                    ArrayList arrayList14 = zr9Var2.b;
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
                                            zr9Var2.i();
                                            ArrayList arrayList16 = zr9Var2.k;
                                            if (arrayList16 != null) {
                                                zr9Var2.f(arrayList16, zr9Var2.l);
                                            }
                                            ArrayList arrayList17 = zr9Var2.d;
                                            ArrayList arrayList18 = zr9Var2.e;
                                            vf6 vf6Var4 = zr9Var2.f;
                                            yr9 yr9Var = zr9Var2.a;
                                            if (yr9Var != null) {
                                                vf6 t1 = yr9Var.t1();
                                                if (t1 != null) {
                                                    int m = t1.m();
                                                    for (int i11 = 0; i11 < m; i11++) {
                                                        TLRPC.User user = (TLRPC.User) vf6Var4.f(t1.j(i11));
                                                        if (user != null) {
                                                            arrayList18.remove(user);
                                                            arrayList17.remove(user);
                                                            vf6Var4.l(user.id);
                                                        }
                                                    }
                                                }
                                                vf6 O0 = zr9Var2.a.O0();
                                                if (O0 != null) {
                                                    int m2 = O0.m();
                                                    for (int i12 = 0; i12 < m2; i12++) {
                                                        TLRPC.User user2 = (TLRPC.User) vf6Var4.f(O0.j(i12));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            vf6Var4.l(user2.id);
                                                        }
                                                    }
                                                }
                                            }
                                            zr9Var2.a.r(i9);
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
                this.a.r(i2);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z12 = z8;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: tr9
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    boolean z16;
                    vf6 vf6Var4;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    vf6 vf6Var5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z17;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    vf6 vf6Var6;
                    zr9 zr9Var = zr9.this;
                    boolean z18 = zr9Var.o;
                    int i8 = zr9Var.m;
                    ArrayList arrayList12 = zr9Var.d;
                    ArrayList arrayList13 = zr9Var.e;
                    vf6 vf6Var7 = zr9Var.f;
                    if (zr9Var.a.U1(i2) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        vf6Var7.b();
                        arrayList12.clear();
                        na7.q1(i8).U3(tL_contacts_found2.chats, false);
                        na7.q1(i8).a4(tL_contacts_found2.users, false);
                        ad7.Y(i8).j1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        vf6 vf6Var8 = new vf6();
                        vf6 vf6Var9 = new vf6();
                        for (int i9 = 0; i9 < tL_contacts_found2.chats.size(); i9++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i9);
                            vf6Var8.k(chat3, chat3.id);
                        }
                        for (int i10 = 0; i10 < tL_contacts_found2.users.size(); i10++) {
                            TLRPC.User user3 = tL_contacts_found2.users.get(i10);
                            vf6Var9.k(user3, user3.id);
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
                                vf6Var8 = vf6Var8;
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
                                    user2 = (TLRPC.User) vf6Var9.f(j3);
                                    chat2 = null;
                                } else {
                                    long j4 = peer.chat_id;
                                    if (j4 != 0) {
                                        chat2 = (TLRPC.Chat) vf6Var8.f(j4);
                                    } else {
                                        long j5 = peer.channel_id;
                                        if (j5 != 0) {
                                            chat2 = (TLRPC.Chat) vf6Var8.f(j5);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 != null) {
                                    if (z13 && ((!z14 || hc2.b(chat2)) && ((zr9Var.p || !hc2.r0(chat2)) && zr9Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        vf6Var7.k(chat2, -chat2.id);
                                    }
                                } else if (user2 != null && !z14 && ((z15 || !user2.bot) && ((z19 || !user2.self) && ((zr9Var.p || i11 != 1 || user2.contact) && zr9Var.d(user2))))) {
                                    arrayList13.add(user2);
                                    vf6Var6 = vf6Var8;
                                    vf6Var7.k(user2, user2.id);
                                    vf6Var8 = vf6Var6;
                                    i12 = i13 + 1;
                                    z16 = z19;
                                }
                                vf6Var6 = vf6Var8;
                                vf6Var8 = vf6Var6;
                                i12 = i13 + 1;
                                z16 = z19;
                            }
                            i11++;
                            vf6Var8 = vf6Var8;
                            z18 = z17;
                        }
                        vf6 vf6Var10 = vf6Var8;
                        if (!z18) {
                            int i14 = 0;
                            while (i14 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i14);
                                long j6 = peer2.user_id;
                                if (j6 != 0) {
                                    vf6Var4 = vf6Var10;
                                    user = (TLRPC.User) vf6Var9.f(j6);
                                    chat = null;
                                } else {
                                    long j7 = peer2.chat_id;
                                    if (j7 != 0) {
                                        vf6Var4 = vf6Var10;
                                        chat = (TLRPC.Chat) vf6Var4.f(j7);
                                    } else {
                                        vf6Var4 = vf6Var10;
                                        long j8 = peer2.channel_id;
                                        if (j8 != 0) {
                                            chat = (TLRPC.Chat) vf6Var4.f(j8);
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
                                    vf6Var5 = vf6Var9;
                                    if (user != null && !z14 && ((z15 || !user.bot) && ((z16 || !user.self) && user.id != j9 && zr9Var.d(user)))) {
                                        arrayList12.add(user);
                                        vf6Var7.k(user, user.id);
                                    }
                                } else if (!z13 || (z14 && !hc2.b(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    vf6Var5 = vf6Var9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    vf6Var5 = vf6Var9;
                                    if ((-chat.id) != j9 && zr9Var.d(chat)) {
                                        arrayList12.add(chat);
                                        vf6Var7.k(chat, -chat.id);
                                    }
                                }
                                i14++;
                                tL_contacts_found2 = tL_contacts_found;
                                vf6Var9 = vf6Var5;
                                vf6Var10 = vf6Var4;
                            }
                        }
                        zr9Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z10 = z9;
        if (!z5) {
            arrayList5.clear();
            vf6Var3.b();
            String h2 = p38.h(str, false);
            ArrayList arrayList72 = qu2.r(i3).f0;
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
        vf6 vf6Var = this.f;
        if (vf6Var.m() != 0) {
            vf6 vf6Var2 = this.h;
            int m = vf6Var2.m();
            for (int i = 0; i < m; i++) {
                TLRPC.User user = (TLRPC.User) vf6Var.f(vf6Var2.j(i));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    vf6Var.l(user.id);
                }
            }
        }
    }
}
