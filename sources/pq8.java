// default package

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class pq8 implements be8, mu8, iz8, ifc, hj, on5, uw8, rfc, tw8, dia, bl0, aea, fx7, lm6, ty9, jx9, v78, s99, p6d {
    public final /* synthetic */ byte a;
    public final Object b;

    public pq8(byte b) {
        this.a = b;
        switch (b) {
            case 22:
                this.b = new SparseArray();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // iz8
    public final void A(jz8 jz8Var) {
        rz8 rz8Var = (rz8) this.b;
        FrameLayout frameLayout = rz8Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(jz8Var);
        }
        if (rz8Var.G == jz8Var) {
            rz8Var.G = null;
        }
        f09 f09Var = rz8Var.d;
        if (f09Var != null) {
            f09Var.setScanHidden(false);
        }
    }

    @Override // jx9
    public final void B(of3 of3Var) {
        tzb tzbVar = ((ozb) this.b).w0;
        HashSet hashSet = tzb.s1;
        tzbVar.Q0(of3Var);
    }

    @Override // bl0
    public final float B0() {
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        bl0 i = i();
        float B0 = e != null ? e.B0() : -1.0f;
        float B02 = i != null ? i.B0() : B0;
        return (B02 < 0.0f || B0 < 0.0f) ? ulaVar.a < 0.5f ? B02 : B0 : hl.R1(B02, B0, ulaVar.a);
    }

    @Override // be8
    public final TextureView D() {
        return null;
    }

    @Override // bl0
    public final float D0() {
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        bl0 i = i();
        float D0 = e != null ? e.D0() : -1.0f;
        float D02 = i != null ? i.D0() : D0;
        return (D02 < 0.0f || D0 < 0.0f) ? ulaVar.a < 0.5f ? D02 : D0 : hl.R1(D02, D0, ulaVar.a);
    }

    @Override // aea
    public final boolean E() {
        v21 k = ((wua) this.b).j().k(false);
        k.u = true;
        k.j();
        return true;
    }

    @Override // fx7
    public final void G(float f) {
        ((k3b) this.b).setOutlineWidth(f);
    }

    @Override // dia
    public final void H() {
        ((eja) this.b).J.a(-1);
    }

    @Override // mu8
    public final void I() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // be8
    public final void J(r47 r47Var) {
        ws8 ws8Var = ((ProfileActivity) this.b).n0;
        if (ws8Var == null || !ws8Var.a) {
            return;
        }
        ws8Var.L.e(true, 0.0f);
        ws8Var.invalidate();
    }

    @Override // dia
    public final b8 K(String str) {
        sla slaVar = ((eja) this.b).J;
        return slaVar.d(0, 0, null, str, true, true, slaVar.n0);
    }

    @Override // bl0
    public final int Q1() {
        o27 o27Var;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        int Q1 = e != null ? e.Q1() : 0;
        return (ulaVar.a >= 1.0f || (o27Var = ulaVar.d) == null) ? Q1 : vm2.f(ulaVar.a, o27Var.getButtonsGlassBackgroundColor(), Q1);
    }

    @Override // bl0
    public final int X() {
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        int X = (e == null || !ulaVar.d.f()) ? 0 : e.X();
        bl0 i = i();
        if (i != null) {
            return vm2.f(ulaVar.a, i.X(), X);
        }
        return X;
    }

    @Override // dia
    public final b8 Z(int i, Runnable runnable, String str, boolean z, boolean z2) {
        eja ejaVar = (eja) this.b;
        b8 e = ejaVar.J.e(0, i, str);
        if (z) {
            int i2 = aob.p7;
            e.d(ejaVar.c0(i2), ejaVar.c0(i2));
        }
        e.setOnClickListener(new hw2(this, z2, runnable));
        return e;
    }

    @Override // lm6
    public final void a(int i, g43 g43Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, g43Var.i, j, i2);
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p7d p7dVar = (p7d) ((f6d) obj).k();
        e6d e6dVar = (e6d) this.b;
        Parcel c = p7dVar.c();
        v6d.b(c, e6dVar);
        try {
            p7dVar.b.transact(1, c, null, 1);
            c.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            c.recycle();
            throw th;
        }
    }

    @Override // lm6
    public final void b(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // iz8
    public final void d(String str) {
        rz8 rz8Var = (rz8) this.b;
        if (rz8Var.getParentActivity() != null) {
            m01.u(rz8Var.getParentActivity(), str);
        }
    }

    public final bl0 e() {
        o27 o27Var = ((ula) this.b).d;
        if (o27Var != null) {
            return o27Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // mu8
    public final void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // jx9
    public final void finish() {
        Point point = hl.q;
        if (point.x > point.y) {
            ((ozb) this.b).w0.finishPreviewFragment();
        }
    }

    @Override // rfc
    public final void g(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ac8 ac8Var = secretMediaViewer.E;
        if (ac8Var != null) {
            long U = ac8Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
            secretMediaViewer.E.g0();
        }
    }

    @Override // p6d
    public final void g1(Bundle bundle) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            b8dVar.m = ws2.f;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // uw8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                return new hu9(hu9.d, (Context) ((pq5) obj).a, "com.google.android.datatransport.events");
            default:
                return new zaa((yja) ((tw8) obj).get());
        }
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        rob robVar = (rob) this.b;
        return String.valueOf(Math.round((robVar.b.getProgress() * (robVar.e - r0)) + robVar.d));
    }

    @Override // rfc
    public final void h(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ac8 ac8Var = secretMediaViewer.E;
        if (ac8Var != null) {
            ac8Var.f0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0((long) (f * U), false);
            }
        }
    }

    public final bl0 i() {
        o27 o27Var;
        ula ulaVar = (ula) this.b;
        if (ulaVar.a >= 1.0f || (o27Var = ulaVar.d) == null) {
            return null;
        }
        return o27Var.getButtonsGlassColorProvider();
    }

    @Override // ty9
    public final int i0() {
        rob robVar = (rob) this.b;
        return robVar.e - robVar.d;
    }

    public final void j(StringBuilder sb) {
        sb.append(((Boolean) qd4.l(1, (ArrayList) this.b)).booleanValue() ? "</ol>" : "</ul>");
    }

    @Override // be8
    public final void k(r47 r47Var) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        profileActivity.a.K0(true);
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null && gr8Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().K0(true);
        }
        profileActivity.d1.setBackgroundColor(vm2.f(0.1f, profileActivity.Y1(profileActivity.Z4.f), aob.v0(aob.a7, profileActivity.A0)));
    }

    public final void l(StringBuilder sb) {
        while (!((ArrayList) this.b).isEmpty()) {
            j(sb);
        }
    }

    @Override // v78
    public final void m(ArrayList arrayList) {
        am2 am2Var = (am2) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            q7a q7aVar = (q7a) arrayList.get(0);
            if (q7aVar.c != null) {
                am2Var.f = new File(xb4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = hl.b1();
                Bitmap G = in5.G(q7aVar.c, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) am2Var.f));
                ((qvc) am2Var.e).b((File) am2Var.f, G, true);
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // bl0
    public final int m0() {
        bl0 e = e();
        bl0 i = i();
        int m0 = e != null ? e.m0() : 0;
        if (i != null) {
            return vm2.f(((ula) this.b).a, i.m0(), m0);
        }
        return m0;
    }

    @Override // bl0
    public final float m1() {
        bl0 e = e();
        bl0 i = i();
        float m1 = e != null ? e.m1() : 0.0f;
        return i != null ? hl.R1(i.m1(), m1, ((ula) this.b).a) : m1;
    }

    public final nhc n(Class cls) {
        String str;
        String a;
        ki2 a2 = s89.a(cls);
        ko9 ko9Var = (ko9) this.b;
        Map map = ki2.b;
        Class cls2 = a2.a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            str = (!componentType.isPrimitive() || (a = tvd.a(componentType.getName())) == null) ? null : a.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String a3 = tvd.a(cls2.getName());
            str = a3 == null ? cls2.getCanonicalName() : a3;
        }
        if (str != null) {
            return ko9Var.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        lq5.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // ty9
    public final void o(boolean z, float f) {
        rob robVar = (rob) this.b;
        robVar.r.D0(Math.round(((robVar.e - r0) * f) + robVar.d));
    }

    @Override // bl0
    public final int o1() {
        bl0 e = e();
        bl0 i = i();
        int o1 = e != null ? e.o1() : 0;
        if (i != null) {
            return vm2.f(((ula) this.b).a, i.o1(), o1);
        }
        return o1;
    }

    @Override // ifc
    public final void onStateChanged(boolean z, int i) {
        x59 x59Var = (x59) this.b;
        if (z && x59Var.n.S() >= 0) {
            x59Var.x = true;
        }
        mf8 mf8Var = x59Var.f;
        v59 v59Var = x59Var.y;
        mf8Var.a(z, true);
        hl.r(v59Var);
        if (z) {
            hl.d3(v59Var, 16L);
        }
    }

    @Override // ifc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // jx9
    public final void p(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            ((ozb) this.b).w0.movePreviewFragment(f);
        }
    }

    public void q() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        ((pk9) this.b).s0(true);
    }

    public final boolean s() {
        q6d q6dVar = ((d6d) this.b).d;
        return q6dVar != null && q6dVar.g();
    }

    @Override // lm6
    public final void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void t() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new vc(view, (byte) 7));
        }
    }

    @Override // p6d
    public final void w(ws2 ws2Var) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            b8dVar.m = ws2Var;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bl0
    public final int x0() {
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        int x0 = (e == null || !ulaVar.d.f()) ? 0 : e.x0();
        bl0 i = i();
        if (i != null) {
            return vm2.f(ulaVar.a, i.x0(), x0);
        }
        return x0;
    }

    @Override // bl0
    public final int x1() {
        bl0 e = e();
        bl0 i = i();
        int x1 = e != null ? e.x1() : 0;
        if (i != null) {
            return vm2.f(((ula) this.b).a, i.x1(), x1);
        }
        return x1;
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ((yg9) this.b).w0(i, i2, z);
    }

    @Override // v78
    public final void y0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((am2) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p6d
    public final void z0(int i) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            if (b8dVar.n) {
                b8dVar.n = false;
                b8dVar.b.z0(i);
                b8dVar.m = null;
                b8dVar.l = null;
            } else {
                b8dVar.n = true;
                b8dVar.d.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ifc
    public final void onRenderedFirstFrame() {
    }

    @Override // lm6
    public final void c() {
    }

    @Override // lm6
    public final void flush() {
    }

    @Override // lm6
    public final void shutdown() {
    }

    @Override // lm6
    public final void start() {
    }

    @Override // aea
    public final void u() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // ifc
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekFinished(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekStarted(uj ujVar) {
    }

    @Override // ifc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ pq8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pq8(rhc rhcVar, qhc qhcVar) {
        this(rhcVar, qhcVar, c23.b);
        this.a = (byte) 24;
        rhcVar.getClass();
    }

    public pq8(rhc rhcVar, qhc qhcVar, e23 e23Var) {
        this.a = (byte) 24;
        rhcVar.getClass();
        qhcVar.getClass();
        e23Var.getClass();
        this.b = new ko9(rhcVar, qhcVar, e23Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pq8(jp4 jp4Var) {
        this(jp4Var.f(), jp4Var.c(), jp4Var.d());
        this.a = (byte) 24;
        jp4Var.getClass();
    }

    @Override // fx7
    public final float get() {
        return ((k3b) this.b).G;
    }

    @Override // ifc
    public final void onError(kfc kfcVar, Exception exc) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }

    @Override // ifc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
