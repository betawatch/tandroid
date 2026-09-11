package qf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
