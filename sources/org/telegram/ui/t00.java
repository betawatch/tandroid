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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ t00(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 2;
        f40 f40Var = this.b;
        switch (i7) {
            case 0:
                if (f40Var.v1()) {
                    org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                    break;
                } else {
                    org.telegram.ui.Components.c20.g0 = false;
                    f40Var.dismiss();
                    break;
                }
            case 1:
                f40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = f40Var.d2;
                        if (launchActivity != null) {
                            f40Var.d2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 2:
                f40Var.f3.p();
                f40Var.d2.t0(new ai.z2());
                f40Var.dismiss();
                break;
            case 3:
                org.telegram.messenger.t3 t3Var = f40Var.V2;
                if (t3Var != null && t3Var.w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 4:
                k20 k20Var = f40Var.C1;
                if (k20Var.m()) {
                    k20Var.j();
                    break;
                } else {
                    k20Var.d();
                    break;
                }
            case 5:
                Editable text = f40Var.C1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ri.d0(f40Var.a).Y(new CharSequence[]{text}, true, true);
                f40Var.G1(tL_textWithEntities);
                break;
            case 6:
                int S0 = f40Var.S0();
                if (S0 > 0 && S0 != Integer.MAX_VALUE) {
                    f40Var.L1.w0(0, S0, null);
                }
                org.telegram.ui.Components.tt ttVar = f40Var.C1.a;
                ttVar.requestFocus();
                org.telegram.messenger.g0.I3(ttVar);
                break;
            case 7:
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                if (t3Var2 == null || t3Var2.j() || f40Var.v1()) {
                    f40Var.n1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(f40Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                if (t3Var3 != null && t3Var3.w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                if (t3Var4 != null && t3Var4.w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = f40Var.X3;
                org.telegram.ui.Components.oh0 oh0Var = f40Var.F4;
                f40Var.Z3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (f40Var.G4 == 18) {
                        f40Var.G4 = 39;
                        oh0Var.P(39);
                        oh0Var.start();
                    } else {
                        oh0Var.N(0, false, false);
                        f40Var.G4 = 18;
                        oh0Var.P(18);
                        oh0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.u3 u3Var = yVar.x;
                        if (u3Var.a.self && !u3Var.b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.a;
                            if (yVar.K0 == null) {
                                yVar.L0 = false;
                                ImageView imageView = yVar.y0;
                                if (imageView == null) {
                                    yVar.y0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.y0.setAlpha(0.0f);
                                } else {
                                    yVar.y0.setAlpha(1.0f);
                                }
                                if (yVar.y0.getParent() == null) {
                                    uVar.addView(yVar.y0);
                                }
                                ((FrameLayout.LayoutParams) yVar.y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.K0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.K0.setDuration(400L);
                                yVar.K0.setInterpolator(org.telegram.ui.Components.nr.f);
                                yVar.K0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                if (f40Var.l1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                f40Var.x5 = Integer.valueOf(i10);
                f40Var.W1(true, true);
                f40Var.x5 = null;
                org.telegram.messenger.g0.g3(new ii(f40Var, i10, 19));
                break;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = f40Var.f3;
                org.telegram.ui.ActionBar.y0 y0Var = f40Var.u3;
                org.telegram.ui.ActionBar.y0 y0Var2 = f40Var.t3;
                org.telegram.ui.ActionBar.y0 y0Var3 = f40Var.k3;
                org.telegram.messenger.t3 t3Var5 = f40Var.V2;
                if (t3Var5 != null && !f40Var.Z3.b) {
                    if (t3Var5.b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.m6.Yg;
                        y0Var2.d(org.telegram.ui.ActionBar.m6.x0(null, i12, false), org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                        y0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.m6.nh;
                        y0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                        y0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.m6.nh;
                        y0Var2.d(org.telegram.ui.ActionBar.m6.x0(null, i14, false), org.telegram.ui.ActionBar.m6.x0(null, i14, false));
                        y0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.m6.Yg;
                        y0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i15, false), org.telegram.ui.ActionBar.m6.x0(null, i15, false));
                        y0Var.setChecked(false);
                    }
                    f40Var.g2 = false;
                    q0Var.u(1);
                    q0Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            y0Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            y0Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : org.telegram.messenger.gd.N0(2131743260, null));
                        } else {
                            int i16 = R.drawable.msg_voice_phone;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = R.drawable.msg_voice_headphones;
                                }
                                y0Var3.setIcon(i16);
                                y0Var3.setSubtext(org.telegram.messenger.gd.N0(VoIPService.getSharedInstance().isHeadsetPlugged() ? 2131743258 : 2131743257, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    y0Var3.setIcon(R.drawable.msg_voice_speaker);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743256, null));
                                } else {
                                    y0Var3.setIcon(R.drawable.msg_voice_phone);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743257, null));
                                }
                            }
                        }
                    }
                    f40Var.P1();
                    q0Var.V(null, null);
                    break;
                }
                break;
        }
    }
}
