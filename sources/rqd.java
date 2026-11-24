// default package

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rqd {
    public static final ce6 j = new ce6("ConnectivityMonitor", null);
    public final oef a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final kqd b = new kqd(this);

    public rqd(Context context, oef oefVar) {
        this.a = oefVar;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            if (this.d == null || this.e == null) {
                return;
            }
            j.b("a new network is available", new Object[0]);
            if (this.d.containsKey(network)) {
                this.e.remove(network);
            }
            this.d.put(network, linkProperties);
            this.e.add(network);
            b();
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        synchronized (this.i) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (!this.a.a.isShutdown()) {
                    this.a.execute(new eqd((Object) this, (byte) 0));
                }
            }
        }
    }
}
