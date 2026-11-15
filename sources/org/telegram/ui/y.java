package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        yw ywVar;
        org.telegram.ui.ActionBar.u2 u2Var;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                g4 g4Var = (g4) obj3;
                String str = (String) obj2;
                k3 k3Var = (k3) obj;
                g4Var.i0.k(false);
                org.telegram.messenger.g0.v1(g4Var.i0.c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.cc(k3Var.f, null).k(false).k(true);
                break;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ei.b bVar = ((m7) obj2).d;
                long j3 = bVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.g);
                y6Var.presentFragment(new an(bundle));
                d7Var.f.G.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.vh0 vh0Var = (org.telegram.ui.Components.vh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (vh0Var == null || vh0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                an anVar = (an) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (anVar.getParentActivity() != null) {
                    if (anVar.d1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        anVar.a0.i0(keyboardInlineButton, gjVar, gjVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((an) obj3).Xa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                an.k0((an) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                an.g1((an) obj3, (sj) obj2, (boolean[]) obj);
                break;
            case 7:
                lm lmVar = (lm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.e2 e2Var = lmVar.a;
                e2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.w != null) {
                    e2Var.getNotificationCenter().k(org.telegram.messenger.ns.f3, Long.valueOf(q1Var.w.e));
                }
                e2Var.getMessagesController().n(chat.id, e2Var.getUserConfig().f(), null, e2Var, new wl(lmVar, chat, 3));
                break;
            case 8:
                qn qnVar = (qn) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) obj;
                Integer num = (Integer) view.getTag();
                g6VarArr[0].a(num.intValue() == 0);
                g6VarArr[1].a(num.intValue() == 1);
                qnVar.K0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
                qnVar.u0(true, true);
                break;
            case 9:
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
                PhotoViewer photoViewer = ((uq) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                ArrayList arrayList = ((org.telegram.ui.Components.r51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.t51 t51Var = (org.telegram.ui.Components.t51) obj4;
                            if (t51Var.b()) {
                                document = t51Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.t51 t51Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.t51 t51Var3 = (org.telegram.ui.Components.t51) arrayList.get(i12);
                                if (t51Var3.k < j10 && org.telegram.ui.Components.u51.D0(t51Var3.m)) {
                                    j10 = t51Var3.k;
                                    t51Var2 = t51Var3;
                                }
                            }
                            document = t51Var2 != null ? t51Var2.g : ((org.telegram.ui.Components.t51) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.U);
                    File J = org.telegram.messenger.w7.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.U);
                        J = org.telegram.messenger.w7.J(document, null, true, true);
                    }
                    int i13 = 2;
                    if (J == null || !J.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        gjVar2.f3 = document;
                        arrayList2.add(gjVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new na(photoViewer, i13));
                    } else {
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new ln0(photoViewer, i13));
                    }
                    photoViewer.p0.V(null, null);
                    break;
                }
                break;
            case 10:
                pr prVar = (pr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.t4.L((Context) obj2, org.telegram.messenger.hd.M0(2131746086, null), org.telegram.messenger.hd.a0(null, null, 2131746087, user.first_name), org.telegram.messenger.hd.M0(2131746118, null), new hr(prVar, user, i10), prVar.r).p();
                break;
            case 11:
                je0 je0Var = (je0) obj3;
                ((org.telegram.ui.Components.m60) obj2).u();
                int i14 = ((org.telegram.messenger.so) obj).a;
                if (je0Var.c.getCurrentPosition() != 0 || (ywVar = je0Var.K) == null) {
                    if (je0Var.K == null) {
                        je0Var.r0(null);
                    }
                    je0Var.J = Integer.valueOf(i14);
                    je0Var.s0(0, true);
                    je0Var.c.C(0);
                    break;
                } else {
                    ywVar.I4(i14);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj3;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2VarArr[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    u2VarArr[0] = null;
                    z10Var.a(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.u2[] u2VarArr2 = (org.telegram.ui.ActionBar.u2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((hi.d) obj3).R && (u2Var = u2VarArr2[0]) != null) {
                    u2Var.dismiss();
                    u2VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                m10.remove(((org.telegram.messenger.ov) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                saveToGallerySettingsActivity.e0();
                break;
        }
    }

    public /* synthetic */ y(org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.messenger.z10 z10Var, String str) {
        this.a = 12;
        this.b = u2VarArr;
        this.d = z10Var;
        this.c = str;
    }
}
