package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.fy0 fy0Var;
        int i10 = 19;
        final int i11 = 4;
        int i12 = 27;
        final int i13 = 3;
        final int i14 = 2;
        final int i15 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.hp hpVar = (org.telegram.ui.Components.hp) this.b;
                hpVar.a(!hpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", hpVar.a.q).apply();
                break;
            case 1:
                ((y50) this.b).b.T0(19);
                break;
            case 2:
                m60 m60Var = ((k60) this.b).E;
                m60Var.T = null;
                m60Var.V.b();
                m60Var.h.b();
                m60Var.k0();
                m60Var.r0();
                break;
            case 3:
                c70.a0(((a70) this.b).d, null);
                break;
            case 4:
                s70.V((s70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.A0;
                launchActivity.D0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                while (i15 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i15)).isShowing()) {
                        ((Dialog) arrayList.get(i15)).dismiss();
                    }
                    i15++;
                }
                arrayList.clear();
                break;
            case 6:
                final ie0 ie0Var = (ie0) this.b;
                fg0 fg0Var = ie0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.P = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.he0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i16) {
                        switch (i15) {
                            case 0:
                                ie0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ie0 ie0Var2 = ie0Var;
                                fg0.n0(ie0Var2.y, ie0Var2.r, ie0Var2.s, ie0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c3 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.he0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i16) {
                        switch (c3) {
                            case 0:
                                ie0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ie0 ie0Var2 = ie0Var;
                                fg0.n0(ie0Var2.y, ie0Var2.r, ie0Var2.s, ie0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = fg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                qe0 qe0Var = (qe0) this.b;
                fg0 fg0Var2 = qe0Var.A;
                if (fg0Var2.R.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder2.a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new xt(qe0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    fg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                te0 te0Var = (te0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new se0(te0Var), NotificationCenter.onActivityResultReceived);
                Context context = te0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                z5.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.A)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                com.google.android.gms.internal.clearcut.v0 a2 = i7.l.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new xr(i12, te0Var, a2));
                break;
            case 9:
                final eh0 eh0Var = (eh0) this.b;
                hh0 hh0Var = eh0Var.G;
                if (eh0Var.n != null) {
                    View view2 = hh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F((ViewGroup) view2, null, eh0Var);
                        if (eh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i16 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i17) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.tc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            eb0 eb0Var = new eb0(1, hh0Var3.n);
                                            eb0Var.P = hh0Var3.o0;
                                            eb0Var.Y(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(eb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i17) {
                                                        case 0:
                                                            eh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i16 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c6 = 1 == true ? 1 : 0;
                            F.c(i16, string2, new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c6) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i162 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i162) {
                                                        case 0:
                                                            eh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.tc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            eb0 eb0Var = new eb0(1, hh0Var3.n);
                                            eb0Var.P = hh0Var3.o0;
                                            eb0Var.Y(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(eb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i17) {
                                                        case 0:
                                                            eh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i162 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i162) {
                                                        case 0:
                                                            eh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.tc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            eb0 eb0Var = new eb0(1, hh0Var3.n);
                                            eb0Var.P = hh0Var3.o0;
                                            eb0Var.Y(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(eb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i17) {
                                                        case 0:
                                                            eh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i162 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i162) {
                                                        case 0:
                                                            eh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.tc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            eb0 eb0Var = new eb0(1, hh0Var3.n);
                                            eb0Var.P = hh0Var3.o0;
                                            eb0Var.Y(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(eb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i17) {
                                                        case 0:
                                                            eh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !eh0Var.n.permanent && hh0Var.l0);
                            F.m(hh0Var.l0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i162 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i162) {
                                                        case 0:
                                                            eh0Var2.G.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.tc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            eb0 eb0Var = new eb0(1, hh0Var3.n);
                                            eb0Var.P = hh0Var3.o0;
                                            eb0Var.Y(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(eb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i17 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i172) {
                                                    switch (i17) {
                                                        case 0:
                                                            eh0Var6.G.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j7.l1.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(hh0Var.b.V0(eh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                si0 si0Var = (si0) this.b;
                long j10 = si0Var.b;
                if (!si0Var.n.isStory()) {
                    if (si0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) si0Var.getParentLayout().getFragmentStack().get(si0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((o2Var instanceof tn) && ((tn) o2Var).e.id == j10) {
                            si0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle g10 = j7.l1.g(j10, "chat_id");
                    g10.putInt("message_id", si0Var.c);
                    g10.putBoolean("need_remove_previous_same_chat_activity", false);
                    si0Var.presentFragment(new tn(g10));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.q8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.P = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i17 = passcodeActivity.x;
                if (i17 != 1) {
                    if (i17 == 2) {
                        passcodeActivity.g0();
                        break;
                    }
                } else if (passcodeActivity.A != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    passcodeActivity.h0();
                    break;
                }
                break;
            case 14:
                xk0 xk0Var = (xk0) this.b;
                if (!xk0Var.a.getAnimatedDrawable().h0) {
                    xk0Var.a.getAnimatedDrawable().L(0, false, false);
                    xk0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                rm0 rm0Var = (rm0) this.b;
                if (!rm0Var.F) {
                    int i18 = rm0Var.I;
                    if ((i18 != 4 || rm0Var.H != 2) && i18 != 0) {
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
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + rm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + rm0Var.G);
                            rm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.c5.u0(rm0Var.M, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                ((to0) this.b).f0.w0();
                break;
            case 18:
                hp0 hp0Var = (hp0) this.b;
                tn tnVar = hp0Var.B;
                if (tnVar != null && tnVar.c()) {
                    org.telegram.ui.Components.c5.L(hp0Var.getParentActivity(), tnVar.a(), new zo0(hp0Var, i15));
                    break;
                } else {
                    hp0Var.V(hp0Var.b, hp0Var.c, true, 0);
                    hp0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                zp0 zp0Var = (zp0) this.b;
                tn tnVar2 = zp0Var.Q;
                if (tnVar2 != null && tnVar2.c()) {
                    org.telegram.ui.Components.c5.L(zp0Var.getParentActivity(), tnVar2.a(), new lp0(zp0Var, i15));
                    break;
                } else {
                    zp0Var.e0(0, true);
                    break;
                }
            case 20:
                kt0 kt0Var = (kt0) this.b;
                if (kt0Var != null) {
                    kt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 21:
                st0 st0Var = (st0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = st0Var.d;
                int indexOf = photoViewer.c7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.l1.u(Q);
                        if (Q == 0) {
                            photoViewer.l1.m(0);
                        }
                        photoViewer.A3();
                        break;
                    }
                } else {
                    int k9 = photoViewer.d.k(indexOf, photoViewer.n1());
                    boolean x4 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.L4) {
                        photoViewer.J0.b(x4, true);
                    }
                    if (k9 >= 0) {
                        photoViewer.l1.u(k9);
                        if (k9 == 0) {
                            photoViewer.l1.m(0);
                        }
                    }
                    photoViewer.A3();
                    break;
                }
                break;
            case 22:
                vu0 vu0Var = (vu0) this.b;
                boolean[] zArr = vu0Var.w;
                CharSequence[] charSequenceArr = vu0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view.getParent();
                    f2.n1 G = vu0Var.c.G(a6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i19 = b10 - vu0Var.j0;
                        if (vu0Var.E && i19 < vu0Var.x) {
                            int i20 = -vu0Var.K;
                            vu0Var.K = i20;
                            AndroidUtilities.shakeViewSpring(a6Var, i20);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            vu0Var.b.u(b10);
                            int i21 = i19 + 1;
                            System.arraycopy(charSequenceArr, i21, charSequenceArr, i19, (charSequenceArr.length - 1) - i19);
                            System.arraycopy(zArr, i21, zArr, i19, (zArr.length - 1) - i19);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i22 = vu0Var.y - 1;
                            vu0Var.y = i22;
                            if (vu0Var.r != null) {
                                int[] iArr = new int[i22];
                                while (i15 < i22) {
                                    iArr[i15] = vu0Var.r[i15 >= i19 ? i15 + 1 : i15];
                                    i15++;
                                }
                                vu0Var.r = iArr;
                            }
                            if (vu0Var.y == charSequenceArr.length - 1) {
                                vu0Var.b.o((vu0Var.j0 + charSequenceArr.length) - 1);
                            }
                            f2.n1 K = vu0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = a6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                    ((org.telegram.ui.Cells.a6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    vu0Var.i0();
                                    vu0Var.r0();
                                    fy0Var = vu0Var.M;
                                    if (fy0Var != null) {
                                        fy0Var.f();
                                        vu0Var.M.setDelegate(null);
                                    }
                                    vu0Var.b.m(vu0Var.l0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                vu0Var.k0(true);
                            } else if (vu0Var.x0) {
                                vu0Var.k0(true);
                            }
                            textView.clearFocus();
                            vu0Var.i0();
                            vu0Var.r0();
                            fy0Var = vu0Var.M;
                            if (fy0Var != null) {
                            }
                            vu0Var.b.m(vu0Var.l0);
                        }
                    }
                }
                break;
            case 23:
                ((iv0) this.b).c(true);
                break;
            case 24:
                ((iv0) ((eg.v) this.b).c).c(true);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = ((tw0) this.b).d;
                privacyControlActivity.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) privacyControlActivity, 27, false));
                break;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int intValue = ((Integer) y1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.V;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                y1Var.c(z10, true);
                break;
            case 27:
                d11 d11Var = (d11) this.b;
                d11Var.s.presentFragment(new l11(d11Var.d));
                break;
            case 28:
                z11 z11Var = (z11) this.b;
                ValueAnimator valueAnimator = z11Var.J;
                if (valueAnimator == null) {
                    boolean z11 = !z11Var.I;
                    a21 a21Var = z11Var.d;
                    x11 x11Var = z11Var.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) a21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) z11Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    x11Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    x11Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    x11Var.getLocationInWindow(iArr2);
                    float f9 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    z11Var.K = new nh.pa(z11Var, a21Var.getParentActivity(), z11, canvas, (x11Var.getMeasuredWidth() / 2.0f) + f9, (x11Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f9, f10, 2);
                    z11Var.L = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    z11Var.J = ofFloat;
                    ofFloat.addUpdateListener(new w01(z11Var, 3));
                    z11Var.J.addListener(new e50(z11Var, 24));
                    z11Var.J.setDuration(400L);
                    z11Var.J.setInterpolator(org.telegram.ui.Components.ct.e);
                    z11Var.J.start();
                    frameLayout2.addView(z11Var.K, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p90(14, z11Var, z11));
                    break;
                }
                break;
            default:
                x21 x21Var = (x21) this.b;
                nh.d dVar = x21Var.s;
                if (dVar.S && !dVar.J) {
                    dVar.setLoading(true);
                    y21.G(x21Var.v, ((TextView) x21Var.h.c).getText(), x21Var.d.option, x21Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
