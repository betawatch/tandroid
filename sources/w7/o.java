package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.m3.a(view, charSequence);
            return;
        }
        m.o3 o3Var = m.o3.v;
        if (o3Var != null && o3Var.a == view) {
            m.o3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.o3(view, charSequence);
            return;
        }
        m.o3 o3Var2 = m.o3.w;
        if (o3Var2 != null && o3Var2.a == view) {
            o3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
