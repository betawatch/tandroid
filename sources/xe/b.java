package xe;

import a0.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.emoji2.text.o;
import androidx.emoji2.text.u;
import c2.d0;
import c2.e0;
import c7.m;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.clearcut.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import d5.p;
import f2.o1;
import f2.s1;
import f2.t1;
import f2.u1;
import g.r;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l.b0;
import m1.j;
import n5.i;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc;
import org.telegram.ui.PhotoViewer;
import r0.j0;
import r0.m0;
import r0.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements i, s, l, OnCompleteListener, h, y2.b, SuccessContinuation {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public static b D() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0, (byte) 0);
                    d = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z10) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public byte[] A(b4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            String str = aVar.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    public View B(int i10, int i11, int i12, int i13) {
        s1 s1Var = (s1) this.c;
        t1 t1Var = (t1) this.b;
        int n10 = t1Var.n();
        int v = t1Var.v();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View A = t1Var.A(i10);
            int f10 = t1Var.f(A);
            int G = t1Var.G(A);
            s1Var.b = n10;
            s1Var.c = v;
            s1Var.d = f10;
            s1Var.e = G;
            if (i12 != 0) {
                s1Var.a = i12;
                if (s1Var.a()) {
                    return A;
                }
            }
            if (i13 != 0) {
                s1Var.a = i13;
                if (s1Var.a()) {
                    view = A;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File C() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        t8.h hVar = (t8.h) this.c;
                        hVar.a();
                        this.b = new File(hVar.a.getFilesDir(), "PersistedInstallation." + ((t8.h) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public synchronized Map E() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean F(CharSequence charSequence, int i10, int i11, o oVar) {
        boolean z10;
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            short s10 = a2 != 0 ? ((ByteBuffer) b10.d).getShort(a2 + b10.a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s10 <= i12) {
                ThreadLocal threadLocal = androidx.emoji2.text.d.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = (StringBuilder) threadLocal.get();
                sb2.setLength(0);
                while (i10 < i11) {
                    sb2.append(charSequence.charAt(i10));
                    i10++;
                }
                TextPaint textPaint = dVar.a;
                String sb3 = sb2.toString();
                ThreadLocal threadLocal2 = i0.d.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = e0.b.l(textPaint, sb3);
                } else {
                    int length = sb3.length();
                    if (length != 1 || !Character.isWhitespace(sb3.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb3);
                        float f10 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb3.codePointCount(0, sb3.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i13)) + i13;
                                        f10 += textPaint.measureText(sb3, i13, charCount);
                                        i13 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal3 = i0.d.a;
                                q0.b bVar = (q0.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new q0.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    ((Rect) bVar.a).setEmpty();
                                    ((Rect) bVar.b).setEmpty();
                                }
                                Object obj = bVar.b;
                                Rect rect = (Rect) bVar.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                textPaint.getTextBounds(sb3, 0, length, (Rect) obj);
                                z10 = !rect.equals(obj);
                            }
                        }
                    }
                    z10 = true;
                }
                oVar.c = !z10 ? 2 : 1;
            }
            z10 = false;
            oVar.c = !z10 ? 2 : 1;
        }
        return oVar.c == 2;
    }

    public void G(aa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", j.b(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            t8.h hVar = (t8.h) this.c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(C())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean H() {
        return ((a) ((u2.b) this.b).b) != null;
    }

    public boolean I(View view) {
        s1 s1Var = (s1) this.c;
        t1 t1Var = (t1) this.b;
        int n10 = t1Var.n();
        int v = t1Var.v();
        int f10 = t1Var.f(view);
        int G = t1Var.G(view);
        s1Var.b = n10;
        s1Var.c = v;
        s1Var.d = f10;
        s1Var.e = G;
        s1Var.a = 24579;
        return s1Var.a();
    }

    public void J(k.a aVar) {
        t tVar = (t) this.b;
        ((ActionMode.Callback) tVar.b).onDestroyActionMode(tVar.r(aVar));
        r rVar = (r) this.c;
        if (rVar.A != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.B);
        }
        if (rVar.y != null) {
            m0 m0Var = rVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = j0.a(rVar.y);
            a2.a(0.0f);
            rVar.C = a2;
            a2.d(new g.j(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.F;
        WeakHashMap weakHashMap = j0.a;
        z.c(viewGroup);
        rVar.y();
    }

    public boolean K(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((r) this.c).F;
        WeakHashMap weakHashMap = j0.a;
        z.c(viewGroup);
        t tVar = (t) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) tVar.b;
        k.e r10 = tVar.r(aVar);
        k kVar = (k) tVar.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) tVar.c, (l.l) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r10, menu2);
    }

    public p L(o1 o1Var, int i10) {
        u1 u1Var;
        p pVar;
        a0.f fVar = (a0.f) this.b;
        int c10 = fVar.c(o1Var);
        if (c10 >= 0 && (u1Var = (u1) fVar.h(c10)) != null) {
            int i11 = u1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                u1Var.a = i12;
                if (i10 == 4) {
                    pVar = u1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pVar = u1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    u1Var.a = 0;
                    u1Var.b = null;
                    u1Var.c = null;
                    u1.d.j(u1Var);
                }
                return pVar;
            }
        }
        return null;
    }

    public aa.b M() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(C());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = j.c(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new aa.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void N(o1 o1Var) {
        u1 u1Var = (u1) ((a0.f) this.b).get(o1Var);
        if (u1Var == null) {
            return;
        }
        u1Var.a &= -2;
    }

    public void O(o1 o1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (o1Var == hVar.n(m10)) {
                Object[] objArr = hVar.c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.a = true;
                }
            } else {
                m10--;
            }
        }
        u1 u1Var = (u1) fVar.get(o1Var);
        if (u1Var != null) {
            fVar.remove(o1Var);
            u1Var.a = 0;
            u1Var.b = null;
            u1Var.c = null;
            u1.d.j(u1Var);
        }
    }

    public void P(g gVar) {
        e eVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        u2.b bVar = (u2.b) this.b;
        g gVar3 = (g) bVar.d;
        if (d1.f.t()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    while (i10 < arrayList.size()) {
                        f a2 = gVar3.a(i10);
                        f a3 = gVar.a(i10);
                        i10 = ((a2 == null && a3 == null) || (a2 != null && a3 != null && Objects.equals(a2.a, a3.a) && Objects.equals(a2.b, a3.b) && Objects.equals(a2.c, a3.c) && Objects.equals(a2.d, a3.d) && a2.e == a3.e && a2.f == a3.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) bVar.b) != null && gVar != null) {
            bVar.c(gVar);
        }
        if (((a) bVar.b) != null && (gVar2 = (g) bVar.d) != null) {
            bVar.g(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (eVar = (e) bVar.c) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) bVar.b;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        bVar.d = gVar;
    }

    public void Q(n5.c cVar) {
        u2.b bVar = (u2.b) this.b;
        if (cVar == null) {
            return;
        }
        y5.l.e("Must be called from the main thread.");
        o5.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) bVar.b;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            bVar.i(new a(cVar, (n5.h) this.c, hVar));
            y5.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            e.i();
            if (t12.A == null || t12.a0 == null || !t12.Q1()) {
                return;
            }
            new mc(t12.a0, new jh.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // n5.i
    public void a(n5.g gVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((n5.c) gVar).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        c7.j jVar;
        long j10;
        long min;
        v5.c cVar;
        n nVar = (n) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        c7.l lVar = (c7.l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        lVar.getClass();
        com.google.android.gms.common.api.internal.p e9 = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = e9.c;
        nVar2.getClass();
        v5.c[] l10 = lVar.l();
        boolean z10 = false;
        if (l10 != null) {
            int length = l10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = l10[i10];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
            }
        }
        synchronized (lVar.R) {
            try {
                c7.j jVar2 = (c7.j) lVar.R.get(nVar2);
                if (jVar2 != null && !z10) {
                    jVar2.K0(e9);
                    jVar = jVar2;
                    jVar2 = null;
                    String str = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                    if (z10) {
                        c7.b0 b0Var = (c7.b0) lVar.u();
                        int i11 = locationRequest.a;
                        long j11 = locationRequest.b;
                        long j12 = locationRequest.c;
                        long j13 = locationRequest.d;
                        long j14 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f10 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j15 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        c7.k kVar = locationRequest.A;
                        String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                        if (j12 == -1) {
                            min = j11;
                            j10 = -1;
                        } else if (i11 == 105) {
                            j10 = -1;
                            min = j12;
                        } else {
                            j10 = -1;
                            min = Math.min(j12, j11);
                        }
                        c7.p pVar = new c7.p(1, new c7.o(new LocationRequest(i11, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f10, z11, j15 == j10 ? j11 : j15, i13, i14, str3, z12, new WorkSource(workSource), kVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, jVar, null, new c7.i(taskCompletionSource, jVar), str);
                        Parcel M0 = b0Var.M0();
                        c7.e.c(M0, pVar);
                        b0Var.Q0(M0, 59);
                    } else {
                        c7.b0 b0Var2 = (c7.b0) lVar.u();
                        m mVar = new m(2, jVar2 == null ? null : jVar2, jVar, null, null, str);
                        c7.f fVar = new c7.f(null, taskCompletionSource);
                        Parcel M02 = b0Var2.M0();
                        c7.e.c(M02, mVar);
                        c7.e.c(M02, locationRequest);
                        c7.e.d(M02, fVar);
                        b0Var2.Q0(M02, 88);
                    }
                }
                c7.j jVar3 = new c7.j(nVar);
                lVar.R.put(nVar2, jVar3);
                jVar = jVar3;
                String str4 = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                if (z10) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n5.i
    public void b(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((n5.c) gVar).a() + " " + i10);
    }

    @Override // n5.i
    public void c(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((n5.c) gVar).a() + " " + i10);
        ((u2.b) this.b).i(null);
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new v((Context) this.b, ((w) this.c).createDataSource());
    }

    @Override // n5.i
    public void d(n5.g gVar) {
        n5.c cVar = (n5.c) gVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        Q(cVar);
    }

    @Override // n5.i
    public void e(n5.g gVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((n5.c) gVar).a() + " " + z10);
    }

    @Override // n5.i
    public void f(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((n5.c) gVar).a() + " " + i10);
    }

    public void g(o1 o1Var, p pVar) {
        a0.f fVar = (a0.f) this.b;
        u1 u1Var = (u1) fVar.get(o1Var);
        if (u1Var == null) {
            u1Var = u1.a();
            fVar.put(o1Var, u1Var);
        }
        u1Var.c = pVar;
        u1Var.a |= 8;
    }

    @Override // oc.a
    public Object get() {
        int i10 = 6;
        w9.d dVar = new w9.d(i10);
        e7.v vVar = new e7.v(i10);
        Object obj = ((oc.a) this.b).get();
        oc.a aVar = (oc.a) this.c;
        return new d3.h(dVar, vVar, d3.a.f, (d3.j) obj, aVar);
    }

    @Override // n5.i
    public void h(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((n5.c) gVar).a() + " " + i10);
    }

    @Override // n5.i
    public void i(n5.g gVar, String str) {
        n5.c cVar = (n5.c) gVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        Q(cVar);
    }

    @Override // n5.i
    public void j(n5.g gVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((n5.c) gVar).a() + " " + str);
    }

    public void k() {
        String str = (String) this.b;
        try {
            k9.c cVar = (k9.c) this.c;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e9);
        }
    }

    public void m(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new e5.v(this, fVar, 0));
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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
        boolean z10;
        n5.b bVar;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
        n5.b bVar2 = (n5.b) this.c;
        c2.b0 b0Var = pVar.c;
        r5.b bVar3 = com.google.android.gms.internal.cast.p.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                boolean z12 = !z10 && bVar2.x;
                if (b0Var != null || (bVar = pVar.d) == null) {
                }
                boolean z13 = bVar.v;
                boolean z14 = bVar.s;
                d0 d0Var = new d0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    d0Var.b = z12;
                }
                if (i10 >= 30) {
                    d0Var.d = z13;
                }
                if (i10 >= 30) {
                    d0Var.c = z14;
                }
                c2.b0.i(new e0(d0Var));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    com.google.android.gms.internal.cast.s sVar = pVar.f;
                    y5.l.h(sVar);
                    com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                    c2.b0.b();
                    c2.b0.c().f = oVar;
                    c2.a(c1.X);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
        if (z10) {
        }
        if (b0Var != null) {
        }
    }

    public void p(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.p(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void q(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void r(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.r(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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
        int i10 = 0;
        switch (this.a) {
            case 24:
                m9.a aVar = (m9.a) obj;
                f9.o oVar = ((f9.l) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{f9.o.b(oVar), oVar.m.v((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            case 25:
                m9.a aVar2 = (m9.a) obj;
                f9.m mVar = (f9.m) this.c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar = (b) mVar.c;
                b bVar2 = (b) mVar.c;
                f9.o.b((f9.o) bVar.c);
                ((f9.o) bVar2.c).m.v((Executor) this.b, null);
                ((f9.o) bVar2.c).q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((f9.o) this.c).e.R(new f9.m(i10, this, (Boolean) obj));
        }
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void v(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void w(androidx.fragment.app.s f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.w(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void x(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void y(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    public void z(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
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

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.a = 5;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 2:
                break;
            case 7:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 12:
                this.b = new HashMap();
                break;
            case 16:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 23:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            case 28:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            default:
                n5.a c10 = n5.a.c(ApplicationLoader.applicationContext);
                u3.k kVar = new u3.k(7);
                c10.getClass();
                y5.l.e("Must be called from the main thread.");
                n5.h hVar = c10.c;
                hVar.getClass();
                try {
                    n5.z zVar = hVar.a;
                    n5.k kVar2 = new n5.k(kVar);
                    Parcel M0 = zVar.M0();
                    com.google.android.gms.internal.cast.t.d(M0, kVar2);
                    zVar.Q0(M0, 4);
                } catch (RemoteException e9) {
                    n5.h.c.a(e9, "Unable to call %s on %s.", "addCastStateListener", n5.z.class.getSimpleName());
                }
                this.b = new u2.b(9);
                n5.h b11 = c10.b();
                this.c = b11;
                b11.a(this);
                Q(b11.c());
                break;
        }
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = context;
                break;
            default:
                w wVar = new w();
                this.b = context.getApplicationContext();
                this.c = wVar;
                break;
        }
    }

    public b(t8.h hVar) {
        this.a = 1;
        this.c = hVar;
    }

    public b(t tVar, xa.a aVar, androidx.emoji2.text.d dVar) {
        this.a = 3;
        this.b = tVar;
        this.c = dVar;
    }

    public b(t1 t1Var) {
        this.a = 22;
        this.b = t1Var;
        s1 s1Var = new s1();
        s1Var.a = 0;
        this.c = s1Var;
    }

    public b(int i10) {
        this.a = 21;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b(Animator animator) {
        this.a = 4;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public b(f9.l lVar, Executor executor, String str) {
        this.a = 24;
        this.c = lVar;
        this.b = executor;
    }
}
