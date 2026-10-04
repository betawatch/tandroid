package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ t20(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        h60 h60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = h60Var.k1;
                org.telegram.ui.ActionBar.f1 f1Var = h60Var.v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = h60Var.u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = h60Var.p1;
                ChatObject.Call call = h60Var.a1;
                if (call != null && !h60Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.i6.hg;
                        f1Var2.c(org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                        f1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.i6.wg;
                        f1Var.c(org.telegram.ui.ActionBar.i6.w0(null, i13, false), org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                        f1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.i6.wg;
                        f1Var2.c(org.telegram.ui.ActionBar.i6.w0(null, i14, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                        f1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.i6.hg;
                        f1Var.c(org.telegram.ui.ActionBar.i6.w0(null, i15, false), org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                        f1Var.setChecked(false);
                    }
                    h60Var.l0 = false;
                    v0Var.r(1);
                    v0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            f1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            f1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            f1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            f1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                f1Var3.setIcon(R.drawable.msg_voice_speaker);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                f1Var3.setIcon(R.drawable.msg_voice_phone);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    h60Var.I1();
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (h60Var.r1()) {
                    if (sf.c.a(h60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(h60Var.i0);
                        h60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.e5.B(h60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(h60Var.i0)) {
                    org.telegram.ui.Components.d30.e0 = false;
                    h60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.e5.A(h60Var.getContext()).o();
                    break;
                }
            case 2:
                h60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = h60Var.i0;
                        if (launchActivity != null) {
                            h60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = h60Var.a1;
                if (call2 != null && call2.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                i40 i40Var = h60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    break;
                } else {
                    i40Var.d();
                    break;
                }
            case 5:
                h60.C(h60Var);
                break;
            case 6:
                int P0 = h60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    h60Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.hu huVar = h60Var.H.a;
                huVar.requestFocus();
                AndroidUtilities.showKeyboard(huVar);
                break;
            case 7:
                ChatObject.Call call3 = h60Var.a1;
                if (call3 == null || call3.isScheduled() || h60Var.r1()) {
                    h60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(h60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = h60Var.a1;
                if (call4 != null && call4.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = h60Var.a1;
                if (call5 != null && call5.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = h60Var.Y1;
                org.telegram.ui.Components.kj0 kj0Var = h60Var.G2;
                h60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (h60Var.H2 == 18) {
                        h60Var.H2 = 39;
                        kj0Var.P(39);
                        kj0Var.start();
                    } else {
                        kj0Var.N(0, false, false);
                        h60Var.H2 = 18;
                        kj0Var.P(18);
                        kj0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = uVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.x0;
                                if (imageView == null) {
                                    uVar.x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.x0.setAlpha(0.0f);
                                } else {
                                    uVar.x0.setAlpha(1.0f);
                                }
                                if (uVar.x0.getParent() == null) {
                                    pVar.addView(uVar.x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.tr.f);
                                uVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (h60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                h60Var.y3 = Integer.valueOf(i11);
                h60Var.N1(true, true);
                h60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld(h60Var, i11, 13));
                break;
        }
    }
}
