package zh;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l7 implements w2 {
    public final /* synthetic */ a5 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ u7 d;

    public l7(u7 u7Var, a5 a5Var, ArrayList arrayList, Context context) {
        this.d = u7Var;
        this.a = a5Var;
        this.b = arrayList;
        this.c = context;
    }

    public final void a(int i10, long j3) {
        u7 u7Var = this.d;
        if (u7Var.J == i10 && u7Var.I == j3) {
            return;
        }
        u7Var.I = j3;
        u7Var.J = i10;
    }

    public final void b(boolean z10) {
        u7 u7Var = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = u7Var.f;
        if (u7Var.b) {
            if (u7Var.c) {
                return;
            }
            if (z10) {
                AndroidUtilities.requestAdjustNothing(p2Var.getParentActivity(), p2Var.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = u7Var.r;
        layoutParams.softInputMode = z10 ? 48 : 16;
        try {
            u7Var.n.updateViewLayout(u7Var.s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, k2.v vVar) {
        long j10;
        t7 t7Var;
        u7 u7Var = this.d;
        ArrayList arrayList = u7Var.M0;
        if (u7Var.H0 || u7Var.U < 0.9f) {
            bi.f5 f5Var = u7Var.D0;
            if (f5Var != null) {
                f5Var.d(0L, null);
            }
            t0 t0Var = u7Var.A0;
            if (t0Var != null) {
                if (t0Var.n) {
                    t0Var.s(null);
                } else {
                    t0Var.e();
                }
                u7Var.A0 = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + u7Var.H0 + ", " + u7Var.U);
            vVar.a = false;
            vVar.c = null;
            vVar.b = null;
            return;
        }
        Uri uri2 = u7Var.F0;
        boolean equals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
        if (!equals || (t7Var = u7Var.z0) == null) {
            u7Var.F0 = uri;
            bi.f5 f5Var2 = u7Var.D0;
            if (f5Var2 != null) {
                f5Var2.d(0L, null);
            }
            t0 t0Var2 = u7Var.A0;
            if (t0Var2 != null) {
                if (t0Var2.n) {
                    t0Var2.s(null);
                } else {
                    t0Var2.e();
                }
                u7Var.A0 = null;
            }
            t7 t7Var2 = u7Var.z0;
            if (t7Var2 != null) {
                t7Var2.release(null);
                u7Var.z0 = null;
            }
            k2.v vVar2 = u7Var.G0;
            if (vVar2 != null) {
                vVar2.c = null;
                vVar2.b = null;
                vVar2.a = false;
                vVar2.e = null;
                vVar2.f = null;
                vVar2.d = null;
                vVar2.b();
                u7Var.G0 = null;
            }
            if (uri != null) {
                u7Var.G0 = vVar;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((t7) arrayList.get(i10)).uri.equals(uri)) {
                        u7Var.z0 = (t7) arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (u7Var.z0 == null) {
                    t7 t7Var3 = new t7(u7Var, u7Var.C0, u7Var.B0);
                    u7Var.z0 = t7Var3;
                    t7Var3.document = document;
                }
                t7 t7Var4 = u7Var.z0;
                t7Var4.uri = uri;
                t7Var4.setSpeed(u7.B1);
                k2.v vVar3 = u7Var.G0;
                t7 t7Var5 = u7Var.z0;
                vVar3.c = t7Var5;
                vVar3.a = false;
                vVar3.e = u7Var.y0;
                vVar3.f = u7Var.B0;
                vVar3.d = u7Var.C0;
                vVar3.b = null;
                FileStreamLoadOperation.setPriorityForDocument(t7Var5.document, 3);
                FileLoader.getInstance(u7Var.h).changePriority(3, u7Var.z0.document, null, null, null, null, null);
                if (j3 == 0) {
                    long j11 = u7Var.t1;
                    if (j11 != 0) {
                        u7Var.G0.a = true;
                        j10 = j11;
                        FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                        ((t7) u7Var.G0.c).start(false, u7Var.w(), uri, j10, u7.D1, u7.B1);
                        u7Var.G0.b();
                    }
                }
                j10 = j3;
                FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                ((t7) u7Var.G0.c).start(false, u7Var.w(), uri, j10, u7.D1, u7.B1);
                u7Var.G0.b();
            } else {
                FileLog.d("StoryViewer requestPlayer: url is null (1)");
            }
        } else if (equals) {
            u7Var.G0 = vVar;
            vVar.c = t7Var;
            vVar.b = null;
            t7Var.setSpeed(u7.B1);
            k2.v vVar4 = u7Var.G0;
            vVar4.a = u7Var.z0.firstFrameRendered;
            vVar4.e = u7Var.y0;
            vVar4.f = u7Var.B0;
            vVar4.d = u7Var.C0;
            FileLog.d("StoryViewer requestPlayer: same url");
        }
        i(false, uri != null);
        u7Var.t1 = 0L;
        u7Var.P();
    }

    public final void d(float f7) {
        u7 u7Var = this.d;
        if (u7Var.r0 != f7) {
            u7Var.r0 = f7;
            u7Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.m1 = false;
    }

    public final void f(boolean z10) {
        t7 t7Var;
        u7 u7Var = this.d;
        if (!u7Var.f1 && z10 && u7Var.k0) {
            u7Var.k0 = false;
            k2.v vVar = u7Var.G0;
            if (vVar != null && (t7Var = (t7) vVar.c) != null) {
                t7Var.setSeeking(false);
            }
            a3 t10 = u7Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        u7Var.f1 = z10;
        u7Var.P();
    }

    public final void g(boolean z10) {
        u7 u7Var = this.d;
        u7Var.X0 = z10;
        u7Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        u7 u7Var = this.d;
        bi.f5 f5Var = u7Var.D0;
        if (f5Var != null) {
            f5Var.setVisibility(z10 ? 0 : 8);
        }
        SurfaceView surfaceView = u7Var.C0;
        if (surfaceView != null) {
            surfaceView.setVisibility(z10 ? 8 : z11 ? 0 : 4);
        }
        m7 m7Var = u7Var.B0;
        if (m7Var != null) {
            m7Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public final void j() {
        u7 u7Var = this.d;
        a5 a5Var = this.a;
        if (a5Var == null) {
            ArrayList arrayList = new ArrayList(this.b);
            int indexOf = arrayList.indexOf(Long.valueOf(u7Var.n0.getCurrentPeerView().getCurrentPeer()));
            if (indexOf < 0) {
                u7Var.q(false);
                return;
            }
            arrayList.remove(indexOf);
            if (u7Var.n0.E(true)) {
                u7Var.n0.G0 = new uu0(this, arrayList, indexOf, 19);
                return;
            } else {
                u7Var.q(false);
                return;
            }
        }
        if (u7Var.n0.x0 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(u7Var.n0.x0);
        int indexOf2 = u7Var.n0.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(u7Var.n0.getCurrentPeerView().getCurrentDay());
        if (indexOf2 < 0) {
            u7Var.q(false);
            return;
        }
        arrayList2.remove(indexOf2);
        if (u7Var.n0.E(true)) {
            u7Var.n0.G0 = new xh.n1(this, a5Var, arrayList2, 16);
        } else {
            u7Var.q(false);
        }
    }
}
