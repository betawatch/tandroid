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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        cx cxVar;
        org.telegram.ui.ActionBar.x2 x2Var;
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
                new org.telegram.ui.Components.lc(k3Var.f, null).k(false).k(true);
                break;
            case 1:
                c7 c7Var = (c7) obj3;
                x6 x6Var = (x6) obj;
                Bundle bundle = new Bundle();
                ei.b bVar = ((l7) obj2).d;
                long j3 = bVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", bVar.g);
                x6Var.presentFragment(new bn(bundle));
                c7Var.f.G.dismiss();
                org.telegram.ui.ActionBar.h1 h1Var = c7Var.a;
                if (h1Var != null) {
                    h1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ei0 ei0Var = (org.telegram.ui.Components.ei0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (ei0Var == null || ei0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                bn bnVar = (bn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (bnVar.getParentActivity() != null) {
                    if (bnVar.d1.getVisibility() != 0 || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        bnVar.a0.p0(keyboardInlineButton, fjVar, fjVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((bn) obj3).Xa((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                bn.k0((bn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                bn.g1((bn) obj3, (tj) obj2, (boolean[]) obj);
                break;
            case 7:
                mm mmVar = (mm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                org.telegram.ui.ActionBar.h2 h2Var = mmVar.a;
                h2Var.finishPreviewFragment();
                chat.left = false;
                if (r1Var != null && r1Var.w != null) {
                    h2Var.getNotificationCenter().k(203, Long.valueOf(r1Var.w.e));
                }
                h2Var.getMessagesController().n(chat.id, h2Var.getUserConfig().f(), null, h2Var, new xl(mmVar, chat, 3));
                break;
            case 8:
                rn rnVar = (rn) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                hi.w4 w4Var = (hi.w4) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                rnVar.K0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
                rnVar.u0(true, true);
                break;
            case 9:
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj2;
                PhotoViewer photoViewer = ((vq) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                ArrayList arrayList = ((org.telegram.ui.Components.c61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.e61 e61Var = (org.telegram.ui.Components.e61) obj4;
                            if (e61Var.b()) {
                                document = e61Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.e61 e61Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.e61 e61Var3 = (org.telegram.ui.Components.e61) arrayList.get(i12);
                                if (e61Var3.k < j10 && org.telegram.ui.Components.f61.D0(e61Var3.m)) {
                                    j10 = e61Var3.k;
                                    e61Var2 = e61Var3;
                                }
                            }
                            document = e61Var2 != null ? e61Var2.g : ((org.telegram.ui.Components.e61) arrayList.get(0)).g;
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
                        fjVar2.f3 = document;
                        arrayList2.add(fjVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new na(photoViewer, i13));
                    } else {
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new on0(photoViewer, i13));
                    }
                    photoViewer.p0.V(null, null);
                    break;
                }
                break;
            case 10:
                qr qrVar = (qr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.b5.L((Context) obj2, org.telegram.messenger.gd.M0(2131745891, null), org.telegram.messenger.gd.a0(null, null, 2131745892, user.first_name), org.telegram.messenger.gd.M0(2131745923, null), new ir(qrVar, user, i10), qrVar.r).p();
                break;
            case 11:
                me0 me0Var = (me0) obj3;
                ((org.telegram.ui.Components.y60) obj2).v();
                int i14 = ((org.telegram.messenger.ro) obj).a;
                if (me0Var.c.getCurrentPosition() != 0 || (cxVar = me0Var.K) == null) {
                    if (me0Var.K == null) {
                        me0Var.r0(null);
                    }
                    me0Var.J = Integer.valueOf(i14);
                    me0Var.s0(0, true);
                    me0Var.c.A(0);
                    break;
                } else {
                    cxVar.Q4(i14);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj3;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2VarArr[0];
                if (x2Var2 != null) {
                    x2Var2.dismiss();
                    x2VarArr[0] = null;
                    x10Var.a(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.x2[] x2VarArr2 = (org.telegram.ui.ActionBar.x2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((hi.d) obj3).R && (x2Var = x2VarArr2[0]) != null) {
                    x2Var.dismiss();
                    x2VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.n5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.h1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                m10.remove(((org.telegram.messenger.kv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                saveToGallerySettingsActivity.e0();
                break;
        }
    }

    public /* synthetic */ y(org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.messenger.x10 x10Var, String str) {
        this.a = 12;
        this.b = x2VarArr;
        this.d = x10Var;
        this.c = str;
    }
}
