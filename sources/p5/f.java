package p5;

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
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.y;
import e0.j;
import e0.k;
import e0.t;
import g7.q6;
import java.util.ArrayList;
import java.util.Arrays;
import o5.o;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.i6;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public static final r5.b u = new r5.b("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final o5.f c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final af.h i;
    public final Resources j;
    public ge.b k;
    public i6 l;
    public k m;
    public k n;
    public k o;
    public k p;
    public k q;
    public k r;
    public k s;
    public k t;

    public f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        r5.b bVar = n5.a.l;
        l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        n5.b bVar2 = aVar.e;
        l.h(bVar2);
        o5.a aVar2 = bVar2.f;
        l.h(aVar2);
        o5.f fVar = aVar2.d;
        l.h(fVar);
        this.c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.a);
        String str = fVar.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = fVar.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.D);
        this.i = new af.h(context.getApplicationContext(), new o5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (f6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c2.a(c1.q0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        o5.f fVar = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.r == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, y.a | TLObject.FLAG_27);
                        r5.b bVar = i.a;
                        int i12 = fVar.y;
                        if (j10 == 10000) {
                            i12 = fVar.A;
                        } else if (j10 == 30000) {
                            i12 = fVar.B;
                        }
                        int i13 = fVar.N;
                        if (j10 == 10000) {
                            i13 = fVar.O;
                        } else if (j10 == 30000) {
                            i13 = fVar.P;
                        }
                        this.r = new j(i12, resources.getString(i13), broadcast).b();
                    }
                    return this.r;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z10 = this.k.c;
                    if (this.o == null) {
                        if (z10) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, y.a);
                        }
                        this.o = new j(fVar.r, resources.getString(fVar.I), pendingIntent).b();
                    }
                    return this.o;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z11 = this.k.d;
                    if (this.p == null) {
                        if (z11) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, y.a);
                        }
                        this.p = new j(fVar.s, resources.getString(fVar.J), pendingIntent).b();
                    }
                    return this.p;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        this.t = new j(fVar.C, resources.getString(fVar.Q), PendingIntent.getBroadcast(context, 0, intent4, y.a)).b();
                    }
                    return this.t;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.s == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        this.s = new j(fVar.C, resources.getString(fVar.Q, ""), PendingIntent.getBroadcast(context, 0, intent5, y.a)).b();
                    }
                    return this.s;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    ge.b bVar2 = this.k;
                    int i14 = bVar2.b;
                    if (!bVar2.a) {
                        if (this.m == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            this.m = new j(fVar.n, resources.getString(fVar.H), PendingIntent.getBroadcast(context, 0, intent6, y.a)).b();
                        }
                        return this.m;
                    }
                    if (this.n == null) {
                        if (i14 == 2) {
                            i10 = fVar.f;
                            i11 = fVar.F;
                        } else {
                            i10 = fVar.h;
                            i11 = fVar.G;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        this.n = new j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent7, y.a)).b();
                    }
                    return this.n;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.q == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, y.a | TLObject.FLAG_27);
                        r5.b bVar3 = i.a;
                        int i15 = fVar.v;
                        if (j10 == 10000) {
                            i15 = fVar.w;
                        } else if (j10 == 30000) {
                            i15 = fVar.x;
                        }
                        int i16 = fVar.K;
                        if (j10 == 10000) {
                            i16 = fVar.L;
                        } else if (j10 == 30000) {
                            i16 = fVar.M;
                        }
                        this.q = new j(i15, resources.getString(i16), broadcast2).b();
                    }
                    return this.q;
                }
                break;
        }
        r5.b bVar4 = u;
        Log.e(bVar4.a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        k a2;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        i6 i6Var = this.l;
        Bitmap bitmap = i6Var == null ? null : (Bitmap) i6Var.c;
        Context context = this.a;
        t tVar = new t(context, "cast_media_notification");
        tVar.j(bitmap);
        o5.f fVar = this.c;
        tVar.E.icon = fVar.e;
        tVar.e = t.d((String) this.k.f);
        int i10 = 0;
        tVar.f = t.d(this.j.getString(fVar.E, (String) this.k.g));
        tVar.h(2, true);
        tVar.k = false;
        tVar.x = 1;
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
                    for (Intent a3 = q6.a(context, component); a3 != null; a3 = q6.a(context, a3.getComponent())) {
                        arrayList.add(size, a3);
                    }
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e9);
                }
            }
            arrayList.add(intent);
            int i11 = y.a | TLObject.FLAG_27;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
        }
        if (activities != null) {
            tVar.g = activities;
        }
        o oVar = fVar.R;
        r5.b bVar = u;
        if (oVar != null) {
            bVar.b("actionsProvider != null", new Object[0]);
            int[] b10 = i.b(oVar);
            this.g = b10 == null ? null : (int[]) b10.clone();
            ArrayList a10 = i.a(oVar);
            this.f = new ArrayList();
            if (a10 != null) {
                int size2 = a10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = a10.get(i12);
                    i12++;
                    o5.d dVar = (o5.d) obj;
                    String str = dVar.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a2 = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a2 = new j(dVar.b, dVar.c, PendingIntent.getBroadcast(context, 0, intent2, y.a)).b();
                    }
                    if (a2 != null) {
                        this.f.add(a2);
                    }
                }
            }
        } else {
            bVar.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            ArrayList arrayList2 = fVar.a;
            int size3 = arrayList2.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                k a11 = a((String) obj2);
                if (a11 != null) {
                    this.f.add(a11);
                }
            }
            int[] iArr = fVar.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f;
        int size4 = arrayList3.size();
        while (i10 < size4) {
            Object obj3 = arrayList3.get(i10);
            i10++;
            k kVar = (k) obj3;
            if (kVar != null) {
                tVar.b.add(kVar);
            }
        }
        z1.b bVar2 = new z1.b();
        bVar2.e = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            bVar2.e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
        if (mediaSessionCompat$Token != null) {
            bVar2.f = mediaSessionCompat$Token;
        }
        tVar.n(bVar2);
        notificationManager.notify("castMediaNotification", 1, tVar.b());
    }
}
