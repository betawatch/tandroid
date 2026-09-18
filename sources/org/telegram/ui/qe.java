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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ qe(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final bo boVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bo.G0(boVar, tLObject);
                                break;
                            case 1:
                                bo.K0(boVar, tLObject);
                                break;
                            case 2:
                                bo boVar2 = boVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar2)) {
                                            org.telegram.ui.Components.vc.a0(boVar2).k(!boVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                bo boVar3 = boVar;
                                TLObject tLObject3 = tLObject;
                                boVar3.o5 = 0;
                                if (tLObject3 == null && boVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar3.getParentActivity(), 0, boVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar3.showDialog(alertDialog$Builder.a);
                                    nk nkVar = boVar3.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar3.e9(true);
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
                final bo boVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                bo.G0(boVar2, tLObject);
                                break;
                            case 1:
                                bo.K0(boVar2, tLObject);
                                break;
                            case 2:
                                bo boVar22 = boVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc.a0(boVar22).k(!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                bo boVar3 = boVar2;
                                TLObject tLObject3 = tLObject;
                                boVar3.o5 = 0;
                                if (tLObject3 == null && boVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar3.getParentActivity(), 0, boVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar3.showDialog(alertDialog$Builder.a);
                                    nk nkVar = boVar3.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar3.e9(true);
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
                final bo boVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                bo.G0(boVar3, tLObject);
                                break;
                            case 1:
                                bo.K0(boVar3, tLObject);
                                break;
                            case 2:
                                bo boVar22 = boVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc.a0(boVar22).k(!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                bo boVar32 = boVar3;
                                TLObject tLObject3 = tLObject;
                                boVar32.o5 = 0;
                                if (tLObject3 == null && boVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar32.getParentActivity(), 0, boVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar32.showDialog(alertDialog$Builder.a);
                                    nk nkVar = boVar32.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar32.e9(true);
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
                final bo boVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                bo.G0(boVar4, tLObject);
                                break;
                            case 1:
                                bo.K0(boVar4, tLObject);
                                break;
                            case 2:
                                bo boVar22 = boVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc.a0(boVar22).k(!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                bo boVar32 = boVar4;
                                TLObject tLObject3 = tLObject;
                                boVar32.o5 = 0;
                                if (tLObject3 == null && boVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar32.getParentActivity(), 0, boVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar32.showDialog(alertDialog$Builder.a);
                                    nk nkVar = boVar32.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                bo boVar5 = this.b;
                if (tL_error == null) {
                    boVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    boVar5.getClass();
                    break;
                }
            default:
                bo.Z0(this.b, tLObject);
                break;
        }
    }
}
