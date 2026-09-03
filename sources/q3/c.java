package q3;

import a0.f;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.d;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c0;
import android.support.v4.media.session.h;
import cb.e;
import h5.d0;
import j$.util.DesugarCollections;
import j3.a2;
import j3.c1;
import j3.l0;
import j3.n2;
import j3.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.qa;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c {
    public static final MediaMetadataCompat l;
    public final c0 a;
    public final Looper b;
    public final a c;
    public final ArrayList d;
    public final ArrayList e;
    public final b[] f;
    public Map g;
    public final qa h;
    public a2 i;
    public final long j;
    public final boolean k;

    static {
        l0.a("goog.exo.mediasession");
        l = new MediaMetadataCompat(new Bundle());
    }

    public c(c0 c0Var) {
        this.a = c0Var;
        int i10 = d0.a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.b = myLooper;
        a aVar = new a(this);
        this.c = aVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new b[0];
        this.g = Collections.EMPTY_MAP;
        this.h = new qa(c0Var.b);
        this.j = 2360143L;
        c0Var.a.a.setFlags(3);
        c0Var.d(aVar, new Handler(myLooper));
        this.k = true;
    }

    public static boolean a(c cVar, long j10) {
        return (cVar.i == null || (j10 & cVar.j) == 0) ? false : true;
    }

    public final void b() {
        a2 a2Var;
        Object obj;
        MediaMetadataCompat mediaMetadataCompat = l;
        qa qaVar = this.h;
        if (qaVar != null && (a2Var = this.i) != null) {
            af.c cVar = (af.c) qaVar.b;
            String str = (String) qaVar.c;
            if (!a2Var.z().p()) {
                d dVar = new d();
                if (a2Var.f()) {
                    dVar.d(1L, "android.media.metadata.ADVERTISEMENT");
                }
                e eVar = (e) a2Var;
                o2 z4 = eVar.z();
                dVar.d(((z4.p() || !z4.m(eVar.x(), (n2) eVar.a, 0L).r) && a2Var.getDuration() != -9223372036854775807L) ? a2Var.getDuration() : -1L, "android.media.metadata.DURATION");
                long j10 = cVar.P().s;
                if (j10 != -1) {
                    List<MediaSession.QueueItem> queue = ((h) cVar.b).a.getQueue();
                    ArrayList a2 = queue != null ? MediaSessionCompat$QueueItem.a(queue) : null;
                    int i10 = 0;
                    while (true) {
                        if (a2 == null || i10 >= a2.size()) {
                            break;
                        }
                        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) a2.get(i10);
                        if (mediaSessionCompat$QueueItem.b == j10) {
                            MediaDescriptionCompat mediaDescriptionCompat = mediaSessionCompat$QueueItem.a;
                            Bundle bundle = mediaDescriptionCompat.h;
                            if (bundle != null) {
                                for (String str2 : bundle.keySet()) {
                                    Object obj2 = bundle.get(str2);
                                    if (obj2 instanceof String) {
                                        dVar.e(w2.k(str, str2), (String) obj2);
                                    } else {
                                        boolean z10 = obj2 instanceof CharSequence;
                                        Bundle bundle2 = dVar.a;
                                        if (z10) {
                                            String k10 = w2.k(str, str2);
                                            CharSequence charSequence = (CharSequence) obj2;
                                            f fVar = MediaMetadataCompat.d;
                                            if (fVar.containsKey(k10) && ((Integer) fVar.get(k10)).intValue() != 1) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", k10, " key cannot be used to put a CharSequence"));
                                            }
                                            bundle2.putCharSequence(k10, charSequence);
                                        } else if (obj2 instanceof Long) {
                                            dVar.d(((Long) obj2).longValue(), w2.k(str, str2));
                                        } else if (obj2 instanceof Integer) {
                                            dVar.d(((Integer) obj2).intValue(), w2.k(str, str2));
                                        } else if (obj2 instanceof Bitmap) {
                                            dVar.c(w2.k(str, str2), (Bitmap) obj2);
                                        } else if (obj2 instanceof RatingCompat) {
                                            String k11 = w2.k(str, str2);
                                            RatingCompat ratingCompat = (RatingCompat) obj2;
                                            float f10 = ratingCompat.b;
                                            int i11 = ratingCompat.a;
                                            f fVar2 = MediaMetadataCompat.d;
                                            if (fVar2.containsKey(k11) && ((Integer) fVar2.get(k11)).intValue() != 3) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", k11, " key cannot be used to put a Rating"));
                                            }
                                            if (ratingCompat.c == null) {
                                                if (ratingCompat.a()) {
                                                    switch (i11) {
                                                        case 1:
                                                            ratingCompat.c = android.support.v4.media.e.g(i11 == 1 && f10 == 1.0f);
                                                            break;
                                                        case 2:
                                                            ratingCompat.c = android.support.v4.media.e.j(i11 == 2 && f10 == 1.0f);
                                                            break;
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                            if ((i11 != 3 && i11 != 4 && i11 != 5) || !ratingCompat.a()) {
                                                                f10 = -1.0f;
                                                            }
                                                            ratingCompat.c = android.support.v4.media.e.i(i11, f10);
                                                            break;
                                                        case 6:
                                                            if (i11 != 6 || !ratingCompat.a()) {
                                                                f10 = -1.0f;
                                                            }
                                                            ratingCompat.c = android.support.v4.media.e.h(f10);
                                                            break;
                                                        default:
                                                            obj = null;
                                                            break;
                                                    }
                                                    bundle2.putParcelable(k11, (Parcelable) obj);
                                                } else {
                                                    ratingCompat.c = android.support.v4.media.e.k(i11);
                                                }
                                            }
                                            obj = ratingCompat.c;
                                            bundle2.putParcelable(k11, (Parcelable) obj);
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence2 = mediaDescriptionCompat.b;
                            if (charSequence2 != null) {
                                String valueOf = String.valueOf(charSequence2);
                                dVar.e("android.media.metadata.TITLE", valueOf);
                                dVar.e("android.media.metadata.DISPLAY_TITLE", valueOf);
                            }
                            CharSequence charSequence3 = mediaDescriptionCompat.c;
                            if (charSequence3 != null) {
                                dVar.e("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                            }
                            CharSequence charSequence4 = mediaDescriptionCompat.d;
                            if (charSequence4 != null) {
                                dVar.e("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                            }
                            Bitmap bitmap = mediaDescriptionCompat.e;
                            if (bitmap != null) {
                                dVar.c("android.media.metadata.DISPLAY_ICON", bitmap);
                            }
                            Uri uri = mediaDescriptionCompat.f;
                            if (uri != null) {
                                dVar.e("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                            }
                            String str3 = mediaDescriptionCompat.a;
                            if (str3 != null) {
                                dVar.e("android.media.metadata.MEDIA_ID", str3);
                            }
                            Uri uri2 = mediaDescriptionCompat.n;
                            if (uri2 != null) {
                                dVar.e("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                mediaMetadataCompat = dVar.a();
            }
        }
        this.a.e(mediaMetadataCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r9 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i10;
        ArrayList arrayList = new ArrayList();
        a2 a2Var = this.i;
        c0 c0Var = this.a;
        if (a2Var == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c0Var.h(0);
            c0Var.i(0);
            c0Var.f(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 0L, 0, null, elapsedRealtime, arrayList, -1L, null));
            return;
        }
        HashMap hashMap = new HashMap();
        b[] bVarArr = this.f;
        if (bVarArr.length > 0) {
            b bVar = bVarArr[0];
            throw null;
        }
        this.g = DesugarCollections.unmodifiableMap(hashMap);
        Bundle bundle = new Bundle();
        if (a2Var.v() == null) {
            int c3 = a2Var.c();
            boolean j10 = a2Var.j();
            if (c3 != 2) {
                i10 = 3;
                if (c3 != 3) {
                    i10 = c3 != 4 ? 0 : 1;
                }
            } else {
                if (j10) {
                    i10 = 6;
                }
                i10 = 2;
            }
        } else {
            i10 = 7;
        }
        float f10 = a2Var.d().a;
        bundle.putFloat("EXO_SPEED", f10);
        e eVar = (e) a2Var;
        if (!eVar.G()) {
            f10 = 0.0f;
        }
        o2 z4 = eVar.z();
        c1 c1Var = z4.p() ? null : z4.m(eVar.x(), (n2) eVar.a, 0L).c;
        if (c1Var != null) {
            String str = c1Var.a;
            if (!"".equals(str)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
            }
        }
        boolean z10 = eVar.i().a.a.get(5);
        boolean z11 = eVar.i().a.a.get(11);
        boolean z12 = eVar.i().a.a.get(12);
        if (!eVar.z().p()) {
            eVar.f();
        }
        long j11 = z10 ? 6554375L : 6554119L;
        if (z12) {
            j11 |= 64;
        }
        if (z11) {
            j11 |= 8;
        }
        long j12 = j11 & this.j;
        long s6 = a2Var.s();
        long C = a2Var.C();
        int i11 = i10;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int g10 = a2Var.g();
        c0Var.h(g10 != 1 ? g10 == 2 ? 2 : 0 : 1);
        c0Var.i(a2Var.B() ? 1 : 0);
        c0Var.f(new PlaybackStateCompat(i11, C, s6, f10, j12, 0, null, elapsedRealtime2, arrayList, -1L, bundle));
    }

    public final void d(a2 a2Var) {
        h5.a.f(a2Var == null || a2Var.A() == this.b);
        a2 a2Var2 = this.i;
        a aVar = this.c;
        if (a2Var2 != null) {
            a2Var2.u(aVar);
        }
        this.i = a2Var;
        if (a2Var != null) {
            a2Var.n(aVar);
        }
        c();
        b();
    }
}
