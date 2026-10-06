package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ g4 c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ w3(String[] strArr, g4 g4Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = g4Var;
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
        g4 g4Var = this.c;
        String[] strArr = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                v3 v3Var = g4Var.c;
                boolean isEmpty = v3Var.j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = v3Var.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || bi.u(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || bi.u(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) v3Var.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i12 = p3.a;
                        h61 K = h61.K(p3.class);
                        K.G = stargiftattributemodel;
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
                    arrayList2.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                v3 v3Var2 = g4Var.c;
                boolean isEmpty2 = v3Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v3Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (bi.u(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || bi.u(str2, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) ? " " : str2;
                    }
                    Integer num2 = (Integer) v3Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i14 = i3.a;
                    h61 K2 = h61.K(i3.class);
                    K2.G = stargiftattributebackdrop;
                    K2.l = lowerCase2;
                    K2.z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z11 = (isEmpty2 || contains2) ? false : true;
                    }
                    K2.L(z11);
                    arrayList3.add(K2);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                v3 v3Var3 = g4Var.c;
                boolean isEmpty3 = v3Var3.l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = v3Var3.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z12 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) || bi.u(str4, lowerCase3, stargiftattributepattern.name.toLowerCase()) || bi.u(str4, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str3 = str4;
                        Integer num3 = (Integer) v3Var3.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue3 = num3 == null ? 0 : num3.intValue();
                        int i16 = s3.a;
                        h61 K3 = h61.K(s3.class);
                        K3.G = stargiftattributepattern;
                        K3.l = lowerCase3;
                        K3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z12 = (isEmpty3 || contains3) ? false : true;
                        }
                        K3.L(z12);
                        arrayList4.add(K3);
                    } else {
                        str3 = str4;
                    }
                    str4 = str3;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(k3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    break;
                }
                break;
        }
    }
}
