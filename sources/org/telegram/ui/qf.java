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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        int N;
        Activity parentActivity;
        int b10;
        View view2;
        int i11 = this.a;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                yn ynVar = (yn) obj2;
                if (ynVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    ynVar.Q7();
                    UndoView undoView = ynVar.w3;
                    if (undoView != null) {
                        long j3 = ynVar.R5;
                        int i13 = UndoView.e0;
                        undoView.j(83, j3, new k4(ynVar, 1));
                    }
                }
                ynVar.A7(true);
                break;
            case 1:
                yn.E0((yn) obj2, (String) obj);
                break;
            case 2:
                yn.z1((yn) obj2, (org.telegram.ui.Components.b80) obj);
                break;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                yn.Q0((yn) obj2, (Context) obj);
                break;
            case 5:
                to toVar = (to) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.i6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                linearLayout.addView(e7, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i14] = j6Var;
                    j6Var.setTag(Integer.valueOf(i14));
                    j6VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                    if (i14 == 0) {
                        j6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !toVar.J0);
                    } else if (ChatObject.isChannel(toVar.x0)) {
                        j6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, toVar.J0);
                    } else {
                        j6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, toVar.J0);
                    }
                    e7.addView(j6VarArr[i14], w7.z5.n(-1, -2));
                    j6VarArr[i14].setOnClickListener(new a0(toVar, j6VarArr, a3Var, 8));
                    i14++;
                }
                a3Var.b(linearLayout);
                toVar.showDialog(f3Var);
                break;
            case 6:
                to.S((to) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                mq.T((mq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 8:
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.O((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
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
                ((mu) obj).onClick(null, intValue);
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
                org.telegram.ui.Components.j8.D((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.b80) obj).u();
                j8Var.t0(6);
                break;
            case 18:
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.f3) j8Var2).currentAccount;
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(fa0Var.getText().toString())) {
                    String charSequence = fa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (uyVar.j2) {
                                uyVar.X.r.setText(charSequence);
                                uyVar.X.r.setSelection(charSequence.length());
                                dy dyVar = uyVar.C0;
                                if (dyVar != null && (N = dyVar.N(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != N) {
                                    uyVar.C0.getTabsView().d(N, N);
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
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(eaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = eaVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) eaVar.getContext(), eaVar.n.document)) {
                            FileLoader.getInstance(eaVar.s).loadFile(eaVar.n.document, "update", 3, 1);
                            eaVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(eaVar.getContext(), eaVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.md mdVar = (org.telegram.ui.Components.md) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.b80 b80Var = mdVar.X0;
                if (b80Var == null || !b80Var.D()) {
                    mdVar.d1.e(true);
                    org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(frameLayout, new ai.d(), mdVar.V0);
                    mdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    mdVar.X0.k();
                    int[] iArr = mdVar.c1;
                    int length = iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = iArr[i16];
                        mdVar.X0.c(0, i17 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i17 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i17, new Object[0]), new org.telegram.ui.Components.ld(mdVar, i17, i12), false);
                        if (mdVar.b1 == i17) {
                            mdVar.X0.L();
                        }
                    }
                    mdVar.X0.Z();
                    break;
                } else {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.gl glVar = (org.telegram.ui.Components.gl) obj2;
                org.telegram.ui.Components.il ilVar = (org.telegram.ui.Components.il) obj;
                org.telegram.ui.Components.jl jlVar = glVar.b;
                org.telegram.ui.Components.xi xiVar = jlVar.b;
                yn ynVar2 = (yn) xiVar.f0;
                if (ynVar2.c()) {
                    parentActivity = jlVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, ynVar2.a(), new org.telegram.ui.Components.w2(5, glVar, ilVar), jlVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.e5.a0(xiVar.J1, xiVar.j1() + 1, xiVar.n1(), new qc(20, glVar, ilVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.xn xnVar = ((org.telegram.ui.Components.vn) obj2).d;
                xb1 xb1Var = xnVar.s;
                View F2 = xb1Var.F((org.telegram.ui.Components.un) obj);
                s4.c1 T = F2 != null ? xb1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - xnVar.t0) >= 0 && b10 < xnVar.K.length) {
                    org.telegram.ui.Components.xn.M(xnVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.ho hoVar = (org.telegram.ui.Components.ho) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                yn ynVar3 = hoVar.G;
                if (hoVar.T) {
                    ynVar3.showDialog(org.telegram.ui.Components.e5.V(hoVar.getContext(), ynVar3.h, d6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.co coVar = hoVar.e;
                    if (ynVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = ynVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = ynVar3.X7;
                            TLRPC.UserFull userFull = ynVar3.Y7;
                            int i18 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(hoVar.getContext(), null, new org.telegram.ui.Components.eo(hoVar, r4), true, 0, hoVar.d0);
                            o8Var.b(i18);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.a;
                            org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(hoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {foVar};
                            foVar.e = true;
                            foVar.c = 220;
                            foVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(coVar, 0, (int) (hoVar.getX() + coVar.getX()), (int) coVar.getY());
                            ynVar3.g8(false, true, 0.2f);
                            break;
                        } else if (hoVar.a.f && ynVar3.getParentActivity() != null && ynVar3.fragmentView != null && ynVar3.X7 != null) {
                            if (ynVar3.m2 == null) {
                                org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, ynVar3.getParentActivity(), ynVar3.ca, true);
                                ynVar3.m2 = m40Var;
                                m40Var.setAlpha(0.0f);
                                ynVar3.m2.setVisibility(4);
                                ynVar3.m2.setShowingDuration(4000L);
                                ynVar3.V0.addView(ynVar3.m2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i19 = ynVar3.X7.ttl_period;
                            ynVar3.m2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i19 > 86400 ? LocaleController.formatPluralString("Days", i19 / 86400, new Object[0]) : i19 >= 3600 ? LocaleController.formatPluralString("Hours", i19 / 3600, new Object[0]) : i19 >= 60 ? LocaleController.formatPluralString("Minutes", i19 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i19, new Object[0])));
                            ynVar3.m2.f(ynVar3.Y0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.pp.n((org.telegram.ui.Components.pp) obj, (yn) obj2);
                break;
            case 26:
                org.telegram.ui.Components.pr.N((org.telegram.ui.Components.pr) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.xr xrVar = (org.telegram.ui.Components.xr) obj2;
                String str = (String) obj;
                if (xrVar.b == null && (view2 = xrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.b = (EditText) findFocus;
                    }
                }
                if (xrVar.b != null) {
                    try {
                        xrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = xrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = xrVar.b.getText();
                    int length2 = xrVar.b.getSelectionEnd() == xrVar.b.length() ? -1 : str.length() + xrVar.b.getSelectionStart();
                    if (xrVar.b.getSelectionStart() == -1 || xrVar.b.getSelectionEnd() == -1) {
                        xrVar.b.setText(str);
                        EditText editText2 = xrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = xrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), xrVar.b.getSelectionEnd(), str));
                        EditText editText4 = xrVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = xrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.is isVar = (org.telegram.ui.Components.is) obj2;
                org.telegram.ui.Components.hs hsVar = (org.telegram.ui.Components.hs) obj;
                isVar.H();
                hsVar.f = !hsVar.f;
                hsVar.j.X.N(true);
                isVar.s();
                break;
            default:
                ((org.telegram.ui.Components.is) obj2).B0 = !r12.B0;
                ((org.telegram.ui.Components.w61) obj).N(true);
                break;
        }
    }

    public /* synthetic */ qf(org.telegram.ui.Components.pp ppVar, yn ynVar) {
        this.a = 25;
        this.c = ppVar;
        this.b = ynVar;
    }
}
