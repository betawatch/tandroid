package zg;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z4) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        if (z4) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        mq mqVar = (mq) sparseArray.get(i10);
        if (mqVar == null) {
            mqVar = new mq(i10, 0);
            mqVar.setColorKey(j6.il);
            sparseArray.put(i10, mqVar);
        }
        spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
        if (z4) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
