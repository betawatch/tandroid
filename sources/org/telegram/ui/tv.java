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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j3 = 0;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                uy uyVar = (uy) this.b;
                org.telegram.ui.Components.b80 b80Var = (org.telegram.ui.Components.b80) this.c;
                uyVar.getClass();
                b80Var.u();
                uyVar.presentFragment(new ProxyListActivity());
                break;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.c, r0, r0.currentAccount, ((uy) this.b).Y2);
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                uy uyVar2 = (uy) this.b;
                uyVar2.A4((ArrayList) this.c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                break;
            case 4:
                uy.I0((uy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new cu(i13, (uy) this.b, (String) this.c), 250L);
                break;
            case 6:
                d20 d20Var = (d20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((e20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (d20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = d20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i14 = 0;
                while (i14 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList = i14 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList2 = i14 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i15);
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i15 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i15, 1);
                        j3 = j10;
                    }
                    i14++;
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, d20Var.e, new cu(17, d20Var, suggestedFilter));
                break;
            case 7:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                r21Var.run();
                f3Var.dismiss();
                break;
            case 9:
                s30 s30Var = (s30) this.b;
                TextView textView = (TextView) this.c;
                h60 h60Var = s30Var.E;
                ChatObject.Call call = h60Var.a1;
                if (call != null && call.recording) {
                    h60Var.G1(textView);
                    break;
                }
                break;
            case 10:
                new r50((Context) this.c, (n20) this.b).show();
                break;
            case 11:
                c80 c80Var = (c80) this.b;
                org.telegram.ui.Components.nj0 nj0Var = (org.telegram.ui.Components.nj0) this.c;
                c80Var.getClass();
                if (!uy.v4) {
                    uy.v4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.h6 N0 = !q6 ? org.telegram.ui.ActionBar.i6.N0("Night") : org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.i6.o = 0;
                    org.telegram.ui.ActionBar.i6.q1();
                    org.telegram.ui.ActionBar.i6.A();
                    org.telegram.ui.Components.kj0 kj0Var = c80Var.v;
                    kj0Var.P(!q6 ? kj0Var.e[0] - 1 : 0);
                    nj0Var.d();
                    int[] iArr = {(nj0Var.getMeasuredWidth() / 2) + r11, (nj0Var.getMeasuredHeight() / 2) + r11};
                    nj0Var.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), nj0Var);
                    nj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                o80 o80Var = (o80) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                o80Var.Q.dismiss();
                if (!o80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, o80Var.c0);
                    b6 b6Var = new b6(bundle);
                    b6Var.d = o80Var.f0;
                    b6Var.S();
                    n2Var.presentFragment(b6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i18 = o80Var.c0;
                    if (i18 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i18 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    uy uyVar3 = new uy(bundle2);
                    uyVar3.C2 = new pw(o80Var, uyVar3);
                    n2Var.presentFragment(uyVar3);
                    break;
                }
            case 13:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i19 = 0;
                while (i19 < 2) {
                    q4VarArr[i19].a.a(i19 == num.intValue(), true);
                    i19++;
                }
                break;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new lb0((vb0) this.b, i12));
                break;
            case 15:
                vb0 vb0Var = (vb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (vb0Var.e == null) {
                    sb0 sb0Var = vb0Var.f;
                    if (!sb0Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        Switch r42 = w8Var.e;
                        w8Var.setChecked(!r42.h);
                        vb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            vb0Var.f.setCheckBoxIcon(0);
                            vb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            kb0 kb0Var = new kb0(vb0Var, i13);
                            runnableArr[0] = kb0Var;
                            AndroidUtilities.runOnUIThread(kb0Var);
                            break;
                        } else {
                            vb0Var.f.setChecked(false);
                            vb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            vb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            kb0 kb0Var2 = new kb0(vb0Var, i12);
                            runnableArr[0] = kb0Var2;
                            AndroidUtilities.runOnUIThread(kb0Var2, 60L);
                            break;
                        }
                    } else {
                        int i20 = -vb0Var.N;
                        vb0Var.N = i20;
                        AndroidUtilities.shakeViewSpring(sb0Var, i20);
                        break;
                    }
                }
                break;
            case 16:
                gd0 gd0Var = (gd0) this.b;
                gd0Var.r0((ad0) this.c);
                yc0 yc0Var = gd0Var.I0;
                if (yc0Var != null) {
                    yc0Var.dismiss();
                    break;
                }
                break;
            case 17:
                dd0 dd0Var = (dd0) this.b;
                fd0 fd0Var = (fd0) this.c;
                gd0 gd0Var2 = dd0Var.b;
                gd0Var2.getClass();
                gd0Var2.F0.b(fd0Var.c, gd0Var2.G0, true, 0, 0L);
                gd0Var2.finishFragment();
                break;
            case 18:
                ee0 ee0Var = (ee0) this.b;
                Context context = (Context) this.c;
                String string = ee0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11();
                    n11Var.a |= 256;
                    n11Var.b = indexOf;
                    int i21 = lastIndexOf + 1;
                    n11Var.c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o11(n11Var, 0), indexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = ee0Var.G;
                int i23 = i22 / 86400;
                int i24 = i22 % 86400;
                int i25 = i24 / 3600;
                int i26 = (i24 % 3600) / 60;
                if (i23 == 0 && i25 == 0) {
                    i26 = Math.max(1, i26);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i23 == 0 || i25 == 0) ? (i25 == 0 || i26 == 0) ? i23 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i23, new Object[0])) : i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i23, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i26, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i25, new Object[0]), LocaleController.formatPluralString("Minutes", i26, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i23, new Object[0]), LocaleController.formatPluralString("Hours", i25, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new bu(ee0Var, 18));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 19:
                ne0 ne0Var = (ne0) this.b;
                Context context2 = (Context) this.c;
                ug0 ug0Var = ne0Var.y;
                if (ug0Var.V.getTag() == null) {
                    if (!ne0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(ne0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new bu(ne0Var, 19));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        ug0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new le0(ne0Var, i13), 10);
                        break;
                    }
                }
                break;
            case 20:
                xf0 xf0Var = (xf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = xf0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = xf0Var.p0) != null) {
                    xf0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!xf0Var.d0) {
                    vf0 vf0Var = xf0Var.v;
                    if ((vf0Var == null || vf0Var.getVisibility() == 8) && !xf0Var.i0) {
                        if (xf0Var.g0 != 0) {
                            if (xf0Var.s0.V.getTag() == null) {
                                xf0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = xf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = xf0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            xf0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, xf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new pw(21, xf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new mf0(xf0Var, i13));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 21:
                tg0 tg0Var = (tg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = tg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    tg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (tg0Var.M > 0 && currentTimeMillis - tg0Var.N > 1500) {
                    tg0Var.M = 0;
                }
                int i27 = tg0Var.M + 1;
                tg0Var.M = i27;
                tg0Var.N = currentTimeMillis;
                if (i27 < 5) {
                    if (i27 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i27, new Object[0]), 0);
                        tg0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    tg0Var.M = 0;
                    tg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new vv(tg0Var, i13));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                fj0 fj0Var = (fj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                hj0 hj0Var = fj0Var.d;
                if (!hj0Var.Z(messageObject)) {
                    hj0Var.getOrCreateStoryViewer().F(hj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(hj0Var.f));
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
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.i6.l6 : org.telegram.ui.ActionBar.i6.H6, false));
                break;
            case 24:
                so0.h0((so0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.b80 b80Var2 = (org.telegram.ui.Components.b80) this.c;
                if (photoViewer.T4 != null) {
                    b80Var2.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.m4;
                    if (n2Var2 instanceof yn) {
                        ((yn) n2Var2).I9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.r) {
                    int i28 = photoViewer2.P4;
                    if (i28 >= 0 && i28 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new ci.e4(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.rq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.k1;
                                    e4Var2.l0 = new gh(i11, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
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
                            qu0 qu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.x21 x21Var = new org.telegram.ui.Components.x21(activity);
                            x21Var.d = new org.telegram.ui.Components.gq0(x21Var, 20);
                            x21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            x21Var.setTextColor(-1);
                            x21Var.setTextSize(1, 14.0f);
                            x21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            x21Var.setGravity(16);
                            qu0Var.addView(x21Var, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            x21Var.setVisibility(8);
                            photoViewer2.m1 = x21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.x21 x21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.s71 s71Var = photoViewer2.j1;
                        org.telegram.ui.Components.gq0 gq0Var = x21Var2.d;
                        if (s71Var != null) {
                            x21Var2.a = s71Var;
                            x21Var2.a();
                            x21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(gq0Var);
                            AndroidUtilities.runOnUIThread(gq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = x21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                x21Var2.b.cancel();
                                x21Var2.b = null;
                            }
                            if (x21Var2.getVisibility() != 0) {
                                x21Var2.setAlpha(0.0f);
                                x21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = x21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                x21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.b80) this.c).K((org.telegram.ui.Components.b80) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i29 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i29;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new is0(privacySettingsActivity, b2Var, setaccountttl, i11));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.rc.e();
                nf.f.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }

    public /* synthetic */ tv(org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.a = 27;
        this.c = b80Var;
        this.b = b80Var2;
    }
}
