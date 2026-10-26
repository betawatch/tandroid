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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.tz0 tz0Var;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.b;
                zpVar.a(!zpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", zpVar.a.q).apply();
                break;
            case 1:
                ((c60) this.b).b.W0(19);
                break;
            case 2:
                r60 r60Var = ((p60) this.b).I;
                r60Var.X = null;
                r60Var.Z.b();
                r60Var.h.b();
                r60Var.l0();
                r60Var.s0();
                break;
            case 3:
                f70.b0(((d70) this.b).d, null);
                break;
            case 4:
                w70.W((w70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.u0(new LanguageSelectActivity());
                while (i13 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i13)).isShowing()) {
                        ((Dialog) arrayList.get(i13)).dismiss();
                    }
                    i13++;
                }
                arrayList.clear();
                break;
            case 6:
                db0 db0Var = (db0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(db0Var.getParentActivity());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ta0(db0Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                db0Var.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                final je0 je0Var = (je0) this.b;
                gg0 gg0Var = je0Var.y;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gg0Var.getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder2.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ie0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i14) {
                        switch (i13) {
                            case 0:
                                je0Var.y.z1(6, true, new Bundle(), true);
                                break;
                            default:
                                je0 je0Var2 = je0Var;
                                gg0.o0(je0Var2.y, je0Var2.r, je0Var2.s, je0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ie0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i14) {
                        switch (c10) {
                            case 0:
                                je0Var.y.z1(6, true, new Bundle(), true);
                                break;
                            default:
                                je0 je0Var2 = je0Var;
                                gg0.o0(je0Var2.y, je0Var2.r, je0Var2.s, je0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = gg0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 8:
                se0 se0Var = (se0) this.b;
                gg0 gg0Var2 = se0Var.G;
                if (gg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gg0Var2.getParentActivity());
                    alertDialog$Builder3.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder3.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder3.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new qt(se0Var, 20));
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    gg0Var2.showDialog(alertDialog$Builder3.a);
                    break;
                }
                break;
            case 9:
                ve0 ve0Var = (ve0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new ue0(ve0Var), NotificationCenter.onActivityResultReceived);
                Context context = ve0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                o6.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                a6.a a2 = a.a.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new org.telegram.ui.Components.voip.k1(29, ve0Var, a2));
                break;
            case 10:
                final gh0 gh0Var = (gh0) this.b;
                jh0 jh0Var = gh0Var.K;
                if (gh0Var.n != null) {
                    View view2 = jh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.k80 F = org.telegram.ui.Components.k80.F((ViewGroup) view2, null, gh0Var);
                        if (gh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.dh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final gh0 gh0Var2 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = gh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gh0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i14 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i15) {
                                                    switch (i14) {
                                                        case 0:
                                                            gh0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            gh0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            gh0 gh0Var3 = gh0Var;
                                            try {
                                                if (gh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", gh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(gh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            gh0 gh0Var4 = gh0Var;
                                            jh0 jh0Var2 = gh0Var4.K;
                                            try {
                                                if (gh0Var4.n.link != null) {
                                                    Context context2 = gh0Var4.getContext();
                                                    String str2 = gh0Var4.n.link;
                                                    jh0Var2.showDialog(new fh0(gh0Var4, context2, str2, str2, jh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            gh0 gh0Var5 = gh0Var;
                                            jh0 jh0Var3 = gh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gh0Var5.n;
                                            db0 db0Var2 = new db0(1, jh0Var3.n);
                                            db0Var2.S = jh0Var3.s0;
                                            db0Var2.Z(tL_chatInviteExported2);
                                            jh0Var3.presentFragment(db0Var2);
                                            break;
                                        default:
                                            final gh0 gh0Var6 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = gh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gh0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            gh0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            gh0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i14 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i14, string2, new Runnable() { // from class: org.telegram.ui.dh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final gh0 gh0Var2 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = gh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gh0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            gh0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            gh0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            gh0 gh0Var3 = gh0Var;
                                            try {
                                                if (gh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", gh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(gh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            gh0 gh0Var4 = gh0Var;
                                            jh0 jh0Var2 = gh0Var4.K;
                                            try {
                                                if (gh0Var4.n.link != null) {
                                                    Context context2 = gh0Var4.getContext();
                                                    String str2 = gh0Var4.n.link;
                                                    jh0Var2.showDialog(new fh0(gh0Var4, context2, str2, str2, jh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            gh0 gh0Var5 = gh0Var;
                                            jh0 jh0Var3 = gh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gh0Var5.n;
                                            db0 db0Var2 = new db0(1, jh0Var3.n);
                                            db0Var2.S = jh0Var3.s0;
                                            db0Var2.Z(tL_chatInviteExported2);
                                            jh0Var3.presentFragment(db0Var2);
                                            break;
                                        default:
                                            final gh0 gh0Var6 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = gh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gh0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            gh0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            gh0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.dh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final gh0 gh0Var2 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = gh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gh0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            gh0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            gh0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            gh0 gh0Var3 = gh0Var;
                                            try {
                                                if (gh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", gh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(gh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            gh0 gh0Var4 = gh0Var;
                                            jh0 jh0Var2 = gh0Var4.K;
                                            try {
                                                if (gh0Var4.n.link != null) {
                                                    Context context2 = gh0Var4.getContext();
                                                    String str2 = gh0Var4.n.link;
                                                    jh0Var2.showDialog(new fh0(gh0Var4, context2, str2, str2, jh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            gh0 gh0Var5 = gh0Var;
                                            jh0 jh0Var3 = gh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gh0Var5.n;
                                            db0 db0Var2 = new db0(1, jh0Var3.n);
                                            db0Var2.S = jh0Var3.s0;
                                            db0Var2.Z(tL_chatInviteExported2);
                                            jh0Var3.presentFragment(db0Var2);
                                            break;
                                        default:
                                            final gh0 gh0Var6 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = gh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gh0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            gh0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            gh0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.dh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final gh0 gh0Var2 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = gh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gh0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            gh0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            gh0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            gh0 gh0Var3 = gh0Var;
                                            try {
                                                if (gh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", gh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(gh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            gh0 gh0Var4 = gh0Var;
                                            jh0 jh0Var2 = gh0Var4.K;
                                            try {
                                                if (gh0Var4.n.link != null) {
                                                    Context context2 = gh0Var4.getContext();
                                                    String str2 = gh0Var4.n.link;
                                                    jh0Var2.showDialog(new fh0(gh0Var4, context2, str2, str2, jh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            gh0 gh0Var5 = gh0Var;
                                            jh0 jh0Var3 = gh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gh0Var5.n;
                                            db0 db0Var2 = new db0(1, jh0Var3.n);
                                            db0Var2.S = jh0Var3.s0;
                                            db0Var2.Z(tL_chatInviteExported2);
                                            jh0Var3.presentFragment(db0Var2);
                                            break;
                                        default:
                                            final gh0 gh0Var6 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = gh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gh0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            gh0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            gh0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, !gh0Var.n.permanent && jh0Var.p0);
                            F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.dh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final gh0 gh0Var2 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = gh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gh0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            gh0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            gh0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            gh0 gh0Var3 = gh0Var;
                                            try {
                                                if (gh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", gh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(gh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            gh0 gh0Var4 = gh0Var;
                                            jh0 jh0Var2 = gh0Var4.K;
                                            try {
                                                if (gh0Var4.n.link != null) {
                                                    Context context2 = gh0Var4.getContext();
                                                    String str2 = gh0Var4.n.link;
                                                    jh0Var2.showDialog(new fh0(gh0Var4, context2, str2, str2, jh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            gh0 gh0Var5 = gh0Var;
                                            jh0 jh0Var3 = gh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gh0Var5.n;
                                            db0 db0Var2 = new db0(1, jh0Var3.n);
                                            db0Var2.S = jh0Var3.s0;
                                            db0Var2.Z(tL_chatInviteExported2);
                                            jh0Var3.presentFragment(db0Var2);
                                            break;
                                        default:
                                            final gh0 gh0Var6 = gh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = gh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(gh0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.eh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            gh0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            gh0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.RevokeLink), jh0Var.p0, true);
                        }
                        F.W(jh0Var.b.V0(gh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 11:
                vi0 vi0Var = (vi0) this.b;
                long j10 = vi0Var.b;
                if (!vi0Var.n.isStory()) {
                    if (vi0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) vi0Var.getParentLayout().getFragmentStack().get(vi0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((r2Var instanceof un) && ((un) r2Var).e.id == j10) {
                            vi0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle h = a1.g.h(j10, "chat_id");
                    h.putInt("message_id", vi0Var.c);
                    h.putBoolean("need_remove_previous_same_chat_activity", false);
                    vi0Var.presentFragment(new un(h));
                    break;
                }
                break;
            case 12:
                xj0.V((xj0) this.b);
                break;
            case 13:
                ((org.telegram.ui.Cells.a9) this.b).setChecked(!r15.e.h);
                break;
            case 14:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder4.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder4.a.show();
                break;
            case 15:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i15 = passcodeActivity.x;
                if (i15 != 1) {
                    if (i15 == 2) {
                        passcodeActivity.q0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.q0();
                    break;
                } else {
                    passcodeActivity.r0();
                    break;
                }
                break;
            case 16:
                nl0 nl0Var = (nl0) this.b;
                if (!nl0Var.a.getAnimatedDrawable().k0) {
                    nl0Var.a.getAnimatedDrawable().N(0, false, false);
                    nl0Var.a.d();
                    break;
                }
                break;
            case 17:
                ((PasskeysActivity) this.b).a0(view);
                break;
            case 18:
                en0 en0Var = (en0) this.b;
                if (!en0Var.J) {
                    int i16 = en0Var.M;
                    if ((i16 != 4 || en0Var.L != 2) && i16 != 0) {
                        en0Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + en0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + en0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + en0Var.K);
                            en0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.g5.t0(en0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 19:
                aq0 aq0Var = (aq0) this.b;
                un unVar = aq0Var.F;
                if (unVar != null && unVar.c()) {
                    org.telegram.ui.Components.g5.K(aq0Var.getParentActivity(), unVar.a(), new sp0(aq0Var, i13));
                    break;
                } else {
                    aq0Var.W(aq0Var.b, aq0Var.c, true, 0);
                    aq0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                rq0 rq0Var = (rq0) this.b;
                un unVar2 = rq0Var.U;
                if (unVar2 != null && unVar2.c()) {
                    org.telegram.ui.Components.g5.K(rq0Var.getParentActivity(), unVar2.a(), new eq0(rq0Var, i13));
                    break;
                } else {
                    rq0Var.f0(0, true);
                    break;
                }
            case 21:
                bu0 bu0Var = (bu0) this.b;
                if (bu0Var != null) {
                    bu0Var.z(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 22:
                ju0 ju0Var = (ju0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = ju0Var.d;
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
                    boolean x9 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.N0.b(x9, true);
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
            case 23:
                mv0 mv0Var = (mv0) this.b;
                boolean[] zArr = mv0Var.w;
                CharSequence[] charSequenceArr = mv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view.getParent();
                    s4.e1 G = mv0Var.c.G(h6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i17 = b10 - mv0Var.n0;
                        if (mv0Var.I && i17 < mv0Var.x) {
                            int i18 = -mv0Var.O;
                            mv0Var.O = i18;
                            AndroidUtilities.shakeViewSpring(h6Var, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            mv0Var.b.u(b10);
                            int i19 = i17 + 1;
                            System.arraycopy(charSequenceArr, i19, charSequenceArr, i17, (charSequenceArr.length - 1) - i17);
                            System.arraycopy(zArr, i19, zArr, i17, (zArr.length - 1) - i17);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i20 = mv0Var.y - 1;
                            mv0Var.y = i20;
                            if (mv0Var.r != null) {
                                int[] iArr = new int[i20];
                                while (i13 < i20) {
                                    iArr[i13] = mv0Var.r[i13 >= i17 ? i13 + 1 : i13];
                                    i13++;
                                }
                                mv0Var.r = iArr;
                            }
                            if (mv0Var.y == charSequenceArr.length - 1) {
                                mv0Var.b.o((mv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.e1 K = mv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = h6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    mv0Var.j0();
                                    mv0Var.s0();
                                    tz0Var = mv0Var.Q;
                                    if (tz0Var != null) {
                                        tz0Var.f();
                                        mv0Var.Q.setDelegate(null);
                                    }
                                    mv0Var.b.m(mv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                mv0Var.l0(true);
                            } else if (mv0Var.B0) {
                                mv0Var.l0(true);
                            }
                            textView.clearFocus();
                            mv0Var.j0();
                            mv0Var.s0();
                            tz0Var = mv0Var.Q;
                            if (tz0Var != null) {
                            }
                            mv0Var.b.m(mv0Var.p0);
                        }
                    }
                }
                break;
            case 24:
                ((xv0) this.b).c(true);
                break;
            case 25:
                ((xv0) ((bi.e5) this.b).c).c(true);
                break;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((kx0) this.b).d;
                privacyControlActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) privacyControlActivity, 27, false));
                break;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int intValue = ((Integer) y1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                y1Var.c(z10, true);
                break;
            case 28:
                s11 s11Var = (s11) this.b;
                ProxyListActivity proxyListActivity = s11Var.s;
                SharedConfig.ProxyInfo proxyInfo = s11Var.d;
                b21 b21Var = new b21(null);
                b21Var.e = new org.telegram.ui.Cells.f7[3];
                b21Var.f = new org.telegram.ui.Cells.i9[2];
                b21Var.s = new org.telegram.ui.Cells.o6[3];
                b21Var.y = 1.0f;
                b21Var.E = new float[2];
                b21Var.F = true;
                b21Var.L = new t11(b21Var);
                b21Var.J = proxyInfo;
                proxyListActivity.presentFragment(b21Var);
                break;
            default:
                u21 u21Var = (u21) this.b;
                fi.d dVar = u21Var.s;
                if (dVar.c0 && !dVar.Q) {
                    dVar.setLoading(true);
                    v21.J(u21Var.v, ((TextView) u21Var.h.c).getText(), u21Var.d.option, u21Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
