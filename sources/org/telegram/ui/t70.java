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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t70(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        c91 c91Var = (c91) this.b;
        vf.f fVar = (vf.f) this.c;
        int i10 = c91Var.c;
        d91 d91Var = c91Var.d;
        org.telegram.ui.Components.o00 o00Var = c91Var.a;
        if (o00Var.c) {
            ArrayList arrayList = d91Var.n;
            tf.g gVar = d91Var.c;
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = true;
                    break;
                } else if (i11 != i10 && ((c91) arrayList.get(i11)).a.c && ((c91) arrayList.get(i11)).a.b) {
                    break;
                } else {
                    i11++;
                }
            }
            d91Var.f();
            if (z10) {
                AndroidUtilities.shakeView(o00Var);
                return;
            }
            o00Var.setChecked(!o00Var.b);
            fVar.n = o00Var.b;
            d91Var.b.z();
            if (d91Var.r.c <= 0 || i10 >= gVar.d.size()) {
                return;
            }
            ((vf.f) gVar.d.get(i10)).n = o00Var.b;
            gVar.z();
        }
    }

    private final void b(View view) {
        vc1 vc1Var = (vc1) this.b;
        Context context = (Context) this.c;
        if (vc1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(vc1Var.getParentActivity(), null);
        a3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
        linearLayout.addView(textView, i7.f6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new mh.d(2));
        a3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.g6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) org.telegram.ui.ActionBar.g6.F.get(i10);
            TLRPC.TL_theme tL_theme = f6Var.B;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(f6Var);
            }
        }
        va1 va1Var = new va1(context, vc1Var, arrayList, new ArrayList(), a3Var);
        linearLayout.addView(va1Var, i7.f6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        va1Var.x1(vc1Var.fragmentView.getMeasuredWidth());
        vc1Var.showDialog(a3Var.a);
    }

    private final void c(View view) {
        oh1 oh1Var = (oh1) this.b;
        Context context = (Context) this.c;
        eg.w2 w2Var = oh1Var.I;
        if (w2Var != null) {
            w2Var.dismiss();
            oh1Var.I = null;
        }
        eg.w2 w2Var2 = new eg.w2(context, oh1Var.a, null, 4, new lh.h0());
        TLRPC.User user = oh1Var.c;
        long j10 = user != null ? user.id : 0L;
        TLRPC.User user2 = oh1Var.d;
        int i10 = 1;
        long[] jArr = {j10, user2 != null ? user2.id : 0L};
        for (int i11 = 0; i11 < 2; i11++) {
            w2Var2.y0.add(Long.valueOf(jArr[i11]));
        }
        w2Var2.h0(false, true);
        w2Var2.z0 = new org.telegram.ui.Components.ur(i10);
        oh1Var.I = w2Var2;
        w2Var2.show();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c3;
        char c6;
        String formatString;
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        String str;
        a5.j jVar;
        int i12 = 17;
        int i13 = 5;
        int i14 = 2;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i15 = 0;
        switch (this.a) {
            case 0:
                x70 x70Var = (x70) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                x70Var.M.dismiss();
                if (!x70Var.b0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, x70Var.V);
                    a6 a6Var = new a6(bundle);
                    a6Var.d = x70Var.b0;
                    a6Var.U();
                    o2Var.presentFragment(a6Var);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("onlySelect", true);
                    bundle2.putBoolean("checkCanWrite", false);
                    int i16 = x70Var.V;
                    if (i16 == 1) {
                        bundle2.putInt("dialogsType", 6);
                    } else if (i16 == 2) {
                        bundle2.putInt("dialogsType", 5);
                    } else {
                        bundle2.putInt("dialogsType", 4);
                    }
                    bundle2.putBoolean("allowGlobalSearch", false);
                    fy fyVar = new fy(bundle2);
                    fyVar.y2 = new xr(14, x70Var, fyVar);
                    o2Var.presentFragment(fyVar);
                    break;
                }
            case 1:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.o4[] o4VarArr = (org.telegram.ui.Cells.o4[]) this.c;
                Pattern pattern = LaunchActivity.x1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.o4) view).getCurrentLocale();
                int i17 = 0;
                while (i17 < 2) {
                    o4VarArr[i17].a.a(i17 == num.intValue(), true);
                    i17++;
                }
                break;
            case 2:
                org.telegram.ui.Components.c5.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ua0((eb0) this.b, 0));
                break;
            case 3:
                eb0 eb0Var = (eb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (eb0Var.e == null) {
                    bb0 bb0Var = eb0Var.f;
                    if (!bb0Var.e.h) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        Switch r42 = q8Var.e;
                        q8Var.setChecked(!r42.h);
                        eb0Var.r.setVisibility(r42.h ? 0 : 8);
                        int i18 = 0;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            eb0Var.f.setCheckBoxIcon(0);
                            eb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            ta0 ta0Var = new ta0(eb0Var, 1);
                            runnableArr[0] = ta0Var;
                            AndroidUtilities.runOnUIThread(ta0Var);
                            break;
                        } else {
                            eb0Var.f.setChecked(false);
                            eb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            eb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            ta0 ta0Var2 = new ta0(eb0Var, i18);
                            runnableArr[0] = ta0Var2;
                            AndroidUtilities.runOnUIThread(ta0Var2, 60L);
                            break;
                        }
                    } else {
                        int i19 = -eb0Var.J;
                        eb0Var.J = i19;
                        AndroidUtilities.shakeViewSpring(bb0Var, i19);
                        break;
                    }
                }
                break;
            case 4:
                rc0 rc0Var = (rc0) this.b;
                rc0Var.r0((lc0) this.c);
                jc0 jc0Var = rc0Var.E0;
                if (jc0Var != null) {
                    jc0Var.dismiss();
                    break;
                }
                break;
            case 5:
                oc0 oc0Var = (oc0) this.b;
                qc0 qc0Var = (qc0) this.c;
                rc0 rc0Var2 = oc0Var.b;
                rc0Var2.getClass();
                rc0Var2.B0.d(qc0Var.c, rc0Var2.C0, true, 0, 0L);
                rc0Var2.finishFragment();
                break;
            case 6:
                pd0 pd0Var = (pd0) this.b;
                Context context = (Context) this.c;
                String string = pd0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                    h01Var.a |= 256;
                    h01Var.b = indexOf;
                    int i20 = lastIndexOf + 1;
                    h01Var.c = i20;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), indexOf, i20, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i21 = pd0Var.C;
                int i22 = i21 / 86400;
                int i23 = i21 % 86400;
                int i24 = i23 / 3600;
                int i25 = (i23 % 3600) / 60;
                if (i22 == 0 && i24 == 0) {
                    i25 = Math.max(1, i25);
                }
                if (i22 == 0 || i24 == 0) {
                    c3 = 0;
                    if (i24 == 0 || i25 == 0) {
                        c6 = 1;
                        formatString = i22 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i22, new Object[0])) : i24 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i22, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i25, new Object[0]));
                    } else {
                        c6 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i24, new Object[0]), LocaleController.formatPluralString("Minutes", i25, new Object[0]));
                    }
                } else {
                    c3 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i22, new Object[0]), LocaleController.formatPluralString("Hours", i24, new Object[0]));
                    c6 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c3] = spannableStringBuilder;
                charSequenceArr[c6] = formatString;
                alertDialog$Builder.a.P = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new xt(pd0Var, 17));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 7:
                xd0 xd0Var = (xd0) this.b;
                Context context2 = (Context) this.c;
                fg0 fg0Var = xd0Var.y;
                if (fg0Var.R.getTag() == null) {
                    if (!xd0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(xd0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new xt(xd0Var, 18));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        fg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new vd0(xd0Var, 1), 10);
                        break;
                    }
                }
                break;
            case 8:
                if0 if0Var = (if0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = if0Var.k0;
                if (bundle3 != null && (tL_auth_sentCode = if0Var.l0) != null) {
                    if0Var.o0.g1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!if0Var.W) {
                    gf0 gf0Var = if0Var.v;
                    if ((gf0Var == null || gf0Var.getVisibility() == 8) && !if0Var.e0) {
                        if (if0Var.c0 != 0) {
                            if (if0Var.o0.R.getTag() == null) {
                                if0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = if0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = if0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            if0Var.o0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, if0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new xr(28, if0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new we0(if0Var, 1));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 9:
                eg0 eg0Var = (eg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = eg0Var.K;
                if (toast != null) {
                    toast.cancel();
                    eg0Var.K = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (eg0Var.I <= 0 || currentTimeMillis - eg0Var.J <= 1500) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    eg0Var.I = 0;
                }
                int i26 = eg0Var.I + 1;
                eg0Var.I = i26;
                eg0Var.J = currentTimeMillis;
                if (i26 < 5) {
                    if (i26 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i26, new Object[0]), 0);
                        eg0Var.K = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    eg0Var.I = i11;
                    eg0Var.J = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eg0Var.getContext());
                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new iv(eg0Var, 1));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 10:
                qi0 qi0Var = (qi0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                si0 si0Var = qi0Var.d;
                if (!si0Var.a0(messageObject)) {
                    si0Var.getOrCreateStoryViewer().G(si0Var.getParentActivity(), messageObject.storyItem, lh.b7.a(si0Var.f));
                    break;
                }
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.g6.l6 : org.telegram.ui.ActionBar.g6.H6, false));
                break;
            case 12:
                bo0.h0((bo0) this.b, (String) this.c, view);
                break;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.j70 j70Var = (org.telegram.ui.Components.j70) this.c;
                if (photoViewer.P4 != null) {
                    j70Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer.i4;
                    if (o2Var2 instanceof tn) {
                        ((tn) o2Var2).J9(photoViewer.P4, false, true);
                    }
                    ye.d.r(photoViewer.A, Uri.parse(photoViewer.P4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i27 = photoViewer2.L4;
                    if (i27 >= 0 && i27 < photoViewer2.c7.size()) {
                        Object obj = photoViewer2.c7.get(photoViewer2.L4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                nh.t3 t3Var = photoViewer2.g1;
                                if (t3Var != null) {
                                    t3Var.e(true);
                                    photoViewer2.g1 = null;
                                }
                                if (photoViewer2.A != null) {
                                    photoViewer2.g1 = new nh.t3(photoViewer2.A, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.iq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.g1.t(append);
                                    photoViewer2.a0.addView(photoViewer2.g1, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.g1.setTranslationY(photoViewer2.L0.getTranslationY());
                                    photoViewer2.g1.n(0.0f, (photoViewer2.f1.getWidth() / 2.0f) + photoViewer2.f1.getX() + photoViewer2.D0.getX());
                                    nh.t3 t3Var2 = photoViewer2.g1;
                                    t3Var2.h0 = new wg(i14, t3Var2);
                                    t3Var2.d = 3500L;
                                    t3Var2.v();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.f1.getTag() != null) {
                        photoViewer2.Y2(true);
                        photoViewer2.p2(1);
                        break;
                    } else if (photoViewer2.f8) {
                        if (photoViewer2.i1 == null) {
                            rt0 rt0Var = photoViewer2.a0;
                            org.telegram.ui.Components.q11 q11Var = new org.telegram.ui.Components.q11(activity);
                            q11Var.d = new org.telegram.ui.Components.fq0(q11Var, 17);
                            q11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            q11Var.setTextColor(-1);
                            q11Var.setTextSize(1, 14.0f);
                            q11Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            q11Var.setGravity(16);
                            rt0Var.addView(q11Var, i7.f6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            q11Var.setVisibility(8);
                            photoViewer2.i1 = q11Var;
                        }
                        photoViewer2.i1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.q11 q11Var2 = photoViewer2.i1;
                        org.telegram.ui.Components.j61 j61Var = photoViewer2.f1;
                        org.telegram.ui.Components.fq0 fq0Var = q11Var2.d;
                        if (j61Var != null) {
                            q11Var2.a = j61Var;
                            q11Var2.a();
                            q11Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(fq0Var);
                            AndroidUtilities.runOnUIThread(fq0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = q11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                q11Var2.b.cancel();
                                q11Var2.b = null;
                            }
                            if (q11Var2.getVisibility() != 0) {
                                q11Var2.setAlpha(0.0f);
                                q11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = q11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                q11Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.j70) this.b).K((org.telegram.ui.Components.j70) this.c);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.H0.run();
                Integer num2 = (Integer) view.getTag();
                int i28 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.c0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i28;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new jr0(privacySettingsActivity, c2Var, setaccountttl, i14));
                break;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.mc.e();
                ye.d.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity2.a1;
                long j11 = profileActivity2.A1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.C2;
                dq dqVar = new dq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                dqVar.T0 = new jy0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                break;
            case 19:
                l11 l11Var = (l11) this.b;
                Context context5 = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = l11Var.a[0].getText().toString();
                String obj3 = l11Var.a[3].getText().toString();
                String obj4 = l11Var.a[2].getText().toString();
                String obj5 = l11Var.a[1].getText().toString();
                String obj6 = l11Var.a[4].getText().toString();
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
                    if (l11Var.v == 1) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
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
                    }
                    if (sb2.length() != 0) {
                        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
                        n10.append(sb2.toString());
                        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context5, LocaleController.getString(R.string.ShareQrCode), n10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        gi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        l11Var.showDialog(gi0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 20:
                s41 s41Var = (s41) this.b;
                Context context6 = (Context) this.c;
                if (s41Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    kl0 kl0Var = new kl0(i12, s41Var, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.c5.a;
                    if (context6 != null) {
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context6, null);
                        a3Var2.a();
                        org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(context6, null);
                        qc0Var2.setTextColor(w02);
                        qc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
                        qc0Var2.setItemCount(5);
                        org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context6, null);
                        e4Var.setItemCount(5);
                        e4Var.setTextColor(w02);
                        e4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context6, null);
                        f4Var.setItemCount(5);
                        f4Var.setTextColor(w02);
                        f4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context6, qc0Var2, e4Var, f4Var, 3);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        v3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new mh.d(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        eg.r rVar = new eg.r(context6, 16);
                        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                        qc0Var2.setMinValue(0);
                        qc0Var2.setMaxValue(365);
                        qc0Var2.setWrapSelectorWheel(false);
                        qc0Var2.setFormatter(new org.telegram.ui.Components.n0(5));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(qc0Var2, e4Var, f4Var, 14);
                        qc0Var2.setOnValueChangedListener(aVar);
                        e4Var.setMinValue(0);
                        e4Var.setMaxValue(23);
                        linearLayout.addView(e4Var, i7.f6.l(0.2f, 0, 270));
                        e4Var.setFormatter(new org.telegram.ui.Components.n0(6));
                        e4Var.setOnValueChangedListener(aVar);
                        f4Var.setMinValue(0);
                        f4Var.setMaxValue(59);
                        f4Var.setValue(0);
                        f4Var.setFormatter(new org.telegram.ui.Components.n0(7));
                        linearLayout.addView(f4Var, i7.f6.l(0.3f, 0, 270));
                        f4Var.setOnValueChangedListener(aVar);
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
                                f4Var.setValue(calendar.get(12));
                                e4Var.setValue(calendar.get(11));
                                qc0Var2.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, qc0Var2, e4Var, f4Var);
                        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        rVar.setGravity(17);
                        rVar.setTextColor(w04);
                        rVar.setTextSize(1, 14.0f);
                        rVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
                        rVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.a3 a3Var3 = a3Var2;
                        rVar.setOnClickListener(new eg.f(qc0Var2, (org.telegram.ui.Components.qc0) e4Var, (org.telegram.ui.Components.qc0) f4Var, calendar, (Object) kl0Var, a3Var2, 2));
                        a3Var3.b(v3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var3.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var3;
                    }
                    a3Var.a.setOnHideListener(new eg.g(10, s41Var, zArr));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    s41Var.w = f3Var2;
                    s41Var.c(false);
                    break;
                }
                break;
            case 21:
                q61 q61Var = (q61) this.b;
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.c;
                if (q61Var.V.g() != 0) {
                    pcVar.run(new ArrayList(q61Var.W.values()));
                    q61Var.dismiss();
                    break;
                }
                break;
            case 22:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.H0.run();
                Integer num3 = (Integer) view.getTag();
                int i29 = num3.intValue() == 0 ? 7 : num3.intValue() == 1 ? 90 : num3.intValue() == 2 ? 183 : num3.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i29;
                sessionsActivity.v = i29;
                n71 n71Var = sessionsActivity.a;
                if (n71Var != null) {
                    n71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new lh.o5(i13));
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(jh.ia.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 24:
                y81 y81Var = (y81) this.b;
                q91 q91Var = (q91) this.c;
                t91 t91Var = y81Var.Z;
                t91Var.getOrCreateStoryViewer().C(t91Var.getParentActivity(), q91Var.b(), t91Var.v0, lh.b7.a(t91Var.O));
                break;
            case 25:
                a(view);
                break;
            case 26:
                ba1 ba1Var = (ba1) this.b;
                fy fyVar2 = (fy) this.c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fyVar2.getParentActivity());
                alertDialog$Builder5.a.N = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.a.P = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new kl0(19, ba1Var, fyVar2));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder5.a;
                fyVar2.showDialog(c2Var2);
                TextView textView2 = (TextView) c2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    break;
                }
                break;
            case 27:
                b(view);
                break;
            case 28:
                c(view);
                break;
            default:
                nh.d dVar = (nh.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.J && (jVar = ei1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = jVar.h();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) jVar.c;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        k8.j0 j0Var = new k8.j0(t0Var, str2, "/tg-wear-auth/answer", h);
                        t0Var.b.d(0, j0Var);
                        z5.l.n(j0Var, k8.l0.a).addOnSuccessListener(new z6(jVar, dVar, iArr, 24)).addOnFailureListener(new di1(dVar, i15));
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        dVar.setLoading(false);
                    }
                }
                break;
        }
    }
}
