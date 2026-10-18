package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class q {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.p3.a(view, charSequence);
            return;
        }
        m.r3 r3Var = m.r3.v;
        if (r3Var != null && r3Var.a == view) {
            m.r3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.r3(view, charSequence);
            return;
        }
        m.r3 r3Var2 = m.r3.w;
        if (r3Var2 != null && r3Var2.a == view) {
            r3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
