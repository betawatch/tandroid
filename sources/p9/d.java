package p9;

import android.content.Context;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import k9.i;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final v0 a;

    public d(Context context) {
        this.a = new v0(context, p7.d.a, com.google.android.gms.common.api.b.t, new i(4));
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
