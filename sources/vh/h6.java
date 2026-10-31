package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ h6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u6 u6Var;
        int i10 = this.a;
        int i11 = 0;
        r6 r6Var = this.b;
        int i12 = 1;
        switch (i10) {
            case 0:
                HashMap hashMap = r6Var.d;
                ArrayList arrayList = r6Var.c;
                w6 w6Var = r6Var.W;
                d dVar = r6Var.w;
                if (!dVar.Q) {
                    int i13 = w6.U1;
                    int i14 = w6Var.a;
                    HashMap hashMap2 = w6Var.l1;
                    ArrayList arrayList2 = w6Var.k1;
                    HashMap hashMap3 = w6Var.p1;
                    ArrayList arrayList3 = w6Var.o1;
                    vp r12 = vp.r1(i14);
                    int i15 = r6Var.a;
                    if (i15 == 5) {
                        j6 j6Var = w6Var.M1;
                        if (j6Var != null) {
                            j6Var.a(arrayList);
                        }
                        w6Var.dismiss();
                        break;
                    } else if (i15 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        ConnectionsManager.getInstance(w6Var.a).sendRequest(tL_editCloseFriends, new rh.h5(8, r6Var, r12));
                        break;
                    } else if (i15 == 0) {
                        int i16 = w6Var.E1;
                        if (i16 == 3) {
                            u6Var = new u6(w6Var.E1, w6Var.a, new ArrayList(w6.R0(arrayList3, hashMap3)));
                            ArrayList arrayList4 = u6Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = u6Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i16 == 2) {
                            u6Var = new u6(i16, w6Var.a, w6Var.n1);
                        } else if (i16 == 4) {
                            u6Var = new u6(w6Var.E1, w6Var.a, new ArrayList(w6.R0(arrayList2, hashMap2)));
                            ArrayList arrayList5 = u6Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = u6Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            u6Var = new u6(i16, w6Var.a, (ArrayList) null);
                        }
                        w6Var.N0(u6Var, new th.r2(w6Var, 1), false);
                        break;
                    } else if (i15 == 2) {
                        if (w6Var.Q1) {
                            w6Var.M0();
                            w6Var.N0(new u6(2, w6Var.a, arrayList), new th.r2(w6Var, 1), false);
                            break;
                        } else {
                            w6Var.M0();
                            w6Var.i1.E(0);
                            break;
                        }
                    } else if (i15 != 3) {
                        if (i15 == 6) {
                            HashSet R0 = w6.R0(arrayList, hashMap);
                            dVar.setLoading(true);
                            th.e5 O1 = vp.r1(w6Var.a).O1();
                            i6 i6Var = new i6(r6Var, i12);
                            int i17 = O1.a;
                            TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                            tL_contacts_setBlocked.my_stories_from = true;
                            HashSet hashSet = O1.L;
                            tL_contacts_setBlocked.limit = hashSet.size();
                            int size = O1.N - hashSet.size();
                            O1.N = size;
                            if (size < 0) {
                                O1.N = 0;
                            }
                            hashSet.clear();
                            Iterator it = R0.iterator();
                            while (it.hasNext()) {
                                Long l4 = (Long) it.next();
                                TLRPC.InputPeer i18 = vp.r1(i17).i1(l4.longValue());
                                if (!(i18 instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l4);
                                    tL_contacts_setBlocked.id.add(i18);
                                }
                            }
                            O1.N = hashSet.size() + O1.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_setBlocked, new ag.c(i6Var, 19));
                            break;
                        } else {
                            w6Var.E1 = i15;
                            w6Var.M0();
                            w6Var.i1.E(0);
                            break;
                        }
                    } else if (w6Var.Q1) {
                        HashSet R02 = w6.R0(arrayList, hashMap);
                        if (!R02.isEmpty()) {
                            w6Var.M0();
                            u6 u6Var2 = new u6(3, w6Var.a, new ArrayList(R02));
                            ArrayList arrayList6 = u6Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = u6Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            w6Var.N0(u6Var2, new i6(r6Var, i11), false);
                            break;
                        }
                    } else if (!w6.R0(arrayList, hashMap).isEmpty()) {
                        w6Var.E1 = 3;
                        w6Var.M0();
                        w6Var.i1.E(0);
                        break;
                    }
                }
                break;
            case 1:
                w6 w6Var2 = r6Var.W;
                if (w6Var2.F1) {
                    w6Var2.D1 = 5;
                    w6Var2.i1.E(1);
                    break;
                } else {
                    w6 w6Var3 = new w6(r6Var.getContext(), w6Var2.I0);
                    w6Var3.M1 = new j6(r6Var, i12);
                    w6Var3.H1 = w6Var2.H1;
                    w6Var3.show();
                    break;
                }
            default:
                HashMap hashMap7 = r6Var.d;
                a0.h hVar = r6Var.b;
                ArrayList arrayList7 = r6Var.c;
                int size2 = arrayList7.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList7.get(i19);
                    i19++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj2 = arrayList8.get(i20);
                        i20++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                r6Var.W.A1.clear();
                r6Var.y.d.a();
                r6Var.g(true);
                r6Var.f(true);
                break;
        }
    }
}
