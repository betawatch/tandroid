package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ww extends v4.v {
    public v4.e1 d;
    public boolean e;
    public boolean f;
    public final xw g;
    public final /* synthetic */ yw h;

    public ww(yw ywVar, xw xwVar) {
        this.h = ywVar;
        this.g = xwVar;
    }

    @Override // v4.v
    public final int b(int i7, int i10) {
        if (this.f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override // v4.v
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        yw ywVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (ywVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.i3(new sg(1, t2Var), this.g.y.e);
            ywVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (org.telegram.messenger.gz.m(r1) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e7, code lost:
    
        if (org.telegram.messenger.gz.m(r1) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (org.telegram.messenger.gz.m(r2) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (r1 != 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r5).y() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    @Override // v4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        boolean z10;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.o4 o4Var2;
        xw xwVar = this.g;
        if (!xwVar.y.k()) {
            yw ywVar = this.h;
            o4Var = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
            if (o4Var != null) {
                o4Var2 = ((org.telegram.ui.ActionBar.e2) ywVar).parentLayout;
            }
            if (!ywVar.H3.c() && ywVar.a3 == 0) {
                if (this.e && this.f) {
                    View view = e1Var.a;
                    if (view instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!ywVar.n2 && xwVar.p() && ywVar.Y0 == null) {
                    View view2 = e1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view2;
                        long dialogId = t2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                        org.telegram.messenger.so soVar = null;
                        if (kVar.y(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
                            if (ywVar.a1 && dialog2 != null && ywVar.s4(dialog2) && !org.telegram.messenger.m5.D(dialogId)) {
                                org.telegram.ui.Cells.t2 t2Var2 = (org.telegram.ui.Cells.t2) e1Var.a;
                                ywVar.Z0 = t2Var2;
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, t2Var2, ywVar.getResourceProvider());
                                this.f = false;
                                return v4.v.l(3, 0);
                            }
                        } else {
                            int i18 = ywVar.T0;
                            try {
                                i18 = xwVar.d.h;
                            } catch (Exception unused) {
                            }
                            ow owVar = ywVar.A0;
                            if (owVar != null && owVar.getVisibility() == 0) {
                                i17 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            }
                            if (ywVar.e1) {
                                if (dialogId == ywVar.getUserConfig().n || dialogId == 777000 || i18 == 7 || i18 == 8) {
                                    i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                }
                                if (ywVar.getMessagesController().C2(dialogId, false)) {
                                    int i19 = ywVar.getMessagesController().B2;
                                    int i20 = org.telegram.messenger.np.D8;
                                }
                                if (ywVar.Y2 == 0) {
                                    i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.t3.Y(org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-dialogId)))) {
                                        i13 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                        if (org.telegram.messenger.gz.m(i13) != 3) {
                                            i14 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                            if (org.telegram.messenger.gz.m(i14) != 1) {
                                                i15 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                if (org.telegram.messenger.gz.m(i15) != 0) {
                                                    i16 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!ywVar.H3.c()) {
                                        z10 = true;
                                        i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                        if (org.telegram.messenger.gz.m(i10) == 1) {
                                            int i21 = ywVar.f0[0].s;
                                            if (i21 == 7 || i21 == 8) {
                                                soVar = ywVar.getMessagesController().N[ywVar.f0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (soVar != null) {
                                                int i22 = soVar.g;
                                                int i23 = org.telegram.messenger.np.D8;
                                                if ((i22 & 64) != 0 && (dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId)) != null) {
                                                    i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                    if (!soVar.a(i11, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.gz.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
                                        t2Var.setSliding(true);
                                        return v4.v.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                if (org.telegram.messenger.gz.m(i10) == 1) {
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.gz.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
                                t2Var.setSliding(true);
                                return v4.v.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // v4.v
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // v4.v
    public final float g() {
        return 0.45f;
    }

    @Override // v4.v
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int i7;
        yw ywVar = this.h;
        ArrayList arrayList = ywVar.c1;
        View view = e1Var2.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
            if (dialog != null && ywVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                xw xwVar = this.g;
                if (xwVar.a.getItemAnimator() == null) {
                    xwVar.a.setItemAnimator(xwVar.y);
                }
                hv hvVar = xwVar.d;
                yw ywVar2 = hvVar.S;
                int i10 = hvVar.G;
                ArrayList d42 = ywVar2.d4(i10, hvVar.h, hvVar.r, false);
                int H = hvVar.H(b10);
                int H2 = hvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = hvVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.np.s1(i10).N[hvVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                hvVar.X(null);
                int i14 = ywVar.f0[0].s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        ywVar.b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.so soVar = ywVar.getMessagesController().N[ywVar.f0[0].s == i7 ? (char) 1 : (char) 0];
                if (arrayList.contains(soVar)) {
                    return true;
                }
                arrayList.add(soVar);
                return true;
            }
        }
        return false;
    }

    @Override // v4.v
    public final void p(v4.e1 e1Var, int i7) {
        if (e1Var != null) {
            this.g.a.d1(false);
        }
        this.d = e1Var;
        if (e1Var != null) {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).x = false;
            }
        }
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
        int i7;
        yw ywVar = this.h;
        if (e1Var == null) {
            ywVar.Y0 = null;
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.a;
        long dialogId = t2Var.getDialogId();
        boolean D = org.telegram.messenger.m5.D(dialogId);
        xw xwVar = this.g;
        if (D) {
            uw uwVar = xwVar.a;
            int i10 = uw.C3;
            uwVar.C1(false, t2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!ywVar.getMessagesController().C2(dialogId, false) && ywVar.Y2 == 0) {
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            if (org.telegram.messenger.gz.m(i7) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                ywVar.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                ywVar.D4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.t3.Y(ywVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            ywVar.D4(arrayList2, org.telegram.messenger.ns.w1, true, false, null);
            return;
        }
        ywVar.Y0 = t2Var;
        l2.x xVar = new l2.x(this, dialog, xwVar.d.b(), e1Var.b(), 13);
        ywVar.M4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            xVar.run();
            return;
        }
        if (ywVar.X0 == null) {
            uw uwVar2 = xwVar.a;
            org.telegram.ui.Components.ob0 ob0Var = new org.telegram.ui.Components.ob0();
            ob0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ob0Var.b = paint;
            ob0Var.e = 0L;
            ob0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            ob0Var.c = uwVar2;
            ywVar.X0 = ob0Var;
        }
        org.telegram.ui.Components.ob0 ob0Var2 = ywVar.X0;
        ob0Var2.d = xVar;
        ob0Var2.h = 0.0f;
        ob0Var2.g = 0.0f;
        ob0Var2.e = System.currentTimeMillis();
        ob0Var2.c.invalidate();
    }
}
