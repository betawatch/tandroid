package q1;

import android.text.Editable;
import androidx.emoji2.text.t;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile a b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new t(charSequence, cls) : super.newEditable(charSequence);
    }
}
