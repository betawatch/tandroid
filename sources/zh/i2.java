package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ i2(m3 m3Var, String[] strArr, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = m3Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        boolean z9 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        m3 m3Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                d3 d3Var = m3Var.d;
                boolean isEmpty = d3Var.l.isEmpty();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = d3Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) d3Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i11 = a3.b;
                        x31 K = x31.K(a3.class);
                        K.G = stargiftattributepattern;
                        K.l = lowerCase;
                        K.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z10 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z10);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(t2.i(hd.M0(2131750007, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                d3 d3Var2 = m3Var.d;
                boolean isEmpty2 = d3Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = d3Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) d3Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        int i13 = r2.b;
                        x31 K2 = x31.K(r2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.l = lowerCase2;
                        K2.z = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z11 = (isEmpty2 || contains2) ? false : true;
                        }
                        K2.L(z11);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(t2.i(hd.M0(2131750014, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                d3 d3Var3 = m3Var.d;
                boolean isEmpty3 = d3Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z12 = z9;
                    boolean contains3 = d3Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z13 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) d3Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        ?? intValue3 = num3 == null ? z12 : num3.intValue();
                        int i15 = x2.b;
                        x31 K3 = x31.K(x2.class);
                        K3.G = stargiftattributemodel;
                        K3.l = lowerCase3;
                        K3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z13 = (isEmpty3 || contains3) ? z12 : true;
                        }
                        K3.L(z13);
                        arrayList4.add(K3);
                    }
                    z9 = z12;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(t2.i(hd.M0(2131750009, null)));
                    break;
                }
                break;
        }
    }
}
