package zh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ k60 c;

    public /* synthetic */ k2(m3 m3Var, k60 k60Var, int i7) {
        this.a = i7;
        this.b = m3Var;
        this.c = k60Var;
    }

    @Override // org.telegram.messenger.a20
    public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        switch (this.a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.id;
                c3 c3Var = this.b.d;
                HashSet hashSet = c3Var.j;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet.remove(Long.valueOf(j3));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = c3Var.f;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                        if (j10 != j3) {
                            hashSet.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j3));
                }
                c3Var.h();
                this.c.u();
                break;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                c3 c3Var2 = this.b.d;
                HashSet hashSet2 = c3Var2.k;
                if (hashSet2.contains(Integer.valueOf(i10))) {
                    hashSet2.remove(Integer.valueOf(i10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = c3Var2.g;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        int i12 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                        if (i12 != i10) {
                            hashSet2.add(Integer.valueOf(i12));
                        }
                    }
                } else {
                    hashSet2.add(Integer.valueOf(i10));
                }
                c3Var2.h();
                this.c.u();
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.id;
                c3 c3Var3 = this.b.d;
                HashSet hashSet3 = c3Var3.l;
                if (hashSet3.contains(Long.valueOf(j11))) {
                    hashSet3.remove(Long.valueOf(j11));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = c3Var3.h;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj5 = arrayList3.get(i13);
                        i13++;
                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                        if (j12 != j11) {
                            hashSet3.add(Long.valueOf(j12));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j11));
                }
                c3Var3.h();
                this.c.u();
                break;
        }
    }
}
