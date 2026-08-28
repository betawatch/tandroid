package ze;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.vc;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i9) {
        this.a = i9;
        this.b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i9 = 2;
                final e eVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ze.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i9) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.a == 4) {
                                    eVar2.j.a.b().removeView(eVar2.f);
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
                                    b3.b bVar = eVar2.h;
                                    if (((vc) bVar.e) != null) {
                                        ((View) bVar.a).setBackground(null);
                                        bVar.e = null;
                                    }
                                    if (((vc) bVar.d) == null && ((vc) bVar.e) == null && (bitmap2 = (Bitmap) bVar.c) != null) {
                                        bitmap2.recycle();
                                        bVar.c = null;
                                    }
                                    eVar2.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar2.n) {
                                        eVar2.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.z();
                                    eVar3.j.g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar;
                                xe.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final e eVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ze.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.b().removeView(eVar22.f);
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
                                    b3.b bVar = eVar22.h;
                                    if (((vc) bVar.e) != null) {
                                        ((View) bVar.a).setBackground(null);
                                        bVar.e = null;
                                    }
                                    if (((vc) bVar.d) == null && ((vc) bVar.e) == null && (bitmap2 = (Bitmap) bVar.c) != null) {
                                        bitmap2.recycle();
                                        bVar.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar3.h.z();
                                    eVar3.j.g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                    eVar3.a = 2;
                                    if (!eVar3.n) {
                                        eVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar2;
                                xe.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                b3.b bVar = this.b.h;
                if (((vc) bVar.e) != null) {
                    ((View) bVar.a).setBackground(null);
                    bVar.e = null;
                }
                if (((vc) bVar.d) == null && ((vc) bVar.e) == null && (bitmap = (Bitmap) bVar.c) != null) {
                    bitmap.recycle();
                    bVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                b3.b bVar2 = this.b.h;
                Objects.requireNonNull(bVar2);
                AndroidUtilities.runOnUIThread(new o1(bVar2, 25));
                break;
            default:
                final int i11 = 0;
                final e eVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ze.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.b().removeView(eVar22.f);
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
                                    b3.b bVar3 = eVar22.h;
                                    if (((vc) bVar3.e) != null) {
                                        ((View) bVar3.a).setBackground(null);
                                        bVar3.e = null;
                                    }
                                    if (((vc) bVar3.d) == null && ((vc) bVar3.e) == null && (bitmap2 = (Bitmap) bVar3.c) != null) {
                                        bitmap2.recycle();
                                        bVar3.c = null;
                                    }
                                    eVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (eVar22.n) {
                                        eVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    eVar32.h.z();
                                    eVar32.j.g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                    eVar32.a = 2;
                                    if (!eVar32.n) {
                                        eVar32.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.a);
                                    break;
                                }
                                break;
                            default:
                                e eVar4 = eVar3;
                                xe.d dVar = eVar4.j;
                                if (eVar4.a == 3) {
                                    dVar.g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
