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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.Components.u30 {
    public final /* synthetic */ w40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(w40 w40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        this.n = w40Var;
        int i10 = org.telegram.ui.ActionBar.k6.fg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.r6.z(this.containerView, this.shadowDrawable, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.p30 p30Var = new org.telegram.ui.Components.p30(this, context);
        this.containerView = p30Var;
        p30Var.setWillNotDraw(false);
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
        this.containerView.addView(textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        z4.h hVar = new z4.h(context);
        this.b = hVar;
        hVar.setClipChildren(false);
        hVar.setOffscreenPageLimit(4);
        hVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new org.telegram.ui.Components.t30(this));
        hVar.setPageMargin(0);
        this.containerView.addView(hVar, w7.z5.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        hVar.b(new org.telegram.ui.Components.q30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, w7.z5.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, w7.z5.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(this, getContext());
        this.c = r30Var;
        r30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        r30Var.setTag(-1);
        r30Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.ng;
        org.telegram.ui.ActionBar.r6.W(r30Var, i12, null);
        r30Var.setGravity(17);
        r30Var.setTypeface(AndroidUtilities.bold());
        r30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 76);
        r30Var.setForeground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
        r30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        r30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(r30Var, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.z5.e(-2, 64, 80));
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
            this.d.addView(this.e[i13], w7.z5.n(-2, -1));
            if (i13 == 0) {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i13 == 1) {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i13].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i13].setOnClickListener(new ai.n1(this, i13, 11));
            i13++;
        }
        if (z10) {
            this.b.setCurrentItem(1);
        }
    }

    public final void n(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.k6.pg;
        u50 u50Var = this.n.b;
        u50Var.w0 = false;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            alertDialog$Builder.a.T = LocaleController.getString(u50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
        } else if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
            alertDialog$Builder.a.T = LocaleController.getString(u50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
        } else {
            alertDialog$Builder.a.T = LocaleController.getString(u50Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
        }
        alertDialog$Builder.a.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.nh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.ng;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.og, null);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.j(x02);
        c2Var.setOnShowListener(new r40(this, c2Var, editTextBoldCursor, 1));
        c2Var.setOnDismissListener(new kz(editTextBoldCursor, 2));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new hg.b2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new iz(editTextBoldCursor, 2));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        c2Var2.j(x03);
        c2Var2.show();
        c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
