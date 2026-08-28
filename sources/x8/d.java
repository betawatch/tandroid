package x8;

import android.content.Context;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import s8.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final v0 a;

    public d(Context context) {
        this.a = new v0(context, z6.d.a, com.google.android.gms.common.api.b.g, new i(4));
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
