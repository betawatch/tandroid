package org.telegram.ui;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.iz0 iz0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) this.b;
                xpVar.a(!xpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.a.q).apply();
                break;
            case 1:
                ((x50) this.b).b.T0(19);
                break;
            case 2:
                l60 l60Var = ((j60) this.b).I;
                l60Var.X = null;
                l60Var.Z.b();
                l60Var.h.b();
                l60Var.k0();
                l60Var.r0();
                break;
            case 3:
                a70.a0(((y60) this.b).d, null);
                break;
            case 4:
                r70.V((r70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                while (i14 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                    i14++;
                }
                arrayList.clear();
                break;
            case 6:
                final ge0 ge0Var = (ge0) this.b;
                dg0 dg0Var = ge0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fe0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ge0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ge0 ge0Var2 = ge0Var;
                                dg0.n0(ge0Var2.y, ge0Var2.r, ge0Var2.s, ge0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fe0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ge0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ge0 ge0Var2 = ge0Var;
                                dg0.n0(ge0Var2.y, ge0Var2.r, ge0Var2.s, ge0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = dg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                oe0 oe0Var = (oe0) this.b;
                dg0 dg0Var2 = oe0Var.E;
                if (dg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new ut(oe0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    dg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                re0 re0Var = (re0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new qe0(re0Var), NotificationCenter.onActivityResultReceived);
                Context context = re0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                n6.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                com.google.android.gms.internal.clearcut.v0 a2 = w7.b9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new xu(23, re0Var, a2));
                break;
            case 9:
                final fh0 fh0Var = (fh0) this.b;
                ih0 ih0Var = fh0Var.K;
                if (fh0Var.n != null) {
                    View view2 = ih0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F((ViewGroup) view2, null, fh0Var);
                        if (fh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.ch0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final fh0 fh0Var2 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = fh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            fh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            fh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            fh0 fh0Var3 = fh0Var;
                                            try {
                                                if (fh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(fh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            fh0 fh0Var4 = fh0Var;
                                            ih0 ih0Var2 = fh0Var4.K;
                                            try {
                                                if (fh0Var4.n.link != null) {
                                                    Context context2 = fh0Var4.getContext();
                                                    String str2 = fh0Var4.n.link;
                                                    ih0Var2.showDialog(new eh0(fh0Var4, context2, str2, str2, ih0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            fh0 fh0Var5 = fh0Var;
                                            ih0 ih0Var3 = fh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fh0Var5.n;
                                            ab0 ab0Var = new ab0(1, ih0Var3.n);
                                            ab0Var.T = ih0Var3.s0;
                                            ab0Var.Y(tL_chatInviteExported2);
                                            ih0Var3.presentFragment(ab0Var);
                                            break;
                                        default:
                                            final fh0 fh0Var6 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            fh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            fh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.ch0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final fh0 fh0Var2 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = fh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            fh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            fh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            fh0 fh0Var3 = fh0Var;
                                            try {
                                                if (fh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(fh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            fh0 fh0Var4 = fh0Var;
                                            ih0 ih0Var2 = fh0Var4.K;
                                            try {
                                                if (fh0Var4.n.link != null) {
                                                    Context context2 = fh0Var4.getContext();
                                                    String str2 = fh0Var4.n.link;
                                                    ih0Var2.showDialog(new eh0(fh0Var4, context2, str2, str2, ih0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            fh0 fh0Var5 = fh0Var;
                                            ih0 ih0Var3 = fh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fh0Var5.n;
                                            ab0 ab0Var = new ab0(1, ih0Var3.n);
                                            ab0Var.T = ih0Var3.s0;
                                            ab0Var.Y(tL_chatInviteExported2);
                                            ih0Var3.presentFragment(ab0Var);
                                            break;
                                        default:
                                            final fh0 fh0Var6 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            fh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            fh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.ch0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final fh0 fh0Var2 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = fh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            fh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            fh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            fh0 fh0Var3 = fh0Var;
                                            try {
                                                if (fh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(fh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            fh0 fh0Var4 = fh0Var;
                                            ih0 ih0Var2 = fh0Var4.K;
                                            try {
                                                if (fh0Var4.n.link != null) {
                                                    Context context2 = fh0Var4.getContext();
                                                    String str2 = fh0Var4.n.link;
                                                    ih0Var2.showDialog(new eh0(fh0Var4, context2, str2, str2, ih0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            fh0 fh0Var5 = fh0Var;
                                            ih0 ih0Var3 = fh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fh0Var5.n;
                                            ab0 ab0Var = new ab0(1, ih0Var3.n);
                                            ab0Var.T = ih0Var3.s0;
                                            ab0Var.Y(tL_chatInviteExported2);
                                            ih0Var3.presentFragment(ab0Var);
                                            break;
                                        default:
                                            final fh0 fh0Var6 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            fh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            fh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.ch0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final fh0 fh0Var2 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = fh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            fh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            fh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            fh0 fh0Var3 = fh0Var;
                                            try {
                                                if (fh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(fh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            fh0 fh0Var4 = fh0Var;
                                            ih0 ih0Var2 = fh0Var4.K;
                                            try {
                                                if (fh0Var4.n.link != null) {
                                                    Context context2 = fh0Var4.getContext();
                                                    String str2 = fh0Var4.n.link;
                                                    ih0Var2.showDialog(new eh0(fh0Var4, context2, str2, str2, ih0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            fh0 fh0Var5 = fh0Var;
                                            ih0 ih0Var3 = fh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fh0Var5.n;
                                            ab0 ab0Var = new ab0(1, ih0Var3.n);
                                            ab0Var.T = ih0Var3.s0;
                                            ab0Var.Y(tL_chatInviteExported2);
                                            ih0Var3.presentFragment(ab0Var);
                                            break;
                                        default:
                                            final fh0 fh0Var6 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            fh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            fh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !fh0Var.n.permanent && ih0Var.p0);
                            F.m(ih0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.ch0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final fh0 fh0Var2 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = fh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            fh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            fh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            fh0 fh0Var3 = fh0Var;
                                            try {
                                                if (fh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(fh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            fh0 fh0Var4 = fh0Var;
                                            ih0 ih0Var2 = fh0Var4.K;
                                            try {
                                                if (fh0Var4.n.link != null) {
                                                    Context context2 = fh0Var4.getContext();
                                                    String str2 = fh0Var4.n.link;
                                                    ih0Var2.showDialog(new eh0(fh0Var4, context2, str2, str2, ih0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            fh0 fh0Var5 = fh0Var;
                                            ih0 ih0Var3 = fh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fh0Var5.n;
                                            ab0 ab0Var = new ab0(1, ih0Var3.n);
                                            ab0Var.T = ih0Var3.s0;
                                            ab0Var.Y(tL_chatInviteExported2);
                                            ih0Var3.presentFragment(ab0Var);
                                            break;
                                        default:
                                            final fh0 fh0Var6 = fh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.dh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            fh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            fh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.e.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(ih0Var.b.V0(fh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                ui0 ui0Var = (ui0) this.b;
                long j10 = ui0Var.b;
                if (!ui0Var.n.isStory()) {
                    if (ui0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ui0Var.getParentLayout().getFragmentStack().get(ui0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof qn) && ((qn) n2Var).e.id == j10) {
                            ui0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle b11 = zf.d0.b(j10, "chat_id");
                    b11.putInt("message_id", ui0Var.c);
                    b11.putBoolean("need_remove_previous_same_chat_activity", false);
                    ui0Var.presentFragment(new qn(b11));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.v8) this.b).setChecked(!r15.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.f5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i16 = passcodeActivity.x;
                if (i16 != 1) {
                    if (i16 == 2) {
                        passcodeActivity.j0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    passcodeActivity.k0();
                    break;
                }
                break;
            case 14:
                cl0 cl0Var = (cl0) this.b;
                if (!cl0Var.a.getAnimatedDrawable().k0) {
                    cl0Var.a.getAnimatedDrawable().N(0, false, false);
                    cl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                rm0 rm0Var = (rm0) this.b;
                if (!rm0Var.J) {
                    int i17 = rm0Var.M;
                    if ((i17 != 4 || rm0Var.L != 2) && i17 != 0) {
                        rm0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + rm0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + rm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + rm0Var.K);
                            rm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.f5.t0(rm0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                sp0 sp0Var = (sp0) this.b;
                qn qnVar = sp0Var.F;
                if (qnVar != null && qnVar.c()) {
                    org.telegram.ui.Components.f5.K(sp0Var.getParentActivity(), qnVar.a(), new jp0(sp0Var, i14));
                    break;
                } else {
                    sp0Var.V(sp0Var.b, sp0Var.c, true, 0);
                    sp0Var.finishFragment();
                    break;
                }
            case 18:
                jq0 jq0Var = (jq0) this.b;
                qn qnVar2 = jq0Var.U;
                if (qnVar2 != null && qnVar2.c()) {
                    org.telegram.ui.Components.f5.K(jq0Var.getParentActivity(), qnVar2.a(), new wp0(jq0Var, i14));
                    break;
                } else {
                    jq0Var.e0(0, true);
                    break;
                }
                break;
            case 19:
                ut0 ut0Var = (ut0) this.b;
                if (ut0Var != null) {
                    ut0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                cu0 cu0Var = (cu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = cu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.p1.u(R);
                        if (R == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.C3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.o1());
                    boolean x10 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.N0.b(x10, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.p1.u(k10);
                        if (k10 == 0) {
                            photoViewer.p1.m(0);
                        }
                    }
                    photoViewer.C3();
                    break;
                }
                break;
            case 21:
                fv0 fv0Var = (fv0) this.b;
                boolean[] zArr = fv0Var.w;
                CharSequence[] charSequenceArr = fv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    s4.b1 G = fv0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - fv0Var.n0;
                        if (fv0Var.I && i18 < fv0Var.x) {
                            int i19 = -fv0Var.O;
                            fv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(c6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            fv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = fv0Var.y - 1;
                            fv0Var.y = i21;
                            if (fv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = fv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                fv0Var.r = iArr;
                            }
                            if (fv0Var.y == charSequenceArr.length - 1) {
                                fv0Var.b.o((fv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.b1 K = fv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    fv0Var.i0();
                                    fv0Var.r0();
                                    iz0Var = fv0Var.Q;
                                    if (iz0Var != null) {
                                        iz0Var.f();
                                        fv0Var.Q.setDelegate(null);
                                    }
                                    fv0Var.b.m(fv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                fv0Var.k0(true);
                            } else if (fv0Var.B0) {
                                fv0Var.k0(true);
                            }
                            textView.clearFocus();
                            fv0Var.i0();
                            fv0Var.r0();
                            iz0Var = fv0Var.Q;
                            if (iz0Var != null) {
                            }
                            fv0Var.b.m(fv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((qv0) this.b).c(true);
                break;
            case 23:
                ((qv0) ((ai.j5) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((cx0) this.b).d;
                privacyControlActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                int intValue = ((Integer) a2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                a2Var.c(z10, true);
                break;
            case 26:
                k11 k11Var = (k11) this.b;
                ProxyListActivity proxyListActivity = k11Var.s;
                SharedConfig.ProxyInfo proxyInfo = k11Var.d;
                s11 s11Var = new s11(null);
                s11Var.e = new org.telegram.ui.Cells.z6[3];
                s11Var.f = new org.telegram.ui.Cells.d9[2];
                s11Var.s = new org.telegram.ui.Cells.j6[3];
                s11Var.y = 1.0f;
                s11Var.E = new float[2];
                s11Var.F = true;
                s11Var.L = new l11(s11Var);
                s11Var.J = proxyInfo;
                proxyListActivity.presentFragment(s11Var);
                break;
            case 27:
                n21 n21Var = (n21) this.b;
                ei.d dVar = n21Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    o21.I(n21Var.v, ((TextView) n21Var.h.c).getText(), n21Var.d.option, n21Var.n.getText().toString());
                    break;
                }
                break;
            case 28:
                l21 l21Var = (l21) ((ai.o5) this.b).e;
                if (l21Var != null) {
                    l21Var.run();
                    break;
                }
                break;
            default:
                ((t21) this.b).dismiss();
                break;
        }
    }
}
