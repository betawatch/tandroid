package xa;

import a0.i;
import a6.l;
import a8.g;
import ai.f6;
import ai.r4;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.c0;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import b2.q0;
import c3.j;
import c5.b0;
import c6.y;
import cc.h;
import ci.b7;
import ci.g0;
import ci.l0;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import e6.o;
import e6.p;
import g6.n;
import g6.q;
import gg.a2;
import gg.z1;
import i7.f;
import ii.e2;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.o4;
import ii.q4;
import ii.r;
import ii.t3;
import ii.x3;
import j$.util.DesugarCollections;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import l.k;
import l.w;
import lg.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.dj0;
import org.telegram.ui.fy;
import qg.c2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d implements s, br0, a0, androidx.activity.result.b, mb0, e, h81, OnSuccessListener, n, f6.a, fb.n, w, a2, f5, k0 {
    public static volatile d c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i10, boolean z10) {
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
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
        } catch (ArrayIndexOutOfBoundsException e7) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e7);
            throw bufferOverflowException;
        }
    }

    public static int H(long j3) {
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (((-16384) & j3) == 0) {
            return 2;
        }
        if (((-2097152) & j3) == 0) {
            return 3;
        }
        if (((-268435456) & j3) == 0) {
            return 4;
        }
        if (((-34359738368L) & j3) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j3) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j3) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j3) == 0) {
            return 8;
        }
        return (j3 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int L(int i10) {
        return N(i10 << 3);
    }

    public static int N(int i10) {
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

    public static int p(CharSequence charSequence) {
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

    public static int z(int i10, String str) {
        int L = L(i10);
        int p5 = p(str);
        return N(p5) + p5 + L;
    }

    @Override // ii.k0
    public void A(CharSequence charSequence) {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            t3 t3Var = (t3) o4Var;
            t3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            t3Var.a.u4(charSequence.toString());
        }
    }

    public void B(int i10, int i11) {
        x((i10 << 3) | i11);
    }

    @Override // ii.k0
    public n9 C() {
        return (q4) this.b;
    }

    public void E(long j3) {
        while (((-128) & j3) != 0) {
            u((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        u((int) j3);
    }

    @Override // ii.k0
    public ii.a F() {
        return ((q4) this.b).a;
    }

    @Override // ii.k0
    public boolean G() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var == null) {
            return false;
        }
        ii.a aVar = q4Var.a;
        return ((t3) o4Var).a.T4();
    }

    @Override // ii.k0
    public void I(int i10, int i11) {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.a;
            i2 i2Var = ((t3) o4Var).a.H3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override // lg.e
    public void I0() {
        ((l0) this.b).h.k();
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 24:
                ((r) this.b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.b;
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.i();
                    rVar.O = null;
                    break;
                }
                break;
            default:
                e2 e2Var = (e2) this.b;
                e2Var.s0(i10, i11, z10);
                dj0 dj0Var2 = e2Var.O0;
                if (dj0Var2 != null) {
                    dj0Var2.i();
                    e2Var.O0 = null;
                    break;
                }
                break;
        }
    }

    @Override // lg.e
    public void K() {
        ((l0) this.b).h.o();
    }

    @Override // lg.e
    public void K0(float f7) {
        ((l0) this.b).h.setRotation(f7);
    }

    @Override // ii.k0
    public void M() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.a;
            x3 x3Var = ((t3) o4Var).a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // ii.k0
    public void Q() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            ii.a aVar = q4Var.a;
            x3.P1(((t3) o4Var).a);
        }
    }

    @Override // gg.a2
    public /* synthetic */ i V() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r3 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r3 == 3) goto L21;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(Object obj) {
        Integer num = (Integer) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        r4 r4Var = e0Var.B0;
        handler.removeCallbacks(r4Var);
        int intValue = num.intValue();
        if (e0Var.F0 != null) {
            int i10 = e0Var.C0.y;
            Context n10 = e0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                e0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    c0.a(drawable);
                }
                e0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? e0Var.D0 : e0Var.E0);
        }
        handler.postDelayed(r4Var, 2000L);
    }

    public void a(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // lg.e
    public void a0() {
        ((l0) this.b).h.a.g(1, true);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.F0(obtain, 2);
                break;
            case 19:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray(strArr);
                iVar.S0(N0, 5);
                break;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                x5.e eVar2 = (x5.e) this.b;
                Parcel J0 = iVar2.J0();
                int i11 = f.a;
                J0.writeStrongBinder(lVar);
                f.c(J0, eVar2);
                iVar2.K0(J0, 1);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw cc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc.d b(m mVar) {
        int e7;
        hc.e eVar;
        hc.c cVar;
        int i10;
        int i11;
        dc.c cVar2;
        int e10;
        hc.f t10 = mVar.t();
        hc.c cVar3 = mVar.s().a;
        hc.d s10 = mVar.s();
        hc.f t11 = mVar.t();
        int i12 = m1.j.d(8)[s10.b];
        dc.b bVar = (dc.b) mVar.b;
        int i13 = bVar.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (com.google.android.gms.internal.vision.e2.a(i12, i15, i16)) {
                    bVar.a(i16, i15);
                }
            }
        }
        int i17 = t11.a * 4;
        int i18 = i17 + 17;
        int i19 = t11.d;
        dc.b bVar2 = new dc.b(i18, i18);
        bVar2.c(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar2.c(i20, 0, 8, 9);
        bVar2.c(0, i20, 9, 8);
        int[] iArr = t11.b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar2.c(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        bVar2.c(6, 9, 1, i17);
        bVar2.c(9, 6, i17, 1);
        if (t11.a > 6) {
            int i27 = i17 + 6;
            bVar2.c(i27, 0, 3, 6);
            bVar2.c(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z10 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                int i34 = z10 ? i28 - i33 : i33;
                int i35 = i26;
                int i36 = 0;
                for (int i37 = i24; i36 < i37; i37 = 2) {
                    int i38 = i29 - i36;
                    if (!bVar2.b(i38, i34)) {
                        i31++;
                        i32 <<= 1;
                        if (bVar.b(i38, i34)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i36++;
                }
                i33++;
                i26 = i35;
                i24 = 2;
            }
            z10 = !z10;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i39 = i26;
        if (i30 != i19) {
            throw cc.c.a();
        }
        if (i19 != t10.d) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = t10.c[cVar3.ordinal()];
        q0[] q0VarArr = (q0[]) b0Var.c;
        int i40 = b0Var.b;
        int i41 = 0;
        for (q0 q0Var : q0VarArr) {
            i41 += q0Var.a;
        }
        hc.a[] aVarArr = new hc.a[i41];
        int i42 = 0;
        for (q0 q0Var2 : q0VarArr) {
            int i43 = 0;
            while (i43 < q0Var2.a) {
                int i44 = q0Var2.b;
                aVarArr[i42] = new hc.a(i44, new byte[i40 + i44]);
                i43++;
                i42++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && aVarArr[i45].a.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                aVarArr[i51].a[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            aVarArr[i52].a[i47] = bArr[i49];
            i52++;
            i49++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                aVarArr[i54].a[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += aVarArr[i56].b;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        while (i58 < i41) {
            hc.a aVar = aVarArr[i58];
            byte[] bArr3 = aVar.a;
            int i60 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i61 = 0; i61 < length4; i61++) {
                iArr2[i61] = bArr3[i61] & 255;
            }
            try {
                int F = ((pb.c) this.b).F(bArr3.length - i60, iArr2);
                for (int i62 = 0; i62 < i60; i62++) {
                    bArr3[i62] = (byte) iArr2[i62];
                }
                i57 += F;
                int i63 = i59;
                int i64 = 0;
                while (i64 < i60) {
                    bArr2[i63] = bArr3[i64];
                    i64++;
                    i63++;
                }
                i58++;
                i59 = i63;
            } catch (fc.c unused) {
                cc.a aVar2 = cc.a.c;
                if (h.a) {
                    throw new cc.a();
                }
                throw cc.a.c;
            }
        }
        char[] cArr = hc.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i39);
        int i65 = -1;
        int i66 = -1;
        boolean z12 = false;
        boolean z13 = false;
        dc.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                hc.e eVar2 = hc.e.c;
                if (d < 4 || (e7 = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e7 == 1) {
                    eVar = hc.e.d;
                } else if (e7 == 2) {
                    eVar = hc.e.e;
                } else if (e7 == 3) {
                    eVar = hc.e.f;
                } else if (e7 == 4) {
                    eVar = hc.e.h;
                } else if (e7 == 5) {
                    eVar = hc.e.s;
                } else if (e7 == 7) {
                    eVar = hc.e.n;
                } else if (e7 == 8) {
                    eVar = hc.e.r;
                } else if (e7 == 9) {
                    eVar = hc.e.v;
                } else {
                    if (e7 != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = hc.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i57;
                            i11 = 1;
                            int e11 = dVar.e(8);
                            if ((e11 & 128) == 0) {
                                e10 = e11 & 127;
                            } else if ((e11 & 192) == 128) {
                                e10 = ((e11 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e11 & 224) != 192) {
                                    throw cc.c.a();
                                }
                                e10 = ((e11 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = dc.c.c;
                            if (e10 < 0 || e10 >= 900) {
                                break;
                            }
                            dc.c cVar5 = (dc.c) dc.c.c.get(Integer.valueOf(e10));
                            if (cVar5 == null) {
                                throw cc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                            int i67 = i65;
                            if (eVar != eVar2) {
                                if (cVar2 != null) {
                                    i11 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i11 = 3;
                                } else if (z13) {
                                    i11 = 5;
                                }
                                dc.d dVar2 = new dc.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i67, i66, i11);
                                dVar2.d = Integer.valueOf(i10);
                                return dVar2;
                            }
                            i65 = i67;
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            i57 = i10;
                        } else if (ordinal != 9) {
                            int e12 = dVar.e(eVar.a(t10));
                            int ordinal2 = eVar.ordinal();
                            i10 = i57;
                            if (ordinal2 == 1) {
                                hc.b.e(dVar, sb2, e12);
                            } else if (ordinal2 == 2) {
                                hc.b.a(dVar, sb2, e12, z12);
                            } else if (ordinal2 == 4) {
                                hc.b.b(dVar, sb2, e12, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw cc.c.a();
                                }
                                hc.b.d(dVar, sb2, e12);
                            }
                        } else {
                            i10 = i57;
                            int e13 = dVar.e(4);
                            int e14 = dVar.e(eVar.a(t10));
                            i11 = 1;
                            if (e13 == 1) {
                                hc.b.c(dVar, sb2, e14);
                            }
                        }
                        int i672 = i65;
                        if (eVar != eVar2) {
                        }
                    } else {
                        i10 = i57;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw cc.c.a();
                        }
                        i65 = dVar.e(8);
                        i66 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i6722 = i65;
                    if (eVar != eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i57;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i67222 = i65;
                if (eVar != eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw cc.c.a();
            }
        }
    }

    @Override // ii.k0, ii.h1
    public void c(i1 i1Var) {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            x3 x3Var = ((t3) o4Var).a;
            x3.N1(x3Var, i1Var);
            x3Var.f3.r(i1Var, true);
        }
    }

    @Override // l.w
    public void d(k kVar, boolean z10) {
        ((g.r) this.b).g(kVar);
    }

    @Override // gg.a2
    public /* synthetic */ i d0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mb0
    public Paint.FontMetricsInt f() {
        return ((ci.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // ii.k0
    public void g() {
        q4 q4Var = (q4) this.b;
        o4 o4Var = q4Var.G;
        if (o4Var != null) {
            x3.Q1(((t3) o4Var).a, q4Var.a);
        }
    }

    @Override // gg.a2
    public void h(int i10) {
        wo0 wo0Var = (wo0) this.b;
        wo0Var.D0--;
        wo0Var.e0 = i10;
        if (wo0Var.f0 != i10) {
            wo0Var.s.clear();
        }
        if (wo0Var.g0 != i10) {
            wo0Var.I.clear();
        }
        wo0Var.N = true;
        fy fyVar = wo0Var.U;
        if (fyVar != null) {
            fyVar.d(wo0Var.D0 > 0, true);
        }
        wo0Var.l();
        fy fyVar2 = wo0Var.U;
        if (fyVar2 != null) {
            fyVar2.c();
        }
    }

    @Override // lg.e
    public boolean i0() {
        l0 l0Var = (l0) this.b;
        g0 g0Var = l0Var.h;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        l0Var.e.invalidate();
        return m10;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // org.telegram.ui.Components.mb0
    public void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((ci.m) this.b).f;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public Set l() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // g6.n
    public void n(String str, long j3, long j10, long j11) {
        p pVar = (p) this.b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public void o() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.b;
        z6 z6Var = b7Var.M;
        k81 k81Var = b7Var.x;
        if (k81Var == null) {
            return;
        }
        if (k81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        d2 d2Var;
        d1 b10;
        d6.a aVar = (d6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (p0.j) {
            Context context = aVar.a;
            g6.r rVar = aVar.f;
            p0 p0Var = new p0(context, rVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = sc.v.v(packageName, ".client_cast_analytics_data");
            p0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.s.b(context);
            p0Var.g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                e7.c = new pb.c(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e7.d = new k6.c[]{y.c};
                e7.b = false;
                e7.a = 8426;
                Task e10 = rVar.e(0, e7.a());
                j6.l lVar = new j6.l();
                lVar.b = p0Var;
                lVar.c = packageName;
                lVar.a = i10;
                lVar.d = sharedPreferences;
                e10.addOnSuccessListener(lVar);
            }
            if (z10) {
                n6.l.h(sharedPreferences);
                g6.b bVar = d2.i;
                synchronized (d2.class) {
                    try {
                        if (d2.k == null) {
                            d2.k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.c;
                SharedPreferences sharedPreferences2 = d2Var.b;
                HashSet hashSet = d2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                d1 b11 = d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    n6.l.h(d2Var.e);
                    n6.l.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(d1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        c2 c2Var = ((b7) this.b).w;
        if (c2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(c2Var.y0 - f10) >= 1.0E-4f) {
                c2Var.y0 = f10;
                c2Var.requestLayout();
            }
        }
    }

    @Override // lg.e
    public boolean q() {
        l0 l0Var = (l0) this.b;
        l0Var.e.invalidate();
        return l0Var.h.j();
    }

    @Override // org.telegram.ui.Components.br0
    public void q0() {
        f6.j0((f6) this.b);
    }

    public void r(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        B(i10, 2);
        try {
            int N = N(str.length());
            if (N != N(str.length() * 3)) {
                x(p(str));
                D(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < N) {
                throw new z4(position + N, byteBuffer.limit());
            }
            byteBuffer.position(position + N);
            D(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            x((position2 - position) - N);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e7) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e7);
            throw z4Var;
        }
    }

    @Override // f6.a
    public void s(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // gg.a2
    public boolean s0(int i10) {
        return i10 == ((wo0) this.b).d0;
    }

    public void t(int i10, byte[] bArr) {
        B(i10, 2);
        x(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    @Override // l.w
    public boolean v(k kVar) {
        Window.Callback callback = ((g.r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // fb.n
    public Object v2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new db.j("Invalid EnumMap type: " + type.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        Iterator it;
        p pVar = (p) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new o(status, 2));
            } catch (IllegalStateException e7) {
                e = e7;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, i11, j10, j11);
            i11 = i10;
        }
    }

    public void x(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    @Override // gg.a2
    public void x0(ArrayList arrayList) {
        wo0 wo0Var = (wo0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            wo0Var.J.add(((z1) arrayList.get(i10)).a);
        }
        fy fyVar = wo0Var.U;
        if (fyVar != null) {
            fyVar.d(wo0Var.D0 > 0, false);
        }
        wo0Var.l();
    }

    @Override // ii.k0
    public o9 y() {
        o4 o4Var = ((q4) this.b).G;
        if (o4Var != null) {
            return ((t3) o4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    public /* synthetic */ d(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.h81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public d(byte[] bArr, int i10) {
        this.a = 13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public d(x6.a aVar) {
        this.a = 27;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new LinkedHashMap();
                break;
            case 21:
                this.b = new pb.c(fc.a.h, 19);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // org.telegram.ui.Components.br0
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onError(k81 k81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void i(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
