package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ s50 b;

    public v40(s50 s50Var, Activity activity) {
        this.b = s50Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int w02;
        s50 s50Var = this.b;
        if (i10 == -1) {
            s50Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            s50Var.W0.call.join_muted = false;
            s50.F0(s50Var);
            return;
        }
        if (i10 == 2) {
            s50Var.W0.call.join_muted = true;
            s50.F0(s50Var);
            return;
        }
        if (i10 == 3) {
            s50Var.j1(false);
            return;
        }
        if (i10 == 12) {
            s50.G0(s50Var, true);
            return;
        }
        if (i10 == 13) {
            s50.G0(s50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s50Var.getContext());
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.E = org.telegram.ui.ActionBar.g6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new p40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.i(w03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hg, false));
            return;
        }
        if (i10 == 9) {
            s50Var.i1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = s50Var.W0;
            if (!call.recording) {
                r40 r40Var = new r40(this, s50Var.getContext(), s50Var.V0, s50Var.E2);
                if (s50Var.r1()) {
                    r40Var.n(2);
                    return;
                } else {
                    r40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder2.a.E = org.telegram.ui.ActionBar.g6.pg;
            alertDialog$Builder2.a.N = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new eh.q(8, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.i(w04);
            b2Var2.show();
            b2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
            return;
        }
        if (i10 == 7) {
            s50Var.h0 = true;
            s50Var.q1.setVisibility(0);
            s50Var.r1.setVisibility(0);
            s50Var.j1.setVisibility(8);
            s50Var.t1.setVisibility(8);
            s50Var.u1.setVisibility(8);
            s50Var.s1.setVisibility(8);
            s50Var.n1.setVisibility(8);
            s50Var.k1.setVisibility(8);
            s50Var.o1.setVisibility(8);
            s50Var.p1.setVisibility(8);
            s50Var.g0.setVisibility(8);
            s50Var.l1.setVisibility(8);
            s50Var.m1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = s50Var.g1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var == null || !n1Var.isShowing()) {
                return;
            }
            v0Var.b.measure(org.telegram.messenger.rl.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            v0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            s50Var.s0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(s50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(s50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder3.a.E = org.telegram.ui.ActionBar.g6.pg;
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.u0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new iz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(s50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.g6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = s50Var.V0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new lz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(s50Var.W0.call.title)) {
                editTextBoldCursor.setText(s50Var.W0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.i(w05);
            b2Var3.setOnShowListener(new q40(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new kz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.k70.v(s50Var.getContext(), -s50Var.i1(), s50Var.d, null, 2, s50Var.w0, new p40(this));
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            return;
        }
        if (i10 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            org.telegram.ui.Cells.pa.n(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            charSequenceArr[i12] = (CharSequence) arrayList.get(i12);
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this.a, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        e3Var.bigTitle = true;
        w wVar = new w(7, this, arrayList3);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = wVar;
        int i13 = org.telegram.ui.ActionBar.g6.kg;
        e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i14 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        e3Var.show();
        e3Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
        for (int i15 = 0; i15 < e3Var.getItemViews().size(); i15++) {
            org.telegram.ui.ActionBar.x2 x2Var = e3Var.getItemViews().get(i15);
            if (i15 == i14) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false);
                x2Var.f = true;
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false);
            }
            x2Var.setTextColor(w02);
            x2Var.setIconColor(w02);
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hg, false), 12), 2, -1));
        }
    }
}
