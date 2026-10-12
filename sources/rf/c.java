package rf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c {
    public final Activity a;
    public final tf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public h0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public c(Activity activity, tf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) componentCallbacks2)).m0, this);
        }
        return null;
    }
}
