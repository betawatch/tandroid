package yh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ j80 c;

    public /* synthetic */ v3(e4 e4Var, j80 j80Var, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = j80Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        switch (this.a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) m61Var.G).document.id;
                s3 s3Var = this.b.c;
                HashSet hashSet = s3Var.j;
                HashSet hashSet2 = s3Var.j;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet2.remove(Long.valueOf(j10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = s3Var.f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.id;
                        if (j11 != j10) {
                            hashSet2.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet2.add(Long.valueOf(j10));
                }
                s3Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) m61Var.G).backdrop_id;
                s3 s3Var2 = this.b.c;
                HashSet hashSet3 = s3Var2.k;
                HashSet hashSet4 = s3Var2.k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = s3Var2.g;
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
                s3Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) m61Var.G).document.id;
                s3 s3Var3 = this.b.c;
                HashSet hashSet5 = s3Var3.l;
                HashSet hashSet6 = s3Var3.l;
                if (hashSet5.contains(Long.valueOf(j12))) {
                    hashSet6.remove(Long.valueOf(j12));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = s3Var3.h;
                    int size3 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj8 = arrayList3.get(i14);
                        i14++;
                        long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.id;
                        if (j13 != j12) {
                            hashSet6.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet6.add(Long.valueOf(j12));
                }
                s3Var3.h();
                this.c.u();
                break;
        }
    }
}
