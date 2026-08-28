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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ o50 b;

    public r40(o50 o50Var, Activity activity) {
        this.b = o50Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        VoIPService sharedInstance;
        int w02;
        o50 o50Var = this.b;
        if (i9 == -1) {
            o50Var.onBackPressed();
            return;
        }
        if (i9 == 1) {
            o50Var.W0.call.join_muted = false;
            o50.E0(o50Var);
            return;
        }
        if (i9 == 2) {
            o50Var.W0.call.join_muted = true;
            o50.E0(o50Var);
            return;
        }
        if (i9 == 3) {
            o50Var.j1(false);
            return;
        }
        if (i9 == 12) {
            o50.F0(o50Var, true);
            return;
        }
        if (i9 == 13) {
            o50.F0(o50Var, false);
            return;
        }
        if (i9 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o50Var.getContext());
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.E = org.telegram.ui.ActionBar.f6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new l40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.i(w03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.vg, false));
            }
            c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false));
            return;
        }
        if (i9 == 9) {
            o50Var.i1.callOnClick();
            return;
        }
        if (i9 == 5) {
            ChatObject.Call call = o50Var.W0;
            if (!call.recording) {
                n40 n40Var = new n40(this, o50Var.getContext(), o50Var.V0, o50Var.E2);
                if (o50Var.r1()) {
                    n40Var.n(2);
                    return;
                } else {
                    n40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o50Var.getContext());
            alertDialog$Builder2.a.E = org.telegram.ui.ActionBar.f6.pg;
            alertDialog$Builder2.a.N = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new dh.s(8, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.i(w04);
            c2Var2.show();
            c2Var2.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
            return;
        }
        if (i9 == 7) {
            o50Var.h0 = true;
            o50Var.q1.setVisibility(0);
            o50Var.r1.setVisibility(0);
            o50Var.j1.setVisibility(8);
            o50Var.t1.setVisibility(8);
            o50Var.u1.setVisibility(8);
            o50Var.s1.setVisibility(8);
            o50Var.n1.setVisibility(8);
            o50Var.k1.setVisibility(8);
            o50Var.o1.setVisibility(8);
            o50Var.p1.setVisibility(8);
            o50Var.g0.setVisibility(8);
            o50Var.l1.setVisibility(8);
            o50Var.m1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = o50Var.g1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var == null || !o1Var.isShowing()) {
                return;
            }
            w0Var.b.measure(org.telegram.messenger.ll.d(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            w0Var.O(true, true);
            return;
        }
        if (i9 == 6) {
            o50Var.s0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(o50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.S(o50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(o50Var.getContext());
            alertDialog$Builder3.a.E = org.telegram.ui.ActionBar.f6.pg;
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.u0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new fz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(o50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i10 = org.telegram.ui.ActionBar.f6.ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = o50Var.V0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new iz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(o50Var.W0.call.title)) {
                editTextBoldCursor.setText(o50Var.W0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.i(w05);
            c2Var3.setOnShowListener(new m40(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new hz(1, editTextBoldCursor));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i9 == 8) {
            org.telegram.ui.Components.g70.u(o50Var.getContext(), -o50Var.i1(), o50Var.d, null, 2, o50Var.w0, new l40(this));
            return;
        }
        if (i9 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            return;
        }
        if (i9 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
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
            org.telegram.ui.Cells.j2.j(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.j2.j(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            charSequenceArr[i11] = (CharSequence) arrayList.get(i11);
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.a, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        f3Var.bigTitle = true;
        v vVar = new v(7, this, arrayList3);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = vVar;
        int i12 = org.telegram.ui.ActionBar.f6.kg;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int i13 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        f3Var.show();
        f3Var.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
        for (int i14 = 0; i14 < f3Var.getItemViews().size(); i14++) {
            org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i14);
            if (i14 == i13) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false);
                y2Var.f = true;
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false);
            }
            y2Var.setTextColor(w02);
            y2Var.setIconColor(w02);
            y2Var.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hg, false), 12), 2, -1));
        }
    }
}
