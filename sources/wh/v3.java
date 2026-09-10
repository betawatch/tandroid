package wh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ f4 c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ v3(String[] strArr, f4 f4Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = f4Var;
        this.d = arrayList;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i10 = this.a;
        String str4 = " ";
        ArrayList arrayList = this.d;
        f4 f4Var = this.c;
        String[] strArr = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                u3 u3Var = f4Var.c;
                boolean isEmpty = u3Var.j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = u3Var.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.a2.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) u3Var.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i12 = n3.a;
                        v51 J = v51.J(n3.class);
                        J.G = stargiftattributemodel;
                        J.l = lowerCase;
                        J.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z10 = (isEmpty || contains) ? false : true;
                        }
                        J.K(z10);
                        arrayList2.add(J);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                u3 u3Var2 = f4Var.c;
                boolean isEmpty2 = u3Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = u3Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (org.telegram.messenger.a2.w(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || org.telegram.messenger.a2.w(str2, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) ? " " : str2;
                    }
                    Integer num2 = (Integer) u3Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i14 = g3.a;
                    v51 J2 = v51.J(g3.class);
                    J2.G = stargiftattributebackdrop;
                    J2.l = lowerCase2;
                    J2.z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z11 = (isEmpty2 || contains2) ? false : true;
                    }
                    J2.K(z11);
                    arrayList3.add(J2);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                u3 u3Var3 = f4Var.c;
                boolean isEmpty3 = u3Var3.l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = u3Var3.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z12 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) || org.telegram.messenger.a2.w(str4, lowerCase3, stargiftattributepattern.name.toLowerCase()) || org.telegram.messenger.a2.w(str4, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str3 = str4;
                        Integer num3 = (Integer) u3Var3.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue3 = num3 == null ? 0 : num3.intValue();
                        int i16 = q3.a;
                        v51 J3 = v51.J(q3.class);
                        J3.G = stargiftattributepattern;
                        J3.l = lowerCase3;
                        J3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z12 = (isEmpty3 || contains3) ? false : true;
                        }
                        J3.K(z12);
                        arrayList4.add(J3);
                    } else {
                        str3 = str4;
                    }
                    str4 = str3;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(i3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    break;
                }
                break;
        }
    }
}
