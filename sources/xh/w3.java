package xh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ w3(f4 f4Var, n70 n70Var, int i10) {
        this.a = i10;
        this.b = f4Var;
        this.c = n70Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        switch (this.a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) j51Var.G).document.id;
                u3 u3Var = this.b.c;
                HashSet hashSet = u3Var.j;
                HashSet hashSet2 = u3Var.j;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet2.remove(Long.valueOf(j3));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = u3Var.f;
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
                u3Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) j51Var.G).backdrop_id;
                u3 u3Var2 = this.b.c;
                HashSet hashSet3 = u3Var2.k;
                HashSet hashSet4 = u3Var2.k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = u3Var2.g;
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
                u3Var2.h();
                this.c.u();
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) j51Var.G).document.id;
                u3 u3Var3 = this.b.c;
                HashSet hashSet5 = u3Var3.l;
                HashSet hashSet6 = u3Var3.l;
                if (hashSet5.contains(Long.valueOf(j11))) {
                    hashSet6.remove(Long.valueOf(j11));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = u3Var3.h;
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
                u3Var3.h();
                this.c.u();
                break;
        }
    }
}
