package rb;

import a3.d;
import a8.a1;
import a8.b1;
import a8.h0;
import ai.f1;
import ai.z0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import androidx.biometric.g;
import androidx.biometric.p;
import androidx.biometric.x;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b8.e;
import bh.x0;
import bi.dd;
import bi.p7;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.d0;
import d6.e0;
import d7.v;
import di.s3;
import di.s4;
import di.u9;
import di.v9;
import fi.m;
import fi.m6;
import fi.o6;
import h6.f;
import h6.i;
import h6.q;
import h6.s;
import h6.w;
import hb.n;
import ii.q0;
import ii.r0;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import l6.h;
import m.i1;
import o7.l1;
import o7.m1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dz0;
import org.telegram.ui.e20;
import org.telegram.ui.wn;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, r, fl0, jw0, u9, OnCompleteListener, eb0, q81, i1, g6.a, n, fb.n, q0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static int A(long j10) {
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

    public static int C(int i10) {
        return E(i10 << 3);
    }

    public static int E(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int w(int i10, String str) {
        int C = C(i10);
        int r6 = r(str);
        return E(r6) + r6 + C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void y(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c10 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                char c11 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c11 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i12 = i11 + 1;
                            if (i12 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i11 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c11);
                i11++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = remaining + arrayOffset;
            while (i11 < length2) {
                int i14 = i11 + arrayOffset;
                if (i14 >= i13 || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                array[i14] = (byte) charAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = arrayOffset + length2;
            } else {
                i10 = arrayOffset + i11;
                while (i11 < length2) {
                    char charAt4 = charSequence.charAt(i11);
                    if (charAt4 < 128 && i10 < i13) {
                        array[i10] = (byte) charAt4;
                        i10++;
                    } else if (charAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        array[i10] = (byte) ((charAt4 >>> 6) | 960);
                        i10 += 2;
                        array[i15] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c10 >= charAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    array[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    array[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    array[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i10] = (byte) ((charAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        array[i10 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        array[i18] = (byte) ((charAt4 & '?') | 128);
                    }
                    i11++;
                    c10 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public void B(boolean z10) {
        dd ddVar = (dd) this.b;
        oe.b bVar = ddVar.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        e20 e20Var = ddVar.s;
        if (e20Var != null) {
            e20Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.eb0
    public Paint.FontMetricsInt D() {
        return ((m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // di.u9
    public void G0(long j10, int i10, s3 s3Var) {
        dz0 dz0Var = (dz0) this.b;
        int i11 = ProfileStoriesView.s0;
        dz0Var.f(true, false);
        s3Var.run();
    }

    @Override // androidx.lifecycle.a0
    public void Q(Object obj) {
        switch (this.a) {
            case 3:
                p pVar = (p) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    x xVar = pVar.l0;
                    if (xVar.n) {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    x xVar2 = pVar.l0;
                    if (xVar2.u == null) {
                        xVar2.u = new z();
                    }
                    x.h(xVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                o oVar = (o) this.b;
                if (tVar == null || !oVar.r0) {
                    return;
                }
                oVar.getClass();
                throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // hb.n
    public Object U1() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new fb.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new fb.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // org.telegram.ui.Components.jw0
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((k.getCurrentActionBarHeight() / 2) * 2) + ((dd) this.b).b0, 0);
    }

    @Override // org.telegram.ui.Components.eb0
    public void X(int i10, int i11, CharSequence charSequence, boolean z10) {
        fi.g gVar = ((m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // ii.q0
    public void a(long j10) {
        ((ii.r) this.b).presentFragment(wn.ea(j10));
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                m8.a aVar = (m8.a) this.b;
                e eVar = new e(0, (TaskCompletionSource) obj2);
                b8.c cVar = (b8.c) ((b8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = b8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.F0(obtain, 2);
                return;
            case 12:
                c7.b bVar = new c7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.b);
                int i11 = o7.j.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                vVar.writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 16:
                w wVar = (w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) this.b).k;
                Parcel N0 = fVar.N0();
                com.google.android.gms.internal.cast.t.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N02 = iVar.N0();
                com.google.android.gms.internal.cast.t.d(N02, qVar);
                N02.writeStringArray(strArr);
                iVar.S0(N02, 5);
                return;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public int b1() {
        return ((dd) this.b).c0;
    }

    @Override // ii.q0
    public void c() {
        ii.r rVar = (ii.r) this.b;
        oe.b bVar = rVar.a;
        r0 r0Var = rVar.v;
        bVar.a(r0Var.n && r0Var.l == 0, true);
        rVar.d.g3.O(true);
    }

    @Override // ii.q0
    public void close() {
        ((ii.r) this.b).finishFragment();
    }

    @Override // androidx.activity.result.b
    public void d(Object obj) {
        switch (this.a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i10 = e0Var.b;
                    androidx.fragment.app.r g7 = i0Var.c.g(str);
                    if (g7 != null) {
                        g7.x(i10, aVar.a, aVar.b);
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
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public void e(k6.m mVar, androidx.biometric.t tVar) {
        j0 j0Var = (j0) this.b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        j0 j0Var2 = (j0) this.b;
        p pVar = (p) j0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            j0Var2.A(true);
            j0Var2.E();
        }
        androidx.fragment.app.u k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        x xVar = pVar.l0;
        xVar.f = mVar;
        int i10 = mVar.a;
        if (i10 == 0) {
            i10 = tVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i10 == 15 && tVar == null) {
            xVar.g = b1.a();
        } else {
            xVar.g = tVar;
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new h0(new h(k10, 1)).h(255) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean f() {
        return true;
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e) {
                bd.k.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    public int h(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        hc.a aVar = (hc.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        hc.a aVar2 = hc.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        hc.b bVar = new hc.b(aVar, iArr5);
        hc.b a2 = aVar.a(i10, 1);
        hc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        hc.b bVar3 = aVar.d;
        hc.b bVar4 = a2;
        hc.b bVar5 = bVar;
        hc.b bVar6 = bVar4;
        hc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new hc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            hc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            hc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            hc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new hc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        hc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        hc.b bVar10 = bVarArr[0];
        hc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new hc.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new hc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // di.u9
    public boolean i1(long j10, int i10, int i11, int i12, v9 v9Var) {
        ImageReceiver imageReceiver;
        s4 s4Var;
        s4 s4Var2;
        v9Var.b = null;
        v9Var.c = null;
        dz0 dz0Var = (dz0) this.b;
        yz0 yz0Var = dz0Var.h;
        ArrayList arrayList = dz0Var.w;
        if (dz0Var.N < 0.2f) {
            v9Var.b = yz0Var.getImageReceiver();
            v9Var.c = null;
            v9Var.a = yz0Var;
            v9Var.h = 0.0f;
            v9Var.i = AndroidUtilities.displaySize.y;
            v9Var.g = (View) dz0Var.getParent();
            v9Var.d = dz0Var.y;
            v9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                s4Var = null;
                s4Var2 = null;
                break;
            }
            s4 s4Var3 = (s4) arrayList.get(i13);
            if (s4Var3.e < 1.0f || s4Var3.a != i11) {
                i13++;
            } else {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                s4 d = ProfileStoriesView.d(i14 >= 0 ? (s4) arrayList.get(i14) : null, i15 >= 0 ? (s4) arrayList.get(i15) : null, s4Var3);
                imageReceiver = s4Var3.b;
                s4Var2 = d;
                s4Var = s4Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        v9Var.c = imageReceiver;
        v9Var.b = null;
        v9Var.a = dz0Var;
        v9Var.h = 0.0f;
        v9Var.i = AndroidUtilities.displaySize.y;
        v9Var.g = (View) dz0Var.getParent();
        if (s4Var == null || s4Var2 == null) {
            v9Var.f = null;
            return true;
        }
        v9Var.f = new p7(this, new RectF(s4Var.m), s4Var, new RectF(s4Var2.m), s4Var2);
        return true;
    }

    @Override // g6.a
    public void k(Bitmap bitmap) {
        h6.b bVar = g6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int C = (int) a1.g.C(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (C - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, C, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((g6.h) this.b).e(bitmap2, 0);
    }

    public void n(int i10) {
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        f1 f1Var = ((z0) this.b).e;
        if (f1Var != null) {
            int i11 = f1Var.a;
            if (f1Var.d == i10) {
                return;
            }
            if (f1Var.c.d && i10 == 2) {
                i10 = 1;
            }
            f1Var.d = i10;
            MessagesController.getMainSettings(i11).edit().putBoolean("qrNoPaidPermanent", f1Var.d == 2).apply();
            int i12 = f1Var.d;
            if (i12 == 0) {
                if (f1Var.n != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(f1Var.n, true);
                    f1Var.n = 0;
                    return;
                }
                return;
            }
            if (i12 == 2 && (c10 = f1Var.c()) != null) {
                f1Var.f = c10;
                f1Var.b.setFreeLink(f1Var.d(c10));
            }
            f1Var.l(false, f1Var.d == 1);
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e6.c.h((e6.c) ((e6.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        o6 o6Var = (o6) this.b;
        m6 m6Var = o6Var.L;
        AndroidUtilities.cancelRunOnUIThread(m6Var);
        t81 t81Var = o6Var.y;
        if (t81Var == null || !t81Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(m6Var);
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((o6) this.b).i();
    }

    @Override // org.telegram.ui.Components.fl0
    public void p(View view, x0 x0Var, boolean z10, boolean z11) {
        bh.x xVar = (bh.x) this.b;
        xVar.a.nb(null, xVar.e, xVar.b, view, 0.0f, 0.0f, x0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new d(this, 13));
    }

    public fb.i q(Object obj) {
        fb.g gVar = ((ib.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return fb.k.a;
        }
        Class<?> cls = obj.getClass();
        ib.n nVar = new ib.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public void s(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        x(i10, 2);
        try {
            int E = E(str.length());
            if (E != E(str.length() * 3)) {
                v(r(str));
                y(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < E) {
                throw new w4(position + E, byteBuffer.limit());
            }
            byteBuffer.position(position + E);
            y(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            v((position2 - position) - E);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e) {
            w4 w4Var = new w4(byteBuffer.position(), byteBuffer.limit());
            w4Var.initCause(e);
            throw w4Var;
        }
    }

    public void t(int i10, byte[] bArr) {
        x(i10, 2);
        v(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new w4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new w4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void v(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    public void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }

    public void z(long j10) {
        while (((-128) & j10) != 0) {
            u((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        u((int) j10);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
    }

    public c(byte[] bArr, int i10) {
        this.a = 14;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
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

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 27:
                break;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
        }
    }

    public c(LaunchActivity launchActivity, Executor executor, a1 a1Var) {
        this.a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            j0 s10 = launchActivity.s();
            x xVar = (x) new h0(launchActivity).m(x.class);
            this.b = s10;
            xVar.d = executor;
            xVar.e = a1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void m() {
    }

    @Override // di.u9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void b0(String str) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(t81 t81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void J(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.eb0
    public /* synthetic */ void j(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
