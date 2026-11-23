package wi;

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
import c8.ma;
import c8.nd;
import com.google.android.gms.internal.vision.e2;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.ls;
import org.telegram.messenger.z8;
import org.telegram.ui.LaunchActivity;
import p4.r;
import p4.x;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class p {
    public final l2.i a;
    public LaunchActivity b;
    public q c;
    public v0 d;
    public n e;
    public n f;
    public o g;
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

    public p(l2.i iVar) {
        new Rect();
        this.l = new RectF();
        this.m = new int[2];
        this.p = new Rect();
        this.s = new StringBuilder();
        this.t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.a = iVar;
    }

    public final void a(n nVar) {
        PictureInPictureParams b10 = b(nVar);
        String str = this.r;
        if (str == null || !str.equals(this.n)) {
            this.n = this.r;
            g0.u3(this.b, b10);
        }
    }

    public final PictureInPictureParams b(n nVar) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.s;
        boolean z10 = false;
        sb2.setLength(0);
        int J = nVar.a.J();
        l lVar = nVar.a;
        int a02 = lVar.a0();
        if (J > 0 && a02 > 0) {
            float f10 = J / a02;
            Rational rational = f10 < 0.45f ? new Rational(45, 100) : f10 > 2.35f ? new Rational(ls.L3, 100) : new Rational(J, a02);
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = nVar.c;
        Rect rect = this.p;
        if (i7 != 2) {
            this.q = e(nVar, rect);
        }
        if (this.q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        lVar.h0(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            k kVar = (k) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", kVar.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, kVar.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, kVar.b);
            CharSequence charSequence = kVar.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(kVar.d);
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
            if (i13 >= 31 && nVar.c != 2) {
                z10 = true;
            }
            builder.setAutoEnterEnabled(z10);
            sb2.append('|');
            sb2.append(z10);
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
        q qVar = this.c;
        if (qVar != null) {
            g0.E2(qVar);
            this.c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.a();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    public final void d() {
        h hVar;
        n nVar = this.f;
        o oVar = this.g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b(false);
        }
        q qVar = this.c;
        if (qVar != null) {
            qVar.a(null, null);
        }
        l2.i iVar = this.a;
        if (nVar != null) {
            l lVar = nVar.a;
            if (view != null) {
                nVar.c = nVar.d;
                lVar.d(view);
                lVar.w(view);
                iVar.f();
                return;
            }
        }
        if (nVar == null || oVar == null) {
            iVar.f();
            return;
        }
        if (nVar.d != 1 || (hVar = nVar.e) == null) {
            nVar.c = 0;
            SurfaceTexture surfaceTexture = oVar.a;
            oVar.a = null;
            if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                surfaceTexture = z8.c();
            }
            if (surfaceTexture != null) {
                nVar.a.D(surfaceTexture);
            }
        } else {
            nVar.c = 1;
            hVar.j = oVar;
            g0.E2(oVar);
            hVar.i.addView(oVar, 0, ma.c(-1.0f, -1));
            hVar.a();
            hVar.k();
        }
        iVar.f();
    }

    public final boolean e(n nVar, Rect rect) {
        if (this.b != null) {
            if (nVar.e()) {
                h hVar = nVar.e;
                RectF rectF = this.l;
                hVar.g(rectF);
                rectF.round(rect);
            } else {
                nVar.a.u(rect);
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
        n nVar;
        if (Build.VERSION.SDK_INT >= 35 && e2.s(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (nVar = this.e) != null) {
            i(nVar);
        }
    }

    public final void g() {
        int i7;
        if (this.b == null || (i7 = Build.VERSION.SDK_INT) < 26 || i7 >= 31 || this.f != null) {
            return;
        }
        j();
        n nVar = this.e;
        if (nVar == null) {
            return;
        }
        PictureInPictureParams b10 = b(nVar);
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

    public final void i(n nVar) {
        h hVar;
        if (this.c == null || this.b == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
        int i7 = nVar.c;
        l lVar = nVar.a;
        sb2.append(i7);
        l2.i.g(sb2.toString());
        Rect rect = new Rect();
        if (!e(nVar, rect)) {
            rect.setEmpty();
        }
        this.f = nVar;
        o oVar = null;
        this.e = null;
        this.o = true;
        nVar.d = nVar.c;
        View v = nVar.e == null ? lVar.v(this.b) : null;
        boolean z10 = v != null && rect.isEmpty();
        v0 v0Var = this.d;
        if (v0Var != null && !z10) {
            v0Var.b(true);
        }
        if (v != null) {
            if (z10) {
                v.setVisibility(4);
            }
            this.c.a(v, rect);
            lVar.X(v);
        } else if (nVar.c != 1 || (hVar = nVar.e) == null) {
            oVar = new o(this.b);
            this.c.a(oVar, rect);
            lVar.i(oVar);
        } else {
            o oVar2 = hVar.j;
            hVar.j = null;
            hVar.d();
            hVar.l();
            if (oVar2 != null) {
                g0.E2(oVar2);
            }
            this.c.a(oVar2, rect);
            oVar = oVar2;
        }
        this.c.bringToFront();
        this.g = oVar;
        this.h = v;
        nVar.c = 2;
        k(nVar);
    }

    public final void j() {
        n nVar;
        h hVar;
        LaunchActivity launchActivity = this.b;
        if (launchActivity == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        n nVar2 = this.f;
        if (nVar2 != null) {
            if (!this.o) {
                a(nVar2);
            }
            k(this.f);
            return;
        }
        if (!nd.b(launchActivity) || nd.a(this.b)) {
            nVar = null;
        } else {
            ArrayList arrayList = (ArrayList) this.a.c;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    nVar = (n) arrayList.get(size);
                    int i7 = nVar.c;
                    l lVar = nVar.a;
                    if (i7 == 0 && lVar.E() == null && lVar.G() && lVar.N()) {
                        break;
                    } else {
                        size--;
                    }
                } else {
                    nVar = null;
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        n nVar3 = (n) arrayList.get(size2);
                        int i10 = nVar3.c;
                        l lVar2 = nVar3.a;
                        if (i10 == 1 && lVar2.N() && ((hVar = nVar3.e) == null ? !(!nVar3.f || nVar3.g) : !(hVar.f || hVar.k != null)) && (nVar == null || lVar2.e() > nVar.a.e())) {
                            nVar = nVar3;
                        }
                    }
                    if (nVar == null) {
                        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                            n nVar4 = (n) arrayList.get(size3);
                            int i11 = nVar4.c;
                            l lVar3 = nVar4.a;
                            if (i11 == 0 && lVar3.S() && lVar3.N() && (nVar == null || lVar3.e() > nVar.a.e())) {
                                nVar = nVar4;
                            }
                        }
                    }
                }
            }
        }
        this.e = nVar;
        if (nVar != null) {
            this.j = true;
            a(nVar);
        } else if (this.j) {
            this.j = false;
            this.n = null;
            g0.b3(this.b);
        }
        h();
    }

    public final void k(n nVar) {
        c1 Q = nVar != null ? nVar.a.Q() : null;
        if (Q == null) {
            h();
            return;
        }
        x xVar = this.k;
        if (xVar == null || xVar.a.t.a != Q) {
            h();
            try {
                r rVar = new r(this.b, Q);
                rVar.c = "utils-pip-media-session";
                this.k = rVar.a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
