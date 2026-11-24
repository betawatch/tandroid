// default package

import android.app.Activity;
import android.graphics.Paint;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ vw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                wx0Var.q();
                break;
            case 1:
                if (!wx0Var.e0 && wx0Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = oc7.r1(wx0Var.I).n1(wx0Var.J);
                    tL_messages_prolongWebView.peer = oc7.r1(wx0Var.I).i1(wx0Var.K);
                    tL_messages_prolongWebView.query_id = wx0Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (wx0Var.M != 0) {
                        a6a.B(wx0Var.I);
                        int i = wx0Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (wx0Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = oc7.r1(wx0Var.I).i1(wx0Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (wx0Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = oc7.r1(wx0Var.I).i1(wx0Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(wx0Var.I).sendRequest(tL_messages_prolongWebView, new sw0(wx0Var, b2));
                    break;
                }
                break;
            case 2:
                wx0Var.I();
                break;
            case 3:
                wx0Var.x.requestLayout();
                break;
            case 4:
                if (!wx0Var.E.A()) {
                    wx0Var.v();
                    break;
                }
                break;
            case 5:
                wx0Var.z0 = true;
                wx0Var.m(true);
                break;
            case 6:
                wx0Var.w();
                break;
            case 7:
                nx0 nx0Var = wx0Var.x;
                float swipeOffsetY = nx0Var.getSwipeOffsetY();
                Paint paint = wx0Var.Q;
                if (swipeOffsetY > 0.0f) {
                    paint.setAlpha((int) ((1.0f - pqe.a(nx0Var.getSwipeOffsetY() / nx0Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                wx0Var.f.invalidate();
                wx0Var.E.l(false, false);
                if (wx0Var.d != null) {
                    float f = (1.0f - (Math.min(nx0Var.getTopActionBarOffsetY(), nx0Var.getTranslationY() - nx0Var.getTopActionBarOffsetY()) / nx0Var.getTopActionBarOffsetY()) > 0.5f ? 1 : 0) * 100.0f;
                    zna znaVar = wx0Var.d;
                    aoa aoaVar = znaVar.m;
                    if (((float) aoaVar.i) != f) {
                        aoaVar.i = f;
                        znaVar.h();
                    }
                }
                if (wx0Var.f0) {
                    int i2 = wx0Var.n.bottom;
                } else {
                    nx0Var.getSwipeOffsetY();
                }
                System.currentTimeMillis();
                break;
            case 8:
                wx0Var.E.l(true, false);
                break;
            case 9:
                Activity activity = wx0Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(yv1.ga(wx0Var.J));
                }
                wx0Var.m(true);
                break;
            case 10:
                ox0 ox0Var = wx0Var.E;
                ox0Var.getClass();
                ox0Var.Q = System.currentTimeMillis();
                ox0Var.v("settings_button_pressed", null);
                break;
            case 11:
                hs6.d0(wx0Var.I).z0(wx0Var.J, hs6.f2 ? 1 : 0, null);
                break;
            case 12:
                l11.u(wx0Var.getContext(), jb6.M0(2131752846, null));
                break;
            case 13:
                da9.E0(wx0Var.I, wx0Var.getContext(), new c41(n21.a(wx0Var.getContext()), wx0Var.G), wx0Var.J);
                break;
            case 14:
                wx0.l(wx0Var.I, wx0Var.J, new vw0(wx0Var, (byte) 15));
                break;
            case 15:
                wx0Var.m(false);
                break;
            default:
                wx0Var.m(false);
                break;
        }
    }
}
