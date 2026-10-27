package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ u2(h4 h4Var, String[] strArr, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = h4Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        boolean z10;
        String str3;
        int i10 = this.a;
        boolean z11 = false;
        String str4 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        h4 h4Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                u3 u3Var = h4Var.d;
                boolean isEmpty = u3Var.l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = u3Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z12 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe) || wh.u(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || wh.u(" ", translitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) u3Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i12 = r3.a;
                        u61 K = u61.K(r3.class);
                        K.G = stargiftattributepattern;
                        K.l = lowerCase;
                        K.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z12 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z12);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                u3 u3Var2 = h4Var.d;
                boolean isEmpty2 = u3Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = u3Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z13 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (wh.u(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || wh.u(str2, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) ? " " : str2;
                    }
                    Integer num2 = (Integer) u3Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i14 = h3.a;
                    u61 K2 = u61.K(h3.class);
                    K2.G = stargiftattributebackdrop;
                    K2.l = lowerCase2;
                    K2.z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z13 = (isEmpty2 || contains2) ? false : true;
                    }
                    K2.L(z13);
                    arrayList3.add(K2);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                u3 u3Var3 = h4Var.d;
                boolean isEmpty3 = u3Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = u3Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe3) || wh.u(str4, lowerCase3, stargiftattributemodel.name.toLowerCase()) || wh.u(str4, translitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        z10 = z11;
                        str3 = str4;
                        Integer num3 = (Integer) u3Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        ?? intValue3 = num3 == null ? z10 : num3.intValue();
                        int i16 = o3.a;
                        u61 K3 = u61.K(o3.class);
                        K3.G = stargiftattributemodel;
                        K3.l = lowerCase3;
                        K3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z14 = (isEmpty3 || contains3) ? z10 : true;
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    } else {
                        z10 = z11;
                        str3 = str4;
                    }
                    z11 = z10;
                    str4 = str3;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(j3.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    break;
                }
                break;
        }
    }
}
