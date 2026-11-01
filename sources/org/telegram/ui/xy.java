package org.telegram.ui;

import android.R;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz b;

    public /* synthetic */ xy(fz fzVar, int i10) {
        this.a = i10;
        this.b = fzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f7;
        int i10 = this.a;
        int i11 = 6;
        fz fzVar = this.b;
        int i12 = 0;
        int i13 = 1;
        switch (i10) {
            case 0:
                String str = fzVar.s;
                if (str != null) {
                    org.telegram.messenger.i0.g(str);
                    org.telegram.messenger.a30.r(null, 2131748931, org.telegram.ui.Components.cc.a0(fzVar.r));
                    break;
                }
                break;
            case 1:
                fz fzVar2 = this.b;
                FrameLayout frameLayout = fzVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    fzVar2.postDelayed(new yy(fzVar2, i12), 180L);
                }
                float[] fArr = fzVar2.D;
                if (fzVar2.y == null && fzVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(fzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), true, false);
                    b1Var.j(org.telegram.messenger.dd.L0(2131751265, null), org.telegram.messenger.beta.R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var, w7.b6.o(-1, 48));
                    b1Var.setOnClickListener(new xy(fzVar2, 4));
                    org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), false, false);
                    b1Var2.j(org.telegram.messenger.dd.L0(2131750481, null), org.telegram.messenger.beta.R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var2, w7.b6.o(-1, 48));
                    b1Var2.setOnClickListener(new xy(fzVar2, 5));
                    org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(fzVar2.getContext(), false, true);
                    b1Var3.j(org.telegram.messenger.dd.L0(2131751535, null), org.telegram.messenger.beta.R.drawable.msg_delete, null);
                    int i14 = org.telegram.ui.ActionBar.t6.p7;
                    b1Var3.c(i14, i14);
                    b1Var3.h(0.12f, i14);
                    b1Var3.setOnClickListener(new xy(fzVar2, i11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var3, w7.b6.o(-1, 48));
                    FrameLayout overlayContainerView = fzVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        az.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        kg.f0 f0Var = new kg.f0(fzVar2, fzVar2.getContext(), overlayContainerView, 10);
                        e7 e7Var = new e7(f0Var, i13);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(f0Var, w7.b6.c(-1.0f, -1));
                        f0Var.setAlpha(0.0f);
                        f0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        fzVar2.y = k1Var;
                        k1Var.setOnDismissListener(new org.telegram.ui.Components.f80(fzVar2, f0Var, overlayContainerView, e7Var, 1));
                        fzVar2.y.setOutsideTouchable(true);
                        fzVar2.y.setFocusable(true);
                        fzVar2.y.setBackgroundDrawable(new ColorDrawable(0));
                        fzVar2.y.setAnimationStyle(org.telegram.messenger.beta.R.style.PopupContextAnimation);
                        fzVar2.y.setInputMethodMode(2);
                        fzVar2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new st(fzVar2, 10));
                        if (org.telegram.messenger.i0.Q1()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        fzVar2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                String str2 = fzVar.s;
                if (str2 != null) {
                    org.telegram.messenger.i0.g(str2);
                    org.telegram.messenger.a30.r(null, 2131748931, org.telegram.ui.Components.cc.a0(fzVar.r));
                    break;
                }
                break;
            case 3:
                if (fzVar.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", fzVar.s);
                        fzVar.r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131749120, null)), 500);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.k1 k1Var2 = fzVar.y;
                if (k1Var2 != null) {
                    k1Var2.d(true);
                }
                hz hzVar = fzVar.E.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(fzVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.U(fzVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fzVar.getContext());
                    int i15 = org.telegram.ui.ActionBar.t6.H5;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.I = i15;
                    x1Var.R = org.telegram.messenger.dd.L0(2131750765, null);
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new bz(editTextBoldCursor, i12));
                    LinearLayout linearLayout = new LinearLayout(fzVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i16 = org.telegram.ui.ActionBar.t6.j5;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i16, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(hzVar.c.b);
                    org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.t5, null);
                    org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i16, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new cz(alertDialog$Builder, i12));
                    editTextBoldCursor.addTextChangedListener(new ez(editTextBoldCursor, i12));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131745963, null), new a7(fzVar, editTextBoldCursor, alertDialog$Builder, 13));
                    x1Var.setOnShowListener(new dq(i13, editTextBoldCursor));
                    x1Var.setOnDismissListener(new dz(editTextBoldCursor, i12));
                    x1Var.show();
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i16, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.k1 k1Var3 = fzVar.y;
                if (k1Var3 != null) {
                    k1Var3.d(true);
                }
                if (fzVar.s != null) {
                    org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(fzVar.getContext(), org.telegram.messenger.dd.L0(2131749180, null), fzVar.s, org.telegram.messenger.dd.L0(2131746521, null), false);
                    oh0Var.I0();
                    oh0Var.show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k1 k1Var4 = fzVar.y;
                if (k1Var4 != null) {
                    k1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                hz hzVar2 = fzVar.E.c;
                tL_inputChatlistDialogFilter.filter_id = hzVar2.c.a;
                tL_chatlists_deleteExportedInvite.slug = hzVar2.g0();
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, fzVar.getContext(), null);
                x1Var2.r(180L);
                hzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.t20(9, fzVar, x1Var2));
                break;
        }
    }
}
