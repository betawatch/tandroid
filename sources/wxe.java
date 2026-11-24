// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wxe {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            lvb.a(view, charSequence);
            return;
        }
        nvb nvbVar = nvb.w;
        if (nvbVar != null && nvbVar.a == view) {
            nvb.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new nvb(view, charSequence);
            return;
        }
        nvb nvbVar2 = nvb.x;
        if (nvbVar2 != null && nvbVar2.a == view) {
            nvbVar2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
