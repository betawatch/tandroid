package rh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ k5(e6 e6Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = e6Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                int i10 = e6Var.a;
                e6Var.A = false;
                TLObject tLObject = this.c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    vp.r1(i10).V3(starsStatus.users, false);
                    vp.r1(i10).P3(starsStatus.chats, false);
                    e6Var.z.addAll(starsStatus.subscriptions);
                    e6Var.i0(starsStatus.balance);
                    zs.f(i10).k(zs.A3, new Object[0]);
                    break;
                }
                break;
            case 1:
                e6 e6Var2 = this.b;
                int i11 = e6Var2.a;
                e6Var2.x = false;
                TLObject tLObject2 = this.c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    vp.r1(i11).V3(starsStatus2.users, false);
                    vp.r1(i11).P3(starsStatus2.chats, false);
                    e6Var2.v.addAll(starsStatus2.subscriptions);
                    e6Var2.y = (starsStatus2.flags & 4) == 0;
                    e6Var2.w = starsStatus2.subscriptions_next_offset;
                    e6Var2.i0(starsStatus2.balance);
                    zs.f(i11).k(zs.A3, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.c;
                boolean z10 = tLObject3 instanceof Vector;
                final e6 e6Var3 = this.b;
                if (z10) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var3.i = true;
                }
                e6Var3.j = arrayList;
                e6Var3.h = false;
                zs.f(e6Var3.a).k(zs.v3, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i13 = 0;
                    Runnable runnable = new Runnable() { // from class: rh.n5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i14 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i14 >= arrayList5.size()) {
                                            org.telegram.messenger.u1 i15 = org.telegram.messenger.u1.i();
                                            final int i16 = 1;
                                            final e6 e6Var4 = e6Var3;
                                            i15.o(arrayList4, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i16) {
                                                        case 0:
                                                            final int i17 = 1;
                                                            final e6 e6Var5 = e6Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            int i18 = gVar.a;
                                                                            if (i18 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i18)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i19 = 0; i19 < list2.size(); i19++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i20 >= arrayList7.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var6 = e6Var5;
                                                                                if (e6Var6.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var6.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var6.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var6.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i24 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var7 = e6Var5;
                                                                                if (e6Var7.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var7.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var7.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var7.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var5;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i18 = 2;
                                                            final e6 e6Var6 = e6Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            int i182 = gVar.a;
                                                                            if (i182 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i182)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i19 = 0; i19 < list2.size(); i19++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList7;
                                                                                            if (i20 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var6;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var62.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i24 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var7 = e6Var6;
                                                                                if (e6Var7.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var7.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var7.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var7.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var6;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i19 = 0;
                                                            final e6 e6Var7 = e6Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i19) {
                                                                        case 0:
                                                                            int i182 = gVar.a;
                                                                            if (i182 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i182)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i192 = 0; i192 < list2.size(); i192++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i192);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList8;
                                                                                            if (i20 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var7;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var62.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.c = "inapp";
                                            aVar.b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i14)).store_product;
                                            arrayList4.add(aVar.a());
                                            i14++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i17 >= arrayList7.size()) {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final int i19 = 2;
                                            final e6 e6Var5 = e6Var3;
                                            i18.o(arrayList6, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i182 = gVar.a;
                                                                            if (i182 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i182)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i192 = 0; i192 < list2.size(); i192++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i192);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList62;
                                                                                            if (i20 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var52;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var62.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList62;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var6 = e6Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i192 = 0; i192 < list2.size(); i192++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i192);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i20 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var6;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var62.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var6;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList72;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var6;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList8;
                                                                                            if (i20 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i20)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var7;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i21 = 0; i21 < e6Var62.m.size(); i21++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i21);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i22 = gVar.a;
                                                                            if (i22 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i22)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i28 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i17)).store_product;
                                            arrayList6.add(aVar2.a());
                                            i17++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i20 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i20 >= arrayList9.size()) {
                                            org.telegram.messenger.u1 i21 = org.telegram.messenger.u1.i();
                                            final int i22 = 0;
                                            final e6 e6Var6 = e6Var3;
                                            i21.o(arrayList8, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i22) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var62 = e6Var52;
                                                                                if (e6Var62.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var62.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.m.get(i212);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var62.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i24 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i20)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i20++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().i.add(runnable);
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.c;
                boolean z11 = tLObject4 instanceof Vector;
                final e6 e6Var4 = this.b;
                if (z11) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList6.get(i14);
                        i14++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var4.l = true;
                }
                e6Var4.m = arrayList4;
                e6Var4.k = false;
                zs.f(e6Var4.a).k(zs.w3, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i15 = 1;
                    Runnable runnable2 = new Runnable() { // from class: rh.n5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i142 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i142 >= arrayList52.size()) {
                                            org.telegram.messenger.u1 i152 = org.telegram.messenger.u1.i();
                                            final int i16 = 1;
                                            final e6 e6Var42 = e6Var4;
                                            i152.o(arrayList42, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i16) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var52;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList62;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.c = "inapp";
                                            aVar.b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i142)).store_product;
                                            arrayList42.add(aVar.a());
                                            i142++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i17 >= arrayList7.size()) {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final int i19 = 2;
                                            final e6 e6Var5 = e6Var4;
                                            i18.o(arrayList62, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var52;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i17)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i17++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i20 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i20 >= arrayList9.size()) {
                                            org.telegram.messenger.u1 i21 = org.telegram.messenger.u1.i();
                                            final int i22 = 0;
                                            final e6 e6Var6 = e6Var4;
                                            i21.o(arrayList8, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i22) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var52;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a10.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i20)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i20++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().i.add(runnable2);
                        break;
                    } else {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.c;
                boolean z12 = tLObject5 instanceof Vector;
                final e6 e6Var5 = this.b;
                if (z12) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj3 = arrayList9.get(i16);
                        i16++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var5.o = true;
                }
                e6Var5.p = arrayList7;
                e6Var5.n = false;
                zs.f(e6Var5.a).k(zs.x3, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i17 = 2;
                    Runnable runnable3 = new Runnable() { // from class: rh.n5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i142 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i142 >= arrayList52.size()) {
                                            org.telegram.messenger.u1 i152 = org.telegram.messenger.u1.i();
                                            final int i162 = 1;
                                            final e6 e6Var42 = e6Var5;
                                            i152.o(arrayList42, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i162) {
                                                        case 0:
                                                            final int i172 = 1;
                                                            final e6 e6Var52 = e6Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var52;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var52;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var52;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar = new c5.a();
                                            aVar.c = "inapp";
                                            aVar.b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i142)).store_product;
                                            arrayList42.add(aVar.a());
                                            i142++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i172 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i172 >= arrayList72.size()) {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final int i19 = 2;
                                            final e6 e6Var52 = e6Var5;
                                            i18.o(arrayList62, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i19) {
                                                        case 0:
                                                            final int i1722 = 1;
                                                            final e6 e6Var522 = e6Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i1722) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i202 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var522;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var522;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var522;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i202 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList722;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList82;
                                                                                            if (i202 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i28 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.c = "inapp";
                                            aVar2.b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i172)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i172++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i20 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i20 >= arrayList92.size()) {
                                            org.telegram.messenger.u1 i21 = org.telegram.messenger.u1.i();
                                            final int i22 = 0;
                                            final e6 e6Var6 = e6Var5;
                                            i21.o(arrayList82, new org.telegram.messenger.t1() { // from class: rh.o4
                                                @Override // org.telegram.messenger.t1
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (i22) {
                                                        case 0:
                                                            final int i1722 = 1;
                                                            final e6 e6Var522 = e6Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i1722) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList622;
                                                                                            if (i202 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var522;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var522;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList622;
                                                                                            if (i28 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var522;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i182 = 2;
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i202 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var62;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i24 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var62;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList722;
                                                                                            if (i28 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var62;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i192 = 0;
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s4
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (i192) {
                                                                        case 0:
                                                                            int i1822 = gVar.a;
                                                                            if (i1822 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i1822)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1922 = 0; i1922 < list2.size(); i1922++) {
                                                                                        c5.m mVar = (c5.m) list2.get(i1922);
                                                                                        int i202 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList822;
                                                                                            if (i202 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i202)).store_product.equals(mVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i202);
                                                                                            } else {
                                                                                                i202++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var622 = e6Var7;
                                                                                if (e6Var622.m != null) {
                                                                                    for (int i212 = 0; i212 < e6Var622.m.size(); i212++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.m.get(i212);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var622.a).k(zs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i222 = gVar.a;
                                                                            if (i222 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i222)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i23 = 0; i23 < list3.size(); i23++) {
                                                                                        c5.m mVar2 = (c5.m) list3.get(i23);
                                                                                        int i24 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8222 = arrayList822;
                                                                                            if (i24 >= arrayList8222.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i24)).store_product.equals(mVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i24);
                                                                                            } else {
                                                                                                i24++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a10.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var72 = e6Var7;
                                                                                if (e6Var72.p != null) {
                                                                                    for (int i25 = 0; i25 < e6Var72.p.size(); i25++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.p.get(i25);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var72.a).k(zs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i26 = gVar.a;
                                                                            if (i26 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i26)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i27 = 0; i27 < list4.size(); i27++) {
                                                                                        c5.m mVar3 = (c5.m) list4.get(i27);
                                                                                        int i28 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList822;
                                                                                            if (i28 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i28)).store_product.equals(mVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i28);
                                                                                            } else {
                                                                                                i28++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a11.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                e6 e6Var8 = e6Var7;
                                                                                if (e6Var8.j != null) {
                                                                                    for (int i29 = 0; i29 < e6Var8.j.size(); i29++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.j.get(i29);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zs.f(e6Var8.a).k(zs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.c = "inapp";
                                            aVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i20)).store_product;
                                            arrayList82.add(aVar3.a());
                                            i20++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().i.add(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                vp.r1(this.b.a).L3((TLRPC.Updates) this.c, false);
                break;
        }
    }
}
