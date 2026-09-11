package p9;

import android.content.Context;
import com.google.android.gms.internal.clearcut.u0;
import java.lang.ref.WeakReference;
import k9.i;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d {
    public static WeakReference b;
    public final u0 a;

    public d(Context context) {
        this.a = new u0(context, p7.d.a, com.google.android.gms.common.api.b.t, new i(4));
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
