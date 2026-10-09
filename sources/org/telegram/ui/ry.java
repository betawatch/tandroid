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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ry extends s4.w {
    public s4.d1 d;
    public boolean e;
    public boolean f;
    public final sy g;
    public final /* synthetic */ ty h;

    public ry(ty tyVar, sy syVar) {
        this.h = tyVar;
        this.g = syVar;
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
        ty tyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (tyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new nh(1, s2Var), this.g.x.e);
            tyVar.X0 = null;
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
    @Override // s4.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
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
        sy syVar = this.g;
        if (!syVar.x.k()) {
            ty tyVar = this.h;
            d5Var = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
            }
            if (!tyVar.F3.c() && tyVar.X2 == 0) {
                if (this.e && this.f) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!tyVar.l2 && syVar.p() && tyVar.W0 == null) {
                    View view2 = d1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.s2) {
                        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view2;
                        long dialogId = s2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.u(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (tyVar.Y0 && dialog2 != null && tyVar.d4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.s2 s2Var2 = (org.telegram.ui.Cells.s2) d1Var.a;
                                tyVar.X0 = s2Var2;
                                s2Var2.setBackgroundColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                                this.f = false;
                                return s4.w.l(3, 0);
                            }
                        } else {
                            int i19 = tyVar.R0;
                            try {
                                i19 = syVar.d.h;
                            } catch (Exception unused) {
                            }
                            qw qwVar = tyVar.z0;
                            if (qwVar != null && qwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                            }
                            if (tyVar.c1) {
                                if (dialogId == tyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                }
                                if (!tyVar.getMessagesController().isPromoDialog(dialogId, false) || tyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (tyVar.V2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!tyVar.F3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = tyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = tyVar.getMessagesController().selectedDialogFilter[tyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(s2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(s2Var.getDialogId()));
                                            s2Var.setSliding(true);
                                            return s4.w.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(s2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(s2Var.getDialogId()));
                                    s2Var.setSliding(true);
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
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10;
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.a1;
        View view = d1Var2.a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && tyVar.d4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                sy syVar = this.g;
                if (syVar.a.getItemAnimator() == null) {
                    syVar.a.setItemAnimator(syVar.x);
                }
                ax axVar = syVar.d;
                ty tyVar2 = axVar.R;
                int i11 = axVar.F;
                ArrayList O3 = tyVar2.O3(i11, axVar.h, axVar.r, false);
                int G = axVar.G(b10);
                int G2 = axVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) O3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(G2);
                int i12 = axVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[axVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(O3, G, G2);
                axVar.W(null);
                int i15 = tyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        tyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = tyVar.getMessagesController().selectedDialogFilter[tyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
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
    public final void p(s4.d1 d1Var, int i10) {
        if (d1Var != null) {
            this.g.a.d1(false);
        }
        this.d = d1Var;
        if (d1Var != null) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).w = false;
            }
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
        int i10;
        ty tyVar = this.h;
        if (d1Var == null) {
            tyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.a;
        long dialogId = s2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        sy syVar = this.g;
        if (isFolderDialogId) {
            py pyVar = syVar.a;
            int i11 = py.t3;
            pyVar.A1(false, s2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) tyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!tyVar.getMessagesController().isPromoDialog(dialogId, false) && tyVar.V2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                tyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                tyVar.o4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(tyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            tyVar.o4(arrayList2, 111, true, false, null);
            return;
        }
        tyVar.W0 = s2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, syVar.d.h(), d1Var.b(), 5);
        tyVar.x4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            a0Var.run();
            return;
        }
        if (tyVar.V0 == null) {
            py pyVar2 = syVar.a;
            org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0();
            be0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            be0Var.b = paint;
            be0Var.e = 0L;
            be0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            be0Var.c = pyVar2;
            tyVar.V0 = be0Var;
        }
        org.telegram.ui.Components.be0 be0Var2 = tyVar.V0;
        be0Var2.d = a0Var;
        be0Var2.h = 0.0f;
        be0Var2.g = 0.0f;
        be0Var2.e = System.currentTimeMillis();
        be0Var2.c.invalidate();
    }
}
