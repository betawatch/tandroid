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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        ay ayVar;
        org.telegram.ui.ActionBar.z2 z2Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                h4 h4Var = (h4) obj3;
                String str = (String) obj2;
                l3 l3Var = (l3) obj;
                h4Var.h0.k(false);
                org.telegram.messenger.i0.v1(h4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.i0.g(str);
                new org.telegram.ui.Components.cc(l3Var.f, null).k(false).k(true);
                break;
            case 1:
                d7 d7Var = (d7) obj3;
                y6 y6Var = (y6) obj;
                Bundle bundle = new Bundle();
                sh.a aVar = ((m7) obj2).d;
                long j10 = aVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.g);
                y6Var.presentFragment(new un(bundle));
                d7Var.f.F.dismiss();
                org.telegram.ui.ActionBar.k1 k1Var = d7Var.a;
                if (k1Var != null) {
                    k1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.vi0 vi0Var = (org.telegram.ui.Components.vi0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (vi0Var == null || vi0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                un unVar = (un) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                if (unVar.getParentActivity() != null) {
                    if (unVar.c1.getVisibility() != 0 || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        unVar.Z.Y(keyboardInlineButton, jjVar, jjVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((un) obj3).Ka((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                un.m0((un) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                un.Z0((un) obj3, (ok) obj2, (boolean[]) obj);
                break;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.k2 k2Var = fnVar.a;
                k2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.w != null) {
                    k2Var.getNotificationCenter().k(org.telegram.messenger.zs.f3, Long.valueOf(q1Var.w.e));
                }
                k2Var.getMessagesController().n(chat.id, k2Var.getUserConfig().f(), null, k2Var, new sm(fnVar, chat, i11));
                break;
            case 8:
                oo ooVar = (oo) obj3;
                org.telegram.ui.Cells.l6[] l6VarArr = (org.telegram.ui.Cells.l6[]) obj2;
                l2.f fVar = (l2.f) obj;
                Integer num = (Integer) view.getTag();
                l6VarArr[0].a(num.intValue() == 0);
                l6VarArr[1].a(num.intValue() == 1);
                ooVar.J0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
                ooVar.t0(true, true);
                break;
            case 9:
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj2;
                PhotoViewer photoViewer = ((tr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.r61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj4;
                            if (t61Var.b()) {
                                document = t61Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.t61 t61Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.t61 t61Var3 = (org.telegram.ui.Components.t61) arrayList.get(i14);
                                if (t61Var3.k < j11 && org.telegram.ui.Components.u61.D0(t61Var3.m)) {
                                    j11 = t61Var3.k;
                                    t61Var2 = t61Var3;
                                }
                            }
                            document = t61Var2 != null ? t61Var2.g : ((org.telegram.ui.Components.t61) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.b8.G(photoViewer.T);
                    File K = org.telegram.messenger.b8.K(document, null, false, true);
                    if (K == null || !K.exists()) {
                        org.telegram.messenger.b8.G(photoViewer.T);
                        K = org.telegram.messenger.b8.K(document, null, true, true);
                    }
                    if (K == null || !K.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        jjVar2.a3 = document;
                        arrayList2.add(jjVar2);
                        MediaController.g0(photoViewer.D, org.telegram.messenger.c.a(photoViewer.T), arrayList2, new ra(photoViewer, i11));
                    } else {
                        MediaController.d0(K.toString(), photoViewer.D, 1, null, null, new wo0(photoViewer, i12));
                    }
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 10:
                ns nsVar = (ns) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.s4.N((Context) obj2, org.telegram.messenger.cd.L0(2131746103, null), org.telegram.messenger.cd.a0(null, null, 2131746104, user.first_name), org.telegram.messenger.cd.L0(2131746135, null), new fs(nsVar, user, i12), nsVar.r).p();
                break;
            case 11:
                pf0 pf0Var = (pf0) obj3;
                ((org.telegram.ui.Components.z60) obj2).u();
                int i15 = ((org.telegram.messenger.ap) obj).a;
                if (pf0Var.c.getCurrentPosition() != 0 || (ayVar = pf0Var.J) == null) {
                    if (pf0Var.J == null) {
                        pf0Var.q0(null);
                    }
                    pf0Var.I = Integer.valueOf(i15);
                    pf0Var.r0(0, true);
                    pf0Var.c.E(0);
                    break;
                } else {
                    ayVar.H4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj3;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2VarArr[0];
                if (z2Var2 != null) {
                    z2Var2.dismiss();
                    z2VarArr[0] = null;
                    q20Var.a(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((vh.d) obj3).Q && (z2Var = z2VarArr2[0]) != null) {
                    z2Var.dismiss();
                    z2VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.c0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.u5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.k1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                m10.remove(((org.telegram.messenger.bw) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                saveToGallerySettingsActivity.d0();
                break;
        }
    }

    public /* synthetic */ x(org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.messenger.q20 q20Var, String str) {
        this.a = 12;
        this.b = z2VarArr;
        this.d = q20Var;
        this.c = str;
    }
}
