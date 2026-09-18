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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ v20(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        k60 k60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = k60Var.k1;
                org.telegram.ui.ActionBar.g1 g1Var = k60Var.v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = k60Var.u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = k60Var.p1;
                ChatObject.Call call = k60Var.a1;
                if (call != null && !k60Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.j6.hg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        g1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.j6.wg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i13, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                        g1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.j6.wg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        g1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.j6.hg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        g1Var.setChecked(false);
                    }
                    k60Var.l0 = false;
                    w0Var.r(1);
                    w0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            g1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            g1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            g1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            g1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                g1Var3.setIcon(R.drawable.msg_voice_speaker);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                g1Var3.setIcon(R.drawable.msg_voice_phone);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    k60Var.I1();
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (k60Var.r1()) {
                    if (sf.c.a(k60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(k60Var.i0);
                        k60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.c5.B(k60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(k60Var.i0)) {
                    org.telegram.ui.Components.z20.e0 = false;
                    k60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.c5.A(k60Var.getContext()).o();
                    break;
                }
            case 2:
                k60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = k60Var.i0;
                        if (launchActivity != null) {
                            k60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = k60Var.a1;
                if (call2 != null && call2.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                k40 k40Var = k60Var.H;
                if (k40Var.m()) {
                    k40Var.j();
                    break;
                } else {
                    k40Var.d();
                    break;
                }
            case 5:
                k60.E(k60Var);
                break;
            case 6:
                int P0 = k60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    k60Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.eu euVar = k60Var.H.a;
                euVar.requestFocus();
                AndroidUtilities.showKeyboard(euVar);
                break;
            case 7:
                ChatObject.Call call3 = k60Var.a1;
                if (call3 == null || call3.isScheduled() || k60Var.r1()) {
                    k60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = k60Var.a1;
                if (call4 != null && call4.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = k60Var.a1;
                if (call5 != null && call5.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = k60Var.Y1;
                org.telegram.ui.Components.yi0 yi0Var = k60Var.G2;
                k60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (k60Var.H2 == 18) {
                        k60Var.H2 = 39;
                        yi0Var.P(39);
                        yi0Var.start();
                    } else {
                        yi0Var.N(0, false, false);
                        k60Var.H2 = 18;
                        yi0Var.P(18);
                        yi0Var.start();
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
                if (k60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                k60Var.y3 = Integer.valueOf(i11);
                k60Var.N1(true, true);
                k60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.id(k60Var, i11, 14));
                break;
        }
    }
}
