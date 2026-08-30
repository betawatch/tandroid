package vh;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ o2(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z4;
        int i10;
        c2 c2Var;
        Utilities.Callback callback;
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = r3Var.i3;
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    Object obj4 = ((i51) obj3).G;
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
                            if (r3.x3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int P3 = r3Var.P3(indexOf);
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
                                c2 c2Var2 = r3Var.G3;
                                if (c2Var2 != null) {
                                    c2Var2.d();
                                }
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    arrayList2.set(i12 + i19, (a) arrayList5.get(i19));
                                }
                                a aVar2 = r3Var.P3;
                                ArrayList arrayList6 = r3.p4;
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
                                            z4 = true;
                                            boolean x22 = r3Var.x2();
                                            i10 = 0;
                                            while (i10 < arrayList2.size()) {
                                                a aVar3 = (a) arrayList2.get(i10);
                                                if (!aVar3.i && !r3.x3(aVar3)) {
                                                    a aVar4 = i10 > 0 ? (a) arrayList2.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (r3.E3(aVar3.b)) {
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
                                            r3Var.s4();
                                            r3Var.a2();
                                            if (!z4 || x22) {
                                                r3Var.V2.N(true);
                                                r3Var.x4();
                                            } else {
                                                r3Var.x4();
                                            }
                                            c2Var = r3Var.G3;
                                            if (c2Var == null) {
                                                c2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z4 = false;
                                boolean x222 = r3Var.x2();
                                i10 = 0;
                                while (i10 < arrayList2.size()) {
                                }
                                r3Var.s4();
                                r3Var.a2();
                                if (z4) {
                                }
                                r3Var.V2.N(true);
                                r3Var.x4();
                                c2Var = r3Var.G3;
                                if (c2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                ph.d3 d3Var = (ph.d3) this.b;
                if (obj != null) {
                    if (d3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = d3Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    d3Var.getClass();
                    break;
                }
                break;
        }
    }
}
