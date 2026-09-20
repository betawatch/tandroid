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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ t20(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        i60 i60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = i60Var.k1;
                org.telegram.ui.ActionBar.f1 f1Var = i60Var.v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = i60Var.u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = i60Var.p1;
                ChatObject.Call call = i60Var.a1;
                if (call != null && !i60Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.j6.hg;
                        f1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        f1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.j6.wg;
                        f1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i13, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                        f1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.j6.wg;
                        f1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        f1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.j6.hg;
                        f1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        f1Var.setChecked(false);
                    }
                    i60Var.l0 = false;
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
                    i60Var.I1();
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (i60Var.r1()) {
                    if (sf.c.a(i60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(i60Var.i0);
                        i60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.d5.B(i60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(i60Var.i0)) {
                    org.telegram.ui.Components.z20.e0 = false;
                    i60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.d5.A(i60Var.getContext()).o();
                    break;
                }
            case 2:
                i60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = i60Var.i0;
                        if (launchActivity != null) {
                            i60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = i60Var.a1;
                if (call2 != null && call2.recording) {
                    i60Var.G1(i60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                i40 i40Var = i60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    break;
                } else {
                    i40Var.d();
                    break;
                }
            case 5:
                i60.E(i60Var);
                break;
            case 6:
                int P0 = i60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    i60Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.eu euVar = i60Var.H.a;
                euVar.requestFocus();
                AndroidUtilities.showKeyboard(euVar);
                break;
            case 7:
                ChatObject.Call call3 = i60Var.a1;
                if (call3 == null || call3.isScheduled() || i60Var.r1()) {
                    i60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(i60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = i60Var.a1;
                if (call4 != null && call4.recording) {
                    i60Var.G1(i60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = i60Var.a1;
                if (call5 != null && call5.recording) {
                    i60Var.G1(i60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = i60Var.Y1;
                org.telegram.ui.Components.hj0 hj0Var = i60Var.G2;
                i60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (i60Var.H2 == 18) {
                        i60Var.H2 = 39;
                        hj0Var.P(39);
                        hj0Var.start();
                    } else {
                        hj0Var.N(0, false, false);
                        i60Var.H2 = 18;
                        hj0Var.P(18);
                        hj0Var.start();
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
                                uVar.J0.setInterpolator(org.telegram.ui.Components.qr.f);
                                uVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (i60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                i60Var.y3 = Integer.valueOf(i11);
                i60Var.N1(true, true);
                i60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(i60Var, i11, 14));
                break;
        }
    }
}
