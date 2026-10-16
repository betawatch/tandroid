package rf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
