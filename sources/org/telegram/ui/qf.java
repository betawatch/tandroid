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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf(int i10, Object obj, Object obj2) {
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
        int i12 = 3;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                xn xnVar = (xn) obj2;
                if (xnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    xnVar.Q7();
                    UndoView undoView = xnVar.y3;
                    if (undoView != null) {
                        long j3 = xnVar.T5;
                        int i14 = UndoView.e0;
                        undoView.j(83, j3, new k4(xnVar, 1));
                    }
                }
                xnVar.A7(true);
                break;
            case 1:
                xn.I0((xn) obj2, (String) obj);
                break;
            case 2:
                xn.y1((xn) obj2, (org.telegram.ui.Components.o70) obj);
                break;
            case 3:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                xn.z1((xn) obj2, (Context) obj);
                break;
            case 5:
                so soVar = (so) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
                linearLayout.addView(f7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i15] = j6Var;
                    j6Var.setTag(Integer.valueOf(i15));
                    j6VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    if (i15 == 0) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !soVar.J0);
                    } else if (ChatObject.isChannel(soVar.x0)) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, soVar.J0);
                    } else {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, soVar.J0);
                    }
                    f7.addView(j6VarArr[i15], w7.x5.n(-1, -2));
                    j6VarArr[i15].setOnClickListener(new a0(soVar, j6VarArr, a3Var, 8));
                    i15++;
                }
                a3Var.b(linearLayout);
                soVar.showDialog(f3Var);
                break;
            case 6:
                so.U((so) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                lq.V((lq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
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
                ((ai.s4) obj).run();
                break;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((ju) obj).onClick(null, intValue);
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
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.o70) obj).u();
                j8Var.t0(6);
                break;
            case 18:
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.f3) j8Var2).currentAccount;
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(s90Var.getText().toString())) {
                    String charSequence = s90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ry) {
                        ry ryVar = (ry) launchActivity.O().getLastFragment();
                        int totalDialogsCount = ryVar.getMessagesController().getTotalDialogsCount();
                        if (!ryVar.l2 && (totalDialogsCount > 10 || ryVar.K)) {
                            if (ryVar.j2) {
                                ryVar.X.r.setText(charSequence);
                                ryVar.X.r.setSelection(charSequence.length());
                                ay ayVar = ryVar.C0;
                                if (ayVar != null && (L = ayVar.L(3)) >= 0 && ryVar.C0.getTabsView().getCurrentTabId() != L) {
                                    ryVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                ryVar.x = 3;
                                ryVar.X.r.setText(charSequence);
                                ryVar.X.r.setSelection(charSequence.length());
                            }
                            j8Var2.dismiss();
                            break;
                        }
                    }
                    ry ryVar2 = new ry(null);
                    ryVar2.n2 = charSequence;
                    ryVar2.x = 3;
                    launchActivity.q0(ryVar2, false, false);
                    j8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.w1(e9Var.Y);
                e9Var.S.dismiss();
                break;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
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
                        nf.f.s(daVar.getContext(), daVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.o70 o70Var = ldVar.X0;
                if (o70Var == null || !o70Var.D()) {
                    ldVar.d1.e(true);
                    org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(frameLayout, new ai.d(), ldVar.V0);
                    ldVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    ldVar.X0.k();
                    int[] iArr = ldVar.c1;
                    int length = iArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = iArr[i17];
                        ldVar.X0.c(0, i18 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i18 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i18, new Object[0]), new org.telegram.ui.Components.kd(ldVar, i18, i13), false);
                        if (ldVar.b1 == i18) {
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
                org.telegram.ui.Components.el elVar = (org.telegram.ui.Components.el) obj2;
                org.telegram.ui.Components.gl glVar = (org.telegram.ui.Components.gl) obj;
                org.telegram.ui.Components.hl hlVar = elVar.b;
                org.telegram.ui.Components.wi wiVar = hlVar.b;
                xn xnVar2 = (xn) wiVar.f0;
                if (xnVar2.c()) {
                    parentActivity = hlVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, xnVar2.a(), new org.telegram.ui.Components.b3(i12, elVar, glVar), hlVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new oc(20, elVar, glVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.vn vnVar = ((org.telegram.ui.Components.tn) obj2).d;
                wb1 wb1Var = vnVar.s;
                View F2 = wb1Var.F((org.telegram.ui.Components.sn) obj);
                s4.c1 T = F2 != null ? wb1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - vnVar.t0) >= 0 && b10 < vnVar.K.length) {
                    org.telegram.ui.Components.vn.O(vnVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                xn xnVar3 = foVar.G;
                if (foVar.T) {
                    xnVar3.showDialog(org.telegram.ui.Components.e5.V(foVar.getContext(), xnVar3.h, d6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.ao aoVar = foVar.e;
                    if (xnVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = xnVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = xnVar3.Z7;
                            TLRPC.UserFull userFull = xnVar3.a8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(foVar.getContext(), null, new org.telegram.ui.Components.bo(foVar, r4), true, 0, foVar.d0);
                            o8Var.b(i19);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.a;
                            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(foVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {coVar};
                            coVar.e = true;
                            coVar.c = 220;
                            coVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(aoVar, 0, (int) (foVar.getX() + aoVar.getX()), (int) aoVar.getY());
                            xnVar3.g8(false, true, 0.2f);
                            break;
                        } else if (foVar.a.f && xnVar3.getParentActivity() != null && xnVar3.fragmentView != null && xnVar3.Z7 != null) {
                            if (xnVar3.o2 == null) {
                                org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(7, xnVar3.getParentActivity(), xnVar3.ea, true);
                                xnVar3.o2 = j40Var;
                                j40Var.setAlpha(0.0f);
                                xnVar3.o2.setVisibility(4);
                                xnVar3.o2.setShowingDuration(4000L);
                                xnVar3.X0.addView(xnVar3.o2, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i20 = xnVar3.Z7.ttl_period;
                            xnVar3.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i20 > 86400 ? LocaleController.formatPluralString("Days", i20 / 86400, new Object[0]) : i20 >= 3600 ? LocaleController.formatPluralString("Hours", i20 / 3600, new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i20, new Object[0])));
                            xnVar3.o2.f(xnVar3.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.np.n((org.telegram.ui.Components.np) obj, (xn) obj2);
                break;
            case 26:
                org.telegram.ui.Components.nr.P((org.telegram.ui.Components.nr) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj2;
                String str = (String) obj;
                if (vrVar.b == null && (view2 = vrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.b = (EditText) findFocus;
                    }
                }
                if (vrVar.b != null) {
                    try {
                        vrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = vrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = vrVar.b.getText();
                    int length2 = vrVar.b.getSelectionEnd() == vrVar.b.length() ? -1 : str.length() + vrVar.b.getSelectionStart();
                    if (vrVar.b.getSelectionStart() == -1 || vrVar.b.getSelectionEnd() == -1) {
                        vrVar.b.setText(str);
                        EditText editText2 = vrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = vrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), vrVar.b.getSelectionEnd(), str));
                        EditText editText4 = vrVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = vrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.gs gsVar = (org.telegram.ui.Components.gs) obj2;
                org.telegram.ui.Components.fs fsVar = (org.telegram.ui.Components.fs) obj;
                gsVar.J();
                fsVar.f = !fsVar.f;
                fsVar.j.X.N(true);
                gsVar.s();
                break;
            default:
                ((org.telegram.ui.Components.gs) obj2).B0 = !r12.B0;
                ((org.telegram.ui.Components.v51) obj).N(true);
                break;
        }
    }

    public /* synthetic */ qf(org.telegram.ui.Components.np npVar, xn xnVar) {
        this.a = 25;
        this.c = npVar;
        this.b = xnVar;
    }
}
