package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        String str;
        a8.me meVar;
        int i12 = 21;
        int i13 = 19;
        int i14 = 3;
        int i15 = 2;
        org.telegram.ui.ActionBar.e3 e3Var = null;
        int i16 = 0;
        switch (this.a) {
            case 0:
                ae0 ae0Var = (ae0) this.c;
                Context context = (Context) this.b;
                ig0 ig0Var = ae0Var.y;
                if (ig0Var.V.getTag() == null) {
                    if (ae0Var.n.has_recovery) {
                        ig0Var.s1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new xd0(ae0Var, 1), 10);
                        break;
                    } else {
                        AndroidUtilities.hideKeyboard(ae0Var.a);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new st(ae0Var, 19));
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
            case 1:
                lf0 lf0Var = (lf0) this.c;
                Context context2 = (Context) this.b;
                Bundle bundle = lf0Var.q0;
                if (bundle != null && (tL_auth_sentCode = lf0Var.r0) != null) {
                    lf0Var.u0.l1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!lf0Var.f0) {
                    jf0 jf0Var = lf0Var.v;
                    if ((jf0Var == null || jf0Var.getVisibility() == 8) && !lf0Var.k0) {
                        if (lf0Var.i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = lf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = lf0Var.c;
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
                            lf0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, lf0Var.b));
                            alertDialog$Builder2.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new cf0(0, lf0Var, context2));
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder2.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new af0(lf0Var, 1));
                            alertDialog$Builder2.p();
                            break;
                        } else if (lf0Var.u0.V.getTag() == null) {
                            lf0Var.w();
                            break;
                        }
                    }
                }
                break;
            case 2:
                hg0 hg0Var = (hg0) this.c;
                Context context3 = (Context) this.b;
                Toast toast = hg0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    hg0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (hg0Var.O <= 0 || currentTimeMillis - hg0Var.P <= 1500) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    hg0Var.O = 0;
                }
                int i17 = hg0Var.O + 1;
                hg0Var.O = i17;
                hg0Var.P = currentTimeMillis;
                if (i17 >= 5) {
                    hg0Var.O = i11;
                    hg0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hg0Var.getContext());
                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder3.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new n4(hg0Var, i15));
                    alertDialog$Builder3.p();
                    break;
                } else if (i17 > 1) {
                    Toast makeText = Toast.makeText(context3, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i17, new Object[0]), 0);
                    hg0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 3:
                vi0 vi0Var = (vi0) this.c;
                MessageObject messageObject = (MessageObject) this.b;
                xi0 xi0Var = vi0Var.d;
                if (!xi0Var.c0(messageObject)) {
                    xi0Var.getOrCreateStoryViewer().G(xi0Var.getParentActivity(), messageObject.storyItem, di.q7.a(xi0Var.f));
                    break;
                }
                break;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.f7.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.y6.l6 : org.telegram.ui.ActionBar.y6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 5:
                ro0.i0((ro0) this.c, (String) this.b, view);
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.b;
                if (photoViewer.T4 != null) {
                    l80Var.u();
                    org.telegram.ui.ActionBar.r2 r2Var = photoViewer.m4;
                    if (r2Var instanceof wn) {
                        ((wn) r2Var).W9(photoViewer.T4, false, true);
                    }
                    qf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.K1() && !photoViewer2.r) {
                    int i18 = photoViewer2.P4;
                    if (i18 >= 0 && i18 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                fi.v3 v3Var = photoViewer2.k1;
                                if (v3Var != null) {
                                    v3Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new fi.v3(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.zq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, org.telegram.ui.Components.kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    fi.v3 v3Var2 = photoViewer2.k1;
                                    v3Var2.l0 = new hh(i14, v3Var2);
                                    v3Var2.d = 3500L;
                                    v3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.b3(true);
                        photoViewer2.s2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            ku0 ku0Var = photoViewer2.e0;
                            org.telegram.ui.Components.j31 j31Var = new org.telegram.ui.Components.j31(activity);
                            j31Var.d = new org.telegram.ui.Components.np0(j31Var, 23);
                            j31Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(3.0f), -871296751));
                            j31Var.setTextColor(-1);
                            j31Var.setTextSize(1, 14.0f);
                            j31Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            j31Var.setGravity(16);
                            ku0Var.addView(j31Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            j31Var.setVisibility(8);
                            photoViewer2.m1 = j31Var;
                        }
                        photoViewer2.m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.j31 j31Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.g81 g81Var = photoViewer2.j1;
                        org.telegram.ui.Components.np0 np0Var = j31Var2.d;
                        if (g81Var != null) {
                            j31Var2.a = g81Var;
                            j31Var2.a();
                            j31Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(np0Var);
                            AndroidUtilities.runOnUIThread(np0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = j31Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                j31Var2.b.cancel();
                                j31Var2.b = null;
                            }
                            if (j31Var2.getVisibility() != 0) {
                                j31Var2.setAlpha(0.0f);
                                j31Var2.setVisibility(0);
                                ViewPropertyAnimator listener = j31Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                j31Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Components.l80) this.c).K((org.telegram.ui.Components.l80) this.b);
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.N0.run();
                Integer num = (Integer) view.getTag();
                int i19 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 182 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(privacySettingsActivity.getParentActivity(), 3, null);
                e2Var.i0 = false;
                e2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i19;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new cs0(privacySettingsActivity, e2Var, setaccountttl, i15));
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.b;
                int i20 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                long j10 = profileActivity2.e1;
                long j11 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                iq iqVar = new iq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                iqVar.X0 = new zy0(profileActivity2, chat, iqVar);
                profileActivity2.presentFragment(iqVar);
                break;
            case 12:
                d21 d21Var = (d21) this.c;
                Context context4 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = d21Var.a[0].getText().toString();
                String obj3 = d21Var.a[3].getText().toString();
                String obj4 = d21Var.a[2].getText().toString();
                String obj5 = d21Var.a[1].getText().toString();
                String obj6 = d21Var.a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (d21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        str = "https://t.me/socks?";
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context4, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        jj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        d21Var.showDialog(jj0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 13:
                u41 u41Var = (u41) this.c;
                Context context5 = (Context) this.b;
                if (u41Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    cf0 cf0Var = new cf0(i13, u41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    if (context5 != null) {
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
                        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context5, null);
                        e3Var2.a();
                        org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(context5, null);
                        nd0Var.setTextColor(x02);
                        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        nd0Var.setItemCount(5);
                        org.telegram.ui.Components.i4 i4Var = new org.telegram.ui.Components.i4(context5, null);
                        i4Var.setItemCount(5);
                        i4Var.setTextColor(x02);
                        i4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(context5, null);
                        j4Var.setItemCount(5);
                        j4Var.setTextColor(x02);
                        j4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context5, nd0Var, i4Var, j4Var, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        y3Var.addView(frameLayout, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context5);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new ei.d(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, org.telegram.ui.Components.kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.md mdVar = new bi.md(context5, 17);
                        linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                        nd0Var.setMinValue(0);
                        nd0Var.setMaxValue(365);
                        nd0Var.setWrapSelectorWheel(false);
                        nd0Var.setFormatter(new cg(19));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(nd0Var, i4Var, j4Var, 18);
                        nd0Var.setOnValueChangedListener(aVar);
                        i4Var.setMinValue(0);
                        i4Var.setMaxValue(23);
                        linearLayout.addView(i4Var, org.telegram.ui.Components.kb1.p(0.2f, 0, 270));
                        i4Var.setFormatter(new cg(20));
                        i4Var.setOnValueChangedListener(aVar);
                        j4Var.setMinValue(0);
                        j4Var.setMaxValue(59);
                        j4Var.setValue(0);
                        j4Var.setFormatter(new cg(21));
                        linearLayout.addView(j4Var, org.telegram.ui.Components.kb1.p(0.3f, 0, 270));
                        j4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                j4Var.setValue(calendar.get(12));
                                i4Var.setValue(calendar.get(11));
                                nd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.g(null, null, 0L, 0L, 0, nd0Var, i4Var, j4Var);
                        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        mdVar.setGravity(17);
                        mdVar.setTextColor(x04);
                        mdVar.setTextSize(1, 14.0f);
                        mdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x05, x06, x06));
                        mdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(mdVar, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(nd0Var, i4Var, j4Var, calendar, cf0Var, e3Var2, 1);
                        org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                        mdVar.setOnClickListener(m0Var);
                        e3Var3.b(y3Var);
                        org.telegram.ui.ActionBar.k3 k3Var = e3Var3.a;
                        k3Var.show();
                        k3Var.setBackgroundColor(x03);
                        k3Var.fixNavigationBar(x03);
                        e3Var = e3Var3;
                    }
                    e3Var.a.setOnHideListener(new bi.u3(u41Var, zArr, 13));
                    org.telegram.ui.ActionBar.k3 k3Var2 = e3Var.a;
                    k3Var2.show();
                    u41Var.w = k3Var2;
                    u41Var.c(false);
                    break;
                }
                break;
            case 14:
                s61 s61Var = (s61) this.c;
                bi.f4 f4Var = (bi.f4) this.b;
                if (s61Var.Z.g() != 0) {
                    f4Var.run(new ArrayList(s61Var.a0.values()));
                    s61Var.dismiss();
                    break;
                }
                break;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                ((AlertDialog$Builder) this.b).a.N0.run();
                Integer num2 = (Integer) view.getTag();
                int i21 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 183 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i21;
                sessionsActivity.s = i21;
                p71 p71Var = sessionsActivity.a;
                if (p71Var != null) {
                    p71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new di.d6(r9));
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                editTextBoldCursor.setText(bi.dd.L0(((Long) this.b).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 17:
                d91 d91Var = (d91) this.c;
                v91 v91Var = (v91) this.b;
                y91 y91Var = d91Var.d0;
                y91Var.getOrCreateStoryViewer().D(y91Var.getParentActivity(), v91Var.b(), y91Var.C0, di.q7.a(y91Var.S));
                break;
            case 18:
                h91 h91Var = (h91) this.c;
                mg.f fVar = (mg.f) this.b;
                int i22 = h91Var.c;
                i91 i91Var = h91Var.d;
                org.telegram.ui.Components.a10 a10Var = h91Var.a;
                if (a10Var.c) {
                    ArrayList arrayList = i91Var.n;
                    kg.h hVar = i91Var.c;
                    int size = arrayList.size();
                    int i23 = 0;
                    while (true) {
                        if (i23 >= size) {
                            i16 = 1;
                        } else if (i23 == i22 || !((h91) arrayList.get(i23)).a.c || !((h91) arrayList.get(i23)).a.b) {
                            i23++;
                        }
                    }
                    i91Var.f();
                    if (i16 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        break;
                    } else {
                        a10Var.setChecked(!a10Var.b);
                        fVar.n = a10Var.b;
                        i91Var.b.z();
                        if (i91Var.r.c > 0 && i22 < hVar.d.size()) {
                            ((mg.f) hVar.d.get(i22)).n = a10Var.b;
                            hVar.z();
                            break;
                        }
                    }
                }
                break;
            case 19:
                ga1 ga1Var = (ga1) this.c;
                ey eyVar = (ey) this.b;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eyVar.getParentActivity());
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.k(LocaleController.getString(R.string.CacheClear), new cf0(i12, ga1Var, eyVar));
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder4.a;
                eyVar.showDialog(e2Var2);
                TextView textView2 = (TextView) e2Var2.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                    break;
                }
                break;
            case 20:
                ad1 ad1Var = (ad1) this.c;
                Context context6 = (Context) this.b;
                if (ad1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3Var4 = new org.telegram.ui.ActionBar.e3(ad1Var.getParentActivity(), null);
                    e3Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context6);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context6);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.t.r(textView3, org.telegram.ui.ActionBar.y6.j5, null, 1, 20.0f);
                    linearLayout2.addView(textView3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ei.d(2));
                    e3Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.y6.F.size();
                    while (i16 < size2) {
                        org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) org.telegram.ui.ActionBar.y6.F.get(i16);
                        TLRPC.TL_theme tL_theme = x6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(x6Var);
                        }
                        i16++;
                    }
                    ab1 ab1Var = new ab1(context6, ad1Var, arrayList2, new ArrayList(), e3Var4);
                    linearLayout2.addView(ab1Var, org.telegram.ui.Components.kb1.o(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ab1Var.D1(ad1Var.fragmentView.getMeasuredWidth());
                    ad1Var.showDialog(e3Var4.a);
                    break;
                }
                break;
            case 21:
                rh1 rh1Var = (rh1) this.c;
                Context context7 = (Context) this.b;
                vg.n1 n1Var = rh1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    rh1Var.M = null;
                }
                vg.n1 n1Var2 = new vg.n1(context7, rh1Var.a, null, 4, new di.k0());
                TLRPC.User user = rh1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = rh1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i24 = 0; i24 < 2; i24++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i24]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new jh.b(i15);
                rh1Var.M = n1Var2;
                n1Var2.show();
                break;
            case 22:
                fi.d dVar = (fi.d) this.c;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.b;
                if (!dVar.Q) {
                    j2Var.dismiss();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.c;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.b;
                if (!a2Var.m) {
                    i2Var.dismiss();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.c;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.b;
                if (y2Var.e && !y2Var.R) {
                    org.telegram.ui.Wallet.m5.F0(y2Var.getContext(), r2Var2.getCurrentAccount(), r2Var2.getResourceProvider());
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Wallet.i4 i4Var2 = (org.telegram.ui.Wallet.i4) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.b;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    i4Var2.dismiss();
                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9();
                    r9Var.j0(nftitem);
                    U.presentFragment(r9Var);
                    break;
                }
                break;
            case 26:
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.b;
                runnable.run();
                j2VarArr[0].dismiss();
                break;
            case 27:
                org.telegram.ui.Wallet.m5.h0((org.telegram.ui.Wallet.m5) this.c, (Context) this.b, view);
                break;
            case 28:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.c;
                TextView textView4 = (TextView) this.b;
                y1Var.c(!y1Var.b(), true);
                textView4.setVisibility(y1Var.b() ? 0 : 8);
                break;
            default:
                fi.d dVar2 = (fi.d) this.c;
                int[] iArr = (int[]) this.b;
                if (!dVar2.Q && (meVar = ki1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] q5 = meVar.q();
                        a6.a aVar2 = new a6.a(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) meVar.c;
                        com.google.android.gms.common.api.internal.s0 s0Var = aVar2.h;
                        c8.e eVar = new c8.e(s0Var, str2, "/tg-wear-auth/answer", q5);
                        s0Var.b.d(0, eVar);
                        o6.l.n(eVar, z8.k0.a).addOnSuccessListener(new e7(meVar, dVar2, iArr, 24)).addOnFailureListener(new ii1(dVar2, i16));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        dVar2.setLoading(false);
                    }
                }
                break;
        }
    }
}
