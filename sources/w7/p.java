package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class p {
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
