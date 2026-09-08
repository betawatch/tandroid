package yh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ v3(e4 e4Var, n70 n70Var, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = n70Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        switch (this.a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) h51Var.G).document.id;
                t3 t3Var = this.b.c;
                HashSet hashSet = t3Var.j;
                HashSet hashSet2 = t3Var.j;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet2.remove(Long.valueOf(j3));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = t3Var.f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        long j10 = ((TL_stars.starGiftAttributeModel) obj6).document.id;
                        if (j10 != j3) {
                            hashSet2.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    hashSet2.add(Long.valueOf(j3));
                }
                t3Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) h51Var.G).backdrop_id;
                t3 t3Var2 = this.b.c;
                HashSet hashSet3 = t3Var2.k;
                HashSet hashSet4 = t3Var2.k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = t3Var2.g;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj7 = arrayList2.get(i12);
                        i12++;
                        int i13 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                        if (i13 != i11) {
                            hashSet4.add(Integer.valueOf(i13));
                        }
                    }
                } else {
                    hashSet4.add(Integer.valueOf(i11));
                }
                t3Var2.h();
                this.c.u();
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) h51Var.G).document.id;
                t3 t3Var3 = this.b.c;
                HashSet hashSet5 = t3Var3.l;
                HashSet hashSet6 = t3Var3.l;
                if (hashSet5.contains(Long.valueOf(j11))) {
                    hashSet6.remove(Long.valueOf(j11));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = t3Var3.h;
                    int size3 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj8 = arrayList3.get(i14);
                        i14++;
                        long j12 = ((TL_stars.starGiftAttributePattern) obj8).document.id;
                        if (j12 != j11) {
                            hashSet6.add(Long.valueOf(j12));
                        }
                    }
                } else {
                    hashSet6.add(Long.valueOf(j11));
                }
                t3Var3.h();
                this.c.u();
                break;
        }
    }
}
