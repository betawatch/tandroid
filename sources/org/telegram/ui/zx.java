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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class zx extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f;
    public final ay g;
    public final /* synthetic */ cy h;

    public zx(cy cyVar, ay ayVar) {
        this.h = cyVar;
        this.g = ayVar;
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
        cy cyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (cyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, r2Var), this.g.x.e);
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
        ay ayVar = this.g;
        if (!ayVar.x.k()) {
            cy cyVar = this.h;
            d5Var = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) cyVar).parentLayout;
            }
            if (!cyVar.G3.c() && cyVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = b1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!cyVar.l2 && ayVar.p() && cyVar.W0 == null) {
                    View view2 = b1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.u(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (cyVar.Y0 && dialog2 != null && cyVar.e4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) b1Var.a;
                                cyVar.X0 = r2Var2;
                                r2Var2.setBackgroundColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = cyVar.R0;
                            try {
                                i19 = ayVar.d.h;
                            } catch (Exception unused) {
                            }
                            aw awVar = cyVar.z0;
                            if (awVar != null && awVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                            }
                            if (cyVar.c1) {
                                if (dialogId == cyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                }
                                if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) || cyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (cyVar.W2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!cyVar.G3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = cyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = cyVar.getMessagesController().selectedDialogFilter[cyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
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
                                    i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10;
        cy cyVar = this.h;
        ArrayList arrayList = cyVar.a1;
        View view = b1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && cyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ay ayVar = this.g;
                if (ayVar.a.getItemAnimator() == null) {
                    ayVar.a.setItemAnimator(ayVar.x);
                }
                jw jwVar = ayVar.d;
                cy cyVar2 = jwVar.R;
                int i11 = jwVar.F;
                ArrayList P3 = cyVar2.P3(i11, jwVar.h, jwVar.r, false);
                int G = jwVar.G(b10);
                int G2 = jwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(G2);
                int i12 = jwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[jwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(P3, G, G2);
                jwVar.W(null);
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

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        if (b1Var != null) {
            this.g.a.d1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        int i10;
        cy cyVar = this.h;
        if (b1Var == null) {
            cyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        ay ayVar = this.g;
        if (isFolderDialogId) {
            xx xxVar = ayVar.a;
            int i11 = xx.t3;
            xxVar.A1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!cyVar.getMessagesController().isPromoDialog(dialogId, false) && cyVar.W2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                cyVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                cyVar.p4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            cyVar.p4(arrayList2, 111, true, false, null);
            return;
        }
        cyVar.W0 = r2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, ayVar.d.h(), b1Var.b(), 5);
        cyVar.y4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            a0Var.run();
            return;
        }
        if (cyVar.V0 == null) {
            xx xxVar2 = ayVar.a;
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0();
            ud0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ud0Var.b = paint;
            ud0Var.e = 0L;
            ud0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            ud0Var.c = xxVar2;
            cyVar.V0 = ud0Var;
        }
        org.telegram.ui.Components.ud0 ud0Var2 = cyVar.V0;
        ud0Var2.d = a0Var;
        ud0Var2.h = 0.0f;
        ud0Var2.g = 0.0f;
        ud0Var2.e = System.currentTimeMillis();
        ud0Var2.c.invalidate();
    }
}
