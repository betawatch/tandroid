// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uic implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yic b;

    public /* synthetic */ uic(yic yicVar, byte b) {
        this.a = b;
        this.b = yicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yic yicVar;
        byte b = this.a;
        yic yicVar2 = this.b;
        switch (b) {
            case 0:
                if (!yicVar2.R && yicVar2.W <= 0.0f && (yicVar = ((gjc) yicVar2.a.e).K) != null) {
                    gl.B2(yicVar);
                    break;
                }
                break;
            default:
                if (yicVar2.f0 == 0) {
                    yicVar2.f0 = -1;
                    yicVar2.invalidate();
                    byte b2 = 3;
                    try {
                        yicVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    gjc gjcVar = (gjc) yicVar2.a.e;
                    String trim = gjcVar.n.trim();
                    if (!trim.isEmpty() && gjcVar.c == 4) {
                        c cVar = gjcVar.b;
                        bjc bjcVar = new bjc(gjcVar, b2);
                        yic yicVar3 = gjcVar.K;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i = ChatActivityEnterView.r7;
                        wjb wjbVar = chatActivityEnterView.L4;
                        mu1 mu1Var = chatActivityEnterView.F3;
                        ow1 ow1Var = chatActivityEnterView.K0;
                        if (ow1Var != null && ow1Var.getWidth() > 0) {
                            j47 j47Var = chatActivityEnterView.M0;
                            if (j47Var != null) {
                                j47Var.f(false);
                            }
                            gl.r(chatActivityEnterView.e6);
                            ix1 ix1Var = new ix1(chatActivityEnterView, chatActivityEnterView.getContext(), wjbVar, yicVar3);
                            chatActivityEnterView.M0 = ix1Var;
                            ix1Var.setOnDismissListener(new dv1(chatActivityEnterView, (byte) 0));
                            qx qxVar = yicVar3 != null ? new qx(yicVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (qxVar != null) {
                                j47 j47Var2 = chatActivityEnterView.M0;
                                xf4 xf4Var = new xf4();
                                xf4Var.c = zArr;
                                xf4Var.d = qxVar;
                                xf4Var.b = new float[4];
                                j47Var2.m0 = xf4Var;
                                j47Var2.n0 = qxVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = na7.q1(chatActivityEnterView.R).w1(chatActivityEnterView.G3);
                            tL_message.from_id = na7.q1(chatActivityEnterView.R).w1(y6c.h(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            k27.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(hq6.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            k27 k27Var = chatActivityEnterView.J3;
                            if (k27Var != null && !k27Var.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                k27 k27Var2 = chatActivityEnterView.K3;
                                if (k27Var2 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = k27Var2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            k27 k27Var3 = new k27(chatActivityEnterView.R, tL_message, false, false);
                            k27 k27Var4 = chatActivityEnterView.J3;
                            if (k27Var4 != null && !k27Var4.p) {
                                k27Var3.C = k27Var4;
                            }
                            k27Var3.B0 = true;
                            k27Var3.W2 = Boolean.TRUE;
                            k27Var3.D = 0;
                            k27Var3.n0(null);
                            k27Var3.w1 = true;
                            chatActivityEnterView.M0.r(tb4.t(k27Var3));
                            ev1 ev1Var = new ev1(chatActivityEnterView, zArr, bjcVar, trim, (byte) 0);
                            chatActivityEnterView.M0.s(ow1Var, true, new x91(ev1Var, (byte) 8));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.a(mu1Var);
                                chatActivityEnterView.M0.p(chatActivityEnterView.O6);
                            }
                            cs5 G = cs5.G(chatActivityEnterView, wjbVar, ow1Var);
                            boolean z = mu1Var != null && l7c.C(mu1Var.h());
                            if (mu1Var != null && mu1Var.G4()) {
                                G.b(R.drawable.msg_calendar2, k96.M0(z ? 2131745322 : 2131745667, null), new aj1(chatActivityEnterView, ev1Var, (byte) 25), false);
                            }
                            if (!z && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.b(R.drawable.input_notify_off, k96.M0(2131745391, null), new hq1(ev1Var, (byte) 7), false);
                            }
                            G.Z();
                            chatActivityEnterView.M0.q(G);
                            chatActivityEnterView.M0.show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
