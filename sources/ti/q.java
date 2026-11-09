package ti;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import bg.v0;
import c8.ha;
import c8.kc;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.messenger.z8;
import org.telegram.ui.LaunchActivity;
import p4.x;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class q {
    public final l2.i a;
    public LaunchActivity b;
    public r c;
    public v0 d;
    public o e;
    public o f;
    public p g;
    public View h;
    public boolean i;
    public boolean j;
    public x k;
    public final RectF l;
    public final int[] m;
    public String n;
    public boolean o;
    public final Rect p;
    public boolean q;
    public String r;
    public final StringBuilder s;
    public final ArrayList t;
    public boolean u;
    public final androidx.mediarouter.app.f v;

    public q(l2.i iVar) {
        new Rect();
        this.l = new RectF();
        this.m = new int[2];
        this.p = new Rect();
        this.s = new StringBuilder();
        this.t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.a = iVar;
    }

    public final void a(o oVar) {
        PictureInPictureParams b10 = b(oVar);
        String str = this.r;
        if (str == null || !str.equals(this.n)) {
            this.n = this.r;
            g0.w3(this.b, b10);
        }
    }

    public final PictureInPictureParams b(o oVar) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.s;
        boolean z9 = false;
        sb2.setLength(0);
        int I = oVar.a.I();
        m mVar = oVar.a;
        int U = mVar.U();
        if (I > 0 && U > 0) {
            float f10 = I / U;
            Rational rational = f10 < 0.45f ? new Rational(45, 100) : f10 > 2.35f ? new Rational(qs.K3, 100) : new Rational(I, U);
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = oVar.c;
        Rect rect = this.p;
        if (i7 != 2) {
            this.q = e(oVar, rect);
        }
        if (this.q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        mVar.Z(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            l lVar = (l) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", lVar.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, lVar.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, lVar.b);
            CharSequence charSequence = lVar.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(lVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.u) {
            this.u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.b.registerReceiver(fVar, intentFilter);
            }
        }
        builder.setActions(arrayList);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            RemoteAction remoteAction2 = (RemoteAction) arrayList.get(i12);
            sb2.append('|');
            sb2.append(remoteAction2.getTitle());
            sb2.append(remoteAction2.isEnabled());
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            if (i13 >= 31 && oVar.c != 2) {
                z9 = true;
            }
            builder.setAutoEnterEnabled(z9);
            sb2.append('|');
            sb2.append(z9);
        }
        this.r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.u && (launchActivity = this.b) != null) {
            this.u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        r rVar = this.c;
        if (rVar != null) {
            g0.E2(rVar);
            this.c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    public final void d() {
        i iVar;
        o oVar = this.f;
        p pVar = this.g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.c(false);
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.a(null, null);
        }
        l2.i iVar2 = this.a;
        if (oVar != null) {
            m mVar = oVar.a;
            if (view != null) {
                oVar.c = oVar.d;
                mVar.e(view);
                mVar.y(view);
                iVar2.f();
                return;
            }
        }
        if (oVar == null || pVar == null) {
            iVar2.f();
            return;
        }
        if (oVar.d != 1 || (iVar = oVar.e) == null) {
            oVar.c = 0;
            SurfaceTexture surfaceTexture = pVar.a;
            pVar.a = null;
            if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                surfaceTexture = z8.c();
            }
            if (surfaceTexture != null) {
                oVar.a.C(surfaceTexture);
            }
        } else {
            oVar.c = 1;
            iVar.j = pVar;
            g0.E2(pVar);
            iVar.i.addView(pVar, 0, ha.c(-1.0f, -1));
            iVar.a();
            iVar.k();
        }
        iVar2.f();
    }

    public final boolean e(o oVar, Rect rect) {
        if (this.b != null) {
            if (oVar.e()) {
                i iVar = oVar.e;
                RectF rectF = this.l;
                iVar.g(rectF);
                rectF.round(rect);
            } else {
                oVar.a.v(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.b.getWindow().getDecorView();
                int[] iArr = this.m;
                decorView.getLocationOnScreen(iArr);
                rect.offset(-iArr[0], -iArr[1]);
                float width = rect.width() / rect.height();
                if (rect.intersect(0, 0, decorView.getWidth(), decorView.getHeight()) && Math.abs(((rect.width() / rect.height()) / width) - 1.0f) < 0.02f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Object obj) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 35 && com.google.android.recaptcha.internal.a.u(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (oVar = this.e) != null) {
            i(oVar);
        }
    }

    public final void g() {
        int i7;
        if (this.b == null || (i7 = Build.VERSION.SDK_INT) < 26 || i7 >= 31 || this.f != null) {
            return;
        }
        j();
        o oVar = this.e;
        if (oVar == null) {
            return;
        }
        PictureInPictureParams b10 = b(oVar);
        i(this.e);
        try {
            if (this.b.enterPictureInPictureMode(b10)) {
                return;
            }
            d();
        } catch (Exception e10) {
            a8.g(e10, true);
            d();
        }
    }

    public final void h() {
        x xVar = this.k;
        if (xVar != null) {
            try {
                synchronized (x.b) {
                    x.c.remove(xVar.a.i);
                }
                xVar.a.r();
            } catch (Exception unused) {
            }
            this.k = null;
        }
    }

    public final void i(o oVar) {
        i iVar;
        if (this.c == null || this.b == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
        int i7 = oVar.c;
        m mVar = oVar.a;
        sb2.append(i7);
        l2.i.g(sb2.toString());
        Rect rect = new Rect();
        if (!e(oVar, rect)) {
            rect.setEmpty();
        }
        this.f = oVar;
        p pVar = null;
        this.e = null;
        this.o = true;
        oVar.d = oVar.c;
        View x10 = oVar.e == null ? mVar.x(this.b) : null;
        boolean z9 = x10 != null && rect.isEmpty();
        v0 v0Var = this.d;
        if (v0Var != null && !z9) {
            v0Var.c(true);
        }
        if (x10 != null) {
            if (z9) {
                x10.setVisibility(4);
            }
            this.c.a(x10, rect);
            mVar.S(x10);
        } else if (oVar.c != 1 || (iVar = oVar.e) == null) {
            pVar = new p(this.b);
            this.c.a(pVar, rect);
            mVar.g(pVar);
        } else {
            p pVar2 = iVar.j;
            iVar.j = null;
            iVar.d();
            iVar.l();
            if (pVar2 != null) {
                g0.E2(pVar2);
            }
            this.c.a(pVar2, rect);
            pVar = pVar2;
        }
        this.c.bringToFront();
        this.g = pVar;
        this.h = x10;
        oVar.c = 2;
        k(oVar);
    }

    public final void j() {
        o oVar;
        i iVar;
        LaunchActivity launchActivity = this.b;
        if (launchActivity == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        o oVar2 = this.f;
        if (oVar2 != null) {
            if (!this.o) {
                a(oVar2);
            }
            k(this.f);
            return;
        }
        if (!kc.b(launchActivity) || kc.a(this.b)) {
            oVar = null;
        } else {
            ArrayList arrayList = (ArrayList) this.a.c;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    oVar = (o) arrayList.get(size);
                    int i7 = oVar.c;
                    m mVar = oVar.a;
                    if (i7 == 0 && mVar.D() == null && mVar.E() && mVar.K()) {
                        break;
                    } else {
                        size--;
                    }
                } else {
                    oVar = null;
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        o oVar3 = (o) arrayList.get(size2);
                        int i10 = oVar3.c;
                        m mVar2 = oVar3.a;
                        if (i10 == 1 && mVar2.K() && ((iVar = oVar3.e) == null ? !(!oVar3.f || oVar3.g) : !(iVar.f || iVar.k != null)) && (oVar == null || mVar2.j() > oVar.a.j())) {
                            oVar = oVar3;
                        }
                    }
                    if (oVar == null) {
                        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                            o oVar4 = (o) arrayList.get(size3);
                            int i11 = oVar4.c;
                            m mVar3 = oVar4.a;
                            if (i11 == 0 && mVar3.P() && mVar3.K() && (oVar == null || mVar3.j() > oVar.a.j())) {
                                oVar = oVar4;
                            }
                        }
                    }
                }
            }
        }
        this.e = oVar;
        if (oVar != null) {
            this.j = true;
            a(oVar);
        } else if (this.j) {
            this.j = false;
            this.n = null;
            g0.c3(this.b);
        }
        h();
    }

    public final void k(o oVar) {
        c1 M = oVar != null ? oVar.a.M() : null;
        if (M == null) {
            h();
            return;
        }
        x xVar = this.k;
        if (xVar == null || xVar.a.t.a != M) {
            h();
            try {
                p4.r rVar = new p4.r(this.b, M);
                rVar.c = "utils-pip-media-session";
                this.k = rVar.a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
