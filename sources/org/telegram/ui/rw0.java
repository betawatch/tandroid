package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rw0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.xi0 xi0Var;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                yw0 yw0Var = (yw0) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yw0Var.d.addAll(arrayList);
                int i11 = yw0Var.f;
                org.telegram.messenger.qp.s1(i11).p2 = arrayList;
                org.telegram.messenger.qp.s1(i11).q2 = yw0Var.E;
                if (!yw0Var.x) {
                    yw0Var.f();
                    break;
                }
                break;
            case 1:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.f.add((ex0) obj);
                cx0Var.a();
                break;
            case 2:
                ry0 ry0Var = (ry0) ((View[]) obj2)[0];
                ry0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                ry0Var.c = null;
                ry0Var.d = null;
                ry0Var.f.f3.O(false);
                break;
            case 3:
                ((ry0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 4:
                ry0 ry0Var2 = (ry0) ((View[]) obj2)[0];
                ry0Var2.b = null;
                ry0Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                ry0Var2.d = null;
                ry0Var2.f.f3.O(false);
                break;
            case 5:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.gc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                break;
            case 6:
                org.telegram.ui.Components.gc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.r80) obj);
                break;
            case 7:
                ((SecretMediaViewer) obj2).K = false;
                ((zq0) obj).a.O0(false, true);
                break;
            case 8:
                ((SecretMediaViewer) ((j2.n) obj2).c).i((File) obj);
                break;
            case 9:
                t11 t11Var = (t11) obj2;
                t11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, t11Var.L0));
                Runnable runnable = t11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.gc.a0((o31) obj2).k(false).j();
                break;
            case 11:
                o31.b0((o31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new v31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                break;
            case 13:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                break;
            case 14:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    break;
                }
                break;
            case 15:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.m6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.m6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.m6.x), Double.valueOf(org.telegram.ui.ActionBar.m6.y));
                }
                org.telegram.ui.ActionBar.m6.w1();
                org.telegram.ui.Components.pj0 pj0Var = themeActivity2.b;
                if (pj0Var != null && (xi0Var = (org.telegram.ui.Components.xi0) pj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = xi0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.m6.w, false, false);
                        break;
                    }
                }
                break;
            case 16:
                x71 x71Var = (x71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (x71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    x71Var.B0.c(x71Var.L0[0]);
                    break;
                }
                break;
            case 17:
                a81.c0((a81) obj2, (String) obj);
                break;
            case 18:
                a81.a0((a81) obj2, (TLRPC.TL_theme) obj);
                break;
            case 19:
                i81 i81Var = (i81) obj2;
                i81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                i81Var.c(true);
                break;
            case 20:
                i81 i81Var2 = (i81) obj2;
                i81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                i81Var2.c(true);
                break;
            case 21:
                g91 g91Var = (g91) obj2;
                g91Var.getClass();
                Bundle bundle = new Bundle();
                z91 z91Var = g91Var.b;
                bundle.putLong("dialog_id", -z91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                z91Var.presentFragment(new lx0(bundle, null));
                break;
            case 22:
                v91 v91Var = (v91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = v91Var.e0;
                z91 z91Var2 = v91Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList4 = z91Var2.b;
                    if (i12 >= arrayList4.size()) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList3);
                        v91Var.N();
                        if (!arrayList2.isEmpty()) {
                            v91Var.n0 = false;
                            v91Var.q0.b(0);
                        }
                        v91Var.L(str2);
                        break;
                    } else {
                        if (((r91) arrayList4.get(i12)).c != null && ((r91) arrayList4.get(i12)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList3.add(((r91) arrayList4.get(i12)).c);
                            ((r91) arrayList4.get(i12)).c.searchQuery = lowerCase;
                        }
                        i12++;
                    }
                }
                break;
            case 23:
                ca1 ca1Var = ((ba1) obj2).b;
                ca1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ca1Var.a.a0();
                break;
            case 24:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 25:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 26:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 27:
                cb1.l0((cb1) obj2, (String) obj);
                break;
            case 28:
                Runnable runnable2 = (Runnable) obj;
                er[] erVarArr = ((cb1) obj2).x.f;
                int length = erVarArr.length;
                while (i10 < length) {
                    erVarArr[i10].C(0.0f);
                    i10++;
                }
                runnable2.run();
                break;
            default:
                hb1 hb1Var = (hb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = hb1Var.f;
                ArrayList arrayList6 = hb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(hb1Var.a).S3(arrayList6, false);
                hb1Var.d = false;
                hb1Var.c = true;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj3 = arrayList5.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList5.clear();
                break;
        }
    }
}
