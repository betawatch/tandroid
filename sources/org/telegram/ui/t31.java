package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t31(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        mn mnVar = null;
        int i12 = 1;
        boolean z10 = false;
        z10 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj3;
                Runnable runnable = (Runnable) obj2;
                MessageObject messageObject = (MessageObject) obj;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.K0 = null;
                if (runnable != null) {
                    runnable.run();
                }
                bh.p pVar = secretMediaViewer.e;
                if (pVar != null) {
                    pVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    y31 y31Var = secretMediaViewer.n;
                    TLRPC.Message message2 = messageObject.messageOwner;
                    long j10 = message2.destroyTimeMillis;
                    long j11 = message2.ttl;
                    y31Var.e = false;
                    y31Var.f = j10;
                    y31Var.h = j11;
                    y31Var.n.start();
                    y31Var.invalidate();
                    if (secretMediaViewer.h1) {
                        secretMediaViewer.e(true, true);
                        break;
                    } else if (secretMediaViewer.q1 && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.l();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((k71) obj3).j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.n0();
                    p71 p71Var = sessionsActivity.a;
                    if (p71Var != null) {
                        p71Var.l();
                    }
                    sessionsActivity.l0(true);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((l71) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.n0();
                    p71 p71Var2 = sessionsActivity2.a;
                    if (p71Var2 != null) {
                        p71Var2.l();
                        break;
                    }
                }
                break;
            case 3:
                o71 o71Var = (o71) obj3;
                p9 p9Var = (p9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    o71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new n71(z10 ? 1 : 0, o71Var, p9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new m71(o71Var, i12));
                    p9Var.run();
                    return;
                }
            case 4:
                ad1 ad1Var = (ad1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ad1Var.x = 0;
                String str2 = ad1Var.y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        ad1Var.b0(org.telegram.ui.ActionBar.y6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        ad1Var.b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 5:
                ad1.X((ad1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 6:
                kd1 kd1Var = (kd1) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject2 = kd1Var.G;
                int i13 = ((TLRPC.TodoItem) obj).id;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject2.getDialogId();
                    mnVar = new mn();
                    mnVar.a = messageObject2;
                    mnVar.b = -1;
                    mnVar.c = -1;
                    mnVar.g = true;
                    mnVar.d = i13;
                    mnVar.f();
                }
                wnVar.Sb(messageObject2, mnVar);
                kd1Var.c(false);
                break;
            case 7:
                rd1 rd1Var = (rd1) obj3;
                ArrayList arrayList = rd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = rd1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                rd1Var.d.l();
                if (rd1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rd1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new x11(rd1Var, 12));
                    rd1Var.y.setDuration(100L);
                    rd1Var.y.start();
                } else {
                    rd1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(rd1Var.I);
                if (rd1Var.F.getVisibility() == 0) {
                    rd1Var.F.animate().alpha(0.0f).setListener(new nd1(rd1Var, 2)).start();
                    break;
                }
                break;
            case 8:
                cf1 cf1Var = (cf1) obj3;
                cf1Var.s.deleteTopics(cf1Var.a, (ArrayList) obj);
                ((Runnable) obj2).run();
                break;
            case 9:
                ye1 ye1Var = (ye1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ye1Var.f0;
                if (str3.equals(ye1Var.d0)) {
                    int i14 = ye1Var.m0;
                    ye1Var.r0 = false;
                    ye1Var.n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                            TLRPC.Message message3 = messages_messages.messages.get(i15);
                            i10 = ((org.telegram.ui.ActionBar.r2) ye1Var.v0).currentAccount;
                            MessageObject messageObject3 = new MessageObject(i10, message3, false, false);
                            messageObject3.setQuery(str3);
                            arrayList3.add(messageObject3);
                        }
                        ye1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ye1Var.o0 = z10;
                    } else {
                        ye1Var.o0 = false;
                    }
                    if (ye1Var.m0 == 0) {
                        ye1Var.p0.e(ye1Var.n0, true);
                    }
                    ye1Var.q0.b(i14);
                    break;
                }
                break;
            default:
                sg1 sg1Var = (sg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ig.a2 a2Var = sg1Var.f;
                if (sg1Var.n) {
                    sg1Var.h = null;
                    sg1Var.d = arrayList4;
                    sg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (sg1Var.n && !a2Var.e()) {
                        sg1Var.v.f.e(false, true);
                    }
                    sg1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t31(cf1 cf1Var, ArrayList arrayList, Runnable runnable) {
        this.a = 8;
        this.b = cf1Var;
        this.d = arrayList;
        this.c = runnable;
    }
}
