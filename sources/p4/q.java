package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.j0;
import b8.g1;
import b8.xb;
import b8.zb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d2.t1;
import d2.v0;
import g2.l0;
import g2.n0;
import g2.y;
import gi.v5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import r0.i0;
import r0.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class q implements r0.m, hf.b, OnCompleteListener, h6.a, SuccessContinuation, i6.n, b4.m, e3.i {
    public Object a;
    public Object b;

    public /* synthetic */ q(Context context) {
        this.a = context;
    }

    public static String I(q qVar) {
        Collection<String> collection = (Collection) qVar.b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                i6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!i6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i3 = 0; i3 < str2.length(); i3++) {
                        char charAt = str2.charAt(i3);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void c(q qVar, boolean z10, boolean z11) {
        synchronized (qVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) qVar.b) == null) {
                    if (((Context) qVar.a).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        g2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) qVar.a).getSystemService("power");
                    if (powerManager == null) {
                        g2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        qVar.b = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) qVar.b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void d(q qVar, k2.c cVar) {
        qVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qVar.a).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!e(cVar, list).equals(e((k2.c) qVar.b, list))) {
                throw null;
            }
        }
        qVar.b = cVar;
    }

    public static k2.c e(k2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new k2.c(hashMap);
    }

    public static boolean f(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (androidx.emoji2.text.w[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.w.class)) != null && wVarArr.length > 0) {
                for (androidx.emoji2.text.w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // hf.b
    public hf.a A(q qVar) {
        List list = (List) this.b;
        List list2 = (List) qVar.a;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new bd.j(qVar, (List) this.a, list);
    }

    @Override // b4.m
    public /* synthetic */ b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    public void C(androidx.mediarouter.app.q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.b).add(qVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        qVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.a;
        hVar.a.registerCallback(qVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                hVar.d.put(qVar, gVar);
                qVar.c = gVar;
                try {
                    hVar.e.a().p(gVar);
                    qVar.e(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                qVar.c = null;
                hVar.c.add(qVar);
            }
        }
    }

    public void D(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.a;
        synchronized (lVar.d) {
            lVar.l = sVar;
            lVar.a.setCallback((android.support.v4.media.session.r) sVar.e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void E(int i3) {
        try {
            k8.e eVar = (k8.e) this.a;
            Parcel P0 = eVar.P0();
            P0.writeInt(i3);
            eVar.T0(P0, 16);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x039b, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0116, code lost:
    
        if (")".equals(k4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // b4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(byte[] bArr, int i3, int i10, b4.l lVar, g2.k kVar) {
        k4.c cVar;
        String str;
        String sb2;
        char c2;
        int i11;
        q qVar = this;
        y yVar = (y) qVar.a;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        ArrayList arrayList = new ArrayList();
        try {
            k4.i.d(yVar);
            while (!TextUtils.isEmpty(yVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i12 = -1;
                int i13 = 0;
                char c10 = 65535;
                while (true) {
                    int i14 = 1;
                    if (c10 == 65535) {
                        i13 = yVar.b;
                        String n4 = yVar.n(StandardCharsets.UTF_8);
                        c10 = n4 == null ? (char) 0 : "STYLE".equals(n4) ? (char) 2 : n4.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        yVar.N(i13);
                        if (c10 == 0) {
                            k4.j jVar = new k4.j();
                            jVar.a = DesugarCollections.unmodifiableList(new ArrayList(arrayList2));
                            jVar.b = new long[arrayList2.size() * 2];
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                k4.c cVar2 = (k4.c) arrayList2.get(i15);
                                int i16 = i15 * 2;
                                long[] jArr = (long[]) jVar.b;
                                jArr[i16] = cVar2.b;
                                jArr[i16 + 1] = cVar2.c;
                            }
                            long[] jArr2 = (long[]) jVar.b;
                            long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                            jVar.c = copyOf;
                            Arrays.sort(copyOf);
                            g1.b(jVar, lVar, kVar);
                            return;
                        }
                        if (c10 == 1) {
                            while (!TextUtils.isEmpty(yVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c10 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                yVar.n(StandardCharsets.UTF_8);
                                k4.a aVar = (k4.a) qVar.b;
                                y yVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i17 = yVar.b;
                                while (!TextUtils.isEmpty(yVar.n(StandardCharsets.UTF_8))) {
                                }
                                yVar2.L(yVar.b, yVar.a);
                                yVar2.N(i17);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    k4.a.c(yVar2);
                                    if (yVar2.a() >= 5 && "::cue".equals(yVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i18 = yVar2.b;
                                        String b10 = k4.a.b(yVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                yVar2.N(i18);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i19 = yVar2.b;
                                                int i20 = yVar2.c;
                                                int i21 = z10 ? 1 : 0;
                                                while (i19 < i20 && i21 == 0) {
                                                    int i22 = i19 + 1;
                                                    i21 = ((char) yVar2.a[i19]) == ')' ? i14 : z10 ? 1 : 0;
                                                    i19 = i22;
                                                }
                                                str = yVar2.y((i19 - 1) - yVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(k4.a.b(yVar2, sb3))) {
                                                k4.b bVar = new k4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str2;
                                                bVar.g = z10;
                                                bVar.i = z10;
                                                bVar.j = i12;
                                                bVar.k = i12;
                                                bVar.l = i12;
                                                bVar.m = i12;
                                                bVar.n = i12;
                                                bVar.p = i12;
                                                bVar.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i12) {
                                                        Matcher matcher = k4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i14);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = n0.a;
                                                    String[] split = str.split("\\.", i12);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        bVar.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > i14) {
                                                        int length = split.length;
                                                        zb.f(length <= split.length ? i14 : z10 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i14, length)));
                                                    }
                                                }
                                                boolean z11 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                ?? r9 = i14;
                                                while (z11 == 0) {
                                                    int i23 = yVar2.b;
                                                    str5 = k4.a.b(yVar2, sb3);
                                                    boolean z12 = (str5 == null || "}".equals(str5)) ? r9 : z10;
                                                    if (z12 == 0) {
                                                        yVar2.N(i23);
                                                        k4.a.c(yVar2);
                                                        String a10 = k4.a.a(yVar2, sb3);
                                                        if (!a10.isEmpty() && ":".equals(k4.a.b(yVar2, sb3))) {
                                                            k4.a.c(yVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z13 = false;
                                                            while (true) {
                                                                if (z13) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i24 = yVar2.b;
                                                                    String b11 = k4.a.b(yVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        yVar2.N(i24);
                                                                        z13 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i25 = yVar2.b;
                                                                String b12 = k4.a.b(yVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        yVar2.N(i25);
                                                                    } else {
                                                                        continue;
                                                                    }
                                                                }
                                                                if ("color".equals(a10)) {
                                                                    bVar.f = g2.i.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else if ("background-color".equals(a10)) {
                                                                    bVar.h = g2.i.a(sb2, true);
                                                                    bVar.i = true;
                                                                } else if ("ruby-position".equals(a10)) {
                                                                    if ("over".equals(sb2)) {
                                                                        bVar.p = 1;
                                                                    } else if ("under".equals(sb2)) {
                                                                        bVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a10)) {
                                                                    bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                } else if ("text-decoration".equals(a10)) {
                                                                    if ("underline".equals(sb2)) {
                                                                        bVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a10)) {
                                                                    bVar.e = xb.c(sb2);
                                                                } else if ("font-weight".equals(a10)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        bVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a10)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        bVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a10)) {
                                                                    Matcher matcher2 = k4.a.d.matcher(xb.c(sb2));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        switch (group2.hashCode()) {
                                                                            case 37:
                                                                                if (group2.equals("%")) {
                                                                                    c2 = 0;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3240:
                                                                                if (group2.equals("em")) {
                                                                                    c2 = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3592:
                                                                                if (group2.equals("px")) {
                                                                                    c2 = 2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        c2 = 65535;
                                                                        switch (c2) {
                                                                            case 0:
                                                                                i11 = 1;
                                                                                bVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i11 = 1;
                                                                                bVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i11 = 1;
                                                                                bVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i11);
                                                                        group3.getClass();
                                                                        bVar.o = Float.parseFloat(group3);
                                                                    } else {
                                                                        g2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z11 = z12;
                                                    z10 = false;
                                                    r9 = 1;
                                                }
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                z10 = false;
                                                i12 = -1;
                                                str2 = null;
                                                i14 = 1;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c10 == 3) {
                                Pattern pattern = k4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n10 = yVar.n(charset);
                                if (n10 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = k4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n10);
                                    if (matcher3.matches()) {
                                        cVar = k4.h.d(null, matcher3, yVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n11 = yVar.n(charset);
                                        if (n11 != null) {
                                            Matcher matcher4 = pattern2.matcher(n11);
                                            if (matcher4.matches()) {
                                                cVar = k4.h.d(n10.trim(), matcher4, yVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            qVar = this;
                        }
                    }
                }
            }
        } catch (v0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void G(w wVar) {
        l lVar = (l) this.a;
        lVar.g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f.getBroadcastItem(beginBroadcast)).u0(wVar);
                } catch (RemoteException | SecurityException e10) {
                    g2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            lVar.f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.a;
        if (wVar.x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.a, wVar.b, wVar.d, wVar.n);
            builder.setBufferedPosition(wVar.c);
            builder.setActions(wVar.e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.a, vVar.b, vVar.c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.s);
            builder.setExtras(wVar.w);
            wVar.x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.x);
    }

    public void H(androidx.mediarouter.app.q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.b).remove(qVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.a).b(qVar);
        } finally {
            qVar.f(null);
        }
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        b5.l lVar = (b5.l) this.b;
        k1 g7 = i0.g(view, k1Var);
        if (g7.a.n()) {
            return g7;
        }
        Rect rect = (Rect) this.a;
        rect.left = g7.b();
        rect.top = g7.d();
        rect.right = g7.c();
        rect.bottom = g7.a();
        int childCount = lVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            k1 b10 = i0.b(lVar.getChildAt(i3), g7);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g7.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // b4.m
    public int Y() {
        return 1;
    }

    @Override // e3.i
    public e3.h a(e3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        y yVar = (y) this.b;
        yVar.K(min);
        pVar.c(0, min, yVar.a);
        int i3 = -1;
        int i10 = -1;
        long j11 = -9223372036854775807L;
        while (yVar.a() >= 4) {
            if (j3.a.a(yVar.b, yVar.a) != 442) {
                yVar.O(1);
            } else {
                yVar.O(4);
                long c2 = l4.x.c(yVar);
                if (c2 != -9223372036854775807L) {
                    long b10 = ((l0) this.a).b(c2);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new e3.h(b10, -1, position) : new e3.h(-9223372036854775807L, 0, position + i10);
                    }
                    if (b10 + 100000 > j10) {
                        return new e3.h(-9223372036854775807L, 0, position + yVar.b);
                    }
                    j11 = b10;
                    i10 = yVar.b;
                }
                int i11 = yVar.c;
                if (yVar.a() >= 10) {
                    yVar.O(9);
                    int A = yVar.A() & 7;
                    if (yVar.a() >= A) {
                        yVar.O(A);
                        if (yVar.a() >= 4) {
                            if (j3.a.a(yVar.b, yVar.a) == 443) {
                                yVar.O(4);
                                int H = yVar.H();
                                if (yVar.a() < H) {
                                    yVar.N(i11);
                                } else {
                                    yVar.O(H);
                                }
                            }
                            while (true) {
                                if (yVar.a() < 4) {
                                    break;
                                }
                                int a10 = j3.a.a(yVar.b, yVar.a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                yVar.O(4);
                                if (yVar.a() < 2) {
                                    yVar.N(i11);
                                    break;
                                }
                                yVar.N(Math.min(yVar.c, yVar.b + yVar.H()));
                            }
                        } else {
                            yVar.N(i11);
                        }
                    } else {
                        yVar.N(i11);
                    }
                } else {
                    yVar.N(i11);
                }
                i3 = yVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new e3.h(j11, -2, position + i3) : e3.h.d;
    }

    @Override // e3.i
    public void b() {
        y yVar = (y) this.b;
        byte[] bArr = n0.b;
        yVar.getClass();
        yVar.L(bArr.length, bArr);
    }

    public void g(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.g(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void h(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.a;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.h(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // i6.n
    public void i(String str, long j10, long j11, long j12) {
        i6.n nVar = (i6.n) this.a;
        if (nVar != null) {
            nVar.i(str, j10, j11, j12);
        }
    }

    public void j(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.j(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void k(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.k(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void l(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.l(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void m(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.m(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.a;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void o(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        c9.c cVar = (c9.c) this.a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // i6.n
    public void p(String str, long j10, int i3, Object obj, long j11, long j12) {
        int i10;
        i6.m mVar = (i6.m) this.b;
        if (((i6.n) this.a) != null) {
            if (i3 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                i6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((g6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((g6.g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i3;
            }
            ((i6.n) this.a).p(str, j10, i10, obj, j11, j12);
        }
    }

    public void q(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void r(androidx.fragment.app.s f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.r(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void s(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void t(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        ha.c cVar = (ha.c) this.b;
        JSONObject jSONObject = (JSONObject) ((aa.g) this.a).c.a.submit(new d5.f(this, 1)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            ha.b k02 = ((v5) cVar.c).k0(jSONObject);
            android.support.v4.media.c cVar2 = (android.support.v4.media.c) cVar.e;
            long j10 = k02.c;
            cVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar2.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        z9.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    z9.g.b(fileWriter, "Failed to close settings writer.");
                    ha.c.d("Loaded settings: ", jSONObject);
                    String str = (String) ((ha.e) cVar.b).f;
                    SharedPreferences.Editor edit = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    ((AtomicReference) cVar.h).set(k02);
                    ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(k02);
                    return Tasks.forResult(null);
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                z9.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            z9.g.b(fileWriter, "Failed to close settings writer.");
            ha.c.d("Loaded settings: ", jSONObject);
            String str2 = (String) ((ha.e) cVar.b).f;
            SharedPreferences.Editor edit2 = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ((AtomicReference) cVar.h).set(k02);
            ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(k02);
        }
        return Tasks.forResult(null);
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public e3.o v(Object... objArr) {
        Constructor a10;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    a10 = ((t1) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        try {
            return (e3.o) a10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public synchronized Map w() {
        try {
            if (((Map) this.b) == null) {
                this.b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.b;
    }

    public android.support.v4.media.session.m x() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.a).a.getTransportControls();
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 29 ? new android.support.v4.media.session.o(transportControls) : i3 >= 24 ? new android.support.v4.media.session.n(transportControls) : new android.support.v4.media.session.m(transportControls);
    }

    public boolean y(CharSequence charSequence, int i3, int i10, androidx.emoji2.text.p pVar) {
        if (pVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.b;
            r1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i3 < i10) {
                sb2.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = dVar.a;
            String sb3 = sb2.toString();
            int i11 = i0.c.a;
            pVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return pVar.c == 2;
    }

    @Override // h6.a
    public void z(Bitmap bitmap) {
        tf.b bVar = (tf.b) this.a;
        bVar.b = bitmap;
        h6.f fVar = (h6.f) this.b;
        fVar.l = bVar;
        fVar.b();
    }

    public /* synthetic */ q(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z10) {
        this.a = obj2;
        this.b = obj;
    }

    public q(int i3) {
        switch (i3) {
            case 23:
                this.a = new HashMap();
                break;
            case 24:
            case 25:
            default:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
            case 26:
                this.a = new HashMap();
                this.b = k2.c.b;
                break;
            case 27:
                this.a = new y();
                this.b = new k4.a();
                break;
        }
    }

    public q(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new l6.f(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    @Override // b4.m
    public /* synthetic */ void reset() {
    }

    public q(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.b = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public q(t1 t1Var) {
        this.a = t1Var;
        this.b = new AtomicBoolean(false);
    }
}
