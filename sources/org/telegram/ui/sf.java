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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i10;
        int M;
        Activity parentActivity;
        int b10;
        View view2;
        int i11 = this.a;
        int i12 = 13;
        int i13 = 2;
        int i14 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.Q7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i15 = UndoView.e0;
                        undoView.j(83, j3, new j4(znVar, 1));
                    }
                }
                znVar.A7(true);
                break;
            case 1:
                zn.X((zn) obj2, (String) obj);
                break;
            case 2:
                zn.a1((zn) obj2, (org.telegram.ui.Components.w70) obj);
                break;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                zn.z1((zn) obj2, (Context) obj);
                break;
            case 5:
                uo uoVar = (uo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.j6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e = org.telegram.messenger.wh.e(context, 1);
                linearLayout.addView(e, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i16 = 0;
                while (i16 < i13) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i16] = j6Var;
                    j6Var.setTag(Integer.valueOf(i16));
                    j6VarArr[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i16 == 0) {
                        j6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.x0)) {
                        j6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        j6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    e.addView(j6VarArr[i16], w7.y5.n(-1, -2));
                    j6VarArr[i16].setOnClickListener(new z(uoVar, j6VarArr, a3Var, 8));
                    i16++;
                    i13 = 2;
                }
                a3Var.b(linearLayout);
                uoVar.showDialog(f3Var);
                break;
            case 6:
                uo.U((uo) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                nq.V((nq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.e6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.e6) obj);
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
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.s4) obj).run();
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
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.w70) obj).u();
                j8Var.t0(6);
                break;
            case 18:
                org.telegram.ui.Components.aa0 aa0Var = (org.telegram.ui.Components.aa0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.f3) j8Var2).currentAccount;
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(aa0Var.getText().toString())) {
                    String charSequence = aa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (uyVar.j2) {
                                uyVar.X.r.setText(charSequence);
                                uyVar.X.r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (M = eyVar.M(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != M) {
                                    uyVar.C0.getTabsView().d(M, M);
                                }
                            } else {
                                uyVar.x = 3;
                                uyVar.X.r.setText(charSequence);
                                uyVar.X.r.setSelection(charSequence.length());
                            }
                            j8Var2.dismiss();
                            break;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.n2 = charSequence;
                    uyVar2.x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    j8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.x1(e9Var.Y);
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
                org.telegram.ui.Components.kd kdVar = (org.telegram.ui.Components.kd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.w70 w70Var = kdVar.X0;
                if (w70Var == null || !w70Var.D()) {
                    kdVar.d1.e(true);
                    org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(frameLayout, new ai.d(), kdVar.V0);
                    kdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    kdVar.X0.k();
                    int[] iArr = kdVar.c1;
                    int length = iArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = iArr[i17];
                        kdVar.X0.c(0, i18 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i18 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i18, new Object[0]), new org.telegram.ui.Components.x2(kdVar, i18, i13), false);
                        if (kdVar.b1 == i18) {
                            kdVar.X0.L();
                        }
                    }
                    kdVar.X0.Z();
                    break;
                } else {
                    kdVar.X0.u();
                    kdVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.b;
                org.telegram.ui.Components.vi viVar = glVar.b;
                zn znVar2 = (zn) viVar.f0;
                if (znVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, znVar2.a(), new org.telegram.ui.Components.b3(i14, dlVar, flVar), glVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new of(i12, dlVar, flVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) obj2).d;
                dc1 dc1Var = unVar.s;
                View G = dc1Var.G((org.telegram.ui.Components.rn) obj);
                s4.c1 U = G != null ? dc1Var.U(G) : null;
                if (U != null && (b10 = U.b() - unVar.t0) >= 0 && b10 < unVar.K.length) {
                    org.telegram.ui.Components.un.O(unVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                zn znVar3 = eoVar.G;
                if (eoVar.T) {
                    znVar3.showDialog(org.telegram.ui.Components.e5.V(eoVar.getContext(), znVar3.h, e6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.zn znVar4 = eoVar.e;
                    if (znVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = znVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = znVar3.Z7;
                            TLRPC.UserFull userFull = znVar3.a8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(eoVar.getContext(), null, new org.telegram.ui.Components.ao(eoVar, r4), true, 0, eoVar.d0);
                            o8Var.b(i19);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.a;
                            org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {boVar};
                            boVar.e = true;
                            boVar.c = 220;
                            boVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(znVar4, 0, (int) (eoVar.getX() + znVar4.getX()), (int) znVar4.getY());
                            znVar3.g8(false, true, 0.2f);
                            break;
                        } else if (eoVar.a.f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, znVar3.getParentActivity(), znVar3.ea, true);
                                znVar3.o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                znVar3.o2.setVisibility(4);
                                znVar3.o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i20 = znVar3.Z7.ttl_period;
                            znVar3.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i20 > 86400 ? LocaleController.formatPluralString("Days", i20 / 86400, new Object[0]) : i20 >= 3600 ? LocaleController.formatPluralString("Hours", i20 / 3600, new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i20, new Object[0])));
                            znVar3.o2.f(znVar3.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.mp.n((org.telegram.ui.Components.mp) obj, (zn) obj2);
                break;
            case 26:
                org.telegram.ui.Components.mr.P((org.telegram.ui.Components.mr) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.ur urVar = (org.telegram.ui.Components.ur) obj2;
                String str = (String) obj;
                if (urVar.b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.b = (EditText) findFocus;
                    }
                }
                if (urVar.b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.b.getText();
                    int length2 = urVar.b.getSelectionEnd() == urVar.b.length() ? -1 : str.length() + urVar.b.getSelectionStart();
                    if (urVar.b.getSelectionStart() == -1 || urVar.b.getSelectionEnd() == -1) {
                        urVar.b.setText(str);
                        EditText editText2 = urVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = urVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), urVar.b.getSelectionEnd(), str));
                        EditText editText4 = urVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = urVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.fs fsVar = (org.telegram.ui.Components.fs) obj2;
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) obj;
                fsVar.J();
                esVar.f = !esVar.f;
                esVar.j.X.N(true);
                fsVar.s();
                break;
            default:
                ((org.telegram.ui.Components.fs) obj2).B0 = !r12.B0;
                ((org.telegram.ui.Components.l61) obj).N(true);
                break;
        }
    }

    public /* synthetic */ sf(org.telegram.ui.Components.mp mpVar, zn znVar) {
        this.a = 25;
        this.c = mpVar;
        this.b = znVar;
    }
}
