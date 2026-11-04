package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wy0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i3;
        int i10 = this.a;
        mm mmVar = null;
        int i11 = 1;
        boolean z10 = false;
        z10 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                secretMediaViewer.l0 = 0;
                secretMediaViewer.J0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                ai.c0 c0Var = secretMediaViewer.e;
                if (c0Var != null) {
                    c0Var.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    bz0 bz0Var = secretMediaViewer.n;
                    TLRPC.Message message2 = ziVar.k;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    bz0Var.e = false;
                    bz0Var.f = j10;
                    bz0Var.h = j11;
                    bz0Var.n.start();
                    bz0Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.p1 && org.telegram.messenger.hp.e1().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.m();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((j21) obj3).k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    o21 o21Var = sessionsActivity.a;
                    if (o21Var != null) {
                        o21Var.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((k21) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    o21 o21Var2 = sessionsActivity2.a;
                    if (o21Var2 != null) {
                        o21Var2.f();
                        break;
                    }
                }
                break;
            case 3:
                n21 n21Var = (n21) obj3;
                i9 i9Var = (i9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    n21Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new m21(z10 ? 1 : 0, n21Var, i9Var));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new l21(n21Var, i11));
                    i9Var.run();
                    return;
                }
            case 4:
                o71 o71Var = (o71) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                o71Var.y = 0;
                String str2 = o71Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        o71Var.f0(org.telegram.ui.ActionBar.k6.w6, org.telegram.messenger.bd.a0("SetUrlAvailable", null, 2131745518, str));
                        break;
                    } else {
                        o71Var.f0(org.telegram.ui.ActionBar.k6.p7, org.telegram.messenger.bd.M0(2131745516, null));
                        break;
                    }
                }
                break;
            case 5:
                o71.b0((o71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 6:
                w71 w71Var = (w71) obj3;
                wm wmVar = (wm) obj2;
                org.telegram.messenger.zi ziVar2 = w71Var.H;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (ziVar2 != null && (message = ziVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.zi.B0(message);
                    mmVar = new mm();
                    mmVar.a = ziVar2;
                    mmVar.b = -1;
                    mmVar.c = -1;
                    mmVar.g = true;
                    mmVar.d = i12;
                    mmVar.f();
                }
                wmVar.fc(ziVar2, mmVar);
                w71Var.c(false);
                break;
            case 7:
                d81 d81Var = (d81) obj3;
                ArrayList arrayList = d81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = d81Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                d81Var.d.f();
                if (d81Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new xy0(d81Var, 11));
                    d81Var.E.setDuration(100L);
                    d81Var.E.start();
                } else {
                    d81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(d81Var.J);
                if (d81Var.G.getVisibility() == 0) {
                    d81Var.G.animate().alpha(0.0f).setListener(new z71(d81Var, 2)).start();
                    break;
                }
                break;
            case 8:
                m91 m91Var = (m91) obj3;
                m91Var.s.d((ArrayList) obj, m91Var.a);
                ((Runnable) obj2).run();
                break;
            case 9:
                i91 i91Var = (i91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = i91Var.g0;
                if (str3.equals(i91Var.e0)) {
                    int i13 = i91Var.n0;
                    i91Var.s0 = false;
                    i91Var.o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message3 = messages_messages.messages.get(i14);
                            i3 = ((org.telegram.ui.ActionBar.d2) i91Var.w0).currentAccount;
                            org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(i3, message3, false, false);
                            ziVar3.L5(str3, true);
                            arrayList3.add(ziVar3);
                        }
                        i91Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        i91Var.p0 = z10;
                    } else {
                        i91Var.p0 = false;
                    }
                    if (i91Var.n0 == 0) {
                        i91Var.q0.e(i91Var.o0, true);
                    }
                    i91Var.r0.b(i13);
                    break;
                }
                break;
            default:
                cb1 cb1Var = (cb1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                kg.v1 v1Var = cb1Var.f;
                if (cb1Var.n) {
                    cb1Var.h = null;
                    cb1Var.d = arrayList4;
                    cb1Var.e = arrayList5;
                    v1Var.f(arrayList4, null);
                    if (cb1Var.n && !v1Var.e()) {
                        cb1Var.w.f.e(false, true);
                    }
                    cb1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wy0(m91 m91Var, ArrayList arrayList, Runnable runnable) {
        this.a = 8;
        this.b = m91Var;
        this.d = arrayList;
        this.c = runnable;
    }
}
