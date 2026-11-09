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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        yw ywVar;
        org.telegram.ui.ActionBar.v2 v2Var;
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
                g4Var.h0.k(false);
                org.telegram.messenger.g0.v1(g4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.hc(k3Var.f, null).k(false).k(true);
                break;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                ci.b bVar = ((m7) obj2).d;
                long j3 = bVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.g);
                y6Var.presentFragment(new cn(bundle));
                d7Var.f.F.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.sh0 sh0Var = (org.telegram.ui.Components.sh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (sh0Var == null || sh0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                cn cnVar = (cn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (cnVar.getParentActivity() != null) {
                    if (cnVar.c1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        cnVar.Z.Z(keyboardInlineButton, ijVar, ijVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((cn) obj3).Wa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                cn.k0((cn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                cn.g1((cn) obj3, (uj) obj2, (boolean[]) obj);
                break;
            case 7:
                nm nmVar = (nm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.f2 f2Var = nmVar.a;
                f2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.w != null) {
                    f2Var.getNotificationCenter().k(org.telegram.messenger.qs.f3, Long.valueOf(q1Var.w.e));
                }
                f2Var.getMessagesController().n(chat.id, f2Var.getUserConfig().f(), null, f2Var, new yl(nmVar, chat, 3));
                break;
            case 8:
                rn rnVar = (rn) obj3;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                Integer num = (Integer) view.getTag();
                h6VarArr[0].a(num.intValue() == 0);
                h6VarArr[1].a(num.intValue() == 1);
                rnVar.J0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
                rnVar.u0(true, true);
                break;
            case 9:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
                PhotoViewer photoViewer = ((uq) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                ArrayList arrayList = ((org.telegram.ui.Components.q51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.s51 s51Var = (org.telegram.ui.Components.s51) obj4;
                            if (s51Var.b()) {
                                document = s51Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.s51 s51Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.s51 s51Var3 = (org.telegram.ui.Components.s51) arrayList.get(i12);
                                if (s51Var3.k < j10 && org.telegram.ui.Components.u51.D0(s51Var3.m)) {
                                    j10 = s51Var3.k;
                                    s51Var2 = s51Var3;
                                }
                            }
                            document = s51Var2 != null ? s51Var2.g : ((org.telegram.ui.Components.s51) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.T);
                    File J = org.telegram.messenger.w7.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.T);
                        J = org.telegram.messenger.w7.J(document, null, true, true);
                    }
                    int i13 = 2;
                    if (J == null || !J.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        ijVar2.d3 = document;
                        arrayList2.add(ijVar2);
                        MediaController.g0(photoViewer.D, org.telegram.messenger.c.a(photoViewer.T), arrayList2, new na(photoViewer, i13));
                    } else {
                        MediaController.d0(J.toString(), photoViewer.D, 1, null, null, new ln0(photoViewer, i13));
                    }
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 10:
                pr prVar = (pr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.v4.L((Context) obj2, org.telegram.messenger.id.M0(2131746086, null), org.telegram.messenger.id.a0(null, null, 2131746087, user.first_name), org.telegram.messenger.id.M0(2131746118, null), new hr(prVar, user, i10), prVar.r).p();
                break;
            case 11:
                le0 le0Var = (le0) obj3;
                ((org.telegram.ui.Components.l60) obj2).u();
                int i14 = ((org.telegram.messenger.vo) obj).a;
                if (le0Var.c.getCurrentPosition() != 0 || (ywVar = le0Var.J) == null) {
                    if (le0Var.J == null) {
                        le0Var.r0(null);
                    }
                    le0Var.I = Integer.valueOf(i14);
                    le0Var.s0(0, true);
                    le0Var.c.E(0);
                    break;
                } else {
                    ywVar.I4(i14);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2VarArr[0];
                if (v2Var2 != null) {
                    v2Var2.dismiss();
                    v2VarArr[0] = null;
                    c20Var.a(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.v2[] v2VarArr2 = (org.telegram.ui.ActionBar.v2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((fi.d) obj3).Q && (v2Var = v2VarArr2[0]) != null) {
                    v2Var.dismiss();
                    v2VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.l5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                m10.remove(((org.telegram.messenger.qv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                saveToGallerySettingsActivity.e0();
                break;
        }
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.messenger.c20 c20Var, String str) {
        this.a = 12;
        this.b = v2VarArr;
        this.d = c20Var;
        this.c = str;
    }
}
