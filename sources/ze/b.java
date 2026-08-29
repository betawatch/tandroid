package ze;

import a0.k;
import a4.m;
import ah.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
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
import androidx.emoji2.text.n;
import androidx.emoji2.text.u;
import androidx.fragment.app.j0;
import c2.d0;
import c2.f0;
import c2.g0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.o;
import f2.n1;
import f2.r1;
import f2.s1;
import f2.t1;
import g.q;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;
import l.a0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;
import p5.h;
import p5.y;
import r0.m0;
import r0.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements h, m, vd.b, l, OnCompleteListener, com.google.android.gms.internal.clearcut.h, s, a3.b {
    public static volatile b c;
    public Object a;
    public Object b;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    public static b H() {
        b bVar;
        b bVar2 = c;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = c;
                if (bVar == null) {
                    bVar = new b(0, false);
                    c = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b i(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e10) {
                e = e10;
                fileLock = null;
            }
            try {
                return new b(fileChannel, fileLock);
            } catch (IOException e11) {
                e = e11;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException unused) {
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (Error e12) {
                e = e12;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            } catch (OverlappingFileLockException e13) {
                e = e13;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            fileChannel = null;
            fileLock = null;
        }
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public void A(androidx.fragment.app.s f9, Bundle bundle, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.A(f9, bundle, true);
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

    public void B(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.B(f9, true);
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

    public void C(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.C(f9, true);
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

    public void D(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.D(f9, true);
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

    public byte[] E(d4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
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

    public View F(int i10, int i11, int i12, int i13) {
        r1 r1Var = (r1) this.b;
        s1 s1Var = (s1) this.a;
        int n10 = s1Var.n();
        int s10 = s1Var.s();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View y8 = s1Var.y(i10);
            int d = s1Var.d(y8);
            int z10 = s1Var.z(y8);
            r1Var.b = n10;
            r1Var.c = s10;
            r1Var.d = d;
            r1Var.e = z10;
            if (i12 != 0) {
                r1Var.a = i12;
                if (r1Var.a()) {
                    return y8;
                }
            }
            if (i13 != 0) {
                r1Var.a = i13;
                if (r1Var.a()) {
                    view = y8;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File G() {
        if (((File) this.a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.a) == null) {
                        u8.g gVar = (u8.g) this.b;
                        gVar.a();
                        this.a = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((u8.g) this.b).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.a;
    }

    public synchronized Map I() {
        try {
            if (((Map) this.b) == null) {
                this.b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean J(CharSequence charSequence, int i10, int i11, n nVar) {
        boolean z10;
        if (nVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.b;
            p1.a b10 = nVar.b();
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
                ThreadLocal threadLocal2 = i0.c.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = e0.b.l(textPaint, sb3);
                } else {
                    int length = sb3.length();
                    if (length != 1 || !Character.isWhitespace(sb3.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb3);
                        float f9 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb3.codePointCount(0, sb3.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i13)) + i13;
                                        f9 += textPaint.measureText(sb3, i13, charCount);
                                        i13 = charCount;
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

    public void K(ba.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", m1.j.b(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            u8.g gVar = (u8.g) this.b;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(G())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean L() {
        return ((a) ((v5.c) this.a).d) != null;
    }

    public boolean M(View view) {
        r1 r1Var = (r1) this.b;
        s1 s1Var = (s1) this.a;
        int n10 = s1Var.n();
        int s10 = s1Var.s();
        int d = s1Var.d(view);
        int z10 = s1Var.z(view);
        r1Var.b = n10;
        r1Var.c = s10;
        r1Var.d = d;
        r1Var.e = z10;
        r1Var.a = 24579;
        return r1Var.a();
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        i iVar = (i) this.b;
        iVar.c.a(f9);
        iVar.d.a(f9);
        iVar.b.a(f9);
        ((Runnable) this.a).run();
    }

    public void O(k.a aVar) {
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.a;
        ((ActionMode.Callback) sVar.b).onDestroyActionMode(sVar.r(aVar));
        q qVar = (q) this.b;
        if (qVar.A != null) {
            qVar.f.getDecorView().removeCallbacks(qVar.B);
        }
        if (qVar.y != null) {
            m0 m0Var = qVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = r0.j0.a(qVar.y);
            a2.a(0.0f);
            qVar.C = a2;
            a2.d(new g.i(this, 2));
        }
        qVar.x = null;
        ViewGroup viewGroup = qVar.F;
        WeakHashMap weakHashMap = r0.j0.a;
        z.c(viewGroup);
        qVar.y();
    }

    public boolean P(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((q) this.b).F;
        WeakHashMap weakHashMap = r0.j0.a;
        z.c(viewGroup);
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.b;
        k.e r6 = sVar.r(aVar);
        k kVar = (k) sVar.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) sVar.c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r6, menu2);
    }

    public a5.e Q(n1 n1Var, int i10) {
        t1 t1Var;
        a5.e eVar;
        a0.f fVar = (a0.f) this.a;
        int c3 = fVar.c(n1Var);
        if (c3 >= 0 && (t1Var = (t1) fVar.h(c3)) != null) {
            int i11 = t1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                t1Var.a = i12;
                if (i10 == 4) {
                    eVar = t1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    eVar = t1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c3);
                    t1Var.a = 0;
                    t1Var.b = null;
                    t1Var.c = null;
                    t1.d.h(t1Var);
                }
                return eVar;
            }
        }
        return null;
    }

    public ba.b R() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(G());
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
        int i10 = m1.j.c(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new ba.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void S() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void T(n1 n1Var) {
        t1 t1Var = (t1) ((a0.f) this.a).get(n1Var);
        if (t1Var == null) {
            return;
        }
        t1Var.a &= -2;
    }

    public void U(n1 n1Var) {
        a0.f fVar = (a0.f) this.a;
        a0.h hVar = (a0.h) this.b;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (n1Var == hVar.n(m10)) {
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
        t1 t1Var = (t1) fVar.get(n1Var);
        if (t1Var != null) {
            fVar.remove(n1Var);
            t1Var.a = 0;
            t1Var.b = null;
            t1Var.c = null;
            t1.d.h(t1Var);
        }
    }

    public void V(g gVar) {
        e eVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        v5.c cVar = (v5.c) this.a;
        g gVar3 = (g) cVar.c;
        if (d1.f.u()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    while (i10 < arrayList.size()) {
                        f a2 = gVar3.a(i10);
                        f a10 = gVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) cVar.d) != null && gVar != null) {
            cVar.a(gVar);
        }
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.c) != null) {
            cVar.g(gVar2);
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

    public void W(p5.c cVar) {
        v5.c cVar2 = (v5.c) this.a;
        if (cVar == null) {
            return;
        }
        z5.l.e("Must be called from the main thread.");
        q5.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) cVar2.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            cVar2.i(new a(cVar, (p5.g) this.b, hVar));
            z5.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            e.i();
            if (t12.A == null || t12.a0 == null || !t12.Q1()) {
                return;
            }
            new tc(t12.a0, new lh.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // p5.h
    public void a(p5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((p5.c) fVar).a() + " " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        d7.i iVar;
        long j10;
        long min;
        w5.c cVar;
        androidx.activity.n nVar = (androidx.activity.n) this.a;
        LocationRequest locationRequest = (LocationRequest) this.b;
        d7.k kVar = (d7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        p e10 = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = e10.c;
        nVar2.getClass();
        w5.c[] l10 = kVar.l();
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
        synchronized (kVar.R) {
            try {
                d7.i iVar2 = (d7.i) kVar.R.get(nVar2);
                if (iVar2 != null && !z10) {
                    iVar2.K0(e10);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                    if (z10) {
                        d7.z zVar = (d7.z) kVar.u();
                        int i11 = locationRequest.a;
                        long j11 = locationRequest.b;
                        long j12 = locationRequest.c;
                        long j13 = locationRequest.d;
                        long j14 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f9 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j15 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        d7.j jVar = locationRequest.A;
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
                        o oVar = new o(1, new d7.n(new LocationRequest(i11, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f9, z11, j15 == j10 ? j11 : j15, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new d7.h(taskCompletionSource, iVar), str);
                        Parcel M0 = zVar.M0();
                        d7.d.c(M0, oVar);
                        zVar.Q0(M0, 59);
                    } else {
                        d7.z zVar2 = (d7.z) kVar.u();
                        d7.l lVar = new d7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        d7.e eVar = new d7.e(null, taskCompletionSource);
                        Parcel M02 = zVar2.M0();
                        d7.d.c(M02, lVar);
                        d7.d.c(M02, locationRequest);
                        d7.d.d(M02, eVar);
                        zVar2.Q0(M02, 88);
                    }
                }
                d7.i iVar3 = new d7.i(nVar);
                kVar.R.put(nVar2, iVar3);
                iVar = iVar3;
                String str4 = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p5.h
    public void b(p5.f fVar) {
        p5.c cVar = (p5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        W(cVar);
    }

    @Override // p5.h
    public void c(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((p5.c) fVar).a() + " " + i10);
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new v((Context) this.a, ((w) this.b).createDataSource());
    }

    @Override // p5.h
    public void d(p5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((p5.c) fVar).a());
    }

    @Override // p5.h
    public void e(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((p5.c) fVar).a() + " " + i10);
    }

    @Override // p5.h
    public void f(p5.f fVar, String str) {
        p5.c cVar = (p5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        W(cVar);
    }

    @Override // p5.h
    public void g(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((p5.c) fVar).a() + " " + i10);
        ((v5.c) this.a).i(null);
    }

    @Override // pc.a
    public Object get() {
        int i10 = 8;
        f7.v vVar = new f7.v(i10);
        bb.a aVar = new bb.a(i10);
        Object obj = ((pc.a) this.a).get();
        pc.a aVar2 = (pc.a) this.b;
        return new f3.h(vVar, aVar, f3.a.f, (f3.j) obj, aVar2);
    }

    @Override // p5.h
    public void h(p5.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((p5.c) fVar).a() + " " + z10);
    }

    @Override // p5.h
    public void j(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((p5.c) fVar).a() + " " + i10);
    }

    public void k(n1 n1Var, a5.e eVar) {
        a0.f fVar = (a0.f) this.a;
        t1 t1Var = (t1) fVar.get(n1Var);
        if (t1Var == null) {
            t1Var = t1.a();
            fVar.put(n1Var, t1Var);
        }
        t1Var.c = eVar;
        t1Var.a |= 8;
    }

    @Override // a4.m
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a4.c x(a4.l lVar) {
        MediaCodec mediaCodec;
        String str = lVar.a.a;
        a4.c cVar = null;
        try {
            f5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                a4.c cVar2 = new a4.c(mediaCodec, (HandlerThread) ((a4.b) this.a).get(), (HandlerThread) ((a4.b) this.b).get());
                try {
                    f5.a.q();
                    a4.c.i(cVar2, lVar.b, lVar.d, lVar.e);
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public void n(m3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new g5.w(this, fVar, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList o() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        m5.i iVar = (m5.i) this.b;
        Context context = (Context) this.a;
        Class cls = (Class) iVar.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a9.d((String) it.next(), 0));
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        p5.b bVar;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.a;
        p5.b bVar2 = (p5.b) this.b;
        d0 d0Var = qVar.c;
        s5.b bVar3 = com.google.android.gms.internal.cast.q.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                boolean z12 = !z10 && bVar2.x;
                if (d0Var != null || (bVar = qVar.d) == null) {
                }
                boolean z13 = bVar.v;
                boolean z14 = bVar.s;
                f0 f0Var = new f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    f0Var.b = z12;
                }
                if (i10 >= 30) {
                    f0Var.d = z13;
                }
                if (i10 >= 30) {
                    f0Var.c = z14;
                }
                d0.i(new g0(f0Var));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    t tVar = qVar.f;
                    z5.l.h(tVar);
                    com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                    d0.b();
                    d0.c().f = pVar;
                    e2.a(e1.X);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
        if (z10) {
        }
        if (d0Var != null) {
        }
    }

    public void p(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.p(f9, true);
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

    public void q(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        j0 j0Var = (j0) this.a;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.q(f9, true);
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

    public void r(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.r(f9, true);
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

    public void s(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.s(f9, true);
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

    public void t(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.t(f9, true);
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

    public void u(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.u(f9, true);
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

    public void v(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        j0 j0Var = (j0) this.a;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.v(f9, true);
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

    public void w(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.w(f9, true);
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

    public void y(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.a).y;
        if (sVar != null) {
            sVar.p().o.y(f9, true);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // vd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(float f9, int i10) {
        boolean z10;
        i iVar = (i) this.b;
        boolean z11 = true;
        if ((iVar.b() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f9 == 1.0f) {
            int i11 = iVar.w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.w = i12;
                if (z11) {
                    ((Runnable) this.a).run();
                }
                iVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        iVar.a();
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.a;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.b;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue() : false ? bVar.b() : bVar.e;
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

    public /* synthetic */ b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ b(Object obj, boolean z10) {
        this.a = obj;
        this.b = null;
    }

    public b(int i10, boolean z10) {
        switch (i10) {
            case 7:
                break;
            case 14:
                this.a = new HashMap();
                break;
            case 18:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
            case 19:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            case 24:
                this.a = new a0.f(0);
                this.b = new a0.h();
                break;
            default:
                p5.a c3 = p5.a.c(ApplicationLoader.applicationContext);
                sg.j jVar = new sg.j(18);
                c3.getClass();
                z5.l.e("Must be called from the main thread.");
                p5.g gVar = c3.c;
                gVar.getClass();
                try {
                    y yVar = gVar.a;
                    p5.j jVar2 = new p5.j(jVar);
                    Parcel M0 = yVar.M0();
                    com.google.android.gms.internal.cast.u.d(M0, jVar2);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e10) {
                    p5.g.c.a(e10, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.a = new v5.c(12);
                p5.g b10 = c3.b();
                this.b = b10;
                b10.a(this);
                W(b10.c());
                break;
        }
    }

    public b(s1 s1Var) {
        this.a = s1Var;
        r1 r1Var = new r1();
        r1Var.a = 0;
        this.b = r1Var;
    }

    public b(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }
}
