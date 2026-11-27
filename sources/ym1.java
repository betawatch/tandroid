// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ym1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ ym1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                final byte b3 = 2;
                hl.c3(new Runnable() { // from class: jl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b3) {
                            case 0:
                                zu1Var.o9(tLObject);
                                break;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zu1Var.u8(tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b4 = 1;
                hl.c3(new Runnable() { // from class: jl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b4) {
                            case 0:
                                zu1Var.o9(tLObject);
                                break;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zu1Var.u8(tLObject);
                                break;
                        }
                    }
                });
                break;
            case 2:
                if (tL_error == null) {
                    zu1Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    zu1Var.getClass();
                    break;
                }
            case 3:
                final byte b5 = 3;
                hl.c3(new Runnable() { // from class: jl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b5) {
                            case 0:
                                zu1Var.o9(tLObject);
                                break;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zu1Var.u8(tLObject);
                                break;
                        }
                    }
                });
                break;
            case 4:
                zu1Var.E8(tLObject);
                break;
            default:
                hl.c3(new Runnable() { // from class: jl1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z = false;
                        switch (b2) {
                            case 0:
                                zu1Var.o9(tLObject);
                                break;
                            case 1:
                                zu1 zu1Var2 = zu1Var;
                                TLObject tLObject2 = tLObject;
                                zu1Var2.G5 = 0;
                                if (tLObject2 == null && zu1Var2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var2.Ba, zu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = ob6.M0(2131751236, null);
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    zu1Var2.showDialog(alertDialog$Builder.a);
                                    nr1 nr1Var = zu1Var2.a0;
                                    if (nr1Var != null) {
                                        nr1Var.N1(null, null, false);
                                        zu1Var2.E7(true);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zu1 zu1Var3 = zu1Var;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (d31.a(zu1Var3)) {
                                            d31 b0 = d31.b0(zu1Var3);
                                            if (!zu1Var3.k8() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z = true;
                                            }
                                            b0.k(z).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zu1Var.u8(tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
