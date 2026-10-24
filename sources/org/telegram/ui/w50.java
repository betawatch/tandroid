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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w50(Object obj, int i10) {
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
        org.telegram.ui.Components.lz0 lz0Var;
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
                ((b60) this.b).b.V0(19);
                break;
            case 2:
                p60 p60Var = ((n60) this.b).I;
                p60Var.X = null;
                p60Var.Z.b();
                p60Var.h.b();
                p60Var.k0();
                p60Var.r0();
                break;
            case 3:
                e70.a0(((c70) this.b).d, null);
                break;
            case 4:
                x70.V((x70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.u0(new LanguageSelectActivity());
                while (i14 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                    i14++;
                }
                arrayList.clear();
                break;
            case 6:
                final me0 me0Var = (me0) this.b;
                ig0 ig0Var = me0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.le0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                        switch (i14) {
                            case 0:
                                me0Var.y.y1(6, true, new Bundle(), true);
                                break;
                            default:
                                me0 me0Var2 = me0Var;
                                ig0.n0(me0Var2.y, me0Var2.r, me0Var2.s, me0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.le0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                        switch (c10) {
                            case 0:
                                me0Var.y.y1(6, true, new Bundle(), true);
                                break;
                            default:
                                me0 me0Var2 = me0Var;
                                ig0.n0(me0Var2.y, me0Var2.r, me0Var2.s, me0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = ig0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                ve0 ve0Var = (ve0) this.b;
                ig0 ig0Var2 = ve0Var.G;
                if (ig0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new xt(ve0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ig0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                ye0 ye0Var = (ye0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new xe0(ye0Var), NotificationCenter.onActivityResultReceived);
                Context context = ye0Var.getContext();
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
                a2.g().addOnCompleteListener(new ks(25, ye0Var, a2));
                break;
            case 9:
                final jh0 jh0Var = (jh0) this.b;
                mh0 mh0Var = jh0Var.K;
                if (jh0Var.n != null) {
                    View view2 = mh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.j80 F = org.telegram.ui.Components.j80.F((ViewGroup) view2, null, jh0Var);
                        if (jh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.gh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final jh0 jh0Var2 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            jh0Var2.K.f0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            jh0Var2.K.c0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            jh0 jh0Var3 = jh0Var;
                                            try {
                                                if (jh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(jh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            jh0 jh0Var4 = jh0Var;
                                            mh0 mh0Var2 = jh0Var4.K;
                                            try {
                                                if (jh0Var4.n.link != null) {
                                                    Context context2 = jh0Var4.getContext();
                                                    String str2 = jh0Var4.n.link;
                                                    mh0Var2.showDialog(new ih0(jh0Var4, context2, str2, str2, mh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            jh0 jh0Var5 = jh0Var;
                                            mh0 mh0Var3 = jh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var5.n;
                                            gb0 gb0Var = new gb0(1, mh0Var3.n);
                                            gb0Var.T = mh0Var3.s0;
                                            gb0Var.Y(tL_chatInviteExported2);
                                            mh0Var3.presentFragment(gb0Var);
                                            break;
                                        default:
                                            final jh0 jh0Var6 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = jh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            jh0Var6.K.f0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            jh0Var6.K.c0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.gh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final jh0 jh0Var2 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            jh0Var2.K.f0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            jh0Var2.K.c0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            jh0 jh0Var3 = jh0Var;
                                            try {
                                                if (jh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(jh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            jh0 jh0Var4 = jh0Var;
                                            mh0 mh0Var2 = jh0Var4.K;
                                            try {
                                                if (jh0Var4.n.link != null) {
                                                    Context context2 = jh0Var4.getContext();
                                                    String str2 = jh0Var4.n.link;
                                                    mh0Var2.showDialog(new ih0(jh0Var4, context2, str2, str2, mh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            jh0 jh0Var5 = jh0Var;
                                            mh0 mh0Var3 = jh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var5.n;
                                            gb0 gb0Var = new gb0(1, mh0Var3.n);
                                            gb0Var.T = mh0Var3.s0;
                                            gb0Var.Y(tL_chatInviteExported2);
                                            mh0Var3.presentFragment(gb0Var);
                                            break;
                                        default:
                                            final jh0 jh0Var6 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = jh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            jh0Var6.K.f0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            jh0Var6.K.c0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.gh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final jh0 jh0Var2 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            jh0Var2.K.f0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            jh0Var2.K.c0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            jh0 jh0Var3 = jh0Var;
                                            try {
                                                if (jh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(jh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            jh0 jh0Var4 = jh0Var;
                                            mh0 mh0Var2 = jh0Var4.K;
                                            try {
                                                if (jh0Var4.n.link != null) {
                                                    Context context2 = jh0Var4.getContext();
                                                    String str2 = jh0Var4.n.link;
                                                    mh0Var2.showDialog(new ih0(jh0Var4, context2, str2, str2, mh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            jh0 jh0Var5 = jh0Var;
                                            mh0 mh0Var3 = jh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var5.n;
                                            gb0 gb0Var = new gb0(1, mh0Var3.n);
                                            gb0Var.T = mh0Var3.s0;
                                            gb0Var.Y(tL_chatInviteExported2);
                                            mh0Var3.presentFragment(gb0Var);
                                            break;
                                        default:
                                            final jh0 jh0Var6 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = jh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            jh0Var6.K.f0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            jh0Var6.K.c0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.gh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final jh0 jh0Var2 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            jh0Var2.K.f0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            jh0Var2.K.c0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            jh0 jh0Var3 = jh0Var;
                                            try {
                                                if (jh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(jh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            jh0 jh0Var4 = jh0Var;
                                            mh0 mh0Var2 = jh0Var4.K;
                                            try {
                                                if (jh0Var4.n.link != null) {
                                                    Context context2 = jh0Var4.getContext();
                                                    String str2 = jh0Var4.n.link;
                                                    mh0Var2.showDialog(new ih0(jh0Var4, context2, str2, str2, mh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            jh0 jh0Var5 = jh0Var;
                                            mh0 mh0Var3 = jh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var5.n;
                                            gb0 gb0Var = new gb0(1, mh0Var3.n);
                                            gb0Var.T = mh0Var3.s0;
                                            gb0Var.Y(tL_chatInviteExported2);
                                            mh0Var3.presentFragment(gb0Var);
                                            break;
                                        default:
                                            final jh0 jh0Var6 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = jh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            jh0Var6.K.f0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            jh0Var6.K.c0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !jh0Var.n.permanent && mh0Var.p0);
                            F.m(mh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.gh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final jh0 jh0Var2 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            jh0Var2.K.f0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            jh0Var2.K.c0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            jh0 jh0Var3 = jh0Var;
                                            try {
                                                if (jh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(jh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            jh0 jh0Var4 = jh0Var;
                                            mh0 mh0Var2 = jh0Var4.K;
                                            try {
                                                if (jh0Var4.n.link != null) {
                                                    Context context2 = jh0Var4.getContext();
                                                    String str2 = jh0Var4.n.link;
                                                    mh0Var2.showDialog(new ih0(jh0Var4, context2, str2, str2, mh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            jh0 jh0Var5 = jh0Var;
                                            mh0 mh0Var3 = jh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var5.n;
                                            gb0 gb0Var = new gb0(1, mh0Var3.n);
                                            gb0Var.T = mh0Var3.s0;
                                            gb0Var.Y(tL_chatInviteExported2);
                                            mh0Var3.presentFragment(gb0Var);
                                            break;
                                        default:
                                            final jh0 jh0Var6 = jh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = jh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.hh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            jh0Var6.K.f0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            jh0Var6.K.c0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(mh0Var.b.W0(jh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                yi0 yi0Var = (yi0) this.b;
                long j10 = yi0Var.b;
                if (!yi0Var.n.isStory()) {
                    if (yi0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) yi0Var.getParentLayout().getFragmentStack().get(yi0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((o2Var instanceof sn) && ((sn) o2Var).e.id == j10) {
                            yi0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = si.o0.e(j10, "chat_id");
                    e.putInt("message_id", yi0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    yi0Var.presentFragment(new sn(e));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.w8) this.b).setChecked(!r15.e.h);
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
                fl0 fl0Var = (fl0) this.b;
                if (!fl0Var.a.getAnimatedDrawable().k0) {
                    fl0Var.a.getAnimatedDrawable().N(0, false, false);
                    fl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                wm0 wm0Var = (wm0) this.b;
                if (!wm0Var.J) {
                    int i17 = wm0Var.M;
                    if ((i17 != 4 || wm0Var.L != 2) && i17 != 0) {
                        wm0Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + wm0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + wm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + wm0Var.K);
                            wm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.f5.u0(wm0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                vp0 vp0Var = (vp0) this.b;
                sn snVar = vp0Var.F;
                if (snVar != null && snVar.c()) {
                    org.telegram.ui.Components.f5.L(vp0Var.getParentActivity(), snVar.a(), new mp0(vp0Var, i14));
                    break;
                } else {
                    vp0Var.V(vp0Var.b, vp0Var.c, true, 0);
                    vp0Var.finishFragment();
                    break;
                }
            case 18:
                mq0 mq0Var = (mq0) this.b;
                sn snVar2 = mq0Var.U;
                if (snVar2 != null && snVar2.c()) {
                    org.telegram.ui.Components.f5.L(mq0Var.getParentActivity(), snVar2.a(), new zp0(mq0Var, i14));
                    break;
                } else {
                    mq0Var.e0(0, true);
                    break;
                }
                break;
            case 19:
                xt0 xt0Var = (xt0) this.b;
                if (xt0Var != null) {
                    xt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                fu0 fu0Var = (fu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = fu0Var.d;
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
                iv0 iv0Var = (iv0) this.b;
                boolean[] zArr = iv0Var.w;
                CharSequence[] charSequenceArr = iv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.b1 G = iv0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - iv0Var.n0;
                        if (iv0Var.I && i18 < iv0Var.x) {
                            int i19 = -iv0Var.O;
                            iv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            iv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = iv0Var.y - 1;
                            iv0Var.y = i21;
                            if (iv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = iv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                iv0Var.r = iArr;
                            }
                            if (iv0Var.y == charSequenceArr.length - 1) {
                                iv0Var.b.o((iv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.b1 K = iv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    iv0Var.i0();
                                    iv0Var.r0();
                                    lz0Var = iv0Var.Q;
                                    if (lz0Var != null) {
                                        lz0Var.f();
                                        iv0Var.Q.setDelegate(null);
                                    }
                                    iv0Var.b.m(iv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                iv0Var.k0(true);
                            } else if (iv0Var.B0) {
                                iv0Var.k0(true);
                            }
                            textView.clearFocus();
                            iv0Var.i0();
                            iv0Var.r0();
                            lz0Var = iv0Var.Q;
                            if (lz0Var != null) {
                            }
                            iv0Var.b.m(iv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((uv0) this.b).c(true);
                break;
            case 23:
                ((uv0) ((ai.j5) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((gx0) this.b).d;
                privacyControlActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) privacyControlActivity, 27, false));
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int intValue = ((Integer) z1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                z1Var.c(z10, true);
                break;
            case 26:
                o11 o11Var = (o11) this.b;
                ProxyListActivity proxyListActivity = o11Var.s;
                SharedConfig.ProxyInfo proxyInfo = o11Var.d;
                w11 w11Var = new w11(null);
                w11Var.e = new org.telegram.ui.Cells.b7[3];
                w11Var.f = new org.telegram.ui.Cells.e9[2];
                w11Var.s = new org.telegram.ui.Cells.k6[3];
                w11Var.y = 1.0f;
                w11Var.E = new float[2];
                w11Var.F = true;
                w11Var.L = new p11(w11Var);
                w11Var.J = proxyInfo;
                proxyListActivity.presentFragment(w11Var);
                break;
            case 27:
                r21 r21Var = (r21) this.b;
                ei.d dVar = r21Var.s;
                if (dVar.c0 && !dVar.Q) {
                    dVar.setLoading(true);
                    s21.J(r21Var.v, ((TextView) r21Var.h.c).getText(), r21Var.d.option, r21Var.n.getText().toString());
                    break;
                }
                break;
            case 28:
                p21 p21Var = (p21) ((ai.o5) this.b).e;
                if (p21Var != null) {
                    p21Var.run();
                    break;
                }
                break;
            default:
                ((x21) this.b).dismiss();
                break;
        }
    }
}
