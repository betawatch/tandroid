package q1;

import android.text.Editable;
import androidx.emoji2.text.u;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
