package wf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import b8.cg;
import b8.ke;
import j$.util.Objects;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.mc;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i3) {
        this.a = i3;
        this.b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i3 = 2;
                final e eVar = this.b;
                g0.h3(new Runnable() { // from class: wf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i3) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.a == 4) {
                                    eVar2.j.a.h().removeView(eVar2.f);
                                    eVar2.i = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    f fVar = eVar2.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar2.e = null;
                                    }
                                    f fVar2 = eVar2.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar2.d = null;
                                    }
                                    ke keVar = eVar2.h;
                                    if (((mc) keVar.f) != null) {
                                        ((View) keVar.b).setBackground(null);
                                        keVar.f = null;
                                    }
                                    if (((mc) keVar.e) == null && ((mc) keVar.f) == null && (bitmap2 = (Bitmap) keVar.d) != null) {
                                        bitmap2.recycle();
                                        keVar.d = null;
                                    }
                                    eVar2.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar2.n) {
                                        eVar2.g();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.L();
                                    eVar3.j.g.c(new cg(t0.d, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar;
                                uf.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    g0.K(dVar.j, new cg(t0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final e eVar2 = this.b;
                g0.h3(new Runnable() { // from class: wf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.h().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    f fVar = eVar22.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar22.e = null;
                                    }
                                    f fVar2 = eVar22.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar22.d = null;
                                    }
                                    ke keVar = eVar22.h;
                                    if (((mc) keVar.f) != null) {
                                        ((View) keVar.b).setBackground(null);
                                        keVar.f = null;
                                    }
                                    if (((mc) keVar.e) == null && ((mc) keVar.f) == null && (bitmap2 = (Bitmap) keVar.d) != null) {
                                        bitmap2.recycle();
                                        keVar.d = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.L();
                                    eVar3.j.g.c(new cg(t0.d, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar2;
                                uf.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    g0.K(dVar.j, new cg(t0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                ke keVar = this.b.h;
                if (((mc) keVar.f) != null) {
                    ((View) keVar.b).setBackground(null);
                    keVar.f = null;
                }
                if (((mc) keVar.e) == null && ((mc) keVar.f) == null && (bitmap = (Bitmap) keVar.d) != null) {
                    bitmap.recycle();
                    keVar.d = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                ke keVar2 = this.b.h;
                Objects.requireNonNull(keVar2);
                g0.h3(new u(keVar2, 24));
                break;
            default:
                final int i11 = 0;
                final e eVar3 = this.b;
                g0.h3(new Runnable() { // from class: wf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.h().removeView(eVar22.f);
                                    eVar22.i = null;
                                    eVar22.f = null;
                                    eVar22.g = null;
                                    f fVar = eVar22.e;
                                    if (fVar != null) {
                                        fVar.b();
                                        eVar22.e = null;
                                    }
                                    f fVar2 = eVar22.d;
                                    if (fVar2 != null) {
                                        fVar2.b();
                                        eVar22.d = null;
                                    }
                                    ke keVar3 = eVar22.h;
                                    if (((mc) keVar3.f) != null) {
                                        ((View) keVar3.b).setBackground(null);
                                        keVar3.f = null;
                                    }
                                    if (((mc) keVar3.e) == null && ((mc) keVar3.f) == null && (bitmap2 = (Bitmap) keVar3.d) != null) {
                                        bitmap2.recycle();
                                        keVar3.d = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar32.h.L();
                                    eVar32.j.g.c(new cg(t0.d, new b(eVar32, 2), 400L));
                                    eVar32.a = 2;
                                    if (!eVar32.n) {
                                        eVar32.h();
                                        break;
                                    }
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar3;
                                uf.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    g0.K(dVar.j, new cg(t0.d, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
