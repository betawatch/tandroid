package yh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ i80 c;

    public /* synthetic */ t2(g4 g4Var, i80 i80Var, int i10) {
        this.a = i10;
        this.b = g4Var;
        this.c = i80Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.a;
        f61 f61Var = (f61) obj;
        g4 g4Var = this.b;
        g4Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) f61Var.G).document.id;
                s3 s3Var = g4Var.d;
                HashSet hashSet = s3Var.l;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet.remove(Long.valueOf(j10));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = s3Var.h;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.id;
                        if (j11 != j10) {
                            hashSet.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j10));
                }
                s3Var.h();
                this.c.u();
                break;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) f61Var.G).backdrop_id;
                s3 s3Var2 = g4Var.d;
                HashSet hashSet2 = s3Var2.k;
                if (hashSet2.contains(Integer.valueOf(i12))) {
                    hashSet2.remove(Integer.valueOf(i12));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = s3Var2.g;
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
                s3Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) f61Var.G).document.id;
                s3 s3Var3 = g4Var.d;
                HashSet hashSet3 = s3Var3.j;
                if (hashSet3.contains(Long.valueOf(j12))) {
                    hashSet3.remove(Long.valueOf(j12));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = s3Var3.f;
                    int size3 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.id;
                        if (j13 != j12) {
                            hashSet3.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j12));
                }
                s3Var3.h();
                this.c.u();
                break;
        }
    }
}
