// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wa9 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb9 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ wa9(zb9 zb9Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = zb9Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // jac
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        boolean z;
        String str3;
        byte b = this.a;
        boolean z2 = false;
        String str4 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                zb9Var.getClass();
                String lowerCase = strArr[0].toLowerCase();
                String I3 = gm.I3(lowerCase);
                qb9 qb9Var = zb9Var.d;
                boolean isEmpty = qb9Var.l.isEmpty();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = qb9Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) qb9Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i2 = nb9.b;
                        c6c K = c6c.K(nb9.class);
                        K.H = stargiftattributepattern;
                        K.m = lowerCase;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z3 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z3);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(gb9.i(jb6.M0(2131749941, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                zb9Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I32 = gm.I3(lowerCase2);
                qb9 qb9Var2 = zb9Var.d;
                boolean isEmpty2 = qb9Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = qb9Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z4 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) ? " " : str2;
                    }
                    Integer num2 = (Integer) qb9Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i4 = db9.b;
                    c6c K2 = c6c.K(db9.class);
                    K2.H = stargiftattributebackdrop;
                    K2.m = lowerCase2;
                    K2.A = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z4 = (isEmpty2 || contains2) ? false : true;
                    }
                    K2.L(z4);
                    arrayList3.add(K2);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(gb9.i(jb6.M0(2131749948, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                zb9Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I33 = gm.I3(lowerCase3);
                qb9 qb9Var3 = zb9Var.d;
                boolean isEmpty3 = qb9Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = arrayList.get(i5);
                    i5++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = qb9Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z5 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(I33) || hg9.s(str4, lowerCase3, stargiftattributemodel.name.toLowerCase())) {
                        z = z2;
                    } else {
                        z = z2;
                        if (!stargiftattributemodel.name.toLowerCase().contains(str4.concat(I33))) {
                            str3 = str4;
                            z2 = z;
                            str4 = str3;
                        }
                    }
                    str3 = str4;
                    Integer num3 = (Integer) qb9Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                    ?? intValue3 = num3 == null ? z : num3.intValue();
                    int i6 = kb9.b;
                    c6c K3 = c6c.K(kb9.class);
                    K3.H = stargiftattributemodel;
                    K3.m = lowerCase3;
                    K3.A = intValue3;
                    if (!TextUtils.isEmpty(lowerCase3)) {
                        z5 = (isEmpty3 || contains3) ? z : true;
                    }
                    K3.L(z5);
                    arrayList4.add(K3);
                    z2 = z;
                    str4 = str3;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(gb9.i(jb6.M0(2131749943, null)));
                    break;
                }
                break;
        }
    }
}
