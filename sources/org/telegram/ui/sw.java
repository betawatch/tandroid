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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sw extends u4.v {
    public u4.d1 d;
    public boolean e;
    public boolean f;
    public final tw g;
    public final /* synthetic */ uw h;

    public sw(uw uwVar, tw twVar) {
        this.h = uwVar;
        this.g = twVar;
    }

    @Override // u4.v
    public final int b(int i3, int i10) {
        if (this.f) {
            return 0;
        }
        return super.b(i3, i10);
    }

    @Override // u4.v
    public final long d(RecyclerView recyclerView, int i3, float f10, float f11) {
        uw uwVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i3 == 4) {
            return 200L;
        }
        if (i3 == 8 && (t2Var = (uwVar = this.h).Y0) != null) {
            org.telegram.messenger.g0.i3(new pg(1, t2Var), this.g.y.e);
            uwVar.Y0 = null;
        }
        return super.d(recyclerView, i3, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (org.telegram.messenger.az.m(r1) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e7, code lost:
    
        if (org.telegram.messenger.az.m(r1) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (org.telegram.messenger.az.m(r2) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (r1 != 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r5).y() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    @Override // u4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar;
        int i3;
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
        org.telegram.ui.ActionBar.q4 q4Var2;
        tw twVar = this.g;
        if (!twVar.y.k()) {
            uw uwVar = this.h;
            q4Var = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
            }
            if (!uwVar.G3.c() && uwVar.Z2 == 0) {
                if (this.e && this.f) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!uwVar.m2 && twVar.p() && uwVar.X0 == null) {
                    View view2 = d1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view2;
                        long dialogId = t2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        org.telegram.messenger.mo moVar = null;
                        if (kVar.w(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
                            if (uwVar.Z0 && dialog2 != null && uwVar.s4(dialog2) && !org.telegram.messenger.m5.D(dialogId)) {
                                org.telegram.ui.Cells.t2 t2Var2 = (org.telegram.ui.Cells.t2) d1Var.a;
                                uwVar.Y0 = t2Var2;
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, t2Var2, uwVar.getResourceProvider());
                                this.f = false;
                                return u4.v.l(3, 0);
                            }
                        } else {
                            int i18 = uwVar.S0;
                            try {
                                i18 = twVar.d.h;
                            } catch (Exception unused) {
                            }
                            jw jwVar = uwVar.A0;
                            if (jwVar != null && jwVar.getVisibility() == 0) {
                                i17 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                            }
                            if (uwVar.d1) {
                                if (dialogId == uwVar.getUserConfig().n || dialogId == 777000 || i18 == 7 || i18 == 8) {
                                    i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                }
                                if (uwVar.getMessagesController().C2(dialogId, false)) {
                                    int i19 = uwVar.getMessagesController().B2;
                                    int i20 = org.telegram.messenger.hp.C8;
                                }
                                if (uwVar.X2 == 0) {
                                    i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.t3.Y(org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-dialogId)))) {
                                        i13 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                        if (org.telegram.messenger.az.m(i13) != 3) {
                                            i14 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                            if (org.telegram.messenger.az.m(i14) != 1) {
                                                i15 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                if (org.telegram.messenger.az.m(i15) != 0) {
                                                    i16 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!uwVar.G3.c()) {
                                        z10 = true;
                                        i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                        if (org.telegram.messenger.az.m(i10) == 1) {
                                            int i21 = uwVar.f0[0].s;
                                            if (i21 == 7 || i21 == 8) {
                                                moVar = uwVar.getMessagesController().N[uwVar.f0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (moVar != null) {
                                                int i22 = moVar.g;
                                                int i23 = org.telegram.messenger.hp.C8;
                                                if ((i22 & 64) != 0 && (dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId)) != null) {
                                                    i11 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                    if (!moVar.a(i11, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.az.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
                                        t2Var.setSliding(true);
                                        return u4.v.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                if (org.telegram.messenger.az.m(i10) == 1) {
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.m5.D(t2Var.getDialogId())) || (org.telegram.messenger.az.q1 && org.telegram.messenger.m5.D(t2Var.getDialogId()));
                                t2Var.setSliding(true);
                                return u4.v.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // u4.v
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // u4.v
    public final float g() {
        return 0.45f;
    }

    @Override // u4.v
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        int i3;
        uw uwVar = this.h;
        ArrayList arrayList = uwVar.b1;
        View view = d1Var2.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
            if (dialog != null && uwVar.s4(dialog) && !org.telegram.messenger.m5.D(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                tw twVar = this.g;
                if (twVar.a.getItemAnimator() == null) {
                    twVar.a.setItemAnimator(twVar.y);
                }
                dv dvVar = twVar.d;
                uw uwVar2 = dvVar.S;
                int i10 = dvVar.G;
                ArrayList d42 = uwVar2.d4(i10, dvVar.h, dvVar.r, false);
                int H = dvVar.H(b10);
                int H2 = dvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = dvVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.hp.s1(i10).N[dvVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                dvVar.X(null);
                int i14 = uwVar.f0[0].s;
                if (i14 != 7) {
                    i3 = 8;
                    if (i14 != 8) {
                        uwVar.a1 = true;
                        return true;
                    }
                } else {
                    i3 = 8;
                }
                org.telegram.messenger.mo moVar = uwVar.getMessagesController().N[uwVar.f0[0].s == i3 ? (char) 1 : (char) 0];
                if (arrayList.contains(moVar)) {
                    return true;
                }
                arrayList.add(moVar);
                return true;
            }
        }
        return false;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
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

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
        int i3;
        uw uwVar = this.h;
        if (d1Var == null) {
            uwVar.X0 = null;
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
        long dialogId = t2Var.getDialogId();
        boolean D = org.telegram.messenger.m5.D(dialogId);
        tw twVar = this.g;
        if (D) {
            pw pwVar = twVar.a;
            int i10 = pw.C3;
            pwVar.C1(false, t2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!uwVar.getMessagesController().C2(dialogId, false) && uwVar.X2 == 0) {
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            if (org.telegram.messenger.az.m(i3) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                uwVar.O2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                uwVar.D4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.t3.Y(uwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            uwVar.D4(arrayList2, org.telegram.messenger.hs.w1, true, false, null);
            return;
        }
        uwVar.X0 = t2Var;
        k2.a0 a0Var = new k2.a0(this, dialog, twVar.d.b(), d1Var.b(), 13);
        uwVar.M4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            a0Var.run();
            return;
        }
        if (uwVar.W0 == null) {
            pw pwVar2 = twVar.a;
            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0();
            ib0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ib0Var.b = paint;
            ib0Var.e = 0L;
            ib0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            ib0Var.c = pwVar2;
            uwVar.W0 = ib0Var;
        }
        org.telegram.ui.Components.ib0 ib0Var2 = uwVar.W0;
        ib0Var2.d = a0Var;
        ib0Var2.h = 0.0f;
        ib0Var2.g = 0.0f;
        ib0Var2.e = System.currentTimeMillis();
        ib0Var2.c.invalidate();
    }
}
