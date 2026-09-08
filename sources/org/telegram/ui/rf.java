package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(int i10, Object obj, Object obj2) {
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
        int i11 = this.a;
        int i12 = 13;
        int i13 = 3;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                co coVar = (co) obj2;
                if (coVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    coVar.Q7();
                    UndoView undoView = coVar.y3;
                    if (undoView != null) {
                        long j3 = coVar.T5;
                        int i15 = UndoView.e0;
                        undoView.j(83, j3, new k4(coVar, 1));
                    }
                }
                coVar.A7(true);
                break;
            case 1:
                co.I0((co) obj2, (String) obj);
                break;
            case 2:
                co.y1((co) obj2, (org.telegram.ui.Components.n70) obj);
                break;
            case 3:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                co.z1((co) obj2, (Context) obj);
                break;
            case 5:
                xo xoVar = (xo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, org.telegram.ui.ActionBar.j6.n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
                linearLayout.addView(f7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i16] = i6Var;
                    i6Var.setTag(Integer.valueOf(i16));
                    i6VarArr[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i16 == 0) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !xoVar.J0);
                    } else if (ChatObject.isChannel(xoVar.x0)) {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, xoVar.J0);
                    } else {
                        i6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, xoVar.J0);
                    }
                    f7.addView(i6VarArr[i16], w7.x5.n(-1, -2));
                    i6VarArr[i16].setOnClickListener(new z(xoVar, i6VarArr, a3Var, 8));
                    i16++;
                }
                a3Var.b(linearLayout);
                xoVar.showDialog(f3Var);
                break;
            case 6:
                xo.U((xo) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                qq.V((qq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 8:
                new sg.a1(((org.telegram.ui.Components.f0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.f6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                v0Var.M(null, null);
                v0Var.G(c5Var.d, false);
                v0Var.setupPopupRadialSelectors(c5Var.f);
                v0Var.B(c5Var.e);
                break;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((bi.e4) obj).run();
                break;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((nu) obj).onClick(null, intValue);
                break;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 16:
                org.telegram.ui.Components.k8.F((org.telegram.ui.Components.k8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj2;
                k8Var.getClass();
                ((org.telegram.ui.Components.n70) obj).u();
                k8Var.t0(7);
                break;
            case 18:
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) obj;
                org.telegram.ui.Components.k8 k8Var2 = ((org.telegram.ui.Components.b8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.f3) k8Var2).currentAccount;
                LaunchActivity launchActivity = k8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(s90Var.getText().toString())) {
                    String charSequence = s90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (uyVar.j2) {
                                uyVar.X.r.setText(charSequence);
                                uyVar.X.r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (L = eyVar.L(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    uyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                uyVar.x = 3;
                                uyVar.X.r.setText(charSequence);
                                uyVar.X.r.setSelection(charSequence.length());
                            }
                            k8Var2.dismiss();
                            break;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.n2 = charSequence;
                    uyVar2.x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    k8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.f9 f9Var = (org.telegram.ui.Components.f9) obj2;
                ((boolean[]) obj)[0] = true;
                f9Var.J.v1(f9Var.Y);
                f9Var.S.dismiss();
                break;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.n.document)) {
                            FileLoader.getInstance(daVar.s).loadFile(daVar.n.document, "update", 3, 1);
                            daVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(daVar.getContext(), daVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.n70 n70Var = ldVar.X0;
                if (n70Var == null || !n70Var.D()) {
                    ldVar.d1.e(true);
                    org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(frameLayout, new bi.b(), ldVar.V0);
                    ldVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    ldVar.X0.k();
                    int[] iArr = ldVar.c1;
                    int length = iArr.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        int i19 = iArr[i18];
                        ldVar.X0.c(0, i19 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i19 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i19, new Object[0]), new org.telegram.ui.Components.m8(ldVar, i19, i14), false);
                        if (ldVar.b1 == i19) {
                            ldVar.X0.L();
                        }
                    }
                    ldVar.X0.Z();
                    break;
                } else {
                    ldVar.X0.u();
                    ldVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.b;
                org.telegram.ui.Components.vi viVar = glVar.b;
                co coVar2 = (co) viVar.f0;
                if (coVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, coVar2.a(), new org.telegram.ui.Components.b3(i13, dlVar, flVar), glVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new nf(i12, dlVar, flVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.tn tnVar = ((org.telegram.ui.Components.rn) obj2).d;
                ec1 ec1Var = tnVar.s;
                View F2 = ec1Var.F((org.telegram.ui.Components.qn) obj);
                s4.c1 T = F2 != null ? ec1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - tnVar.t0) >= 0 && b10 < tnVar.K.length) {
                    org.telegram.ui.Components.tn.O(tnVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.co coVar3 = (org.telegram.ui.Components.co) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                co coVar4 = coVar3.G;
                if (coVar3.T) {
                    coVar4.showDialog(org.telegram.ui.Components.e5.V(coVar3.getContext(), coVar4.h, f6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.yn ynVar = coVar3.e;
                    if (coVar4.getParentActivity() != null) {
                        TLRPC.Chat chat = coVar4.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = coVar4.Z7;
                            TLRPC.UserFull userFull = coVar4.a8;
                            int i20 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(coVar3.getContext(), null, new org.telegram.ui.Components.zn(coVar3, r4), true, 0, coVar3.d0);
                            q8Var.b(i20);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.a;
                            org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(coVar3, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {aoVar};
                            aoVar.e = true;
                            aoVar.c = 220;
                            aoVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(ynVar, 0, (int) (coVar3.getX() + ynVar.getX()), (int) ynVar.getY());
                            coVar4.g8(false, true, 0.2f);
                            break;
                        } else if (coVar3.a.f && coVar4.getParentActivity() != null && coVar4.fragmentView != null && coVar4.Z7 != null) {
                            if (coVar4.o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, coVar4.getParentActivity(), coVar4.ea, true);
                                coVar4.o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                coVar4.o2.setVisibility(4);
                                coVar4.o2.setShowingDuration(4000L);
                                coVar4.X0.addView(coVar4.o2, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i21 = coVar4.Z7.ttl_period;
                            coVar4.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i21 > 86400 ? LocaleController.formatPluralString("Days", i21 / 86400, new Object[0]) : i21 >= 3600 ? LocaleController.formatPluralString("Hours", i21 / 3600, new Object[0]) : i21 >= 60 ? LocaleController.formatPluralString("Minutes", i21 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i21, new Object[0])));
                            coVar4.o2.f(coVar4.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.lp.n((org.telegram.ui.Components.lp) obj, (co) obj2);
                break;
            case 26:
                org.telegram.ui.Components.lr.P((org.telegram.ui.Components.lr) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.tr trVar = (org.telegram.ui.Components.tr) obj2;
                String str = (String) obj;
                if (trVar.b == null && (view2 = trVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        trVar.b = (EditText) findFocus;
                    }
                }
                if (trVar.b != null) {
                    try {
                        trVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = trVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = trVar.b.getText();
                    int length2 = trVar.b.getSelectionEnd() == trVar.b.length() ? -1 : str.length() + trVar.b.getSelectionStart();
                    if (trVar.b.getSelectionStart() == -1 || trVar.b.getSelectionEnd() == -1) {
                        trVar.b.setText(str);
                        EditText editText2 = trVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = trVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), trVar.b.getSelectionEnd(), str));
                        EditText editText4 = trVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = trVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) obj2;
                org.telegram.ui.Components.ds dsVar = (org.telegram.ui.Components.ds) obj;
                esVar.J();
                dsVar.f = !dsVar.f;
                dsVar.j.X.N(true);
                esVar.s();
                break;
            default:
                ((org.telegram.ui.Components.es) obj2).B0 = !r13.B0;
                ((org.telegram.ui.Components.v51) obj).N(true);
                break;
        }
    }

    public /* synthetic */ rf(org.telegram.ui.Components.lp lpVar, co coVar) {
        this.a = 25;
        this.c = lpVar;
        this.b = coVar;
    }
}
