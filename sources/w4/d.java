package w4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.cu;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d {
    public static final cu c = new cu(24);
    public final v4.b a;
    public final int b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z4, int i12, int i13) {
        this.a = new v4.b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z4, z4 ? i12 : -16777216, TLObject.FLAG_31, 0.0f);
        this.b = i13;
    }
}
