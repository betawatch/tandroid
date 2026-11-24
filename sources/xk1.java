// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xk1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ xk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() { // from class: tl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b2) {
                            case 0:
                                mu1Var.b9(tLObject);
                                break;
                            case 1:
                                mu1Var.h8(tLObject);
                                break;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                gl.d3(new Runnable() { // from class: tl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b3) {
                            case 0:
                                mu1Var.b9(tLObject);
                                break;
                            case 1:
                                mu1Var.h8(tLObject);
                                break;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final byte b4 = 3;
                gl.d3(new Runnable() { // from class: tl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b4) {
                            case 0:
                                mu1Var.b9(tLObject);
                                break;
                            case 1:
                                mu1Var.h8(tLObject);
                                break;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final byte b5 = 2;
                gl.d3(new Runnable() { // from class: tl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b5) {
                            case 0:
                                mu1Var.b9(tLObject);
                                break;
                            case 1:
                                mu1Var.h8(tLObject);
                                break;
                            case 2:
                                mu1 mu1Var2 = mu1Var;
                                TLObject tLObject2 = tLObject;
                                mu1Var2.G5 = 0;
                                if (tLObject2 == null && mu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var2.Ba, mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = k96.M0(2131751259, null);
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    ar1 ar1Var = mu1Var2.a0;
                                    if (ar1Var != null) {
                                        ar1Var.D1(null, null, false);
                                        mu1Var2.u7(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mu1 mu1Var3 = mu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (u21.a(mu1Var3)) {
                                            u21 b0 = u21.b0(mu1Var3);
                                            if (!mu1Var3.Y7() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                if (tL_error == null) {
                    mu1Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    mu1Var.getClass();
                    break;
                }
            default:
                mu1Var.r8(tLObject);
                break;
        }
    }
}
