package xa;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.g;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.p;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import bg.i2;
import c2.e;
import c2.n;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fh.o1;
import h3.t1;
import hg.r0;
import ih.d9;
import ih.i4;
import j3.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k7.d;
import k7.f;
import kh.a6;
import kh.a8;
import kh.ac;
import kh.kb;
import kh.mb;
import kh.r6;
import kh.wb;
import kh.ya;
import l.i;
import l.k;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ju0;
import t5.l;
import tf.m;
import u5.h;
import yf.b2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, o, y2.b, Continuation, w, tj0, ju0, q, s, m, ac, i, l0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public static int J(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i10);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i11 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int P(int i9, String str) {
        int V = V(i9);
        int J = J(str);
        return W(J) + J + V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void S(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i9;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i10 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c11 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i11 = i10 + 1;
                            if (i11 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i10 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i10++;
                    }
                }
                byteBuffer.put((byte) c11);
                i10++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i12 = remaining + arrayOffset;
            while (i10 < length2) {
                int i13 = i10 + arrayOffset;
                if (i13 >= i12 || (charAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                array[i13] = (byte) charAt;
                i10++;
            }
            if (i10 == length2) {
                i9 = arrayOffset + length2;
            } else {
                i9 = arrayOffset + i10;
                while (i10 < length2) {
                    char charAt4 = charSequence.charAt(i10);
                    if (charAt4 < 128 && i9 < i12) {
                        array[i9] = (byte) charAt4;
                        i9++;
                    } else if (charAt4 < 2048 && i9 <= i12 - 2) {
                        int i14 = i9 + 1;
                        array[i9] = (byte) ((charAt4 >>> 6) | 960);
                        i9 += 2;
                        array[i14] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c10 >= charAt4) || i9 > i12 - 3) {
                            if (i9 > i12 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i9);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i15 = i10 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i9] = (byte) ((codePoint2 >>> 18) | 240);
                                    array[i9 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i16 = i9 + 3;
                                    array[i9 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i9 += 4;
                                    array[i16] = (byte) ((codePoint2 & 63) | 128);
                                    i10 = i15;
                                } else {
                                    i10 = i15;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i10 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i9] = (byte) ((charAt4 >>> '\f') | 480);
                        int i17 = i9 + 2;
                        array[i9 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i9 += 3;
                        array[i17] = (byte) ((charAt4 & '?') | 128);
                    }
                    i10++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i9 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int U(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int V(int i9) {
        return W(i9 << 3);
    }

    public static int W(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        return (i9 & (-268435456)) == 0 ? 4 : 5;
    }

    public StringBuilder A() {
        ke.a aVar = (ke.a) this.b;
        if (!(aVar instanceof fe.o)) {
            return null;
        }
        StringBuilder sb2 = ((fe.o) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // kh.ac
    public void B(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.u0 = f10;
        a8Var.j = true;
        r6Var.c();
    }

    @Override // androidx.lifecycle.a0
    public void E(Object obj) {
        switch (this.a) {
            case 2:
                androidx.biometric.q qVar = (androidx.biometric.q) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    y yVar = qVar.h0;
                    if (yVar.n) {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new g(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = qVar.h0;
                    if (yVar2.u == null) {
                        yVar2.u = new z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                p pVar = (p) this.b;
                if (tVar == null || !pVar.n0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // org.telegram.ui.ju0
    public /* synthetic */ TextureView G() {
        return null;
    }

    public Boolean H() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // kh.ac
    public void H0(boolean z10) {
        r6 r6Var = (r6) this.b;
        if (r6Var.j()) {
            r6Var.A.getClass();
        }
        r6Var.x(-4, z10);
    }

    public void I(c2.q qVar, n nVar, Collection collection) {
        e eVar = (e) this.b;
        if (qVar != eVar.y || nVar == null) {
            if (qVar == eVar.e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.z zVar = eVar.x.a;
        String d = nVar.d();
        c2.a0 a0Var = new c2.a0(zVar, d, eVar.b(zVar, d), false);
        a0Var.i(nVar);
        if (eVar.d == a0Var) {
            return;
        }
        eVar.h(eVar, a0Var, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // kh.ac
    public void K(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.G = f10;
        a8Var.j = true;
        r6Var.c();
    }

    @Override // kh.ac
    public void K1(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.E = f10;
        a8Var.j = true;
        r6Var.w(true);
    }

    public void L(int i9, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        R(i9, 2);
        try {
            int W = W(str.length());
            if (W != W(str.length() * 3)) {
                O(J(str));
                S(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < W) {
                throw new z4(position + W, byteBuffer.limit());
            }
            byteBuffer.position(position + W);
            S(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            O((position2 - position) - W);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e10) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e10);
            throw z4Var;
        }
    }

    public void M(int i9, byte[] bArr) {
        R(i9, 2);
        O(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void N(int i9) {
        byte b10 = (byte) i9;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void O(int i9) {
        while ((i9 & (-128)) != 0) {
            N((i9 & 127) | 128);
            i9 >>>= 7;
        }
        N(i9);
    }

    @Override // kh.ac
    public void P0(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i9)).P = f10;
    }

    @Override // kh.ac
    public void Q(long j10, boolean z10) {
        r6 r6Var = (r6) this.b;
        if (!z10) {
            r6Var.m(j10);
            return;
        }
        k61 k61Var = r6Var.e;
        if (k61Var != null) {
            k61Var.M(j10, true);
            return;
        }
        if (r6Var.j()) {
            r6Var.A.m(j10, true);
            return;
        }
        k61 k61Var2 = r6Var.y;
        if (k61Var2 != null) {
            k61Var2.M(j10, false);
        }
    }

    public void R(int i9, int i10) {
        O((i9 << 3) | i10);
    }

    public void T(long j10) {
        while (((-128) & j10) != 0) {
            N((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        N((int) j10);
    }

    @Override // kh.ac
    public void X0(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.P = f10;
        r6Var.c();
    }

    @Override // kh.ac
    public void Y1(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i9)).W = f10;
    }

    @Override // kh.ac
    public void Z1(float f10) {
        a8 a8Var = ((r6) this.b).d;
        if (a8Var == null) {
            return;
        }
        a8Var.a0 = f10;
        a8Var.j = true;
    }

    @Override // j3.q
    public void a(long j10) {
        j3.m mVar;
        mVar = ((j3.a0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new i2(mVar, j10, 8));
        }
    }

    @Override // kh.ac
    public void a1(float f10, boolean z10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.Z = f10;
        a8Var.j = true;
        k61 k61Var = r6Var.e;
        if (k61Var == null || k61Var.q() == -9223372036854775807L) {
            return;
        }
        r6Var.m((long) (f10 * r6Var.e.q()));
    }

    @Override // kh.ac
    public void a2() {
        ((r6) this.b).q(null);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v7.c cVar = (v7.c) this.b;
        d dVar = new d(1, (TaskCompletionSource) obj2);
        k7.c cVar2 = (k7.c) ((f) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i9 = k7.a.a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        cVar.writeToParcel(obtain, 0);
        cVar2.E0(obtain, 1);
    }

    public void b(l lVar, u uVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        androidx.biometric.q qVar = (androidx.biometric.q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new androidx.biometric.q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = qVar.h0;
        yVar.f = lVar;
        int i9 = lVar.a;
        if (i9 == 0) {
            i9 = uVar != null ? 15 : 255;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || i10 >= 30 || i9 != 15 || uVar != null) {
            yVar.g = uVar;
        } else {
            yVar.g = f7.o.a();
        }
        if (qVar.Q()) {
            qVar.h0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.h0.k = null;
        }
        if (qVar.Q() && new a5.m(new h(k10, 1)).e(255) != 0) {
            qVar.h0.n = true;
            qVar.S();
        } else if (qVar.h0.p) {
            qVar.g0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // l.w
    public void c(k kVar, boolean z10) {
        g.p pVar;
        g.q qVar = (g.q) this.b;
        k k10 = kVar.k();
        int i9 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        g.p[] pVarArr = qVar.Q;
        int length = pVarArr != null ? pVarArr.length : 0;
        while (true) {
            if (i9 < length) {
                pVar = pVarArr[i9];
                if (pVar != null && pVar.h == kVar) {
                    break;
                } else {
                    i9++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (!z11) {
                qVar.h(pVar, z10);
            } else {
                qVar.f(pVar.a, pVar, k10);
                qVar.h(pVar, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public void d(View view, r0 r0Var, boolean z10, boolean z11) {
        hg.v vVar = (hg.v) this.b;
        vVar.a.ab(null, vVar.e, vVar.b, view, 0.0f, 0.0f, r0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new o1(this, 26));
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.q qVar = new j4.q();
        gVar.n.getClass();
        gVar.q.d(qVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i9 = f0Var.b;
                    androidx.fragment.app.s q10 = j0Var.c.q(str);
                    if (q10 != null) {
                        q10.x(i9, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // kh.ac
    public void g0() {
        r6 r6Var = (r6) this.b;
        r6Var.s(null, null, true);
        wb wbVar = ((kb) r6Var).y0;
        kb kbVar = wbVar.T0;
        if (kbVar != null) {
            kbVar.s(null, null, true);
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            yaVar.q0();
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            mbVar.setHasRoundVideo(false);
        }
        a8 a8Var = wbVar.G1;
        if (a8Var != null) {
            File file = a8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                wbVar.G1.o0 = null;
            }
            if (wbVar.G1.p0 != null) {
                try {
                    new File(wbVar.G1.p0).delete();
                } catch (Exception unused2) {
                }
                wbVar.G1.p0 = null;
            }
        }
    }

    @Override // nc.a
    public Object get() {
        String packageName = ((Context) ((nc.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i9) {
        long j10;
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j11 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.q qVar = new j4.q();
        int i10 = t0Var.c;
        gVar.n.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof e0) && !(iOException instanceof p0)) {
            int i11 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).a != 2008) {
                }
            }
            j10 = Math.min((i9 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            com.google.android.exoplayer2.upstream.k0 k0Var = j10 != -9223372036854775807L ? q0.f : new com.google.android.exoplayer2.upstream.k0(0, j10, false);
            gVar.q.i(qVar, i10, iOException, !k0Var.a());
            return k0Var;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        gVar.q.i(qVar, i10, iOException, !k0Var.a());
        return k0Var;
    }

    @Override // kh.ac
    public void h2(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.t0 = f10;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void i(Object obj) {
        ((q7.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // kh.ac
    public void i1(long j10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.r0 = j10;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // l.w
    public boolean j(k kVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.b;
        if (kVar != kVar.k() || !qVar.K || (callback = qVar.f.getCallback()) == null || qVar.V) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // kh.ac
    public void j1(boolean z10) {
        b2 b2Var;
        wb wbVar = ((kb) ((r6) this.b)).y0;
        ya yaVar = wbVar.r1;
        if (yaVar == null) {
            return;
        }
        b2 b2Var2 = null;
        if (!z10 && (yaVar.getSelectedEntity() instanceof b2)) {
            wbVar.r1.D0(null, true);
            return;
        }
        if (!z10 || (wbVar.r1.getSelectedEntity() instanceof b2)) {
            return;
        }
        a6 a6Var = wbVar.r1.N0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= a6Var.getChildCount()) {
                b2Var = null;
                break;
            }
            View childAt = a6Var.getChildAt(i10);
            if (childAt instanceof b2) {
                b2Var = (b2) childAt;
                break;
            }
            i10++;
        }
        if (b2Var != null) {
            ya yaVar2 = wbVar.r1;
            a6 a6Var2 = yaVar2.N0;
            while (true) {
                if (i9 >= a6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = a6Var2.getChildAt(i9);
                if (childAt2 instanceof b2) {
                    b2Var2 = (b2) childAt2;
                    break;
                }
                i9++;
            }
            yaVar2.D0(b2Var2, true);
        }
    }

    @Override // kh.ac
    public void j2(int i9, long j10) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i9)).X = j10;
    }

    @Override // kh.ac
    public void k(int i9) {
        kh.f0 f0Var = ((r6) this.b).A;
        if (f0Var != null) {
            ArrayList arrayList = f0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kh.e0 e0Var = (kh.e0) obj;
                if (e0Var.a == i9) {
                    e0Var.b.d(1.0f, true);
                    f0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // l.i
    public void l(k kVar) {
        android.support.v4.media.c cVar = ((ActionMenuView) this.b).G;
        if (cVar != null) {
            cVar.l(kVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.q qVar = new j4.q();
        gVar.n.getClass();
        gVar.q.f(qVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        n4.c cVar = (n4.c) t0Var.f;
        n4.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i9 = 0;
        while (i9 < size && gVar.H.b(i9).b < j13) {
            i9++;
        }
        if (cVar.d) {
            if (size - i9 > cVar.m.size()) {
                d5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.N;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.M = 0;
                } else {
                    d5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                }
            }
            int i10 = gVar.M;
            gVar.M = i10 + 1;
            if (i10 < gVar.n.l3(t0Var.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new z4();
                return;
            }
        }
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j10 - j11;
        gVar.K = j10;
        synchronized (gVar.t) {
            try {
                if (t0Var.b.a == gVar.F) {
                    Uri uri2 = gVar.H.k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.c;
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            gVar.O += i9;
            gVar.u(true);
            return;
        }
        n4.c cVar3 = gVar.H;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        b9.c cVar4 = cVar3.i;
        if (cVar4 == null) {
            gVar.t();
            return;
        }
        String str = cVar4.b;
        if (d5.f0.a(str, "urn:mpeg:dash:utc:direct:2014") || d5.f0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = d5.f0.K(cVar4.c) - gVar.K;
                gVar.u(true);
                return;
            } catch (t1 e10) {
                d5.a.p("DashMediaSource", "Failed to resolve time offset.", e10);
                gVar.u(true);
                return;
            }
        }
        if (d5.f0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || d5.f0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            t0 t0Var2 = new t0(gVar.z, Uri.parse(cVar4.c), 5, new m4.f());
            gVar.A.f(t0Var2, new m4.d(gVar), 1);
            gVar.q.k(new j4.q(t0Var2.b), t0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d5.f0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || d5.f0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            t0 t0Var3 = new t0(gVar.z, Uri.parse(cVar4.c), 5, new d7.u(15));
            gVar.A.f(t0Var3, new m4.d(gVar), 1);
            gVar.q.k(new j4.q(t0Var3.b), t0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (d5.f0.a(str, "urn:mpeg:dash:utc:ntp:2014") || d5.f0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            d5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override // kh.ac
    public void m2(long j10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.D = j10;
        a8Var.j = true;
        r6Var.w(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // j3.q
    public void o(int i9, long j10, long j11) {
        j3.m mVar;
        mVar = ((j3.a0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(mVar, i9, j10, j11, 1));
        }
    }

    @Override // j3.q
    public void onSkipSilenceEnabledChanged(boolean z10) {
        j3.m mVar;
        mVar = ((j3.a0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new eh.f(5, mVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // kh.ac
    public void p1(float f10, int i9) {
        ArrayList arrayList;
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null || (arrayList = a8Var.T) == null || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        ((a8) r6Var.d.T.get(i9)).V = f10;
    }

    @Override // tf.m
    public void q() {
        ((kh.k0) this.b).d.invalidate();
    }

    @Override // l.i
    public boolean r(k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.b).L;
        if (lVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k5.i) lVar).b).S.c).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean u() {
        return false;
    }

    @Override // kh.ac
    public void u1(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.F = f10;
        a8Var.j = true;
        r6Var.w(true);
    }

    @Override // kh.ac
    public void v0(float f10) {
        r6 r6Var = (r6) this.b;
        a8 a8Var = r6Var.d;
        if (a8Var == null) {
            return;
        }
        a8Var.s0 = f10;
        a8Var.j = true;
        r6Var.y(true);
    }

    @Override // j3.q
    public void w(Exception exc) {
        j3.m mVar;
        d5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        mVar = ((j3.a0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new j3.k(mVar, exc, 1));
        }
    }

    @Override // j3.q
    public void x() {
        ((FfmpegAudioRenderer) this.b).onPositionDiscontinuity();
    }

    @Override // org.telegram.ui.ju0
    public void x0(MessageObject messageObject) {
        ((d9) ((i4) this.b).M1).f(true);
    }

    @Override // org.telegram.ui.ju0
    public void y(MessageObject messageObject) {
        ((d9) ((i4) this.b).M1).f(false);
    }

    public m5.o z() {
        m5.o oVar = (m5.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    public c(byte[] bArr, int i9) {
        this.a = 10;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i9);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(MediaInfo mediaInfo) {
        this.a = 28;
        m5.o oVar = new m5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public c(JSONObject jSONObject) {
        this.a = 28;
        this.b = new m5.o(jSONObject);
    }

    public c(Context context) {
        this.a = 21;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i9) {
        this.a = i9;
        switch (i9) {
            case 16:
                this.b = new g5.b[gf.b.values().length];
                break;
            case 17:
                break;
            case 26:
                this.b = new d5.y(10);
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // j3.q
    public /* synthetic */ void D() {
    }

    @Override // tf.m
    public void F() {
    }

    @Override // j3.q
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void t() {
    }

    public c(LaunchActivity launchActivity, Executor executor, f7.n nVar) {
        this.a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new a5.m(launchActivity).n(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // tf.m
    public void C(boolean z10) {
    }

    @Override // tf.m
    public void v(boolean z10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
