package sf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.j0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c {
    public final Activity a;
    public final uf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public j0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public c(Activity activity, uf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof tf.a) {
            return new d(((LaunchActivity) ((tf.a) componentCallbacks2)).m0, this);
        }
        return null;
    }
}
