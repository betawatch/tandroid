package xe;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import h3.k0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final Activity a;
    public final ze.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public k0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public c(Activity activity, ze.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof ye.a) {
            return new d(((LaunchActivity) ((ye.a) componentCallbacks2)).i0, this);
        }
        return null;
    }
}
