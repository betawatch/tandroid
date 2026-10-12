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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ ve(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final fo foVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                fo.l1(foVar, tLObject);
                                break;
                            case 1:
                                fo.V0(foVar, tLObject);
                                break;
                            case 2:
                                fo foVar2 = foVar;
                                TLObject tLObject2 = tLObject;
                                foVar2.o5 = 0;
                                if (tLObject2 == null && foVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar2.getParentActivity(), 0, foVar2.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar2.showDialog(alertDialog$Builder.a);
                                    sk skVar = foVar2.Y;
                                    if (skVar != null) {
                                        skVar.a1(null, null, false);
                                        foVar2.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fo foVar3 = foVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar3)) {
                                            org.telegram.ui.Components.zc.a0(foVar3).k(!foVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final fo foVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                fo.l1(foVar2, tLObject);
                                break;
                            case 1:
                                fo.V0(foVar2, tLObject);
                                break;
                            case 2:
                                fo foVar22 = foVar2;
                                TLObject tLObject2 = tLObject;
                                foVar22.o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.a1(null, null, false);
                                        foVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fo foVar3 = foVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar3)) {
                                            org.telegram.ui.Components.zc.a0(foVar3).k(!foVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 3;
                final fo foVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                fo.l1(foVar3, tLObject);
                                break;
                            case 1:
                                fo.V0(foVar3, tLObject);
                                break;
                            case 2:
                                fo foVar22 = foVar3;
                                TLObject tLObject2 = tLObject;
                                foVar22.o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.a1(null, null, false);
                                        foVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fo foVar32 = foVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar32)) {
                                            org.telegram.ui.Components.zc.a0(foVar32).k(!foVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 2;
                final fo foVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                fo.l1(foVar4, tLObject);
                                break;
                            case 1:
                                fo.V0(foVar4, tLObject);
                                break;
                            case 2:
                                fo foVar22 = foVar4;
                                TLObject tLObject2 = tLObject;
                                foVar22.o5 = 0;
                                if (tLObject2 == null && foVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar22.getParentActivity(), 0, foVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    foVar22.showDialog(alertDialog$Builder.a);
                                    sk skVar = foVar22.Y;
                                    if (skVar != null) {
                                        skVar.a1(null, null, false);
                                        foVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fo foVar32 = foVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.zc.a(foVar32)) {
                                            org.telegram.ui.Components.zc.a0(foVar32).k(!foVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                fo foVar5 = this.b;
                if (tL_error == null) {
                    foVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    foVar5.getClass();
                    break;
                }
            default:
                fo.e1(this.b, tLObject);
                break;
        }
    }
}
