package rf;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.gg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class k1 {
    public j1 a;
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
    public final int m = UserConfig.selectedAccount;
    public boolean p = true;
    public boolean s = false;

    public k1(boolean z10) {
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
            i1 i1Var = (i1) this.r.get(charSequence2);
            if (i1Var == null) {
                i1Var = new i1();
                i1Var.a = charSequence2;
                this.r.put(charSequence2, i1Var);
            } else {
                this.q.remove(i1Var);
            }
            i1Var.b = (int) (System.currentTimeMillis() / 1000);
            this.q.add(0, i1Var);
            z10 = true;
        }
        if (z10) {
            MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new org.telegram.ui.web.y(25, this, this.q));
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
        MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new h1(this, 0));
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
                if (obj instanceof z) {
                    obj = ((z) obj).a;
                }
                if (obj instanceof qp0) {
                    obj = ((qp0) obj).b;
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
                    Object f9 = hVar3.f(j11);
                    if (f9 != null) {
                        this.j.remove(f9);
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
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a A[LOOP:2: B:56:0x0194->B:58:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j10, boolean z15, int i10, final int i11, final long j11, final gg ggVar) {
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        int size;
        int i14;
        boolean z19;
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
            this.a.f(i11);
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
                tL_channels_getParticipants.channel = MessagesController.getInstance(i12).getInputChannel(j10);
                z16 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new j7(this, str, z16, 8)));
            } else {
                z16 = z13;
                this.n = str.toLowerCase();
            }
            z17 = false;
        } else {
            z16 = z13;
            arrayList4.clear();
            hVar2.b();
            z17 = true;
        }
        if (z10) {
            if (str.length() <= 0) {
                arrayList3.clear();
                hVar.b();
                arrayList2.clear();
                z18 = false;
                if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    hVar3.b();
                    String d = qe.b.d(str, false);
                    ArrayList<TLRPC.TL_contact> arrayList7 = ContactsController.getInstance(i12).contacts;
                    size = arrayList7.size();
                    z19 = false;
                    for (i14 = 0; i14 < size; i14++) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList7.get(i14).user_id));
                        if (user != null && (str2 = user.phone) != null && str2.startsWith(d)) {
                            if (!z19) {
                                z19 = user.phone.length() == d.length();
                            }
                            arrayList5.add(user);
                            hVar3.k(user, user.id);
                        }
                    }
                    if (!z19) {
                        arrayList5.add("section");
                        arrayList5.add(d);
                    }
                    z18 = false;
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
                    atomicInteger2.set(ConnectionsManager.getInstance(i12).sendRequest(tLObject, new RequestDelegate() { // from class: rf.f1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final k1 k1Var = k1.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i17 = i16;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i18 = i11;
                            final Runnable runnable = ggVar;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rf.g1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i17, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    k1 k1Var2 = k1.this;
                                    ArrayList arrayList14 = k1Var2.b;
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
                                            k1Var2.i();
                                            ArrayList arrayList16 = k1Var2.k;
                                            if (arrayList16 != null) {
                                                k1Var2.f(arrayList16, k1Var2.l);
                                            }
                                            ArrayList arrayList17 = k1Var2.d;
                                            ArrayList arrayList18 = k1Var2.e;
                                            a0.h hVar4 = k1Var2.f;
                                            j1 j1Var = k1Var2.a;
                                            if (j1Var != null) {
                                                a0.h t10 = j1Var.t();
                                                if (t10 != null) {
                                                    int m10 = t10.m();
                                                    for (int i20 = 0; i20 < m10; i20++) {
                                                        TLRPC.User user2 = (TLRPC.User) hVar4.f(t10.j(i20));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            hVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                                a0.h q6 = k1Var2.a.q();
                                                if (q6 != null) {
                                                    int m11 = q6.m();
                                                    for (int i21 = 0; i21 < m11; i21++) {
                                                        TLRPC.User user3 = (TLRPC.User) hVar4.f(q6.j(i21));
                                                        if (user3 != null) {
                                                            arrayList18.remove(user3);
                                                            arrayList17.remove(user3);
                                                            hVar4.l(user3.id);
                                                        }
                                                    }
                                                }
                                            }
                                            k1Var2.a.f(i18);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
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
                if (z18) {
                    return;
                }
                this.a.f(i11);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z20 = z16;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: rf.e1
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
                    boolean z21;
                    boolean z22;
                    boolean z23;
                    boolean z24;
                    a0.h hVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user2;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z25;
                    TLRPC.Chat chat2;
                    TLRPC.User user3;
                    a0.h hVar6;
                    k1 k1Var = k1.this;
                    boolean z26 = k1Var.o;
                    int i17 = k1Var.m;
                    ArrayList arrayList12 = k1Var.d;
                    ArrayList arrayList13 = k1Var.e;
                    a0.h hVar7 = k1Var.f;
                    if (k1Var.a.A(i11) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        hVar7.b();
                        arrayList12.clear();
                        MessagesController.getInstance(i17).putChats(tL_contacts_found2.chats, false);
                        MessagesController.getInstance(i17).putUsers(tL_contacts_found2.users, false);
                        MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.h hVar8 = new a0.h();
                        a0.h hVar9 = new a0.h();
                        for (int i18 = 0; i18 < tL_contacts_found2.chats.size(); i18++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i18);
                            hVar8.k(chat3, chat3.id);
                        }
                        for (int i19 = 0; i19 < tL_contacts_found2.users.size(); i19++) {
                            TLRPC.User user4 = tL_contacts_found2.users.get(i19);
                            hVar9.k(user4, user4.id);
                        }
                        int i20 = 0;
                        while (true) {
                            z21 = z11;
                            z22 = z14;
                            z23 = z12;
                            z24 = z20;
                            if (i20 >= 2) {
                                break;
                            }
                            if (i20 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z26) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z25 = z26;
                                i20++;
                                hVar8 = hVar8;
                                z26 = z25;
                            }
                            z25 = z26;
                            int i21 = 0;
                            while (i21 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i21);
                                boolean z27 = z24;
                                int i22 = i21;
                                long j12 = peer.user_id;
                                if (j12 != 0) {
                                    user3 = (TLRPC.User) hVar9.f(j12);
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
                                            user3 = null;
                                        }
                                    }
                                    user3 = null;
                                }
                                if (chat2 != null) {
                                    if (z21 && ((!z22 || ChatObject.canAddBotsToChat(chat2)) && ((k1Var.p || !ChatObject.isNotInChat(chat2)) && k1Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        hVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user3 != null) {
                                    if (!z22) {
                                        if (!z23) {
                                        }
                                        if (!z27) {
                                        }
                                        if (!k1Var.p) {
                                            if (i20 == 1) {
                                            }
                                        }
                                        if (k1Var.d(user3)) {
                                            arrayList13.add(user3);
                                            hVar6 = hVar8;
                                            hVar7.k(user3, user3.id);
                                            hVar8 = hVar6;
                                            i21 = i22 + 1;
                                            z24 = z27;
                                        }
                                    }
                                }
                                hVar6 = hVar8;
                                hVar8 = hVar6;
                                i21 = i22 + 1;
                                z24 = z27;
                            }
                            i20++;
                            hVar8 = hVar8;
                            z26 = z25;
                        }
                        a0.h hVar10 = hVar8;
                        if (!z26) {
                            int i23 = 0;
                            while (i23 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i23);
                                long j15 = peer2.user_id;
                                if (j15 != 0) {
                                    hVar4 = hVar10;
                                    user2 = (TLRPC.User) hVar9.f(j15);
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
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                long j18 = j11;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if (user2 != null && !z22 && ((z23 || !user2.bot) && ((z24 || !user2.self) && user2.id != j18 && k1Var.d(user2)))) {
                                        arrayList12.add(user2);
                                        hVar7.k(user2, user2.id);
                                    }
                                } else if (!z21 || (z22 && !ChatObject.canAddBotsToChat(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if ((-chat.id) != j18 && k1Var.d(chat)) {
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
                        k1Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z18 = z17;
        if (!z14) {
            arrayList5.clear();
            hVar3.b();
            String d10 = qe.b.d(str, false);
            ArrayList<TLRPC.TL_contact> arrayList72 = ContactsController.getInstance(i12).contacts;
            size = arrayList72.size();
            z19 = false;
            while (i14 < size) {
            }
            if (!z19) {
            }
            z18 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i13 = 0;
        while (i13 < arrayList6.size()) {
        }
        if (z18) {
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
