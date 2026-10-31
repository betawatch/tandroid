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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yx extends s4.u {
    public s4.c1 d;
    public boolean e;
    public boolean f;
    public final zx g;
    public final /* synthetic */ ay h;

    public yx(ay ayVar, zx zxVar) {
        this.h = ayVar;
        this.g = zxVar;
    }

    @Override // s4.u
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // s4.u
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ay ayVar;
        org.telegram.ui.Cells.v2 v2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (v2Var = (ayVar = this.h).X0) != null) {
            org.telegram.messenger.i0.h3(new hh(1, v2Var), this.g.y.e);
            ayVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (org.telegram.messenger.tz.m(r1) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e7, code lost:
    
        if (org.telegram.messenger.tz.m(r1) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (org.telegram.messenger.tz.m(r2) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (r1 != 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r5).x() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    @Override // s4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Dialog dialog;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.z4 z4Var2;
        zx zxVar = this.g;
        if (!zxVar.y.k()) {
            ay ayVar = this.h;
            z4Var = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) ayVar).parentLayout;
            }
            if (!ayVar.F3.c() && ayVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.v2) {
                        ((org.telegram.ui.Cells.v2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!ayVar.l2 && zxVar.p() && ayVar.W0 == null) {
                    View view2 = c1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.v2) {
                        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view2;
                        long dialogId = v2Var.getDialogId();
                        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        org.telegram.messenger.ap apVar = null;
                        if (lVar.w(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
                            if (ayVar.Y0 && dialog2 != null && ayVar.r4(dialog2) && !org.telegram.messenger.o5.D(dialogId)) {
                                org.telegram.ui.Cells.v2 v2Var2 = (org.telegram.ui.Cells.v2) c1Var.a;
                                ayVar.X0 = v2Var2;
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, v2Var2, ayVar.getResourceProvider());
                                this.f = false;
                                return s4.u.l(3, 0);
                            }
                        } else {
                            int i19 = ayVar.R0;
                            try {
                                i19 = zxVar.d.h;
                            } catch (Exception unused) {
                            }
                            qx qxVar = ayVar.z0;
                            if (qxVar != null && qxVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            }
                            if (ayVar.c1) {
                                if (dialogId == ayVar.getUserConfig().n || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                }
                                if (ayVar.getMessagesController().B2(dialogId, false)) {
                                    int i20 = ayVar.getMessagesController().A2;
                                    int i21 = org.telegram.messenger.vp.D8;
                                }
                                if (ayVar.W2 == 0) {
                                    i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.w3.Y(org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(-dialogId)))) {
                                        i14 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                        if (org.telegram.messenger.tz.m(i14) != 3) {
                                            i15 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                            if (org.telegram.messenger.tz.m(i15) != 1) {
                                                i16 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                if (org.telegram.messenger.tz.m(i16) != 0) {
                                                    i17 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!ayVar.F3.c()) {
                                        z10 = true;
                                        i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                        if (org.telegram.messenger.tz.m(i11) == 1) {
                                            int i22 = ayVar.e0[0].s;
                                            if (i22 == 7 || i22 == 8) {
                                                apVar = ayVar.getMessagesController().M[ayVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (apVar != null) {
                                                int i23 = apVar.g;
                                                int i24 = org.telegram.messenger.vp.D8;
                                                if ((i23 & 64) != 0 && (dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                    if (!apVar.a(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.o5.D(v2Var.getDialogId())) || (org.telegram.messenger.tz.q1 && org.telegram.messenger.o5.D(v2Var.getDialogId()));
                                        v2Var.setSliding(true);
                                        return s4.u.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                if (org.telegram.messenger.tz.m(i11) == 1) {
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.o5.D(v2Var.getDialogId())) || (org.telegram.messenger.tz.q1 && org.telegram.messenger.o5.D(v2Var.getDialogId()));
                                v2Var.setSliding(true);
                                return s4.u.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.u
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override // s4.u
    public final float g() {
        return 0.45f;
    }

    @Override // s4.u
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10;
        ay ayVar = this.h;
        ArrayList arrayList = ayVar.a1;
        View view = c1Var2.a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            long dialogId = ((org.telegram.ui.Cells.v2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && ayVar.r4(dialog) && !org.telegram.messenger.o5.D(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                zx zxVar = this.g;
                if (zxVar.a.getItemAnimator() == null) {
                    zxVar.a.setItemAnimator(zxVar.y);
                }
                lw lwVar = zxVar.d;
                ay ayVar2 = lwVar.R;
                int i11 = lwVar.F;
                ArrayList c42 = ayVar2.c4(i11, lwVar.h, lwVar.r, false);
                int H = lwVar.H(b10);
                int H2 = lwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) c42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) c42.get(H2);
                int i12 = lwVar.h;
                if (i12 == 7 || i12 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.vp.r1(i11).M[lwVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i13 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(c42, H, H2);
                lwVar.X(null);
                int i15 = ayVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        ayVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                org.telegram.messenger.ap apVar = ayVar.getMessagesController().M[ayVar.e0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(apVar)) {
                    return true;
                }
                arrayList.add(apVar);
                return true;
            }
        }
        return false;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        if (c1Var != null) {
            this.g.a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).x = false;
            }
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
        int i10;
        ay ayVar = this.h;
        if (c1Var == null) {
            ayVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.a;
        long dialogId = v2Var.getDialogId();
        boolean D = org.telegram.messenger.o5.D(dialogId);
        zx zxVar = this.g;
        if (D) {
            wx wxVar = zxVar.a;
            int i11 = wx.B3;
            wxVar.C1(false, v2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!ayVar.getMessagesController().B2(dialogId, false) && ayVar.W2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            if (org.telegram.messenger.tz.m(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                ayVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                ayVar.C4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.w3.Y(ayVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            ayVar.C4(arrayList2, org.telegram.messenger.zs.w1, true, false, null);
            return;
        }
        ayVar.W0 = v2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, zxVar.d.b(), c1Var.b(), 13);
        ayVar.L4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            a0Var.run();
            return;
        }
        if (ayVar.V0 == null) {
            wx wxVar2 = zxVar.a;
            org.telegram.ui.Components.gc0 gc0Var = new org.telegram.ui.Components.gc0();
            gc0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            gc0Var.b = paint;
            gc0Var.e = 0L;
            gc0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            gc0Var.c = wxVar2;
            ayVar.V0 = gc0Var;
        }
        org.telegram.ui.Components.gc0 gc0Var2 = ayVar.V0;
        gc0Var2.d = a0Var;
        gc0Var2.h = 0.0f;
        gc0Var2.g = 0.0f;
        gc0Var2.e = System.currentTimeMillis();
        gc0Var2.c.invalidate();
    }
}
