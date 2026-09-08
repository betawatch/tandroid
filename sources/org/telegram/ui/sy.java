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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sy extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f;
    public final ty g;
    public final /* synthetic */ uy h;

    public sy(uy uyVar, ty tyVar) {
        this.h = uyVar;
        this.g = tyVar;
    }

    @Override // s4.v
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // s4.v
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        uy uyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (uyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new jh(1, r2Var), this.g.x.e);
            uyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e5, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r14) != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).y() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r14) == 4) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        org.telegram.ui.ActionBar.d5 d5Var;
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
        org.telegram.ui.ActionBar.d5 d5Var2;
        ty tyVar = this.g;
        if (!tyVar.x.k()) {
            uy uyVar = this.h;
            d5Var = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
            }
            if (!uyVar.F3.c() && uyVar.X2 == 0) {
                if (this.e && this.f) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!uyVar.l2 && tyVar.p() && uyVar.W0 == null) {
                    View view2 = c1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (uyVar.Y0 && dialog2 != null && uyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) c1Var.a;
                                uyVar.X0 = r2Var2;
                                r2Var2.setBackgroundColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = uyVar.R0;
                            try {
                                i19 = tyVar.d.h;
                            } catch (Exception unused) {
                            }
                            sw swVar = uyVar.z0;
                            if (swVar != null && swVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                            }
                            if (uyVar.c1) {
                                if (dialogId == uyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                }
                                if (!uyVar.getMessagesController().isPromoDialog(dialogId, false) || uyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (uyVar.V2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!uyVar.F3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = uyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = uyVar.getMessagesController().selectedDialogFilter[uyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                            r2Var.setSliding(true);
                                            return s4.v.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                    r2Var.setSliding(true);
                                    return s4.v.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.v
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override // s4.v
    public final float g() {
        return 0.45f;
    }

    @Override // s4.v
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10;
        uy uyVar = this.h;
        ArrayList arrayList = uyVar.a1;
        View view = c1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && uyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ty tyVar = this.g;
                if (tyVar.a.getItemAnimator() == null) {
                    tyVar.a.setItemAnimator(tyVar.x);
                }
                bx bxVar = tyVar.d;
                uy uyVar2 = bxVar.R;
                int i11 = bxVar.F;
                ArrayList R3 = uyVar2.R3(i11, bxVar.h, bxVar.r, false);
                int G = bxVar.G(b10);
                int G2 = bxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = bxVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[bxVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                bxVar.W(null);
                int i15 = uyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        uyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = uyVar.getMessagesController().selectedDialogFilter[uyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        if (c1Var != null) {
            this.g.a.c1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        int i10;
        uy uyVar = this.h;
        if (c1Var == null) {
            uyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        ty tyVar = this.g;
        if (isFolderDialogId) {
            qy qyVar = tyVar.a;
            int i11 = qy.v3;
            qyVar.y1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!uyVar.getMessagesController().isPromoDialog(dialogId, false) && uyVar.V2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                uyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                uyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            uyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        uyVar.W0 = r2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, tyVar.d.h(), c1Var.b(), 5);
        uyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            a0Var.run();
            return;
        }
        if (uyVar.V0 == null) {
            qy qyVar2 = tyVar.a;
            org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0();
            bd0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            bd0Var.b = paint;
            bd0Var.e = 0L;
            bd0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            bd0Var.c = qyVar2;
            uyVar.V0 = bd0Var;
        }
        org.telegram.ui.Components.bd0 bd0Var2 = uyVar.V0;
        bd0Var2.d = a0Var;
        bd0Var2.h = 0.0f;
        bd0Var2.g = 0.0f;
        bd0Var2.e = System.currentTimeMillis();
        bd0Var2.c.invalidate();
    }
}
