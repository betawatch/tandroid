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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v80(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        tc1 tc1Var = (tc1) this.b;
        Context context = (Context) this.c;
        if (tc1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(tc1Var.getParentActivity(), null);
        a3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
        linearLayout.addView(textView, g7.e6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new jh.d(2));
        a3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.f6.F.size();
        for (int i9 = 0; i9 < size; i9++) {
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) org.telegram.ui.ActionBar.f6.F.get(i9);
            TLRPC.TL_theme tL_theme = e6Var.B;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(e6Var);
            }
        }
        ua1 ua1Var = new ua1(context, tc1Var, arrayList, new ArrayList(), a3Var);
        linearLayout.addView(ua1Var, g7.e6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        ua1Var.x1(tc1Var.fragmentView.getMeasuredWidth());
        tc1Var.showDialog(a3Var.a);
    }

    private final void b(View view) {
        mh1 mh1Var = (mh1) this.b;
        Context context = (Context) this.c;
        bg.g3 g3Var = mh1Var.I;
        if (g3Var != null) {
            g3Var.dismiss();
            mh1Var.I = null;
        }
        bg.g3 g3Var2 = new bg.g3(context, mh1Var.a, null, 4, new ih.j0());
        TLRPC.User user = mh1Var.c;
        long j10 = user != null ? user.id : 0L;
        TLRPC.User user2 = mh1Var.d;
        int i9 = 1;
        long[] jArr = {j10, user2 != null ? user2.id : 0L};
        for (int i10 = 0; i10 < 2; i10++) {
            g3Var2.y0.add(Long.valueOf(jArr[i10]));
        }
        g3Var2.g0(false, true);
        g3Var2.z0 = new org.telegram.ui.Components.qr(i9);
        mh1Var.I = g3Var2;
        g3Var2.show();
    }

    private final void c(View view) {
        b3.b bVar;
        kh.d dVar = (kh.d) this.b;
        int[] iArr = (int[]) this.c;
        if (dVar.J || (bVar = di1.d) == null) {
            return;
        }
        dVar.setLoading(true);
        Context applicationContext = view.getContext().getApplicationContext();
        try {
            byte[] j10 = bVar.j();
            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
            String str = (String) bVar.c;
            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
            i8.j0 j0Var = new i8.j0(t0Var, str, "/tg-wear-auth/answer", j10);
            t0Var.b.d(0, j0Var);
            x5.l.n(j0Var, i8.l0.a).addOnSuccessListener(new a7(bVar, dVar, iArr, 24)).addOnFailureListener(new ci1(dVar, 0));
        } catch (Exception e10) {
            FileLog.e(e10);
            dVar.setLoading(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c10;
        char c11;
        String formatString;
        int i9;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        String str;
        int i11 = 17;
        int i12 = 5;
        int i13 = 2;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                LocaleController.LocaleInfo[] localeInfoArr = (LocaleController.LocaleInfo[]) this.b;
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.c;
                Pattern pattern = LaunchActivity.x1;
                Integer num = (Integer) view.getTag();
                localeInfoArr[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                int i14 = 0;
                while (i14 < 2) {
                    q4VarArr[i14].a.a(i14 == num.intValue(), true);
                    i14++;
                }
                break;
            case 1:
                org.telegram.ui.Components.y4.y((Context) this.c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ra0((bb0) this.b, 0));
                break;
            case 2:
                bb0 bb0Var = (bb0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (bb0Var.e == null) {
                    ya0 ya0Var = bb0Var.f;
                    if (!ya0Var.e.h) {
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        Switch r42 = t8Var.e;
                        t8Var.setChecked(!r42.h);
                        bb0Var.r.setVisibility(r42.h ? 0 : 8);
                        int i15 = 0;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (!r42.h) {
                            bb0Var.f.setCheckBoxIcon(0);
                            bb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            qa0 qa0Var = new qa0(bb0Var, 1);
                            runnableArr[0] = qa0Var;
                            AndroidUtilities.runOnUIThread(qa0Var);
                            break;
                        } else {
                            bb0Var.f.setChecked(false);
                            bb0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            bb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            qa0 qa0Var2 = new qa0(bb0Var, i15);
                            runnableArr[0] = qa0Var2;
                            AndroidUtilities.runOnUIThread(qa0Var2, 60L);
                            break;
                        }
                    } else {
                        int i16 = -bb0Var.J;
                        bb0Var.J = i16;
                        AndroidUtilities.shakeViewSpring(ya0Var, i16);
                        break;
                    }
                }
                break;
            case 3:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.q0((jc0) this.c);
                hc0 hc0Var = pc0Var.E0;
                if (hc0Var != null) {
                    hc0Var.dismiss();
                    break;
                }
                break;
            case 4:
                mc0 mc0Var = (mc0) this.b;
                oc0 oc0Var = (oc0) this.c;
                pc0 pc0Var2 = mc0Var.b;
                pc0Var2.getClass();
                pc0Var2.B0.d(oc0Var.c, pc0Var2.C0, true, 0, 0L);
                pc0Var2.finishFragment();
                break;
            case 5:
                pd0 pd0Var = (pd0) this.b;
                Context context = (Context) this.c;
                String string = pd0Var.y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                    vz0Var.a |= 256;
                    vz0Var.b = indexOf;
                    int i17 = lastIndexOf + 1;
                    vz0Var.c = i17;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i17, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i18 = pd0Var.C;
                int i19 = i18 / 86400;
                int i20 = i18 % 86400;
                int i21 = i20 / 3600;
                int i22 = (i20 % 3600) / 60;
                if (i19 == 0 && i21 == 0) {
                    i22 = Math.max(1, i22);
                }
                if (i19 == 0 || i21 == 0) {
                    c10 = 0;
                    if (i21 == 0 || i22 == 0) {
                        c11 = 1;
                        formatString = i19 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i19, new Object[0])) : i21 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i19, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i22, new Object[0]));
                    } else {
                        c11 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i21, new Object[0]), LocaleController.formatPluralString("Minutes", i22, new Object[0]));
                    }
                } else {
                    c10 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i19, new Object[0]), LocaleController.formatPluralString("Hours", i21, new Object[0]));
                    c11 = 1;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = formatString;
                alertDialog$Builder.a.P = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new wt(pd0Var, 17));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 6:
                yd0 yd0Var = (yd0) this.b;
                Context context2 = (Context) this.c;
                fg0 fg0Var = yd0Var.y;
                if (fg0Var.R.getTag() == null) {
                    if (!yd0Var.n.has_recovery) {
                        AndroidUtilities.hideKeyboard(yd0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new wt(yd0Var, 18));
                        alertDialog$Builder2.o();
                        break;
                    } else {
                        fg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_requestPasswordRecovery, new wd0(yd0Var, 1), 10);
                        break;
                    }
                }
                break;
            case 7:
                jf0 jf0Var = (jf0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle = jf0Var.k0;
                if (bundle != null && (tL_auth_sentCode = jf0Var.l0) != null) {
                    jf0Var.o0.g1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!jf0Var.W) {
                    hf0 hf0Var = jf0Var.v;
                    if ((hf0Var == null || hf0Var.getVisibility() == 8) && !jf0Var.e0) {
                        if (jf0Var.c0 != 0) {
                            if (jf0Var.o0.R.getTag() == null) {
                                jf0Var.x();
                                break;
                            }
                        } else {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = jf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = jf0Var.c;
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
                            jf0Var.o0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, jf0Var.b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new yr(28, jf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new xe0(jf0Var, 1));
                            alertDialog$Builder3.o();
                            break;
                        }
                    }
                }
                break;
            case 8:
                eg0 eg0Var = (eg0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = eg0Var.K;
                if (toast != null) {
                    toast.cancel();
                    eg0Var.K = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (eg0Var.I <= 0 || currentTimeMillis - eg0Var.J <= 1500) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    eg0Var.I = 0;
                }
                int i23 = eg0Var.I + 1;
                eg0Var.I = i23;
                eg0Var.J = currentTimeMillis;
                if (i23 < 5) {
                    if (i23 > 1) {
                        Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i23, new Object[0]), 0);
                        eg0Var.K = makeText;
                        makeText.show();
                        break;
                    }
                } else {
                    eg0Var.I = i10;
                    eg0Var.J = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eg0Var.getContext());
                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.SettingsDebug);
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new hv(eg0Var, 1));
                    alertDialog$Builder4.o();
                    break;
                }
                break;
            case 9:
                ri0 ri0Var = (ri0) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                ti0 ti0Var = ri0Var.d;
                if (!ti0Var.Z(messageObject)) {
                    ti0Var.getOrCreateStoryViewer().F(ti0Var.getParentActivity(), messageObject.storyItem, ih.e7.a(ti0Var.f));
                    break;
                }
                break;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                passcodeActivity.s.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, atomicBoolean.get() ? org.telegram.ui.ActionBar.f6.l6 : org.telegram.ui.ActionBar.f6.H6, false));
                break;
            case 11:
                co0.g0((co0) this.b, (String) this.c, view);
                break;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.c;
                if (photoViewer.P4 != null) {
                    x60Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.i4;
                    if (o2Var instanceof qn) {
                        ((qn) o2Var).J9(photoViewer.P4, false, true);
                    }
                    ve.e.r(photoViewer.A, Uri.parse(photoViewer.P4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer2.H1() && !photoViewer2.r) {
                    int i24 = photoViewer2.L4;
                    if (i24 >= 0 && i24 < photoViewer2.c7.size()) {
                        Object obj = photoViewer2.c7.get(photoViewer2.L4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                kh.x3 x3Var = photoViewer2.g1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.g1 = null;
                                }
                                if (photoViewer2.A != null) {
                                    photoViewer2.g1 = new kh.x3(photoViewer2.A, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(isHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    append.setSpan(new org.telegram.ui.Components.eq(isHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.g1.t(append);
                                    photoViewer2.a0.addView(photoViewer2.g1, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.g1.setTranslationY(photoViewer2.L0.getTranslationY());
                                    photoViewer2.g1.n(0.0f, (photoViewer2.f1.getWidth() / 2.0f) + photoViewer2.f1.getX() + photoViewer2.D0.getX());
                                    kh.x3 x3Var2 = photoViewer2.g1;
                                    x3Var2.h0 = new xg(i13, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.v();
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
                            tt0 tt0Var = photoViewer2.a0;
                            org.telegram.ui.Components.e11 e11Var = new org.telegram.ui.Components.e11(activity);
                            e11Var.d = new org.telegram.ui.Components.tp0(e11Var, 17);
                            e11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(3.0f), -871296751));
                            e11Var.setTextColor(-1);
                            e11Var.setTextSize(1, 14.0f);
                            e11Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                            e11Var.setGravity(16);
                            tt0Var.addView(e11Var, g7.e6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            e11Var.setVisibility(8);
                            photoViewer2.i1 = e11Var;
                        }
                        photoViewer2.i1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        org.telegram.ui.Components.e11 e11Var2 = photoViewer2.i1;
                        org.telegram.ui.Components.w51 w51Var = photoViewer2.f1;
                        org.telegram.ui.Components.tp0 tp0Var = e11Var2.d;
                        if (w51Var != null) {
                            e11Var2.a = w51Var;
                            e11Var2.a();
                            e11Var2.c = true;
                            AndroidUtilities.cancelRunOnUIThread(tp0Var);
                            AndroidUtilities.runOnUIThread(tp0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = e11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                e11Var2.b.cancel();
                                e11Var2.b = null;
                            }
                            if (e11Var2.getVisibility() != 0) {
                                e11Var2.setAlpha(0.0f);
                                e11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = e11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                e11Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                ((org.telegram.ui.Components.x60) this.b).K((org.telegram.ui.Components.x60) this.c);
                break;
            case 15:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.H0.run();
                Integer num2 = (Integer) view.getTag();
                int i25 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? 182 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.c0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i25;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new kr0(privacySettingsActivity, c2Var, setaccountttl, i13));
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                ve.e.s(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 17:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity2.a1;
                long j11 = profileActivity2.A1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.C2;
                bq bqVar = new bq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                bqVar.T0 = new jy0(profileActivity2, chat, bqVar);
                profileActivity2.presentFragment(bqVar);
                break;
            case 18:
                k11 k11Var = (k11) this.b;
                Context context5 = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = k11Var.a[0].getText().toString();
                String obj3 = k11Var.a[3].getText().toString();
                String obj4 = k11Var.a[2].getText().toString();
                String obj5 = k11Var.a[1].getText().toString();
                String obj6 = k11Var.a[4].getText().toString();
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
                    if (k11Var.v == 1) {
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
                        StringBuilder n10 = e2.c.n(str);
                        n10.append(sb2.toString());
                        org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(context5, LocaleController.getString(R.string.ShareQrCode), n10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        wh0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        k11Var.showDialog(wh0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 19:
                q41 q41Var = (q41) this.b;
                Context context6 = (Context) this.c;
                if (q41Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    nl0 nl0Var = new nl0(i11, q41Var, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.y4.a;
                    if (context6 != null) {
                        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
                        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context6, null);
                        a3Var2.a();
                        org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(context6, null);
                        bc0Var.setTextColor(w02);
                        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        bc0Var.setItemCount(5);
                        org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context6, null);
                        a4Var.setItemCount(5);
                        a4Var.setTextColor(w02);
                        a4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context6, null);
                        b4Var.setItemCount(5);
                        b4Var.setTextColor(w02);
                        b4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(context6, bc0Var, a4Var, b4Var, 3);
                        r3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        r3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context6);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new jh.d(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bg.t tVar = new bg.t(context6, 18);
                        linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                        bc0Var.setMinValue(0);
                        bc0Var.setMaxValue(365);
                        bc0Var.setWrapSelectorWheel(false);
                        bc0Var.setFormatter(new tr(11));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(bc0Var, a4Var, b4Var, 16);
                        bc0Var.setOnValueChangedListener(aVar);
                        a4Var.setMinValue(0);
                        a4Var.setMaxValue(23);
                        linearLayout.addView(a4Var, g7.e6.l(0.2f, 0, 270));
                        a4Var.setFormatter(new tr(12));
                        a4Var.setOnValueChangedListener(aVar);
                        b4Var.setMinValue(0);
                        b4Var.setMaxValue(59);
                        b4Var.setValue(0);
                        b4Var.setFormatter(new tr(13));
                        linearLayout.addView(b4Var, g7.e6.l(0.3f, 0, 270));
                        b4Var.setOnValueChangedListener(aVar);
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
                                b4Var.setValue(calendar.get(12));
                                a4Var.setValue(calendar.get(11));
                                bc0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.y4.g(null, null, 0L, 0L, 0, bc0Var, a4Var, b4Var);
                        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        tVar.setGravity(17);
                        tVar.setTextColor(w04);
                        tVar.setTextSize(1, 14.0f);
                        tVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w05, w06, w06));
                        tVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                        tVar.setOnClickListener(new bg.h(bc0Var, (org.telegram.ui.Components.bc0) a4Var, (org.telegram.ui.Components.bc0) b4Var, calendar, (Object) nl0Var, a3Var2, 2));
                        a3Var2.b(r3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var2;
                    }
                    a3Var.a.setOnHideListener(new bg.j(13, q41Var, zArr));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    q41Var.w = f3Var2;
                    q41Var.c(false);
                    break;
                }
                break;
            case 20:
                o61 o61Var = (o61) this.b;
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) this.c;
                if (o61Var.V.g() != 0) {
                    kcVar.run(new ArrayList(o61Var.W.values()));
                    o61Var.dismiss();
                    break;
                }
                break;
            case 21:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.H0.run();
                Integer num3 = (Integer) view.getTag();
                int i26 = num3.intValue() == 0 ? 7 : num3.intValue() == 1 ? 90 : num3.intValue() == 2 ? 183 : num3.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i26;
                sessionsActivity.v = i26;
                k71 k71Var = sessionsActivity.a;
                if (k71Var != null) {
                    k71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ih.q5(i12));
                break;
            case 22:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(gh.oa.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 23:
                x81 x81Var = (x81) this.b;
                p91 p91Var = (p91) this.c;
                s91 s91Var = x81Var.Z;
                s91Var.getOrCreateStoryViewer().C(s91Var.getParentActivity(), p91Var.b(), s91Var.v0, ih.e7.a(s91Var.O));
                break;
            case 24:
                b91 b91Var = (b91) this.b;
                sf.f fVar = (sf.f) this.c;
                int i27 = b91Var.c;
                c91 c91Var = b91Var.d;
                org.telegram.ui.Components.d00 d00Var = b91Var.a;
                if (d00Var.c) {
                    ArrayList arrayList = c91Var.n;
                    qf.g gVar = c91Var.c;
                    int size = arrayList.size();
                    int i28 = 0;
                    while (true) {
                        if (i28 >= size) {
                            z10 = true;
                        } else if (i28 == i27 || !((b91) arrayList.get(i28)).a.c || !((b91) arrayList.get(i28)).a.b) {
                            i28++;
                        }
                    }
                    c91Var.f();
                    if (!z10) {
                        d00Var.setChecked(!d00Var.b);
                        fVar.n = d00Var.b;
                        c91Var.b.z();
                        if (c91Var.r.c > 0 && i27 < gVar.d.size()) {
                            ((sf.f) gVar.d.get(i27)).n = d00Var.b;
                            gVar.z();
                            break;
                        }
                    } else {
                        AndroidUtilities.shakeView(d00Var);
                        break;
                    }
                }
                break;
            case 25:
                aa1 aa1Var = (aa1) this.b;
                dy dyVar = (dy) this.c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(dyVar.getParentActivity());
                alertDialog$Builder5.a.N = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.a.P = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new nl0(19, aa1Var, dyVar));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder5.a;
                dyVar.showDialog(c2Var2);
                TextView textView2 = (TextView) c2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    break;
                }
                break;
            case 26:
                a(view);
                break;
            case 27:
                b(view);
                break;
            case 28:
                c(view);
                break;
            default:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                z zVar = (z) this.c;
                kVar.b = true;
                zVar.run();
                kVar.w.U2.N(true);
                break;
        }
    }
}
