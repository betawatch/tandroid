package we;

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
import androidx.activity.o;
import androidx.emoji2.text.n;
import androidx.emoji2.text.u;
import b7.c0;
import b7.j;
import b7.m;
import c2.e0;
import c2.f0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import d5.p;
import e5.x;
import f2.q1;
import f2.u1;
import f2.v1;
import f2.w1;
import g.i;
import g.q;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
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
import l.a0;
import n5.h;
import n5.y;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.PhotoViewer;
import r0.j0;
import r0.m0;
import r0.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements h, s, l, OnCompleteListener, com.google.android.gms.internal.clearcut.h, y2.b, SuccessContinuation {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    public static b C() {
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
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public View B(int i9, int i10, int i11, int i12) {
        u1 u1Var = (u1) this.c;
        v1 v1Var = (v1) this.b;
        int l10 = v1Var.l();
        int u10 = v1Var.u();
        int i13 = i10 > i9 ? 1 : -1;
        View view = null;
        while (i9 != i10) {
            View z10 = v1Var.z(i9);
            int c10 = v1Var.c(z10);
            int B = v1Var.B(z10);
            u1Var.b = l10;
            u1Var.c = u10;
            u1Var.d = c10;
            u1Var.e = B;
            if (i11 != 0) {
                u1Var.a = i11;
                if (u1Var.a()) {
                    return z10;
                }
            }
            if (i12 != 0) {
                u1Var.a = i12;
                if (u1Var.a()) {
                    view = z10;
                }
            }
            i9 += i13;
        }
        return view;
    }

    public synchronized Map D() {
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
    public boolean E(CharSequence charSequence, int i9, int i10, n nVar) {
        boolean z10;
        if (nVar.c == 0) {
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.c;
            p1.a b10 = nVar.b();
            int a2 = b10.a(8);
            short s10 = a2 != 0 ? ((ByteBuffer) b10.d).getShort(a2 + b10.a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) gVar;
            dVar.getClass();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 || s10 <= i11) {
                ThreadLocal threadLocal = androidx.emoji2.text.d.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = (StringBuilder) threadLocal.get();
                sb2.setLength(0);
                while (i9 < i10) {
                    sb2.append(charSequence.charAt(i9));
                    i9++;
                }
                TextPaint textPaint = dVar.a;
                String sb3 = sb2.toString();
                ThreadLocal threadLocal2 = i0.c.a;
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
                                    int i12 = 0;
                                    while (i12 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i12)) + i12;
                                        f10 += textPaint.measureText(sb3, i12, charCount);
                                        i12 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal3 = i0.c.a;
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
                nVar.c = !z10 ? 2 : 1;
            }
            z10 = false;
            nVar.c = !z10 ? 2 : 1;
        }
        return nVar.c == 2;
    }

    public boolean F() {
        return ((a) ((t5.c) this.b).d) != null;
    }

    public boolean G(View view) {
        u1 u1Var = (u1) this.c;
        v1 v1Var = (v1) this.b;
        int l10 = v1Var.l();
        int u10 = v1Var.u();
        int c10 = v1Var.c(view);
        int B = v1Var.B(view);
        u1Var.b = l10;
        u1Var.c = u10;
        u1Var.d = c10;
        u1Var.e = B;
        u1Var.a = 24579;
        return u1Var.a();
    }

    public void H(k.a aVar) {
        t tVar = (t) this.b;
        ((ActionMode.Callback) tVar.b).onDestroyActionMode(tVar.r(aVar));
        q qVar = (q) this.c;
        if (qVar.A != null) {
            qVar.f.getDecorView().removeCallbacks(qVar.B);
        }
        if (qVar.y != null) {
            m0 m0Var = qVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = j0.a(qVar.y);
            a2.a(0.0f);
            qVar.C = a2;
            a2.d(new i(this, 2));
        }
        qVar.x = null;
        ViewGroup viewGroup = qVar.F;
        WeakHashMap weakHashMap = j0.a;
        z.c(viewGroup);
        qVar.y();
    }

    public boolean I(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((q) this.c).F;
        WeakHashMap weakHashMap = j0.a;
        z.c(viewGroup);
        t tVar = (t) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) tVar.b;
        k.e r10 = tVar.r(aVar);
        k kVar = (k) tVar.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) tVar.c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r10, menu2);
    }

    public p J(q1 q1Var, int i9) {
        w1 w1Var;
        p pVar;
        a0.f fVar = (a0.f) this.b;
        int c10 = fVar.c(q1Var);
        if (c10 >= 0 && (w1Var = (w1) fVar.h(c10)) != null) {
            int i10 = w1Var.a;
            if ((i10 & i9) != 0) {
                int i11 = i10 & (~i9);
                w1Var.a = i11;
                if (i9 == 4) {
                    pVar = w1Var.b;
                } else {
                    if (i9 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pVar = w1Var.c;
                }
                if ((i11 & 12) == 0) {
                    fVar.f(c10);
                    w1Var.a = 0;
                    w1Var.b = null;
                    w1Var.c = null;
                    w1.d.h(w1Var);
                }
                return pVar;
            }
        }
        return null;
    }

    public void K(q1 q1Var) {
        w1 w1Var = (w1) ((a0.f) this.b).get(q1Var);
        if (w1Var == null) {
            return;
        }
        w1Var.a &= -2;
    }

    public void L(q1 q1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (q1Var == hVar.n(m10)) {
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
        w1 w1Var = (w1) fVar.get(q1Var);
        if (w1Var != null) {
            fVar.remove(q1Var);
            w1Var.a = 0;
            w1Var.b = null;
            w1Var.c = null;
            w1.d.h(w1Var);
        }
    }

    public void M(g gVar) {
        e eVar;
        g gVar2;
        int i9;
        Log.d("CAST_CONTROLLER", "set current media");
        t5.c cVar = (t5.c) this.b;
        g gVar3 = (g) cVar.c;
        if (d1.f.t()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    while (i9 < arrayList.size()) {
                        f a2 = gVar3.a(i9);
                        f a3 = gVar.a(i9);
                        i9 = ((a2 == null && a3 == null) || (a2 != null && a3 != null && Objects.equals(a2.a, a3.a) && Objects.equals(a2.b, a3.b) && Objects.equals(a2.c, a3.c) && Objects.equals(a2.d, a3.d) && a2.e == a3.e && a2.f == a3.f)) ? i9 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) cVar.d) != null && gVar != null) {
            cVar.a(gVar);
        }
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.c) != null) {
            cVar.f(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (eVar = (e) cVar.b) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) cVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        cVar.c = gVar;
    }

    public void N(n5.c cVar) {
        t5.c cVar2 = (t5.c) this.b;
        if (cVar == null) {
            return;
        }
        x5.l.e("Must be called from the main thread.");
        o5.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) cVar2.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            cVar2.i(new a(cVar, (n5.g) this.c, hVar));
            x5.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            e.i();
            if (t12.A == null || t12.a0 == null || !t12.Q1()) {
                return;
            }
            new oc(t12.a0, new ih.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // n5.h
    public void a(n5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((n5.c) fVar).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        b7.k kVar;
        long j10;
        long min;
        u5.c cVar;
        o oVar = (o) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        m mVar = (m) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        mVar.getClass();
        com.google.android.gms.common.api.internal.p e10 = oVar.e();
        com.google.android.gms.common.api.internal.n nVar = e10.c;
        nVar.getClass();
        u5.c[] m10 = mVar.m();
        boolean z10 = false;
        if (m10 != null) {
            int length = m10.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    cVar = null;
                    break;
                }
                cVar = m10[i9];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    i9++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
            }
        }
        synchronized (mVar.R) {
            try {
                b7.k kVar2 = (b7.k) mVar.R.get(nVar);
                if (kVar2 != null && !z10) {
                    kVar2.K0(e10);
                    kVar = kVar2;
                    kVar2 = null;
                    String str = nVar.b + "@" + System.identityHashCode(nVar.a);
                    if (z10) {
                        c0 c0Var = (c0) mVar.u();
                        int i10 = locationRequest.a;
                        long j11 = locationRequest.b;
                        long j12 = locationRequest.c;
                        long j13 = locationRequest.d;
                        long j14 = locationRequest.e;
                        int i11 = locationRequest.f;
                        float f10 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j15 = locationRequest.r;
                        int i12 = locationRequest.s;
                        int i13 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        b7.l lVar = locationRequest.A;
                        String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                        if (j12 == -1) {
                            min = j11;
                            j10 = -1;
                        } else if (i10 == 105) {
                            j10 = -1;
                            min = j12;
                        } else {
                            j10 = -1;
                            min = Math.min(j12, j11);
                        }
                        b7.q qVar = new b7.q(1, new b7.p(new LocationRequest(i10, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i11, f10, z11, j15 == j10 ? j11 : j15, i12, i13, str3, z12, new WorkSource(workSource), lVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, kVar, null, new j(taskCompletionSource, kVar), str);
                        Parcel M0 = c0Var.M0();
                        b7.f.c(M0, qVar);
                        c0Var.Q0(M0, 59);
                    } else {
                        c0 c0Var2 = (c0) mVar.u();
                        b7.n nVar2 = new b7.n(2, kVar2 == null ? null : kVar2, kVar, null, null, str);
                        b7.g gVar = new b7.g(null, taskCompletionSource);
                        Parcel M02 = c0Var2.M0();
                        b7.f.c(M02, nVar2);
                        b7.f.c(M02, locationRequest);
                        b7.f.d(M02, gVar);
                        c0Var2.Q0(M02, 88);
                    }
                }
                b7.k kVar3 = new b7.k(oVar);
                mVar.R.put(nVar, kVar3);
                kVar = kVar3;
                String str4 = nVar.b + "@" + System.identityHashCode(nVar.a);
                if (z10) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n5.h
    public void b(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override // n5.h
    public void c(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((n5.c) fVar).a() + " " + i9);
        ((t5.c) this.b).i(null);
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new v((Context) this.b, ((w) this.c).createDataSource());
    }

    @Override // n5.h
    public void d(n5.f fVar) {
        n5.c cVar = (n5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        N(cVar);
    }

    @Override // n5.h
    public void e(n5.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((n5.c) fVar).a() + " " + z10);
    }

    @Override // n5.h
    public void f(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override // n5.h
    public void g(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override // nc.a
    public Object get() {
        int i9 = 7;
        ya.b bVar = new ya.b(i9);
        wa.a aVar = new wa.a(i9);
        Object obj = ((nc.a) this.b).get();
        nc.a aVar2 = (nc.a) this.c;
        return new d3.h(bVar, aVar, d3.a.f, (d3.j) obj, aVar2);
    }

    @Override // n5.h
    public void h(n5.f fVar, String str) {
        n5.c cVar = (n5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        N(cVar);
    }

    @Override // n5.h
    public void i(n5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((n5.c) fVar).a() + " " + str);
    }

    public void j(q1 q1Var, p pVar) {
        a0.f fVar = (a0.f) this.b;
        w1 w1Var = (w1) fVar.get(q1Var);
        if (w1Var == null) {
            w1Var = w1.a();
            fVar.put(q1Var, w1Var);
        }
        w1Var.c = pVar;
        w1Var.a |= 8;
    }

    public void k() {
        String str = (String) this.b;
        try {
            j9.c cVar = (j9.c) this.c;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void m(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new x(this, fVar, 0));
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.b;
        n5.b bVar2 = (n5.b) this.c;
        c2.c0 c0Var = qVar.c;
        q5.b bVar3 = com.google.android.gms.internal.cast.q.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                boolean z12 = !z10 && bVar2.x;
                if (c0Var != null || (bVar = qVar.d) == null) {
                }
                boolean z13 = bVar.v;
                boolean z14 = bVar.s;
                e0 e0Var = new e0();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    e0Var.b = z12;
                }
                if (i9 >= 30) {
                    e0Var.d = z13;
                }
                if (i9 >= 30) {
                    e0Var.c = z14;
                }
                c2.c0.i(new f0(e0Var));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    com.google.android.gms.internal.cast.t tVar = qVar.f;
                    x5.l.h(tVar);
                    com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                    c2.c0.b();
                    c2.c0.c().f = pVar;
                    d2.a(d1.X);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
        if (z10) {
        }
        if (c0Var != null) {
        }
    }

    public void p(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        int i9 = 0;
        switch (this.a) {
            case 21:
                l9.a aVar = (l9.a) obj;
                e9.o oVar = ((e9.l) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{e9.o.b(oVar), oVar.m.v((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            case 22:
                l9.a aVar2 = (l9.a) obj;
                e9.m mVar = (e9.m) this.c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar = (b) mVar.c;
                b bVar2 = (b) mVar.c;
                e9.o.b((e9.o) bVar.c);
                ((e9.o) bVar2.c).m.v((Executor) this.b, null);
                ((e9.o) bVar2.c).q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((e9.o) this.c).e.R(new e9.m(i9, this, (Boolean) obj));
        }
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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
        kotlin.jvm.internal.i.e(f10, "f");
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

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.a = 4;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(int i9, byte b10) {
        this.a = i9;
        switch (i9) {
            case 1:
                break;
            case 6:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 13:
                this.b = new HashMap();
                break;
            case 17:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 25:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            case 27:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            default:
                n5.a c10 = n5.a.c(ApplicationLoader.applicationContext);
                v0.l lVar = new v0.l(2);
                c10.getClass();
                x5.l.e("Must be called from the main thread.");
                n5.g gVar = c10.c;
                gVar.getClass();
                try {
                    y yVar = gVar.a;
                    n5.j jVar = new n5.j(lVar);
                    Parcel M0 = yVar.M0();
                    com.google.android.gms.internal.cast.u.d(M0, jVar);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e10) {
                    n5.g.c.a(e10, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.b = new t5.c(8);
                n5.g b11 = c10.b();
                this.c = b11;
                b11.a(this);
                N(b11.c());
                break;
        }
    }

    public b(Context context, int i9) {
        this.a = i9;
        switch (i9) {
            case 15:
                this.b = context;
                break;
            default:
                w wVar = new w();
                this.b = context.getApplicationContext();
                this.c = wVar;
                break;
        }
    }

    public b(t tVar, d7.u uVar, androidx.emoji2.text.d dVar) {
        this.a = 2;
        this.b = tVar;
        this.c = dVar;
    }

    public b(v1 v1Var) {
        this.a = 26;
        this.b = v1Var;
        u1 u1Var = new u1();
        u1Var.a = 0;
        this.c = u1Var;
    }

    public b(int i9) {
        this.a = 19;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b(Animator animator) {
        this.a = 3;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public b(e9.l lVar, Executor executor, String str) {
        this.a = 21;
        this.c = lVar;
        this.b = executor;
    }
}
