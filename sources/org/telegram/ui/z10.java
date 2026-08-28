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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ z10(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        int i10 = 0;
        o50 o50Var = this.b;
        switch (i9) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = o50Var.g1;
                org.telegram.ui.ActionBar.g1 g1Var = o50Var.r1;
                org.telegram.ui.ActionBar.g1 g1Var2 = o50Var.q1;
                org.telegram.ui.ActionBar.g1 g1Var3 = o50Var.l1;
                ChatObject.Call call = o50Var.W0;
                if (call != null && !o50Var.W1.b) {
                    if (call.call.join_muted) {
                        int i11 = org.telegram.ui.ActionBar.f6.hg;
                        g1Var2.c(org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                        g1Var2.setChecked(false);
                        int i12 = org.telegram.ui.ActionBar.f6.wg;
                        g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i12, false), org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                        g1Var.setChecked(true);
                    } else {
                        int i13 = org.telegram.ui.ActionBar.f6.wg;
                        g1Var2.c(org.telegram.ui.ActionBar.f6.w0(null, i13, false), org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                        g1Var2.setChecked(true);
                        int i14 = org.telegram.ui.ActionBar.f6.hg;
                        g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i14, false), org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                        g1Var.setChecked(false);
                    }
                    o50Var.h0 = false;
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
                    o50Var.I1();
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (o50Var.r1()) {
                    if (af.d.a(o50Var.e0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(o50Var.e0);
                        o50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.y4.B(o50Var.e0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(o50Var.e0)) {
                    org.telegram.ui.Components.j20.a0 = false;
                    o50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.y4.A(o50Var.getContext()).o();
                    break;
                }
            case 2:
                o50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = o50Var.e0;
                        if (launchActivity != null) {
                            o50Var.e0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = o50Var.W0;
                if (call2 != null && call2.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 4:
                o30 o30Var = o50Var.D;
                if (o30Var.m()) {
                    o30Var.j();
                    break;
                } else {
                    o30Var.d();
                    break;
                }
            case 5:
                o50.D(o50Var);
                break;
            case 6:
                int P0 = o50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    o50Var.M.v0(0, P0, null);
                }
                org.telegram.ui.Components.pt ptVar = o50Var.D.a;
                ptVar.requestFocus();
                AndroidUtilities.showKeyboard(ptVar);
                break;
            case 7:
                ChatObject.Call call3 = o50Var.W0;
                if (call3 == null || call3.isScheduled() || o50Var.r1()) {
                    o50Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = o50Var.W0;
                if (call4 != null && call4.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = o50Var.W0;
                if (call5 != null && call5.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = o50Var.U1;
                org.telegram.ui.Components.mi0 mi0Var = o50Var.C2;
                o50Var.W1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (o50Var.D2 == 18) {
                        o50Var.D2 = 39;
                        mi0Var.N(39);
                        mi0Var.start();
                    } else {
                        mi0Var.L(0, false, false);
                        o50Var.D2 = 18;
                        mi0Var.N(18);
                        mi0Var.start();
                    }
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i15);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.F0 == null) {
                                tVar.G0 = false;
                                ImageView imageView = tVar.t0;
                                if (imageView == null) {
                                    tVar.t0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.t0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.t0.setAlpha(0.0f);
                                } else {
                                    tVar.t0.setAlpha(1.0f);
                                }
                                if (tVar.t0.getParent() == null) {
                                    oVar.addView(tVar.t0);
                                }
                                ((FrameLayout.LayoutParams) tVar.t0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.F0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.F0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.F0.setDuration(400L);
                                tVar.F0.setInterpolator(org.telegram.ui.Components.gr.f);
                                tVar.F0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (o50Var.h1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 2;
                    }
                }
                o50Var.u3 = Integer.valueOf(i10);
                o50Var.N1(true, true);
                o50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(o50Var, i10, 13));
                break;
        }
    }
}
