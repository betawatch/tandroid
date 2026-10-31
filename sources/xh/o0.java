package xh;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.et0;
import vh.i9;
import w7.c6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public o0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i10;
        this.c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z10;
        if (!z10 || a()) {
            return;
        }
        this.e = false;
        this.d = false;
        k();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void c() {
        Context context = org.telegram.messenger.w0.b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static o0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        o0 o0Var = (o0) hashMap.get(pair);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(context, i10, j10);
        hashMap.put(pair, o0Var2);
        return o0Var2;
    }

    public static JSONObject h(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", location != null);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i10 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i10 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i10 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e) {
            f8.g(e, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f7 = f();
        if (f7 != null) {
            return f7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        return f() != null && f().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public final Activity f() {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(this.a);
        }
        return activity == null ? org.telegram.messenger.i0.W(org.telegram.messenger.w0.b) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final void i(final org.telegram.ui.web.o oVar) {
        Activity f7;
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            oVar.a(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            oVar.a(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i10 = 1;
        final boolean[] zArr = new boolean[1];
        int i11 = this.b;
        TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(this.c));
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f10, null);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753057, h20.p(Z1), h20.p(Z1)));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = W2;
        n0 n0Var = new n0(this.a, d20.i(i11).f(), Z1);
        int i13 = t6.L5;
        int x02 = t6.x0(null, i13, false);
        x1Var.b0 = n0Var;
        x1Var.c0 = x02;
        x1Var.d0 = -1;
        alertDialog$Builder.n(i13, null);
        if (a() || (f7 = f()) == null || (f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            alertDialog$Builder.k(cd.L0(2131753059, null), new org.telegram.ui.ActionBar.u1(this) { // from class: xh.l0
                public final /* synthetic */ o0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                    switch (i12) {
                        case 0:
                            o0 o0Var = this.b;
                            o0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = o0Var.a();
                            org.telegram.ui.web.o oVar2 = oVar;
                            if (!a2) {
                                c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.e3(11, o0Var, oVar2));
                                break;
                            } else {
                                o0Var.d = true;
                                o0Var.e = true;
                                o0Var.k();
                                Iterator it = o0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                oVar2.a(bool2, bool2);
                                break;
                            }
                        default:
                            o0 o0Var2 = this.b;
                            o0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                o0Var2.d = true;
                                o0Var2.e = false;
                                o0Var2.k();
                                Iterator it2 = o0Var2.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                oVar.a(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(cd.L0(2131753053, null), new q5.a(f10, zArr, oVar, 12));
        }
        alertDialog$Builder.h(cd.L0(2131753058, null), new org.telegram.ui.ActionBar.u1(this) { // from class: xh.l0
            public final /* synthetic */ o0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                switch (i10) {
                    case 0:
                        o0 o0Var = this.b;
                        o0Var.getClass();
                        zArr[0] = true;
                        boolean a2 = o0Var.a();
                        org.telegram.ui.web.o oVar2 = oVar;
                        if (!a2) {
                            c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.e3(11, o0Var, oVar2));
                            break;
                        } else {
                            o0Var.d = true;
                            o0Var.e = true;
                            o0Var.k();
                            Iterator it = o0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            oVar2.a(bool2, bool2);
                            break;
                        }
                    default:
                        o0 o0Var2 = this.b;
                        o0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            o0Var2.d = true;
                            o0Var2.e = false;
                            o0Var2.k();
                            Iterator it2 = o0Var2.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            oVar.a(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new org.telegram.ui.Components.z1(this, zArr, oVar, 5));
        alertDialog$Builder.p();
    }

    public final void j(q20 q20Var) {
        JSONObject jSONObject = new JSONObject();
        int i10 = 1;
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e) {
                f8.g(e, true);
            }
            q20Var.a(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                break;
            }
        }
        if (location != null || locationManager.isProviderEnabled("gps")) {
            if (location != null) {
                q20Var.a(h(location));
                return;
            }
            try {
                m0 m0Var = new m0(this, locationManager, new LocationListener[]{m0Var}, q20Var);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, m0Var);
                return;
            } catch (Exception e7) {
                f8.g(e7, true);
                q20Var.a(h(null));
                return;
            }
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                int i11 = t6.L5;
                alertDialog$Builder.m(R.raw.permission_request_location, 72, t6.x0(null, i11, false), null);
                alertDialog$Builder.n(i11, null);
                alertDialog$Builder.a.T = cd.L0(2131749539, null);
                alertDialog$Builder.k(cd.L0(2131751161, null), new i9(context, i10));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
        q20Var.a(h(null));
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.c;
        edit.putBoolean(a1.g.q(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final et0 et0Var) {
        final int i10 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.e = z10;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (et0Var != null) {
                et0Var.run();
            }
        } else {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i11 = this.b;
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(this.c));
            final int i12 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753057, h20.p(Z1), h20.p(Z1)));
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = W2;
            n0 n0Var = new n0(this.a, d20.i(i11).f(), Z1);
            int i13 = t6.L5;
            int x02 = t6.x0(null, i13, false);
            x1Var.b0 = n0Var;
            x1Var.c0 = x02;
            x1Var.d0 = -1;
            alertDialog$Builder.n(i13, null);
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(cd.L0(2131753059, null), new org.telegram.ui.ActionBar.u1(this) { // from class: xh.k0
                    public final /* synthetic */ o0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                        switch (i12) {
                            case 0:
                                o0 o0Var = this.b;
                                if (!o0Var.a()) {
                                    c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.e3(12, o0Var, et0Var));
                                    break;
                                } else {
                                    o0Var.d = true;
                                    o0Var.e = true;
                                    o0Var.k();
                                    Iterator it2 = o0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                o0 o0Var2 = this.b;
                                o0Var2.d = true;
                                o0Var2.e = false;
                                o0Var2.k();
                                Iterator it3 = o0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = et0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(cd.L0(2131753053, null), new org.telegram.ui.Components.voip.j1(f7, i10));
            }
            alertDialog$Builder.h(cd.L0(2131753058, null), new org.telegram.ui.ActionBar.u1(this) { // from class: xh.k0
                public final /* synthetic */ o0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                    switch (i10) {
                        case 0:
                            o0 o0Var = this.b;
                            if (!o0Var.a()) {
                                c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.e3(12, o0Var, et0Var));
                                break;
                            } else {
                                o0Var.d = true;
                                o0Var.e = true;
                                o0Var.k();
                                Iterator it2 = o0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            o0 o0Var2 = this.b;
                            o0Var2.d = true;
                            o0Var2.e = false;
                            o0Var2.k();
                            Iterator it3 = o0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = et0Var;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        k();
    }
}
