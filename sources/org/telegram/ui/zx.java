package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zx extends s4.w {
    public s4.e1 d;
    public boolean e;
    public boolean f;
    public final ay g;
    public final /* synthetic */ cy h;

    public zx(cy cyVar, ay ayVar) {
        this.h = cyVar;
        this.g = ayVar;
    }

    @Override // s4.w
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // s4.w
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        cy cyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (cyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, p2Var), this.g.x.e);
            cyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e3, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).x() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0130, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) == 4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    @Override // s4.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.k kVar;
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
        org.telegram.ui.ActionBar.j5 j5Var2;
        ay ayVar = this.g;
        if (!ayVar.x.k()) {
            cy cyVar = this.h;
            j5Var = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) cyVar).parentLayout;
            }
            if (!cyVar.G3.c() && cyVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = e1Var.a;
                    if (view instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!cyVar.l2 && ayVar.p() && cyVar.W0 == null) {
                    View view2 = e1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view2;
                        long dialogId = p2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.r(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (cyVar.Y0 && dialog2 != null && cyVar.o4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.p2 p2Var2 = (org.telegram.ui.Cells.p2) e1Var.a;
                                cyVar.X0 = p2Var2;
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, p2Var2, cyVar.getResourceProvider());
                                this.f = false;
                                return s4.w.l(3, 0);
                            }
                        } else {
                            int i19 = cyVar.R0;
                            try {
                                i19 = ayVar.d.h;
                            } catch (Exception unused) {
                            }
                            qx qxVar = cyVar.z0;
                            if (qxVar != null && qxVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                            }
                            if (cyVar.c1) {
                                if (dialogId == cyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                }
                                if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) || cyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (cyVar.W2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!cyVar.G3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = cyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = cyVar.getMessagesController().selectedDialogFilter[cyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                            p2Var.setSliding(true);
                                            return s4.w.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                    p2Var.setSliding(true);
                                    return s4.w.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.w
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override // s4.w
    public final float g() {
        return 0.45f;
    }

    @Override // s4.w
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int i10;
        cy cyVar = this.h;
        ArrayList arrayList = cyVar.a1;
        View view = e1Var2.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && cyVar.o4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                ay ayVar = this.g;
                if (ayVar.a.getItemAnimator() == null) {
                    ayVar.a.setItemAnimator(ayVar.x);
                }
                gw gwVar = ayVar.d;
                cy cyVar2 = gwVar.R;
                int i11 = gwVar.F;
                ArrayList Z3 = cyVar2.Z3(i11, gwVar.h, gwVar.r, false);
                int H = gwVar.H(b10);
                int H2 = gwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) Z3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) Z3.get(H2);
                int i12 = gwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[gwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(Z3, H, H2);
                gwVar.X(null);
                int i15 = cyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        cyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = cyVar.getMessagesController().selectedDialogFilter[cyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        if (e1Var != null) {
            this.g.a.d1(false);
        }
        this.d = e1Var;
        if (e1Var != null) {
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).w = false;
            }
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
        int i10;
        cy cyVar = this.h;
        if (e1Var == null) {
            cyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.a;
        long dialogId = p2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        ay ayVar = this.g;
        if (isFolderDialogId) {
            wx wxVar = ayVar.a;
            int i11 = wx.C3;
            wxVar.F1(false, p2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) && cyVar.W2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                cyVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                cyVar.z4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            cyVar.z4(arrayList2, 111, true, false, null);
            return;
        }
        cyVar.W0 = p2Var;
        i2.b0 b0Var = new i2.b0(this, dialog, ayVar.d.h(), e1Var.b(), 5);
        cyVar.I4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            b0Var.run();
            return;
        }
        if (cyVar.V0 == null) {
            wx wxVar2 = ayVar.a;
            org.telegram.ui.Components.td0 td0Var = new org.telegram.ui.Components.td0();
            td0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            td0Var.b = paint;
            td0Var.e = 0L;
            td0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            td0Var.c = wxVar2;
            cyVar.V0 = td0Var;
        }
        org.telegram.ui.Components.td0 td0Var2 = cyVar.V0;
        td0Var2.d = b0Var;
        td0Var2.h = 0.0f;
        td0Var2.g = 0.0f;
        td0Var2.e = System.currentTimeMillis();
        td0Var2.c.invalidate();
    }
}
