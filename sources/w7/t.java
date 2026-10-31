package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class t {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.m3.a(view, charSequence);
            return;
        }
        m.o3 o3Var = m.o3.w;
        if (o3Var != null && o3Var.a == view) {
            m.o3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.o3(view, charSequence);
            return;
        }
        m.o3 o3Var2 = m.o3.x;
        if (o3Var2 != null && o3Var2.a == view) {
            o3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
