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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zw extends v4.w {
    public v4.f1 d;
    public boolean e;
    public boolean f;
    public final ax g;
    public final /* synthetic */ bx h;

    public zw(bx bxVar, ax axVar) {
        this.h = bxVar;
        this.g = axVar;
    }

    @Override // v4.w
    public final int b(int i7, int i10) {
        if (this.f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override // v4.w
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        bx bxVar;
        org.telegram.ui.Cells.u2 u2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (u2Var = (bxVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.h3(new sg(1, u2Var), this.g.y.e);
            bxVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0148, code lost:
    
        if (org.telegram.messenger.bz.m(r14) == 4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e9, code lost:
    
        if (org.telegram.messenger.bz.m(r14) != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (org.telegram.messenger.bz.m(r8) != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        if (r14 != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).y() == false) goto L8;
     */
    @Override // v4.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        org.telegram.ui.ActionBar.r4 r4Var;
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
        org.telegram.ui.ActionBar.r4 r4Var2;
        ax axVar = this.g;
        if (!axVar.y.k()) {
            bx bxVar = this.h;
            r4Var = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bxVar).parentLayout;
            }
            if (!bxVar.H3.c() && bxVar.a3 == 0) {
                if (this.e && this.f) {
                    View view = f1Var.a;
                    if (view instanceof org.telegram.ui.Cells.u2) {
                        ((org.telegram.ui.Cells.u2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!bxVar.n2 && axVar.p() && bxVar.Y0 == null) {
                    View view2 = f1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.u2) {
                        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view2;
                        long dialogId = u2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                        if (kVar.y(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
                            if (bxVar.a1 && dialog2 != null && bxVar.v4(dialog2) && !org.telegram.messenger.n5.D(dialogId) && !bxVar.y4(axVar)) {
                                org.telegram.ui.Cells.u2 u2Var2 = (org.telegram.ui.Cells.u2) f1Var.a;
                                bxVar.Z0 = u2Var2;
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, u2Var2, bxVar.getResourceProvider());
                                this.f = false;
                                return v4.w.l(3, 0);
                            }
                        } else {
                            int i17 = bxVar.T0;
                            try {
                                i17 = axVar.d.h;
                            } catch (Exception unused) {
                            }
                            qw qwVar = bxVar.A0;
                            if (qwVar != null && qwVar.getVisibility() == 0) {
                                i16 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            }
                            if (bxVar.e1) {
                                if (dialogId == bxVar.getUserConfig().n || dialogId == 777000 || i17 == 7 || i17 == 8) {
                                    i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                }
                                if (bxVar.getMessagesController().I2(dialogId, false)) {
                                    int i18 = bxVar.getMessagesController().D2;
                                    int i19 = org.telegram.messenger.mp.I8;
                                }
                                if (bxVar.Y2 == 0) {
                                    i11 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.v3.Y(org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialogId)))) {
                                        i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                        if (org.telegram.messenger.bz.m(i12) != 3) {
                                            i13 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                            if (org.telegram.messenger.bz.m(i13) != 1) {
                                                i14 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                if (org.telegram.messenger.bz.m(i14) != 0) {
                                                    i15 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!bxVar.H3.c()) {
                                        z10 = true;
                                        i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                        if (org.telegram.messenger.bz.m(i10) == 1 && (dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId)) != null && bxVar.H4(axVar, dialog) && bxVar.getMessagesController().w2(dialog)) {
                                            z10 = false;
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.n5.D(u2Var.getDialogId())) || (org.telegram.messenger.bz.q1 && org.telegram.messenger.n5.D(u2Var.getDialogId()));
                                        u2Var.setSliding(true);
                                        return v4.w.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                if (org.telegram.messenger.bz.m(i10) == 1) {
                                    z10 = false;
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.n5.D(u2Var.getDialogId())) || (org.telegram.messenger.bz.q1 && org.telegram.messenger.n5.D(u2Var.getDialogId()));
                                u2Var.setSliding(true);
                                return v4.w.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // v4.w
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // v4.w
    public final float g() {
        return 0.45f;
    }

    @Override // v4.w
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7;
        bx bxVar = this.h;
        ArrayList arrayList = bxVar.c1;
        View view = f1Var2.a;
        if (view instanceof org.telegram.ui.Cells.u2) {
            long dialogId = ((org.telegram.ui.Cells.u2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
            if (dialog != null && bxVar.v4(dialog) && !org.telegram.messenger.n5.D(dialogId)) {
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                ax axVar = this.g;
                if (axVar.a.getItemAnimator() == null) {
                    axVar.a.setItemAnimator(axVar.y);
                }
                jv jvVar = axVar.d;
                bx bxVar2 = jvVar.S;
                int i10 = jvVar.G;
                ArrayList d42 = bxVar2.d4(i10, jvVar.h, jvVar.r, false);
                int H = jvVar.H(b10);
                int H2 = jvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = jvVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.mp.u1(i10).N[jvVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                jvVar.X(null);
                int i14 = bxVar.f0[0].s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        bxVar.b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.ro roVar = bxVar.getMessagesController().N[bxVar.f0[0].s == i7 ? (char) 1 : (char) 0];
                if (arrayList.contains(roVar)) {
                    return true;
                }
                arrayList.add(roVar);
                return true;
            }
        }
        return false;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        if (f1Var != null) {
            this.g.a.d1(false);
        }
        this.d = f1Var;
        if (f1Var != null) {
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).x = false;
            }
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
        int i7;
        bx bxVar = this.h;
        if (f1Var == null) {
            bxVar.Y0 = null;
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.a;
        long dialogId = u2Var.getDialogId();
        boolean D = org.telegram.messenger.n5.D(dialogId);
        ax axVar = this.g;
        if (D) {
            xw xwVar = axVar.a;
            int i10 = xw.C3;
            xwVar.C1(false, u2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!bxVar.getMessagesController().I2(dialogId, false) && bxVar.Y2 == 0) {
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            if (org.telegram.messenger.bz.m(i7) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                bxVar.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                bxVar.K4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.v3.Y(bxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            bxVar.K4(arrayList2, org.telegram.messenger.ks.w1, true, false, null);
            return;
        }
        bxVar.Y0 = u2Var;
        l2.y yVar = new l2.y(this, dialog, axVar.d.b(), f1Var.b(), 13);
        bxVar.U4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            yVar.run();
            return;
        }
        if (bxVar.X0 == null) {
            xw xwVar2 = axVar.a;
            org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0();
            xb0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            xb0Var.b = paint;
            xb0Var.e = 0L;
            xb0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            xb0Var.c = xwVar2;
            bxVar.X0 = xb0Var;
        }
        org.telegram.ui.Components.xb0 xb0Var2 = bxVar.X0;
        xb0Var2.d = yVar;
        xb0Var2.h = 0.0f;
        xb0Var2.g = 0.0f;
        xb0Var2.e = System.currentTimeMillis();
        xb0Var2.c.invalidate();
    }
}
