package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ s00(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 2;
        e40 e40Var = this.b;
        switch (i7) {
            case 0:
                if (e40Var.v1()) {
                    org.telegram.ui.Components.voip.k1.g(e40Var.d2);
                    break;
                } else {
                    org.telegram.ui.Components.a20.g0 = false;
                    e40Var.dismiss();
                    break;
                }
            case 1:
                e40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = e40Var.d2;
                        if (launchActivity != null) {
                            e40Var.d2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 2:
                e40Var.f3.p();
                e40Var.d2.t0(new ai.r2());
                e40Var.dismiss();
                break;
            case 3:
                org.telegram.messenger.t3 t3Var = e40Var.V2;
                if (t3Var != null && t3Var.w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 4:
                j20 j20Var = e40Var.C1;
                if (j20Var.m()) {
                    j20Var.j();
                    break;
                } else {
                    j20Var.d();
                    break;
                }
            case 5:
                Editable text = e40Var.C1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ri.d0(e40Var.a).Y(new CharSequence[]{text}, true, true);
                e40Var.G1(tL_textWithEntities);
                break;
            case 6:
                int S0 = e40Var.S0();
                if (S0 > 0 && S0 != Integer.MAX_VALUE) {
                    e40Var.L1.w0(0, S0, null);
                }
                org.telegram.ui.Components.rt rtVar = e40Var.C1.a;
                rtVar.requestFocus();
                org.telegram.messenger.g0.I3(rtVar);
                break;
            case 7:
                org.telegram.messenger.t3 t3Var2 = e40Var.V2;
                if (t3Var2 == null || t3Var2.j() || e40Var.v1()) {
                    e40Var.n1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e40Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.t3 t3Var3 = e40Var.V2;
                if (t3Var3 != null && t3Var3.w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.t3 t3Var4 = e40Var.V2;
                if (t3Var4 != null && t3Var4.w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = e40Var.X3;
                org.telegram.ui.Components.nh0 nh0Var = e40Var.F4;
                e40Var.Z3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (e40Var.G4 == 18) {
                        e40Var.G4 = 39;
                        nh0Var.P(39);
                        nh0Var.start();
                    } else {
                        nh0Var.N(0, false, false);
                        e40Var.G4 = 18;
                        nh0Var.P(18);
                        nh0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList.get(i11);
                        org.telegram.messenger.u3 u3Var = zVar.x;
                        if (u3Var.a.self && !u3Var.b) {
                            org.telegram.ui.Components.voip.v vVar = zVar.a;
                            if (zVar.K0 == null) {
                                zVar.L0 = false;
                                ImageView imageView = zVar.y0;
                                if (imageView == null) {
                                    zVar.y0 = new ImageView(zVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (vVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = vVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        zVar.y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    zVar.y0.setAlpha(0.0f);
                                } else {
                                    zVar.y0.setAlpha(1.0f);
                                }
                                if (zVar.y0.getParent() == null) {
                                    vVar.addView(zVar.y0);
                                }
                                ((FrameLayout.LayoutParams) zVar.y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                zVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u(zVar, 1));
                                zVar.K0.addListener(new org.telegram.ui.Components.voip.x(zVar, 2));
                                zVar.K0.setDuration(400L);
                                zVar.K0.setInterpolator(org.telegram.ui.Components.kr.f);
                                zVar.K0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                if (e40Var.l1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                e40Var.x5 = Integer.valueOf(i10);
                e40Var.V1(true, true);
                e40Var.x5 = null;
                org.telegram.messenger.g0.g3(new ii(e40Var, i10, 21));
                break;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = e40Var.f3;
                org.telegram.ui.ActionBar.y0 y0Var = e40Var.u3;
                org.telegram.ui.ActionBar.y0 y0Var2 = e40Var.t3;
                org.telegram.ui.ActionBar.y0 y0Var3 = e40Var.k3;
                org.telegram.messenger.t3 t3Var5 = e40Var.V2;
                if (t3Var5 != null && !e40Var.Z3.b) {
                    if (t3Var5.b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.n6.Yg;
                        y0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i12, false), org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                        y0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.n6.nh;
                        y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                        y0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.n6.nh;
                        y0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i14, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                        y0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.n6.Yg;
                        y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i15, false), org.telegram.ui.ActionBar.n6.x0(null, i15, false));
                        y0Var.setChecked(false);
                    }
                    e40Var.g2 = false;
                    q0Var.u(1);
                    q0Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            y0Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            y0Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : org.telegram.messenger.gd.N0(2131743253, null));
                        } else {
                            int i16 = R.drawable.msg_voice_phone;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = R.drawable.msg_voice_headphones;
                                }
                                y0Var3.setIcon(i16);
                                y0Var3.setSubtext(org.telegram.messenger.gd.N0(VoIPService.getSharedInstance().isHeadsetPlugged() ? 2131743251 : 2131743250, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    y0Var3.setIcon(R.drawable.msg_voice_speaker);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743249, null));
                                } else {
                                    y0Var3.setIcon(R.drawable.msg_voice_phone);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743250, null));
                                }
                            }
                        }
                    }
                    e40Var.P1();
                    q0Var.V(null, null);
                    break;
                }
                break;
        }
    }
}
