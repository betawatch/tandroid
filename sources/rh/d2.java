package rh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ d2(e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final sf.a aVar = (sf.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final e4 e4Var = this.b;
                updatestargiftprice.stargift = e4Var.B1();
                updatestargiftprice.resell_amount = o10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e4Var.a);
                final int i10 = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: rh.f1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var2 = e4Var;
                                final Runnable runnable2 = runnable;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.i0.g3(new a3.i0(e4Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 25));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i11 = 1;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.p1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i11) {
                                                    case 0:
                                                        e4Var2.k().f0(tL_error, false);
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e4Var2.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable2;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    vp.r1(e4Var2.a).L3((TLRPC.Updates) tLObject, false);
                                    final int i12 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final sf.a aVar2 = aVar;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.o1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i13 = i12;
                                            sf.b bVar = sf.b.a;
                                            sf.b bVar2 = sf.b.b;
                                            Runnable runnable3 = runnable2;
                                            sf.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            e4 e4Var3 = e4Var2;
                                            switch (i13) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    e4Var3.X1.setResellPrice(aVar3);
                                                    ph.u1 u1Var = e4Var3.c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    e4Var3.X1.setResellPrice(aVar3);
                                                    ph.u1 u1Var2 = e4Var3.c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    e4Var3.k().Q(R.raw.contact_check, 36, cd.a0(null, null, 2131750037, e4Var3.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var3 = e4Var;
                                final Runnable runnable3 = runnable;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i13 = 0;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.p1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        e4Var3.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e4Var3.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable3;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    vp.r1(e4Var3.a).L3((TLRPC.Updates) tLObject, false);
                                    final int i14 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final sf.a aVar3 = aVar;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.o1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i132 = i14;
                                            sf.b bVar = sf.b.a;
                                            sf.b bVar2 = sf.b.b;
                                            Runnable runnable32 = runnable3;
                                            sf.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            e4 e4Var32 = e4Var3;
                                            switch (i132) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var32.c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var32.c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var32.k().Q(R.raw.contact_check, 36, cd.a0(null, null, 2131750037, e4Var32.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                q20 q20Var = (q20) obj;
                Boolean bool = (Boolean) obj2;
                e4 e4Var2 = this.b;
                ph.p3 p3Var = e4Var2.O2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (p3Var == null) {
                    ph.p3 p3Var2 = new ph.p3(e4Var2.a, tL_starGiftUnique2.gift_id);
                    e4Var2.O2 = p3Var2;
                    p3Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i11 = 0;
                while (true) {
                    y2[] y2VarArr = e4Var2.X1.M.n;
                    if (i11 >= y2VarArr.length) {
                        ph.q3 q3Var = new ph.q3(e4Var2.getContext(), tL_starGiftUnique2.title, e4Var2.O2);
                        q3Var.Y1.addAll(hashSet);
                        q3Var.a2.O(true);
                        q3Var.Z1 = bool.booleanValue();
                        q3Var.W1.set(org.telegram.messenger.i0.W2(cd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        q3Var.X1 = new e1(q20Var, 0);
                        q3Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = y2VarArr[i11].h;
                        if ((starGift != null ? starGift : null) != null) {
                            if (starGift == null) {
                                starGift = null;
                            }
                            hashSet.add(Long.valueOf(starGift.id));
                        }
                        i11++;
                    }
                }
            default:
                final sf.a aVar2 = (sf.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o11 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final e4 e4Var3 = this.b;
                updatestargiftprice2.stargift = e4Var3.B1();
                updatestargiftprice2.resell_amount = o11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(e4Var3.a);
                final int i12 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: rh.f1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var22 = e4Var3;
                                final Runnable runnable22 = runnable2;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.i0.g3(new a3.i0(e4Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 25));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i112 = 1;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.p1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i112) {
                                                    case 0:
                                                        e4Var22.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable22;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e4Var22.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable22;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    vp.r1(e4Var22.a).L3((TLRPC.Updates) tLObject, false);
                                    final int i122 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final sf.a aVar22 = aVar2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.o1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i132 = i122;
                                            sf.b bVar = sf.b.a;
                                            sf.b bVar2 = sf.b.b;
                                            Runnable runnable32 = runnable22;
                                            sf.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            e4 e4Var32 = e4Var22;
                                            switch (i132) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var32.c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var32.c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var32.k().Q(R.raw.contact_check, 36, cd.a0(null, null, 2131750037, e4Var32.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var32 = e4Var3;
                                final Runnable runnable3 = runnable2;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i13 = 0;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.p1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        e4Var32.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e4Var32.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable3;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    vp.r1(e4Var32.a).L3((TLRPC.Updates) tLObject, false);
                                    final int i14 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final sf.a aVar3 = aVar2;
                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.o1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i132 = i14;
                                            sf.b bVar = sf.b.a;
                                            sf.b bVar2 = sf.b.b;
                                            Runnable runnable32 = runnable3;
                                            sf.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            e4 e4Var322 = e4Var32;
                                            switch (i132) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var322.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var322.c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var322.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var322.c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var322.k().Q(R.raw.contact_check, 36, cd.a0(null, null, 2131750037, e4Var322.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
