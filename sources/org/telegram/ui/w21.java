package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w21(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.a;
        sm smVar = null;
        boolean z9 = false;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((x21) obj3).j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    b31 b31Var = sessionsActivity.a;
                    if (b31Var != null) {
                        b31Var.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((y21) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    b31 b31Var2 = sessionsActivity2.a;
                    if (b31Var2 != null) {
                        b31Var2.f();
                        break;
                    }
                }
                break;
            case 2:
                a31 a31Var = (a31) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    a31Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new k50(27, a31Var, j9Var));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new z21(a31Var, i11));
                    j9Var.run();
                    return;
                }
            case 3:
                a81 a81Var = (a81) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a81Var.y = 0;
                String str2 = a81Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745508, str));
                        break;
                    } else {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.p7, org.telegram.messenger.id.M0(2131745506, null));
                        break;
                    }
                }
                break;
            case 4:
                a81.b0((a81) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                i81 i81Var = (i81) obj3;
                cn cnVar = (cn) obj2;
                org.telegram.messenger.ij ijVar = i81Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (ijVar != null && (message = ijVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.ij.B0(message);
                    smVar = new sm();
                    smVar.a = ijVar;
                    smVar.b = -1;
                    smVar.c = -1;
                    smVar.g = true;
                    smVar.d = i12;
                    smVar.f();
                }
                cnVar.ic(ijVar, smVar);
                i81Var.c(false);
                break;
            case 6:
                p81 p81Var = (p81) obj3;
                ArrayList arrayList = p81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = p81Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                p81Var.d.f();
                if (p81Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    p81Var.D = ofFloat;
                    ofFloat.addUpdateListener(new kz0(p81Var, 11));
                    p81Var.D.setDuration(100L);
                    p81Var.D.start();
                } else {
                    p81Var.E = 1.0f;
                }
                org.telegram.messenger.g0.r(p81Var.I);
                if (p81Var.F.getVisibility() == 0) {
                    p81Var.F.animate().alpha(0.0f).setListener(new l81(p81Var, 2)).start();
                    break;
                }
                break;
            case 7:
                z91 z91Var = (z91) obj3;
                z91Var.s.d((ArrayList) obj2, z91Var.a);
                ((Runnable) obj).run();
                break;
            case 8:
                v91 v91Var = (v91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = v91Var.f0;
                if (str3.equals(v91Var.d0)) {
                    int i13 = v91Var.m0;
                    v91Var.r0 = false;
                    v91Var.n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i7 = ((org.telegram.ui.ActionBar.f2) v91Var.v0).currentAccount;
                            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i7, message2, false, false);
                            ijVar2.K5(str3, true);
                            arrayList3.add(ijVar2);
                        }
                        v91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z9 = true;
                        }
                        v91Var.o0 = z9;
                    } else {
                        v91Var.o0 = false;
                    }
                    if (v91Var.m0 == 0) {
                        v91Var.p0.e(v91Var.n0, true);
                    }
                    v91Var.q0.b(i13);
                    break;
                }
                break;
            default:
                nb1 nb1Var = (nb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = nb1Var.f;
                if (nb1Var.n) {
                    nb1Var.h = null;
                    nb1Var.d = arrayList4;
                    nb1Var.e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (nb1Var.n && !z1Var.e()) {
                        nb1Var.w.f.e(false, true);
                    }
                    nb1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w21(a81 a81Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = a81Var;
        this.c = str;
        this.b = tL_error;
    }
}
