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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy b;

    public /* synthetic */ zx(iy iyVar, int i7) {
        this.a = i7;
        this.b = iyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f10;
        int i7 = this.a;
        int i10 = 6;
        int i11 = 0;
        iy iyVar = this.b;
        int i12 = 1;
        switch (i7) {
            case 0:
                String str = iyVar.s;
                if (str != null) {
                    org.telegram.messenger.g0.g(str);
                    org.telegram.messenger.n10.t(null, 2131748729, org.telegram.ui.Components.lc.b0(iyVar.r));
                    break;
                }
                break;
            case 1:
                iy iyVar2 = this.b;
                FrameLayout frameLayout = iyVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    iyVar2.postDelayed(new bh(iyVar2, 29), 180L);
                }
                float[] fArr = iyVar2.E;
                if (iyVar2.y == null && iyVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(iyVar2.getContext(), null);
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(iyVar2.getContext(), true, false);
                    z0Var.j(org.telegram.messenger.gd.M0(2131751253, null), org.telegram.messenger.beta.R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var, c8.ma.o(-1, 48));
                    z0Var.setOnClickListener(new zx(iyVar2, 4));
                    org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(iyVar2.getContext(), false, false);
                    z0Var2.j(org.telegram.messenger.gd.M0(2131750456, null), org.telegram.messenger.beta.R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, c8.ma.o(-1, 48));
                    z0Var2.setOnClickListener(new zx(iyVar2, 5));
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(iyVar2.getContext(), false, true);
                    z0Var3.j(org.telegram.messenger.gd.M0(2131751523, null), org.telegram.messenger.beta.R.drawable.msg_delete, null);
                    int i13 = org.telegram.ui.ActionBar.n6.p7;
                    z0Var3.c(i13, i13);
                    z0Var3.h(0.12f, i13);
                    z0Var3.setOnClickListener(new zx(iyVar2, i10));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, c8.ma.o(-1, 48));
                    FrameLayout overlayContainerView = iyVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        dy.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.m5 m5Var = new hi.m5(iyVar2, iyVar2.getContext(), overlayContainerView, 11);
                        d7 d7Var = new d7(m5Var, i12);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(d7Var);
                        overlayContainerView.addView(m5Var, c8.ma.c(-1.0f, -1));
                        m5Var.setAlpha(0.0f);
                        m5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        iyVar2.y = h1Var;
                        h1Var.setOnDismissListener(new org.telegram.ui.Components.a80(iyVar2, m5Var, overlayContainerView, d7Var, 1));
                        iyVar2.y.setOutsideTouchable(true);
                        iyVar2.y.setFocusable(true);
                        iyVar2.y.setBackgroundDrawable(new ColorDrawable(0));
                        iyVar2.y.setAnimationStyle(org.telegram.messenger.beta.R.style.PopupContextAnimation);
                        iyVar2.y.setInputMethodMode(2);
                        iyVar2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zr(iyVar2, 11));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        iyVar2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                String str2 = iyVar.s;
                if (str2 != null) {
                    org.telegram.messenger.g0.g(str2);
                    org.telegram.messenger.n10.t(null, 2131748729, org.telegram.ui.Components.lc.b0(iyVar.r));
                    break;
                }
                break;
            case 3:
                if (iyVar.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", iyVar.s);
                        iyVar.r.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.M0(2131748918, null)), 500);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.h1 h1Var2 = iyVar.y;
                if (h1Var2 != null) {
                    h1Var2.d(true);
                }
                ky kyVar = iyVar.F.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(iyVar.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.U(iyVar.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iyVar.getContext());
                    int i14 = org.telegram.ui.ActionBar.n6.H5;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.J = i14;
                    u1Var.S = org.telegram.messenger.gd.M0(2131750753, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new ey(editTextBoldCursor, i11));
                    LinearLayout linearLayout = new LinearLayout(iyVar.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i15 = org.telegram.ui.ActionBar.n6.j5;
                    org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i15, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(kyVar.c.b);
                    org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.t5, null);
                    org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i15, null);
                    editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder, i11));
                    editTextBoldCursor.addTextChangedListener(new hy(editTextBoldCursor, i11));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745751, null), new z6(iyVar, editTextBoldCursor, alertDialog$Builder, 13));
                    u1Var.setOnShowListener(new ip(i12, editTextBoldCursor));
                    u1Var.setOnDismissListener(new gy(editTextBoldCursor, i11));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.n6.x0(null, i15, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.h1 h1Var3 = iyVar.y;
                if (h1Var3 != null) {
                    h1Var3.d(true);
                }
                if (iyVar.s != null) {
                    org.telegram.ui.Components.yg0 yg0Var = new org.telegram.ui.Components.yg0(iyVar.getContext(), org.telegram.messenger.gd.M0(2131748978, null), iyVar.s, org.telegram.messenger.gd.M0(2131746311, null), false);
                    yg0Var.J0();
                    yg0Var.show();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.h1 h1Var4 = iyVar.y;
                if (h1Var4 != null) {
                    h1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                ky kyVar2 = iyVar.F.c;
                tL_inputChatlistDialogFilter.filter_id = kyVar2.c.a;
                tL_chatlists_deleteExportedInvite.slug = kyVar2.g0();
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, iyVar.getContext(), null);
                u1Var2.r(180L);
                kyVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new u7(27, iyVar, u1Var2));
                break;
        }
    }
}
