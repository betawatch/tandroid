package uf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import k2.i0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final Activity a;
    public final wf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public i0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public c(Activity activity, wf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof vf.a) {
            return new d(((LaunchActivity) ((vf.a) componentCallbacks2)).n0, this);
        }
        return null;
    }
}
