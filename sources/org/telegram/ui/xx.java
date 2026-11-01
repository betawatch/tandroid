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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xx extends s4.u {
    public s4.c1 d;
    public boolean e;
    public boolean f;
    public final yx g;
    public final /* synthetic */ zx h;

    public xx(zx zxVar, yx yxVar) {
        this.h = zxVar;
        this.g = yxVar;
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
        zx zxVar;
        org.telegram.ui.Cells.v2 v2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (v2Var = (zxVar = this.h).X0) != null) {
            org.telegram.messenger.i0.h3(new eh(1, v2Var), this.g.y.e);
            zxVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (org.telegram.messenger.uz.m(r1) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e7, code lost:
    
        if (org.telegram.messenger.uz.m(r1) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (org.telegram.messenger.uz.m(r2) != 5) goto L50;
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
        yx yxVar = this.g;
        if (!yxVar.y.k()) {
            zx zxVar = this.h;
            z4Var = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
            if (z4Var != null) {
                z4Var2 = ((org.telegram.ui.ActionBar.k2) zxVar).parentLayout;
            }
            if (!zxVar.F3.c() && zxVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.v2) {
                        ((org.telegram.ui.Cells.v2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!zxVar.l2 && yxVar.p() && zxVar.W0 == null) {
                    View view2 = c1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.v2) {
                        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view2;
                        long dialogId = v2Var.getDialogId();
                        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                        org.telegram.messenger.bp bpVar = null;
                        if (lVar.w(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
                            if (zxVar.Y0 && dialog2 != null && zxVar.s4(dialog2) && !org.telegram.messenger.o5.D(dialogId)) {
                                org.telegram.ui.Cells.v2 v2Var2 = (org.telegram.ui.Cells.v2) c1Var.a;
                                zxVar.X0 = v2Var2;
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, v2Var2, zxVar.getResourceProvider());
                                this.f = false;
                                return s4.u.l(3, 0);
                            }
                        } else {
                            int i19 = zxVar.R0;
                            try {
                                i19 = yxVar.d.h;
                            } catch (Exception unused) {
                            }
                            px pxVar = zxVar.z0;
                            if (pxVar != null && pxVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                            }
                            if (zxVar.c1) {
                                if (dialogId == zxVar.getUserConfig().n || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                }
                                if (zxVar.getMessagesController().B2(dialogId, false)) {
                                    int i20 = zxVar.getMessagesController().A2;
                                    int i21 = org.telegram.messenger.wp.D8;
                                }
                                if (zxVar.W2 == 0) {
                                    i13 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.w3.Y(org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-dialogId)))) {
                                        i14 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                        if (org.telegram.messenger.uz.m(i14) != 3) {
                                            i15 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                            if (org.telegram.messenger.uz.m(i15) != 1) {
                                                i16 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                if (org.telegram.messenger.uz.m(i16) != 0) {
                                                    i17 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!zxVar.F3.c()) {
                                        z10 = true;
                                        i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                        if (org.telegram.messenger.uz.m(i11) == 1) {
                                            int i22 = zxVar.e0[0].s;
                                            if (i22 == 7 || i22 == 8) {
                                                bpVar = zxVar.getMessagesController().M[zxVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                            }
                                            if (bpVar != null) {
                                                int i23 = bpVar.g;
                                                int i24 = org.telegram.messenger.wp.D8;
                                                if ((i23 & 64) != 0 && (dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                    if (!bpVar.a(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.o5.D(v2Var.getDialogId())) || (org.telegram.messenger.uz.q1 && org.telegram.messenger.o5.D(v2Var.getDialogId()));
                                        v2Var.setSliding(true);
                                        return s4.u.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                if (org.telegram.messenger.uz.m(i11) == 1) {
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.o5.D(v2Var.getDialogId())) || (org.telegram.messenger.uz.q1 && org.telegram.messenger.o5.D(v2Var.getDialogId()));
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
        zx zxVar = this.h;
        ArrayList arrayList = zxVar.a1;
        View view = c1Var2.a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            long dialogId = ((org.telegram.ui.Cells.v2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
            if (dialog != null && zxVar.s4(dialog) && !org.telegram.messenger.o5.D(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                yx yxVar = this.g;
                if (yxVar.a.getItemAnimator() == null) {
                    yxVar.a.setItemAnimator(yxVar.y);
                }
                kw kwVar = yxVar.d;
                zx zxVar2 = kwVar.R;
                int i11 = kwVar.F;
                ArrayList d42 = zxVar2.d4(i11, kwVar.h, kwVar.r, false);
                int H = kwVar.H(b10);
                int H2 = kwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i12 = kwVar.h;
                if (i12 == 7 || i12 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.wp.r1(i11).M[kwVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i13 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(d42, H, H2);
                kwVar.X(null);
                int i15 = zxVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        zxVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                org.telegram.messenger.bp bpVar = zxVar.getMessagesController().M[zxVar.e0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(bpVar)) {
                    return true;
                }
                arrayList.add(bpVar);
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
        zx zxVar = this.h;
        if (c1Var == null) {
            zxVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.a;
        long dialogId = v2Var.getDialogId();
        boolean D = org.telegram.messenger.o5.D(dialogId);
        yx yxVar = this.g;
        if (D) {
            vx vxVar = yxVar.a;
            int i11 = vx.B3;
            vxVar.C1(false, v2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!zxVar.getMessagesController().B2(dialogId, false) && zxVar.W2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            if (org.telegram.messenger.uz.m(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                zxVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                zxVar.D4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.w3.Y(zxVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            zxVar.D4(arrayList2, org.telegram.messenger.at.w1, true, false, null);
            return;
        }
        zxVar.W0 = v2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, yxVar.d.b(), c1Var.b(), 13);
        zxVar.M4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            a0Var.run();
            return;
        }
        if (zxVar.V0 == null) {
            vx vxVar2 = yxVar.a;
            org.telegram.ui.Components.gc0 gc0Var = new org.telegram.ui.Components.gc0();
            gc0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            gc0Var.b = paint;
            gc0Var.e = 0L;
            gc0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            gc0Var.c = vxVar2;
            zxVar.V0 = gc0Var;
        }
        org.telegram.ui.Components.gc0 gc0Var2 = zxVar.V0;
        gc0Var2.d = a0Var;
        gc0Var2.h = 0.0f;
        gc0Var2.g = 0.0f;
        gc0Var2.e = System.currentTimeMillis();
        gc0Var2.c.invalidate();
    }
}
