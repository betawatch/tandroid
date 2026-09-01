package sh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.br0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class q0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public q0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i10;
        this.c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z4 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z4;
        if (!z4 || a()) {
            return;
        }
        this.e = false;
        this.d = false;
        l();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static q0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        q0 q0Var = (q0) hashMap.get(pair);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(context, i10, j10);
        hashMap.put(pair, q0Var2);
        return q0Var2;
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (f10 != null) {
            return f10.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f10.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
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
        Activity activity = LaunchActivity.D1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.a);
        }
        return activity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final boolean i() {
        Activity f10;
        if (Build.VERSION.SDK_INT >= 23 && (f10 = f()) != null) {
            return (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) ? false : true;
        }
        return false;
    }

    public final void j(final org.telegram.ui.web.s sVar) {
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            sVar.run(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            sVar.run(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i10 = 1;
        final boolean[] zArr = new boolean[1];
        int i11 = this.b;
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.c));
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
        int i13 = 2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = replaceTags;
        p0 p0Var = new p0(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
        int w02 = k6.w0(null, k6.L5, false);
        d2Var.Y = p0Var;
        d2Var.Z = w02;
        if (a() || !i()) {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) { // from class: sh.n0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i14) {
                    switch (i12) {
                        case 0:
                            q0 q0Var = this.b;
                            q0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = q0Var.a();
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (!a2) {
                                ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.v1(10, q0Var, sVar2));
                                break;
                            } else {
                                q0Var.d = true;
                                q0Var.e = true;
                                q0Var.l();
                                Iterator it = q0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                sVar2.run(bool2, bool2);
                                break;
                            }
                        default:
                            q0 q0Var2 = this.b;
                            q0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                q0Var2.d = true;
                                q0Var2.e = false;
                                q0Var2.l();
                                Iterator it2 = q0Var2.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                sVar.run(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new qh.m1(f10, zArr, sVar, i13));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) { // from class: sh.n0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i14) {
                switch (i10) {
                    case 0:
                        q0 q0Var = this.b;
                        q0Var.getClass();
                        zArr[0] = true;
                        boolean a2 = q0Var.a();
                        org.telegram.ui.web.s sVar2 = sVar;
                        if (!a2) {
                            ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.v1(10, q0Var, sVar2));
                            break;
                        } else {
                            q0Var.d = true;
                            q0Var.e = true;
                            q0Var.l();
                            Iterator it = q0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            sVar2.run(bool2, bool2);
                            break;
                        }
                    default:
                        q0 q0Var2 = this.b;
                        q0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            q0Var2.d = true;
                            q0Var2.e = false;
                            q0Var2.l();
                            Iterator it2 = q0Var2.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            sVar.run(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new lh.i(this, zArr, sVar, 5));
        alertDialog$Builder.o();
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            callback.run(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
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
                callback.run(h(location));
                return;
            }
            try {
                o0 o0Var = new o0(this, locationManager, new LocationListener[]{o0Var}, callback);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, o0Var);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                callback.run(h(null));
                return;
            }
        }
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.m(R.raw.permission_request_location, 72, k6.w0(null, k6.L5, false), null);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j3.o(context, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.o();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        callback.run(h(null));
    }

    public final void l() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j10 = this.c;
        edit.putBoolean(android.support.v4.media.a.q(sb, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z4, final br0 br0Var) {
        final int i10 = 1;
        this.d = true;
        if (!z4 || a()) {
            this.e = z4;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (br0Var != null) {
                br0Var.run();
            }
        } else {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i11 = this.b;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.c));
            final int i12 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = replaceTags;
            p0 p0Var = new p0(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
            int w02 = k6.w0(null, k6.L5, false);
            d2Var.Y = p0Var;
            d2Var.Z = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new org.telegram.ui.Components.voip.c2(f10, i10));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) { // from class: sh.m0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                        switch (i12) {
                            case 0:
                                q0 q0Var = this.b;
                                if (!q0Var.a()) {
                                    ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.v1(11, q0Var, br0Var));
                                    break;
                                } else {
                                    q0Var.d = true;
                                    q0Var.e = true;
                                    q0Var.l();
                                    Iterator it2 = q0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                q0 q0Var2 = this.b;
                                q0Var2.d = true;
                                q0Var2.e = false;
                                q0Var2.l();
                                Iterator it3 = q0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = br0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) { // from class: sh.m0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    switch (i10) {
                        case 0:
                            q0 q0Var = this.b;
                            if (!q0Var.a()) {
                                ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.v1(11, q0Var, br0Var));
                                break;
                            } else {
                                q0Var.d = true;
                                q0Var.e = true;
                                q0Var.l();
                                Iterator it2 = q0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            q0 q0Var2 = this.b;
                            q0Var2.d = true;
                            q0Var2.e = false;
                            q0Var2.l();
                            Iterator it3 = q0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = br0Var;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        l();
    }
}
