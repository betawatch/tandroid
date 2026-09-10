package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i10;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        s4.c1 T;
        int i11 = this.a;
        int i12 = 13;
        int i13 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 1:
                eo.z1((eo) obj2, (Context) obj);
                break;
            case 2:
                yo yoVar = (yo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
                org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.j6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
                linearLayout.addView(f7, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.k6[] k6VarArr = new org.telegram.ui.Cells.k6[2];
                int i14 = 0;
                while (i14 < i13) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, true);
                    k6VarArr[i14] = k6Var;
                    k6Var.setTag(Integer.valueOf(i14));
                    k6VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i14 == 0) {
                        k6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !yoVar.J0);
                    } else if (ChatObject.isChannel(yoVar.x0)) {
                        k6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, yoVar.J0);
                    } else {
                        k6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, yoVar.J0);
                    }
                    f7.addView(k6VarArr[i14], w7.a6.n(-1, -2));
                    k6VarArr[i14].setOnClickListener(new a0(yoVar, k6VarArr, c3Var, 8));
                    i14++;
                    i13 = 2;
                }
                c3Var.b(linearLayout);
                yoVar.showDialog(h3Var);
                break;
            case 3:
                yo.U((yo) obj2, (FrameLayout) obj, view);
                break;
            case 4:
                rq.V((rq) obj2, (org.telegram.ui.ActionBar.c3) obj, view);
                break;
            case 5:
                new qg.a1(((org.telegram.ui.Components.g0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.f6) obj).show();
                break;
            case 6:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 7:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 8:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) obj;
                w0Var.M(null, null);
                w0Var.G(b5Var.d, false);
                w0Var.setupPopupRadialSelectors(b5Var.f);
                w0Var.B(b5Var.e);
                break;
            case 9:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((bi.g2) obj).run();
                break;
            case 10:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((nu) obj).onClick(null, intValue);
                break;
            case 11:
                runnable = ((org.telegram.ui.ActionBar.c3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 12:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 13:
                org.telegram.ui.Components.j8.E((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                break;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.w70) obj).u();
                j8Var.t0(7);
                break;
            case 15:
                org.telegram.ui.Components.ba0 ba0Var = (org.telegram.ui.Components.ba0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.h3) j8Var2).currentAccount;
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ba0Var.getText().toString())) {
                    String charSequence = ba0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof wy) {
                        wy wyVar = (wy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = wyVar.getMessagesController().getTotalDialogsCount();
                        if (!wyVar.l2 && (totalDialogsCount > 10 || wyVar.K)) {
                            if (wyVar.j2) {
                                wyVar.X.r.setText(charSequence);
                                wyVar.X.r.setSelection(charSequence.length());
                                gy gyVar = wyVar.C0;
                                if (gyVar != null && (L = gyVar.L(3)) >= 0 && wyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    wyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                wyVar.x = 3;
                                wyVar.X.r.setText(charSequence);
                                wyVar.X.r.setSelection(charSequence.length());
                            }
                            j8Var2.dismiss();
                            break;
                        }
                    }
                    wy wyVar2 = new wy(null);
                    wyVar2.n2 = charSequence;
                    wyVar2.x = 3;
                    launchActivity.q0(wyVar2, false, false);
                    j8Var2.dismiss();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) obj2;
                ((boolean[]) obj)[0] = true;
                d9Var.J.v1(d9Var.Y);
                d9Var.S.dismiss();
                break;
            case 17:
                org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(caVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = caVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) caVar.getContext(), caVar.n.document)) {
                            FileLoader.getInstance(caVar.s).loadFile(caVar.n.document, "update", 3, 1);
                            caVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(caVar.getContext(), caVar.n.url);
                        break;
                    }
                }
                break;
            case 18:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.w70 w70Var = jdVar.X0;
                if (w70Var == null || !w70Var.D()) {
                    jdVar.d1.e(true);
                    org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(frameLayout, new zh.b(), jdVar.V0);
                    jdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    jdVar.X0.k();
                    int[] iArr = jdVar.c1;
                    int length = iArr.length;
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = iArr[i15];
                        jdVar.X0.c(0, i16 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i16 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i16, new Object[0]), new bi.s(jdVar, i16, 29), false);
                        if (jdVar.b1 == i16) {
                            jdVar.X0.L();
                        }
                    }
                    jdVar.X0.Z();
                    break;
                } else {
                    jdVar.X0.u();
                    jdVar.X0 = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.il ilVar = (org.telegram.ui.Components.il) obj2;
                org.telegram.ui.Components.kl klVar = (org.telegram.ui.Components.kl) obj;
                org.telegram.ui.Components.ll llVar = ilVar.b;
                org.telegram.ui.Components.yi yiVar = llVar.b;
                eo eoVar = (eo) yiVar.f0;
                if (eoVar.c()) {
                    parentActivity = llVar.getParentActivity();
                    org.telegram.ui.Components.d5.M(parentActivity, eoVar.a(), new oe(28, ilVar, klVar), llVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.d5.a0(yiVar.J1, yiVar.j1() + 1, yiVar.n1(), new pf(i12, ilVar, klVar));
                    break;
                }
            case 20:
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.xn) obj2).d;
                ic1 ic1Var = znVar.s;
                View F2 = ic1Var.F((org.telegram.ui.Components.wn) obj);
                s4.c1 T2 = F2 != null ? ic1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - znVar.t0) >= 0 && b10 < znVar.K.length) {
                    org.telegram.ui.Components.zn.O(znVar, b10);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.jo joVar = (org.telegram.ui.Components.jo) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                eo eoVar2 = joVar.G;
                if (joVar.T) {
                    eoVar2.showDialog(org.telegram.ui.Components.d5.V(joVar.getContext(), eoVar2.h, f6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.fo foVar = joVar.e;
                    if (eoVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = eoVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = eoVar2.Z7;
                            TLRPC.UserFull userFull = eoVar2.a8;
                            int i17 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(joVar.getContext(), null, new org.telegram.ui.Components.go(joVar, r4), true, 0, joVar.d0);
                            o8Var.b(i17);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.a;
                            org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(joVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.p1[] p1VarArr = {hoVar};
                            hoVar.e = true;
                            hoVar.c = 220;
                            hoVar.setOutsideTouchable(true);
                            p1VarArr[0].setClippingEnabled(true);
                            p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            p1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            p1VarArr[0].setInputMethodMode(2);
                            p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            p1VarArr[0].showAtLocation(foVar, 0, (int) (joVar.getX() + foVar.getX()), (int) foVar.getY());
                            eoVar2.g8(false, true, 0.2f);
                            break;
                        } else if (joVar.a.f && eoVar2.getParentActivity() != null && eoVar2.fragmentView != null && eoVar2.Z7 != null) {
                            if (eoVar2.o2 == null) {
                                org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(7, eoVar2.getParentActivity(), eoVar2.ea, true);
                                eoVar2.o2 = s40Var;
                                s40Var.setAlpha(0.0f);
                                eoVar2.o2.setVisibility(4);
                                eoVar2.o2.setShowingDuration(4000L);
                                eoVar2.X0.addView(eoVar2.o2, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i18 = eoVar2.Z7.ttl_period;
                            eoVar2.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i18 > 86400 ? LocaleController.formatPluralString("Days", i18 / 86400, new Object[0]) : i18 >= 3600 ? LocaleController.formatPluralString("Hours", i18 / 3600, new Object[0]) : i18 >= 60 ? LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i18, new Object[0])));
                            eoVar2.o2.f(eoVar2.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 22:
                org.telegram.ui.Components.sp.n((org.telegram.ui.Components.sp) obj2, (eo) obj);
                break;
            case 23:
                org.telegram.ui.Components.sr.P((org.telegram.ui.Components.sr) obj2, (TLRPC.Peer) obj);
                break;
            case 24:
                org.telegram.ui.Components.as asVar = (org.telegram.ui.Components.as) obj2;
                String str = (String) obj;
                if (asVar.b == null && (view2 = asVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        asVar.b = (EditText) findFocus;
                    }
                }
                if (asVar.b != null) {
                    try {
                        asVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = asVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = asVar.b.getText();
                    int length2 = asVar.b.getSelectionEnd() == asVar.b.length() ? -1 : str.length() + asVar.b.getSelectionStart();
                    if (asVar.b.getSelectionStart() == -1 || asVar.b.getSelectionEnd() == -1) {
                        asVar.b.setText(str);
                        EditText editText2 = asVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = asVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), asVar.b.getSelectionEnd(), str));
                        EditText editText4 = asVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = asVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.ls lsVar = (org.telegram.ui.Components.ls) obj2;
                org.telegram.ui.Components.ks ksVar = (org.telegram.ui.Components.ks) obj;
                lsVar.J();
                ksVar.f = !ksVar.f;
                ksVar.j.X.N(true);
                lsVar.s();
                break;
            case 26:
                ((org.telegram.ui.Components.ls) obj2).B0 = !r13.B0;
                ((org.telegram.ui.Components.j61) obj).N(true);
                break;
            case 27:
                ((org.telegram.ui.Components.kt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new y6());
                break;
            case 28:
                org.telegram.ui.Components.wv.o((org.telegram.ui.Components.wv) obj2, (org.telegram.ui.Components.y5) obj);
                break;
            default:
                org.telegram.ui.Components.iz izVar = (org.telegram.ui.Components.iz) obj2;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) obj;
                org.telegram.ui.Components.rz rzVar = izVar.v;
                org.telegram.ui.Components.yw ywVar = rzVar.D0;
                if (ywVar.indexOfChild(p8Var) != -1 && (T = ywVar.T(p8Var)) != null) {
                    if (T.b() == rzVar.f1) {
                        if (rzVar.h1 != null) {
                            org.telegram.ui.Components.sy syVar = rzVar.t1;
                            if (syVar != null) {
                                syVar.y(rzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(rzVar.c1).edit();
                            String str2 = "group_hide_stickers_" + rzVar.J1.id;
                            TLRPC.StickerSet stickerSet = rzVar.J1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            rzVar.Z(false);
                            org.telegram.ui.Components.iz izVar2 = rzVar.y0;
                            if (izVar2 != null) {
                                izVar2.l();
                                break;
                            }
                        }
                    } else if (izVar.h.get(T.b()) == rzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(izVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.Components.pv(izVar, i13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
