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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class uw extends v4.v {
    public v4.d1 d;
    public boolean e;
    public boolean f;
    public final vw g;
    public final /* synthetic */ ww h;

    public uw(ww wwVar, vw vwVar) {
        this.h = wwVar;
        this.g = vwVar;
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
        ww wwVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (wwVar = this.h).X0) != null) {
            org.telegram.messenger.g0.i3(new tg(1, t2Var), this.g.y.e);
            wwVar.X0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (org.telegram.messenger.iz.m(r1) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e7, code lost:
    
        if (org.telegram.messenger.iz.m(r1) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (org.telegram.messenger.iz.m(r2) != 5) goto L50;
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
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        boolean z9;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.q4 q4Var2;
        vw vwVar = this.g;
        if (!vwVar.y.k()) {
            ww wwVar = this.h;
            q4Var = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
            }
            if (!wwVar.F3.c() && wwVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!wwVar.l2 && vwVar.p() && wwVar.W0 == null) {
                    View view2 = d1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view2;
                        long dialogId = t2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                        org.telegram.messenger.vo voVar = null;
                        if (kVar.w(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
                            if (wwVar.Y0 && dialog2 != null && wwVar.s4(dialog2) && !org.telegram.messenger.m5.D(dialogId)) {
                                org.telegram.ui.Cells.t2 t2Var2 = (org.telegram.ui.Cells.t2) d1Var.a;
                                wwVar.X0 = t2Var2;
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, t2Var2, wwVar.getResourceProvider());
                                this.f = false;
                                return v4.v.l(3, 0);
                            }
                        } else {
                            int i18 = wwVar.R0;
                            try {
                                i18 = vwVar.d.h;
                            } catch (Exception unused) {
                            }
                            mw mwVar = wwVar.z0;
                            if (mwVar != null && mwVar.getVisibility() == 0) {
                                i17 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                            }
                            if (wwVar.c1) {
                                if (dialogId == wwVar.getUserConfig().n || dialogId == 777000 || i18 == 7 || i18 == 8) {
                                    i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                }
                                if (wwVar.getMessagesController().C2(dialogId, false)) {
                                    int i19 = wwVar.getMessagesController().A2;
                                    int i20 = org.telegram.messenger.qp.C8;
                                }
                                if (wwVar.W2 == 0) {
                                    i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.t3.Y(org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-dialogId)))) {
                                        i13 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                        if (org.telegram.messenger.iz.m(i13) != 3) {
                                            i14 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                            if (org.telegram.messenger.iz.m(i14) != 1) {
                                                i15 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                if (org.telegram.messenger.iz.m(i15) != 0) {
                                                    i16 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!wwVar.F3.c()) {
                                        z9 = true;
                                        i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                        if (org.telegram.messenger.iz.m(i10) == 1) {
                                            int i21 = wwVar.e0[0].s;
                                            if (i21 == 7 || i21 == 8) {
                                                voVar = wwVar.getMessagesController().M[wwVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (voVar != null) {
                                                int i22 = voVar.g;
                                                int i23 = org.telegram.messenger.qp.C8;
                                                if ((i22 & 64) != 0 && (dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId)) != null) {
                                                    i11 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                    if (!voVar.a(i11, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z9 = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f = false;
                                        this.e = !(z9 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.iz.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
                                        t2Var.setSliding(true);
                                        return v4.v.l(0, 4);
                                    }
                                }
                                z9 = false;
                                i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                if (org.telegram.messenger.iz.m(i10) == 1) {
                                }
                                this.f = false;
                                this.e = !(z9 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.iz.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
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
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7;
        ww wwVar = this.h;
        ArrayList arrayList = wwVar.a1;
        View view = d1Var2.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && wwVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                vw vwVar = this.g;
                if (vwVar.a.getItemAnimator() == null) {
                    vwVar.a.setItemAnimator(vwVar.y);
                }
                gv gvVar = vwVar.d;
                ww wwVar2 = gvVar.R;
                int i10 = gvVar.F;
                ArrayList d42 = wwVar2.d4(i10, gvVar.h, gvVar.r, false);
                int H = gvVar.H(b10);
                int H2 = gvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = gvVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.qp.s1(i10).M[gvVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                gvVar.X(null);
                int i14 = wwVar.e0[0].s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        wwVar.Z0 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.vo voVar = wwVar.getMessagesController().M[wwVar.e0[0].s == i7 ? (char) 1 : (char) 0];
                if (arrayList.contains(voVar)) {
                    return true;
                }
                arrayList.add(voVar);
                return true;
            }
        }
        return false;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        if (d1Var != null) {
            this.g.a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).x = false;
            }
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
        int i7;
        ww wwVar = this.h;
        if (d1Var == null) {
            wwVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
        long dialogId = t2Var.getDialogId();
        boolean D = org.telegram.messenger.m5.D(dialogId);
        vw vwVar = this.g;
        if (D) {
            sw swVar = vwVar.a;
            int i10 = sw.B3;
            swVar.C1(false, t2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!wwVar.getMessagesController().C2(dialogId, false) && wwVar.W2 == 0) {
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            if (org.telegram.messenger.iz.m(i7) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                wwVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                wwVar.D4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.t3.Y(wwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            wwVar.D4(arrayList2, org.telegram.messenger.qs.w1, true, false, null);
            return;
        }
        wwVar.W0 = t2Var;
        l2.a0 a0Var = new l2.a0(this, dialog, vwVar.d.b(), d1Var.b(), 13);
        wwVar.M4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            a0Var.run();
            return;
        }
        if (wwVar.V0 == null) {
            sw swVar2 = vwVar.a;
            org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0();
            nb0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            nb0Var.b = paint;
            nb0Var.e = 0L;
            nb0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            nb0Var.c = swVar2;
            wwVar.V0 = nb0Var;
        }
        org.telegram.ui.Components.nb0 nb0Var2 = wwVar.V0;
        nb0Var2.d = a0Var;
        nb0Var2.h = 0.0f;
        nb0Var2.g = 0.0f;
        nb0Var2.e = System.currentTimeMillis();
        nb0Var2.c.invalidate();
    }
}
