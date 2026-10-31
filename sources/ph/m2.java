package ph;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ m2(r3 r3Var, String[] strArr, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        r3 r3Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                h3 h3Var = r3Var.d;
                boolean isEmpty = h3Var.l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = h3Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N3))) {
                        Integer num = (Integer) h3Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i12 = e3.b;
                        a51 K = a51.K(e3.class);
                        K.G = stargiftattributepattern;
                        K.l = lowerCase;
                        K.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z11 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z11);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(x2.i(cd.L0(2131750017, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                h3 h3Var2 = r3Var.d;
                boolean isEmpty2 = h3Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = h3Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                        Integer num2 = (Integer) h3Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        int i14 = v2.b;
                        a51 K2 = a51.K(v2.class);
                        K2.G = stargiftattributebackdrop;
                        K2.l = lowerCase2;
                        K2.z = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z12 = (isEmpty2 || contains2) ? false : true;
                        }
                        K2.L(z12);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(x2.i(cd.L0(2131750024, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                h3 h3Var3 = r3Var.d;
                boolean isEmpty3 = h3Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = h3Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N33))) {
                        Integer num3 = (Integer) h3Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        ?? intValue3 = num3 == null ? z13 : num3.intValue();
                        int i16 = b3.b;
                        a51 K3 = a51.K(b3.class);
                        K3.G = stargiftattributemodel;
                        K3.l = lowerCase3;
                        K3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z14 = (isEmpty3 || contains3) ? z13 : true;
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(x2.i(cd.L0(2131750019, null)));
                    break;
                }
                break;
        }
    }
}
