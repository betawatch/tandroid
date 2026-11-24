// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tr0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public tr0(Context context, int i, long j) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i;
        this.c = j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i, 0);
        this.d = sharedPreferences.getBoolean(j + "_requested", false);
        boolean z = sharedPreferences.getBoolean(j + "_granted", false);
        this.e = z;
        if (!z || a()) {
            return;
        }
        this.e = false;
        this.d = false;
        j();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void b() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botlocation_" + i, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static tr0 d(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap hashMap = g;
        tr0 tr0Var = (tr0) hashMap.get(pair);
        if (tr0Var != null) {
            return tr0Var;
        }
        tr0 tr0Var2 = new tr0(context, i, j);
        hashMap.put(pair, tr0Var2);
        return tr0Var2;
    }

    public static JSONObject g(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", location != null);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e) {
            fc4.g(e, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity e = e();
        if (e != null) {
            return e.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || e.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    public final boolean c() {
        return e() != null && e().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public final Activity e() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = gm.W(this.a);
        }
        return activity == null ? gm.W(a.b) : activity;
    }

    public final boolean f() {
        return a() && this.e;
    }

    public final void h(final yu0 yu0Var) {
        Activity e;
        Activity e2 = e();
        if (e2 == null) {
            return;
        }
        if (!c()) {
            Boolean bool = Boolean.FALSE;
            yu0Var.a(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            yu0Var.a(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final byte b = 1;
        final boolean[] zArr = new boolean[1];
        int i = this.b;
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.c));
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e2);
        SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131753013, m9c.r(W1), m9c.r(W1)));
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        sr0 sr0Var = new sr0(this.a, z8c.h(i).f(), W1);
        int i2 = cmb.K5;
        int w0 = cmb.w0(null, i2, false);
        heVar.c0 = sr0Var;
        heVar.d0 = w0;
        heVar.e0 = -1;
        alertDialog$Builder.m(i2, null);
        if (a() || (e = e()) == null || (e.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && e.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            alertDialog$Builder.j(jb6.M0(2131753015, null), new ee(this) { // from class: qr0
                public final /* synthetic */ tr0 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i3) {
                    byte b3 = b2;
                    yu0 yu0Var2 = yu0Var;
                    boolean[] zArr2 = zArr;
                    tr0 tr0Var = this.b;
                    tr0Var.getClass();
                    switch (b3) {
                        case 0:
                            zArr2[0] = true;
                            if (!tr0Var.a()) {
                                use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, yu0Var2, (byte) 5));
                                break;
                            } else {
                                tr0Var.d = true;
                                tr0Var.e = true;
                                tr0Var.j();
                                Iterator it = tr0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                yu0Var2.a(bool2, bool2);
                                break;
                            }
                        default:
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                tr0Var.d = true;
                                tr0Var.e = false;
                                tr0Var.j();
                                Iterator it2 = tr0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                yu0Var2.a(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.j(jb6.M0(2131753009, null), new jf((Object) e2, (Object) zArr, (Object) yu0Var, (byte) 5));
        }
        alertDialog$Builder.g(jb6.M0(2131753014, null), new ee(this) { // from class: qr0
            public final /* synthetic */ tr0 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i3) {
                byte b3 = b;
                yu0 yu0Var2 = yu0Var;
                boolean[] zArr2 = zArr;
                tr0 tr0Var = this.b;
                tr0Var.getClass();
                switch (b3) {
                    case 0:
                        zArr2[0] = true;
                        if (!tr0Var.a()) {
                            use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, yu0Var2, (byte) 5));
                            break;
                        } else {
                            tr0Var.d = true;
                            tr0Var.e = true;
                            tr0Var.j();
                            Iterator it = tr0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            yu0Var2.a(bool2, bool2);
                            break;
                        }
                    default:
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            tr0Var.d = true;
                            tr0Var.e = false;
                            tr0Var.j();
                            Iterator it2 = tr0Var.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            yu0Var2.a(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.i(new ah(this, zArr, yu0Var, (byte) 3));
        alertDialog$Builder.o();
    }

    public final void i(qac qacVar) {
        JSONObject jSONObject = new JSONObject();
        if (!this.e || !a() || !c()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            qacVar.a(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                break;
            }
        }
        if (location != null) {
            qacVar.a(g(location));
            return;
        }
        if (locationManager.isProviderEnabled("gps")) {
            try {
                rr0 rr0Var = new rr0(this, locationManager, new LocationListener[]{rr0Var}, qacVar);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, rr0Var);
                return;
            } catch (Exception e2) {
                fc4.g(e2, true);
                qacVar.a(g(null));
                return;
            }
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                int i = cmb.K5;
                alertDialog$Builder.l(R.raw.permission_request_location, 72, cmb.w0(null, i, false), null);
                alertDialog$Builder.m(i, null);
                alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                alertDialog$Builder.j(jb6.M0(2131751097, null), new oe(context, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.o();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
        qacVar.a(g(null));
    }

    public final void j() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        edit.putBoolean(kt6.q(sb, j, "_granted"), this.e);
        edit.putBoolean(j + "_requested", this.d);
        edit.apply();
    }

    public final void k(boolean z, final mn8 mn8Var) {
        final byte b = 1;
        this.d = true;
        if (!z || a()) {
            this.e = z;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (mn8Var != null) {
                mn8Var.run();
            }
        } else {
            Activity e = e();
            if (e == null) {
                return;
            }
            int i = this.b;
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(this.c));
            final byte b2 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, e());
            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131753013, m9c.r(W1), m9c.r(W1)));
            he heVar = alertDialog$Builder.a;
            heVar.U = S2;
            sr0 sr0Var = new sr0(this.a, z8c.h(i).f(), W1);
            int i2 = cmb.K5;
            int w0 = cmb.w0(null, i2, false);
            heVar.c0 = sr0Var;
            heVar.d0 = w0;
            heVar.e0 = -1;
            alertDialog$Builder.m(i2, null);
            Activity e2 = e();
            if (e2 == null || (e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && e2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.j(jb6.M0(2131753015, null), new ee(this) { // from class: pr0
                    public final /* synthetic */ tr0 b;

                    {
                        this.b = this;
                    }

                    @Override // ee
                    public final void r(he heVar2, int i3) {
                        byte b3 = b2;
                        mn8 mn8Var2 = mn8Var;
                        tr0 tr0Var = this.b;
                        switch (b3) {
                            case 0:
                                if (!tr0Var.a()) {
                                    use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, mn8Var2, (byte) 6));
                                    break;
                                } else {
                                    tr0Var.d = true;
                                    tr0Var.e = true;
                                    tr0Var.j();
                                    Iterator it2 = tr0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                tr0Var.d = true;
                                tr0Var.e = false;
                                tr0Var.j();
                                Iterator it3 = tr0Var.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                if (mn8Var2 != null) {
                                    mn8Var2.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                alertDialog$Builder.j(jb6.M0(2131753009, null), new mi(e, b));
            }
            alertDialog$Builder.g(jb6.M0(2131753014, null), new ee(this) { // from class: pr0
                public final /* synthetic */ tr0 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i3) {
                    byte b3 = b;
                    mn8 mn8Var2 = mn8Var;
                    tr0 tr0Var = this.b;
                    switch (b3) {
                        case 0:
                            if (!tr0Var.a()) {
                                use.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new x0(tr0Var, mn8Var2, (byte) 6));
                                break;
                            } else {
                                tr0Var.d = true;
                                tr0Var.e = true;
                                tr0Var.j();
                                Iterator it2 = tr0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            tr0Var.d = true;
                            tr0Var.e = false;
                            tr0Var.j();
                            Iterator it3 = tr0Var.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            if (mn8Var2 != null) {
                                mn8Var2.run();
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        j();
    }
}
