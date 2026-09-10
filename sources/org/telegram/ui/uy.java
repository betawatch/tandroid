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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uy extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f;
    public final vy g;
    public final /* synthetic */ wy h;

    public uy(wy wyVar, vy vyVar) {
        this.h = wyVar;
        this.g = vyVar;
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
        wy wyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (wyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new jh(1, r2Var), this.g.x.e);
            wyVar.X0 = null;
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
        org.telegram.ui.ActionBar.f5 f5Var;
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
        org.telegram.ui.ActionBar.f5 f5Var2;
        vy vyVar = this.g;
        if (!vyVar.x.k()) {
            wy wyVar = this.h;
            f5Var = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
            }
            if (!wyVar.F3.c() && wyVar.X2 == 0) {
                if (this.e && this.f) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!wyVar.l2 && vyVar.p() && wyVar.W0 == null) {
                    View view2 = c1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (lVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (wyVar.Y0 && dialog2 != null && wyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) c1Var.a;
                                wyVar.X0 = r2Var2;
                                r2Var2.setBackgroundColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = wyVar.R0;
                            try {
                                i19 = vyVar.d.h;
                            } catch (Exception unused) {
                            }
                            uw uwVar = wyVar.z0;
                            if (uwVar != null && uwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                            }
                            if (wyVar.c1) {
                                if (dialogId == wyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                }
                                if (!wyVar.getMessagesController().isPromoDialog(dialogId, false) || wyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (wyVar.V2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!wyVar.F3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = wyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = wyVar.getMessagesController().selectedDialogFilter[wyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
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
                                    i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
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
        wy wyVar = this.h;
        ArrayList arrayList = wyVar.a1;
        View view = c1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && wyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                vy vyVar = this.g;
                if (vyVar.a.getItemAnimator() == null) {
                    vyVar.a.setItemAnimator(vyVar.x);
                }
                dx dxVar = vyVar.d;
                wy wyVar2 = dxVar.R;
                int i11 = dxVar.F;
                ArrayList R3 = wyVar2.R3(i11, dxVar.h, dxVar.r, false);
                int G = dxVar.G(b10);
                int G2 = dxVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = dxVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[dxVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                dxVar.W(null);
                int i15 = wyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        wyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = wyVar.getMessagesController().selectedDialogFilter[wyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
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
        wy wyVar = this.h;
        if (c1Var == null) {
            wyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        vy vyVar = this.g;
        if (isFolderDialogId) {
            sy syVar = vyVar.a;
            int i11 = sy.v3;
            syVar.y1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!wyVar.getMessagesController().isPromoDialog(dialogId, false) && wyVar.V2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                wyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                wyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(wyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            wyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        wyVar.W0 = r2Var;
        i2.z zVar = new i2.z(this, dialog, vyVar.d.h(), c1Var.b(), 5);
        wyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            zVar.run();
            return;
        }
        if (wyVar.V0 == null) {
            sy syVar2 = vyVar.a;
            org.telegram.ui.Components.jd0 jd0Var = new org.telegram.ui.Components.jd0();
            jd0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            jd0Var.b = paint;
            jd0Var.e = 0L;
            jd0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            jd0Var.c = syVar2;
            wyVar.V0 = jd0Var;
        }
        org.telegram.ui.Components.jd0 jd0Var2 = wyVar.V0;
        jd0Var2.d = zVar;
        jd0Var2.h = 0.0f;
        jd0Var2.g = 0.0f;
        jd0Var2.e = System.currentTimeMillis();
        jd0Var2.c.invalidate();
    }
}
