package r2;

import android.content.res.Resources;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.q1;
import ig.s0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import jg.c2;
import jg.i2;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.g31;
import org.telegram.ui.jx0;
import org.telegram.ui.mw0;
import rh.e4;
import s4.i1;
import s4.n0;
import s4.o0;
import th.c3;
import th.k7;
import th.l7;
import vh.d8;
import vh.e8;
import vh.k4;
import vh.n5;
import vh.o8;
import vh.s7;
import vh.t8;
import vh.x3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class y implements m, com.google.android.gms.common.api.internal.o, ep0, i1, com.google.android.gms.common.api.internal.s, g31, k7, v0.h, c2, t8, w2.d, wd.b, Continuation, y2.g {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static boolean Y(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String b0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // vh.t8
    public void A(boolean z10) {
        i2 i2Var;
        o8 o8Var = ((d8) ((k4) this.b)).C0;
        s7 s7Var = o8Var.v1;
        if (s7Var == null) {
            return;
        }
        i2 i2Var2 = null;
        if (!z10 && (s7Var.getSelectedEntity() instanceof i2)) {
            o8Var.v1.A0(null, true);
            return;
        }
        if (!z10 || (o8Var.v1.getSelectedEntity() instanceof i2)) {
            return;
        }
        x3 x3Var = o8Var.v1.A0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= x3Var.getChildCount()) {
                i2Var = null;
                break;
            }
            View childAt = x3Var.getChildAt(i11);
            if (childAt instanceof i2) {
                i2Var = (i2) childAt;
                break;
            }
            i11++;
        }
        if (i2Var != null) {
            s7 s7Var2 = o8Var.v1;
            x3 x3Var2 = s7Var2.A0;
            while (true) {
                if (i10 >= x3Var2.getChildCount()) {
                    break;
                }
                View childAt2 = x3Var2.getChildAt(i10);
                if (childAt2 instanceof i2) {
                    i2Var2 = (i2) childAt2;
                    break;
                }
                i10++;
            }
            s7Var2.A0(i2Var2, true);
        }
    }

    @Override // vh.t8
    public void B(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null || (arrayList = n5Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((n5) k4Var.d.T.get(i10)).V = f7;
    }

    @Override // org.telegram.ui.Components.ep0
    public void B0() {
        wb k10 = ((e4) this.b).k().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // s4.i1
    public View C(int i10) {
        return ((n0) this.b).q(i10);
    }

    @Override // vh.t8
    public void D(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.F = f7;
        n5Var.j = true;
        k4Var.w(true);
    }

    @Override // s4.i1
    public int E(View view) {
        return n0.y(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
    }

    @Override // vh.t8
    public void F(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.E = f7;
        n5Var.j = true;
        k4Var.w(true);
    }

    @Override // jg.c2
    public void G(float f7) {
        s7 s7Var = (s7) this.b;
        s0.e(s7Var.o1).k(String.valueOf(ig.h.a.indexOf(s7Var.x0.getCurrentBrush())), f7);
        q1 q1Var = s7Var.j1;
        q1Var.c = f7;
        s7Var.B0(q1Var, null, false);
    }

    @Override // vh.t8
    public void H(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null || (arrayList = n5Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((n5) k4Var.d.T.get(i10)).W = f7;
    }

    public s0.c I(int i10) {
        return null;
    }

    @Override // vh.t8
    public void J(float f7) {
        n5 n5Var = ((k4) this.b).d;
        if (n5Var == null) {
            return;
        }
        n5Var.a0 = f7;
        n5Var.j = true;
    }

    @Override // vh.t8
    public void K() {
        ((k4) this.b).p(null);
    }

    @Override // vh.t8
    public void L(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.t0 = f7;
        n5Var.j = true;
        k4Var.y(true);
    }

    @Override // vh.t8
    public void N(int i10, long j10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null || (arrayList = n5Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((n5) k4Var.d.T.get(i10)).X = j10;
    }

    @Override // vh.t8
    public void O(long j10) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.D = j10;
        n5Var.j = true;
        k4Var.w(true);
    }

    public int P(int[] iArr, int i10) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        yb.a aVar = (yb.a) this.b;
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
                        yb.a aVar2 = yb.a.h;
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
        yb.b bVar = new yb.b(aVar, iArr5);
        yb.b a2 = aVar.a(i10, 1);
        yb.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        yb.b bVar3 = aVar.d;
        yb.b bVar4 = a2;
        yb.b bVar5 = bVar;
        yb.b bVar6 = bVar4;
        yb.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new yb.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            yb.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            yb.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            yb.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new yb.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        yb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        yb.b bVar10 = bVarArr[0];
        yb.b bVar11 = bVarArr[1];
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
                throw new yb.c("Error locator degree does not match number of roots");
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
                throw new yb.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    public s0.c Q(int i10) {
        return null;
    }

    public boolean R(String str) {
        String X = X(str);
        return "1".equals(X) || Boolean.parseBoolean(X);
    }

    public Integer S(String str) {
        String X = X(str);
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(X));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + b0(str) + "(" + X + ") into an int");
            return null;
        }
    }

    public JSONArray T(String str) {
        String X = X(str);
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        try {
            return new JSONArray(X);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + b0(str) + ": " + X + ", falling back to default");
            return null;
        }
    }

    public StringBuilder U() {
        xe.a aVar = (xe.a) this.b;
        if (!(aVar instanceof se.m)) {
            return null;
        }
        StringBuilder sb2 = ((se.m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public String W(Resources resources, String str, String str2) {
        String[] strArr;
        String X = X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        String X2 = X(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(X2)) {
            return null;
        }
        int identifier = resources.getIdentifier(X2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", b0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray T = T(str2.concat("_loc_args"));
        if (T == null) {
            strArr = null;
        } else {
            int length = T.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = T.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + b0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String X(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle Z() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // r2.m
    public void a(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public boolean a0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).v();
                s6.a aVar = (s6.a) this.b;
                Parcel J0 = eVar.J0();
                k7.a.d(J0, fVar);
                k7.a.c(J0, aVar);
                eVar.K0(J0, 1);
                return;
            default:
                v8.j jVar = (v8.j) this.b;
                e8.b bVar = (e8.b) obj;
                Bundle H = bVar.H();
                H.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar2 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.v();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    H.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.P(Status.h, null);
                    return;
                }
        }
    }

    @Override // r2.m
    public void b(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i10, 0, dVar.i, j10, i11);
    }

    @Override // th.k7
    public void d(long j10, int i10, th.i2 i2Var) {
        mw0 mw0Var = (mw0) this.b;
        int i11 = ProfileStoriesView.s0;
        mw0Var.f(true, false);
        i2Var.run();
    }

    @Override // vh.t8
    public void e(int i10) {
        vh.x xVar = ((k4) this.b).E;
        if (xVar != null) {
            ArrayList arrayList = xVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                vh.w wVar = (vh.w) obj;
                if (wVar.a == i10) {
                    wVar.b.e(true, 1.0f);
                    xVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override // vh.t8
    public void f(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.u0 = f7;
        n5Var.j = true;
        k4Var.c();
    }

    @Override // v0.h
    public void g(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        td.m mVar = (td.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(l9.b.a(e));
        }
    }

    @Override // jg.c2
    public float get() {
        s7 s7Var = (s7) this.b;
        int i10 = s7Var.o1;
        ig.h currentBrush = s7Var.x0.getCurrentBrush();
        return currentBrush == null ? s0.e(i10).i : s0.e(i10).f(String.valueOf(ig.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // vh.t8
    public void h(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.G = f7;
        n5Var.j = true;
        k4Var.c();
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void i(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.c).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override // vh.t8
    public void j(long j10, boolean z10) {
        k4 k4Var = (k4) this.b;
        if (!z10) {
            k4Var.m(j10);
            return;
        }
        u61 u61Var = k4Var.e;
        if (u61Var != null) {
            u61Var.q0(j10, true);
            return;
        }
        if (k4Var.j()) {
            k4Var.E.m(j10, true);
            return;
        }
        u61 u61Var2 = k4Var.D;
        if (u61Var2 != null) {
            u61Var2.q0(j10, false);
        }
    }

    @Override // s4.i1
    public int k(View view) {
        return n0.x(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
    }

    @Override // y2.g
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.b).a.y(iOException);
        return y2.l.e;
    }

    @Override // vh.t8
    public void m() {
        k4 k4Var = (k4) this.b;
        k4Var.s(null, null, true);
        o8 o8Var = ((d8) k4Var).C0;
        d8 d8Var = o8Var.X0;
        if (d8Var != null) {
            d8Var.s(null, null, true);
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            s7Var.n0();
        }
        e8 e8Var = o8Var.c1;
        if (e8Var != null) {
            e8Var.setHasRoundVideo(false);
        }
        n5 n5Var = o8Var.K1;
        if (n5Var != null) {
            File file = n5Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                o8Var.K1.o0 = null;
            }
            if (o8Var.K1.p0 != null) {
                try {
                    new File(o8Var.K1.p0).delete();
                } catch (Exception unused2) {
                }
                o8Var.K1.p0 = null;
            }
        }
    }

    @Override // y2.g
    public void o(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // v0.h
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        td.m mVar = (td.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // wd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(wd.c cVar, ed.c cVar2) {
        wd.a aVar;
        int i10;
        Throwable th2;
        xd.g gVar;
        if (cVar2 instanceof wd.a) {
            aVar = (wd.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                dd.a aVar2 = dd.a.a;
                i10 = aVar.d;
                ad.j jVar = ad.j.a;
                if (i10 != 0) {
                    l9.b.b(obj);
                    xd.g gVar2 = new xd.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = jVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        l9.b.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return jVar;
            }
        }
        aVar = new wd.a(this, cVar2);
        Object obj2 = aVar.b;
        dd.a aVar22 = dd.a.a;
        i10 = aVar.d;
        ad.j jVar2 = ad.j.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return jVar2;
    }

    @Override // vh.t8
    public void q(boolean z10, float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.Z = f7;
        n5Var.j = true;
        u61 u61Var = k4Var.e;
        if (u61Var == null || u61Var.U() == -9223372036854775807L) {
            return;
        }
        k4Var.m((long) (f7 * k4Var.e.U()));
    }

    @Override // vh.t8
    public void r(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.s0 = f7;
        n5Var.j = true;
        k4Var.y(true);
    }

    @Override // s4.i1
    public int s() {
        return ((n0) this.b).D();
    }

    @Override // r2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // vh.t8
    public void t(boolean z10) {
        k4 k4Var = (k4) this.b;
        if (k4Var.j()) {
            k4Var.E.getClass();
        }
        k4Var.x(-4, z10);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    @Override // vh.t8
    public void u(float f7, int i10) {
        ArrayList arrayList;
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null || (arrayList = n5Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((n5) k4Var.d.T.get(i10)).P = f7;
    }

    @Override // th.k7
    public boolean v(long j10, int i10, int i11, int i12, l7 l7Var) {
        ImageReceiver imageReceiver;
        c3 c3Var;
        c3 c3Var2;
        l7Var.b = null;
        l7Var.c = null;
        mw0 mw0Var = (mw0) this.b;
        jx0 jx0Var = mw0Var.h;
        ArrayList arrayList = mw0Var.x;
        if (mw0Var.N < 0.2f) {
            l7Var.b = jx0Var.getImageReceiver();
            l7Var.c = null;
            l7Var.a = jx0Var;
            l7Var.h = 0.0f;
            l7Var.i = i0.q.y;
            l7Var.g = (View) mw0Var.getParent();
            l7Var.d = mw0Var.D;
            l7Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                c3Var = null;
                c3Var2 = null;
                break;
            }
            c3 c3Var3 = (c3) arrayList.get(i13);
            if (c3Var3.e < 1.0f || c3Var3.a != i11) {
                i13++;
            } else {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                c3 d = ProfileStoriesView.d(i14 >= 0 ? (c3) arrayList.get(i14) : null, i15 >= 0 ? (c3) arrayList.get(i15) : null, c3Var3);
                imageReceiver = c3Var3.b;
                c3Var2 = d;
                c3Var = c3Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        l7Var.c = imageReceiver;
        l7Var.b = null;
        l7Var.a = mw0Var;
        l7Var.h = 0.0f;
        l7Var.i = i0.q.y;
        l7Var.g = (View) mw0Var.getParent();
        if (c3Var == null || c3Var2 == null) {
            l7Var.f = null;
            return true;
        }
        l7Var.f = new f1.a(this, new RectF(c3Var.m), c3Var, new RectF(c3Var2.m), c3Var2);
        return true;
    }

    @Override // vh.t8
    public void w(float f7) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.P = f7;
        k4Var.c();
    }

    @Override // s4.i1
    public int y() {
        n0 n0Var = (n0) this.b;
        return n0Var.m - n0Var.E();
    }

    @Override // vh.t8
    public void z(long j10) {
        k4 k4Var = (k4) this.b;
        n5 n5Var = k4Var.d;
        if (n5Var == null) {
            return;
        }
        n5Var.r0 = j10;
        n5Var.j = true;
        k4Var.y(true);
    }

    public /* synthetic */ y(s6.g gVar, s6.a aVar) {
        this.a = 5;
        this.b = aVar;
    }

    public y(Bundle bundle) {
        this.a = 17;
        this.b = new Bundle(bundle);
    }

    public y(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                break;
            case 14:
                this.b = new t7.u(28);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new dg0(this);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.ep0
    public /* synthetic */ void V() {
    }

    @Override // r2.m
    public void flush() {
    }

    @Override // r2.m
    public void shutdown() {
    }

    @Override // r2.m
    public void start() {
    }

    @Override // r2.m
    public void x() {
    }

    @Override // th.k7
    public /* synthetic */ void c(boolean z10) {
    }

    @Override // y2.g
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void n(y2.i iVar, long j10, long j11, int i10) {
    }
}
