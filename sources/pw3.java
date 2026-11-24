// default package

import android.text.Editable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pw3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile pw3 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new pka(cls, charSequence) : super.newEditable(charSequence);
    }
}
