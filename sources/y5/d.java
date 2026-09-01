package y5;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import b6.r;
import b6.s;
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends e {
    public static final Object c = new Object();
    public static final d d = new d();

    public static AlertDialog f(Activity activity, int i10, s sVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(r.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String b10 = r.b(activity, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, sVar);
        }
        String d10 = r.d(activity, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", l.d.j(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 s6 = ((v) activity).s();
                i iVar = new i();
                b6.m.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.x0 = alertDialog;
                iVar.y0 = onCancelListener;
                iVar.u0 = false;
                iVar.v0 = true;
                s6.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s6);
                aVar.o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        b6.m.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.a = alertDialog;
        bVar.b = onCancelListener;
        bVar.show(fragmentManager, str);
    }

    @Override // y5.e
    public final int c(Context context) {
        return d(context, e.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog f10 = f(googleApiActivity, i10, new s(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (f10 == null) {
            return;
        }
        g(googleApiActivity, f10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", l.d.k(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f10 = i10 == 6 ? r.f(context, "common_google_play_services_resolution_required_title") : r.d(context, i10);
        if (f10 == null) {
            f10 = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker);
        }
        String e6 = (i10 == 6 || i10 == 19) ? r.e(context, "common_google_play_services_resolution_required_text", r.a(context)) : r.c(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        b6.m.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        t tVar = new t(context, null);
        tVar.t = true;
        tVar.h(16, true);
        tVar.e = t.d(f10);
        e0.o oVar = new e0.o(false);
        oVar.f = t.d(e6);
        tVar.n(oVar);
        PackageManager packageManager = context.getPackageManager();
        if (i6.b.b == null) {
            i6.b.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (i6.b.b.booleanValue()) {
            tVar.E.icon = context.getApplicationInfo().icon;
            tVar.j = 2;
            if (i6.b.f(context)) {
                tVar.a(org.telegram.messenger.beta.R.drawable.common_full_open_on_phone, resources.getString(org.telegram.messenger.beta.R.string.common_open_on_phone), pendingIntent);
            } else {
                tVar.g = pendingIntent;
            }
        } else {
            tVar.E.icon = R.drawable.stat_sys_warning;
            tVar.p(resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker));
            tVar.E.when = System.currentTimeMillis();
            tVar.g = pendingIntent;
            tVar.f(e6);
        }
        if (i6.b.d()) {
            b6.m.k(i6.b.d());
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            tVar.y = "com.google.android.gms.availability";
        }
        Notification b10 = tVar.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            g.a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, b10);
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f10 = f(activity, i10, new s(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (f10 == null) {
            return;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
