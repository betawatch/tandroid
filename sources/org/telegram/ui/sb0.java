package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb0 b;

    public /* synthetic */ sb0(vb0 vb0Var, int i3) {
        this.a = i3;
        this.b = vb0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final vb0 vb0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ub0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var2 = vb0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                vb0Var2.getClass();
                                if (tL_error2 == null) {
                                    vb0Var2.n = (TL_account.Password) tLObject2;
                                    vb0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                xd0 xd0Var = vb0Var2.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                                            ty0Var.a |= 256;
                                            ty0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            ty0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(i12, vb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                xd0 xd0Var2 = vb0Var2.E;
                                vb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new sb0(vb0Var2, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    xd0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (xd0Var2.getParentActivity() != null) {
                                        vb0Var2.a.setText("");
                                        xd0.b1(xd0Var2, vb0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    xd0Var2.E1(false, true);
                                    vb0Var2.postDelayed(new tb0(i12, vb0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final vb0 vb0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ub0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var22 = vb0Var2;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                vb0Var22.getClass();
                                if (tL_error2 == null) {
                                    vb0Var22.n = (TL_account.Password) tLObject2;
                                    vb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                xd0 xd0Var = vb0Var22.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                                            ty0Var.a |= 256;
                                            ty0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            ty0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(i12, vb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                xd0 xd0Var2 = vb0Var22.E;
                                vb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new sb0(vb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    xd0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (xd0Var2.getParentActivity() != null) {
                                        vb0Var22.a.setText("");
                                        xd0.b1(xd0Var2, vb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    xd0Var2.E1(false, true);
                                    vb0Var22.postDelayed(new tb0(i12, vb0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final vb0 vb0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ub0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var22 = vb0Var3;
                        int i12 = 0;
                        switch (i112) {
                            case 0:
                                vb0Var22.getClass();
                                if (tL_error2 == null) {
                                    vb0Var22.n = (TL_account.Password) tLObject2;
                                    vb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                xd0 xd0Var = vb0Var22.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                                            ty0Var.a |= 256;
                                            ty0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            ty0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(i12, vb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                xd0 xd0Var2 = vb0Var22.E;
                                vb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new sb0(vb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    xd0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (xd0Var2.getParentActivity() != null) {
                                        vb0Var22.a.setText("");
                                        xd0.b1(xd0Var2, vb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    xd0Var2.E1(false, true);
                                    vb0Var22.postDelayed(new tb0(i12, vb0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
