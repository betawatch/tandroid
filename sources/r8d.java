// default package

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r8d extends e1d {
    public static final ce6 d = new ce6("AppVisibilityProxy", null);
    public static final boolean e = true;
    public final Set b;
    public byte c;

    public r8d() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 4);
        this.b = DesugarCollections.synchronizedSet(new HashSet());
        this.c = e ? (byte) 1 : (byte) 0;
    }

    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            eq7 eq7Var = new eq7(this);
            parcel2.writeNoException();
            kid.d(parcel2, eq7Var);
            return true;
        }
        Set set = this.b;
        ce6 ce6Var = d;
        byte b = 0;
        if (i == 2) {
            Log.i(ce6Var.a, ce6Var.d("onAppEnteredForeground", new Object[0]));
            this.c = (byte) 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((qcd) it.next()).a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        Log.i(ce6Var.a, ce6Var.d("onAppEnteredBackground", new Object[0]));
        this.c = (byte) 2;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            tcd tcdVar = ((qcd) it2.next()).a;
            tcd.f.b("Stopping RouteDiscovery.", new Object[0]);
            tcdVar.c.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                xab xabVar = tcdVar.e;
                gw6 gw6Var = (gw6) xabVar.c;
                if (gw6Var == null) {
                    gw6Var = gw6.d((Context) xabVar.b);
                    xabVar.c = gw6Var;
                }
                gw6Var.h(tcdVar);
            } else {
                new q79(Looper.getMainLooper(), (byte) 3).post(new xbd(tcdVar, b));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
