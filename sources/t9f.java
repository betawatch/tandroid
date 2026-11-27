// default package

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t9f {
    public static final he6 u = new he6("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final po7 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final am2 i;
    public final Resources j;
    public az0 k;
    public k7b l;
    public ln7 m;
    public ln7 n;
    public ln7 o;
    public ln7 p;
    public ln7 q;
    public ln7 r;
    public ln7 s;
    public ln7 t;

    public t9f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        he6 he6Var = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        xve.h(id1Var);
        xve.e("Must be called from the main thread.");
        ld1 ld1Var = id1Var.e;
        xve.h(ld1Var);
        jd1 jd1Var = ld1Var.f;
        xve.h(jd1Var);
        po7 po7Var = jd1Var.d;
        xve.h(po7Var);
        this.c = po7Var;
        jd1Var.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), jd1Var.a);
        String str = po7Var.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = po7Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(po7Var.I);
        this.i = new am2(context.getApplicationContext(), new hm5(1, dimensionPixelSize, dimensionPixelSize));
        if (rve.a() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        z9f.a(b6f.v0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ln7 a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        po7 po7Var = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    ln7 ln7Var = this.r;
                    if (ln7Var != null) {
                        return ln7Var;
                    }
                    Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent.setComponent(componentName);
                    intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                    he6 he6Var = nlf.a;
                    int i3 = po7Var.E;
                    if (j == 10000) {
                        i3 = po7Var.F;
                    } else if (j == 30000) {
                        i3 = po7Var.G;
                    }
                    int i4 = po7Var.S;
                    if (j == 10000) {
                        i4 = po7Var.T;
                    } else if (j == 30000) {
                        i4 = po7Var.U;
                    }
                    ln7 b = new kn7(i3, broadcast, resources.getString(i4)).b();
                    this.r = b;
                    return b;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.k.c;
                    ln7 ln7Var2 = this.o;
                    if (ln7Var2 != null) {
                        return ln7Var2;
                    }
                    if (z) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent2.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                    }
                    ln7 b2 = new kn7(po7Var.r, pendingIntent, resources.getString(po7Var.N)).b();
                    this.o = b2;
                    return b2;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.k.d;
                    ln7 ln7Var3 = this.p;
                    if (ln7Var3 != null) {
                        return ln7Var3;
                    }
                    if (z2) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent3.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                    }
                    ln7 b3 = new kn7(po7Var.s, pendingIntent, resources.getString(po7Var.O)).b();
                    this.p = b3;
                    return b3;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    ln7 ln7Var4 = this.t;
                    if (ln7Var4 != null) {
                        return ln7Var4;
                    }
                    Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent4.setComponent(componentName);
                    ln7 b4 = new kn7(po7Var.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(po7Var.V)).b();
                    this.t = b4;
                    return b4;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    ln7 ln7Var5 = this.s;
                    if (ln7Var5 != null) {
                        return ln7Var5;
                    }
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent5.setComponent(componentName);
                    ln7 b5 = new kn7(po7Var.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(po7Var.V, "")).b();
                    this.s = b5;
                    return b5;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    az0 az0Var = this.k;
                    int i5 = az0Var.b;
                    if (!az0Var.a) {
                        ln7 ln7Var6 = this.m;
                        if (ln7Var6 != null) {
                            return ln7Var6;
                        }
                        Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent6.setComponent(componentName);
                        ln7 b6 = new kn7(po7Var.n, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(po7Var.M)).b();
                        this.m = b6;
                        return b6;
                    }
                    ln7 ln7Var7 = this.n;
                    if (ln7Var7 != null) {
                        return ln7Var7;
                    }
                    if (i5 == 2) {
                        i = po7Var.f;
                        i2 = po7Var.K;
                    } else {
                        i = po7Var.h;
                        i2 = po7Var.L;
                    }
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent7.setComponent(componentName);
                    ln7 b7 = new kn7(i, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(i2)).b();
                    this.n = b7;
                    return b7;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    ln7 ln7Var8 = this.q;
                    if (ln7Var8 != null) {
                        return ln7Var8;
                    }
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent8.setComponent(componentName);
                    intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                    he6 he6Var2 = nlf.a;
                    int i6 = po7Var.w;
                    if (j == 10000) {
                        i6 = po7Var.x;
                    } else if (j == 30000) {
                        i6 = po7Var.y;
                    }
                    int i7 = po7Var.P;
                    if (j == 10000) {
                        i7 = po7Var.Q;
                    } else if (j == 30000) {
                        i7 = po7Var.R;
                    }
                    ln7 b8 = new kn7(i6, broadcast2, resources.getString(i7)).b();
                    this.q = b8;
                    return b8;
                }
                break;
        }
        he6 he6Var3 = u;
        Log.e(he6Var3.a, he6Var3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        ln7 a;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        k7b k7bVar = this.l;
        Bitmap bitmap = k7bVar == null ? null : (Bitmap) k7bVar.c;
        Context context = this.a;
        wn7 wn7Var = new wn7(context, "cast_media_notification");
        wn7Var.g(bitmap);
        po7 po7Var = this.c;
        wn7Var.F.icon = po7Var.e;
        wn7Var.e = wn7.c((String) this.k.f);
        int i = 0;
        wn7Var.f = wn7.c(this.j.getString(po7Var.J, (String) this.k.g));
        wn7Var.f(2, true);
        wn7Var.k = false;
        wn7Var.x = 1;
        ComponentName componentName = this.e;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent a2 = iue.a(context, component); a2 != null; a2 = iue.a(context, a2.getComponent())) {
                        arrayList.add(size, a2);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                grb.i("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            wn7Var.g = activities;
        }
        uxd uxdVar = po7Var.W;
        he6 he6Var = u;
        if (uxdVar != null) {
            he6Var.b("actionsProvider != null", new Object[0]);
            int[] b = nlf.b(uxdVar);
            this.g = b == null ? null : (int[]) b.clone();
            ArrayList a3 = nlf.a(uxdVar);
            this.f = new ArrayList();
            if (a3 != null) {
                int size2 = a3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = a3.get(i2);
                    i2++;
                    vm7 vm7Var = (vm7) obj;
                    String str = vm7Var.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a = new kn7(vm7Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), vm7Var.c).b();
                    }
                    if (a != null) {
                        this.f.add(a);
                    }
                }
            }
        } else {
            he6Var.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            ArrayList arrayList2 = po7Var.a;
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ln7 a4 = a((String) obj2);
                if (a4 != null) {
                    this.f.add(a4);
                }
            }
            int[] iArr = po7Var.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f;
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj3 = arrayList3.get(i);
            i++;
            ln7 ln7Var = (ln7) obj3;
            if (ln7Var != null) {
                wn7Var.b.add(ln7Var);
            }
        }
        xn7 xn7Var = new xn7();
        xn7Var.e = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            xn7Var.e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
        if (mediaSessionCompat$Token != null) {
            xn7Var.f = mediaSessionCompat$Token;
        }
        wn7Var.i(xn7Var);
        notificationManager.notify("castMediaNotification", 1, wn7Var.b());
    }
}
