package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v21(Object obj, Object obj2, Object obj3, int i7) {
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
        rm rmVar = null;
        boolean z10 = false;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((w21) obj3).k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    a31 a31Var = sessionsActivity.a;
                    if (a31Var != null) {
                        a31Var.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((x21) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    a31 a31Var2 = sessionsActivity2.a;
                    if (a31Var2 != null) {
                        a31Var2.f();
                        break;
                    }
                }
                break;
            case 2:
                z21 z21Var = (z21) obj3;
                k9 k9Var = (k9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    z21Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new e00(29, z21Var, k9Var));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.g3(new y21(z21Var, i11));
                    k9Var.run();
                    return;
                }
            case 3:
                a81 a81Var = (a81) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a81Var.y = 0;
                String str2 = a81Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745312, str));
                        break;
                    } else {
                        a81Var.f0(org.telegram.ui.ActionBar.m6.p7, org.telegram.messenger.hd.N0(2131745310, null));
                        break;
                    }
                }
                break;
            case 4:
                a81.b0((a81) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                i81 i81Var = (i81) obj3;
                bn bnVar = (bn) obj2;
                org.telegram.messenger.gj gjVar = i81Var.H;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (gjVar != null && (message = gjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.gj.B0(message);
                    rmVar = new rm();
                    rmVar.a = gjVar;
                    rmVar.b = -1;
                    rmVar.c = -1;
                    rmVar.g = true;
                    rmVar.d = i12;
                    rmVar.f();
                }
                bnVar.jc(gjVar, rmVar);
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
                    p81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new iz0(p81Var, 11));
                    p81Var.E.setDuration(100L);
                    p81Var.E.start();
                } else {
                    p81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(p81Var.J);
                if (p81Var.G.getVisibility() == 0) {
                    p81Var.G.animate().alpha(0.0f).setListener(new l81(p81Var, 2)).start();
                    break;
                }
                break;
            case 7:
                y91 y91Var = (y91) obj3;
                y91Var.s.d((ArrayList) obj2, y91Var.a);
                ((Runnable) obj).run();
                break;
            case 8:
                u91 u91Var = (u91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = u91Var.g0;
                if (str3.equals(u91Var.e0)) {
                    int i13 = u91Var.n0;
                    u91Var.s0 = false;
                    u91Var.o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i7 = ((org.telegram.ui.ActionBar.g2) u91Var.w0).currentAccount;
                            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i7, message2, false, false);
                            gjVar2.K5(str3, true);
                            arrayList3.add(gjVar2);
                        }
                        u91Var.J();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        u91Var.p0 = z10;
                    } else {
                        u91Var.p0 = false;
                    }
                    if (u91Var.n0 == 0) {
                        u91Var.q0.e(u91Var.o0, true);
                    }
                    u91Var.r0.b(i13);
                    break;
                }
                break;
            default:
                mb1 mb1Var = (mb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = mb1Var.f;
                if (mb1Var.n) {
                    mb1Var.h = null;
                    mb1Var.d = arrayList4;
                    mb1Var.e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (mb1Var.n && !z1Var.e()) {
                        mb1Var.w.f.e(false, true);
                    }
                    mb1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v21(a81 a81Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = a81Var;
        this.c = str;
        this.b = tL_error;
    }
}
