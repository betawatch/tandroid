package xh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.qz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c01;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ q1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        m2 m2Var = this.b;
        switch (i10) {
            case 0:
                m2.f(m2Var);
                break;
            case 1:
                if (!m2Var.d0 && m2Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = vp.r1(m2Var.H).n1(m2Var.I);
                    tL_messages_prolongWebView.peer = vp.r1(m2Var.H).i1(m2Var.J);
                    tL_messages_prolongWebView.query_id = m2Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (m2Var.L != 0) {
                        qz.C(m2Var.H);
                        int i12 = m2Var.L;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i12;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (m2Var.M != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = vp.r1(m2Var.H).i1(m2Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (m2Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = vp.r1(m2Var.H).i1(m2Var.M);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(m2Var.H).sendRequest(tL_messages_prolongWebView, new x1(m2Var, i11));
                    break;
                }
                break;
            case 2:
                m2Var.I();
                break;
            case 3:
                m2Var.x.requestLayout();
                break;
            case 4:
                if (!m2Var.D.C()) {
                    m2Var.v();
                    break;
                }
                break;
            case 5:
                m2Var.y0 = true;
                m2Var.o(true);
                break;
            case 6:
                m2Var.w();
                break;
            case 7:
                Paint paint = m2Var.P;
                d2 d2Var = m2Var.x;
                if (d2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.u.a(d2Var.getSwipeOffsetY() / d2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                m2Var.f.invalidate();
                m2Var.D.n(false, false);
                if (m2Var.d != null) {
                    float f7 = (1.0f - (Math.min(d2Var.getTopActionBarOffsetY(), d2Var.getTranslationY() - d2Var.getTopActionBarOffsetY()) / d2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.j jVar = m2Var.d;
                    o1.k kVar = jVar.m;
                    if (((float) kVar.i) != f7) {
                        kVar.i = f7;
                        jVar.h();
                    }
                }
                if (m2Var.e0) {
                    int i13 = m2Var.n.bottom;
                } else {
                    Math.max(0.0f, d2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                m2Var.D.n(true, false);
                break;
            case 9:
                Activity activity = m2Var.l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(un.ha(m2Var.I));
                }
                m2Var.o(true);
                break;
            case 10:
                e2 e2Var = m2Var.D;
                e2Var.getClass();
                e2Var.P = System.currentTimeMillis();
                e2Var.x("settings_button_pressed", null);
                break;
            case 11:
                ui.b0(m2Var.H).y0(m2Var.I, ui.c2, null);
                break;
            case 12:
                gf.f.r(m2Var.getContext(), cd.L0(2131752893, null));
                break;
            case 13:
                int i14 = m2Var.H;
                Context context = m2Var.getContext();
                cc ccVar = new cc(ra.a(m2Var.getContext()), m2Var.F);
                long j10 = m2Var.I;
                int i15 = c01.s1;
                c01.J0(i14, context, j10, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
                break;
            case 14:
                m2.n(m2Var.H, m2Var.I, new q1(m2Var, 15));
                break;
            case 15:
                m2Var.o(false);
                break;
            default:
                m2Var.o(false);
                break;
        }
    }
}
