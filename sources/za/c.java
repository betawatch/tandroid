package za;

import a8.g;
import ag.d3;
import ag.w;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.b0;
import bi.d4;
import bi.m0;
import bi.n1;
import bi.o2;
import bi.w4;
import bi.y4;
import bi.z3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fe.e;
import fe.k;
import g.r;
import g6.i;
import i7.f;
import ig.h;
import ig.q1;
import ig.s0;
import j$.util.DesugarCollections;
import j6.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import jg.c2;
import jg.v2;
import k2.q;
import k2.t;
import k2.v;
import k2.x0;
import k2.z;
import l.j;
import l.x;
import n6.l;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.q4;
import org.telegram.ui.er0;
import org.telegram.ui.kh0;
import v7.d8;
import v7.t6;
import w7.z8;
import x2.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements s, ai, a0, jn0, q4, m0, androidx.activity.result.b, w0, OnSuccessListener, e, x, c2, z, j {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    public static p k(Looper looper, Object obj, String str) {
        l.h(obj, "Listener must not be null");
        l.h(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public float A(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        c cVar;
        int i20;
        int i21 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i22;
                break;
            }
            int i30 = z10 ? i28 : i27;
            int i31 = z10 ? i27 : i28;
            boolean z11 = z10;
            if (i29 == i21) {
                i19 = i21;
                i20 = abs;
                cVar = this;
            } else {
                i19 = 0;
                cVar = this;
                i20 = abs;
            }
            if (i19 == ((wb.b) cVar.b).b(i30, i31)) {
                if (i29 == 2) {
                    return z8.b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i18 = 2;
                    break;
                }
                i28 += i25;
                i23 -= i20;
            }
            i27 += i24;
            abs = i20;
            z10 = z11;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i18) {
            return z8.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // l.x
    public boolean B(l.l lVar) {
        Window.Callback callback = ((r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(zs.t1, lVar);
        return true;
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        int i10;
        i10 = ((k2) ((w) this.b)).currentAccount;
        zs.f(i10).d(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // fe.e
    public void E(float f7, int i10) {
        ((k) this.b).l(f7);
    }

    @Override // bi.m0
    public void F(CharSequence charSequence) {
        w4 w4Var = ((y4) this.b).G;
        if (w4Var != null) {
            z3 z3Var = (z3) w4Var;
            z3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            z3Var.a.w4(charSequence.toString());
        }
    }

    @Override // jg.c2
    public void G(float f7) {
        switch (this.a) {
            case 25:
                er0 er0Var = (er0) this.b;
                s0.e(er0Var.y1).k(String.valueOf(h.a.indexOf(er0Var.F0.getCurrentBrush())), f7);
                q1 q1Var = er0Var.t1;
                q1Var.c = f7;
                er0Var.r0(q1Var, null);
                break;
            default:
                ((v2) this.b).setOutlineWidth(f7);
                break;
        }
    }

    @Override // k2.z
    public void H() {
        o oVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            oVar = ffmpegAudioRenderer.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    public float I(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        wb.b bVar = (wb.b) this.b;
        float A = A(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (A(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + A) - 1.0f;
    }

    @Override // bi.m0
    public j9 J() {
        return (y4) this.b;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        bi.k2 k2Var = (bi.k2) this.b;
        k2Var.w0(i10, i11, z10);
        kh0 kh0Var = k2Var.O0;
        if (kh0Var != null) {
            kh0Var.h();
            k2Var.O0 = null;
        }
    }

    @Override // bi.m0
    public bi.a L() {
        return ((y4) this.b).a;
    }

    @Override // bi.m0
    public boolean O() {
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.G;
        if (w4Var == null) {
            return false;
        }
        bi.a aVar = y4Var.a;
        return ((z3) w4Var).a.V4();
    }

    @Override // k2.z
    public void P(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override // bi.m0
    public void R(int i10, int i11) {
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.a;
            o2 o2Var = ((z3) w4Var).a.Q3;
            if (o2Var != null) {
                o2Var.f(i10, i11);
            }
        }
    }

    @Override // k2.z
    public void S() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // bi.m0
    public void W() {
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.a;
            d4 d4Var = ((z3) w4Var).a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.o3.onContentChanged();
        }
    }

    @Override // k2.z
    public void a(int i10) {
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new d3(bVar, i10, 9));
        }
    }

    @Override // k2.z
    public void a0(x0 x0Var) {
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 1));
        }
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((g) obj).v();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.H0(obtain, 2);
                break;
            case 21:
                g6.q qVar = new g6.q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).v();
                String[] strArr = (String[]) this.b;
                Parcel P0 = iVar.P0();
                u.d(P0, qVar);
                P0.writeStringArray(strArr);
                iVar.U0(P0, 5);
                break;
            default:
                i7.b bVar = (i7.b) this.b;
                i7.a aVar2 = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).v();
                String str = bVar.k;
                Parcel L0 = iVar2.L0();
                int i11 = f.a;
                L0.writeStrongBinder(aVar2);
                L0.writeString(str);
                iVar2.M0(L0, 2);
                break;
        }
    }

    @Override // bi.m0, bi.m1
    public void b(n1 n1Var) {
        w4 w4Var = ((y4) this.b).G;
        if (w4Var != null) {
            d4 d4Var = ((z3) w4Var).a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public void c(float f7) {
        b0 b0Var = (b0) this.b;
        jj jjVar = b0Var.P;
        if (jjVar == null) {
            return;
        }
        jjVar.b0 = f7;
        MediaController.B().i0(b0Var.P, f7);
    }

    @Override // org.telegram.ui.Components.jn0
    public void d(float f7) {
        jj jjVar = ((b0) this.b).P;
        if (jjVar == null) {
            return;
        }
        jjVar.b0 = f7;
    }

    @Override // k2.z
    public void e(boolean z10) {
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new v(0, bVar, z10));
        }
    }

    @Override // k2.z
    public void e0(x0 x0Var) {
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 0));
        }
    }

    @Override // k2.z
    public void f(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.g0 = true;
        hf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bi.e(bVar, j10, 2));
        }
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        ((r) this.b).g(lVar);
    }

    @Override // jg.c2
    public float get() {
        switch (this.a) {
            case 25:
                er0 er0Var = (er0) this.b;
                int i10 = er0Var.y1;
                h currentBrush = er0Var.F0.getCurrentBrush();
                return currentBrush == null ? s0.e(i10).i : s0.e(i10).f(String.valueOf(h.a.indexOf(currentBrush)), currentBrush.d());
            default:
                return ((v2) this.b).F;
        }
    }

    public void h(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // bi.m0
    public void h0() {
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.a;
            d4.R1(((z3) w4Var).a);
        }
    }

    public float i(bc.c cVar, bc.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float I = I(i10, i11, i12, i13);
        float I2 = I((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(I) ? I2 / 7.0f : Float.isNaN(I2) ? I / 7.0f : (I + I2) / 14.0f;
    }

    @Override // k2.z
    public void i0(long j10, int i10, long j11) {
        hf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override // bi.m0
    public void j() {
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            d4.S1(((z3) w4Var).a, y4Var.a);
        }
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
    public void k0(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (f0Var.F0 != null) {
            int i10 = f0Var.C0.y;
            Context n10 = f0Var.n();
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
                f0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    d0.a(drawable);
                }
                f0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? f0Var.D0 : f0Var.E0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public bc.a l(float f7, float f10, int i10, int i11) {
        bc.a b10;
        bc.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        wb.b bVar = (wb.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw vb.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw vb.e.a();
        }
        wb.b bVar2 = (wb.b) this.b;
        bc.b bVar3 = new bc.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw vb.e.a();
        }
        return (bc.a) arrayList.get(0);
    }

    @Override // androidx.activity.result.b
    public void m(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // k2.z
    public void n() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.c2 c2Var;
        c1 b10;
        d6.a aVar = (d6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (o0.j) {
            Context context = aVar.a;
            g6.r rVar = aVar.f;
            o0 o0Var = new o0(context, rVar, aVar.c, aVar.j, aVar.g);
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
            String A = sc.e.A(packageName, ".client_cast_analytics_data");
            o0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            l5.s.b(context);
            o0Var.g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), y.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(A, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = new k6.h(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{c6.y.c};
                b11.b = false;
                b11.a = 8426;
                Task e = rVar.e(0, b11.a());
                m mVar = new m();
                mVar.b = o0Var;
                mVar.c = packageName;
                mVar.a = i10;
                mVar.d = sharedPreferences;
                e.addOnSuccessListener(mVar);
            }
            if (z10) {
                l.g(sharedPreferences);
                g6.b bVar = com.google.android.gms.internal.cast.c2.i;
                synchronized (com.google.android.gms.internal.cast.c2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.c2.k == null) {
                            com.google.android.gms.internal.cast.c2.k = new com.google.android.gms.internal.cast.c2(sharedPreferences, o0Var, packageName);
                        }
                        c2Var = com.google.android.gms.internal.cast.c2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = c2Var.c;
                SharedPreferences sharedPreferences2 = c2Var.b;
                HashSet hashSet = c2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.c2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                c1 b12 = com.google.android.gms.internal.cast.c2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.c2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    l.g(c2Var.e);
                    l.g(c2Var.d);
                    c2Var.e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.c2.a(c1.h);
            }
        }
    }

    @Override // l.j
    public void p(l.l lVar) {
        k2.m0 m0Var = ((ActionMenuView) this.b).K;
        if (m0Var != null) {
            m0Var.p(lVar);
        }
    }

    public Set q() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public Boolean r() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public c3.j s() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        t6.d(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, d8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), d8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), d8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void t(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                le.b bVar = le.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((kg.s0) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // l.j
    public boolean u(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.b).P;
        if (kVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((a4.l) kVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((k) this.b).l(f7);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void w(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public void x() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    @Override // bi.m0
    public k9 y() {
        w4 w4Var = ((y4) this.b).G;
        if (w4Var != null) {
            return ((z3) w4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public /* synthetic */ c(g6.r rVar, String[] strArr) {
        this.a = 21;
        this.b = strArr;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(x6.a aVar) {
        this.a = 22;
        l.g(aVar);
        this.b = aVar;
    }

    public c(Context context) {
        this.a = 16;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                this.b = new LinkedHashMap();
                break;
            case 12:
            default:
                this.b = new HashSet();
                break;
            case 13:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // k2.z
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void j0() {
    }

    @Override // k2.z
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
