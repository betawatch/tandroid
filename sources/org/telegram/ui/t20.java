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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ t20(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        j60 j60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = j60Var.k1;
                org.telegram.ui.ActionBar.f1 f1Var = j60Var.v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = j60Var.u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = j60Var.p1;
                ChatObject.Call call = j60Var.a1;
                if (call != null && !j60Var.a2.b) {
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
                    j60Var.l0 = false;
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
                    j60Var.I1();
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (j60Var.r1()) {
                    if (tf.c.a(j60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(j60Var.i0);
                        j60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.e5.B(j60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(j60Var.i0)) {
                    org.telegram.ui.Components.z20.e0 = false;
                    j60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.e5.A(j60Var.getContext()).o();
                    break;
                }
            case 2:
                j60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = j60Var.i0;
                        if (launchActivity != null) {
                            j60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = j60Var.a1;
                if (call2 != null && call2.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                i40 i40Var = j60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    break;
                } else {
                    i40Var.d();
                    break;
                }
            case 5:
                j60.D(j60Var);
                break;
            case 6:
                int P0 = j60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    j60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.cu cuVar = j60Var.H.a;
                cuVar.requestFocus();
                AndroidUtilities.showKeyboard(cuVar);
                break;
            case 7:
                ChatObject.Call call3 = j60Var.a1;
                if (call3 == null || call3.isScheduled() || j60Var.r1()) {
                    j60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(j60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = j60Var.a1;
                if (call4 != null && call4.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = j60Var.a1;
                if (call5 != null && call5.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = j60Var.Y1;
                org.telegram.ui.Components.xi0 xi0Var = j60Var.G2;
                j60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (j60Var.H2 == 18) {
                        j60Var.H2 = 39;
                        xi0Var.N(39);
                        xi0Var.start();
                    } else {
                        xi0Var.L(0, false, false);
                        j60Var.H2 = 18;
                        xi0Var.N(18);
                        xi0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.x0;
                                if (imageView == null) {
                                    tVar.x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.x0.setAlpha(0.0f);
                                } else {
                                    tVar.x0.setAlpha(1.0f);
                                }
                                if (tVar.x0.getParent() == null) {
                                    oVar.addView(tVar.x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.pr.f);
                                tVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (j60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                j60Var.y3 = Integer.valueOf(i11);
                j60Var.N1(true, true);
                j60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m8(j60Var, i11, 15));
                break;
        }
    }
}
