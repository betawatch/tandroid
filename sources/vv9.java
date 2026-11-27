// default package

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv9 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ vv9(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override // r69
    public final void e(int i, View view) {
        w49 w49Var;
        TLRPC.Document document;
        byte b = this.a;
        int i2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                aw9 aw9Var = (aw9) frameLayout;
                e eVar = aw9Var.H;
                ox0 ox0Var = aw9Var.c;
                r47 E = ox0Var.E(i);
                if (E != null) {
                    if (!aw9Var.J.u()) {
                        if (view instanceof xv9) {
                            zea zeaVar = ((xv9) view).a;
                            r47 message = zeaVar.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (zeaVar.H) {
                                if (message.g4() || r47.Q4(message.k)) {
                                    MediaController.z().V(message);
                                    break;
                                } else {
                                    boolean x = message.x();
                                    if (!x) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z = message2 != null && message2.noforwards;
                                        TLRPC.Chat M0 = E.k.peer_id.channel_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(E.k.peer_id.channel_id)) : null;
                                        if (M0 == null) {
                                            M0 = E.k.peer_id.chat_id != 0 ? uc7.s1(yac.t0).M0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (M0 != null) {
                                            z = M0.noforwards;
                                        }
                                        x = x || z;
                                    }
                                    if (x) {
                                        PhotoViewer.q0().T1(null, eVar, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.q0().T1(null, eVar, null);
                                        PhotoViewer.q0().n1(arrayList, 0, 0L, 0L, 0L, new yc8());
                                        break;
                                    } else {
                                        hl.q2(message, aw9Var.G, eVar);
                                    }
                                }
                            } else if (zeaVar.G) {
                                xb4.G(k5.a(yac.t0).a).f(F0);
                                zeaVar.f(true);
                            } else {
                                E.P = true;
                                xb4.G(k5.a(yac.t0).a).X(F0, E, 0, 0);
                                zeaVar.f(true);
                                lq3.q(i2).y();
                            }
                            aw9Var.d(true);
                        }
                        if (view instanceof vea) {
                            ((vea) view).a();
                            break;
                        }
                    } else {
                        aw9Var.J.h(E, view, 0);
                        qg4 qg4Var = aw9Var.K;
                        int e1 = E.e1();
                        qg4Var.a = r47.B0(E.k);
                        qg4Var.b = e1;
                        ox0Var.g(i);
                        if (!aw9Var.J.u()) {
                            ox0Var.l(0, ((aw9) ox0Var.d).r);
                            break;
                        }
                    }
                }
                break;
            default:
                n1a n1aVar = (n1a) frameLayout;
                try {
                    if (!(view instanceof w0a)) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof r0a)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                n1aVar.h(i, (r0a) view);
                                if (i2 != 1 && i2 != 11) {
                                    n1aVar.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            n1aVar.n(view, null);
                            if (i2 != 1 && i2 != 11) {
                                n1aVar.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        w0a w0aVar = (w0a) view;
                        if (w0aVar.s || (((w49Var = w0aVar.y) != null && w49Var.a) || i2 == 13 || i2 == 14)) {
                            n1aVar.k();
                            n1aVar.q(w0aVar, w0aVar.y);
                        } else if (!w0aVar.R || (document = w0aVar.d) == null) {
                            n1aVar.n(w0aVar, w0aVar.e);
                        } else if (n1aVar.a0 == 6) {
                            n1aVar.o(w0aVar, Long.valueOf(document.id), document, w0aVar.w, null);
                        } else {
                            n1aVar.o(w0aVar, null, document, w0aVar.w, null);
                        }
                        if (i2 != 1 && i2 != 11) {
                            n1aVar.performHapticFeedback(3, 1);
                        }
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
