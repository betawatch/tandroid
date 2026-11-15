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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ wx(fy fyVar, int i7) {
        this.a = i7;
        this.b = fyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f10;
        int i7 = this.a;
        int i10 = 6;
        int i11 = 0;
        fy fyVar = this.b;
        int i12 = 1;
        switch (i7) {
            case 0:
                String str = fyVar.s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.i20.s(null, 2131748921, org.telegram.ui.Components.cc.a0(fyVar.r));
                    break;
                }
                break;
            case 1:
                fy fyVar2 = this.b;
                FrameLayout frameLayout = fyVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    fyVar2.postDelayed(new bh(fyVar2, 29), 180L);
                }
                float[] fArr = fyVar2.E;
                if (fyVar2.y == null && fyVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(fyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(fyVar2.getContext(), true, false);
                    z0Var.j(org.telegram.messenger.hd.M0(2131751264, null), org.telegram.messenger.beta.R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ja.o(-1, 48));
                    z0Var.setOnClickListener(new wx(fyVar2, 4));
                    org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(fyVar2.getContext(), false, false);
                    z0Var2.j(org.telegram.messenger.hd.M0(2131750472, null), org.telegram.messenger.beta.R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ja.o(-1, 48));
                    z0Var2.setOnClickListener(new wx(fyVar2, 5));
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(fyVar2.getContext(), false, true);
                    z0Var3.j(org.telegram.messenger.hd.M0(2131751534, null), org.telegram.messenger.beta.R.drawable.msg_delete, null);
                    int i13 = org.telegram.ui.ActionBar.j6.p7;
                    z0Var3.c(i13, i13);
                    z0Var3.h(0.12f, i13);
                    z0Var3.setOnClickListener(new wx(fyVar2, i10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, c8.ja.o(-1, 48));
                    FrameLayout overlayContainerView = fyVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        zx.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.n5 n5Var = new hi.n5(fyVar2, fyVar2.getContext(), overlayContainerView, 11);
                        e7 e7Var = new e7(n5Var, i12);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(e7Var);
                        overlayContainerView.addView(n5Var, c8.ja.c(-1.0f, -1));
                        n5Var.setAlpha(0.0f);
                        n5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        fyVar2.y = g1Var;
                        g1Var.setOnDismissListener(new org.telegram.ui.Components.p70(fyVar2, n5Var, overlayContainerView, e7Var, 1));
                        fyVar2.y.setOutsideTouchable(true);
                        fyVar2.y.setFocusable(true);
                        fyVar2.y.setBackgroundDrawable(new ColorDrawable(0));
                        fyVar2.y.setAnimationStyle(org.telegram.messenger.beta.R.style.PopupContextAnimation);
                        fyVar2.y.setInputMethodMode(2);
                        fyVar2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zr(fyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        fyVar2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                String str2 = fyVar.s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.i20.s(null, 2131748921, org.telegram.ui.Components.cc.a0(fyVar.r));
                    break;
                }
                break;
            case 3:
                if (fyVar.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", fyVar.s);
                        fyVar.r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131749110, null)), 500);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.g1 g1Var2 = fyVar.y;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                }
                hy hyVar = fyVar.F.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(fyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U(fyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getContext());
                    int i14 = org.telegram.ui.ActionBar.j6.H5;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.J = i14;
                    t1Var.S = org.telegram.messenger.hd.M0(2131750764, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ay(editTextBoldCursor, i11));
                    LinearLayout linearLayout = new LinearLayout(fyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i15 = org.telegram.ui.ActionBar.j6.j5;
                    org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i15, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(hyVar.c.b);
                    org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.t5, null);
                    org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, i15, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new cy(alertDialog$Builder, i11));
                    editTextBoldCursor.addTextChangedListener(new ey(editTextBoldCursor, i11));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745946, null), new a7(fyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    t1Var.setOnShowListener(new gp(i12, editTextBoldCursor));
                    t1Var.setOnDismissListener(new dy(editTextBoldCursor, i11));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.j6.x0(null, i15, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.g1 g1Var3 = fyVar.y;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                if (fyVar.s != null) {
                    org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(fyVar.getContext(), org.telegram.messenger.hd.M0(2131749170, null), fyVar.s, org.telegram.messenger.hd.M0(2131746506, null), false);
                    og0Var.I0();
                    og0Var.show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var4 = fyVar.y;
                if (g1Var4 != null) {
                    g1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                hy hyVar2 = fyVar.F.c;
                tL_inputChatlistDialogFilter.filter_id = hyVar2.c.a;
                tL_chatlists_deleteExportedInvite.slug = hyVar2.g0();
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, fyVar.getContext(), null);
                t1Var2.r(180L);
                hyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new v7(27, fyVar, t1Var2));
                break;
        }
    }
}
