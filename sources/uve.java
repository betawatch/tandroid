// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class uve {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ktb.a(view, charSequence);
            return;
        }
        mtb mtbVar = mtb.w;
        if (mtbVar != null && mtbVar.a == view) {
            mtb.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new mtb(view, charSequence);
            return;
        }
        mtb mtbVar2 = mtb.x;
        if (mtbVar2 != null && mtbVar2.a == view) {
            mtbVar2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
