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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        ww wwVar;
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
                y6Var.presentFragment(new an(bundle));
                d7Var.f.F.dismiss();
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.a;
                if (g1Var != null) {
                    g1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.rh0 rh0Var = (org.telegram.ui.Components.rh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (rh0Var == null || rh0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                an anVar = (an) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (anVar.getParentActivity() != null) {
                    if (anVar.c1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        anVar.Z.Z(keyboardInlineButton, ijVar, ijVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((an) obj3).Ua((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                an.j0((an) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                an.Z0((an) obj3, (sj) obj2, (boolean[]) obj);
                break;
            case 7:
                lm lmVar = (lm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.f2 f2Var = lmVar.a;
                f2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.w != null) {
                    f2Var.getNotificationCenter().k(org.telegram.messenger.qs.f3, Long.valueOf(q1Var.w.e));
                }
                f2Var.getMessagesController().n(chat.id, f2Var.getUserConfig().f(), null, f2Var, new wl(lmVar, chat, 3));
                break;
            case 8:
                pn pnVar = (pn) obj3;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj2;
                h9.f1 f1Var = (h9.f1) obj;
                Integer num = (Integer) view.getTag();
                h6VarArr[0].a(num.intValue() == 0);
                h6VarArr[1].a(num.intValue() == 1);
                pnVar.J0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
                pnVar.u0(true, true);
                break;
            case 9:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
                PhotoViewer photoViewer = ((sq) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                ArrayList arrayList = ((org.telegram.ui.Components.p51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) obj4;
                            if (r51Var.b()) {
                                document = r51Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r51 r51Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.r51 r51Var3 = (org.telegram.ui.Components.r51) arrayList.get(i12);
                                if (r51Var3.k < j10 && org.telegram.ui.Components.t51.D0(r51Var3.m)) {
                                    j10 = r51Var3.k;
                                    r51Var2 = r51Var3;
                                }
                            }
                            document = r51Var2 != null ? r51Var2.g : ((org.telegram.ui.Components.r51) arrayList.get(0)).g;
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
                        MediaController.d0(J.toString(), photoViewer.D, 1, null, null, new jn0(photoViewer, i13));
                    }
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 10:
                nr nrVar = (nr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.v4.L((Context) obj2, org.telegram.messenger.hd.M0(2131746087, null), org.telegram.messenger.hd.a0(null, null, 2131746088, user.first_name), org.telegram.messenger.hd.M0(2131746119, null), new fr(nrVar, user, i10), nrVar.r).p();
                break;
            case 11:
                je0 je0Var = (je0) obj3;
                ((org.telegram.ui.Components.k60) obj2).u();
                int i14 = ((org.telegram.messenger.vo) obj).a;
                if (je0Var.c.getCurrentPosition() != 0 || (wwVar = je0Var.J) == null) {
                    if (je0Var.J == null) {
                        je0Var.r0(null);
                    }
                    je0Var.I = Integer.valueOf(i14);
                    je0Var.s0(0, true);
                    je0Var.c.E(0);
                    break;
                } else {
                    wwVar.I4(i14);
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
                ProfileActivity.d0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
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
