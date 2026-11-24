// default package

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class tga {
    public static volatile qga a;
    public static volatile ArrayList b;

    public static void a(Context context, ArrayList arrayList) {
        List p = p(arrayList);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            c(context, p);
        }
        if (i >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList2.add(((oga) obj).c());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
    }

    public static boolean b(Context context, oga ogaVar) {
        Bitmap decodeStream;
        IconCompat c;
        IconCompat iconCompat = ogaVar.h;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream k = iconCompat.k(context);
        if (k == null || (decodeStream = BitmapFactory.decodeStream(k)) == null) {
            return false;
        }
        if (i == 6) {
            c = new IconCompat(5);
            c.b = decodeStream;
        } else {
            c = IconCompat.c(decodeStream);
        }
        ogaVar.h = c;
        return true;
    }

    public static void c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oga ogaVar = (oga) obj;
            if (!b(context, ogaVar)) {
                list.remove(ogaVar);
            }
        }
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static List e(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return j(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = ho9.f(context.getSystemService(ho9.j())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new nga(context, it.next()).a());
        }
        return arrayList;
    }

    public static void f(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return ho9.f(context.getSystemService(ho9.j())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static ArrayList h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static List i(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, tga.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static qga j(Context context) {
        if (a == null) {
            try {
                a = (qga) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, tga.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new pga();
            }
        }
        return a;
    }

    public static List k(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return oga.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i < 25) {
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(shortcutManager.getPinnedShortcuts());
        return oga.a(context, arrayList);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r0.next() != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        java.util.Collections.singletonList(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        fyb.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (r0.next() != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r1.next() != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Context context, oga ogaVar) {
        context.getClass();
        ogaVar.getClass();
        int i = Build.VERSION.SDK_INT;
        int g = g(context);
        if (g != 0) {
            if (i <= 29) {
                b(context, ogaVar);
            }
            int i2 = -1;
            if (i >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(ogaVar.c());
            } else if (i >= 25) {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (shortcutManager.isRateLimitingActive()) {
                    return;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= g) {
                    int i3 = -1;
                    String str = null;
                    for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                        if (shortcutInfo.getRank() > i3) {
                            str = shortcutInfo.getId();
                            i3 = shortcutInfo.getRank();
                        }
                    }
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(ogaVar.c()));
            }
            qga j = j(context);
            try {
                List<oga> b2 = j.b();
                if (b2.size() >= g) {
                    String str2 = null;
                    for (oga ogaVar2 : b2) {
                        int i4 = ogaVar2.m;
                        if (i4 > i2) {
                            str2 = ogaVar2.b;
                            i2 = i4;
                        }
                    }
                    j.d(Arrays.asList(str2));
                }
                j.a(Arrays.asList(ogaVar));
                Iterator it = ((ArrayList) i(context)).iterator();
                if (it.hasNext()) {
                }
            } catch (Exception unused) {
                Iterator it2 = ((ArrayList) i(context)).iterator();
                if (it2.hasNext()) {
                }
            } catch (Throwable th) {
                Iterator it3 = ((ArrayList) i(context)).iterator();
                if (!it3.hasNext()) {
                    q(context, ogaVar.b);
                    throw th;
                }
            }
            q(context, ogaVar.b);
        }
    }

    public static void n(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ho9.f(context.getSystemService(ho9.j())).removeAllDynamicShortcuts();
        }
        j(context).c();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
    }

    public static void o(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(arrayList);
        }
        j(context).d(arrayList);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
    }

    public static List p(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((oga) obj).getClass();
        }
        return arrayList2;
    }

    public static void q(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            ho9.f(context.getSystemService(ho9.j())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                fyb.g();
            } else {
                Collections.singletonList(str);
                throw null;
            }
        }
    }

    public static void r(Context context, oga ogaVar, IntentSender intentSender) {
        boolean z;
        Bitmap bitmap;
        Object obj;
        Resources resources;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(ogaVar.c(), intentSender);
            return;
        }
        if (i >= 26) {
            z = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        } else {
            if (rr.b(context, "com.android.launcher.permission.INSTALL_SHORTCUT") == 0) {
                Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
                while (it.hasNext()) {
                    String str = it.next().activityInfo.permission;
                    if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (z) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            Intent[] intentArr = ogaVar.c;
            intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", ogaVar.e.toString());
            IconCompat iconCompat = ogaVar.h;
            if (iconCompat != null) {
                Context context2 = ogaVar.a;
                if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
                    String str2 = (String) obj;
                    if (str2.contains(":")) {
                        String str3 = str2.split(":", -1)[1];
                        String str4 = str3.split("/", -1)[0];
                        String str5 = str3.split("/", -1)[1];
                        String str6 = str2.split(":", -1)[0];
                        if ("0_resource_name_obfuscated".equals(str5)) {
                            Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                        } else {
                            String h = iconCompat.h();
                            if ("android".equals(h)) {
                                resources = Resources.getSystem();
                            } else {
                                PackageManager packageManager = context2.getPackageManager();
                                try {
                                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(h, TLObject.FLAG_13);
                                    if (applicationInfo != null) {
                                        resources = packageManager.getResourcesForApplication(applicationInfo);
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.e("IconCompat", "Unable to find pkg=" + h + " for icon", e);
                                }
                                resources = null;
                            }
                            int identifier = resources.getIdentifier(str5, str4, str6);
                            if (iconCompat.e != identifier) {
                                Log.i("IconCompat", "Id has changed for " + h + " " + str2);
                                iconCompat.e = identifier;
                            }
                        }
                    }
                }
                int i2 = iconCompat.a;
                if (i2 == 1) {
                    bitmap = (Bitmap) iconCompat.b;
                } else if (i2 == 2) {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat.h(), 0), iconCompat.e));
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat.b, e2);
                    }
                } else {
                    if (i2 != 5) {
                        w26.j("Icon type not supported for intent shortcuts");
                        return;
                    }
                    bitmap = IconCompat.b((Bitmap) iconCompat.b, true);
                }
                intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            }
            if (intentSender == null) {
                context.sendBroadcast(intent);
            } else {
                context.sendOrderedBroadcast(intent, null, new zj(intentSender, (byte) 12), null, -1, null, null);
            }
        }
    }

    public static void s(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void t(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void u(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void v(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void w(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            lad.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zs6 x(MediaRoute2Info mediaRoute2Info) {
        int i;
        CharSequence description;
        Uri iconUri;
        Bundle extras;
        Bundle bundle;
        ArrayList parcelableArrayList;
        if (mediaRoute2Info != null) {
            ys6 ys6Var = new ys6(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            int connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle2 = ys6Var.a;
            bundle2.putInt("connectionState", connectionState);
            bundle2.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle2.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle2.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 == null) {
                bundle2.putBundle("extras", null);
            } else {
                bundle2.putBundle("extras", new Bundle(extras2));
            }
            bundle2.putBoolean("enabled", true);
            bundle2.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle2.putStringArrayList("deduplicationIds", new ArrayList<>(fu6.b(mediaRoute2Info)));
                int c = fu6.c(mediaRoute2Info);
                i = 2;
                if (c == 2) {
                    i = 12;
                } else if (c == 3) {
                    i = 13;
                } else if (c == 4) {
                    i = 14;
                } else if (c == 22) {
                    i = 20;
                } else if (c == 23) {
                    i = 21;
                } else if (c == 26) {
                    i = 22;
                } else if (c == 29) {
                    i = 24;
                } else if (c != 2000) {
                    switch (c) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (c) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                            }
                    }
                } else {
                    i = 1000;
                }
                description = mediaRoute2Info.getDescription();
                if (description != null) {
                    bundle2.putString("status", description.toString());
                }
                iconUri = mediaRoute2Info.getIconUri();
                if (iconUri != null) {
                    bundle2.putString("iconUri", iconUri.toString());
                }
                extras = mediaRoute2Info.getExtras();
                if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                    bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                    if (bundle != null) {
                        bundle2.putBundle("extras", null);
                    } else {
                        bundle2.putBundle("extras", new Bundle(bundle));
                    }
                    if (i == 0) {
                        i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                    }
                    bundle2.putInt("deviceType", i);
                    bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                    parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                    if (parcelableArrayList != null) {
                        ys6Var.a(parcelableArrayList);
                    }
                    return ys6Var.b();
                }
            }
            i = 0;
            description = mediaRoute2Info.getDescription();
            if (description != null) {
            }
            iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
            }
            extras = mediaRoute2Info.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle != null) {
                }
                if (i == 0) {
                }
                bundle2.putInt("deviceType", i);
                bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                }
                return ys6Var.b();
            }
        }
        return null;
    }

    public static void y(Context context, ArrayList arrayList) {
        List p = p(arrayList);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            c(context, p);
        }
        if (i >= 25) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) p;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList2.add(((oga) obj).c());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return;
            }
        }
        j(context).a(p);
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
    }
}
