// default package

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wpd {
    public static Object a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return s4.g(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
