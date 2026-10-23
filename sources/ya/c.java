package ya;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.i;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import ci.p4;
import ci.q9;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.j;
import ei.g;
import ei.m;
import ei.o6;
import ei.r6;
import f6.h;
import g6.s;
import gb.n;
import gi.m4;
import hi.r0;
import hi.s0;
import j$.util.DesugarCollections;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import ki.c3;
import ki.d2;
import ki.g1;
import ki.h1;
import ki.h2;
import ki.o5;
import ki.q;
import ki.w3;
import l.k;
import l.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ri;
import org.telegram.ui.qi0;
import org.telegram.ui.sn;
import org.telegram.ui.uu0;
import org.telegram.ui.z51;
import v7.f7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class c implements r, z51, a0, androidx.activity.result.b, uu0, j0, u0, OnCompleteListener, gb0, g81, f6.a, w, n, eb.n, r0, ri, d5, g1 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static boolean Y(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String g0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public boolean A() {
        return true;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 27:
                ((q) this.b).K(i10, z10, i11, false, 0L);
                q qVar = (q) this.b;
                qi0 qi0Var = qVar.O;
                if (qi0Var != null) {
                    qi0Var.h();
                    qVar.O = null;
                    break;
                }
                break;
            default:
                ((d2) this.b).s0(i10, i11, z10);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public e D(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public float F(jc.c cVar, jc.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float f02 = f0(i10, i11, i12, i13);
        float f03 = f0((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(f02) ? f03 / 7.0f : Float.isNaN(f03) ? f02 / 7.0f : (f02 + f03) / 14.0f;
    }

    @Override // ki.g1
    public void G(Editable editable) {
        o5 o5Var = (o5) this.b;
        ki.a aVar = o5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = o5Var.r.E;
        }
        o5Var.t();
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return;
        }
        c3Var.a();
    }

    public int H(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        gc.a aVar = (gc.a) this.b;
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
                        gc.a aVar2 = gc.a.h;
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
        gc.b bVar = new gc.b(aVar, iArr5);
        gc.b a2 = aVar.a(i10, 1);
        gc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        gc.b bVar3 = aVar.d;
        gc.b bVar4 = a2;
        gc.b bVar5 = bVar;
        gc.b bVar6 = bVar4;
        gc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new gc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            gc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            gc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            gc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new gc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        gc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        gc.b bVar10 = bVarArr[0];
        gc.b bVar11 = bVarArr[1];
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
                throw new gc.c("Error locator degree does not match number of roots");
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
                throw new gc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // org.telegram.ui.Components.gb0
    public void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        g gVar = ((m) this.b).f;
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

    public jc.a K(float f7, float f10, int i10, int i11) {
        jc.a b10;
        jc.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        ec.b bVar = (ec.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw dc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw dc.e.a();
        }
        ec.b bVar2 = (ec.b) this.b;
        jc.b bVar3 = new jc.b(bVar2, max, max2, min, min2, f7);
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
            throw dc.e.a();
        }
        return (jc.a) arrayList.get(0);
    }

    @Override // ki.g1
    public /* synthetic */ boolean M(boolean z10) {
        return false;
    }

    public boolean N(String str) {
        String W = W(str);
        return "1".equals(W) || Boolean.parseBoolean(W);
    }

    @Override // ki.g1
    public /* synthetic */ boolean P(h1 h1Var) {
        return false;
    }

    public Integer Q(String str) {
        String W = W(str);
        if (TextUtils.isEmpty(W)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(W));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + g0(str) + "(" + W + ") into an int");
            return null;
        }
    }

    @Override // ki.g1
    public void R(h1 h1Var, int i10, int i11) {
        c3 c3Var;
        o9 textSelectionHelper;
        o5 o5Var = (o5) this.b;
        if (o5Var.G || i10 == i11 || (c3Var = o5Var.E) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == o5Var) {
            return;
        }
        o5Var.post(new m4(this, h1Var, i11, textSelectionHelper, i10, 4));
    }

    public JSONArray S(String str) {
        String W = W(str);
        if (TextUtils.isEmpty(W)) {
            return null;
        }
        try {
            return new JSONArray(W);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + g0(str) + ": " + W + ", falling back to default");
            return null;
        }
    }

    public String T(Resources resources, String str, String str2) {
        String[] strArr;
        String W = W(str2);
        if (!TextUtils.isEmpty(W)) {
            return W;
        }
        String W2 = W(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(W2)) {
            return null;
        }
        int identifier = resources.getIdentifier(W2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", g0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray S = S(str2.concat("_loc_args"));
        if (S == null) {
            strArr = null;
        } else {
            int length = S.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = S.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + g0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // org.telegram.ui.uu0
    public /* synthetic */ TextureView U() {
        return null;
    }

    public Set V() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public String W(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
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
    public void Z(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        i iVar = f0Var.B0;
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

    public void a0() {
        ((u) this.b).d.R();
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.F0(obtain, 2);
                break;
            default:
                g6.q qVar = new g6.q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray(strArr);
                iVar.S0(N0, 5);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void b() {
        l0 l0Var = (l0) this.b;
        l0Var.a.lock();
        try {
            l0Var.m = new com.google.android.gms.common.api.internal.f0(l0Var, l0Var.j, l0Var.k, l0Var.d, l0Var.l, l0Var.a, l0Var.c);
            l0Var.m.y();
            l0Var.b.signalAll();
        } finally {
            l0Var.a.unlock();
        }
    }

    @Override // ki.g1
    public void c(h1 h1Var) {
        c3 c3Var = ((o5) this.b).E;
        if (c3Var != null) {
            w3 w3Var = c3Var.a;
            w3.S1(w3Var, h1Var);
            w3Var.i3.o(h1Var, true);
        }
    }

    public Bundle c0() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // hi.r0
    public void close() {
        ((hi.r) this.b).finishFragment();
    }

    @Override // l.w
    public void d(k kVar, boolean z10) {
        ((g.r) this.b).g(kVar);
    }

    public eb.i d0(Object obj) {
        eb.g gVar = ((hb.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return eb.k.a;
        }
        Class<?> cls = obj.getClass();
        hb.n nVar = new hb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override // ki.g1
    public boolean e() {
        o5 o5Var = (o5) this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return false;
        }
        return c3Var.a.Y4();
    }

    public float e0(int i10, int i11, int i12, int i13) {
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
            if (i19 == ((ec.b) cVar.b).b(i30, i31)) {
                if (i29 == 2) {
                    return f7.b(i27, i28, i14, i15);
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
            return f7.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // ki.g1
    public void f(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = (o5) this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null || (h2Var = c3Var.a.K3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    public float f0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        ec.b bVar = (ec.b) this.b;
        float e02 = e0(i10, i11, i12, i13);
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
        return (e0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + e02) - 1.0f;
    }

    @Override // gb.n
    public Object f2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new j("Invalid EnumSet type: " + type.toString());
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void g(k6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            wVar.m = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // androidx.activity.result.b
    public void h(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = aVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // hi.r0
    public void j(long j10) {
        ((hi.r) this.b).presentFragment(sn.W9(j10));
    }

    @Override // f6.a
    public void l(Bitmap bitmap) {
        g6.b bVar = h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((h) this.b).e(bitmap2, 0);
    }

    @Override // org.telegram.ui.uu0
    public void m0(MessageObject messageObject) {
        ((q9) ((p4) this.b).Q1).f(true);
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void n(int i10) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        Lock lock = wVar.o;
        lock.lock();
        try {
            if (wVar.n) {
                wVar.n = false;
                com.google.android.gms.common.api.internal.w.k(wVar, i10);
            } else {
                wVar.n = true;
                wVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l.w
    public boolean o(k kVar) {
        Window.Callback callback = ((g.r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onStateChanged(boolean z10, int i10) {
        r6 r6Var = (r6) this.b;
        o6 o6Var = r6Var.L;
        AndroidUtilities.cancelRunOnUIThread(o6Var);
        j81 j81Var = r6Var.y;
        if (j81Var == null || !j81Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(o6Var);
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((r6) this.b).i();
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void p(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            wVar.m = k6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // hi.r0
    public void q() {
        hi.r rVar = (hi.r) this.b;
        ne.b bVar = rVar.a;
        s0 s0Var = rVar.v;
        bVar.a(s0Var.n && s0Var.l == 0, true);
        rVar.d.Z2.N(true);
    }

    @Override // org.telegram.ui.Components.ri
    public void r(gh ghVar) {
        int i10;
        i10 = ((o2) ((ig.m) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(ghVar);
    }

    @Override // ki.g1
    public /* synthetic */ boolean s(h1 h1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.gb0
    public Paint.FontMetricsInt v() {
        return ((m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // ki.g1
    public void x(CharSequence charSequence) {
        c3 c3Var = ((o5) this.b).E;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.z4(charSequence.toString());
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void y() {
        l0 l0Var = (l0) this.b;
        Iterator it = l0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        l0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // org.telegram.ui.uu0
    public void z(MessageObject messageObject) {
        ((q9) ((p4) this.b).Q1).f(false);
    }

    public /* synthetic */ c(g6.r rVar, String[] strArr) {
        this.a = 19;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.g81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c() {
        this.a = 0;
        this.b = new HashSet();
    }

    public c(Bundle bundle) {
        this.a = 12;
        this.b = new Bundle(bundle);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void J() {
    }

    @Override // ki.g1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.gb0
    public /* synthetic */ void L(String str) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void a(Bundle bundle) {
    }

    @Override // ki.g1
    public /* synthetic */ void k(h1 h1Var) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void w(int i10) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onError(j81 j81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.gb0
    public /* synthetic */ void B(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.gb0
    public /* synthetic */ void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void t(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ri
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
