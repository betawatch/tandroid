package th;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.x8;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f7 implements v2 {
    public final /* synthetic */ x4 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ o7 d;

    public f7(o7 o7Var, x4 x4Var, ArrayList arrayList, Context context) {
        this.d = o7Var;
        this.a = x4Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j10) {
        o7 o7Var = this.d;
        if (o7Var.J == i10 && o7Var.I == j10) {
            return;
        }
        o7Var.I = j10;
        o7Var.J = i10;
    }

    public final void b(boolean z10) {
        o7 o7Var = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = o7Var.f;
        if (o7Var.b) {
            if (o7Var.c) {
                return;
            }
            if (z10) {
                org.telegram.messenger.i0.Y2(k2Var.getParentActivity(), k2Var.getClassGuid());
                return;
            } else {
                org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = o7Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            o7Var.n.updateViewLayout(o7Var.s, layoutParams);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, k2.t0 t0Var) {
        long j11;
        n7 n7Var;
        o7 o7Var = this.d;
        ArrayList arrayList = o7Var.M0;
        if (o7Var.H0 || o7Var.U < 0.9f) {
            vh.s2 s2Var = o7Var.D0;
            if (s2Var != null) {
                s2Var.d(0L, null);
            }
            s0 s0Var = o7Var.A0;
            if (s0Var != null) {
                if (s0Var.n) {
                    s0Var.s(null);
                } else {
                    s0Var.e();
                }
                o7Var.A0 = null;
            }
            f8.b("StoryViewer requestPlayer ignored, because closed: " + o7Var.H0 + ", " + o7Var.U);
            t0Var.b = false;
            t0Var.c = null;
            t0Var.a = null;
            return;
        }
        Uri uri2 = o7Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (n7Var = o7Var.z0) == null) {
            o7Var.F0 = uri;
            vh.s2 s2Var2 = o7Var.D0;
            if (s2Var2 != null) {
                s2Var2.d(0L, null);
            }
            s0 s0Var2 = o7Var.A0;
            if (s0Var2 != null) {
                if (s0Var2.n) {
                    s0Var2.s(null);
                } else {
                    s0Var2.e();
                }
                o7Var.A0 = null;
            }
            n7 n7Var2 = o7Var.z0;
            if (n7Var2 != null) {
                n7Var2.release(null);
                o7Var.z0 = null;
            }
            k2.t0 t0Var2 = o7Var.G0;
            if (t0Var2 != null) {
                t0Var2.c = null;
                t0Var2.a = null;
                t0Var2.b = false;
                t0Var2.e = null;
                t0Var2.f = null;
                t0Var2.d = null;
                t0Var2.b();
                o7Var.G0 = null;
            }
            if (uri != null) {
                o7Var.G0 = t0Var;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((n7) arrayList.get(i10)).uri.equals(uri)) {
                        o7Var.z0 = (n7) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (o7Var.z0 == null) {
                    n7 n7Var3 = new n7(o7Var, o7Var.C0, o7Var.B0);
                    o7Var.z0 = n7Var3;
                    n7Var3.document = document;
                }
                n7 n7Var4 = o7Var.z0;
                n7Var4.uri = uri;
                n7Var4.setSpeed(o7.B1);
                k2.t0 t0Var3 = o7Var.G0;
                n7 n7Var5 = o7Var.z0;
                t0Var3.c = n7Var5;
                t0Var3.b = false;
                t0Var3.e = o7Var.y0;
                t0Var3.f = o7Var.B0;
                t0Var3.d = o7Var.C0;
                t0Var3.a = null;
                TLRPC.Document document2 = n7Var5.document;
                if (document2 != null) {
                    x8.I.put(Long.valueOf(document2.id), 3);
                } else {
                    ConcurrentHashMap concurrentHashMap = x8.H;
                }
                b8.G(o7Var.h).h(3, o7Var.z0.document, null, null, null, null);
                if (j10 == 0) {
                    long j12 = o7Var.t1;
                    if (j12 != 0) {
                        o7Var.G0.b = true;
                        j11 = j12;
                        f8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((n7) o7Var.G0.c).start(false, o7Var.K(), uri, j11, o7.D1, o7.B1);
                        o7Var.G0.b();
                    }
                }
                j11 = j10;
                f8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((n7) o7Var.G0.c).start(false, o7Var.K(), uri, j11, o7.D1, o7.B1);
                o7Var.G0.b();
            } else {
                f8.b("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            o7Var.G0 = t0Var;
            t0Var.c = n7Var;
            t0Var.a = null;
            n7Var.setSpeed(o7.B1);
            k2.t0 t0Var4 = o7Var.G0;
            t0Var4.b = o7Var.z0.firstFrameRendered;
            t0Var4.e = o7Var.y0;
            t0Var4.f = o7Var.B0;
            t0Var4.d = o7Var.C0;
            f8.b("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        o7Var.t1 = 0L;
        o7Var.d0();
    }

    public final void d(float f7) {
        o7 o7Var = this.d;
        if (o7Var.r0 != f7) {
            o7Var.r0 = f7;
            o7Var.w.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        n7 n7Var;
        o7 o7Var = this.d;
        if (!o7Var.f1 && z10 && o7Var.k0) {
            o7Var.k0 = false;
            k2.t0 t0Var = o7Var.G0;
            if (t0Var != null && (n7Var = (n7) t0Var.c) != null) {
                n7Var.setSeeking(false);
            }
            z2 H = o7Var.H();
            if (H != null) {
                H.invalidate();
            }
        }
        o7Var.f1 = z10;
        o7Var.d0();
    }

    public final void g(boolean z10) {
        o7 o7Var = this.d;
        o7Var.X0 = z10;
        o7Var.d0();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        o7 o7Var = this.d;
        vh.s2 s2Var = o7Var.D0;
        if (s2Var != null) {
            s2Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = o7Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        g7 g7Var = o7Var.B0;
        if (g7Var != null) {
            g7Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        o7 o7Var = this.d;
        x4 x4Var = this.a;
        if (x4Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(o7Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                o7Var.D(false);
                return;
            }
            arrayList.remove(indexOf);
            if (o7Var.n0.E(true)) {
                o7Var.n0.G0 = new org.telegram.ui.Wallet.x0(this, arrayList, indexOf, 18);
                return;
            } else {
                o7Var.D(false);
                return;
            }
        }
        if (o7Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(o7Var.n0.x0);
        int indexOf2 = o7Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(o7Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            o7Var.D(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (o7Var.n0.E(true)) {
            o7Var.n0.G0 = new rh.l5(this, x4Var, arrayList2, 9);
        } else {
            o7Var.D(false);
        }
    }
}
