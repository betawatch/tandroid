package t5;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c0;
import android.support.v4.media.session.f0;
import android.support.v4.media.session.v;
import android.text.TextUtils;
import android.util.Log;
import b6.m;
import c5.j;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.tl0;
import q5.g0;
import q5.l;
import q5.o;
import q5.q;
import r5.d0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h {
    public static final u5.b v = new u5.b("MediaSessionManager", null);
    public final Context a;
    public final r5.b b;
    public final p c;
    public final r5.g d;
    public final s5.f e;
    public final ComponentName f;
    public final ComponentName g;
    public final j h;
    public final j i;
    public final f j;
    public final a7.e k;
    public final tl0 l;
    public final d0 m;
    public s5.h n;
    public CastDevice o;
    public c0 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public h(Context context, r5.b bVar, p pVar) {
        s5.f fVar;
        this.a = context;
        this.b = bVar;
        this.c = pVar;
        u5.b bVar2 = r5.a.l;
        m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        s5.a aVar2 = bVar.f;
        this.e = aVar2 == null ? null : aVar2.d;
        this.m = new d0(this, 2);
        String str = aVar2 == null ? null : aVar2.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        j jVar = new j(context);
        this.h = jVar;
        jVar.e = new qk0(this, 13);
        j jVar2 = new j(context);
        this.i = jVar2;
        jVar2.e = new f1(this, 21);
        this.k = new a7.e(Looper.getMainLooper(), 2);
        u5.b bVar3 = f.u;
        s5.a aVar3 = bVar.f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            s5.p pVar2 = fVar.S;
            if (pVar2 != null) {
                ArrayList a2 = i.a(pVar2);
                int[] b10 = i.b(pVar2);
                int size = a2 == null ? 0 : a2.size();
                if (a2 == null || a2.isEmpty()) {
                    Log.e(bVar3.a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a2.size() > 5) {
                    Log.e(bVar3.a, bVar3.d(s5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b10 == null || (b10.length) == 0) {
                    Log.e(bVar3.a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i10 : b10) {
                        if (i10 < 0 || i10 >= size) {
                            Log.e(bVar3.a, bVar3.d(s5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            fVar2 = new f(context);
        }
        this.j = fVar2;
        this.l = new tl0(this, 8);
    }

    public final void a(s5.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        r5.b bVar = this.b;
        s5.a aVar = bVar == null ? null : bVar.f;
        if (this.q || bVar == null || aVar == null || this.e == null || hVar == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = hVar;
        hVar.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i10 = y.a;
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
        if (aVar.f) {
            c0 c0Var = new c0(context, "CastMediaSession", componentName, broadcast);
            this.p = c0Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                a0.f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                c0Var.e(new MediaMetadataCompat(bundle));
            }
            c0Var.d(new g(this), null);
            c0Var.c(true);
            this.c.J0(c0Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        l lVar;
        boolean z4;
        boolean z10;
        ke.b bVar;
        Uri uri;
        g0 g0Var;
        o c3;
        MediaInfo mediaInfo;
        s5.h hVar = this.n;
        if (hVar == null) {
            return;
        }
        int s6 = hVar.s();
        MediaInfo d10 = hVar.d();
        if (hVar.k() && (c3 = hVar.c()) != null && (mediaInfo = c3.a) != null) {
            d10 = mediaInfo;
        }
        j(s6, d10);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (s6 != 0) {
            f fVar = this.j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                s5.h hVar2 = this.n;
                c0 c0Var = this.p;
                if (castDevice != null && hVar2 != null && c0Var != null && (d = hVar2.d()) != null && (lVar = d.d) != null) {
                    List list = lVar.a;
                    q e = hVar2.e();
                    if (e != null) {
                        int i10 = e.C;
                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                            z4 = true;
                            z10 = true;
                        } else {
                            Integer num = (Integer) e.K.get(e.c);
                            if (num != null) {
                                z10 = num.intValue() > 0;
                                z4 = num.intValue() < e.D.size() + (-1);
                            }
                        }
                        boolean z11 = hVar2.f() != 2;
                        int i11 = d.b;
                        l.f(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                        String str = castDevice.d;
                        ke.b bVar2 = new ke.b(z11, i11, string, str, c0Var.a.b, z4, z10);
                        boolean z12 = z11;
                        boolean z13 = z4;
                        boolean z14 = z10;
                        bVar = fVar.k;
                        if (bVar != null || z12 != bVar.a || i11 != bVar.b || !u5.a.d(string, (String) bVar.f) || !u5.a.d(str, (String) bVar.g) || z13 != bVar.c || z14 != bVar.d) {
                            fVar.k = bVar2;
                            fVar.b();
                        }
                        g0 g0Var2 = new g0((list != null || list.isEmpty()) ? null : (a6.a) list.get(0));
                        uri = (Uri) g0Var2.b;
                        g0Var = fVar.l;
                        if (g0Var != null || !u5.a.d(uri, (Uri) g0Var.b)) {
                            j jVar = fVar.i;
                            jVar.e = new g0(fVar, g0Var2, false, 7);
                            jVar.B(uri);
                        }
                    }
                    z4 = false;
                    z10 = false;
                    if (hVar2.f() != 2) {
                    }
                    int i112 = d.b;
                    l.f(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string2 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str2 = castDevice.d;
                    ke.b bVar22 = new ke.b(z11, i112, string2, str2, c0Var.a.b, z4, z10);
                    boolean z122 = z11;
                    boolean z132 = z4;
                    boolean z142 = z10;
                    bVar = fVar.k;
                    if (bVar != null) {
                    }
                    fVar.k = bVar22;
                    fVar.b();
                    g0 g0Var22 = new g0((list != null || list.isEmpty()) ? null : (a6.a) list.get(0));
                    uri = (Uri) g0Var22.b;
                    g0Var = fVar.l;
                    if (g0Var != null) {
                    }
                    j jVar2 = fVar.i;
                    jVar2.e = new g0(fVar, g0Var22, false, 7);
                    jVar2.B(uri);
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                s5.h hVar = this.n;
                if (hVar != null && hVar.h()) {
                    q e = hVar.e();
                    m.h(e);
                    if ((128 & e.n) != 0 || e.C != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e.K.get(e.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            s5.h hVar2 = this.n;
            if (hVar2 != null && hVar2.h()) {
                q e6 = hVar2.e();
                m.h(e6);
                if ((64 & e6.n) != 0 || e6.C != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e6.K.get(e6.c);
                if (num2 != null && num2.intValue() < e6.D.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(l lVar) {
        s5.a aVar = this.b.f;
        if (aVar != null) {
            aVar.e();
        }
        List list = lVar.a;
        a6.a aVar2 = (list == null || list.isEmpty()) ? null : (a6.a) lVar.a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.b;
    }

    public final void e(Bitmap bitmap, int i10) {
        MediaMetadata metadata;
        c0 c0Var = this.p;
        if (c0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        c0 c0Var2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (c0Var2 != null && (metadata = ((android.support.v4.media.session.h) c0Var2.b.b).a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        android.support.v4.media.d dVar = mediaMetadataCompat == null ? new android.support.v4.media.d() : new android.support.v4.media.d(mediaMetadataCompat);
        dVar.c(i10 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        c0Var.e(dVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f0 f0Var, String str, s5.d dVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        s5.f fVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && fVar != null) {
                        long j10 = fVar.c;
                        u5.b bVar = i.a;
                        int i10 = fVar.O;
                        if (j10 == 10000) {
                            i10 = fVar.P;
                        } else if (j10 == 30000) {
                            i10 = fVar.Q;
                        }
                        int i11 = fVar.y;
                        if (j10 == 10000) {
                            i11 = fVar.B;
                        } else if (j10 == 30000) {
                            i11 = fVar.C;
                        }
                        String string = context.getResources().getString(i10);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i11 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i11, null);
                    }
                    customAction = this.s;
                    if (customAction != null) {
                        f0Var.a(customAction);
                        return;
                    }
                    return;
                }
                if (dVar != null) {
                    String str2 = dVar.c;
                    int i12 = dVar.b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i12 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i12, null);
                }
                if (customAction != null) {
                }
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.R);
                        int i13 = fVar.D;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i13, null);
                    }
                    customAction = this.t;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.u == null && fVar != null) {
                        String string3 = context.getResources().getString(fVar.R);
                        int i14 = fVar.D;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i14, null);
                    }
                    customAction = this.u;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.r == null && fVar != null) {
                        long j11 = fVar.c;
                        u5.b bVar2 = i.a;
                        int i15 = fVar.L;
                        if (j11 == 10000) {
                            i15 = fVar.M;
                        } else if (j11 == 30000) {
                            i15 = fVar.N;
                        }
                        int i16 = fVar.v;
                        if (j11 == 10000) {
                            i16 = fVar.w;
                        } else if (j11 == 30000) {
                            i16 = fVar.x;
                        }
                        String string4 = context.getResources().getString(i15);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i16 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i16, null);
                    }
                    customAction = this.r;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            default:
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
        }
    }

    public final void g(boolean z4) {
        if (this.b.h) {
            a7.e eVar = this.k;
            tl0 tl0Var = this.l;
            if (tl0Var != null) {
                eVar.removeCallbacks(tl0Var);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z4) {
                    eVar.postDelayed(tl0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            j jVar = fVar.i;
            jVar.C();
            jVar.e = null;
            NotificationManager notificationManager = fVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (this.b.h) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        c0 c0Var;
        l lVar;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        Bitmap bitmap;
        PendingIntent activity;
        int i11;
        c0 c0Var2 = this.p;
        if (c0Var2 == null) {
            return;
        }
        v vVar = c0Var2.a;
        Bundle bundle = new Bundle();
        f0 f0Var = new f0();
        s5.h hVar = this.n;
        s5.f fVar = this.e;
        if (hVar == null || this.j == null) {
            b10 = f0Var.b();
        } else {
            f0Var.c(i10, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i10 == 0) {
                b10 = f0Var.b();
            } else {
                s5.p pVar = fVar != null ? fVar.S : null;
                s5.h hVar2 = this.n;
                long j10 = (hVar2 == null || hVar2.j() || this.n.n()) ? 0L : 256L;
                if (pVar != null) {
                    ArrayList a2 = i.a(pVar);
                    if (a2 != null) {
                        int size = a2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = a2.get(i12);
                            i12++;
                            ArrayList arrayList = a2;
                            s5.d dVar = (s5.d) obj;
                            int i13 = size;
                            String str = dVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j10 = c(str, i10, bundle) | j10;
                            } else {
                                f(f0Var, str, dVar);
                            }
                            size = i13;
                            a2 = arrayList;
                        }
                    }
                } else if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ArrayList arrayList3 = arrayList2;
                        String str2 = (String) obj2;
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            i11 = size2;
                            j10 = c(str2, i10, bundle) | j10;
                        } else {
                            i11 = size2;
                            f(f0Var, str2, null);
                        }
                        size2 = i11;
                        arrayList2 = arrayList3;
                    }
                }
                f0Var.e = j10;
                b10 = f0Var.b();
            }
        }
        c0Var2.f(b10);
        if (fVar != null && fVar.T) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.U) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            vVar.a.setExtras(bundle);
        }
        if (i10 == 0) {
            c0Var2.e(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.a, 0, intent, y.a | TLObject.FLAG_27);
            }
            if (activity != null) {
                vVar.a.setSessionActivity(activity);
            }
        }
        s5.h hVar3 = this.n;
        if (hVar3 == null || (c0Var = this.p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.b;
        long j11 = hVar3.j() ? 0L : mediaInfo.e;
        l.f(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        l.f(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        c0 c0Var3 = this.p;
        if (c0Var3 == null || (metadata = ((android.support.v4.media.session.h) c0Var3.b.b).a.getMetadata()) == null) {
            createFromParcel = null;
        } else {
            a0.f fVar2 = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
        }
        android.support.v4.media.d dVar2 = createFromParcel == null ? new android.support.v4.media.d() : new android.support.v4.media.d(createFromParcel);
        dVar2.d(j11, "android.media.metadata.DURATION");
        if (string != null) {
            dVar2.e("android.media.metadata.TITLE", string);
            dVar2.e("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            dVar2.e("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        c0Var.e(dVar2.a());
        Uri d = d(lVar);
        if (d != null) {
            this.h.B(d);
            bitmap = null;
        } else {
            bitmap = null;
            e(null, 0);
        }
        Uri d10 = d(lVar);
        if (d10 != null) {
            this.i.B(d10);
        } else {
            e(bitmap, 3);
        }
    }
}
