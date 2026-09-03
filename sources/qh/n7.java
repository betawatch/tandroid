package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ri1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ n7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        a8 a8Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                HashMap hashMap = w7Var.d;
                ArrayList arrayList = w7Var.c;
                c8 c8Var = w7Var.T;
                d dVar = w7Var.v;
                if (!dVar.K) {
                    i10 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                    HashMap hashMap2 = c8Var.e;
                    ArrayList arrayList2 = c8Var.d;
                    HashMap hashMap3 = c8Var.r;
                    ArrayList arrayList3 = c8Var.n;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    int i19 = w7Var.a;
                    if (i19 == 5) {
                        p7 p7Var = c8Var.S;
                        if (p7Var != null) {
                            p7Var.run(arrayList);
                        }
                        c8Var.dismiss();
                        break;
                    } else if (i19 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList);
                        dVar.setLoading(true);
                        i18 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                        ConnectionsManager.getInstance(i18).sendRequest(tL_editCloseFriends, new ri1(3, w7Var, messagesController));
                        break;
                    } else if (i19 == 0) {
                        int i20 = c8Var.K;
                        if (i20 == 3) {
                            HashSet l1 = c8.l1(arrayList3, hashMap3);
                            int i21 = c8Var.K;
                            i17 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i21, i17, new ArrayList(l1));
                            ArrayList arrayList4 = a8Var.c;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList3);
                            HashMap hashMap4 = a8Var.d;
                            hashMap4.clear();
                            hashMap4.putAll(hashMap3);
                        } else if (i20 == 2) {
                            i16 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i20, i16, c8Var.h);
                        } else if (i20 == 4) {
                            HashSet l12 = c8.l1(arrayList2, hashMap2);
                            int i22 = c8Var.K;
                            i15 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i22, i15, new ArrayList(l12));
                            ArrayList arrayList5 = a8Var.c;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList2);
                            HashMap hashMap5 = a8Var.d;
                            hashMap5.clear();
                            hashMap5.putAll(hashMap2);
                        } else {
                            i14 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8Var = new a8(i20, i14, (ArrayList) null);
                        }
                        c8Var.g1(a8Var, new oh.v3(c8Var, 1), false);
                        break;
                    } else if (i19 == 2) {
                        if (c8Var.W) {
                            c8Var.f1();
                            i13 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            c8Var.g1(new a8(2, i13, arrayList), new oh.v3(c8Var, 1), false);
                            break;
                        } else {
                            c8Var.f1();
                            c8Var.b.D(0);
                            break;
                        }
                    } else if (i19 != 3) {
                        if (i19 == 6) {
                            HashSet l13 = c8.l1(arrayList, hashMap);
                            dVar.setLoading(true);
                            i11 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            oh.t6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                            o7 o7Var = new o7(w7Var, 1);
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
                            ConnectionsManager.getInstance(i23).sendRequest(tL_contacts_setBlocked, new gf.a(o7Var, 11));
                            break;
                        } else {
                            c8Var.K = i19;
                            c8Var.f1();
                            c8Var.b.D(0);
                            break;
                        }
                    } else if (c8Var.W) {
                        HashSet l14 = c8.l1(arrayList, hashMap);
                        if (!l14.isEmpty()) {
                            c8Var.f1();
                            i12 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
                            a8 a8Var2 = new a8(3, i12, new ArrayList(l14));
                            ArrayList arrayList6 = a8Var2.c;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList);
                            HashMap hashMap6 = a8Var2.d;
                            hashMap6.clear();
                            hashMap6.putAll(hashMap);
                            c8Var.g1(a8Var2, new o7(w7Var, 0), false);
                            break;
                        }
                    } else if (!c8.l1(arrayList, hashMap).isEmpty()) {
                        c8Var.K = 3;
                        c8Var.f1();
                        c8Var.b.D(0);
                        break;
                    }
                }
                break;
            case 1:
                w7 w7Var2 = this.b;
                c8 c8Var2 = w7Var2.T;
                if (c8Var2.L) {
                    c8Var2.J = 5;
                    c8Var2.b.D(1);
                    break;
                } else {
                    Context context = w7Var2.getContext();
                    g6Var = ((org.telegram.ui.ActionBar.h3) c8Var2).resourcesProvider;
                    c8 c8Var3 = new c8(context, g6Var);
                    c8Var3.S = new p7(w7Var2, 1);
                    c8Var3.N = c8Var2.N;
                    c8Var3.show();
                    break;
                }
            default:
                w7 w7Var3 = this.b;
                HashMap hashMap7 = w7Var3.d;
                a0.h hVar = w7Var3.b;
                ArrayList arrayList7 = w7Var3.c;
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
                w7Var3.T.G.clear();
                w7Var3.x.c.a();
                w7Var3.f(true);
                w7Var3.e(true);
                break;
        }
    }
}
