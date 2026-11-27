// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ova implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxa b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ova(jxa jxaVar, TLObject tLObject, byte b) {
        this.a = b;
        this.b = jxaVar;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        char c = 1;
        TLObject tLObject = this.c;
        final jxa jxaVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList3.get(i);
                        i++;
                        if (obj instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj;
                            arrayList.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !f11.b()) {
                                arrayList2.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.o = true;
                }
                jxaVar.p = arrayList;
                jxaVar.n = false;
                jn7.f(jxaVar.a).k(jn7.z3, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() { // from class: rva
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final ArrayList arrayList4 = arrayList2;
                            final jxa jxaVar2 = jxaVar;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    ArrayList arrayList5 = new ArrayList();
                                    for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                                        we3 we3Var = new we3();
                                        we3Var.b = "inapp";
                                        we3Var.a = ((TL_stars.TL_starsGiveawayOption) arrayList4.get(i2)).store_product;
                                        arrayList5.add(we3Var.a());
                                    }
                                    di0.h().o(arrayList5, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b5 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList6 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b6 = b5;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7 = arrayList6;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar4 = jxaVar3;
                                                            switch (b6) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList7.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar4.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar4.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar4.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar4.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList7.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar4.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar4.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar4.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar4.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList7.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList7.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar4.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar4.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar4.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar4.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b6 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b6;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    while (b4 < arrayList4.size()) {
                                        we3 we3Var2 = new we3();
                                        we3Var2.b = "inapp";
                                        we3Var2.a = ((TL_stars.TL_starsTopupOption) arrayList4.get(b4)).store_product;
                                        arrayList6.add(we3Var2.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    di0.h().o(arrayList6, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b6 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b6;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i3 = gi0Var2.a;
                                                                    if (i3 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i3)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                        we3 we3Var3 = new we3();
                                        we3Var3.b = "inapp";
                                        we3Var3.a = ((TL_stars.TL_starsGiftOption) arrayList4.get(i3)).store_product;
                                        arrayList7.add(we3Var3.a());
                                    }
                                    final byte b6 = 2;
                                    di0.h().o(arrayList7, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b62 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b62) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList72.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                                                                                    tL_starsTopupOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable);
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                int i2 = jxaVar.a;
                jxaVar.x = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    uc7.s1(i2).j4(starsStatus.users, false);
                    uc7.s1(i2).c4(starsStatus.chats, false);
                    jxaVar.v.addAll(starsStatus.subscriptions);
                    jxaVar.y = (starsStatus.flags & 4) == 0;
                    jxaVar.w = starsStatus.subscriptions_next_offset;
                    jxaVar.j0(starsStatus.balance);
                    jn7.f(i2).k(jn7.C3, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList6.get(i3);
                        i3++;
                        if (obj2 instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                            arrayList4.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !f11.b()) {
                                arrayList5.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.i = true;
                }
                jxaVar.j = arrayList4;
                jxaVar.h = false;
                jn7.f(jxaVar.a).k(jn7.x3, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final char c2 = c == true ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: rva
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = c2;
                            final ArrayList arrayList42 = arrayList5;
                            final jxa jxaVar2 = jxaVar;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                        we3 we3Var = new we3();
                                        we3Var.b = "inapp";
                                        we3Var.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i22)).store_product;
                                        arrayList52.add(we3Var.a());
                                    }
                                    di0.h().o(arrayList52, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList62 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList62;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    while (b4 < arrayList42.size()) {
                                        we3 we3Var2 = new we3();
                                        we3Var2.b = "inapp";
                                        we3Var2.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(b4)).store_product;
                                        arrayList62.add(we3Var2.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    di0.h().o(arrayList62, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i32 = gi0Var2.a;
                                                                    if (i32 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i32)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i32 = 0; i32 < arrayList42.size(); i32++) {
                                        we3 we3Var3 = new we3();
                                        we3Var3.b = "inapp";
                                        we3Var3.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i32)).store_product;
                                        arrayList7.add(we3Var3.a());
                                    }
                                    final byte b6 = 2;
                                    di0.h().o(arrayList7, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i4);
                                                                                int i5 = 0;
                                                                                while (true) {
                                                                                    if (i5 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i5)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i5);
                                                                                    } else {
                                                                                        i5++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable2);
                        break;
                    } else {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 3:
                int i4 = jxaVar.a;
                jxaVar.A = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject;
                    uc7.s1(i4).j4(starsStatus2.users, false);
                    uc7.s1(i4).c4(starsStatus2.chats, false);
                    jxaVar.z.addAll(starsStatus2.subscriptions);
                    jxaVar.j0(starsStatus2.balance);
                    jn7.f(i4).k(jn7.C3, new Object[0]);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject).objects;
                    int size3 = arrayList9.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList9.get(i5);
                        i5++;
                        if (obj3 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                            arrayList7.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !f11.b()) {
                                arrayList8.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jxaVar.l = true;
                }
                jxaVar.m = arrayList7;
                jxaVar.k = false;
                jn7.f(jxaVar.a).k(jn7.y3, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final byte b3 = 2;
                    Runnable runnable3 = new Runnable() { // from class: rva
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            final ArrayList arrayList42 = arrayList8;
                            final jxa jxaVar2 = jxaVar;
                            final byte b4 = 0;
                            switch (b32) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    for (int i22 = 0; i22 < arrayList42.size(); i22++) {
                                        we3 we3Var = new we3();
                                        we3Var.b = "inapp";
                                        we3Var.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i22)).store_product;
                                        arrayList52.add(we3Var.a());
                                    }
                                    di0.h().o(arrayList52, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    while (b4 < arrayList42.size()) {
                                        we3 we3Var2 = new we3();
                                        we3Var2.b = "inapp";
                                        we3Var2.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(b4)).store_product;
                                        arrayList62.add(we3Var2.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    di0.h().o(arrayList62, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList72 = new ArrayList();
                                    for (int i32 = 0; i32 < arrayList42.size(); i32++) {
                                        we3 we3Var3 = new we3();
                                        we3Var3.b = "inapp";
                                        we3Var3.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i32)).store_product;
                                        arrayList72.add(we3Var3.a());
                                    }
                                    final byte b6 = 2;
                                    di0.h().o(arrayList72, new ci0() { // from class: bwa
                                        @Override // ci0
                                        public final void c(final gi0 gi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b52 = 1;
                                                    final jxa jxaVar3 = jxaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b52;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar3;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b62 = 2;
                                                    final jxa jxaVar4 = jxaVar2;
                                                    final ArrayList arrayList722 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList722;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar4;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b7 = 0;
                                                    final jxa jxaVar5 = jxaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    hl.c3(new Runnable() { // from class: tva
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            to8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            to8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            to8 a3;
                                                            byte b622 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList82;
                                                            List list2 = list;
                                                            gi0 gi0Var2 = gi0Var;
                                                            jxa jxaVar42 = jxaVar5;
                                                            switch (b622) {
                                                                case 0:
                                                                    int i322 = gi0Var2.a;
                                                                    if (i322 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i322)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i42 = 0; i42 < list2.size(); i42++) {
                                                                                wo8 wo8Var = (wo8) list2.get(i42);
                                                                                int i52 = 0;
                                                                                while (true) {
                                                                                    if (i52 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i52)).store_product.equals(wo8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i52);
                                                                                    } else {
                                                                                        i52++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = wo8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.m != null) {
                                                                            for (int i6 = 0; i6 < jxaVar42.m.size(); i6++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jxaVar42.m.get(i6);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i7 = gi0Var2.a;
                                                                    if (i7 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i7)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                wo8 wo8Var2 = (wo8) list2.get(i8);
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i9)).store_product.equals(wo8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i9);
                                                                                    } else {
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = wo8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jxaVar42.p != null) {
                                                                            for (int i10 = 0; i10 < jxaVar42.p.size(); i10++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) jxaVar42.p.get(i10);
                                                                                if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i11 = gi0Var2.a;
                                                                    if (i11 != 0) {
                                                                        jxa.c("BILLING_".concat(di0.i(i11)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i12 = 0;
                                                                            while (i12 < list2.size()) {
                                                                                wo8 wo8Var3 = (wo8) list2.get(i12);
                                                                                int i13 = 0;
                                                                                while (true) {
                                                                                    if (i13 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i13)).store_product.equals(wo8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i13);
                                                                                    } else {
                                                                                        i13++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = wo8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i12++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jxaVar42.j != null) {
                                                                            for (int i14 = 0; i14 < jxaVar42.j.size(); i14++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption22 = (TL_stars.TL_starsTopupOption) jxaVar42.j.get(i14);
                                                                                if (tL_starsTopupOption22 != null && tL_starsTopupOption22.loadingStorePrice) {
                                                                                    tL_starsTopupOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        jn7.f(jxaVar42.a).k(jn7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!di0.h().j()) {
                        di0.h().i.add(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                uc7.s1(jxaVar.a).Y3((TLRPC.Updates) tLObject, false);
                break;
        }
    }
}
