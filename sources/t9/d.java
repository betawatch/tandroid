package t9;

import android.content.Context;
import b9.j0;
import java.lang.ref.WeakReference;
import o9.h;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final j0 a;

    public d(Context context) {
        this.a = new j0(context, s7.d.a, com.google.android.gms.common.api.b.j, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        synchronized (d.class) {
            WeakReference weakReference = b;
            d dVar = weakReference == null ? null : (d) weakReference.get();
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(launchActivity.getApplicationContext());
            b = new WeakReference(dVar2);
            return dVar2;
        }
    }

    public final void a(b bVar) {
        bVar.e.a = 2;
        this.a.e(1, new c(new b[]{bVar}));
    }
}
