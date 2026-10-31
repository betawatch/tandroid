package ph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements o20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ z60 c;

    public /* synthetic */ n2(r3 r3Var, z60 z60Var, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = z60Var;
    }

    @Override // org.telegram.messenger.o20
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a51 a51Var = (a51) obj;
        switch (this.a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                h3 h3Var = this.b.d;
                HashSet hashSet = h3Var.l;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet.remove(Long.valueOf(j10));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = h3Var.h;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        long j11 = ((TL_stars.starGiftAttributePattern) obj3).document.id;
                        if (j11 != j10) {
                            hashSet.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j10));
                }
                h3Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                h3 h3Var2 = this.b.d;
                HashSet hashSet2 = h3Var2.k;
                if (hashSet2.contains(Integer.valueOf(i11))) {
                    hashSet2.remove(Integer.valueOf(i11));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = h3Var2.g;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        int i13 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                        if (i13 != i11) {
                            hashSet2.add(Integer.valueOf(i13));
                        }
                    }
                } else {
                    hashSet2.add(Integer.valueOf(i11));
                }
                h3Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                h3 h3Var3 = this.b.d;
                HashSet hashSet3 = h3Var3.j;
                if (hashSet3.contains(Long.valueOf(j12))) {
                    hashSet3.remove(Long.valueOf(j12));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = h3Var3.f;
                    int size3 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj5 = arrayList3.get(i14);
                        i14++;
                        long j13 = ((TL_stars.starGiftAttributeModel) obj5).document.id;
                        if (j13 != j12) {
                            hashSet3.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j12));
                }
                h3Var3.h();
                this.c.u();
                break;
        }
    }
}
