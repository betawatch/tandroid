package xh;

import android.graphics.Bitmap;
import android.view.View;
import bi.bd;
import bi.ce;
import bi.md;
import bi.oc;
import bi.r9;
import bi.xc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ x0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        int i10;
        bi.x xVar;
        switch (this.a) {
            case 0:
                ((x3) this.b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                x3.v0((x3) this.b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                ce ceVar = (ce) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (ceVar.f0 == 0 && arrayList != null && !arrayList.isEmpty() && ceVar.p2 == null && !ceVar.W && ceVar.J()) {
                    ceVar.H1 = null;
                    ceVar.I1 = null;
                    ceVar.J1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + ceVar.A0.getFilledCount() > ceVar.A0.getTotalCount()) {
                            int size = arrayList.size() + ceVar.A0.getFilledCount();
                            ArrayList a2 = bi.x.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    xVar = (bi.x) obj4;
                                    if (xVar.e.size() >= size) {
                                    }
                                } else {
                                    xVar = null;
                                }
                            }
                            if (xVar == null) {
                                ceVar.A0.o(null);
                                ceVar.A0.e();
                                ceVar.I0.setSelected((bi.x) null);
                                bd bdVar = ceVar.B0;
                                if (bdVar != null) {
                                    bdVar.recordHevc = !ceVar.A0.j();
                                }
                                ceVar.I0.a(false, true);
                                ceVar.m0(true);
                                break;
                            } else {
                                md mdVar = ceVar.A0;
                                ceVar.z0 = xVar;
                                mdVar.o(xVar);
                                ceVar.I0.setSelected(xVar);
                                int indexOf = bi.x.a().indexOf(xVar);
                                if (indexOf >= 0) {
                                    ceVar.I0.a.u0(indexOf);
                                }
                                bd bdVar2 = ceVar.B0;
                                if (bdVar2 != null) {
                                    bdVar2.recordHevc = !ceVar.A0.j();
                                }
                                ceVar.G0.setDrawable(new bi.y(xVar, false));
                                ceVar.c0(ceVar.H0, ceVar.I0.e, true);
                                ceVar.O0.e(ceVar.A0.j() ? ceVar.A0.getFilledProgress() : 0.0f, true);
                            }
                        }
                    }
                    ceVar.L1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            r9 l4 = r9.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l4.M0 = (Bitmap) arrayList2.get(i12);
                            l4.J0 = ceVar.v0;
                            l4.K0 = ceVar.w0;
                            l4.A();
                            if (!bool.booleanValue()) {
                                if (ceVar.K1 == null) {
                                    ceVar.K1 = l4;
                                } else {
                                    if (ceVar.H1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        ceVar.H1 = arrayList3;
                                        arrayList3.add(ceVar.K1);
                                    }
                                    if (ceVar.H1.size() < 10) {
                                        ceVar.H1.add(l4);
                                    }
                                }
                                i12++;
                            } else if (ceVar.A0.l(l4)) {
                                ceVar.K1 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (ceVar.H1 != null) {
                        ceVar.i0(false, true);
                        ceVar.Q0.a(ceVar.O1);
                        bi.m8 m8Var = ceVar.O0;
                        boolean z10 = ceVar.O1 == 1;
                        m8Var.n0 = -1.0f;
                        m8Var.o0 = z10;
                        m8Var.invalidate();
                        ceVar.I1 = new ArrayList();
                        ceVar.J1 = new ArrayList();
                        for (int i13 = 0; i13 < ceVar.H1.size(); i13 = com.google.android.gms.internal.vision.e2.d(i13, i13, 1, ceVar.J1)) {
                            ceVar.I1.add(Integer.valueOf(i13));
                        }
                        ceVar.A0.n(null);
                        ceVar.I0.a(false, true);
                        ceVar.m0(true);
                        ceVar.f(false);
                        ceVar.K(1, true);
                        oc ocVar = ceVar.d1;
                        if (ocVar != null) {
                            a3.d dVar = ocVar.h;
                            if (!ocVar.I && !ocVar.M && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(dVar);
                                ocVar.I = true;
                                ocVar.invalidate();
                                AndroidUtilities.runOnUIThread(dVar, 5500L);
                            }
                        }
                        xc xcVar = ceVar.M0;
                        if (xcVar != null) {
                            ceVar.l2 = xcVar.e.e0();
                            ceVar.m2 = ceVar.M0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        r9 r9Var = ceVar.K1;
                        if (r9Var != null) {
                            r9Var.B();
                        }
                        ceVar.I0.a(false, true);
                        ceVar.m0(true);
                        ceVar.f(false);
                        xc xcVar2 = ceVar.M0;
                        if (xcVar2 != null) {
                            ceVar.l2 = xcVar2.e.e0();
                            ceVar.m2 = ceVar.M0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
