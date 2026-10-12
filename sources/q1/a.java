package q1;

import android.text.Editable;
import androidx.emoji2.text.u;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile a b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new u(charSequence, cls) : super.newEditable(charSequence);
    }
}
