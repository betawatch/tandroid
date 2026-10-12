package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j10 = 0;
        int i11 = 18;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                yy yyVar = (yy) this.b;
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.c;
                yyVar.getClass();
                m80Var.u();
                yyVar.presentFragment(new ProxyListActivity());
                break;
            case 1:
                gi.u0.e((org.telegram.ui.ActionBar.a2[]) this.c, r0, r0.currentAccount, ((yy) this.b).Y2);
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                yy yyVar2 = (yy) this.b;
                yyVar2.o4((ArrayList) this.c, 102, false, false, null);
                yyVar2.finishPreviewFragment();
                break;
            case 4:
                yy.E0((yy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k31(19, (yy) this.b, (String) this.c), 250L);
                break;
            case 6:
                i20 i20Var = (i20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((j20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (i20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = i20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i16 = 0;
                while (i16 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList = i16 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList2 = i16 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i17);
                        long j11 = j10;
                        long j12 = inputPeer.user_id;
                        if (j12 == j11) {
                            long j13 = inputPeer.chat_id;
                            if (j13 == j11) {
                                j13 = inputPeer.channel_id;
                            }
                            j12 = -j13;
                        }
                        i17 = com.google.android.gms.internal.play_billing.k3.h(j12, arrayList2, i17, 1);
                        j10 = j11;
                    }
                    i16++;
                }
                TLRPC.DialogFilter dialogFilter3 = suggestedFilter.filter;
                if (dialogFilter3.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter3.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter3.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter3.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter3.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter3.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter3.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter3.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                l10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, i20Var.e, new o00(i12, i20Var, suggestedFilter));
                break;
            case 7:
                pf.d.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.m21 m21Var = (org.telegram.ui.Components.m21) this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                m21Var.run();
                e3Var.dismiss();
                break;
            case 9:
                w30 w30Var = (w30) this.b;
                TextView textView = (TextView) this.c;
                n60 n60Var = w30Var.E;
                ChatObject.Call call = n60Var.a1;
                if (call != null && call.recording) {
                    n60Var.H1(textView);
                    break;
                }
                break;
            case 10:
                new w50((Context) this.c, (x50) this.b).show();
                break;
            case 11:
                h80 h80Var = (h80) this.b;
                org.telegram.ui.Components.bk0 bk0Var = (org.telegram.ui.Components.bk0) this.c;
                h80Var.getClass();
                if (!yy.w4) {
                    yy.w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.f6 O0 = !q6 ? org.telegram.ui.ActionBar.g6.O0("Night") : org.telegram.ui.ActionBar.g6.O0("Blue");
                    org.telegram.ui.ActionBar.g6.o = 0;
                    org.telegram.ui.ActionBar.g6.r1();
                    org.telegram.ui.ActionBar.g6.A();
                    org.telegram.ui.Components.yj0 yj0Var = h80Var.v;
                    yj0Var.P(!q6 ? yj0Var.e[0] - 1 : 0);
                    bk0Var.d();
                    int[] iArr = {(bk0Var.getMeasuredWidth() / 2) + r7, (bk0Var.getMeasuredHeight() / 2) + r7};
                    bk0Var.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), bk0Var);
                    bk0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                t80 t80Var = (t80) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                t80Var.Q.dismiss();
                if (!t80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, t80Var.c0);
                    e6 e6Var = new e6(bundle);
                    e6Var.d = t80Var.f0;
                    e6Var.U();
                    m2Var.presentFragment(e6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i20 = t80Var.c0;
                    if (i20 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i20 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    yy yyVar3 = new yy(bundle2);
                    yyVar3.C2 = new gw(t80Var, yyVar3);
                    m2Var.presentFragment(yyVar3);
                    break;
                }
            case 13:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i21 = 0;
                while (i21 < 2) {
                    q4VarArr[i21].a.a(i21 == num.intValue(), true);
                    i21++;
                }
                break;
            case 14:
                org.telegram.ui.Components.g5.x((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new qb0((ac0) this.b, i15));
                break;
            case 15:
                ac0 ac0Var = (ac0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (ac0Var.e == null) {
                    xb0 xb0Var = ac0Var.f;
                    if (!xb0Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        Switch r42 = w8Var.e;
                        w8Var.setChecked(!r42.h);
                        ac0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            ac0Var.f.setCheckBoxIcon(0);
                            ac0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            pb0 pb0Var = new pb0(ac0Var, i14);
                            runnableArr[0] = pb0Var;
                            AndroidUtilities.runOnUIThread(pb0Var);
                            break;
                        } else {
                            ac0Var.f.setChecked(false);
                            ac0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            ac0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            pb0 pb0Var2 = new pb0(ac0Var, i15);
                            runnableArr[0] = pb0Var2;
                            AndroidUtilities.runOnUIThread(pb0Var2, 60L);
                            break;
                        }
                    } else {
                        int i22 = -ac0Var.N;
                        ac0Var.N = i22;
                        AndroidUtilities.shakeViewSpring(xb0Var, i22);
                        break;
                    }
                }
                break;
            case 16:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.q0((hd0) this.c);
                fd0 fd0Var = nd0Var.I0;
                if (fd0Var != null) {
                    fd0Var.dismiss();
                    break;
                }
                break;
            case 17:
                kd0 kd0Var = (kd0) this.b;
                md0 md0Var = (md0) this.c;
                nd0 nd0Var2 = kd0Var.b;
                nd0Var2.getClass();
                nd0Var2.F0.b(md0Var.c, nd0Var2.G0, true, 0, 0L);
                nd0Var2.finishFragment();
                break;
            case 18:
                le0 le0Var = (le0) this.b;
                Context context = (Context) this.c;
                String string = le0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.p11 p11Var = new org.telegram.ui.Components.p11();
                    p11Var.a |= 256;
                    p11Var.b = indexOf;
                    int i23 = lastIndexOf + 1;
                    p11Var.c = i23;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q11(p11Var, 0), indexOf, i23, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i24 = le0Var.G;
                int i25 = i24 / 86400;
                int i26 = i24 % 86400;
                int i27 = i26 / 3600;
                int i28 = (i26 % 3600) / 60;
                if (i25 == 0 && i27 == 0) {
                    i28 = Math.max(1, i28);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i25 == 0 || i27 == 0) ? (i27 == 0 || i28 == 0) ? i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i25, new Object[0])) : i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i25, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]), LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i25, new Object[0]), LocaleController.formatPluralString("Hours", i27, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new mu(le0Var, 17));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 19:
                ue0 ue0Var = (ue0) this.b;
                Context context2 = (Context) this.c;
                bh0 bh0Var = ue0Var.y;
                if (bh0Var.V.getTag() == null) {
                    if (!ue0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(ue0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new mu(ue0Var, i11));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        bh0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new se0(ue0Var, i14), 10);
                        break;
                    }
                }
                break;
            case 20:
                eg0 eg0Var = (eg0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = eg0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = eg0Var.p0) != null) {
                    eg0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!eg0Var.d0) {
                    cg0 cg0Var = eg0Var.v;
                    if ((cg0Var == null || cg0Var.getVisibility() == 8) && !eg0Var.i0) {
                        if (eg0Var.g0 != 0) {
                            if (eg0Var.s0.V.getTag() == null) {
                                eg0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = eg0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = eg0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            eg0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, eg0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new gw(23, eg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new tf0(eg0Var, i14));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 21:
                ah0 ah0Var = (ah0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = ah0Var.O;
                if (toast != null) {
                    toast.cancel();
                    ah0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ah0Var.M > 0 && currentTimeMillis - ah0Var.N > 1500) {
                    ah0Var.M = 0;
                }
                int i29 = ah0Var.M + 1;
                ah0Var.M = i29;
                ah0Var.N = currentTimeMillis;
                if (i29 < 5) {
                    if (i29 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i29, new Object[0]), 0);
                        ah0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    ah0Var.M = 0;
                    ah0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ah0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new o4(ah0Var, i13));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                oj0 oj0Var = (oj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                qj0 qj0Var = oj0Var.d;
                if (!qj0Var.a0(messageObject)) {
                    qj0Var.getOrCreateStoryViewer().F(qj0Var.getParentActivity(), messageObject.storyItem, bi.g9.a(qj0Var.f));
                    break;
                }
                break;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.g6.l6 : org.telegram.ui.ActionBar.g6.H6, false));
                break;
            case 24:
                cp0.h0((cp0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.m80 m80Var2 = (org.telegram.ui.Components.m80) this.c;
                if (photoViewer.T4 != null) {
                    m80Var2.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.m4;
                    if (m2Var2 instanceof fo) {
                        ((fo) m2Var2).O9(photoViewer.T4, false, true);
                    }
                    pf.d.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.r) {
                    int i30 = photoViewer2.P4;
                    if (i30 >= 0 && i30 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                di.d4 d4Var = photoViewer2.k1;
                                if (d4Var != null) {
                                    d4Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new di.d4(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.br(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 87));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    di.d4 d4Var2 = photoViewer2.k1;
                                    d4Var2.l0 = new rh(i13, d4Var2);
                                    d4Var2.d = 3500L;
                                    d4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.Y2(true);
                        photoViewer2.p2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            cv0 cv0Var = photoViewer2.e0;
                            org.telegram.ui.Components.z21 z21Var = new org.telegram.ui.Components.z21(activity);
                            z21Var.d = new org.telegram.ui.Components.lr0(z21Var, i11);
                            z21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(3.0f), -871296751));
                            z21Var.setTextColor(-1);
                            z21Var.setTextSize(1, 14.0f);
                            z21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            z21Var.setGravity(16);
                            cv0Var.addView(z21Var, w7.a6.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 51));
                            z21Var.setVisibility(8);
                            photoViewer2.m1 = z21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.z21 z21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.u71 u71Var = photoViewer2.j1;
                        org.telegram.ui.Components.lr0 lr0Var = z21Var2.d;
                        if (u71Var != null) {
                            z21Var2.a = u71Var;
                            z21Var2.a();
                            z21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(lr0Var);
                            AndroidUtilities.runOnUIThread(lr0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = z21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                z21Var2.b.cancel();
                                z21Var2.b = null;
                            }
                            if (z21Var2.getVisibility() != 0) {
                                z21Var2.setAlpha(0.0f);
                                z21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = z21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                z21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.m80) this.c).K((org.telegram.ui.Components.m80) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i31 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(privacySettingsActivity.getParentActivity(), 3, null);
                a2Var.g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i31;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new us0(privacySettingsActivity, a2Var, setaccountttl, i13));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.sc.e();
                pf.d.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }

    public /* synthetic */ xv(org.telegram.ui.Components.m80 m80Var, org.telegram.ui.Components.m80 m80Var2) {
        this.a = 27;
        this.c = m80Var;
        this.b = m80Var2;
    }
}
