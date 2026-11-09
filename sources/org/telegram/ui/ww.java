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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ww extends v4.v {
    public v4.d1 d;
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
        if (i7 == 8 && (t2Var = (ywVar = this.h).Y0) != null) {
            org.telegram.messenger.g0.i3(new wg(1, t2Var), this.g.y.e);
            ywVar.Y0 = null;
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
        xw xwVar = this.g;
        if (!xwVar.y.k()) {
            yw ywVar = this.h;
            q4Var = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.f2) ywVar).parentLayout;
            }
            if (!ywVar.G3.c() && ywVar.Z2 == 0) {
                if (this.e && this.f) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!ywVar.m2 && xwVar.p() && ywVar.X0 == null) {
                    View view2 = d1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view2;
                        long dialogId = t2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                        org.telegram.messenger.vo voVar = null;
                        if (kVar.x(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
                            if (ywVar.Z0 && dialog2 != null && ywVar.s4(dialog2) && !org.telegram.messenger.m5.D(dialogId)) {
                                org.telegram.ui.Cells.t2 t2Var2 = (org.telegram.ui.Cells.t2) d1Var.a;
                                ywVar.Y0 = t2Var2;
                                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, t2Var2, ywVar.getResourceProvider());
                                this.f = false;
                                return v4.v.l(3, 0);
                            }
                        } else {
                            int i18 = ywVar.S0;
                            try {
                                i18 = xwVar.d.h;
                            } catch (Exception unused) {
                            }
                            ow owVar = ywVar.z0;
                            if (owVar != null && owVar.getVisibility() == 0) {
                                i17 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                            }
                            if (ywVar.d1) {
                                if (dialogId == ywVar.getUserConfig().n || dialogId == 777000 || i18 == 7 || i18 == 8) {
                                    i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                }
                                if (ywVar.getMessagesController().C2(dialogId, false)) {
                                    int i19 = ywVar.getMessagesController().A2;
                                    int i20 = org.telegram.messenger.qp.C8;
                                }
                                if (ywVar.X2 == 0) {
                                    i12 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.t3.Y(org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-dialogId)))) {
                                        i13 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                        if (org.telegram.messenger.iz.m(i13) != 3) {
                                            i14 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                            if (org.telegram.messenger.iz.m(i14) != 1) {
                                                i15 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                if (org.telegram.messenger.iz.m(i15) != 0) {
                                                    i16 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!ywVar.G3.c()) {
                                        z9 = true;
                                        i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                        if (org.telegram.messenger.iz.m(i10) == 1) {
                                            int i21 = ywVar.e0[0].s;
                                            if (i21 == 7 || i21 == 8) {
                                                voVar = ywVar.getMessagesController().M[ywVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (voVar != null) {
                                                int i22 = voVar.g;
                                                int i23 = org.telegram.messenger.qp.C8;
                                                if ((i22 & 64) != 0 && (dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId)) != null) {
                                                    i11 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
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
                                i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
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
        yw ywVar = this.h;
        ArrayList arrayList = ywVar.b1;
        View view = d1Var2.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && ywVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                xw xwVar = this.g;
                if (xwVar.a.getItemAnimator() == null) {
                    xwVar.a.setItemAnimator(xwVar.y);
                }
                iv ivVar = xwVar.d;
                yw ywVar2 = ivVar.R;
                int i10 = ivVar.F;
                ArrayList d42 = ywVar2.d4(i10, ivVar.h, ivVar.r, false);
                int H = ivVar.H(b10);
                int H2 = ivVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = ivVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.qp.s1(i10).M[ivVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                ivVar.X(null);
                int i14 = ywVar.e0[0].s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        ywVar.a1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.vo voVar = ywVar.getMessagesController().M[ywVar.e0[0].s == i7 ? (char) 1 : (char) 0];
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
        yw ywVar = this.h;
        if (d1Var == null) {
            ywVar.X0 = null;
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
        long dialogId = t2Var.getDialogId();
        boolean D = org.telegram.messenger.m5.D(dialogId);
        xw xwVar = this.g;
        if (D) {
            uw uwVar = xwVar.a;
            int i10 = uw.B3;
            uwVar.C1(false, t2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!ywVar.getMessagesController().C2(dialogId, false) && ywVar.X2 == 0) {
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            if (org.telegram.messenger.iz.m(i7) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                ywVar.O2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                ywVar.D4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.t3.Y(ywVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            ywVar.D4(arrayList2, org.telegram.messenger.qs.w1, true, false, null);
            return;
        }
        ywVar.X0 = t2Var;
        l2.z zVar = new l2.z(this, dialog, xwVar.d.b(), d1Var.b(), 13);
        ywVar.M4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            zVar.run();
            return;
        }
        if (ywVar.W0 == null) {
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
            ywVar.W0 = ob0Var;
        }
        org.telegram.ui.Components.ob0 ob0Var2 = ywVar.W0;
        ob0Var2.d = zVar;
        ob0Var2.h = 0.0f;
        ob0Var2.g = 0.0f;
        ob0Var2.e = System.currentTimeMillis();
        ob0Var2.c.invalidate();
    }
}
