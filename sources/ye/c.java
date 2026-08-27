package ye;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import h3.k0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public final Activity a;
    public final af.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public k0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public c(Activity activity, af.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof ze.a) {
            return new d(((LaunchActivity) ((ze.a) componentCallbacks2)).i0, this);
        }
        return null;
    }
}
