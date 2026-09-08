package yh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ u2(g4 g4Var, n70 n70Var, int i10) {
        this.a = i10;
        this.b = g4Var;
        this.c = n70Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        h51 h51Var = (h51) obj;
        g4 g4Var = this.b;
        g4Var.getClass();
        switch (i10) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) h51Var.G).document.id;
                t3 t3Var = g4Var.d;
                HashSet hashSet = t3Var.l;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet.remove(Long.valueOf(j3));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = t3Var.h;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        long j10 = ((TL_stars.starGiftAttributePattern) obj6).document.id;
                        if (j10 != j3) {
                            hashSet.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j3));
                }
                t3Var.h();
                this.c.u();
                break;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) h51Var.G).backdrop_id;
                t3 t3Var2 = g4Var.d;
                HashSet hashSet2 = t3Var2.k;
                if (hashSet2.contains(Integer.valueOf(i12))) {
                    hashSet2.remove(Integer.valueOf(i12));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = t3Var2.g;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj7 = arrayList2.get(i13);
                        i13++;
                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                        if (i14 != i12) {
                            hashSet2.add(Integer.valueOf(i14));
                        }
                    }
                } else {
                    hashSet2.add(Integer.valueOf(i12));
                }
                t3Var2.h();
                this.c.u();
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) h51Var.G).document.id;
                t3 t3Var3 = g4Var.d;
                HashSet hashSet3 = t3Var3.j;
                if (hashSet3.contains(Long.valueOf(j11))) {
                    hashSet3.remove(Long.valueOf(j11));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = t3Var3.f;
                    int size3 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        long j12 = ((TL_stars.starGiftAttributeModel) obj8).document.id;
                        if (j12 != j11) {
                            hashSet3.add(Long.valueOf(j12));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j11));
                }
                t3Var3.h();
                this.c.u();
                break;
        }
    }
}
