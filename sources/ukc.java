// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ukc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ykc b;

    public /* synthetic */ ukc(ykc ykcVar, byte b) {
        this.a = b;
        this.b = ykcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ykc ykcVar;
        byte b = this.a;
        ykc ykcVar2 = this.b;
        switch (b) {
            case 0:
                if (!ykcVar2.R && ykcVar2.W <= 0.0f && (ykcVar = ((glc) ykcVar2.a.e).K) != null) {
                    gm.B2(ykcVar);
                    break;
                }
                break;
            default:
                if (ykcVar2.f0 == 0) {
                    ykcVar2.f0 = -1;
                    ykcVar2.invalidate();
                    byte b2 = 3;
                    try {
                        ykcVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    glc glcVar = (glc) ykcVar2.a.e;
                    String trim = glcVar.n.trim();
                    if (!trim.isEmpty() && glcVar.c == 4) {
                        c cVar = glcVar.b;
                        blc blcVar = new blc(glcVar, b2);
                        ykc ykcVar3 = glcVar.K;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i = ChatActivityEnterView.z7;
                        ylb ylbVar = chatActivityEnterView.L4;
                        yv1 yv1Var = chatActivityEnterView.F3;
                        by1 by1Var = chatActivityEnterView.K0;
                        if (by1Var != null && by1Var.getWidth() > 0) {
                            j67 j67Var = chatActivityEnterView.M0;
                            if (j67Var != null) {
                                j67Var.f(false);
                            }
                            gm.r(chatActivityEnterView.e6);
                            wy1 wy1Var = new wy1(chatActivityEnterView, chatActivityEnterView.getContext(), ylbVar, ykcVar3);
                            chatActivityEnterView.M0 = wy1Var;
                            wy1Var.setOnDismissListener(new pw1(chatActivityEnterView, (byte) 0));
                            ry ryVar = ykcVar3 != null ? new ry(ykcVar3) : null;
                            boolean[] zArr = new boolean[1];
                            if (ryVar != null) {
                                j67 j67Var2 = chatActivityEnterView.M0;
                                yh4 yh4Var = new yh4();
                                yh4Var.c = zArr;
                                yh4Var.d = ryVar;
                                yh4Var.b = new float[4];
                                j67Var2.m0 = yh4Var;
                                j67Var2.n0 = ryVar;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = oc7.r1(chatActivityEnterView.R).x1(chatActivityEnterView.G3);
                            tL_message.from_id = oc7.r1(chatActivityEnterView.R).x1(z8c.h(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            k47.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(hs6.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            k47 k47Var = chatActivityEnterView.J3;
                            if (k47Var != null && !k47Var.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                k47 k47Var2 = chatActivityEnterView.K3;
                                if (k47Var2 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = k47Var2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            k47 k47Var3 = new k47(chatActivityEnterView.R, tL_message, false, false);
                            k47 k47Var4 = chatActivityEnterView.J3;
                            if (k47Var4 != null && !k47Var4.p) {
                                k47Var3.C = k47Var4;
                            }
                            k47Var3.B0 = true;
                            k47Var3.W2 = Boolean.TRUE;
                            k47Var3.D = 0;
                            k47Var3.n0(null);
                            k47Var3.w1 = true;
                            chatActivityEnterView.M0.r(td4.u(k47Var3));
                            qw1 qw1Var = new qw1(chatActivityEnterView, zArr, blcVar, trim, (byte) 0);
                            chatActivityEnterView.M0.s(by1Var, true, new k81(qw1Var, (byte) 11));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.a(yv1Var);
                                chatActivityEnterView.M0.p(chatActivityEnterView.W6);
                            }
                            bu5 G = bu5.G(chatActivityEnterView, ylbVar, by1Var);
                            boolean z = yv1Var != null && m9c.D(yv1Var.h());
                            if (yv1Var != null && yv1Var.M4()) {
                                G.b(R.drawable.msg_calendar2, jb6.M0(z ? 2131745248 : 2131745593, null), new uj1(chatActivityEnterView, qw1Var, (byte) 26), false);
                            }
                            if (!z && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.b(R.drawable.input_notify_off, jb6.M0(2131745317, null), new fo1(qw1Var, (byte) 11), false);
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
