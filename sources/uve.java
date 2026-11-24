// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
