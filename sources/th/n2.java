package th;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ n2(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        b2 b2Var;
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = p3Var.h3;
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    Object obj4 = ((w41) obj3).G;
                    if (obj4 instanceof a) {
                        arrayList3.add((a) obj4);
                    }
                }
                if (arrayList3.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList3.get(i15);
                        i15++;
                        a aVar = (a) obj5;
                        int indexOf = arrayList2.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i16 = indexOf + 1;
                            if (p3.x3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int P3 = p3Var.P3(indexOf);
                                i16 = P3 >= arrayList2.size() ? arrayList2.size() : P3 + 1;
                            }
                            arrayList4.add(new ArrayList(arrayList2.subList(indexOf, i16)));
                            i12 = Math.min(i12, indexOf);
                            i13 = Math.max(i13, i16);
                            i14 += i16 - indexOf;
                        }
                    }
                    if (i14 == i13 - i12) {
                        ArrayList arrayList5 = new ArrayList(i14);
                        int size3 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj6 = arrayList4.get(i17);
                            i17++;
                            arrayList5.addAll((ArrayList) obj6);
                        }
                        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                            if (arrayList2.get(i12 + i18) != arrayList5.get(i18)) {
                                b2 b2Var2 = p3Var.F3;
                                if (b2Var2 != null) {
                                    b2Var2.d();
                                }
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    arrayList2.set(i12 + i19, (a) arrayList5.get(i19));
                                }
                                a aVar2 = p3Var.O3;
                                ArrayList arrayList6 = p3.o4;
                                if (aVar2 != null) {
                                    ArrayList arrayList7 = aVar2.k;
                                    int indexOf2 = arrayList2.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList8 = indexOf2 > 0 ? ((a) arrayList2.get(indexOf2 - 1)).k : arrayList6;
                                        int i20 = indexOf2 + 1;
                                        if (i20 < arrayList2.size()) {
                                            arrayList6 = ((a) arrayList2.get(i20)).k;
                                        }
                                        if (arrayList8.size() < arrayList6.size()) {
                                            arrayList8 = arrayList6;
                                        }
                                        if (!arrayList7.equals(arrayList8)) {
                                            arrayList7.clear();
                                            arrayList7.addAll(arrayList8);
                                            z10 = true;
                                            boolean x22 = p3Var.x2();
                                            i10 = 0;
                                            while (i10 < arrayList2.size()) {
                                                a aVar3 = (a) arrayList2.get(i10);
                                                if (!aVar3.i && !p3.x3(aVar3)) {
                                                    a aVar4 = i10 > 0 ? (a) arrayList2.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (p3.E3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i21 = max + 1;
                                                        if (aVar3.c > i21) {
                                                            aVar3.c = i21;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i10++;
                                            }
                                            p3Var.s4();
                                            p3Var.a2();
                                            if (!z10 || x22) {
                                                p3Var.U2.N(true);
                                                p3Var.x4();
                                            } else {
                                                p3Var.x4();
                                            }
                                            b2Var = p3Var.F3;
                                            if (b2Var == null) {
                                                b2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                boolean x222 = p3Var.x2();
                                i10 = 0;
                                while (i10 < arrayList2.size()) {
                                }
                                p3Var.s4();
                                p3Var.a2();
                                if (z10) {
                                }
                                p3Var.U2.N(true);
                                p3Var.x4();
                                b2Var = p3Var.F3;
                                if (b2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                nh.t5 t5Var = (nh.t5) this.b;
                t5Var.d0(t5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
