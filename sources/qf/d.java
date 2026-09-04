package qf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d {
    public final Activity a;
    public final sf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public f0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public d(Activity activity, sf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final e a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) componentCallbacks2)).m0, this);
        }
        return null;
    }
}
