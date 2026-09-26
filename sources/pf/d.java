package pf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class d {
    public final Activity a;
    public final rf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public f0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public d(Activity activity, rf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final e a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) componentCallbacks2)).m0, this);
        }
        return null;
    }
}
