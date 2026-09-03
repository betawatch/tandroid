package ph;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ p7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        c8 c8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                y7 y7Var = this.b;
                HashMap hashMap = y7Var.d;
                ArrayList arrayList = y7Var.c;
                e8 e8Var = y7Var.T;
                d dVar = y7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    HashMap hashMap2 = e8Var.e;
                    ArrayList arrayList2 = e8Var.d;
                    HashMap hashMap3 = e8Var.r;
                    ArrayList arrayList3 = e8Var.n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = y7Var.a;
                    if (i19 == 5) {
                        r7 r7Var = e8Var.S;
                        if (r7Var != null) {
                            r7Var.run(arrayList);
                        }
                        e8Var.dismiss();
                        break;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new qi1(3, y7Var, messagesController));
                        break;
                    } else if (i19 == 0) {
                        int i20 = e8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = e8.l1(arrayList3, hashMap3);
                            int i21 = e8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = c8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = c8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i20, i16, e8Var.h);
                        } else if (i20 == 4) {
                            HashSet l12 = e8.l1(arrayList2, hashMap2);
                            int i22 = e8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = c8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = c8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i14 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8Var = new c8(i20, i14, (ArrayList) null);
                        }
                        e8Var.g1(c8Var, new nh.t3(e8Var, 1), false);
                        break;
                    } else if (i19 == 2) {
                        if (e8Var.W) {
                            e8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            e8Var.g1(new c8(2, i13, arrayList), new nh.t3(e8Var, 1), false);
                            break;
                        } else {
                            e8Var.f1();
                            e8Var.b.D(0);
                            break;
                        }
                    } else if (i19 != 3) {
                        if (i19 == 6) {
                            HashSet l13 = e8.l1(arrayList, hashMap);
                            dVar.setLoading(true);
                            i11 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            nh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                            q7 q7Var = new q7(y7Var, 1);
                            int i23 = storiesController.a;
                            TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                            tL_contacts_setBlocked.my_stories_from = true;
                            HashSet hashSet = storiesController.L;
                            tL_contacts_setBlocked.limit = hashSet.size();
                            int size = storiesController.N - hashSet.size();
                            storiesController.N = size;
                            if (size < 0) {
                                storiesController.N = 0;
                            }
                            hashSet.clear();
                            Iterator it = l13.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i23).getInputPeer(l10.longValue());
                                if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                    hashSet.add(l10);
                                    tL_contacts_setBlocked.id.add(inputPeer);
                                }
                            }
                            storiesController.N = hashSet.size() + storiesController.N;
                            tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                            ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new ff.a(q7Var, 11));
                            break;
                        } else {
                            e8Var.K = i19;
                            e8Var.f1();
                            e8Var.b.D(0);
                            break;
                        }
                    } else if (e8Var.W) {
                        HashSet l14 = e8.l1(arrayList, hashMap);
                        if (!l14.isEmpty()) {
                            e8Var.f1();
                            i12 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            c8 c8Var2 = new c8(3, i12, new ArrayList(l14));
                            ArrayList arrayList6 = c8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = c8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            e8Var.g1(c8Var2, new q7(y7Var, 0), false);
                            break;
                        }
                    } else if (!e8.l1(arrayList, hashMap).isEmpty()) {
                        e8Var.K = 3;
                        e8Var.f1();
                        e8Var.b.D(0);
                        break;
                    }
                }
                break;
            case 1:
                y7 y7Var2 = this.b;
                e8 e8Var2 = y7Var2.T;
                if (e8Var2.L) {
                    e8Var2.J = 5;
                    e8Var2.b.D(1);
                    break;
                } else {
                    Context context = y7Var2.getContext();
                    f6Var = ((org.telegram.ui.ActionBar.g3) e8Var2).resourcesProvider;
                    e8 e8Var3 = new e8(context, f6Var);
                    e8Var3.S = new r7(y7Var2, 1);
                    e8Var3.N = e8Var2.N;
                    e8Var3.show();
                    break;
                }
            default:
                y7 y7Var3 = this.b;
                HashMap hashMap7 = y7Var3.d;
                a0.h hVar = y7Var3.b;
                ArrayList arrayList7 = y7Var3.c;
                int size2 = arrayList7.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj = arrayList7.get(i24);
                    i24++;
                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                }
                for (ArrayList arrayList8 : hashMap7.values()) {
                    int size3 = arrayList8.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        Object obj2 = arrayList8.get(i25);
                        i25++;
                        hVar.k(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                }
                arrayList7.clear();
                hashMap7.clear();
                y7Var3.T.G.clear();
                y7Var3.x.c.a();
                y7Var3.f(true);
                y7Var3.e(true);
                break;
        }
    }
}
