package rf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
