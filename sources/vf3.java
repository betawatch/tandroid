// default package

import android.text.SpannableStringBuilder;
import android.util.SparseArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class vf3 {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i, CharSequence charSequence, boolean z) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        wm2 wm2Var = (wm2) sparseArray.get(i);
        if (wm2Var == null) {
            wm2Var = new wm2(i, 0);
            wm2Var.a(aob.Zl);
            sparseArray.put(i, wm2Var);
        }
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
