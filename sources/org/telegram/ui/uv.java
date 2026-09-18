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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11 = 18;
        long j3 = 0;
        int i12 = 4;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                wy wyVar = (wy) this.b;
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.c;
                wyVar.getClass();
                n70Var.u();
                wyVar.presentFragment(new ProxyListActivity());
                break;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.c2[]) this.c, r0, r0.currentAccount, ((wy) this.b).Y2);
                break;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 3:
                wy wyVar2 = (wy) this.b;
                wyVar2.r4((ArrayList) this.c, 102, false, false, null);
                wyVar2.finishPreviewFragment();
                break;
            case 4:
                wy.H0((wy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.br0(27, (wy) this.b, (String) this.c), 250L);
                break;
            case 6:
                g20 g20Var = (g20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((h20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (g20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = g20Var.e.getMessagesController().getDialogFilters().size();
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
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i17 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i17, 1);
                        j3 = j10;
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
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, g20Var.e, new mw(14, g20Var, suggestedFilter));
                break;
            case 7:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) this.b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                t11Var.run();
                g3Var.dismiss();
                break;
            case 9:
                u30 u30Var = (u30) this.b;
                TextView textView = (TextView) this.c;
                k60 k60Var = u30Var.E;
                ChatObject.Call call = k60Var.a1;
                if (call != null && call.recording) {
                    k60Var.G1(textView);
                    break;
                }
                break;
            case 10:
                new t50((Context) this.c, (u50) this.b).show();
                break;
            case 11:
                f80 f80Var = (f80) this.b;
                org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.c;
                f80Var.getClass();
                if (!wy.w4) {
                    wy.w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.i6 N0 = !q6 ? org.telegram.ui.ActionBar.j6.N0("Night") : org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.j6.o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    org.telegram.ui.Components.yi0 yi0Var = f80Var.v;
                    yi0Var.P(!q6 ? yi0Var.e[0] - 1 : 0);
                    bj0Var.d();
                    int[] iArr = {(bj0Var.getMeasuredWidth() / 2) + r7, (bj0Var.getMeasuredHeight() / 2) + r7};
                    bj0Var.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), bj0Var);
                    bj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                r80 r80Var = (r80) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                r80Var.Q.dismiss();
                if (!r80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, r80Var.c0);
                    b6 b6Var = new b6(bundle);
                    b6Var.d = r80Var.f0;
                    b6Var.U();
                    o2Var.presentFragment(b6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i20 = r80Var.c0;
                    if (i20 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i20 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    wy wyVar3 = new wy(bundle2);
                    wyVar3.C2 = new f20(i12, r80Var, wyVar3);
                    o2Var.presentFragment(wyVar3);
                    break;
                }
            case 13:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.p4[] p4VarArr = (org.telegram.ui.Cells.p4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.p4) view).getCurrentLocale();
                int i21 = 0;
                while (i21 < 2) {
                    p4VarArr[i21].a.a(i21 == num.intValue(), true);
                    i21++;
                }
                break;
            case 14:
                org.telegram.ui.Components.c5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new pb0((zb0) this.b, i14));
                break;
            case 15:
                zb0 zb0Var = (zb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (zb0Var.e == null) {
                    wb0 wb0Var = zb0Var.f;
                    if (!wb0Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        Switch r42 = w8Var.e;
                        w8Var.setChecked(!r42.h);
                        zb0Var.r.setVisibility(r42.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            zb0Var.f.setCheckBoxIcon(0);
                            zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            ob0 ob0Var = new ob0(zb0Var, i15);
                            runnableArr[0] = ob0Var;
                            AndroidUtilities.runOnUIThread(ob0Var);
                            break;
                        } else {
                            zb0Var.f.setChecked(false);
                            zb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            ob0 ob0Var2 = new ob0(zb0Var, i14);
                            runnableArr[0] = ob0Var2;
                            AndroidUtilities.runOnUIThread(ob0Var2, 60L);
                            break;
                        }
                    } else {
                        int i22 = -zb0Var.N;
                        zb0Var.N = i22;
                        AndroidUtilities.shakeViewSpring(wb0Var, i22);
                        break;
                    }
                }
                break;
            case 16:
                kd0 kd0Var = (kd0) this.b;
                kd0Var.r0((ed0) this.c);
                cd0 cd0Var = kd0Var.I0;
                if (cd0Var != null) {
                    cd0Var.dismiss();
                    break;
                }
                break;
            case 17:
                hd0 hd0Var = (hd0) this.b;
                jd0 jd0Var = (jd0) this.c;
                kd0 kd0Var2 = hd0Var.b;
                kd0Var2.getClass();
                kd0Var2.F0.b(jd0Var.c, kd0Var2.G0, true, 0, 0L);
                kd0Var2.finishFragment();
                break;
            case 18:
                ie0 ie0Var = (ie0) this.b;
                Context context = (Context) this.c;
                String string = ie0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01();
                    p01Var.a |= 256;
                    p01Var.b = indexOf;
                    int i23 = lastIndexOf + 1;
                    p01Var.c = i23;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q01(p01Var, 0), indexOf, i23, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i24 = ie0Var.G;
                int i25 = i24 / 86400;
                int i26 = i24 % 86400;
                int i27 = i26 / 3600;
                int i28 = (i26 % 3600) / 60;
                if (i25 == 0 && i27 == 0) {
                    i28 = Math.max(1, i28);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i25 == 0 || i27 == 0) ? (i27 == 0 || i28 == 0) ? i25 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i25, new Object[0])) : i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i25, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]), LocaleController.formatPluralString("Minutes", i28, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i25, new Object[0]), LocaleController.formatPluralString("Hours", i27, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new gu(ie0Var, i11));
                hg.k0.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 19:
                re0 re0Var = (re0) this.b;
                Context context2 = (Context) this.c;
                yg0 yg0Var = re0Var.y;
                if (yg0Var.V.getTag() == null) {
                    if (!re0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(re0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new gu(re0Var, 19));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        yg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new pe0(re0Var, i15), 10);
                        break;
                    }
                }
                break;
            case 20:
                bg0 bg0Var = (bg0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = bg0Var.o0;
                if (bundle3 != null && (tL_auth_sentCode = bg0Var.p0) != null) {
                    bg0Var.s0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!bg0Var.d0) {
                    zf0 zf0Var = bg0Var.v;
                    if ((zf0Var == null || zf0Var.getVisibility() == 8) && !bg0Var.i0) {
                        if (bg0Var.g0 != 0) {
                            if (bg0Var.s0.V.getTag() == null) {
                                bg0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = bg0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = bg0Var.c;
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
                            bg0Var.s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, bg0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new f20(i11, bg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new qf0(bg0Var, i15));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 21:
                xg0 xg0Var = (xg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = xg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    xg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (xg0Var.M > 0 && currentTimeMillis - xg0Var.N > 1500) {
                    xg0Var.M = 0;
                }
                int i29 = xg0Var.M + 1;
                xg0Var.M = i29;
                xg0Var.N = currentTimeMillis;
                if (i29 < 5) {
                    if (i29 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i29, new Object[0]), 0);
                        xg0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    xg0Var.M = 0;
                    xg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new wv(xg0Var, i15));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                jj0 jj0Var = (jj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                lj0 lj0Var = jj0Var.d;
                if (!lj0Var.a0(messageObject)) {
                    lj0Var.getOrCreateStoryViewer().F(lj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(lj0Var.f));
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
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
                break;
            case 24:
                yo0.h0((yo0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.n70 n70Var2 = (org.telegram.ui.Components.n70) this.c;
                if (photoViewer.T4 != null) {
                    n70Var2.u();
                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer.m4;
                    if (o2Var2 instanceof bo) {
                        ((bo) o2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i30 = photoViewer2.P4;
                    if (i30 >= 0 && i30 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.f4 f4Var = photoViewer2.k1;
                                if (f4Var != null) {
                                    f4Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new ci.f4(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.oq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ci.f4 f4Var2 = photoViewer2.k1;
                                    f4Var2.l0 = new kh(i13, f4Var2);
                                    f4Var2.d = 3500L;
                                    f4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.X2(true);
                        photoViewer2.o2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            xu0 xu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(activity);
                            z11Var.d = new org.telegram.ui.Components.kq0(z11Var, 17);
                            z11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            z11Var.setTextColor(-1);
                            z11Var.setTextSize(1, 14.0f);
                            z11Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            z11Var.setGravity(16);
                            xu0Var.addView(z11Var, w7.x5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            z11Var.setVisibility(8);
                            photoViewer2.m1 = z11Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.z11 z11Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.t61 t61Var = photoViewer2.j1;
                        org.telegram.ui.Components.kq0 kq0Var = z11Var2.d;
                        if (t61Var != null) {
                            z11Var2.a = t61Var;
                            z11Var2.a();
                            z11Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(kq0Var);
                            AndroidUtilities.runOnUIThread(kq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = z11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                z11Var2.b.cancel();
                                z11Var2.b = null;
                            }
                            if (z11Var2.getVisibility() != 0) {
                                z11Var2.setAlpha(0.0f);
                                z11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = z11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                z11Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.n70) this.c).K((org.telegram.ui.Components.n70) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i31 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.g0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i31;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ps0(privacySettingsActivity, c2Var, setaccountttl, i13));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.oc.e();
                nf.f.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }

    public /* synthetic */ uv(org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.a = 27;
        this.c = n70Var;
        this.b = n70Var2;
    }
}
