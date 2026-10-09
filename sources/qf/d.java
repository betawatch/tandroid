package qf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
