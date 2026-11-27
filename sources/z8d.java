// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z8d implements ka1, v76, uv2, be8, cr7, bv9, l12, hcb, jc1, rb2, hj, y17, s84, rv9, a43, ra6 {
    public static z8d c;
    public static final gu4 d;
    public static final jjf e;
    public final /* synthetic */ byte a;
    public Object b;

    static {
        byte b = 1;
        d = new gu4(b);
        e = new jjf(b);
    }

    public z8d(byte b) {
        tkf tkfVar;
        d47 d47Var;
        this.a = b;
        byte b2 = 2;
        switch (b) {
            case 2:
                try {
                    tkfVar = (tkf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    tkfVar = e;
                }
                qkf qkfVar = new qkf(jjf.b, tkfVar);
                Charset charset = ujf.a;
                this.b = qkfVar;
                break;
            case 7:
                this.b = new AtomicInteger(0);
                break;
            case 9:
                this.b = new CopyOnWriteArrayList();
                break;
            case 24:
                break;
            case 26:
                this.b = new k09(lu4.l, b2);
                break;
            default:
                ow8 ow8Var = ow8.c;
                try {
                    d47Var = (d47) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    d47Var = d;
                }
                d47[] d47VarArr = {gu4.b, d47Var};
                dk6 dk6Var = new dk6();
                dk6Var.a = d47VarArr;
                Charset charset2 = pr5.a;
                this.b = dk6Var;
                break;
        }
    }

    public static synchronized z8d B1(Context context) {
        z8d z8dVar;
        synchronized (z8d.class) {
            z8dVar = c;
            if (z8dVar == null) {
                z8dVar = new z8d(context);
                c = z8dVar;
            }
        }
        return z8dVar;
    }

    public static synchronized z8d s1(Context context) {
        z8d B1;
        synchronized (z8d.class) {
            B1 = B1(context.getApplicationContext());
        }
        return B1;
    }

    @Override // rb2
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override // ka1
    public final boolean B(String str, da1 da1Var) {
        return false;
    }

    @Override // bv9
    public final boolean B0(int i, View view) {
        byte b = this.a;
        return false;
    }

    @Override // v76
    public final void C(int i, int i2) {
        ((j79) this.b).p(i, i2);
    }

    @Override // rv9
    public final boolean C1(int i) {
        return true;
    }

    @Override // be8
    public final TextureView D() {
        return null;
    }

    @Override // rv9
    public final zh6 D0() {
        return null;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // y17
    public final void H0(int i, int i2, CharSequence charSequence, boolean z) {
        n12 n12Var = (n12) this.b;
        if (n12Var.V0() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n12Var.V0().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                pv3.l(spannableStringBuilder, n12Var.V0().getEditText().getPaint().getFontMetricsInt(), false);
            }
            n12Var.V0().setText(spannableStringBuilder);
            n12Var.V0().setSelection(i + charSequence.length());
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // ka1
    public final String I() {
        return null;
    }

    @Override // rb2
    public final de8 J1() {
        return null;
    }

    @Override // rb2
    public final boolean K() {
        return false;
    }

    @Override // rb2
    public final boolean L1(long j) {
        return false;
    }

    @Override // rb2
    public final boolean M() {
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final int N() {
        return 0;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        int i;
        i = ((e) ((g41) this.b)).currentAccount;
        jn7.f(i).d(vq0Var);
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public final void R0(ij0 ij0Var, hj0 hj0Var) {
        lq4 lq4Var = (lq4) this.b;
        if (lq4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (lq4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        lq4 lq4Var2 = (lq4) this.b;
        bj0 bj0Var = (bj0) lq4Var2.D("androidx.biometric.BiometricFragment");
        if (bj0Var == null) {
            bj0Var = new bj0();
            kd0 kd0Var = new kd0(lq4Var2);
            kd0Var.f(0, bj0Var, "androidx.biometric.BiometricFragment");
            kd0Var.e(true, true);
            lq4Var2.A(true);
            lq4Var2.E();
        }
        jp4 k = bj0Var.k();
        if (k == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        bj0Var.m0.d = ij0Var;
        int a = nrd.a(ij0Var, hj0Var);
        if (Build.VERSION.SDK_INT < 30 && a == 15 && hj0Var == null) {
            bj0Var.m0.e = hfe.a();
        } else {
            bj0Var.m0.e = hj0Var;
        }
        boolean R = bj0Var.R();
        mj0 mj0Var = bj0Var.m0;
        if (R) {
            mj0Var.i = bj0Var.q(R.string.confirm_device_credential_password);
        } else {
            mj0Var.i = null;
        }
        if (bj0Var.R() && new fj0(new ej0(k, (byte) 0)).a(jn7.d4) != 0) {
            bj0Var.m0.l = true;
            bj0Var.T();
        } else if (bj0Var.m0.n) {
            bj0Var.l0.postDelayed(new aj0(bj0Var), 600L);
        } else {
            bj0Var.Y();
        }
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        return null;
    }

    @Override // cr7
    public final void S0(Object obj) {
        bj0 bj0Var = (bj0) this.b;
        if (((Boolean) obj).booleanValue()) {
            if (bj0Var.S()) {
                bj0Var.X(bj0Var.q(R.string.fingerprint_not_recognized));
            }
            mj0 mj0Var = bj0Var.m0;
            if (mj0Var.l) {
                Executor executor = mj0Var.b;
                if (executor == null) {
                    executor = new zi0((byte) 1);
                }
                executor.execute(new si0(bj0Var, (byte) 0));
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            mj0 mj0Var2 = bj0Var.m0;
            qj7 qj7Var = mj0Var2.s;
            if (qj7Var == null) {
                qj7Var = new qj7();
                mj0Var2.s = qj7Var;
            }
            mj0.f(qj7Var, Boolean.FALSE);
        }
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    public final u53 W0() {
        Context context = (Context) this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        u53 u53Var = new u53();
        u53Var.a = qp3.a(aed.a);
        pq5 pq5Var = new pq5(context);
        u53Var.b = pq5Var;
        u53Var.c = qp3.a(new um4((Object) pq5Var, (Object) new b23(pq5Var, (byte) 0), (byte) 12));
        pq5 pq5Var2 = u53Var.b;
        u53Var.d = new pq8((Object) pq5Var2, (byte) 11);
        uw8 a = qp3.a(new ym4(u53Var.d, qp3.a(new b23(pq5Var2, (byte) 1)), (byte) 21));
        u53Var.e = a;
        z6f z6fVar = new z6f((byte) 25);
        pq5 pq5Var3 = u53Var.b;
        ko9 ko9Var = new ko9((Object) pq5Var3, (Object) a, (Object) z6fVar, (byte) 2);
        uw8 uw8Var = u53Var.a;
        uw8 uw8Var2 = u53Var.c;
        am2 am2Var = new am2(uw8Var, uw8Var2, ko9Var, a, a, (byte) 5);
        xq2 xq2Var = new xq2();
        xq2Var.a = pq5Var3;
        xq2Var.b = uw8Var2;
        xq2Var.c = a;
        xq2Var.d = ko9Var;
        xq2Var.e = uw8Var;
        xq2Var.f = a;
        xq2Var.h = a;
        u53Var.f = qp3.a(new ko9((Object) am2Var, (Object) xq2Var, (Object) new lyc(uw8Var, a, ko9Var, a, (byte) 19), (byte) 9));
        return u53Var;
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override // v76
    public final void X(int i, int i2) {
        ((j79) this.b).q(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x033b, code lost:
    
        throw lo4.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397 A[LOOP:21: B:146:0x022e->B:193:0x0397, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0362 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v93 X0(vh4 vh4Var) {
        pg7 pg7Var;
        r44 r44Var;
        int i;
        int f;
        int f2;
        xdc B = vh4Var.B();
        r44 r44Var2 = vh4Var.A().a;
        mo4 A = vh4Var.A();
        xdc B2 = vh4Var.B();
        int i2 = ik8.G(8)[A.b];
        rj0 rj0Var = (rj0) vh4Var.b;
        int i3 = rj0Var.b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (bs2.a(i2, i5, i6)) {
                    rj0Var.a(i6, i5);
                }
            }
        }
        int i7 = 2;
        int i8 = B2.a << 2;
        int i9 = i8 + 17;
        int i10 = B2.d;
        rj0 rj0Var2 = new rj0(i9, i9);
        rj0Var2.d(0, 0, 9, 9);
        int i11 = i8 + 9;
        rj0Var2.d(i11, 0, 8, 9);
        rj0Var2.d(0, i11, 9, 8);
        int[] iArr = B2.b;
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = iArr[i12] - 2;
            int i14 = i7;
            for (int i15 = i4; i15 < length; i15++) {
                if ((i12 != 0 || (i15 != 0 && i15 != length - 1)) && (i12 != length - 1 || i15 != 0)) {
                    rj0Var2.d(iArr[i15] - 2, i13, 5, 5);
                }
            }
            i12++;
            i7 = i14;
            i4 = 0;
        }
        int i16 = i7;
        int i17 = 6;
        int i18 = 1;
        rj0Var2.d(6, 9, 1, i8);
        rj0Var2.d(9, 6, i8, 1);
        if (B2.a > 6) {
            int i19 = i8 + 6;
            rj0Var2.d(i19, 0, 3, 6);
            rj0Var2.d(0, i19, 6, 3);
        }
        byte[] bArr = new byte[i10];
        int i20 = i3 - 1;
        int i21 = i20;
        boolean z = true;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 > 0) {
            if (i21 == i17) {
                i21--;
            }
            int i25 = 0;
            while (i25 < i3) {
                int i26 = z ? i20 - i25 : i25;
                int i27 = i18;
                int i28 = 0;
                for (int i29 = i16; i28 < i29; i29 = 2) {
                    int i30 = i21 - i28;
                    if (!rj0Var2.b(i30, i26)) {
                        i23++;
                        i24 <<= 1;
                        if (rj0Var.b(i30, i26)) {
                            i24 |= 1;
                        }
                        if (i23 == 8) {
                            bArr[i22] = (byte) i24;
                            i22++;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i28++;
                }
                i25++;
                i18 = i27;
                i16 = 2;
            }
            z = !z;
            i21 -= 2;
            i16 = 2;
            i17 = 6;
        }
        int i31 = i18;
        if (i22 != i10) {
            throw lo4.a();
        }
        if (i10 != B.d) {
            iy8.d();
            return null;
        }
        ekd ekdVar = B.c[r44Var2.ordinal()];
        wdc[] wdcVarArr = (wdc[]) ekdVar.b;
        byte b = ekdVar.a;
        int i32 = 0;
        for (wdc wdcVar : wdcVarArr) {
            i32 += wdcVar.a;
        }
        ekd[] ekdVarArr = new ekd[i32];
        int i33 = 0;
        for (wdc wdcVar2 : wdcVarArr) {
            int i34 = 0;
            while (i34 < wdcVar2.a) {
                byte b2 = wdcVar2.b;
                ekdVarArr[i33] = new ekd(b2, new byte[b + b2]);
                i34++;
                i33++;
            }
        }
        int length2 = ((byte[]) ekdVarArr[0].b).length;
        int i35 = i32 - 1;
        while (i35 >= 0 && ((byte[]) ekdVarArr[i35].b).length != length2) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length2 - b;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i37) {
            int i40 = i39;
            int i41 = 0;
            while (i41 < i33) {
                ((byte[]) ekdVarArr[i41].b)[i38] = bArr[i40];
                i41++;
                i40++;
            }
            i38++;
            i39 = i40;
        }
        int i42 = i36;
        while (i42 < i33) {
            ((byte[]) ekdVarArr[i42].b)[i37] = bArr[i39];
            i42++;
            i39++;
        }
        boolean z2 = false;
        int length3 = ((byte[]) ekdVarArr[0].b).length;
        while (i37 < length3) {
            int i43 = i39;
            int i44 = 0;
            while (i44 < i33) {
                ((byte[]) ekdVarArr[i44].b)[i44 < i36 ? i37 : i37 + 1] = bArr[i43];
                i44++;
                i43++;
            }
            i37++;
            i39 = i43;
        }
        int i45 = 0;
        for (int i46 = 0; i46 < i32; i46++) {
            i45 += ekdVarArr[i46].a;
        }
        byte[] bArr2 = new byte[i45];
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i32) {
            ekd ekdVar2 = ekdVarArr[i48];
            byte[] bArr3 = (byte[]) ekdVar2.b;
            byte b3 = ekdVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i50 = 0; i50 < length4; i50++) {
                iArr2[i50] = bArr3[i50] & 255;
            }
            try {
                int n2 = ((k09) this.b).n2(iArr2, bArr3.length - b3);
                for (int i51 = 0; i51 < b3; i51++) {
                    bArr3[i51] = (byte) iArr2[i51];
                }
                i47 += n2;
                int i52 = i49;
                int i53 = 0;
                while (i53 < b3) {
                    bArr2[i52] = bArr3[i53];
                    i53++;
                    i52++;
                }
                i48++;
                i49 = i52;
            } catch (l89 unused) {
                vg2 vg2Var = vg2.c;
                if (b59.a) {
                    throw new vg2();
                }
                throw vg2.c;
            }
        }
        sj0 sj0Var = new sj0(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i31);
        int i54 = -1;
        int i55 = -1;
        boolean z3 = false;
        boolean z4 = false;
        jk1 jk1Var = null;
        while (true) {
            try {
                int d2 = sj0Var.d();
                pg7 pg7Var2 = pg7.c;
                if (d2 < 4 || (f2 = sj0Var.f(4)) == 0) {
                    pg7Var = pg7Var2;
                } else if (f2 == 1) {
                    pg7Var = pg7.d;
                } else if (f2 == 2) {
                    pg7Var = pg7.e;
                } else if (f2 == 3) {
                    pg7Var = pg7.f;
                } else if (f2 == 4) {
                    pg7Var = pg7.h;
                } else if (f2 == 5) {
                    pg7Var = pg7.s;
                } else if (f2 == 7) {
                    pg7Var = pg7.n;
                } else if (f2 == 8) {
                    pg7Var = pg7.r;
                } else if (f2 == 9) {
                    pg7Var = pg7.w;
                } else {
                    if (f2 != 13) {
                        throw new IllegalArgumentException();
                    }
                    pg7Var = pg7.x;
                }
                int ordinal = pg7Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        r44Var = r44Var2;
                        i = 1;
                        if (sj0Var.d() < 16) {
                            throw lo4.a();
                        }
                        i54 = sj0Var.f(8);
                        i55 = sj0Var.f(8);
                    } else if (ordinal == 5) {
                        r44Var = r44Var2;
                        i = 1;
                        int f3 = sj0Var.f(8);
                        if ((f3 & 128) == 0) {
                            f = f3 & jn7.K1;
                        } else if ((f3 & jn7.V2) == 128) {
                            f = ((f3 & 63) << 8) | sj0Var.f(8);
                        } else {
                            if ((f3 & jn7.A3) != 192) {
                                throw lo4.a();
                            }
                            f = ((f3 & 31) << 16) | sj0Var.f(16);
                        }
                        HashMap hashMap = jk1.c;
                        if (f < 0 || f >= 900) {
                            break;
                        }
                        jk1Var = (jk1) jk1.c.get(Integer.valueOf(f));
                        if (jk1Var == null) {
                            throw lo4.a();
                        }
                    } else if (ordinal == 7) {
                        r44Var = r44Var2;
                        i = 1;
                        z3 = true;
                        z2 = true;
                    } else if (ordinal == 8) {
                        r44Var = r44Var2;
                        i = 1;
                        z3 = true;
                        z4 = true;
                    } else if (ordinal != 9) {
                        int f4 = sj0Var.f(pg7Var.a(B));
                        int ordinal2 = pg7Var.ordinal();
                        r44Var = r44Var2;
                        if (ordinal2 == 1) {
                            wm7.e(sj0Var, sb, f4);
                        } else if (ordinal2 == 2) {
                            wm7.a(sj0Var, sb, f4, z3);
                        } else if (ordinal2 == 4) {
                            wm7.b(sj0Var, sb, f4, jk1Var, arrayList);
                        } else {
                            if (ordinal2 != 6) {
                                throw lo4.a();
                            }
                            wm7.d(sj0Var, sb, f4);
                        }
                    } else {
                        r44Var = r44Var2;
                        int f5 = sj0Var.f(4);
                        int f6 = sj0Var.f(pg7Var.a(B));
                        i = 1;
                        if (f5 == 1) {
                            wm7.c(sj0Var, sb, f6);
                        }
                    }
                    if (pg7Var != pg7Var2) {
                        v93 v93Var = new v93(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, r44Var.toString(), i54, i55, jk1Var != null ? z2 ? 4 : z4 ? 6 : 2 : z2 ? 3 : z4 ? 5 : i);
                        v93Var.d = Integer.valueOf(i47);
                        return v93Var;
                    }
                    r44Var2 = r44Var;
                } else {
                    r44Var = r44Var2;
                }
                i = 1;
                if (pg7Var != pg7Var2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw lo4.a();
            }
        }
    }

    @Override // rb2
    public final boolean Z() {
        return false;
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // bv9
    public final void a(float f) {
        switch (this.a) {
            case 12:
                break;
            default:
                bg3 bg3Var = (bg3) this.b;
                ag3[] ag3VarArr = bg3Var.f;
                if (f != 1.0f || ag3VarArr[1].getVisibility() == 0) {
                    if (bg3Var.r) {
                        ag3VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                        ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth() - (f * ag3VarArr[0].getMeasuredWidth()));
                    } else {
                        ag3VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                        ag3VarArr[1].setTranslationX((f * ag3VarArr[0].getMeasuredWidth()) - ag3VarArr[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        ag3 ag3Var = ag3VarArr[0];
                        ag3VarArr[0] = ag3VarArr[1];
                        ag3VarArr[1] = ag3Var;
                        ag3Var.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final boolean b() {
        return false;
    }

    @Override // a43
    public final void b0() {
        ((l33) this.b).d.invalidate();
    }

    @Override // bv9
    public final void c(int i, boolean z) {
        switch (this.a) {
            case 12:
                lo0 lo0Var = ((eo0) this.b).d;
                lo0Var.e0 = i;
                lo0Var.J0(true);
                break;
            default:
                bg3 bg3Var = (bg3) this.b;
                ag3[] ag3VarArr = bg3Var.f;
                if (ag3VarArr[0].f != i) {
                    bg3Var.x = i == bg3Var.e.getFirstTabId();
                    ag3 ag3Var = ag3VarArr[1];
                    ag3Var.f = i;
                    ag3Var.setVisibility(0);
                    bg3Var.q0(true);
                    bg3Var.r = z;
                    break;
                }
                break;
        }
    }

    @Override // rb2
    public final boolean c0() {
        return false;
    }

    @Override // bv9
    public final void e() {
        byte b = this.a;
    }

    @Override // ra6
    public final void g() {
        i63 i63Var = (i63) this.b;
        i63Var.F.g();
        IOException iOException = i63Var.H;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void g1() {
        ((nx0) this.b).p0 = false;
    }

    @Override // rb2, al1
    public final boolean h() {
        return true;
    }

    @Override // rb2
    public final void i() {
        a.t();
        boolean z = f11.a;
        a.q();
        m01.u(((tf1) this.b).n.getParentActivity(), f11.g);
    }

    @Override // rb2
    public final boolean i1() {
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        return false;
    }

    @Override // hcb
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        j81 j81Var = (j81) this.b;
        if (j81Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= j81Var.b.getChildCount()) {
                    break;
                }
                View childAt = j81Var.b.getChildAt(i4);
                if (childAt instanceof g81) {
                    g81 g81Var = (g81) childAt;
                    if (g81Var.n != null) {
                        for (int i5 = 0; i5 < g81Var.n.size(); i5++) {
                            ArrayList arrayList = ((h81) g81Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = g81Var.n.keyAt(i5);
                                j81Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g81Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    icbVar.c = imageReceiver;
                                    tg0 tg0Var = j81Var.j0;
                                    if (tg0Var == null) {
                                        tg0Var = new tg0(this, (byte) 24);
                                        j81Var.j0 = tg0Var;
                                    }
                                    icbVar.e = tg0Var;
                                    icbVar.a = g81Var;
                                    icbVar.g = j81Var.fragmentView;
                                    icbVar.h = hl.L(36.0f);
                                    icbVar.i = j81Var.fragmentView.getBottom();
                                    icbVar.b = null;
                                    return true;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
        }
        return false;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override // be8
    public final void k(r47 r47Var) {
        m mVar = ((o) this.b).v0[0];
        if (mVar != null) {
            mVar.b.K0(true);
        }
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override // rb2
    public final bmb l2() {
        return null;
    }

    public final void m1(kl1 kl1Var) {
        ((nx0) this.b).I0 = kl1Var;
    }

    @Override // v76
    public final void n(int i, int i2) {
        ((j79) this.b).j(i, i2);
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    public final void o1() {
        ((nx0) this.b).show();
    }

    @Override // rv9
    public final void p(int i) {
        hl.c3(new vd2(this, (byte) 3));
    }

    public final void p1(int i, Object obj, fu9 fu9Var) {
        xk2 xk2Var = (xk2) this.b;
        xk2Var.A(i, 3);
        fu9Var.g((p3) obj, xk2Var.a);
        xk2Var.A(i, 4);
    }

    @Override // ka1
    public final void q(String str) {
        v8 v8Var = (v8) this.b;
        v8Var.finishFragment(false);
        u34 u34Var = v8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) u34Var.b;
        v8 v8Var2 = (v8) u34Var.c;
        String str2 = LaunchActivity.C1;
        id idVar = new id(3, null, launchActivity);
        idVar.j0 = false;
        idVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new mw3(idVar, v8Var2, (byte) 13));
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((t82) this.b).i0(f);
    }

    @Override // rb2
    public final String u(long j) {
        return null;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override // s84
    public final void v0(float f, int i) {
        t82 t82Var = (t82) this.b;
        t82Var.c.setLayerType(0, null);
        if (f == 0.0f && !t82Var.P) {
            t82Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                t82Var.F.setFocusableInTouchMode(false);
            }
        }
        jn7.e().k(jn7.k1, 512);
    }

    @Override // y17
    public final Paint.FontMetricsInt w() {
        return ((n12) this.b).B2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        return false;
    }

    @Override // hcb
    public final void x(long j, int i, x58 x58Var) {
        j81 j81Var = (j81) this.b;
        if (j81Var.b == null) {
            x58Var.run();
        }
        j81Var.b.post(x58Var);
    }

    @Override // v76
    public final void x0(int i, int i2) {
        ((j79) this.b).n(i, i2, null);
    }

    public final synchronized void x1() {
        a5b a5bVar = (a5b) this.b;
        ReentrantLock reentrantLock = a5bVar.a;
        reentrantLock.lock();
        try {
            a5bVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ((bw1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // rb2
    public final boolean y0(long j) {
        return false;
    }

    private final void d1() {
    }

    private final void e1() {
    }

    @Override // a43
    public final void L0() {
    }

    @Override // rb2
    public final void Q0() {
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void V() {
    }

    @Override // rb2
    public final void d() {
    }

    @Override // rb2
    public final void d2() {
    }

    @Override // rb2
    public final void k2() {
    }

    @Override // ka1
    public final void onDismiss() {
    }

    @Override // rb2
    public final void r() {
    }

    @Override // rb2
    public final void r0() {
    }

    @Override // rb2
    public final void z1() {
    }

    private final void b1(float f) {
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
    }

    @Override // a43
    public final void F0(boolean z) {
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
    }

    @Override // be8
    public final void J(r47 r47Var) {
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
    }

    @Override // rb2
    public final void T(r47 r47Var) {
    }

    @Override // y17
    public final void T0(String str) {
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
    }

    @Override // rb2
    public final void Y(int i) {
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
    }

    @Override // hcb
    public final void f(boolean z) {
    }

    @Override // rb2
    public final void g0(String str) {
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
    }

    @Override // ka1
    public final void p0(ei7 ei7Var) {
    }

    @Override // a43
    public final void t0(boolean z) {
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void K1(String str, String str2) {
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // y17
    public final void m0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // y17
    public final void s(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f, float f2) {
    }

    public z8d(Context context) {
        String e2;
        this.a = (byte) 0;
        a5b a = a5b.a(context);
        this.b = a;
        a.b();
        String e3 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e3) || (e2 = a.e(a5b.f("googleSignInOptions", e3))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e2);
        } catch (JSONException unused) {
        }
    }

    public z8d(xk2 xk2Var) {
        this.a = (byte) 22;
        Charset charset = pr5.a;
        this.b = xk2Var;
        xk2Var.a = this;
    }

    public /* synthetic */ z8d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public z8d(LaunchActivity launchActivity, Executor executor, rsd rsdVar) {
        this.a = (byte) 11;
        if (launchActivity == null) {
            lq5.j("FragmentActivity must not be null.");
            throw null;
        }
        if (executor != null) {
            lq4 u = launchActivity.u();
            mj0 mj0Var = (mj0) new pq8(launchActivity).n(mj0.class);
            this.b = u;
            mj0Var.b = executor;
            mj0Var.c = rsdVar;
            return;
        }
        lq5.j("Executor must not be null.");
        throw null;
    }

    public z8d(Context context, vnb vnbVar) {
        this.a = (byte) 13;
        nx0 nx0Var = new nx0(1, vnbVar, context, false);
        this.b = nx0Var;
        nx0Var.J();
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // rb2
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
