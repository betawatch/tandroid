// default package

import android.text.Editable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
