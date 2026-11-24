// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u89 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z99 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ u89(z99 z99Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = z99Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // i8c
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
        z99 z99Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                z99Var.getClass();
                String lowerCase = strArr[0].toLowerCase();
                String I3 = gl.I3(lowerCase);
                q99 q99Var = z99Var.d;
                boolean isEmpty = q99Var.l.isEmpty();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = q99Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) q99Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i2 = n99.b;
                        c4c K = c4c.K(n99.class);
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
                    arrayList2.add(g99.i(k96.M0(2131749992, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                z99Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I32 = gl.I3(lowerCase2);
                q99 q99Var2 = z99Var.d;
                boolean isEmpty2 = q99Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = q99Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z4 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (de9.t(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) ? " " : str2;
                    }
                    Integer num2 = (Integer) q99Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i4 = d99.b;
                    c4c K2 = c4c.K(d99.class);
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
                    arrayList3.add(g99.i(k96.M0(2131749999, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                z99Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I33 = gl.I3(lowerCase3);
                q99 q99Var3 = z99Var.d;
                boolean isEmpty3 = q99Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = arrayList.get(i5);
                    i5++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = q99Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z5 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(I33) || de9.t(str4, lowerCase3, stargiftattributemodel.name.toLowerCase())) {
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
                    Integer num3 = (Integer) q99Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                    ?? intValue3 = num3 == null ? z : num3.intValue();
                    int i6 = k99.b;
                    c4c K3 = c4c.K(k99.class);
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
                    arrayList4.add(g99.i(k96.M0(2131749994, null)));
                    break;
                }
                break;
        }
    }
}
