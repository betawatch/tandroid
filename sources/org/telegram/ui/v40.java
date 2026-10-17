package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        int x02;
        s50 s50Var = this.b;
        if (i10 == -1) {
            s50Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            s50Var.a1.call.join_muted = false;
            s50.G0(s50Var);
            return;
        }
        if (i10 == 2) {
            s50Var.a1.call.join_muted = true;
            s50.G0(s50Var);
            return;
        }
        if (i10 == 3) {
            s50Var.k1(false);
            return;
        }
        if (i10 == 12) {
            s50.H0(s50Var, true);
            return;
        }
        if (i10 == 13) {
            s50.H0(s50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s50Var.getContext());
            if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.h6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new p40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.i(x03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hg, false));
            return;
        }
        if (i10 == 9) {
            s50Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = s50Var.a1;
            if (!call.recording) {
                r40 r40Var = new r40(this, s50Var.getContext(), s50Var.Z0, s50Var.I2);
                if (s50Var.s1()) {
                    r40Var.o(2);
                    return;
                } else {
                    r40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.h6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ci.f(11, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ug, false);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.i(x04);
            b2Var2.show();
            b2Var2.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ng, false));
            return;
        }
        if (i10 == 7) {
            s50Var.l0 = true;
            s50Var.u1.setVisibility(0);
            s50Var.v1.setVisibility(0);
            s50Var.n1.setVisibility(8);
            s50Var.x1.setVisibility(8);
            s50Var.y1.setVisibility(8);
            s50Var.w1.setVisibility(8);
            s50Var.r1.setVisibility(8);
            s50Var.o1.setVisibility(8);
            s50Var.s1.setVisibility(8);
            s50Var.t1.setVisibility(8);
            s50Var.k0.setVisibility(8);
            s50Var.p1.setVisibility(8);
            s50Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = s50Var.k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var == null || !m1Var.isShowing()) {
                return;
            }
            u0Var.b.measure(org.telegram.messenger.wh.c(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            u0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            s50Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(s50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(s50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.h6.pg;
            if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new hz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(s50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.h6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = s50Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            int i12 = 1;
            editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder3, i12));
            editTextBoldCursor.addTextChangedListener(new kz(i12, editTextBoldCursor));
            if (!TextUtils.isEmpty(s50Var.a1.call.title)) {
                editTextBoldCursor.setText(s50Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.i(x05);
            b2Var3.setOnShowListener(new q40(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new jz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.r80.w(s50Var.getContext(), -s50Var.j1(), s50Var.d, null, 2, s50Var.A0, new p40(this));
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
            org.telegram.ui.Cells.t0.m(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.t0.m(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            charSequenceArr[i13] = (CharSequence) arrayList.get(i13);
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.a, (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        f3Var.bigTitle = true;
        mg.j jVar = new mg.j(8, this, arrayList3);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = jVar;
        int i14 = org.telegram.ui.ActionBar.h6.kg;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        int i15 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        f3Var.show();
        f3Var.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ng, false));
        for (int i16 = 0; i16 < f3Var.getItemViews().size(); i16++) {
            org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i16);
            if (i16 == i15) {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.pg, false);
                y2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ng, false);
            }
            y2Var.setTextColor(x02);
            y2Var.setIconColor(x02);
            y2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hg, false), 12), 2, -1));
        }
    }
}
