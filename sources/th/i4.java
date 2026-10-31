package th;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ i4(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    e5 e5Var = this.b;
                    vp.r1(e5Var.a).K3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.i0.g3(new m4(e5Var, 1));
                    break;
                }
                break;
            case 1:
                final int i10 = 1;
                final e5 e5Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: th.l4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e5 e5Var3 = e5Var2;
                                HashSet hashSet = e5Var3.L;
                                int i11 = e5Var3.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    vp.r1(i11).V3(tL_contacts_blocked.users, false);
                                    vp.r1(i11).P3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked.peer_id)));
                                    }
                                    e5Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    e5Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    vp.r1(i11).V3(tL_contacts_blockedSlice.users, false);
                                    vp.r1(i11).P3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    e5Var3.N = tL_contacts_blockedSlice.count;
                                    e5Var3.O = hashSet.size() >= e5Var3.N;
                                }
                                zs.f(i11).k(zs.a3, new Object[0]);
                                e5Var3.P = false;
                                e5Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                e5 e5Var4 = e5Var2;
                                int i14 = e5Var4.a;
                                ArrayList arrayList3 = e5Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    vp.r1(i14).P3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i15);
                                        i15++;
                                        arrayList3.add(vp.k1(chat));
                                    }
                                }
                                e5Var4.U = false;
                                e5Var4.V = true;
                                zs.f(i14).k(zs.c3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final e5 e5Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: th.l4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e5 e5Var32 = e5Var3;
                                HashSet hashSet = e5Var32.L;
                                int i112 = e5Var32.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    vp.r1(i112).V3(tL_contacts_blocked.users, false);
                                    vp.r1(i112).P3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked.peer_id)));
                                    }
                                    e5Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    e5Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    vp.r1(i112).V3(tL_contacts_blockedSlice.users, false);
                                    vp.r1(i112).P3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    e5Var32.N = tL_contacts_blockedSlice.count;
                                    e5Var32.O = hashSet.size() >= e5Var32.N;
                                }
                                zs.f(i112).k(zs.a3, new Object[0]);
                                e5Var32.P = false;
                                e5Var32.Q = System.currentTimeMillis();
                                break;
                            default:
                                e5 e5Var4 = e5Var3;
                                int i14 = e5Var4.a;
                                ArrayList arrayList3 = e5Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    vp.r1(i14).P3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i15);
                                        i15++;
                                        arrayList3.add(vp.k1(chat));
                                    }
                                }
                                e5Var4.U = false;
                                e5Var4.V = true;
                                zs.f(i14).k(zs.c3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                e5 e5Var4 = this.b;
                e5Var4.getClass();
                org.telegram.messenger.i0.g3(new m4(e5Var4, 0));
                break;
            case 4:
                e5 e5Var5 = this.b;
                e5Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.i0.g3(new m4(e5Var5, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new rh.l5(this.b, tLObject, tL_error, 6));
                break;
        }
    }
}
