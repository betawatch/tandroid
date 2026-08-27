package v5;

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
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.t;
import y5.q;
import y5.r;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends e {
    public static final Object c = new Object();
    public static final d d = new d();

    public static AlertDialog f(Activity activity, int i10, r rVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(q.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String b10 = q.b(activity, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, rVar);
        }
        String d10 = q.d(activity, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", i0.a.k(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 s10 = ((v) activity).s();
                i iVar = new i();
                y5.l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.w0 = alertDialog;
                iVar.x0 = onCancelListener;
                iVar.t0 = false;
                iVar.u0 = true;
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        y5.l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.a = alertDialog;
        bVar.b = onCancelListener;
        bVar.show(fragmentManager, str);
    }

    @Override // v5.e
    public final int c(Context context) {
        return d(context, e.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog f10 = f(googleApiActivity, i10, new r(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (f10 == null) {
            return;
        }
        g(googleApiActivity, f10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", i0.a.l(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
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
        String f10 = i10 == 6 ? q.f(context, "common_google_play_services_resolution_required_title") : q.d(context, i10);
        if (f10 == null) {
            f10 = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker);
        }
        String e9 = (i10 == 6 || i10 == 19) ? q.e(context, "common_google_play_services_resolution_required_text", q.a(context)) : q.c(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y5.l.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        t tVar = new t(context, null);
        tVar.t = true;
        tVar.h(16, true);
        tVar.e = t.d(f10);
        e0.o oVar = new e0.o(false);
        oVar.f = t.d(e9);
        tVar.n(oVar);
        PackageManager packageManager = context.getPackageManager();
        if (f6.b.b == null) {
            f6.b.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f6.b.b.booleanValue()) {
            tVar.E.icon = context.getApplicationInfo().icon;
            tVar.j = 2;
            if (f6.b.f(context)) {
                tVar.a(org.telegram.messenger.beta.R.drawable.common_full_open_on_phone, resources.getString(org.telegram.messenger.beta.R.string.common_open_on_phone), pendingIntent);
            } else {
                tVar.g = pendingIntent;
            }
        } else {
            tVar.E.icon = R.drawable.stat_sys_warning;
            tVar.p(resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker));
            tVar.E.when = System.currentTimeMillis();
            tVar.g = pendingIntent;
            tVar.f(e9);
        }
        if (f6.b.d()) {
            y5.l.k(f6.b.d());
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
        AlertDialog f10 = f(activity, i10, new r(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (f10 == null) {
            return;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
