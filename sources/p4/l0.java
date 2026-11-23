package p4;

import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c8.lb;
import c8.u9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.telegram.messenger.ks;
import org.telegram.messenger.pe;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rm;
import org.telegram.ui.pn0;
import tg.f2;
import tg.g2;
import tg.i2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Bitmap bitmap;
        Bundle bundle;
        h9.i0 i0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        pe peVar = (pe) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i7 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i7 < arrayList5.size(); arrayList5 = arrayList2) {
                m9.y yVar = (m9.y) arrayList5.get(i7);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) u9.a(yVar);
                    } catch (CancellationException | ExecutionException e10) {
                        synchronized (h2.a.b) {
                            Log.d("MediaSessionLegacyStub", h2.a.a("Failed to get bitmap", e10));
                        }
                    }
                    e2.l0 l0Var = (e2.l0) arrayList3.get(i7);
                    int i10 = n.a;
                    String str = !l0Var.a.equals("") ? null : l0Var.a;
                    e2.o0 o0Var = l0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = o0Var.J;
                    CharSequence charSequence3 = o0Var.a;
                    CharSequence charSequence4 = o0Var.g;
                    CharSequence charSequence5 = o0Var.f;
                    i0Var = o0Var.K;
                    Integer num = o0Var.I;
                    Integer num2 = o0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z10 = num2 == null && num2.intValue() != -1;
                    z11 = num == null;
                    if (!z10 || z11) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z10) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", n.a(num2.intValue()));
                        }
                        if (z11) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!i0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                    }
                    charSequence = o0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i11 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i12 < i11) {
                                String[] strArr = q4.i.d;
                                if (i13 < strArr.length) {
                                    int i14 = i13 + 1;
                                    String str2 = strArr[i13];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            charSequence2 = o0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = o0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = o0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = o0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = o0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i12] = charSequence2;
                                        i12++;
                                    }
                                    i13 = i14;
                                    i11 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence5, charSequence4, bitmap2, o0Var.n, bundle3, l0Var.f.a), i7 != -1 ? -1L : i7));
                    i7++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                e2.l0 l0Var2 = (e2.l0) arrayList3.get(i7);
                int i102 = n.a;
                if (!l0Var2.a.equals("")) {
                }
                e2.o0 o0Var2 = l0Var2.d;
                if (bitmap == null) {
                }
                bundle = o0Var2.J;
                CharSequence charSequence32 = o0Var2.a;
                CharSequence charSequence42 = o0Var2.g;
                CharSequence charSequence52 = o0Var2.f;
                i0Var = o0Var2.K;
                Integer num3 = o0Var2.I;
                Integer num22 = o0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z10) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z10) {
                }
                if (z11) {
                }
                bundle3 = bundle42;
                if (!i0Var.isEmpty()) {
                }
                charSequence = o0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence52, charSequence42, bitmap2, o0Var2.n, bundle3, l0Var2.f.a), i7 != -1 ? -1L : i7));
                i7++;
                arrayList3 = arrayList;
            }
            n0.e0(((n0) peVar.e).n, arrayList4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a10;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                d1 d1Var = (d1) this.b;
                v vVar = (v) this.c;
                d0 d0Var = (d0) this.d;
                l lVar = (l) this.e;
                ab.c0 c0Var = d1Var.b;
                try {
                    d1Var.c.remove(vVar);
                    if (!d0Var.j()) {
                        y0 y0Var = (y0) vVar.d;
                        y0Var.getClass();
                        IBinder asBinder = y0Var.a.asBinder();
                        t m10 = d0Var.m(vVar);
                        if (c0Var.B(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.a, m10.b);
                        com.google.android.gms.common.api.internal.t y10 = c0Var.y(vVar);
                        if (y10 == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            h1 h1Var = d0Var.t;
                            f1 f1Var = d0Var.s;
                            e2.y0 y0Var2 = m10.b;
                            f1 A1 = d1Var.A1(f1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.n.b).c.b;
                            h9.i0 i0Var = m10.c;
                            if (i0Var == null) {
                                i0Var = d0Var.y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = d0Var.r;
                            k1 k1Var = m10.a;
                            e2.y0 u10 = h1Var.u();
                            p1 p1Var = d0Var.j.a;
                            p1Var.getClass();
                            j jVar = new j(d1Var, i0Var3, i0Var2, i0Var4, k1Var, y0Var2, u10, new Bundle(p1Var.g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((k) lVar).h1(y10.e(), jVar.a(vVar.c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!d0Var.x || !d0.k(vVar))) {
                                    d0Var.e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                    if (0 == 0) {
                        lb.a(lVar);
                    }
                }
            case 2:
                d0 d0Var2 = (d0) this.b;
                m9.e0 e0Var = (m9.e0) this.c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.e;
                if (d0Var2.j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th2) {
                    e0Var.n(th2);
                    return;
                }
            case 3:
                d0 d0Var3 = (d0) this.b;
                a1 a1Var = (a1) this.c;
                v vVar2 = (v) this.d;
                List list = (List) this.e;
                if (d0Var3.j()) {
                    return;
                }
                a1Var.a(d0Var3.t, vVar2, list);
                return;
            case 4:
                t5.a aVar = (t5.a) this.b;
                o5.i iVar = (o5.i) this.c;
                String str = iVar.a;
                l5.g gVar = (l5.g) this.d;
                o5.h hVar = (o5.h) this.e;
                aVar.getClass();
                Logger logger = t5.a.f;
                try {
                    p5.f a11 = aVar.c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.e).f(new rm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 5:
                i2 i2Var = (i2) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                pn0 pn0Var = (pn0) this.c;
                f2 f2Var = (f2) this.e;
                i2Var.H = true;
                i2Var.I = (f2[]) arrayList.toArray(new f2[0]);
                pn0Var.a(f2Var);
                return;
            case 6:
                i2 i2Var2 = (i2) this.b;
                TLObject tLObject = (TLObject) this.c;
                g2 g2Var = (g2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    i2Var2.h();
                    i2Var2.n(tL_error);
                    return;
                }
                i2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                g2Var.e = ri.c0(tL_messageMediaDocument.document, g2Var.c);
                g2Var.f = tL_messageMediaDocument;
                i2Var2.a();
                return;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                w10 w10Var = (w10) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                w10 w10Var2 = (w10) this.e;
                if (tL_error2 != null) {
                    w10Var.a(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                        w10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                        return;
                    }
                    return;
                }
            case 8:
                xi.e eVar = (xi.e) this.b;
                ((ArrayDeque) eVar.a).addLast(new xi.d((org.telegram.tgnet.g) this.c, (xi.a) this.d, (RequestTimeDelegate) this.e));
                eVar.J();
                return;
            default:
                zi.t tVar = (zi.t) this.b;
                zi.n0 n0Var = (zi.n0) this.c;
                zi.n0 n0Var2 = (zi.n0) this.d;
                Handler handler = (Handler) this.e;
                if (tVar.r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.d0 = n0Var;
                    tVar.e0 = n0Var2;
                    String[] strArr = zi.v0.a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var == n0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = zi.v0.a(n0Var == zi.n0.b ? 0 : 1);
                    }
                    tVar.b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(ks.X4, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.a0 = (r3 - r4) * 1000000;
                    tVar.i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.b0 + ", targetBlurRadiusPx=" + (((tVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.y0);
                    handler.post(tVar.y0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l0(i2 i2Var, ArrayList arrayList, pn0 pn0Var, f2 f2Var) {
        this.a = 5;
        this.b = i2Var;
        this.d = arrayList;
        this.c = pn0Var;
        this.e = f2Var;
    }
}
