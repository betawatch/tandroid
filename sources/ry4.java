// default package

import android.content.ClipData;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ry4 implements GlGenericDrawer.TextureCallback, yr9, ed, xf2, m63, do5, a5c, ac1, OnSuccessListener, OnFailureListener, e39, no7, d39, x74, th4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ry4(ty4 ty4Var, k32 k32Var) {
        this.a = (byte) 3;
        this.b = ty4Var;
    }

    @Override // x74
    public final void D(float f, int i) {
        byte b = this.a;
    }

    @Override // yr9
    public final vf6 O0() {
        byte b = this.a;
        return null;
    }

    @Override // yr9
    public final boolean U1(int i) {
        byte b = this.a;
        return true;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        zz5 zz5Var = (zz5) this.b;
        io5 H0 = gl.H0(vxcVar, false);
        if (!zz5Var.a.equals(H0)) {
            zz5Var.a = H0;
            zz5Var.requestLayout();
        }
        int childCount = zz5Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            jdc.b(zz5Var.getChildAt(i), vxcVar);
        }
        return vxcVar;
    }

    @Override // do5
    public final boolean a(gi3 gi3Var, int i, Bundle bundle) {
        dv2 dv2Var;
        hp hpVar = (hp) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((fo5) gi3Var.a).h();
                Parcelable parcelable = (Parcelable) ((fo5) gi3Var.a).l();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        fo5 fo5Var = (fo5) gi3Var.a;
        ClipData clipData = new ClipData(fo5Var.getDescription(), new ClipData.Item(fo5Var.f()));
        if (i2 >= 31) {
            dv2Var = new cv2(clipData, 2);
        } else {
            ev2 ev2Var = new ev2();
            ev2Var.b = clipData;
            ev2Var.c = (byte) 2;
            dv2Var = ev2Var;
        }
        dv2Var.c(fo5Var.i());
        dv2Var.setExtras(bundle);
        return jdc.i(hpVar, dv2Var.build()) == null;
    }

    @Override // m63
    public final o63 createDataSource() {
        return ((m63) ((l69) this.b).b).createDataSource();
    }

    @Override // e39
    public final boolean d(int i, View view) {
        return ((LanguageSelectActivity) this.b).j0(i, view);
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        int Y;
        m66 m66Var = (m66) this.b;
        ArrayList arrayList = m66Var.s;
        if (view == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        g66 g66Var = (g66) arrayList.get(i);
        int i2 = g66Var.a;
        int i3 = g66Var.e;
        if (i2 == 3 || i2 == 4) {
            if (e66.f()) {
                m66Var.e = u21.b0(m66Var).M(new ch0(0.1f, bkb.w0(null, bkb.X5, false)), k96.M0(2131748677, null)).j();
                return;
            }
            if (g66Var.a == 3 && Integer.bitCount(i3) > 1 && (!k96.a0 ? f >= view.getMeasuredWidth() - gl.L(75.0f) : f <= gl.L(75.0f)) && (Y = m66Var.Y(i3)) != -1) {
                m66Var.n[Y] = !r6[Y];
                m66Var.c0();
                m66Var.b0();
                return;
            }
            boolean z = (e66.d(true) & i3) > 0;
            int d = e66.d(true);
            e66.i = !z ? d | i3 : d & (~i3);
            e66.k();
            m66Var.c0();
        } else if (i2 == 5 && g66Var.f) {
            SharedPreferences c1 = na7.c1();
            boolean z2 = c1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = c1.edit();
            boolean z3 = !z2;
            edit.putBoolean("view_animations", z3);
            gba.z1 = Boolean.valueOf(z3);
            edit.commit();
            ((wgb) view).setChecked(z3);
        }
        qw4.f();
    }

    @Override // xf2
    public final void f() {
        ee5 ee5Var = (ee5) this.b;
        float progress = 1.0f - (ee5Var.w.getProgress() * 0.143f);
        be0 be0Var = ee5Var.a;
        be0Var.setScaleX(progress);
        be0Var.setScaleY(progress);
        ee5Var.invalidate();
    }

    @Override // th4
    public final void g(float f) {
        vk6 vk6Var = (vk6) this.b;
        zac zacVar = vk6Var.f1.b;
        if (zacVar.f != f) {
            zacVar.f = f;
            zacVar.c(false);
        }
        vk6Var.G0(vk6Var.d0);
    }

    @Override // ac1
    public final long get() {
        return ((q88) ((s34) this.b).b).getCaptionsVideoPosition();
    }

    @Override // a5c
    public final void h() {
        q88 q88Var = (q88) this.b;
        TextView textView = q88Var.o1;
        boolean a = q88Var.v0.a();
        ImageView imageView = q88Var.m1;
        imageView.animate().cancel();
        imageView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        textView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
        byte b = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((yw5) this.b).n(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((zw5) this.b).a((String) obj);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 27:
                ch6 ch6Var = (ch6) obj;
                ch6Var.setScaleX(gl.R1(1.0f, 1.019f, f));
                ch6Var.setScaleY(gl.R1(1.0f, 1.019f, f));
                break;
            default:
                ((zj6) obj).b0();
                break;
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // yr9
    public final void r(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                oa5 oa5Var = (oa5) obj;
                qa5 qa5Var = oa5Var.J;
                qa5Var.t0(oa5Var.I);
                if (oa5Var.h == null && !oa5Var.f.e() && oa5Var.b() == 0) {
                    qa5Var.s.e(false, true);
                }
                oa5Var.f();
                break;
            default:
                fr5 fr5Var = (fr5) obj;
                jr5 jr5Var = fr5Var.n;
                jr5Var.J0(fr5Var.f - 1);
                if (fr5Var.h == null && !fr5Var.e.e() && fr5Var.b() <= 2) {
                    jr5Var.t1.e(false, true);
                }
                fr5Var.f();
                break;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public final void run(Bitmap bitmap, int i) {
        h85 h85Var = (h85) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / kk7.J2));
        gl.d3(new vc4(h85Var, bitmap, (byte) 26));
    }

    @Override // yr9
    public final vf6 t1() {
        byte b = this.a;
        return null;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 7:
                ((bb5) obj).Y(true);
                break;
            case 12:
                jr5 jr5Var = (jr5) obj;
                vf6 vf6Var = jr5Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                    arrayList.add(na7.q1(jr5Var.a).V1(Long.valueOf(vf6Var.j(i3))));
                }
                ka5 ka5Var = jr5Var.f2;
                if (ka5Var != null) {
                    ka5Var.f(0, arrayList);
                }
                jr5Var.dismiss();
                break;
            case 15:
                ((l68) obj).run();
                break;
            case 17:
                ((kw5) obj).a.Z1.q();
                break;
            case 21:
                String str = LaunchActivity.C1;
                gl.g((StringBuilder) obj);
                break;
            case 24:
                ad6 ad6Var = (ad6) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ad6Var.J);
                bundle.putString("ephone", ad6Var.K);
                bundle.putString("phoneFormated", ad6Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ad6Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ad6Var.N;
                ad6Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sc6(ad6Var, bundle, tL_auth_resetLoginEmail, b2), 10);
                break;
            case 25:
                jd6 jd6Var = (jd6) obj;
                jd6Var.E.N1(jd6Var.s, jd6Var.w, jd6Var.x);
                break;
            default:
                be6 be6Var = (be6) obj;
                mf6 mf6Var = be6Var.H;
                mf6Var.A1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i2 = ((d) mf6Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(deleteaccount, new n35(be6Var, (byte) 6), 10);
                break;
        }
    }

    public /* synthetic */ ry4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void i(ArrayList arrayList) {
    }

    private final void j(ArrayList arrayList) {
    }

    private final void b(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
