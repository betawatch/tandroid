package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t21(Object obj, Object obj2, Object obj3, int i7) {
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
        qm qmVar = null;
        boolean z9 = false;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((u21) obj3).j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.a;
                    if (y21Var != null) {
                        y21Var.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((v21) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        break;
                    }
                }
                break;
            case 2:
                x21 x21Var = (x21) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    x21Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new h50(27, x21Var, j9Var));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new w21(x21Var, i11));
                    j9Var.run();
                    return;
                }
            case 3:
                x71 x71Var = (x71) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                x71Var.y = 0;
                String str2 = x71Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        x71Var.f0(org.telegram.ui.ActionBar.k6.w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745509, str));
                        break;
                    } else {
                        x71Var.f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.hd.M0(2131745507, null));
                        break;
                    }
                }
                break;
            case 4:
                x71.b0((x71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                f81 f81Var = (f81) obj3;
                an anVar = (an) obj2;
                org.telegram.messenger.ij ijVar = f81Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (ijVar != null && (message = ijVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.ij.B0(message);
                    qmVar = new qm();
                    qmVar.a = ijVar;
                    qmVar.b = -1;
                    qmVar.c = -1;
                    qmVar.g = true;
                    qmVar.d = i12;
                    qmVar.f();
                }
                anVar.fc(ijVar, qmVar);
                f81Var.c(false);
                break;
            case 6:
                m81 m81Var = (m81) obj3;
                ArrayList arrayList = m81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = m81Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                m81Var.d.f();
                if (m81Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m81Var.D = ofFloat;
                    ofFloat.addUpdateListener(new gz0(m81Var, 11));
                    m81Var.D.setDuration(100L);
                    m81Var.D.start();
                } else {
                    m81Var.E = 1.0f;
                }
                org.telegram.messenger.g0.r(m81Var.I);
                if (m81Var.F.getVisibility() == 0) {
                    m81Var.F.animate().alpha(0.0f).setListener(new i81(m81Var, 2)).start();
                    break;
                }
                break;
            case 7:
                v91 v91Var = (v91) obj3;
                v91Var.s.d((ArrayList) obj2, v91Var.a);
                ((Runnable) obj).run();
                break;
            case 8:
                r91 r91Var = (r91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = r91Var.f0;
                if (str3.equals(r91Var.d0)) {
                    int i13 = r91Var.m0;
                    r91Var.r0 = false;
                    r91Var.n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i7 = ((org.telegram.ui.ActionBar.f2) r91Var.v0).currentAccount;
                            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i7, message2, false, false);
                            ijVar2.L5(str3, true);
                            arrayList3.add(ijVar2);
                        }
                        r91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z9 = true;
                        }
                        r91Var.o0 = z9;
                    } else {
                        r91Var.o0 = false;
                    }
                    if (r91Var.m0 == 0) {
                        r91Var.p0.e(r91Var.n0, true);
                    }
                    r91Var.q0.b(i13);
                    break;
                }
                break;
            default:
                jb1 jb1Var = (jb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = jb1Var.f;
                if (jb1Var.n) {
                    jb1Var.h = null;
                    jb1Var.d = arrayList4;
                    jb1Var.e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (jb1Var.n && !z1Var.e()) {
                        jb1Var.w.f.e(false, true);
                    }
                    jb1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t21(x71 x71Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = x71Var;
        this.c = str;
        this.b = tL_error;
    }
}
