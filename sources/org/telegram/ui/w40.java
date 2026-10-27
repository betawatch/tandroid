package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.Components.w30 {
    public final /* synthetic */ a50 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(a50 a50Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        this.n = a50Var;
        int i10 = org.telegram.ui.ActionBar.y6.fg;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        org.telegram.ui.ActionBar.f7.y(this.containerView, this.shadowDrawable, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(this, context);
        this.containerView = r30Var;
        r30Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        a5.m mVar = new a5.m(context);
        this.b = mVar;
        mVar.setClipChildren(false);
        mVar.setOffscreenPageLimit(4);
        mVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(mVar, 2130706432);
        mVar.setAdapter(new org.telegram.ui.Components.v30(this));
        mVar.setPageMargin(0);
        this.containerView.addView(mVar, org.telegram.ui.Components.kb1.h(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        mVar.b(new org.telegram.ui.Components.s30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, org.telegram.ui.Components.kb1.h(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, org.telegram.ui.Components.kb1.h(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this, getContext());
        this.c = t30Var;
        t30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        t30Var.setTag(-1);
        t30Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.y6.ng;
        org.telegram.ui.ActionBar.f7.V(t30Var, i12, null);
        t30Var.setGravity(17);
        t30Var.setTypeface(AndroidUtilities.bold());
        t30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 76);
        t30Var.setForeground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        t30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        t30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(t30Var, org.telegram.ui.Components.kb1.h(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, org.telegram.ui.Components.kb1.i(-2, 64, 80));
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i13 >= textViewArr.length) {
                break;
            }
            textViewArr[i13] = new TextView(context);
            this.e[i13].setTextSize(1, 12.0f);
            this.e[i13].setTextColor(-1);
            this.e[i13].setTypeface(AndroidUtilities.bold());
            this.e[i13].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.e[i13].setGravity(16);
            this.e[i13].setSingleLine(true);
            this.d.addView(this.e[i13], org.telegram.ui.Components.kb1.r(-2, -1));
            if (i13 == 0) {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i13 == 1) {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i13].setOnClickListener(new ai.w(this, i13, 13));
            i13++;
        }
        if (z10) {
            this.b.setCurrentItem(1);
        }
    }

    public final void n(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.y6.pg;
        x50 x50Var = this.n.b;
        x50Var.w0 = false;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            alertDialog$Builder.a.T = LocaleController.getString(x50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
        } else if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
            alertDialog$Builder.a.T = LocaleController.getString(x50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
        } else {
            alertDialog$Builder.a.T = LocaleController.getString(x50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
        }
        alertDialog$Builder.a.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.U(getContext(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.nh, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.ng;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.og, null);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.x(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.fg, false);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.j(x02);
        e2Var.setOnShowListener(new v40(this, e2Var, editTextBoldCursor, 1));
        e2Var.setOnDismissListener(new jz(editTextBoldCursor, 2));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new i2.z(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(editTextBoldCursor, 2));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false);
        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
        e2Var2.j(x03);
        e2Var2.show();
        e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
