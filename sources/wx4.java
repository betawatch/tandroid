// default package

import android.content.ClipData;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx4 implements ee, Continuation, GlGenericDrawer.TextureCallback, au9, lh2, y73, dq5, a7c, id1, OnSuccessListener, OnFailureListener, h59, qq7, g59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx4(s05 s05Var, a32 a32Var) {
        this.a = (byte) 6;
        this.b = s05Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        z16 z16Var = (z16) this.b;
        iq5 H0 = gm.H0(wzcVar, false);
        if (!z16Var.a.equals(H0)) {
            z16Var.a = H0;
            z16Var.requestLayout();
        }
        int childCount = z16Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            kfc.b(z16Var.getChildAt(i), wzcVar);
        }
        return wzcVar;
    }

    @Override // au9
    public final boolean F1(int i) {
        byte b = this.a;
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        byte b = this.a;
        return null;
    }

    @Override // dq5
    public final boolean a(lj4 lj4Var, int i, Bundle bundle) {
        nw2 nw2Var;
        hq hqVar = (hq) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((fq5) lj4Var.a).g();
                Parcelable parcelable = (Parcelable) ((fq5) lj4Var.a).k();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        fq5 fq5Var = (fq5) lj4Var.a;
        ClipData clipData = new ClipData(fq5Var.getDescription(), new ClipData.Item(fq5Var.e()));
        if (i2 >= 31) {
            nw2Var = new mw2(clipData, 2);
        } else {
            ow2 ow2Var = new ow2();
            ow2Var.b = clipData;
            ow2Var.c = (byte) 2;
            nw2Var = ow2Var;
        }
        nw2Var.c(fq5Var.h());
        nw2Var.setExtras(bundle);
        return kfc.i(hqVar, nw2Var.build()) == null;
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
        byte b = this.a;
    }

    @Override // y73
    public final a83 createDataSource() {
        return ((y73) ((k6d) this.b).b).createDataSource();
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        int Z;
        m86 m86Var = (m86) this.b;
        ArrayList arrayList = m86Var.s;
        if (view == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        g86 g86Var = (g86) arrayList.get(i);
        int i2 = g86Var.a;
        int i3 = g86Var.e;
        if (i2 == 3 || i2 == 4) {
            if (e86.f()) {
                m86Var.e = c41.b0(m86Var).M(new ci0(0.1f, cmb.w0(null, cmb.X5, false)), jb6.M0(2131748626, null)).j();
                return;
            }
            if (g86Var.a == 3 && Integer.bitCount(i3) > 1 && (!jb6.a0 ? f >= view.getMeasuredWidth() - gm.L(75.0f) : f <= gm.L(75.0f)) && (Z = m86Var.Z(i3)) != -1) {
                m86Var.n[Z] = !r6[Z];
                m86Var.d0();
                m86Var.c0();
                return;
            }
            boolean z = (e86.d(true) & i3) > 0;
            int d = e86.d(true);
            e86.i = !z ? d | i3 : d & (~i3);
            e86.k();
            m86Var.d0();
        } else if (i2 == 5 && g86Var.f) {
            SharedPreferences d1 = oc7.d1();
            boolean z2 = d1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = d1.edit();
            boolean z3 = !z2;
            edit.putBoolean("view_animations", z3);
            gda.y1 = Boolean.valueOf(z3);
            edit.commit();
            ((xib) view).setChecked(z3);
        }
        sy4.f();
    }

    @Override // au9
    public final vh6 e1() {
        byte b = this.a;
        return null;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        return ((LanguageSelectActivity) this.b).k0(i, view);
    }

    @Override // id1
    public final long get() {
        return ((sa8) ((fk3) this.b).a).getCaptionsVideoPosition();
    }

    @Override // a7c
    public final void h() {
        sa8 sa8Var = (sa8) this.b;
        TextView textView = sa8Var.o1;
        boolean a = sa8Var.v0.a();
        ImageView imageView = sa8Var.m1;
        imageView.animate().cancel();
        imageView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        textView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override // lh2
    public final void i() {
        cg5 cg5Var = (cg5) this.b;
        float progress = 1.0f - (cg5Var.w.getProgress() * 0.143f);
        bf0 bf0Var = cg5Var.a;
        bf0Var.setScaleX(progress);
        bf0Var.setScaleY(progress);
        cg5Var.invalidate();
    }

    @Override // au9
    public final void o(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                mc5 mc5Var = (mc5) obj;
                oc5 oc5Var = mc5Var.J;
                oc5Var.u0(mc5Var.I);
                if (mc5Var.h == null && !mc5Var.f.e() && mc5Var.b() == 0) {
                    oc5Var.s.e(false, true);
                }
                mc5Var.f();
                break;
            default:
                et5 et5Var = (et5) obj;
                it5 it5Var = et5Var.n;
                it5Var.J0(et5Var.f - 1);
                if (et5Var.h == null && !et5Var.e.e() && et5Var.b() <= 2) {
                    it5Var.t1.e(false, true);
                }
                et5Var.f();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((yy5) this.b).o(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((zy5) this.b).a((String) obj);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yx4) obj).E0();
                break;
            case 10:
                ((zc5) obj).Z(true);
                break;
            case 15:
                it5 it5Var = (it5) obj;
                vh6 vh6Var = it5Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < vh6Var.m(); i3++) {
                    arrayList.add(oc7.r1(it5Var.a).W1(Long.valueOf(vh6Var.j(i3))));
                }
                ic5 ic5Var = it5Var.f2;
                if (ic5Var != null) {
                    ic5Var.f(0, arrayList);
                }
                it5Var.dismiss();
                break;
            case 18:
                ((n88) obj).run();
                break;
            case 20:
                ((ky5) obj).a.Z1.p();
                break;
            case 24:
                String str = LaunchActivity.C1;
                gm.g((StringBuilder) obj);
                break;
            case 27:
                ze6 ze6Var = (ze6) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ze6Var.J);
                bundle.putString("ephone", ze6Var.K);
                bundle.putString("phoneFormated", ze6Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ze6Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ze6Var.N;
                ze6Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new re6(ze6Var, bundle, tL_auth_resetLoginEmail, b2), 10);
                break;
            case 28:
                if6 if6Var = (if6) obj;
                if6Var.E.O1(if6Var.s, if6Var.w, if6Var.x);
                break;
            default:
                ag6 ag6Var = (ag6) obj;
                mh6 mh6Var = ag6Var.H;
                mh6Var.B1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i2 = ((d) mh6Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(deleteaccount, new r15(ag6Var, (byte) 7), 10);
                break;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public final void run(Bitmap bitmap, int i) {
        ha5 ha5Var = (ha5) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / nm7.J2));
        gm.c3(new ve4(ha5Var, bitmap, (byte) 27));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Exception exception;
        sm2 sm2Var = (sm2) this.b;
        sm2Var.getClass();
        if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
            return task;
        }
        Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
        ((si4) ((ti4) sm2Var.d)).c.l().delete();
        return sm2Var.L();
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    public /* synthetic */ wx4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(ArrayList arrayList) {
    }

    private final void c(ArrayList arrayList) {
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
