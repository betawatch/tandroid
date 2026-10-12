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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wy extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f;
    public final xy g;
    public final /* synthetic */ yy h;

    public wy(yy yyVar, xy xyVar) {
        this.h = yyVar;
        this.g = xyVar;
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
        yy yyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (yyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new rh(1, s2Var), this.g.x.e);
            yyVar.X0 = null;
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
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).y() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0130, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) == 4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        org.telegram.ui.ActionBar.b5 b5Var;
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
        org.telegram.ui.ActionBar.b5 b5Var2;
        xy xyVar = this.g;
        if (!xyVar.x.k()) {
            yy yyVar = this.h;
            b5Var = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) yyVar).parentLayout;
            }
            if (!yyVar.F3.c() && yyVar.X2 == 0) {
                if (this.e && this.f) {
                    View view = b1Var.a;
                    if (view instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!yyVar.l2 && xyVar.p() && yyVar.W0 == null) {
                    View view2 = b1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.s2) {
                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view2;
                        long dialogId = s2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.u(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (yyVar.Y0 && dialog2 != null && yyVar.d4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.s2 s2Var2 = (org.telegram.ui.Cells.s2) b1Var.a;
                                yyVar.X0 = s2Var2;
                                s2Var2.setBackgroundColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = yyVar.R0;
                            try {
                                i19 = xyVar.d.h;
                            } catch (Exception unused) {
                            }
                            ww wwVar = yyVar.z0;
                            if (wwVar != null && wwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                            }
                            if (yyVar.c1) {
                                if (dialogId == yyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                }
                                if (!yyVar.getMessagesController().isPromoDialog(dialogId, false) || yyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (yyVar.V2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!yyVar.F3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = yyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = yyVar.getMessagesController().selectedDialogFilter[yyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(s2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(s2Var.getDialogId()));
                                            s2Var.setSliding(true);
                                            return s4.v.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(s2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(s2Var.getDialogId()));
                                    s2Var.setSliding(true);
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10;
        yy yyVar = this.h;
        ArrayList arrayList = yyVar.a1;
        View view = b1Var2.a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && yyVar.d4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                xy xyVar = this.g;
                if (xyVar.a.getItemAnimator() == null) {
                    xyVar.a.setItemAnimator(xyVar.x);
                }
                fx fxVar = xyVar.d;
                yy yyVar2 = fxVar.R;
                int i11 = fxVar.F;
                ArrayList O3 = yyVar2.O3(i11, fxVar.h, fxVar.r, false);
                int G = fxVar.G(b10);
                int G2 = fxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) O3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(G2);
                int i12 = fxVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[fxVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(O3, G, G2);
                fxVar.W(null);
                int i15 = yyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        yyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = yyVar.getMessagesController().selectedDialogFilter[yyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
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
    public final void p(s4.b1 b1Var, int i10) {
        if (b1Var != null) {
            this.g.a.d1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).w = false;
            }
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        int i10;
        yy yyVar = this.h;
        if (b1Var == null) {
            yyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) b1Var.a;
        long dialogId = s2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        xy xyVar = this.g;
        if (isFolderDialogId) {
            uy uyVar = xyVar.a;
            int i11 = uy.t3;
            uyVar.A1(false, s2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!yyVar.getMessagesController().isPromoDialog(dialogId, false) && yyVar.V2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                yyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                yyVar.o4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(yyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            yyVar.o4(arrayList2, 111, true, false, null);
            return;
        }
        yyVar.W0 = s2Var;
        i2.z zVar = new i2.z(this, dialog, xyVar.d.h(), b1Var.b(), 5);
        yyVar.x4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            zVar.run();
            return;
        }
        if (yyVar.V0 == null) {
            uy uyVar2 = xyVar.a;
            org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0();
            ae0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ae0Var.b = paint;
            ae0Var.e = 0L;
            ae0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            ae0Var.c = uyVar2;
            yyVar.V0 = ae0Var;
        }
        org.telegram.ui.Components.ae0 ae0Var2 = yyVar.V0;
        ae0Var2.d = zVar;
        ae0Var2.h = 0.0f;
        ae0Var2.g = 0.0f;
        ae0Var2.e = System.currentTimeMillis();
        ae0Var2.c.invalidate();
    }
}
