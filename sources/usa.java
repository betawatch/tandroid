// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class usa implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ usa(wua wuaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = tL_starGiftUnique;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final oj ojVar = (oj) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount q = ojVar.q();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final wua wuaVar = this.b;
                updatestargiftprice.stargift = wuaVar.v1();
                updatestargiftprice.resell_amount = q;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wuaVar.a);
                final byte b = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: ura
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final byte b2 = 0;
                        switch (b) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final wua wuaVar2 = wuaVar;
                                final Runnable runnable2 = runnable;
                                if (!z) {
                                    if (tL_error != null) {
                                        if (!tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                            hl.c3(new Runnable() { // from class: dsa
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b2;
                                                    Runnable runnable3 = runnable2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    wua wuaVar3 = wuaVar2;
                                                    switch (b3) {
                                                        case 0:
                                                            wuaVar3.j().g0(tL_error2, false);
                                                            if (runnable3 != null) {
                                                                runnable3.run();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            wuaVar3.j().g0(tL_error2, false);
                                                            if (runnable3 != null) {
                                                                runnable3.run();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            hl.c3(new cq6(wuaVar2, Long.parseLong(tL_error.text.substring(26)), runnable2, (byte) 26));
                                            break;
                                        }
                                    }
                                } else {
                                    uc7.s1(wuaVar2.a).Y3((TLRPC.Updates) tLObject, false);
                                    final byte b3 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final oj ojVar2 = ojVar;
                                    hl.c3(new Runnable() { // from class: csa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b3;
                                            pj pjVar = pj.a;
                                            pj pjVar2 = pj.b;
                                            Runnable runnable3 = runnable2;
                                            oj ojVar3 = ojVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            wua wuaVar3 = wuaVar2;
                                            switch (b4) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = ojVar3.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(ojVar3.e(pjVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(ojVar3.e(pjVar2).q());
                                                    wuaVar3.a2.setResellPrice(ojVar3);
                                                    qt8 qt8Var = wuaVar3.i3;
                                                    if (qt8Var != null) {
                                                        qt8Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    wuaVar3.j().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749980, wuaVar3.t1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = ojVar3.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(ojVar3.e(pjVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(ojVar3.e(pjVar2).q());
                                                    wuaVar3.a2.setResellPrice(ojVar3);
                                                    qt8 qt8Var2 = wuaVar3.i3;
                                                    if (qt8Var2 != null) {
                                                        qt8Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z2 = tLObject instanceof TLRPC.Updates;
                                final wua wuaVar3 = wuaVar;
                                final Runnable runnable3 = runnable;
                                if (!z2) {
                                    if (tL_error != null) {
                                        final byte b4 = 1;
                                        hl.c3(new Runnable() { // from class: dsa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b4;
                                                Runnable runnable32 = runnable3;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                wua wuaVar32 = wuaVar3;
                                                switch (b32) {
                                                    case 0:
                                                        wuaVar32.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        wuaVar32.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    uc7.s1(wuaVar3.a).Y3((TLRPC.Updates) tLObject, false);
                                    final byte b5 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final oj ojVar3 = ojVar;
                                    hl.c3(new Runnable() { // from class: csa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b5;
                                            pj pjVar = pj.a;
                                            pj pjVar2 = pj.b;
                                            Runnable runnable32 = runnable3;
                                            oj ojVar32 = ojVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            wua wuaVar32 = wuaVar3;
                                            switch (b42) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar32.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var = wuaVar32.i3;
                                                    if (qt8Var != null) {
                                                        qt8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wuaVar32.j().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749980, wuaVar32.t1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar32.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var2 = wuaVar32.i3;
                                                    if (qt8Var2 != null) {
                                                        qt8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
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
                pcc pccVar = (pcc) obj;
                Boolean bool = (Boolean) obj2;
                wua wuaVar2 = this.b;
                ld9 ld9Var = wuaVar2.R2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (ld9Var == null) {
                    ld9 ld9Var2 = new ld9(wuaVar2.a, tL_starGiftUnique2.gift_id);
                    wuaVar2.R2 = ld9Var2;
                    ld9Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i = 0;
                while (true) {
                    tta[] ttaVarArr = wuaVar2.a2.N.n;
                    if (i >= ttaVarArr.length) {
                        md9 md9Var = new md9(wuaVar2.getContext(), tL_starGiftUnique2.title, wuaVar2.R2);
                        md9Var.b2.addAll(hashSet);
                        md9Var.d2.O(true);
                        md9Var.c2 = bool.booleanValue();
                        md9Var.Z1.set(hl.S2(ob6.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        md9Var.a2 = new m62(pccVar, (byte) 4);
                        md9Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = ttaVarArr[i].h;
                        if ((starGift != null ? starGift : null) != null) {
                            if (starGift == null) {
                                starGift = null;
                            }
                            hashSet.add(Long.valueOf(starGift.id));
                        }
                        i++;
                    }
                }
            default:
                final oj ojVar2 = (oj) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount q2 = ojVar2.q();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final wua wuaVar3 = this.b;
                updatestargiftprice2.stargift = wuaVar3.v1();
                updatestargiftprice2.resell_amount = q2;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(wuaVar3.a);
                final byte b2 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: ura
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final byte b22 = 0;
                        switch (b2) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final wua wuaVar22 = wuaVar3;
                                final Runnable runnable22 = runnable2;
                                if (!z) {
                                    if (tL_error != null) {
                                        if (!tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                            hl.c3(new Runnable() { // from class: dsa
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b32 = b22;
                                                    Runnable runnable32 = runnable22;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    wua wuaVar32 = wuaVar22;
                                                    switch (b32) {
                                                        case 0:
                                                            wuaVar32.j().g0(tL_error2, false);
                                                            if (runnable32 != null) {
                                                                runnable32.run();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            wuaVar32.j().g0(tL_error2, false);
                                                            if (runnable32 != null) {
                                                                runnable32.run();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            hl.c3(new cq6(wuaVar22, Long.parseLong(tL_error.text.substring(26)), runnable22, (byte) 26));
                                            break;
                                        }
                                    }
                                } else {
                                    uc7.s1(wuaVar22.a).Y3((TLRPC.Updates) tLObject, false);
                                    final byte b3 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final oj ojVar22 = ojVar2;
                                    hl.c3(new Runnable() { // from class: csa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b3;
                                            pj pjVar = pj.a;
                                            pj pjVar2 = pj.b;
                                            Runnable runnable32 = runnable22;
                                            oj ojVar32 = ojVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            wua wuaVar32 = wuaVar22;
                                            switch (b42) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar32.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var = wuaVar32.i3;
                                                    if (qt8Var != null) {
                                                        qt8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wuaVar32.j().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749980, wuaVar32.t1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar32.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var2 = wuaVar32.i3;
                                                    if (qt8Var2 != null) {
                                                        qt8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z2 = tLObject instanceof TLRPC.Updates;
                                final wua wuaVar32 = wuaVar3;
                                final Runnable runnable3 = runnable2;
                                if (!z2) {
                                    if (tL_error != null) {
                                        final byte b4 = 1;
                                        hl.c3(new Runnable() { // from class: dsa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b4;
                                                Runnable runnable32 = runnable3;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                wua wuaVar322 = wuaVar32;
                                                switch (b32) {
                                                    case 0:
                                                        wuaVar322.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        wuaVar322.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    uc7.s1(wuaVar32.a).Y3((TLRPC.Updates) tLObject, false);
                                    final byte b5 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final oj ojVar3 = ojVar2;
                                    hl.c3(new Runnable() { // from class: csa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b5;
                                            pj pjVar = pj.a;
                                            pj pjVar2 = pj.b;
                                            Runnable runnable32 = runnable3;
                                            oj ojVar32 = ojVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            wua wuaVar322 = wuaVar32;
                                            switch (b42) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar322.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var = wuaVar322.i3;
                                                    if (qt8Var != null) {
                                                        qt8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wuaVar322.j().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749980, wuaVar322.t1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = ojVar32.a == pjVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(ojVar32.e(pjVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(ojVar32.e(pjVar2).q());
                                                    wuaVar322.a2.setResellPrice(ojVar32);
                                                    qt8 qt8Var2 = wuaVar322.i3;
                                                    if (qt8Var2 != null) {
                                                        qt8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
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
