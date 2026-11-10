package t1;

import android.text.Editable;
import androidx.emoji2.text.u;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile a b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
