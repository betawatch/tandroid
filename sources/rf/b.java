package rf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ed;
import org.telegram.ui.web.q0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i10 = 2;
                final e eVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.a == 4) {
                                    eVar2.j.a.q().removeView(eVar2.f);
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
                                    cf.c cVar = eVar2.h;
                                    if (((ed) cVar.e) != null) {
                                        ((View) cVar.a).setBackground(null);
                                        cVar.e = null;
                                    }
                                    if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.c) != null) {
                                        bitmap2.recycle();
                                        cVar.c = null;
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
                                    eVar3.j.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
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
                                pf.e eVar5 = eVar4.j;
                                if (eVar4.a == 3) {
                                    eVar5.g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(eVar5.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
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
                final int i11 = 1;
                final e eVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.q().removeView(eVar22.f);
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
                                    cf.c cVar = eVar22.h;
                                    if (((ed) cVar.e) != null) {
                                        ((View) cVar.a).setBackground(null);
                                        cVar.e = null;
                                    }
                                    if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.c) != null) {
                                        bitmap2.recycle();
                                        cVar.c = null;
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
                                    eVar3.j.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
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
                                pf.e eVar5 = eVar4.j;
                                if (eVar4.a == 3) {
                                    eVar5.g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(eVar5.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
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
                cf.c cVar = this.b.h;
                if (((ed) cVar.e) != null) {
                    ((View) cVar.a).setBackground(null);
                    cVar.e = null;
                }
                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap = (Bitmap) cVar.c) != null) {
                    bitmap.recycle();
                    cVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                cf.c cVar2 = this.b.h;
                Objects.requireNonNull(cVar2);
                AndroidUtilities.runOnUIThread(new q0(cVar2, 25));
                break;
            default:
                final int i12 = 0;
                final e eVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rf.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i12) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.a == 4) {
                                    eVar22.j.a.q().removeView(eVar22.f);
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
                                    cf.c cVar3 = eVar22.h;
                                    if (((ed) cVar3.e) != null) {
                                        ((View) cVar3.a).setBackground(null);
                                        cVar3.e = null;
                                    }
                                    if (((ed) cVar3.d) == null && ((ed) cVar3.e) == null && (bitmap2 = (Bitmap) cVar3.c) != null) {
                                        bitmap2.recycle();
                                        cVar3.c = null;
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
                                    eVar32.j.g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
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
                                pf.e eVar5 = eVar4.j;
                                if (eVar4.a == 3) {
                                    eVar5.g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                    eVar4.f.invalidate();
                                    eVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(eVar5.j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
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
