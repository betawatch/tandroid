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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        int i11 = 19;
        long j3 = 0;
        int i12 = 18;
        int i13 = 5;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        int i17 = 1;
        switch (this.a) {
            case 0:
                uy uyVar = (uy) this.b;
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.c;
                uyVar.getClass();
                y70Var.u();
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
                uyVar2.r4((ArrayList) this.c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                break;
            case 4:
                uy.H0((uy) this.b, (BirthdayController.BirthdayState) this.c);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new yt(i14, (uy) this.b, (String) this.c), 250L);
                break;
            case 6:
                e20 e20Var = (e20) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f20) this.c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (e20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = e20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i18 = 0;
                while (i18 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList = i18 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList2 = i18 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i19);
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i19 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i19, 1);
                        j3 = j10;
                    }
                    i18++;
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, e20Var.e, new yt(20, e20Var, suggestedFilter));
                break;
            case 7:
                nf.f.s((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                i21Var.run();
                f3Var.dismiss();
                break;
            case 9:
                s30 s30Var = (s30) this.b;
                TextView textView = (TextView) this.c;
                i60 i60Var = s30Var.E;
                ChatObject.Call call = i60Var.a1;
                if (call != null && call.recording) {
                    i60Var.G1(textView);
                    break;
                }
                break;
            case 10:
                new r50((Context) this.c, (s50) this.b).show();
                break;
            case 11:
                d80 d80Var = (d80) this.b;
                org.telegram.ui.Components.nj0 nj0Var = (org.telegram.ui.Components.nj0) this.c;
                d80Var.getClass();
                if (!uy.w4) {
                    uy.w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z10 = !q6;
                    org.telegram.ui.ActionBar.i6 N0 = !q6 ? org.telegram.ui.ActionBar.j6.N0("Night") : org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.j6.o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    org.telegram.ui.Components.kj0 kj0Var = d80Var.v;
                    kj0Var.P(!q6 ? kj0Var.e[0] - 1 : 0);
                    nj0Var.d();
                    int[] iArr = {(nj0Var.getMeasuredWidth() / 2) + r7, (nj0Var.getMeasuredHeight() / 2) + r7};
                    nj0Var.getLocationInWindow(iArr);
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), nj0Var);
                    nj0Var.setContentDescription(LocaleController.getString(!q6 ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 12:
                p80 p80Var = (p80) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                p80Var.Q.dismiss();
                if (!p80Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, p80Var.c0);
                    a6 a6Var = new a6(bundle);
                    a6Var.d = p80Var.f0;
                    a6Var.U();
                    n2Var.presentFragment(a6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i22 = p80Var.c0;
                    if (i22 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    uy uyVar3 = new uy(bundle2);
                    uyVar3.C2 = new z10(i13, p80Var, uyVar3);
                    n2Var.presentFragment(uyVar3);
                    break;
                }
            case 13:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                int i23 = 0;
                while (i23 < 2) {
                    r4VarArr[i23].a.a(i23 == num.intValue(), true);
                    i23++;
                }
                break;
            case 14:
                org.telegram.ui.Components.d5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new pb0((zb0) this.b, i16));
                break;
            case 15:
                zb0 zb0Var = (zb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (zb0Var.e == null) {
                    wb0 wb0Var = zb0Var.f;
                    if (!wb0Var.e.h) {
                        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                        Switch r52 = x8Var.e;
                        x8Var.setChecked(!r52.h);
                        zb0Var.r.setVisibility(r52.h ? 0 : 8);
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r52.h) {
                            zb0Var.f.setCheckBoxIcon(0);
                            zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            ob0 ob0Var = new ob0(zb0Var, i17);
                            runnableArr[0] = ob0Var;
                            AndroidUtilities.runOnUIThread(ob0Var);
                            break;
                        } else {
                            zb0Var.f.setChecked(false);
                            zb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            ob0 ob0Var2 = new ob0(zb0Var, i16);
                            runnableArr[0] = ob0Var2;
                            AndroidUtilities.runOnUIThread(ob0Var2, 60L);
                            break;
                        }
                    } else {
                        int i24 = -zb0Var.N;
                        zb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(wb0Var, i24);
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
                    org.telegram.ui.Components.e11 e11Var = new org.telegram.ui.Components.e11();
                    e11Var.a |= 256;
                    e11Var.b = indexOf;
                    int i25 = lastIndexOf + 1;
                    e11Var.c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f11(e11Var, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = ie0Var.G;
                int i27 = i26 / 86400;
                int i28 = i26 % 86400;
                int i29 = i28 / 3600;
                int i30 = (i28 % 3600) / 60;
                if (i27 == 0 && i29 == 0) {
                    i30 = Math.max(1, i30);
                }
                alertDialog$Builder.a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, (i27 == 0 || i29 == 0) ? (i29 == 0 || i30 == 0) ? i27 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i27, new Object[0])) : i29 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i27, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i30, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i29, new Object[0]), LocaleController.formatPluralString("Minutes", i30, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i27, new Object[0]), LocaleController.formatPluralString("Hours", i29, new Object[0])));
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new fu(ie0Var, i12));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
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
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new fu(re0Var, i11));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        yg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new pe0(re0Var, i17), 10);
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
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new z10(i11, bg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new qf0(bg0Var, i17));
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
                int i31 = xg0Var.M + 1;
                xg0Var.M = i31;
                xg0Var.N = currentTimeMillis;
                if (i31 < 5) {
                    if (i31 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                        xg0Var.O = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    xg0Var.M = 0;
                    xg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xg0Var.getContext());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new vv(xg0Var, i17));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 22:
                kj0 kj0Var2 = (kj0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                mj0 mj0Var = kj0Var2.d;
                if (!mj0Var.a0(messageObject)) {
                    mj0Var.getOrCreateStoryViewer().F(mj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(mj0Var.f));
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
                passcodeActivity.h.setInputType(1 | (atomicBoolean.get() ? 144 : 128));
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
                break;
            case 24:
                xo0.h0((xo0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.y70 y70Var2 = (org.telegram.ui.Components.y70) this.c;
                if (photoViewer.T4 != null) {
                    y70Var2.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.m4;
                    if (n2Var2 instanceof zn) {
                        ((zn) n2Var2).J9(photoViewer.T4, false, true);
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
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.g7.size()) {
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
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    ci.f4 f4Var2 = photoViewer2.k1;
                                    f4Var2.l0 = new nh(i15, f4Var2);
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
                            vu0 vu0Var = photoViewer2.e0;
                            org.telegram.ui.Components.o21 o21Var = new org.telegram.ui.Components.o21(activity);
                            o21Var.d = new org.telegram.ui.Components.yq0(o21Var, i12);
                            o21Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            o21Var.setTextColor(-1);
                            o21Var.setTextSize(1, 14.0f);
                            o21Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            o21Var.setGravity(16);
                            vu0Var.addView(o21Var, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            o21Var.setVisibility(8);
                            photoViewer2.m1 = o21Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.o21 o21Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.i71 i71Var = photoViewer2.j1;
                        org.telegram.ui.Components.yq0 yq0Var = o21Var2.d;
                        if (i71Var != null) {
                            o21Var2.a = i71Var;
                            o21Var2.a();
                            o21Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(yq0Var);
                            AndroidUtilities.runOnUIThread(yq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = o21Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                o21Var2.b.cancel();
                                o21Var2.b = null;
                            }
                            if (o21Var2.getVisibility() != 0) {
                                o21Var2.setAlpha(0.0f);
                                o21Var2.setVisibility(0);
                                ViewPropertyAnimator listener = o21Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                o21Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.y70) this.c).K((org.telegram.ui.Components.y70) this.b);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i33 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i33;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ns0(privacySettingsActivity, b2Var, setaccountttl, i15));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }

    public /* synthetic */ tv(org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.a = 27;
        this.c = y70Var;
        this.b = y70Var2;
    }
}
