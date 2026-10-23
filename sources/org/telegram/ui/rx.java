package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class rx implements org.telegram.ui.Components.d50 {
    public final /* synthetic */ ey a;

    public rx(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        org.telegram.ui.Components.qc qcVar = this.a.e4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ey eyVar = this.a;
        org.telegram.ui.Components.qc qcVar = eyVar.e4;
        if (qcVar != null) {
            qcVar.b();
            eyVar.e4 = null;
        }
        Activity parentActivity = eyVar.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
        org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(parentActivity, g6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(hcVar, parentActivity);
        hcVar.b = gcVar;
        gcVar.setWillNotDraw(false);
        hcVar.addView(gcVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        hcVar.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(w9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(parentActivity, false, false, false);
        hcVar.d = q6Var;
        q6Var.setTypeface(Typeface.SANS_SERIF);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        hcVar.addView(q6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        hcVar.setTextColor(hcVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        hcVar.setBackground(hcVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        if (z10) {
            w9Var.setImageBitmap(eyVar.b4.r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.u1().C4.getBitmap());
        }
        Activity parentActivity2 = eyVar.getParentActivity();
        g6Var2 = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, g6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.b = new ti(this, 26);
        hcVar.setButton(ocVar);
        hcVar.getButton().setVisibility(8);
        q6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(eyVar).b(hcVar, -1);
        eyVar.e4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = eyVar.e4;
        qcVar2.s = true;
        qcVar2.j();
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qx
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                rx rxVar = rx.this;
                ey eyVar = rxVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    eyVar.c4 = photoSize2.location;
                    eyVar.d4 = photoSize.location;
                } else {
                    if (eyVar.c4 == null) {
                        return;
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    eyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.w9(rxVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                kVar.m().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final mu0 getCloseIntoObject() {
        ey eyVar = this.a;
        org.telegram.ui.Components.qc qcVar = eyVar.e4;
        if (qcVar == null) {
            return null;
        }
        org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
        mu0 mu0Var = new mu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.w9 w9Var = hcVar.c;
        org.telegram.ui.Components.w9 w9Var2 = hcVar.c;
        w9Var.getLocationInWindow(iArr);
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = eyVar.fragmentView;
        ImageReceiver imageReceiver = w9Var2.getImageReceiver();
        mu0Var.a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        mu0Var.i = 0;
        mu0Var.h = mu0Var.a.getRoundRadius();
        mu0Var.k = w9Var2.getScaleX();
        return mu0Var;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
