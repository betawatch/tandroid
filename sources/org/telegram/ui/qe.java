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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ qe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zn znVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zn.G0(znVar, tLObject);
                                break;
                            case 1:
                                zn.K0(znVar, tLObject);
                                break;
                            case 2:
                                zn znVar2 = znVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar2)) {
                                            org.telegram.ui.Components.qc.a0(znVar2).k(!znVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zn znVar3 = znVar;
                                TLObject tLObject3 = tLObject;
                                znVar3.l5 = 0;
                                if (tLObject3 == null && znVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar3.showDialog(alertDialog$Builder.a);
                                    lk lkVar = znVar3.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar3.e9(true);
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
                final zn znVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zn.G0(znVar2, tLObject);
                                break;
                            case 1:
                                zn.K0(znVar2, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc.a0(znVar22).k(!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zn znVar3 = znVar2;
                                TLObject tLObject3 = tLObject;
                                znVar3.l5 = 0;
                                if (tLObject3 == null && znVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar3.showDialog(alertDialog$Builder.a);
                                    lk lkVar = znVar3.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar3.e9(true);
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
                final zn znVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                zn.G0(znVar3, tLObject);
                                break;
                            case 1:
                                zn.K0(znVar3, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc.a0(znVar22).k(!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zn znVar32 = znVar3;
                                TLObject tLObject3 = tLObject;
                                znVar32.l5 = 0;
                                if (tLObject3 == null && znVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar32.getParentActivity(), 0, znVar32.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar32.showDialog(alertDialog$Builder.a);
                                    lk lkVar = znVar32.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar32.e9(true);
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
                final zn znVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                zn.G0(znVar4, tLObject);
                                break;
                            case 1:
                                zn.K0(znVar4, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc.a0(znVar22).k(!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                zn znVar32 = znVar4;
                                TLObject tLObject3 = tLObject;
                                znVar32.l5 = 0;
                                if (tLObject3 == null && znVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar32.getParentActivity(), 0, znVar32.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar32.showDialog(alertDialog$Builder.a);
                                    lk lkVar = znVar32.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                zn znVar5 = this.b;
                if (tL_error == null) {
                    znVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    znVar5.getClass();
                    break;
                }
            default:
                zn.Z0(this.b, tLObject);
                break;
        }
    }
}
