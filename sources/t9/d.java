package t9;

import android.content.Context;
import b9.k0;
import java.lang.ref.WeakReference;
import o9.h;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final k0 a;

    public d(Context context) {
        this.a = new k0(context, s7.d.a, com.google.android.gms.common.api.b.j, new h(4));
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
