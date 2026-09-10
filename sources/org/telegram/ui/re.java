package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ re(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final eo eoVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                eo.G0(eoVar, tLObject);
                                break;
                            case 1:
                                eo.K0(eoVar, tLObject);
                                break;
                            case 2:
                                eo eoVar2 = eoVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar2)) {
                                            org.telegram.ui.Components.wc.a0(eoVar2).k(!eoVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                eo eoVar3 = eoVar;
                                TLObject tLObject3 = tLObject;
                                eoVar3.o5 = 0;
                                if (tLObject3 == null && eoVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar3.getParentActivity(), 0, eoVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar3.showDialog(alertDialog$Builder.a);
                                    ok okVar = eoVar3.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar3.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final eo eoVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                eo.G0(eoVar2, tLObject);
                                break;
                            case 1:
                                eo.K0(eoVar2, tLObject);
                                break;
                            case 2:
                                eo eoVar22 = eoVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc.a0(eoVar22).k(!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                eo eoVar3 = eoVar2;
                                TLObject tLObject3 = tLObject;
                                eoVar3.o5 = 0;
                                if (tLObject3 == null && eoVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar3.getParentActivity(), 0, eoVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar3.showDialog(alertDialog$Builder.a);
                                    ok okVar = eoVar3.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar3.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 2;
                final eo eoVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                eo.G0(eoVar3, tLObject);
                                break;
                            case 1:
                                eo.K0(eoVar3, tLObject);
                                break;
                            case 2:
                                eo eoVar22 = eoVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc.a0(eoVar22).k(!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                eo eoVar32 = eoVar3;
                                TLObject tLObject3 = tLObject;
                                eoVar32.o5 = 0;
                                if (tLObject3 == null && eoVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar32.getParentActivity(), 0, eoVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar32.showDialog(alertDialog$Builder.a);
                                    ok okVar = eoVar32.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 3;
                final eo eoVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                eo.G0(eoVar4, tLObject);
                                break;
                            case 1:
                                eo.K0(eoVar4, tLObject);
                                break;
                            case 2:
                                eo eoVar22 = eoVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(eoVar22)) {
                                            org.telegram.ui.Components.wc.a0(eoVar22).k(!eoVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                eo eoVar32 = eoVar4;
                                TLObject tLObject3 = tLObject;
                                eoVar32.o5 = 0;
                                if (tLObject3 == null && eoVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar32.getParentActivity(), 0, eoVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    eoVar32.showDialog(alertDialog$Builder.a);
                                    ok okVar = eoVar32.Y;
                                    if (okVar != null) {
                                        okVar.c1(null, null, false);
                                        eoVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                eo eoVar5 = this.b;
                if (tL_error == null) {
                    eoVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    eoVar5.getClass();
                    break;
                }
            default:
                eo.Z0(this.b, tLObject);
                break;
        }
    }
}
