package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ rq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.Components.c81 c81Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        ci.b3 b3Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        hu0 hu0Var;
        int i12 = 3;
        char c10 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0();
                photoViewer.g3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.I1.d()) {
                    photoViewer2.g3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.v2);
                        alertDialog$Builder.a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new yq0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.U2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.Y7 = photoViewer3.a8;
                photoViewer3.T0();
                photoViewer3.a3(false);
                photoViewer3.r2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.o1();
                }
                photoViewer4.a3(false);
                photoViewer4.r2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.y2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.g3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.n0();
                photoViewer7.g3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.g3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.G0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.q5.b.N && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.g7.size() && (photoViewer10.g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.g7.get(photoViewer10.P4);
                    long time = photoViewer10.q5.getTime();
                    String z12 = PhotoViewer.z1();
                    photoViewer10.q5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new ai.c3(photoViewer10, z12, photoEntry, time, 23));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.J1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((ei.x3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final ei.x3 x3Var = new ei.x3(photoViewer11.y, 3);
                        x3Var.p(true);
                        x3Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        x3Var.h = ei.x3.a(x3Var.getText(), x3Var.getTextPaint());
                        x3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        x3Var.l(0.0f, 22.0f);
                        x3Var.l0 = new Runnable() { // from class: org.telegram.ui.vq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(x3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.h1;
                                        ei.x3 x3Var2 = x3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(x3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(x3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.h1 == null) {
                            photoViewer11.h1 = new ArrayList();
                        }
                        photoViewer11.e0.addView(x3Var, w7.z5.e(-1, 200, 83));
                        photoViewer11.h1.add(x3Var);
                        x3Var.u();
                    }
                    photoViewer11.z3();
                    photoViewer11.D3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.x) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.o1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean S1 = photoViewer12.S1();
                boolean z10 = !S1;
                int i15 = photoViewer12.P4;
                if (i15 >= 0 && i15 < photoViewer12.g7.size()) {
                    Object obj4 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = S1;
                        edit.putBoolean("photoLiveDefault", S1).apply();
                        hu0 hu0Var2 = photoViewer12.d;
                        if (hu0Var2 != null) {
                            hu0Var2.m();
                        }
                    }
                }
                photoViewer12.f1.a(!photoViewer12.S1(), true);
                photoViewer12.S7.animate().alpha(photoViewer12.S1() ? 0.45f : 1.0f).start();
                if (photoViewer12.S1() && (c81Var = photoViewer12.F2) != null) {
                    c81Var.B();
                }
                photoViewer12.e0.invalidate();
                if (photoViewer12.h1 == null) {
                    photoViewer12.h1 = new ArrayList();
                }
                if (photoViewer12.i1 == null) {
                    photoViewer12.i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.h1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((ei.x3) obj5).e(true);
                }
                final ei.x3 x3Var2 = new ei.x3(photoViewer12.y, 3);
                x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(photoViewer12.S1() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
                x3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                x3Var2.l(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                x3Var2.l0 = new Runnable() { // from class: org.telegram.ui.vq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(x3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.h1;
                                ei.x3 x3Var22 = x3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(x3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(x3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.e0.addView(x3Var2, w7.z5.e(-1, 200, 83));
                photoViewer12.h1.add(x3Var2);
                photoViewer12.i1.add(x3Var2);
                x3Var2.u();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.d != null && !photoViewer13.J1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                if (photoViewer14.d != null && !photoViewer14.J1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                ArrayList arrayList3 = photoViewer15.g7;
                if (!photoViewer15.v7) {
                    tt0 tt0Var = photoViewer15.t5;
                    if (!tt0Var.N && tt0Var.j0 != 1 && (i11 = photoViewer15.P4) >= 0 && i11 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z11 = !isEmpty;
                        tt0 tt0Var2 = photoViewer15.t5;
                        int i17 = tt0Var2.j0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer15.p5.l();
                                photoViewer15.p5.getThanosEffect();
                                rg.n2 n2Var = photoViewer15.p5;
                                n2Var.L = false;
                                n2Var.E = null;
                                ImageReceiver imageReceiver = photoViewer15.C4;
                                if (isEmpty || (bitmap = n2Var.K) == null) {
                                    bitmap = n2Var.I;
                                }
                                imageReceiver.setImageBitmap(bitmap);
                                photoViewer15.t5.setCutOutState(true);
                                photoViewer15.Z2(false, true);
                                photoViewer15.n0();
                                break;
                            } else {
                                tt0Var2.setCutOutState(true);
                                photoViewer15.Z2(false, true);
                                photoViewer15.p5.f();
                                photoViewer15.e0.invalidate();
                                break;
                            }
                        } else {
                            tt0Var2.setCancelState(true);
                            rg.n2 n2Var2 = photoViewer15.p5;
                            ei.oc ocVar = new ei.oc(photoViewer15, z11, mediaEditState, i12);
                            n2Var2.getClass();
                            n2Var2.setOnClickListener(new qg.n(1, n2Var2, ocVar));
                            TextView textView = n2Var2.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            ValueAnimator valueAnimator = n2Var2.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            n2Var2.Q = n2Var2.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            n2Var2.N = ofFloat;
                            ofFloat.addUpdateListener(new ei.i6(n2Var2, 20));
                            n2Var2.N.setRepeatCount(-1);
                            n2Var2.N.setRepeatMode(1);
                            n2Var2.N.setDuration(2400L);
                            n2Var2.N.setInterpolator(new LinearInterpolator());
                            n2Var2.N.start();
                            photoViewer15.e0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.v5.m(true, true);
                photoViewer16.w5.m(false, true);
                rg.n2 n2Var3 = photoViewer16.p5;
                if (n2Var3 != null) {
                    n2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                ft0 ft0Var = photoViewer16.N1;
                if (ft0Var != null) {
                    ft0Var.setEraser(true);
                }
                photoViewer16.g3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(false, true);
                photoViewer17.w5.m(true, true);
                rg.n2 n2Var4 = photoViewer17.p5;
                if (n2Var4 != null) {
                    n2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                ft0 ft0Var2 = photoViewer17.N1;
                if (ft0Var2 != null) {
                    ft0Var2.setEraser(false);
                }
                photoViewer17.g3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                ft0 ft0Var3 = photoViewer18.N1;
                if (ft0Var3 != null) {
                    qg.w1 w1Var = ft0Var3.b;
                    if (w1Var.a()) {
                        w1Var.c();
                        break;
                    }
                }
                photoViewer18.g3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.g7.get(photoViewer18.P4)).filterPath);
                rg.n2 n2Var5 = photoViewer18.p5;
                if (n2Var5 != null && !n2Var5.G) {
                    n2Var5.L = false;
                    n2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = n2Var5.K) == null) {
                    bitmap2 = n2Var5.I;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                rg.n2 n2Var6 = photoViewer18.p5;
                if (n2Var6 == null || !n2Var6.G) {
                    photoViewer18.t5.setCutOutState(true);
                }
                photoViewer18.c3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.y5.m(!r2.p0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.y5.p0 || photoViewer19.v5.p0 || photoViewer19.w5.p0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                qn qnVar = photoViewer20.l4;
                if (qnVar != null && (messageObject = qnVar.p5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.p5.getDialogId())) {
                    if (photoViewer20.m4 == null || (of2 = photoViewer20.l4.g5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.l4.p5.messageOwner.suggested_post);
                    }
                    if (!ai.ga.U(photoViewer20.T, of2.amount)) {
                        qn qnVar2 = photoViewer20.l4;
                        if (qnVar2 != null) {
                            qnVar2.Yb(of2);
                            break;
                        }
                    }
                }
                if (!photoViewer20.U1.o()) {
                    qn qnVar3 = photoViewer20.l4;
                    if (qnVar3 == null || !qnVar3.c() || ((b3Var = photoViewer20.l4.J1) != null && b3Var.K1 != null)) {
                        photoViewer20.y2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.b3();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.q6 q6Var = photoViewer20.U1.v;
                    float f7 = -photoViewer20.W1;
                    photoViewer20.W1 = f7;
                    AndroidUtilities.shakeViewSpring(q6Var, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.T).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.T).captionLengthLimitPremium > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.V2(photoViewer20.e0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.y != null && (hu0Var = photoViewer21.d) != null) {
                    hu0Var.W();
                    photoViewer21.H0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.u0();
                if (!photoViewer22.J1()) {
                    if (photoViewer22.r1) {
                        if (photoViewer22.k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.r71) {
                                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) textureView;
                                if (r71Var.getVideoWidth() <= 0 || r71Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.g3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.Q0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.P0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.u0();
                if (!photoViewer25.J1()) {
                    if (photoViewer25.r1) {
                        if (photoViewer25.k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.r71) {
                                org.telegram.ui.Components.r71 r71Var2 = (org.telegram.ui.Components.r71) textureView2;
                                if (r71Var2.getVideoWidth() <= 0 || r71Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.g3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.J1()) {
                        if (photoViewer26.r1) {
                            if (photoViewer26.k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.r71) {
                                    org.telegram.ui.Components.r71 r71Var3 = (org.telegram.ui.Components.r71) textureView3;
                                    if (r71Var3.getVideoWidth() <= 0 || r71Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.g3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.p6 == null) {
                    qq0 qq0Var = new qq0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.Q0(stateOrientation, photoViewer27.C1.b.getStateMirror(), qq0Var);
                        break;
                    } else {
                        qq0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.u4 == 1) {
                    mg.p pVar = photoViewer28.C1.b;
                    mg.c cVar = pVar.G;
                    if (cVar.a.isInProgress() || cVar.h || pVar.a.e0) {
                    }
                }
                photoViewer28.n0();
                photoViewer28.g3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f10 = -photoViewer29.C1.b.getStateOrientation();
                if (Math.abs(f10) > 180.0f) {
                    f10 = f10 < 0.0f ? f10 + 360.0f : -(360.0f - f10);
                }
                photoViewer29.Q0(f10, photoViewer29.C1.b.getStateMirror(), new qq0(photoViewer29, 8));
                break;
        }
    }
}
