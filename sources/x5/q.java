package x5;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q {
    public static final a0.k a = new a0.k(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = g6.c.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i9) {
        Resources resources = context.getResources();
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? resources.getString(R.string.ok) : resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_enable_button) : resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_update_button) : resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i9) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i9 == 1) {
            return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_install_text, a2);
        }
        if (i9 == 2) {
            return e6.b.f(context) ? resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_wear_update_text) : resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_update_text, a2);
        }
        if (i9 == 3) {
            return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_enable_text, a2);
        }
        if (i9 == 5) {
            return e(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i9 == 7) {
            return e(context, "common_google_play_services_network_error_text", a2);
        }
        if (i9 == 9) {
            return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i9 == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i9) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String d(Context context, int i9) {
        Resources resources = context.getResources();
        switch (i9) {
            case 1:
                return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i9);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f10 = f(context, str);
        if (f10 == null) {
            f10 = resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f10, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        a0.k kVar = a;
        synchronized (kVar) {
            try {
                Locale locale = g7.a0.a(context.getResources().getConfiguration()).a.get(0);
                if (!locale.equals(b)) {
                    kVar.clear();
                    b = locale;
                }
                String str2 = (String) kVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = u5.g.a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
