package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ wz(c00 c00Var, int i10) {
        this.a = i10;
        this.b = c00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c00 c00Var = this.b;
                String str = c00Var.s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.wl.o(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(c00Var.r));
                    break;
                }
                break;
            case 1:
                c00 c00Var2 = this.b;
                FrameLayout frameLayout = c00Var2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                    c00Var2.postDelayed(new ej(c00Var2, 29), 180L);
                }
                float[] fArr = c00Var2.y;
                if (c00Var2.x == null && c00Var2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(c00Var2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.x5.n(-1, 48));
                    g1Var.setOnClickListener(new wz(c00Var2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.x5.n(-1, 48));
                    g1Var2.setOnClickListener(new wz(c00Var2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.j6.p7;
                    g1Var3.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new wz(c00Var2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, w7.x5.n(-1, 48));
                    FrameLayout overlayContainerView = c00Var2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        xz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.s6 s6Var = new ci.s6(c00Var2, c00Var2.getContext(), overlayContainerView, 9);
                        g7 g7Var = new g7(s6Var, 2);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(g7Var);
                        overlayContainerView.addView(s6Var, w7.x5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        s6Var.setAlpha(0.0f);
                        s6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        c00Var2.x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.r80(c00Var2, s6Var, overlayContainerView, g7Var, 1));
                        c00Var2.x.setOutsideTouchable(true);
                        c00Var2.x.setFocusable(true);
                        c00Var2.x.setBackgroundDrawable(new ColorDrawable(0));
                        c00Var2.x.setAnimationStyle(R.style.PopupContextAnimation);
                        c00Var2.x.setInputMethodMode(2);
                        c00Var2.x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new gu(c00Var2, 9));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        c00Var2.x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                c00 c00Var3 = this.b;
                String str2 = c00Var3.s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.wl.o(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(c00Var3.r));
                    break;
                }
                break;
            case 3:
                c00 c00Var4 = this.b;
                if (c00Var4.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", c00Var4.s);
                        c00Var4.r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 4:
                c00 c00Var5 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = c00Var5.x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                e00 e00Var = c00Var5.E.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c00Var5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(c00Var5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c00Var5.getContext());
                    alertDialog$Builder.a.I = org.telegram.ui.ActionBar.j6.H5;
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new yz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(c00Var5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(e00Var.c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new b00(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new c7(c00Var5, editTextBoldCursor, alertDialog$Builder, 13));
                    kq kqVar = new kq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.setOnShowListener(kqVar);
                    c2Var.setOnDismissListener(new a00(0, editTextBoldCursor));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                c00 c00Var6 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = c00Var6.x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (c00Var6.s != null) {
                    org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(c00Var6.getContext(), LocaleController.getString(R.string.InviteByQRCode), c00Var6.s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ki0Var.m(R.raw.qr_code_logo);
                    ki0Var.show();
                    break;
                }
                break;
            default:
                c00 c00Var7 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var4 = c00Var7.x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                e00 e00Var2 = c00Var7.E.c;
                tL_inputChatlistDialogFilter.filter_id = e00Var2.c.id;
                tL_chatlists_deleteExportedInvite.slug = e00Var2.b0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(c00Var7.getContext(), 3, null);
                c2Var2.q(180L);
                e00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new qo(19, c00Var7, c2Var2));
                break;
        }
    }
}
